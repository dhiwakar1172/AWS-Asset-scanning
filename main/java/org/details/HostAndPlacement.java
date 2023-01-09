package org.details;

public class HostAndPlacement {
    private String virtualizationType;
    private String cpuCoreCount;
    private String reservationId;
    private String tenancy;
    private String availabilityZone;

    public String getCapacityReservationPreference() {
        return capacityReservationPreference;
    }

    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    private String capacityReservationPreference;
    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public String getCpuCoreCount() {
        return cpuCoreCount;
    }

    public void setCpuCoreCount(String cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public String toString() {
        return "\nHostAndPlacement:" +
                " \nvirtualizationType='" + virtualizationType + '\'' +
                ",\n cpuCoreCount='" + cpuCoreCount + '\'' +
                ",\n reservationId='" + reservationId + '\'' +
                ",\n tenancy='" + tenancy + '\'' +
                ",\n availabilityZone='" + availabilityZone + '\''+
                ",\n CapacityReservationPreference='"+capacityReservationPreference+'\''+"\n";
    }
}
