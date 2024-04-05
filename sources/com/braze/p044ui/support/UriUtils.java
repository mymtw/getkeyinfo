package com.braze.p044ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.appboy.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.braze.ui.support.UriUtils */
public final class UriUtils {

    /* renamed from: a */
    public static final String f12099a = C19383o.m32802l("UriUtils", Constants.LOG_TAG_PREFIX);

    /* renamed from: a */
    public static final Intent m11472a(Context context, Bundle bundle) {
        int i;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose = IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT;
            C19383o.m32797g(intentFlagPurpose, "intentFlagPurpose");
            switch (BrazeDeeplinkHandler.C5622a.f12012a[intentFlagPurpose.ordinal()]) {
                case 1:
                case 2:
                    i = 1073741824;
                    break;
                case 3:
                case 4:
                case 5:
                    i = 872415232;
                    break;
                case 6:
                case 7:
                    i = 268435456;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            launchIntentForPackage.setFlags(i);
        }
        if (!(bundle == null || launchIntentForPackage == null)) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4 A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.String> m11473b(android.net.Uri r7) {
        /*
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r0.element = r7
            java.lang.String r7 = r7.getEncodedQuery()
            if (r7 != 0) goto L_0x0021
            java.lang.String r7 = f12099a
            com.braze.support.BrazeLogger$Priority r1 = com.braze.support.BrazeLogger.Priority.V
            r2 = 0
            com.braze.ui.support.UriUtils$getQueryParameters$1 r3 = new com.braze.ui.support.UriUtils$getQueryParameters$1
            r3.<init>(r0)
            r0 = 12
            com.braze.support.BrazeLogger.m11283e(r7, r1, r2, r3, r0)
            java.util.Map r7 = kotlin.collections.C19294b0.m32559p0()
            return r7
        L_0x0021:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            T r2 = r0.element     // Catch:{ Exception -> 0x00ad }
            android.net.Uri r2 = (android.net.Uri) r2     // Catch:{ Exception -> 0x00ad }
            boolean r2 = r2.isOpaque()     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = "://"
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00ad }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x00ad }
            android.net.Uri$Builder r7 = r2.encodedQuery(r7)     // Catch:{ Exception -> 0x00ad }
            android.net.Uri r7 = r7.build()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = "parse(\"://\")\n           …\n                .build()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)     // Catch:{ Exception -> 0x00ad }
            r0.element = r7     // Catch:{ Exception -> 0x00ad }
        L_0x0049:
            T r7 = r0.element     // Catch:{ Exception -> 0x00ad }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ Exception -> 0x00ad }
            java.util.Set r7 = r7.getQueryParameterNames()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = "uri.queryParameterNames"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)     // Catch:{ Exception -> 0x00ad }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ad }
            r2.<init>()     // Catch:{ Exception -> 0x00ad }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00ad }
        L_0x005f:
            boolean r3 = r7.hasNext()     // Catch:{ Exception -> 0x00ad }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r7.next()     // Catch:{ Exception -> 0x00ad }
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00ad }
            if (r6 == 0) goto L_0x0076
            int r6 = r6.length()     // Catch:{ Exception -> 0x00ad }
            if (r6 != 0) goto L_0x0077
        L_0x0076:
            r4 = r5
        L_0x0077:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x005f
            r2.add(r3)     // Catch:{ Exception -> 0x00ad }
            goto L_0x005f
        L_0x007e:
            java.util.Iterator r7 = r2.iterator()     // Catch:{ Exception -> 0x00ad }
        L_0x0082:
            boolean r2 = r7.hasNext()     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r7.next()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00ad }
            T r3 = r0.element     // Catch:{ Exception -> 0x00ad }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = r3.getQueryParameter(r2)     // Catch:{ Exception -> 0x00ad }
            if (r3 == 0) goto L_0x00a1
            int r6 = r3.length()     // Catch:{ Exception -> 0x00ad }
            if (r6 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r6 = r4
            goto L_0x00a2
        L_0x00a1:
            r6 = r5
        L_0x00a2:
            if (r6 != 0) goto L_0x0082
            java.lang.String r6 = "queryParameterKey"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)     // Catch:{ Exception -> 0x00ad }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00ad }
            goto L_0x0082
        L_0x00ad:
            r7 = move-exception
            java.lang.String r2 = f12099a
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            com.braze.ui.support.UriUtils$getQueryParameters$2 r4 = new com.braze.ui.support.UriUtils$getQueryParameters$2
            r4.<init>(r0)
            r0 = 8
            com.braze.support.BrazeLogger.m11283e(r2, r3, r7, r4, r0)
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.p044ui.support.UriUtils.m11473b(android.net.Uri):java.util.Map");
    }

    /* renamed from: c */
    public static final boolean m11474c(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), PackageManager.ComponentInfoFlags.of(0));
            } else {
                context.getPackageManager().getActivityInfo(new ComponentName(context, str), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            BrazeLogger.m11283e(f12099a, BrazeLogger.Priority.W, e, new UriUtils$isActivityRegisteredInManifest$1(str), 8);
            return false;
        }
    }
}
