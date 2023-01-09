package org.details;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstanceCombinedDetails {
    InstanceSummary instanceSummary;
    InstanceDetails instanceDetail ;
    HostAndPlacement hostAndPlacement ;
    List<SecurityGroupsDetails> securityDetails ;
    List<NetworkInterfacesDetails> network ;
    List<VolumeDetails> storage ;
    Tags tags ;
    String instanceID;
    private static Map<String,List> map=new HashMap<String, List>();
    public InstanceCombinedDetails(){}
    public InstanceCombinedDetails(
            String instanceID, InstanceSummary instanceSummary, HostAndPlacement hostAndPlacement, List<SecurityGroupsDetails> securityDetails,
            List<NetworkInterfacesDetails> network, List<VolumeDetails> storage, Tags tags) {
        this.instanceSummary = instanceSummary;
        this.instanceDetail = instanceDetail;
        this.hostAndPlacement = hostAndPlacement;
        this.securityDetails = securityDetails;
        this.network = network;
        this.storage = storage;
        this.tags = tags;
        List list = new ArrayList();
        list.add(instanceSummary);
        list.add(instanceDetail);
        list.add(hostAndPlacement);
        list.add(securityDetails);
        list.add(network);
        list.add(storage);
        list.add(tags);
        
        map.put(instanceID, list);
    }

    public static Map<String, List> getMap() {
        return map;
    }

    public static void setMap(Map<String, List> map) {
        InstanceCombinedDetails.map = map;
    }

    public void printInstance(String instanceID) {
        System.out.println("Printing detais of "+instanceID);
        List instanceDetails = map.get(instanceID);
        for (Object i:instanceDetails){
            System.out.println(i.toString());
        }
    }
}
