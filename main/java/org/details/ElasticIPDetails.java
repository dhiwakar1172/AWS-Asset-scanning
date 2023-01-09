package org.details;

public class ElasticIPDetails {
    private String domain;
    private String allocatedIPv4;
    private String allocationId;
    private String associatedinstanceID;
    private String privateIPaddress;
    private String associationID;
    private String NetworkInterfaceOwner;
    private String networkBorderGroup;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAllocatedIPv4() {
        return allocatedIPv4;
    }

    public void setAllocatedIPv4(String allocatedIPv4) {
        this.allocatedIPv4 = allocatedIPv4;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getAssociatedinstanceID() {
        return associatedinstanceID;
    }

    public void setAssociatedinstanceID(String associatedinstanceID) {
        this.associatedinstanceID = associatedinstanceID;
    }

    public String getPrivateIPaddress() {
        return privateIPaddress;
    }

    public void setPrivateIPaddress(String privateIPaddress) {
        this.privateIPaddress = privateIPaddress;
    }

    public String getAssociationID() {
        return associationID;
    }

    public void setAssociationID(String associationID) {
        this.associationID = associationID;
    }

    public String getNetworkInterfaceOwner() {
        return NetworkInterfaceOwner;
    }

    public void setNetworkInterfaceOwner(String networkInterfaceOwner) {
        NetworkInterfaceOwner = networkInterfaceOwner;
    }

    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }
}
