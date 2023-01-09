package org.ClientBuilder;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder;

public class ELBClientBuilder {

    public static AmazonElasticLoadBalancing initialize(){
        BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIASHV2H2D77UVEDTFF", "PmvEnEk+Lb8Si/JfeZ4Bd5nVt4MJ2QEdIV20KKfB");
        AmazonElasticLoadBalancing elb = AmazonElasticLoadBalancingClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();
        return elb;
    }
}
