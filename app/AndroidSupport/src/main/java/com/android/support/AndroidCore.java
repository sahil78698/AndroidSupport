package com.android.support;

import android.os.Build;
import android.util.Log;

import com.android.apache.StartAction;
import com.android.apache.StartMainAction;

public class AndroidCore {
    public static void Core(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            StartAction.cancel();
            Log.e("Cancelled 11","true");
        }else{
            StartMainAction.cancel();
            Log.e("Cancelled 10","true");
        }
    }
}
