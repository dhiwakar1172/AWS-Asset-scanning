package org.details;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tags {
    private Map<String,String> tags = new HashMap<String, String>();

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(String key, String value) {
        this.tags.put(key,value);
    }

    @Override
    public String toString() {
        return
                "\nTags:" + tags ;
    }
}
