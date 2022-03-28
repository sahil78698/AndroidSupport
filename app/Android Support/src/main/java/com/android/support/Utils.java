package com.android.support;

import android.os.Bundle;
import android.util.Log;

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

                    }else{

                    }
                } else {

                }
            }
        }
    }
}
// intent.putExtra(getResources().getString(R.string.profile_url), b.getString(getResources().getString(R.string.profile_url)));
//         intent.putExtra(getResources().getString(R.string.profile_name), b.getString(getResources().getString(R.string.profile_name)));
//         intent.putExtra(getResources().getString(R.string.current_game), b.getString(getResources().getString(R.string.current_game)));
//         intent.putExtra(getResources().getString(R.string.url), b.getString(getResources().getString(R.string.url)));
//         intent.putExtra(getResources().getString(R.string.v1), b.getString(getResources().getString(R.string.v1)));
//         intent.putExtra(getResources().getString(R.string.v2), b.getString(getResources().getString(R.string.v2)));
//         intent.putExtra(getResources().getString(R.string.v3), b.getString(getResources().getString(R.string.v3)));
//         intent.putExtra(getResources().getString(R.string.v4), b.getString(getResources().getString(R.string.v4)));

//<string name="profile_name">profile_name</string>
//<string name="profile_url">profile_url</string>
//<string name="current_game">current_game</string>
//<string name="url">url</string>
//<string name="v1">m_i</string>
//<string name="v2">a_i</string>
//<string name="v3">r_i</string>
//<string name="v4">l_i</string>
