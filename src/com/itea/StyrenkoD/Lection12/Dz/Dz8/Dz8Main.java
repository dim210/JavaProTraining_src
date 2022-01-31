package com.itea.StyrenkoD.Lection12.Dz.Dz8;

public class Dz8Main {
    public static void main(String[] args) {
        MyHashMap<String,Product> mhm = new MyHashMap<>();

        mhm.put("toy1",new Product(122));
        mhm.put("toy2",new Product(428));
        mhm.put("toy3",new Product(162));

        System.out.println(mhm.entrysToString());
        System.out.println(mhm.keysToString());
        System.out.println(mhm.valuesToString());
    }

}
