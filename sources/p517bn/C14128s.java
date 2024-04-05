package p517bn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.messaging.FirebaseMessagingService;
import p575gm.C17793c;
import p607km.C18144a;

/* renamed from: bn.s */
public final class C14128s {
    /* renamed from: a */
    public static boolean m21860a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C17793c.m29919b();
            C17793c b = C17793c.m29919b();
            b.mo69021a();
            Context context = b.f38672a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static void m21861b(Bundle bundle, String str) {
        try {
            C17793c.m29919b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString(ResponseConstants.LABEL, string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString(ResponseConstants.FROM);
            String str2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str2 = bundle.getString("google.c.a.udt");
            }
            if (str2 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str2));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str3 = true != C14130u.m21867k(bundle) ? "data" : QueryReformulation.DISPLAY;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String obj = bundle2.toString();
                Log.d("FirebaseMessaging", C0073e.m210j(new StringBuilder(obj.length() + str.length() + 37), "Logging to scion event=", str, " scionPayload=", obj));
            }
            C17793c b = C17793c.m29919b();
            b.mo69021a();
            C18144a aVar = (C18144a) b.f38675d.get(C18144a.class);
            if (aVar != null) {
                aVar.mo69690b("fcm", bundle2, str);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: c */
    public static boolean m21862c(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(extras.getString("google.c.a.e"));
    }
}
