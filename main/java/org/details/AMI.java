package org.details;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeImagesResult;
import com.amazonaws.services.ec2.model.Image;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.ClientBuilder.EC2ClientBuilder;

public class AMI {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static AMIDetails getAMI(String amiID){
        AmazonEC2 ec2 = EC2ClientBuilder.getEC2Client();
        AMIDetails amiDetails = new AMIDetails();
        DescribeImagesResult result = ec2.describeImages(new DescribeImagesRequest().withImageIds(amiID));

        for (Image image:result.getImages()) {
            amiDetails.setAmiId(amiID);
            amiDetails.setArchitecture(image.getArchitecture());
            amiDetails.setImageId(image.getImageId());
            amiDetails.setImageLocation(image.getImageLocation());
            amiDetails.setImageId(image.getImageType());
            amiDetails.setPublic(image.getPublic().toString());
            amiDetails.setOwnerId(image.getOwnerId());
            amiDetails.setPlatformDetails(image.getPlatformDetails());
            amiDetails.setUsageOperation(image.getUsageOperation());
            amiDetails.setState(image.getState());
            amiDetails.setDescription(image.getDescription());
            amiDetails.setEnaSupport(image.getEnaSupport().toString());
            amiDetails.setHypervisor(image.getHypervisor());
            amiDetails.setImageOwnerAlias(image.getImageOwnerAlias());
            amiDetails.setName(image.getName());
            amiDetails.setRootDeviceName(image.getRootDeviceName());
            amiDetails.setRootDeviceType(image.getRootDeviceType());
            amiDetails.setSriovNetSupport(image.getSriovNetSupport());
            amiDetails.setVirtualizationType(image.getVirtualizationType());
        }

        return amiDetails;
    }

    public static void main(String[] args) {
        System.out.println(gson.toJson(getAMI("ami-0caf074f4147741fd")));
    }
}
