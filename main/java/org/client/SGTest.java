package org.client;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.InstanceCombinedDetails;
import org.details.NetworkInterfacesDetails;
import org.mappings.NetworkInterfaces;

import java.util.ArrayList;
import java.util.List;


public class SGTest {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIA5PQPUVAAXOFFN356", "0k/na4hbVsoc062dY/dbgmxl8M6ZNpfJVZ63ezVW");
    private final static AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();

    private static List<NetworkInterfacesDetails> network(List<InstanceNetworkInterface> networkInterfaces) {
        List<NetworkInterfacesDetails> networkInterfacesDetails = new ArrayList<NetworkInterfacesDetails>();

        for (InstanceNetworkInterface networkInterface : networkInterfaces) {

            networkInterfacesDetails.add(NetworkInterfaces.getNetworkInterface(networkInterface.getNetworkInterfaceId()));
        }
        return networkInterfacesDetails;
    }

    public static void main(String[] args) {
        //String volumeId = "vol-0174aaa4a83cdd236"; // replace with your volume ID
        //AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();

        String instanceId = "i-0a6fb631ed423903b"; // replace with your instance ID
        DescribeInstancesRequest request = new DescribeInstancesRequest()
                .withInstanceIds(instanceId);
        DescribeInstancesResult result = ec2.describeInstances(request);
        List<Reservation> reservations = result.getReservations();
        for (Reservation reservation : reservations) {
            for (Instance instance : reservation.getInstances()) {
                System.out.println("Instance ID: " + instance.getInstanceId());
                System.out.println("Security groups: " + instance.getSecurityGroups());
                // ...
            }
        }
    }
}


