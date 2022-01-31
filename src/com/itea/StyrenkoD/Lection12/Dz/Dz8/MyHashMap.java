package com.itea.StyrenkoD.Lection12.Dz.Dz8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> extends HashMap<K, V> {
    public String entrysToString() {
        String retStr = "--- entries:\n";
        Set<Map.Entry<K, V>> entries = this.entrySet();
        for (Map.Entry<K, V> entry : entries) {
            retStr = retStr + "entry{" + entry.getKey() + "," + entry.getValue() + "}\n";
        }
        return retStr;
    }

    public String keysToString() {
        Set<K> keys = this.keySet();
        String retStr = "--- keys:\n";
        for (K key : keys) {
            retStr = retStr + "key{" + key + "}\n";
        }
        return retStr;
    }
    public String valuesToString() {
        Set<K> keys = this.keySet();
        String retStr = "--- values:\n";
        for (K key : keys) {
            retStr = retStr + "value{" + this.get(key) + "}\n";
        }
        return retStr;
    }
}
