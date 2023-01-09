package org.client;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import org.ClientBuilder.EC2ClientBuilder;
import org.details.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.mappings.NetworkInterfaces;
import org.mappings.SecurityGroups;
import org.mappings.Volumes;

import java.util.ArrayList;
import java.util.List;

public class EC2AssetScanner {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        //initializing POJO Classes
        InstanceSummary instanceSummary = null;
        HostAndPlacement hostAndPlacement = null;
        List<SecurityGroupsDetails> securityDetails = null;
        List<NetworkInterfacesDetails> network = null;
        List<VolumeDetails> storage = null;
        Tags tags = null;
        InstanceCombinedDetails instanceCombinedDetails = null;

        //setting up a EC2 client
        AmazonEC2 ec2 = EC2ClientBuilder.initialize();
        DescribeInstancesResult result = ec2.describeInstances();
        List<Reservation> reservations = result.getReservations();
        for (Reservation reservation : reservations) {
            List<Instance> instances = reservation.getInstances();

            //iterating over all the available instances
            for (Instance instance : instances) {
                instanceSummary = instanceSummary(instance, reservation.getOwnerId());
                hostAndPlacement = hostDetails(instance, reservation.getReservationId());
                securityDetails = securityDetails(instance.getSecurityGroups());
                network = network(instance.getNetworkInterfaces());
                storage = storage(instance.getBlockDeviceMappings());
                tags = tags(instance);
                instanceCombinedDetails = new InstanceCombinedDetails(instance.getInstanceId(), instanceSummary, hostAndPlacement, securityDetails, network, storage, tags);

                System.out.println(gson.toJson(instanceCombinedDetails));
                System.out.println();

            }
        }
    }

    private static Tags tags(Instance instance) {
        Tags tags;
        tags = new Tags();
        for (Object tagL : instance.getTags()) {
            Tag tag = (Tag) tagL;
            tags.setTags(tag.getKey(), tag.getValue());
        }
        return tags;
    }

    private static List<VolumeDetails> storage(List<InstanceBlockDeviceMapping> blockDeviceMappings) {
        List<VolumeDetails> volumeDetails = new ArrayList<VolumeDetails>();
        for (InstanceBlockDeviceMapping bdm : blockDeviceMappings) {
            volumeDetails.add(Volumes.getVolumes(bdm.getEbs().getVolumeId()));
        }
        return volumeDetails;
    }

    private static List<NetworkInterfacesDetails> network(List<InstanceNetworkInterface> networkInterfaces) {
        List<NetworkInterfacesDetails> networkInterfacesDetails = new ArrayList<NetworkInterfacesDetails>();
        for (InstanceNetworkInterface networkInterface : networkInterfaces) {
            networkInterfacesDetails.add(NetworkInterfaces.getNetworkInterface(networkInterface.getNetworkInterfaceId()));
        }
        return networkInterfacesDetails;
    }

    private static List<SecurityGroupsDetails> securityDetails(List<GroupIdentifier> securityGroups) {
        List<SecurityGroupsDetails> securityGroupList = new ArrayList<SecurityGroupsDetails>();
        for (GroupIdentifier securityGroup : securityGroups) {
            securityGroupList.add(SecurityGroups.getSecurityGroup(securityGroup.getGroupId()));
        }
        return securityGroupList;
    }


    private static HostAndPlacement hostDetails(Instance instance, String id) {
        HostAndPlacement hostAndPlacement;
        hostAndPlacement = new HostAndPlacement();
        hostAndPlacement.setAvailabilityZone(instance.getPlacement().getAvailabilityZone());
        hostAndPlacement.setReservationId(id);
        hostAndPlacement.setTenancy(instance.getPlacement().getTenancy());
        hostAndPlacement.setCpuCoreCount(instance.getCpuOptions().getCoreCount().toString());
        hostAndPlacement.setVirtualizationType(instance.getVirtualizationType());
        hostAndPlacement.setCapacityReservationPreference(instance.getCapacityReservationSpecification().getCapacityReservationPreference());
        return hostAndPlacement;
    }


    private static InstanceSummary instanceSummary(Instance instance, String ownerId) {
        InstanceSummary instanceSummary = new InstanceSummary();
        instanceSummary.setInstanceName(instance.getTags().get(0).getValue());
        instanceSummary.setInstanceId(instance.getInstanceId());
        instanceSummary.setPublicIPv4Address(instance.getPublicIpAddress());
        instanceSummary.setPrivateIPv4Address(instance.getPrivateIpAddress());
        instanceSummary.setInstanceState(instance.getState().getName());
        instanceSummary.setPublicIPv4DNS(instance.getPublicDnsName());
        instanceSummary.setPrivateIPDNSName(instance.getPrivateDnsName());
        instanceSummary.setPrivateResourceDNSName(instance.getPrivateDnsName());
        instanceSummary.setInstanceType(instance.getInstanceType());
        instanceSummary.setVpcID(instance.getVpcId());
        instanceSummary.setSubnetID(instance.getSubnetId());
        instanceSummary.setIAMRole(String.valueOf(instance.getIamInstanceProfile()));
        instanceSummary.setAmiID(instance.getImageId());
        instanceSummary.setPlatformDetails(instance.getPlatform() == null ? instanceSummary.getAmiID().getPlatformDetails() : instance.getPlatform());
        instanceSummary.setMonitoring(instance.getMonitoring().getState());
        instanceSummary.setLaunchTime(instance.getLaunchTime().toString());
        instanceSummary.setOwnerId(ownerId);
        instanceSummary.setKeyPairDetails(instance.getKeyName());
        return instanceSummary;
    }


}
