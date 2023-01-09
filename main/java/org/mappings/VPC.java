package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.CidrBlockAssociationSet;
import org.details.VPCDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VPC {
    private static Map<String, VPCDetails> vpcMap = new HashMap<String, VPCDetails>();
    private static VPCDetails vpcDetails=null;
    public static void setVPCs(DescribeVpcsResult vpcsResult){


        vpcDetails = new VPCDetails();
        CidrBlockAssociationSet cidrBlockAssociationSet = null;
        for (Vpc vpc: vpcsResult.getVpcs()){
            vpcDetails.setVpcId(vpc.getVpcId());
            vpcDetails.setCidrBlock(vpc.getCidrBlock());
            vpcDetails.setDhcpOptionsId(vpc.getDhcpOptionsId());
            vpcDetails.setState(vpc.getState());
            vpcDetails.setOwnerId(vpc.getOwnerId());
            vpcDetails.setInstanceTenancy(vpc.getInstanceTenancy());
            List<CidrBlockAssociationSet> cidrBlockAssociationSetList = new ArrayList<CidrBlockAssociationSet>();
            for(VpcCidrBlockAssociation associate: vpc.getCidrBlockAssociationSet()){
                cidrBlockAssociationSet = new CidrBlockAssociationSet();
                cidrBlockAssociationSet.setAssociationId(associate.getAssociationId());
                cidrBlockAssociationSet.setCidrBlockState(associate.getCidrBlockState().getState());
                cidrBlockAssociationSet.setCidrBlock(associate.getCidrBlock());
                cidrBlockAssociationSetList.add(cidrBlockAssociationSet);
            }
            vpcDetails.setCidrBlockAssociationSet(cidrBlockAssociationSetList);
            vpcDetails.setIsDefault(vpc.getIsDefault().toString());
            vpcMap.put(vpc.getVpcId(),vpcDetails);
        }
    }

    public static VPCDetails getVPC(String key) {
        return vpcMap.get(key);
    }

}
