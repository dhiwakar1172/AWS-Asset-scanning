package org.details;

public class InstanceDetails {

    private String platformDetails;
    private String amiID;
    private String monitoring;
    private String amiName;
    private String launchTime;
    private String amiLocation;
    private String amiLaunchIndex;
    private String usageOperation;
    private String ownerId;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUsageOperation() {
        return usageOperation;
    }

    public void setUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
    }
    public String getAmiLaunchIndex() {
        return amiLaunchIndex;
    }

    public void setAmiLaunchIndex(String amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }

    public String getAmiLocation() {
        return amiLocation;
    }

    public void setAmiLocation(String amiLocation) {
        this.amiLocation = amiLocation;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public String getAmiName() {
        return amiName;
    }

    public void setAmiName(String amiName) {
        this.amiName = amiName;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getAmiID() {
        return amiID;
    }

    public void setAmiID(String amiID) {
        this.amiID = amiID;
    }

    public String getPlatformDetails() {
        return platformDetails;
    }

    public void setPlatformDetails(String platformDetails) {
        this.platformDetails = platformDetails;
    }

    @Override
    public String toString() {
        return "\n InstanceDetails: " +
                "\n platformDetails='" + platformDetails + '\'' +
                ",\n amiID='" + amiID + '\'' +
                ",\n monitoring='" + monitoring + '\'' +
                ",\n amiName='" + amiName + '\'' +
                ",\n launchTime='" + launchTime + '\'' +
                ",\n amiLocation='" + amiLocation + '\'' +
                ",\n amiLaunchIndex='" + amiLaunchIndex + '\'' +
                ",\n usageOperation='" + usageOperation + '\'' +
                ",\n ownerId='" + ownerId + '\''+"\n"
                ;
    }
}
