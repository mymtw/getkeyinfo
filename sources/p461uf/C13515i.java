package p461uf;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import p401mg.C13080a;

/* renamed from: uf.i */
public final class C13515i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f29571b;

    /* renamed from: c */
    public final /* synthetic */ C13511h f29572c;

    public C13515i(Context context, C13511h hVar) {
        this.f29571b = context;
        this.f29572c = hVar;
    }

    public final void run() {
        if (!C13080a.m20762b(this)) {
            try {
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                for (int i2 = 0; i2 < 11; i2++) {
                    String str = strArr[i2];
                    String str2 = strArr2[i2];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i |= 1 << i2;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = this.f29571b.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                    sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                    this.f29572c.mo46170f("fb_sdk_initialize", bundle);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
