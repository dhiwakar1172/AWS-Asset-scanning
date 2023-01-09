package org.mappings;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import org.ClientBuilder.EC2ClientBuilder;
import org.details.KeyPairDetails;

import java.util.HashMap;
import java.util.Map;

public class KeyPairs {

    private static Map<String, KeyPairDetails> keyPairs = new HashMap<String, KeyPairDetails>();
    private static KeyPairDetails keyPairDetails=null;
    public static void setKeyPairs(DescribeKeyPairsResult result){

        for (KeyPairInfo keyPair: result.getKeyPairs()){
            keyPairDetails = new KeyPairDetails();
            keyPairDetails.setName(keyPair.getKeyName());
            keyPairDetails.setFingerprint(keyPair.getKeyFingerprint());
            keyPairDetails.setId(keyPair.getKeyPairId());

            keyPairs.put(keyPair.getKeyName(),keyPairDetails);
        }
    }

    public static KeyPairDetails getKeyPair(String key) {
        return keyPairs.get(key);
    }

}
