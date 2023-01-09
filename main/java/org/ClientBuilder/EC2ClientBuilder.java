package org.ClientBuilder;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.*;
import org.mappings.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EC2ClientBuilder {
     private static BasicAWSCredentials awsCreds = new BasicAWSCredentials("//", "//");
    //private static BasicAWSCredentials awsCreds = new BasicAWSCredentials("//", "//");

    private final static AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();
    private static ExecutorService executor = Executors.newFixedThreadPool(10);
    private static final Logger logger = Logger.getLogger(EC2ClientBuilder.class.getName());


    public static AmazonEC2 initialize() {
        Instant startTime = Instant.now();
        logger.log(Level.INFO, "Process started at " + startTime);

        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeAddressesResult result = ec2.describeAddresses(new DescribeAddressesRequest());
                ElasticIPs.setElasticIPs(result);
                logger.log(Level.INFO,"ElasticIPs initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeKeyPairsResult result = ec2.describeKeyPairs(new DescribeKeyPairsRequest());
                KeyPairs.setKeyPairs(result);
                logger.log(Level.INFO,"Keypairs initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeNetworkInterfacesResult result = ec2.describeNetworkInterfaces(new DescribeNetworkInterfacesRequest());
                NetworkInterfaces.setNetworkInterfaces(result);
                logger.log(Level.INFO,"Networkinterfaces initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribePlacementGroupsResult result = ec2.describePlacementGroups(new DescribePlacementGroupsRequest());
                PlacementGroups.setPlacementGroup(result);
                logger.log(Level.INFO,"PLacement Groups initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeSecurityGroupsResult result = ec2.describeSecurityGroups(new DescribeSecurityGroupsRequest());
                SecurityGroups.setSG(result);
                logger.log(Level.INFO,"SecurityGroups initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeVolumesResult result = ec2.describeVolumes(new DescribeVolumesRequest());
                Volumes.setVolumes(result);
                logger.log(Level.INFO,"Volumes initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeVpcsResult vpcsResult = ec2.describeVpcs(new DescribeVpcsRequest());
                VPC.setVPCs(vpcsResult);
                logger.log(Level.INFO,"VPCs initialized");
            }
        });
        executor.submit(new Runnable() {
            @Override
            public void run() {
                DescribeSubnetsResult subnets = ec2.describeSubnets(new DescribeSubnetsRequest());
                Subnets.setSubnets(subnets);
                logger.log(Level.INFO,"Subnets initialized");
            }
        });
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.MINUTES);
        }catch(Exception e){
            e.printStackTrace();
        }

        logger.log(Level.INFO,"---------------------------EC2 Client Initialized---------------------------");
        Instant endTime = Instant.now();
        long durationInNanoseconds = Duration.between(startTime, endTime).toNanos();
        double durationInSeconds = (double) durationInNanoseconds / 1000000000;
        logger.log(Level.INFO, "Process took " + durationInSeconds + " seconds");

        return ec2;
    }
    public static AmazonEC2 getEC2Client() {
        return ec2;
    }


    }
