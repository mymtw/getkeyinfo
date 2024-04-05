package p517bn;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import p575gm.C17793c;

/* renamed from: bn.t */
public final class C14129t {

    /* renamed from: a */
    public final Context f31122a;

    /* renamed from: b */
    public String f31123b;

    /* renamed from: c */
    public String f31124c;

    /* renamed from: d */
    public int f31125d;

    /* renamed from: e */
    public int f31126e = 0;

    public C14129t(Context context) {
        this.f31122a = context;
    }

    /* renamed from: a */
    public static String m21863a(C17793c cVar) {
        cVar.mo69021a();
        String str = cVar.f38674c.f38688e;
        if (str != null) {
            return str;
        }
        cVar.mo69021a();
        String str2 = cVar.f38674c.f38685b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(MessageDraft.IMAGE_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: b */
    public final PackageInfo mo47011b(String str) {
        try {
            return this.f31122a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo47012c() {
        int i;
        synchronized (this) {
            i = this.f31126e;
            if (i == 0) {
                PackageManager packageManager = this.f31122a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                this.f31126e = 1;
                                i = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            this.f31126e = 2;
                            i = 2;
                        }
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (PlatformVersion.isAtLeastO()) {
                        this.f31126e = 2;
                        i = 2;
                    } else {
                        this.f31126e = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    /* renamed from: d */
    public final synchronized void mo47013d() {
        PackageInfo b = mo47011b(this.f31122a.getPackageName());
        if (b != null) {
            this.f31123b = Integer.toString(b.versionCode);
            this.f31124c = b.versionName;
        }
    }
}
