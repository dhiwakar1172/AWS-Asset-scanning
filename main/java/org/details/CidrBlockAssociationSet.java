package org.details;

public class CidrBlockAssociationSet {
    private String associationId;
    private String cidrBlock;
    private String cidrBlockState;

    public String getAssociationId() {
        return associationId;
    }

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public String getCidrBlockState() {
        return cidrBlockState;
    }

    public void setCidrBlockState(String cidrBlockState) {
        this.cidrBlockState = cidrBlockState;
    }
}
