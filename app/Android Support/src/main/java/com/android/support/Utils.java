package com.android.support;

import android.os.Bundle;
import android.util.Log;

import com.android.apache.Loader;

public class Utils {
    public static Bundle bundle;

    public static void Support() {
        bundle = Support.Main_bundle;
        if (Support.Main_bundle == null) {
            Log.e("Utils Error", "Not Loaded");
        } else {
            if (bundle != null) {
                if (bundle.getString("appKey").equals(Push.Key())) {
                    if (bundle.getString("m_i").equals(bundle.getString("a_i")) && bundle.getString("r_i").equals("l_i")) {
                        Android.Init(Support.Main_context, bundle.getString("current_game"), bundle.getString("profile_name"), bundle.getString("profile_url"), Support.per, Support.progressBar);
                    } else {
                        Loader.load();
                    }
                } else {
                    Loader.load();
                }
            }
        }
    }
}