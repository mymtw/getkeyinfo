package p509an;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p260v0.C8184a;
import p706wm.C18751c;

/* renamed from: an.a */
public final class C14037a {

    /* renamed from: a */
    public final C18751c f30895a;

    /* renamed from: b */
    public boolean f30896b;

    public C14037a(Context context, String str, C18751c cVar) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = C8184a.f17966a;
        Context a = C8184a.C8189e.m16471a(context);
        SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f30895a = cVar;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.f30896b = z;
    }
}
