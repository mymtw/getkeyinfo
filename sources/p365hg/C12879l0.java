package p365hg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.cli.HelpFormatter;
import p010a9.C0048b;
import p453tf.C13418j;

/* renamed from: hg.l0 */
public final class C12879l0 {

    /* renamed from: a */
    public static final String f28392a = C12879l0.class.getName();

    static {
        new C12879l0();
    }

    /* renamed from: a */
    public static final boolean m20597a(Context context, String str) {
        List<ResolveInfo> list;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        m20601e(context, ResponseConstants.CONTEXT);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!C19383o.m32792b(activityInfo.name, "com.facebook.CustomTabActivity") || !C19383o.m32792b(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20598b(android.content.Context r3) {
        /*
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0013
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 != 0) goto L_0x001d
            java.lang.String r3 = f28392a
            java.lang.String r0 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            android.util.Log.w(r3, r0)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12879l0.m20598b(android.content.Context):void");
    }

    /* renamed from: c */
    public static final void m20599c(String str, String str2) {
        C19383o.m32797g(str, HelpFormatter.DEFAULT_ARG_NAME);
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException(C0048b.m163a("Argument '", str2, "' cannot be empty").toString());
        }
    }

    /* renamed from: d */
    public static final void m20600d(Collection collection) {
        C19383o.m32797g(collection, "container");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    /* renamed from: e */
    public static final void m20601e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(C0048b.m163a("Argument '", str, "' cannot be null"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if ((r2.length() > 0) != false) goto L_0x0011;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20602f(java.lang.String r2, java.lang.String r3) {
        /*
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L_0x0010
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            if (r2 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r2 = "Argument '"
            java.lang.String r0 = "' cannot be null or empty"
            java.lang.String r2 = p010a9.C0048b.m163a(r2, r3, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12879l0.m20602f(java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public static final void m20603g() {
        if (!C13418j.m21113i()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
