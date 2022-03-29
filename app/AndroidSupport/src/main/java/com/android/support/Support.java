package com.android.support;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

public class Support {
    public static Bundle Main_bundle;
    public static Context Main_context;
    public static String data = "data";
    public static TextView per;
    public static ProgressBar progressBar;
    public static AppCompatButton button;

    public static void Android(Context context, Bundle bundle, TextView textView, ProgressBar progress,AppCompatButton mButton) {
        Main_bundle = bundle;
        Main_context = context;
        per = textView;
        progressBar = progress;
        button = mButton;
    }
}
