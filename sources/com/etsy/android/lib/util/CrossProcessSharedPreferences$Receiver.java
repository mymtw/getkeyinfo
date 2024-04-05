package com.etsy.android.lib.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class CrossProcessSharedPreferences$Receiver extends BroadcastReceiver {
    public static final String ACTION_PREFIX = "com.etsy.android.crossprocesssharedpref.";
    public static final String ACTION_PUT_BOOLEAN = "com.etsy.android.crossprocesssharedpref.PUT_BOOLEAN";
    public static final String ACTION_PUT_FLOAT = "com.etsy.android.crossprocesssharedpref.PUT_FLOAT";
    public static final String ACTION_PUT_INT = "com.etsy.android.crossprocesssharedpref.PUT_INT";
    public static final String ACTION_PUT_LONG = "com.etsy.android.crossprocesssharedpref.PUT_LONG";
    public static final String ACTION_PUT_STRING = "com.etsy.android.crossprocesssharedpref.PUT_STRING";
    public static final String ACTION_REMOVE = "com.etsy.android.crossprocesssharedpref.REMOVE";
    public static final String KEY = "KEY";
    public static final String VALUE = "VALUE";

    public void onReceive(Context context, Intent intent) {
        SharedPreferences.Editor edit = context.getSharedPreferences("EtsyUserPrefs", 0).edit();
        String stringExtra = intent.getStringExtra(KEY);
        String action = intent.getAction();
        action.getClass();
        char c = 65535;
        switch (action.hashCode()) {
            case -1569667533:
                if (action.equals(ACTION_PUT_INT)) {
                    c = 0;
                    break;
                }
                break;
            case -1414963048:
                if (action.equals(ACTION_PUT_LONG)) {
                    c = 1;
                    break;
                }
                break;
            case -919811168:
                if (action.equals(ACTION_PUT_FLOAT)) {
                    c = 2;
                    break;
                }
                break;
            case 268718672:
                if (action.equals(ACTION_REMOVE)) {
                    c = 3;
                    break;
                }
                break;
            case 1655885932:
                if (action.equals(ACTION_PUT_BOOLEAN)) {
                    c = 4;
                    break;
                }
                break;
            case 1930288941:
                if (action.equals(ACTION_PUT_STRING)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                edit.putInt(stringExtra, intent.getIntExtra(VALUE, 0));
                break;
            case 1:
                edit.putLong(stringExtra, intent.getLongExtra(VALUE, 0));
                break;
            case 2:
                edit.putFloat(stringExtra, intent.getFloatExtra(VALUE, 0.0f));
                break;
            case 3:
                edit.remove(stringExtra);
                break;
            case 4:
                edit.putBoolean(stringExtra, intent.getBooleanExtra(VALUE, false));
                break;
            case 5:
                edit.putString(stringExtra, intent.getStringExtra(VALUE));
                break;
        }
        edit.apply();
    }
}
