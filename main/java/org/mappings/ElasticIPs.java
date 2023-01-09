package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import org.details.ElasticIPDetails;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class ElasticIPs {
    private static Map<String,ElasticIPDetails> elasticIPMap = new HashMap<String, ElasticIPDetails>();
    private static ElasticIPDetails elasticIPDetails=null;
    public static void setElasticIPs(DescribeAddressesResult result){

        for (Address elasticIP: result.getAddresses()){
            elasticIPDetails = new ElasticIPDetails();
            elasticIPDetails.setDomain(elasticIP.getDomain());
            elasticIPDetails.setAllocatedIPv4(elasticIP.getPublicIp());
            elasticIPDetails.setAllocationId(elasticIP.getAllocationId());
            elasticIPDetails.setAssociatedinstanceID(elasticIP.getInstanceId());
            elasticIPDetails.setPrivateIPaddress(elasticIP.getPrivateIpAddress());
            elasticIPDetails.setAssociationID(elasticIP.getAssociationId());
            elasticIPDetails.setNetworkInterfaceOwner(elasticIP.getNetworkInterfaceOwnerId());
            elasticIPDetails.setNetworkBorderGroup(elasticIP.getNetworkBorderGroup());
            elasticIPMap.put(elasticIP.getPublicIp(),elasticIPDetails);

        }

    }

    public static ElasticIPDetails getElasticIP(String key) {
        return elasticIPMap.get(key);
    }

}
