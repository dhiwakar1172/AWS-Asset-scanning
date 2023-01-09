package org.details;

public class SubnetsDetails
    {
        private String subnetId;
        private String vpcId;
        private String availabilityZone;
        private String availabilityZoneId;
        private Integer availableIpAddressCount;
        private String cidrBlock;
        private Boolean defaultForAz;
        private String mapPublicIpOnLaunch;
        private String mapCustomerOwnedIpOnLaunch;
        private String state;
        private String ownerId;
        private Boolean assignIpv6AddressOnCreation;

        public String getAvailabilityZone() {
        return availabilityZone;
    }

        public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

        public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

        public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

        public Integer getAvailableIpAddressCount() {
        return availableIpAddressCount;
    }

        public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }

        public String getCidrBlock() {
        return cidrBlock;
    }

        public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

        public Boolean getDefaultForAz() {
        return defaultForAz;
    }

        public void setDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
    }

        public String getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

        public void setMapPublicIpOnLaunch(String mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

        public String getMapCustomerOwnedIpOnLaunch() {
        return mapCustomerOwnedIpOnLaunch;
    }

        public void setMapCustomerOwnedIpOnLaunch(String mapCustomerOwnedIpOnLaunch) {
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
    }

        public String getState() {
        return state;
    }

        public void setState(String state) {
        this.state = state;
    }

        public String getSubnetId() {
        return subnetId;
    }

        public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
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

        public Boolean getAssignIpv6AddressOnCreation() {
        return assignIpv6AddressOnCreation;
    }

        public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }
}

