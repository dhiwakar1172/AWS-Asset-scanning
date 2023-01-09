package org.details;

import java.util.List;

public class VPCDetails {

    private String cidrBlock;
    private String dhcpOptionsId;
    private String state;
    private String vpcId;
    private String ownerId;
    private String instanceTenancy;
    private List<CidrBlockAssociationSet> cidrBlockAssociationSet;
    private String isDefault;

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getInstanceTenancy() {
        return instanceTenancy;
    }

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    public List<CidrBlockAssociationSet> getCidrBlockAssociationSet() {
        return cidrBlockAssociationSet;
    }

    public void setCidrBlockAssociationSet(List<CidrBlockAssociationSet> cidrBlockAssociationSet) {
        this.cidrBlockAssociationSet = cidrBlockAssociationSet;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
