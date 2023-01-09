package org.ClientBuilder;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancingClientBuilder;

public class ELBClientBuilder {

    public static AmazonElasticLoadBalancing initialize(){
        BasicAWSCredentials awsCreds = new BasicAWSCredentials("//", "//");
        AmazonElasticLoadBalancing elb = AmazonElasticLoadBalancingClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();
        return elb;
    }
}
