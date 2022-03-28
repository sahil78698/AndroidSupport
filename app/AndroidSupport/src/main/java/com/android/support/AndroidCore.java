package com.android.support;

import android.os.Build;

import com.android.apache.StartAction;
import com.android.apache.StartMainAction;

public class AndroidCore {
    public static void Core(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            StartAction.cancel();
        }else{
            StartMainAction.cancel();
        }
    }
}
