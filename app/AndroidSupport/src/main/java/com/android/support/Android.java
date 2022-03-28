package com.android.support;

import android.content.Context;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.apache.StartAction;
import com.android.apache.StartMainAction;

public class Android {
    public static boolean enabled = true;
    public static void Init(Context mContext, String current_game, String mod_name, String url, TextView per, ProgressBar progress) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            StartAction.loader(mContext,mod_name,".zip",url);
        }else{
            StartMainAction.start(mContext,current_game,mod_name,url,per,progress);
        }
    }
}
