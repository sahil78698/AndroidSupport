package com.android.support;

public class Push {
    public static String Key(){
        System.out.println(Support.Main_bundle.getString("a_i") + Support.Main_bundle.getString("l_i"));
        return Support.Main_bundle.getString("a_i") + Support.Main_bundle.getString("l_i");
    }
}
