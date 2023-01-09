package org.details;

public class VolumeDetails {

    private String volumeId;
    private int size;
    private String volumeType;
    private String state;
    private int iops;
    private String availabilityZone;
    private String multiAttachEnabled;
    private String encrypted;
    private String outPostArn;


    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getIops() {
        return iops;
    }

    public void setIops(int iops) {
        this.iops = iops;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getMultiAttachEnabled() {
        return multiAttachEnabled;
    }

    public void setMultiAttachEnabled(String multiAttachEnabled) {
        this.multiAttachEnabled = multiAttachEnabled;
    }

    public String getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    public String getOutPostArn() {
        return outPostArn;
    }

    public void setOutPostArn(String outPostArn) {
        this.outPostArn = outPostArn;
    }

    public void setType(String volumeType) {
        this.volumeType= volumeType;
    }
}
