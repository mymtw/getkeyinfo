package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C4986ag;
import com.appsflyer.internal.C5082cp;
import com.appsflyer.internal.C5083cq;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    /* renamed from: com.appsflyer.share.CrossPromotionHelper$a */
    public static class C5123a implements Runnable {
        private final C5083cq AFInAppEventParameterName;
        private final boolean AFInAppEventType;
        private final String valueOf;
        private final WeakReference<Context> values;

        public C5123a(String str, C5083cq cqVar, Context context, boolean z) {
            this.valueOf = str;
            this.AFInAppEventParameterName = cqVar;
            this.values = new WeakReference<>(context);
            this.AFInAppEventType = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                boolean r0 = r6.AFInAppEventType
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00af }
                java.lang.String r2 = r6.valueOf     // Catch:{ all -> 0x00af }
                r1.<init>(r2)     // Catch:{ all -> 0x00af }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00af }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00af }
                r0 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x00ad }
                r0 = 0
                r1.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00ad }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00ad }
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 == r3) goto L_0x0096
                r3 = 301(0x12d, float:4.22E-43)
                if (r2 == r3) goto L_0x0048
                r3 = 302(0x12e, float:4.23E-43)
                if (r2 == r3) goto L_0x0048
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "call to "
                r0.<init>(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00ad }
                r0.append(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = " failed: "
                r0.append(r3)     // Catch:{ all -> 0x00ad }
                r0.append(r2)     // Catch:{ all -> 0x00ad }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ad }
                com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ all -> 0x00ad }
                goto L_0x00a9
            L_0x0048:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "Cross promotion redirection success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00ad }
                r2.append(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ad }
                com.appsflyer.AFLogger.AFInAppEventParameterName(r2, r0)     // Catch:{ all -> 0x00ad }
                com.appsflyer.internal.cq r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
                if (r0 == 0) goto L_0x00a9
                java.lang.ref.WeakReference<android.content.Context> r0 = r6.values     // Catch:{ all -> 0x00ad }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
                if (r0 == 0) goto L_0x00a9
                com.appsflyer.internal.cq r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ all -> 0x00ad }
                r0.AFInAppEventType = r2     // Catch:{ all -> 0x00ad }
                com.appsflyer.internal.cq r0 = r6.AFInAppEventParameterName     // Catch:{ all -> 0x00ad }
                java.lang.ref.WeakReference<android.content.Context> r2 = r6.values     // Catch:{ all -> 0x00ad }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00ad }
                android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = r0.AFInAppEventType     // Catch:{ all -> 0x00ad }
                if (r3 == 0) goto L_0x00a9
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x00ad }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r0 = r0.AFInAppEventType     // Catch:{ all -> 0x00ad }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00ad }
                r3.<init>(r4, r0)     // Catch:{ all -> 0x00ad }
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r0 = r3.setFlags(r0)     // Catch:{ all -> 0x00ad }
                r2.startActivity(r0)     // Catch:{ all -> 0x00ad }
                goto L_0x00a9
            L_0x0096:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "Cross promotion impressions success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00ad }
                r2.append(r3)     // Catch:{ all -> 0x00ad }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ad }
                com.appsflyer.AFLogger.AFInAppEventParameterName(r2, r0)     // Catch:{ all -> 0x00ad }
            L_0x00a9:
                r1.disconnect()
                return
            L_0x00ad:
                r0 = move-exception
                goto L_0x00b3
            L_0x00af:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x00b3:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00c0 }
                com.appsflyer.AFLogger.AFInAppEventType(r2, r0)     // Catch:{ all -> 0x00c0 }
                if (r1 == 0) goto L_0x00bf
                r1.disconnect()
            L_0x00bf:
                return
            L_0x00c0:
                r0 = move-exception
                if (r1 == 0) goto L_0x00c6
                r1.disconnect()
            L_0x00c6:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.C5123a.run():void");
        }
    }

    private static LinkGenerator AFInAppEventType(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventType = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, (Map<String, String>) null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, (Map<String, String>) null);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && str2.equals(ResponseConstants.SEARCH_IMPRESSION)) {
                    c = 1;
                }
            } else if (str2.equals("app")) {
                c = 0;
            }
            if (c == 0) {
                C5082cp.AFKeystoreWrapper = str;
            } else if (c == 1) {
                AFInAppEventType = str;
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventType2 = AFInAppEventType(context, str, str2, map, String.format(C5082cp.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new C5123a(AFInAppEventType2.generateLink(), new C5083cq(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        new Thread(new C5123a(AFInAppEventType(context, str, str2, map, String.format(AFInAppEventType, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()})).generateLink(), (C5083cq) null, (Context) null, AppsFlyerLib.getInstance().isStopped())).start();
    }
}
