package org.details;

import java.util.List;

public class SecurityGroupsDetails {

    private String id;
    private String groupName;
    private String description;
    private List<InboundRules> inboundRules;
    private List<OutboundRules> outboundRules;

    public SecurityGroupsDetails(String id,String groupName, String description, List<InboundRules> inboundRules, List<OutboundRules> outboundRules) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.inboundRules = inboundRules;
        this.outboundRules = outboundRules;
    }


}
