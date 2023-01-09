package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.SubnetsDetails;

import java.util.HashMap;
import java.util.Map;

public class Subnets {
    private static Map<String, SubnetsDetails> subnetsMap = new HashMap<String, SubnetsDetails>();
    private static SubnetsDetails subnetsDetails = null;
    private static Gson gson = new GsonBuilder().create();

    public static void setSubnets(DescribeSubnetsResult subnets){

        subnetsDetails = new SubnetsDetails();
        for(Subnet subnet: subnets.getSubnets()){
            subnetsDetails.setSubnetId(subnet.getSubnetId());
            subnetsDetails.setAvailabilityZone(subnet.getAvailabilityZone());
            subnetsDetails.setState(subnet.getState());
            subnetsDetails.setCidrBlock(subnet.getCidrBlock());
            subnetsDetails.setAvailabilityZoneId(subnet.getAvailabilityZoneId());
            subnetsDetails.setAvailableIpAddressCount(subnet.getAvailableIpAddressCount());
            subnetsDetails.setCidrBlock(subnet.getCidrBlock());
            subnetsDetails.setMapPublicIpOnLaunch(subnet.getMapPublicIpOnLaunch().toString());
            subnetsDetails.setMapCustomerOwnedIpOnLaunch(subnet.getMapCustomerOwnedIpOnLaunch().toString());
            subnetsDetails.setState(subnet.getState());
            subnetsDetails.setOwnerId(subnet.getOwnerId());
            subnetsDetails.setAssignIpv6AddressOnCreation(subnet.getAssignIpv6AddressOnCreation());
            subnetsMap.put(subnet.getSubnetId(),subnetsDetails);
        }
    }

    public static SubnetsDetails getSubnet(String key) {
        return subnetsMap.get(key);
    }

}
