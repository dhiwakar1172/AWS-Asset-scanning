package org.mappings;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.NetworkInterfacesDetails;
import org.details.SecurityGroupsDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkInterfaces {


    private static Map<String, NetworkInterfacesDetails> networkInterfaces = new HashMap<String, NetworkInterfacesDetails>();
    private static NetworkInterfacesDetails networkInterfacesDetails = null;
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void setNetworkInterfaces(DescribeNetworkInterfacesResult result){
        List<SecurityGroupsDetails> securityGroupsDetails = null;
        for (NetworkInterface networkInterface: result.getNetworkInterfaces()){
            securityGroupsDetails = new ArrayList<SecurityGroupsDetails>();
            networkInterfacesDetails = new NetworkInterfacesDetails();
            networkInterfacesDetails.setNetworkInterfaceId(networkInterface.getNetworkInterfaceId());
            networkInterfacesDetails.setDescription(networkInterface.getDescription());
            networkInterfacesDetails.setStatus(networkInterface.getStatus());
            networkInterfacesDetails.setInterfaceType(networkInterface.getInterfaceType());
            networkInterfacesDetails.setVpcID(networkInterface.getVpcId());
            networkInterfacesDetails.setSubnet(Subnets.getSubnet(networkInterface.getSubnetId()));
            networkInterfacesDetails.setAvailabilityZone(networkInterface.getAvailabilityZone());
            networkInterfacesDetails.setOwnerId(networkInterface.getOwnerId());
            networkInterfacesDetails.setRequesterId(networkInterface.getRequesterId());
            networkInterfacesDetails.setRequesterManaged(networkInterface.getRequesterManaged().toString());
            networkInterfacesDetails.setSourceDestCheck(networkInterface.getSourceDestCheck().toString());
            networkInterfacesDetails.setPrivateIpAddress(networkInterface.getPrivateIpAddress());
            networkInterfacesDetails.setPrivateDnsName(networkInterface.getPrivateDnsName());
            networkInterfacesDetails.setMacAddress(networkInterface.getMacAddress());
            for(GroupIdentifier sg:networkInterface.getGroups()){
                securityGroupsDetails.add((SecurityGroups.getSecurityGroup(sg.getGroupId())));
            }
            networkInterfacesDetails.setSecurityGroupsDetails(securityGroupsDetails);
            networkInterfaces.put(networkInterface.getNetworkInterfaceId(),networkInterfacesDetails);
        }
    }

    public static NetworkInterfacesDetails getNetworkInterface(String key) {
        return networkInterfaces.get(key);
    }

}
