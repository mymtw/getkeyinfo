package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* renamed from: com.appsflyer.internal.cc */
public abstract class C5063cc extends C5072cj {
    public C5063cc(String str, Runnable runnable) {
        super(str, runnable);
    }

    public final void AFKeystoreWrapper(Context context, C5019at<Map<String, Object>> atVar) {
        C4986ag.AFInAppEventType();
        if (C4986ag.AFInAppEventType(C4986ag.AFInAppEventParameterName(context), "appsFlyerCount", false) <= 0 && atVar.AFInAppEventType()) {
            new Thread(atVar.valueOf).start();
            valueOf();
        }
    }
}
