package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C5030b;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.av */
public final class C5022av implements Runnable {
    private C5038bf AFInAppEventParameterName;
    public final C5029az AFInAppEventType;
    public final C5036bd AFKeystoreWrapper;
    private final C5040bh AFLogger$LogLevel;
    public BillingClient valueOf;
    public final ExecutorService values;

    public C5022av(C5036bd bdVar, C5038bf bfVar, C5029az azVar, ExecutorService executorService, C5040bh bhVar) {
        this.AFKeystoreWrapper = bdVar;
        this.AFInAppEventParameterName = bfVar;
        this.AFInAppEventType = azVar;
        this.values = executorService;
        this.AFLogger$LogLevel = bhVar;
    }

    public static /* synthetic */ void values(C5022av avVar, boolean z, List list) {
        C4964aa aaVar = new C4964aa(false, z, list, (Map<String, String>) null);
        C5040bh bhVar = avVar.AFLogger$LogLevel;
        String format = String.format("https://%sars.%s/api/v1/android/validate_subscription", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()});
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", bhVar.AFInAppEventType.values.getPackageName());
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            hashMap.put("cuid", string);
        }
        Context context = bhVar.AFInAppEventType.values;
        hashMap.put("app_version_name", C4964aa.AFInAppEventParameterName(context, context.getPackageName()));
        HashMap hashMap2 = new HashMap();
        C5030b.C5031e.C5032a AFKeystoreWrapper2 = C5115z.AFKeystoreWrapper(bhVar.AFInAppEventType.values, new HashMap());
        String str = AFKeystoreWrapper2 != null ? AFKeystoreWrapper2.AFKeystoreWrapper : null;
        if (str != null) {
            hashMap2.put("advertising_id", str);
        }
        hashMap2.put("appsflyer_id", C5003al.AFInAppEventParameterName(new WeakReference(bhVar.AFInAppEventType.values)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", C4986ag.values);
        hashMap.put("device_data", hashMap2);
        hashMap.put("is_cached", Boolean.valueOf(aaVar.AFInAppEventType()));
        hashMap.put("environment", aaVar.AFKeystoreWrapper() ? "SANDBOX" : "PRODUCTION");
        hashMap.put("additional_parameters", aaVar.values);
        ArrayList arrayList = new ArrayList();
        for (Purchase next : aaVar.AFInAppEventType) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, next.getPurchaseToken());
            hashMap3.put("subscription_id", next.getSku());
            arrayList.add(hashMap3);
        }
        hashMap.put("subscriptions", arrayList);
        C5107v vVar = new C5107v(format, new JSONObject(hashMap).toString().getBytes(), "POST", Collections.emptyMap());
        C5104u uVar = bhVar.AFKeystoreWrapper;
        C5045bm bmVar = new C5045bm(vVar, uVar.AFInAppEventParameterName, uVar.valueOf, new C5043bk());
        C50254 r12 = new C5044bl<String>(z, (C5115z) null) {
            private /* synthetic */ boolean AFInAppEventType;

            {
                this.AFInAppEventType = r2;
            }

            public final void AFInAppEventType(C5041bi<String> biVar) {
                if (biVar.AFKeystoreWrapper() && this.AFInAppEventType) {
                    C5022av.this.AFInAppEventType.AFKeystoreWrapper("ars_history_sent");
                }
            }

            public final void valueOf(Throwable th) {
                AFLogger.values(th);
            }
        };
        if (!bmVar.values.getAndSet(true)) {
            bmVar.valueOf.submit(new Runnable(r12) {
                private /* synthetic */ C5044bl values;

                {
                    this.values = r2;
                }

                public final void run() {
                    try {
                        C5045bm bmVar = C5045bm.this;
                        C5041bi<String> valueOf = bmVar.AFKeystoreWrapper.valueOf(bmVar.AFInAppEventType);
                        C5044bl blVar = this.values;
                        if (blVar != null) {
                            blVar.AFInAppEventType(new C5041bi(C5045bm.this.AFInAppEventParameterName.AFKeystoreWrapper((String) valueOf.values), valueOf.valueOf, valueOf.AFKeystoreWrapper()));
                        }
                    } catch (IOException e) {
                        C5044bl blVar2 = this.values;
                        if (blVar2 != null) {
                            blVar2.valueOf(e);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Http call is already executed");
    }

    public final void run() {
        try {
            if (this.valueOf == null) {
                C5038bf bfVar = this.AFInAppEventParameterName;
                BillingClient build = BillingClient.newBuilder(bfVar.values).setListener(new C5027ax(this)).enablePendingPurchases().build();
                this.valueOf = build;
                build.startConnection(new C5026aw(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventType("Failed to setup Play billing", th);
        }
    }
}
