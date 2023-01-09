package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.InboundRules;
import org.details.OutboundRules;
import org.details.SecurityGroupsDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityGroups {
    private static Map<String,SecurityGroupsDetails> securityGroups = new HashMap<String, SecurityGroupsDetails>();
    private static SecurityGroupsDetails securityGroupsDetails = null;
    public static void setSG(DescribeSecurityGroupsResult result){
        InboundRules inboundRules=null;
        OutboundRules outboundRules=null;

        for (SecurityGroup securityGroup: result.getSecurityGroups()){

            List<IpPermission> ruleIps = securityGroup.getIpPermissions();
            List<IpPermission> ruleIpsEgress = securityGroup.getIpPermissionsEgress();
            List<InboundRules> inboundRulesList = new ArrayList<InboundRules>();
            List<OutboundRules> outboundRulesList =new ArrayList<OutboundRules>();
            for (IpPermission ruleIp:ruleIps) {
                inboundRules = new InboundRules();
                if(ruleIp.getFromPort()!=null)
                    inboundRules.setFromPOrt(ruleIp.getFromPort().toString());
                else {inboundRules.setFromPOrt("All");}
                if(ruleIp.getToPort()!=null)
                    inboundRules.setToPort(ruleIp.getToPort().toString());
                else {inboundRules.setToPort("All");}
                inboundRules.setIPProtocol(ruleIp.getIpProtocol().contains("-1")?"All":ruleIp.getIpProtocol().toString());
                inboundRules.setIPv4Ranges(ruleIp.getIpv4Ranges());
                inboundRules.setIPv6Ranges(ruleIp.getIpv6Ranges());
                inboundRulesList.add(inboundRules);
            }
            for (IpPermission ruleIp : ruleIpsEgress) {
                    outboundRules = new OutboundRules();
                outboundRules.setIPProtocol(ruleIp.getIpProtocol().contains("-1")?"All":ruleIp.getIpProtocol().toString());
                outboundRules.setIPv4Ranges(ruleIp.getIpv4Ranges());
                outboundRules.setIPv6Ranges(ruleIp.getIpv6Ranges());
                outboundRulesList.add(outboundRules);

            }
            securityGroupsDetails = new SecurityGroupsDetails(securityGroup.getGroupId(),securityGroup.getGroupName(),securityGroup.getDescription(),inboundRulesList,outboundRulesList);
            securityGroups.put(securityGroup.getGroupId(),securityGroupsDetails);
        }
        for (Map.Entry<String, SecurityGroupsDetails> entry : securityGroups.entrySet()) {
            String key = entry.getKey();
            SecurityGroupsDetails value = entry.getValue();
        }
    }

    public static SecurityGroupsDetails getSecurityGroup(String key) {
        return securityGroups.get(key);
    }

}
