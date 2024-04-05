package com.facebook.appevents.iap;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;
import p453tf.C13418j;
import p492yf.C13922a;
import p492yf.C13933e;

/* renamed from: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 */
public final class C12226x362beb25 implements ServiceConnection {
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C19383o.m32797g(componentName, "name");
        C19383o.m32797g(iBinder, "service");
        String str = C13922a.f30590a;
        Context b = C13418j.m21106b();
        HashMap<String, Method> hashMap = C13933e.f30632a;
        Class<C13933e> cls = C13933e.class;
        Object obj = null;
        if (!C13080a.m20762b(cls)) {
            try {
                C19383o.m32797g(b, ResponseConstants.CONTEXT);
                obj = C13933e.f30637f.mo46751i(b, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        C13922a.f30597h = obj;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C19383o.m32797g(componentName, "name");
    }
}
