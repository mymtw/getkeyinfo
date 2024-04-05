package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p365hg.C12851e0;
import p401mg.C13080a;

public class FacebookBroadcastReceiver extends BroadcastReceiver {
    public void onFailedAppCall(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "appCallId");
        C19383o.m32797g(str2, ResponseConstants.ACTION);
        C19383o.m32797g(bundle, "extras");
    }

    public void onReceive(Context context, Intent intent) {
        Bundle bundle;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        String stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        String stringExtra2 = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
        Bundle extras = intent.getExtras();
        if (stringExtra != null && stringExtra2 != null && extras != null) {
            String str = C12851e0.f28342a;
            Class<C12851e0> cls = C12851e0.class;
            boolean z = false;
            if (!C13080a.m20762b(cls)) {
                try {
                    bundle = null;
                    if (!C13080a.m20762b(cls)) {
                        if (C12851e0.m20511l(C12851e0.m20510k(intent))) {
                            bundle = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                        }
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(cls, th);
                }
                z = bundle != null ? bundle.containsKey("error") : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
            }
            if (z) {
                onFailedAppCall(stringExtra, stringExtra2, extras);
            } else {
                onSuccessfulAppCall(stringExtra, stringExtra2, extras);
            }
        }
    }

    public void onSuccessfulAppCall(String str, String str2, Bundle bundle) {
        C19383o.m32797g(str, "appCallId");
        C19383o.m32797g(str2, ResponseConstants.ACTION);
        C19383o.m32797g(bundle, "extras");
    }
}
