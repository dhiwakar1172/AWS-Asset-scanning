package org.details;

public class AMIDetails {
    private String amiId;

    private String architecture;
    private String creationDate;
    private String imageId;
    private String imageLocation;
    private String imageType;
    private String isPublic;
    private String ownerId;
    private String platformDetails;
    private String usageOperation;
    private String state;
    private String description;
    private String enaSupport;
    private String hypervisor;
    private String imageOwnerAlias;
    private String name;
    private String rootDeviceName;
    private String rootDeviceType;
    private String sriovNetSupport;
    private String virtualizationType;

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String isPublic() {
        return isPublic;
    }

    public void setPublic(String aPublic) {
        isPublic = aPublic;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getPlatformDetails() {
        return platformDetails;
    }

    public void setPlatformDetails(String platformDetails) {
        this.platformDetails = platformDetails;
    }

    public String getUsageOperation() {
        return usageOperation;
    }

    public void setUsageOperation(String usageOperation) {
        this.usageOperation = usageOperation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isEnaSupport() {
        return enaSupport;
    }

    public void setEnaSupport(String enaSupport) {
        this.enaSupport = enaSupport;
    }

    public String getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    public String getImageOwnerAlias() {
        return imageOwnerAlias;
    }

    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRootDeviceName() {
        return rootDeviceName;
    }

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    public String getRootDeviceType() {
        return rootDeviceType;
    }

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    public String getSriovNetSupport() {
        return sriovNetSupport;
    }

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public void setAmiId(String amiID) {
        this.amiId =amiID;
    }
}
