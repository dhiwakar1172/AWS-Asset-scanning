package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import org.details.VolumeDetails;

import java.util.HashMap;
import java.util.Map;

public class Volumes {

    private static Map<String, VolumeDetails> volumes = new HashMap<String, VolumeDetails>();
    private static VolumeDetails volumeDetails = null;
    public static void setVolumes(DescribeVolumesResult result){

        for (Volume volume: result.getVolumes()){
            volumeDetails=new VolumeDetails();
            volumeDetails.setVolumeId(volume.getVolumeId());
            volumeDetails.setSize(volume.getSize());
            volumeDetails.setState(volume.getState());
            volumeDetails.setIops(volume.getIops());
            volumeDetails.setType(volume.getVolumeType());
            volumeDetails.setAvailabilityZone(volume.getAvailabilityZone());
            volumeDetails.setMultiAttachEnabled(volume.getMultiAttachEnabled().toString());
            volumeDetails.setEncrypted(volume.getEncrypted().toString());
            volumeDetails.setOutPostArn(volume.getOutpostArn());

            volumes.put(volume.getVolumeId(),volumeDetails);
        }
    }
    public static VolumeDetails getVolumes(String key) {
        return volumes.get(key);
    }

}
