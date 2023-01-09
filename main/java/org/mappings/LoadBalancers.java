package org.mappings;

import com.amazonaws.services.elasticloadbalancingv2.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersRequest;
import com.amazonaws.services.elasticloadbalancingv2.model.DescribeLoadBalancersResult;
import com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancer;
import org.ClientBuilder.ELBClientBuilder;

import java.util.HashMap;
import java.util.Map;

public class LoadBalancers {

    private static Map<String, LoadBalancer> loadBalancers = new HashMap<String, LoadBalancer>();
    public static void setLoadBalancers(){
        AmazonElasticLoadBalancing elb = ELBClientBuilder.initialize();
        // Describe the Elastic IPs
        DescribeLoadBalancersRequest request = new DescribeLoadBalancersRequest();
        DescribeLoadBalancersResult result = elb.describeLoadBalancers(request);
        for (LoadBalancer loadBalancer : result.getLoadBalancers()){
           loadBalancers.put(loadBalancer.getDNSName(),loadBalancer);
        }
    }

    public static Map<String, LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

}
