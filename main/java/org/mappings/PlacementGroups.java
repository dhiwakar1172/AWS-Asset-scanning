package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.details.PlacementGroupDetails;

import java.util.HashMap;
import java.util.Map;

public class PlacementGroups {
    private static Map<String, PlacementGroupDetails> placementGroups = new HashMap<String, PlacementGroupDetails>();
    private static PlacementGroupDetails placementGroupDetails = null;

    public static void setPlacementGroup(DescribePlacementGroupsResult result){

        for (PlacementGroup placementGroup: result.getPlacementGroups()){
            placementGroupDetails=  new PlacementGroupDetails();
            placementGroupDetails.setGroupID(placementGroup.getGroupId());
            placementGroupDetails.setGroupName(placementGroup.getGroupName());
            placementGroupDetails.setStrategy(placementGroup.getStrategy());
            placementGroupDetails.setState(placementGroup.getState());
            placementGroups.put(placementGroup.getGroupId(),placementGroupDetails);
        }
    }

    public static Map<String, PlacementGroupDetails> getPlacementGroup() {
        return placementGroups;
    }




}
