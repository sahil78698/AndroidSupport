package com.android.support;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

import com.android.apache.StartAction;
import com.android.apache.StartMainAction;

public class Android {
    public static boolean enabled = true;

    public static void Init(Context mContext, String current_game, String mod_name, String url, TextView per, ProgressBar progress, AppCompatButton button) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            StartAction.start(mContext, progress, mod_name, url, per, button);
            Log.e("Loader started 11", " OK");
        } else {
            StartMainAction.start(mContext, current_game, mod_name, url, per, progress, button);
            Log.e("Loader started 10", " OK");
        }
    }
}
