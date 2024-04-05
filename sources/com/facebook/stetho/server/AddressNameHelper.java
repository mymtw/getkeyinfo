package com.facebook.stetho.server;

import android.support.p013v4.media.C0072d;
import com.facebook.stetho.common.ProcessUtil;

public class AddressNameHelper {
    private static final String PREFIX = "stetho_";

    public static String createCustomAddress(String str) {
        StringBuilder h = C0072d.m201h(PREFIX);
        h.append(ProcessUtil.getProcessName());
        h.append(str);
        return h.toString();
    }
}
