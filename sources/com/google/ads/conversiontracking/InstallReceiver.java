package com.google.ads.conversiontracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class InstallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) && stringExtra != null) {
            Log.i("GoogleConversionReporter", stringExtra.length() != 0 ? "Received install referrer: ".concat(stringExtra) : new String("Received install referrer: "));
            C12615a.m20298M(context, Uri.parse("http://hostname/").buildUpon().appendQueryParameter("referrer", stringExtra).build());
        }
    }
}
