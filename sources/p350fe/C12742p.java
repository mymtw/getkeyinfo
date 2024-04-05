package p350fe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;

/* renamed from: fe.p */
public final class C12742p {
    /* renamed from: a */
    public static boolean m20408a(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = C19382n.m32706E0() ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        C19383o.m32796f(queryIntentActivities, "if (tSDK33()) {\n        …ties(intent, 0)\n        }");
        ArrayList arrayList = new ArrayList();
        for (T next : queryIntentActivities) {
            if (C19383o.m32792b(((ResolveInfo) next).activityInfo.packageName, context.getPackageName())) {
                arrayList.add(next);
            }
        }
        return !arrayList.isEmpty();
    }
}
