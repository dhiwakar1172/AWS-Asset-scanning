package org.details;

import java.util.List;

public class NetworkInterfacesDetails {
    private String networkInterfaceId;
    private String description;
    private String status;
    private String interfaceType;
    private String vpcID;
    private SubnetsDetails subnet;
    private String availabilityZone;
    private String ownerId;
    private String requesterId;
    private String requesterManaged;
    private String sourceDestCheck;
    private String privateIpAddress;
    private String privateDnsName;
    private String macAddress;
    private List<SecurityGroupsDetails>  securityGroupsDetails;

    public List<SecurityGroupsDetails> getSecurityGroupsDetails() {
        return securityGroupsDetails;
    }

    public void setSecurityGroupsDetails(List<SecurityGroupsDetails> securityGroupsDetails) {
        this.securityGroupsDetails = securityGroupsDetails;
    }

    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public SubnetsDetails getSubnetId() {
        return subnet;
    }

    public void setSubnet(SubnetsDetails subnet) {
        this.subnet =subnet;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    public String getRequesterManaged() {
        return requesterManaged;
    }

    public void setRequesterManaged(String requesterManaged) {
        this.requesterManaged = requesterManaged;
    }

    public String getSourceDestCheck() {
        return sourceDestCheck;
    }

    public void setSourceDestCheck(String sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getPrivateDnsName() {
        return privateDnsName;
    }

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }


}
