package org.details;

import org.mappings.KeyPairs;
import org.mappings.Subnets;
import org.mappings.VPC;

public class InstanceSummary {

    private String instanceName;
    private String instanceId;
    private String publicIPv4Address;
    private String privateIPv4Address;
    private String instanceState;
    private String publicIPv4DNS;
    private String privateIPDNSName;
    private String privateResourceDNSName;
    private String instanceType;
    private String platformDetails;
    private String monitoring;
    private String launchTime;
    private String ownerId;
    private VPCDetails vpc;
    private SubnetsDetails subnet;
    private String IAMRole;
    private AMIDetails ami;
    private KeyPairDetails keyPairDetails;

    public KeyPairDetails getKeyPairDetails() {
        return keyPairDetails;
    }

    public void setKeyPairDetails(String keyName) {
        this.keyPairDetails = KeyPairs.getKeyPair(keyName);
    }

    public String getPlatformDetails() {
        return platformDetails;
    }

    public void setPlatformDetails(String platformDetails) {
        this.platformDetails = platformDetails;
    }

    public AMIDetails getAmiID() {
        return ami;
    }

    public void setAmiID(String amiID) {
        this.ami = AMI.getAMI(amiID);
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPublicIPv4Address() {
        return publicIPv4Address;
    }

    public void setPublicIPv4Address(String publicIPv4Address) {
        this.publicIPv4Address = publicIPv4Address;
    }

    public String getPrivateIPv4Address() {
        return privateIPv4Address;
    }

    public void setPrivateIPv4Address(String privateIPv4Address) {
        this.privateIPv4Address = privateIPv4Address;
    }

    public String getInstanceState() {
        return instanceState;
    }

    public void setInstanceState(String instanceState) {
        this.instanceState = instanceState;
    }

    public String getPublicIPv4DNS() {
        return publicIPv4DNS;
    }

    public void setPublicIPv4DNS(String publicIPv4DNS) {
        this.publicIPv4DNS = publicIPv4DNS;
    }

    public String getPrivateIPDNSName() {
        return privateIPDNSName;
    }

    public void setPrivateIPDNSName(String privateIPDNSName) {
        this.privateIPDNSName = privateIPDNSName;
    }

    public String getPrivateResourceDNSName() {
        return privateResourceDNSName;
    }

    public void setPrivateResourceDNSName(String privateResourceDNSName) {
        this.privateResourceDNSName = privateResourceDNSName;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public VPCDetails getVpcID() {
        return vpc;
    }

    public void setVpcID(String vpcID) {
        this.vpc = VPC.getVPC(vpcID);
    }

    public SubnetsDetails getSubnetID() {
        return subnet;
    }

    public void setSubnetID(String subnetID) {
        this.subnet = Subnets.getSubnet(subnetID);
    }

    public String getIAMRole() {
        return IAMRole;
    }

    public void setIAMRole(String IAMRole) {
        this.IAMRole = IAMRole;
    }

    @Override
    public String toString() {
        return "InstanceSummary:\n " +
                "instanceName='" + instanceName + '\'' +
                ",\n instanceId='" + instanceId + '\'' +
                ",\n publicIPv4Address='" + publicIPv4Address + '\'' +
                ",\n privateIPv4Address='" + privateIPv4Address + '\'' +
                ",\n instanceState='" + instanceState + '\'' +
                ",\n publicIPv4DNS='" + publicIPv4DNS + '\'' +
                ",\n privateIPDNSName='" + privateIPDNSName + '\'' +
                ",\n privateResourceDNSName='" + privateResourceDNSName + '\'' +
                ",\n instanceType='" + instanceType + '\'' +
                ",\n vpcID='" + vpc+ '\'' +
                ",\n subnetID='" + subnet + '\'' +
                ",\n IAMRole='" + IAMRole + '\''+"\n"
                ;
    }
}
