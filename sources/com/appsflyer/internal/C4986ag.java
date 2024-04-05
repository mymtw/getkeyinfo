package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import com.appboy.Constants;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.C4978ae;
import com.appsflyer.internal.C5017as;
import com.appsflyer.internal.C5030b;
import com.appsflyer.internal.C5072cj;
import com.appsflyer.internal.C5101o;
import com.appsflyer.internal.C5104u;
import com.appsflyer.internal.C5112y;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453tf.C13418j;

/* renamed from: com.appsflyer.internal.ag */
public final class C4986ag extends AppsFlyerLib {
    public static AppsFlyerInAppPurchaseValidatorListener AFInAppEventParameterName = null;
    public static final String AFInAppEventType = "132";
    public static final String AFKeystoreWrapper;
    private static String onAppOpenAttribution = null;
    private static final String onAppOpenAttributionNative;
    private static String onAttributionFailureNative = "https://%sstats.%s/stats";
    private static C4986ag onConversionDataFail = new C4986ag();
    private static String onConversionDataSuccess = null;
    private static String onInstallConversionDataLoadedNative = null;
    private static String onResponseErrorNative = null;
    private static String onResponseNative = null;
    public static AppsFlyerConversionListener valueOf = null;
    public static final String values = "6.4";
    public String AFLogger$LogLevel;
    public long AFVersionDeclaration;
    public C5021au AppsFlyer2dXConversionCallback;
    private long AppsFlyerConversionListener = TimeUnit.SECONDS.toMillis(5);
    /* access modifiers changed from: private */
    public long AppsFlyerInAppPurchaseValidatorListener;
    /* access modifiers changed from: private */
    public long AppsFlyerLib;
    /* access modifiers changed from: private */
    public Map<String, Object> enableLocationCollection;
    private Map<Long, String> getInstance;
    public String getLevel;
    /* access modifiers changed from: private */
    public C5069ch getOutOfStore;
    private boolean getSdkVersion;
    public C5072cj[] init;
    private long onAttributionFailure = -1;
    /* access modifiers changed from: private */
    public ScheduledExecutorService onDeepLinking = null;
    public C5101o onDeepLinkingNative;
    public final C5037be onInstallConversionFailureNative;
    private boolean onPause = false;
    private long onResponse = -1;
    /* access modifiers changed from: private */
    public boolean onResponseError = false;
    private boolean onValidateInApp = false;
    private String onValidateInAppFailure;
    /* access modifiers changed from: private */
    public Map<String, Object> setAndroidIdData;
    private SharedPreferences setCustomerIdAndLogSession;
    /* access modifiers changed from: private */
    public Application setCustomerUserId;
    private final C5005an setDebugLog = new C5005an();
    private boolean setImeiData = false;
    private boolean setOaidData = false;
    private String setOutOfStore;
    private final Executor setPhoneNumber = Executors.newSingleThreadExecutor();
    private boolean stop;
    private boolean updateServerUninstallToken = false;
    private C5034bb waitForCustomerUserId;

    /* renamed from: com.appsflyer.internal.ag$8 */
    public static /* synthetic */ class C49958 {
        public static final /* synthetic */ int[] AFInAppEventParameterName;
        public static final /* synthetic */ int[] valueOf;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                com.appsflyer.internal.cj$e[] r0 = com.appsflyer.internal.C5072cj.C5074e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                valueOf = r0
                r1 = 1
                com.appsflyer.internal.cj$e r2 = com.appsflyer.internal.C5072cj.C5074e.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = valueOf     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.cj$e r3 = com.appsflyer.internal.C5072cj.C5074e.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                AFInAppEventParameterName = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r3 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r2 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.C49958.<clinit>():void");
        }
    }

    /* renamed from: com.appsflyer.internal.ag$a */
    public class C4996a implements Runnable {
        private final C5089f values;

        public /* synthetic */ C4996a(C4986ag agVar, C5089f fVar, byte b) {
            this(fVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte[]} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x023a, code lost:
            r2 = r0;
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x023d, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x023e, code lost:
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x024f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0250, code lost:
            com.appsflyer.AFLogger.values((java.lang.Throwable) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x026e, code lost:
            r0.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r12.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0186, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0187, code lost:
            com.appsflyer.AFLogger.AFInAppEventType(r0.getMessage(), r0);
            r2 = r1.values.AFKeystoreWrapper;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
            if (r2 != null) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0194, code lost:
            r2.onError(com.appsflyer.attribution.RequestError.NETWORK_FAILURE, r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x019e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x019f, code lost:
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
            r2.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ca, code lost:
            r2 = r2.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ce, code lost:
            if (r2 == null) goto L_0x01dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d5, code lost:
            com.appsflyer.AFLogger.AFInAppEventType("reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
            com.appsflyer.AFLogger.AFInAppEventType("caching request...");
            r2 = new java.io.File(com.appsflyer.internal.C4999ah.AFInAppEventType((android.content.Context) r9), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r2.createNewFile();
            r4 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r2.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            r4.write("version=");
            r4.write(r0.values);
            r4.write(10);
            r4.write("url=");
            r4.write(r0.AFKeystoreWrapper);
            r4.write(10);
            r4.write("data=");
            r4.write(android.util.Base64.encodeToString(r0.AFInAppEventParameterName(), 2));
            r4.write(10);
            r4.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0239, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x024b A[SYNTHETIC, Splitter:B:110:0x024b] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x025e A[SYNTHETIC, Splitter:B:116:0x025e] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0186 A[ExcHandler: all (r0v23 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:42:0x0115] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01c5 A[Catch:{ Exception -> 0x0243 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01ca A[Catch:{ Exception -> 0x0243 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                com.appsflyer.internal.f r0 = r1.values
                java.util.Map r2 = r0.AFKeystoreWrapper()
                com.appsflyer.internal.f r0 = r1.values
                boolean r0 = r0.AFInAppEventType()
                com.appsflyer.internal.f r3 = r1.values
                java.lang.String r4 = r3.onInstallConversionFailureNative
                int r5 = r3.onAttributionFailureNative
                android.app.Application r9 = r3.values
                com.appsflyer.internal.ag r3 = com.appsflyer.internal.C4986ag.this
                boolean r3 = r3.isStopped()
                if (r3 == 0) goto L_0x002c
                com.appsflyer.internal.f r0 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFKeystoreWrapper
                if (r0 == 0) goto L_0x002b
                int r2 = com.appsflyer.attribution.RequestError.STOP_TRACKING
                java.lang.String r3 = com.appsflyer.internal.C5028ay.AFInAppEventParameterName
                r0.onError(r2, r3)
            L_0x002b:
                return
            L_0x002c:
                r3 = 0
                byte[] r6 = new byte[r3]
                r7 = 2
                r8 = 1
                if (r0 == 0) goto L_0x00fd
                if (r5 > r7) goto L_0x00fd
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.appsflyer.internal.ag r10 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.cj[] r10 = r10.init
                if (r10 == 0) goto L_0x00a8
                com.appsflyer.internal.ag r10 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.cj[] r10 = r10.init
                int r11 = r10.length
                r12 = r3
            L_0x004a:
                if (r12 >= r11) goto L_0x00a8
                r13 = r10[r12]
                boolean r14 = r13 instanceof com.appsflyer.internal.C5067cg
                int[] r15 = com.appsflyer.internal.C4986ag.C49958.valueOf
                com.appsflyer.internal.cj$e r3 = r13.AFKeystoreWrapper
                int r3 = r3.ordinal()
                r3 = r15[r3]
                if (r3 == r8) goto L_0x0082
                if (r3 == r7) goto L_0x005f
                goto L_0x00a4
            L_0x005f:
                if (r5 != r7) goto L_0x00a4
                if (r14 != 0) goto L_0x00a4
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.lang.String r14 = "source"
                java.lang.String r13 = r13.values
                r3.put(r14, r13)
                java.lang.String r13 = "response"
                java.lang.String r14 = "TIMEOUT"
                r3.put(r13, r14)
                com.appsflyer.internal.ci r13 = new com.appsflyer.internal.ci
                r13.<init>()
                r3.putAll(r13)
                r0.add(r3)
                goto L_0x00a4
            L_0x0082:
                if (r14 == 0) goto L_0x009f
                java.lang.String r3 = "rfr"
                r14 = r13
                com.appsflyer.internal.cg r14 = (com.appsflyer.internal.C5067cg) r14
                java.util.Map<java.lang.String, java.lang.Object> r14 = r14.valueOf
                r2.put(r3, r14)
                android.content.SharedPreferences r3 = com.appsflyer.internal.C4986ag.AFInAppEventParameterName((android.content.Context) r9)
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.String r14 = "newGPReferrerSent"
                android.content.SharedPreferences$Editor r3 = r3.putBoolean(r14, r8)
                r3.apply()
            L_0x009f:
                java.util.Map<java.lang.String, java.lang.Object> r3 = r13.AFInAppEventParameterName
                r0.add(r3)
            L_0x00a4:
                int r12 = r12 + 1
                r3 = 0
                goto L_0x004a
            L_0x00a8:
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L_0x00b3
                java.lang.String r3 = "referrers"
                r2.put(r3, r0)
            L_0x00b3:
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this
                java.util.Map r0 = r0.setAndroidIdData
                if (r0 == 0) goto L_0x00c6
                java.lang.String r0 = "fb_ddl"
                com.appsflyer.internal.ag r3 = com.appsflyer.internal.C4986ag.this
                java.util.Map r3 = r3.setAndroidIdData
                r2.put(r0, r3)
            L_0x00c6:
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.ch r0 = r0.getOutOfStore
                if (r0 == 0) goto L_0x00fd
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.ch r0 = r0.getOutOfStore
                boolean r0 = r0.AFInAppEventParameterName()
                if (r0 == 0) goto L_0x00f2
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.ch r0 = r0.getOutOfStore
                java.util.List r0 = r0.values()
                if (r0 == 0) goto L_0x00fd
                boolean r3 = r0.isEmpty()
                if (r3 != 0) goto L_0x00fd
                java.lang.String r3 = "preload_id"
                r2.put(r3, r0)
                goto L_0x00fd
            L_0x00f2:
                java.lang.String r0 = "preload_id"
                java.lang.String r3 = "timeout"
                java.util.List r3 = java.util.Collections.singletonList(r3)
                r2.put(r0, r3)
            L_0x00fd:
                com.appsflyer.internal.f r0 = r1.values
                boolean r0 = r0 instanceof com.appsflyer.internal.C5057bw
                if (r0 != 0) goto L_0x0114
                com.appsflyer.internal.b$e r0 = new com.appsflyer.internal.b$e
                r0.<init>(r2, r9)
                r2.putAll(r0)
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this
                java.util.Map r0 = r0.AFInAppEventParameterName()
                r2.putAll(r0)
            L_0x0114:
                r3 = 0
                com.appsflyer.internal.f r0 = r1.values     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                boolean r5 = r0 instanceof com.appsflyer.internal.C5057bw     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                if (r5 == 0) goto L_0x0124
                java.lang.String r5 = "af_key"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                goto L_0x012c
            L_0x0124:
                java.lang.String r5 = "appsflyerKey"
                java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
            L_0x012c:
                r0.init = r5     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                monitor-enter(r2)     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                com.appsflyer.internal.f r0 = r1.values     // Catch:{ all -> 0x0183 }
                java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x017a }
                r10 = 0
                r5[r10] = r0     // Catch:{ all -> 0x017a }
                r0 = 0
                float r11 = android.graphics.PointF.length(r0, r0)     // Catch:{ all -> 0x017a }
                int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                int r11 = r11 + 48
                float r12 = android.util.TypedValue.complexToFraction(r10, r0, r0)     // Catch:{ all -> 0x017a }
                int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                char r0 = (char) r0     // Catch:{ all -> 0x017a }
                int r10 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x017a }
                int r10 = r10 >> 16
                int r10 = 24 - r10
                java.lang.Object r0 = com.appsflyer.internal.C5088e.AFKeystoreWrapper(r11, r0, r10)     // Catch:{ all -> 0x017a }
                java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x017a }
                java.lang.String r10 = "values"
                java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x017a }
                java.lang.Class<com.appsflyer.internal.f> r12 = com.appsflyer.internal.C5089f.class
                r13 = 0
                r11[r13] = r12     // Catch:{ all -> 0x017a }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r10, r11)     // Catch:{ all -> 0x017a }
                java.lang.Object r0 = r0.invoke(r3, r5)     // Catch:{ all -> 0x017a }
                r5 = r0
                byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x017a }
                monitor-exit(r2)     // Catch:{ all -> 0x0177 }
                com.appsflyer.internal.ag r0 = com.appsflyer.internal.C4986ag.this     // Catch:{ IOException -> 0x0173, all -> 0x0186 }
                com.appsflyer.internal.f r2 = r1.values     // Catch:{ IOException -> 0x0173, all -> 0x0186 }
                r2.getLevel = r5     // Catch:{ IOException -> 0x0173, all -> 0x0186 }
                com.appsflyer.internal.C4986ag.AFInAppEventType((com.appsflyer.internal.C4986ag) r0, (com.appsflyer.internal.C5089f) r2)     // Catch:{ IOException -> 0x0173, all -> 0x0186 }
                return
            L_0x0173:
                r0 = move-exception
                r12 = r0
                r6 = r5
                goto L_0x01a0
            L_0x0177:
                r0 = move-exception
                r6 = r5
                goto L_0x0184
            L_0x017a:
                r0 = move-exception
                java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x0183 }
                if (r5 == 0) goto L_0x0182
                throw r5     // Catch:{ all -> 0x0183 }
            L_0x0182:
                throw r0     // Catch:{ all -> 0x0183 }
            L_0x0183:
                r0 = move-exception
            L_0x0184:
                monitor-exit(r2)     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
                throw r0     // Catch:{ IOException -> 0x019e, all -> 0x0186 }
            L_0x0186:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                com.appsflyer.AFLogger.AFInAppEventType(r2, r0)
                com.appsflyer.internal.f r2 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r2 = r2.AFKeystoreWrapper
                if (r2 == 0) goto L_0x019d
                int r3 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r0 = r0.getMessage()
                r2.onError(r3, r0)
            L_0x019d:
                return
            L_0x019e:
                r0 = move-exception
                r12 = r0
            L_0x01a0:
                java.lang.String r0 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0, (java.lang.Throwable) r12)
                if (r6 == 0) goto L_0x0268
                if (r9 == 0) goto L_0x0268
                java.lang.String r0 = "&isCachedRequest=true&timeincache="
                boolean r0 = r4.contains(r0)
                if (r0 != 0) goto L_0x0268
                com.appsflyer.internal.C4999ah.AFInAppEventParameterName()
                com.appsflyer.internal.h r0 = new com.appsflyer.internal.h
                java.lang.String r2 = "6.4.3"
                r0.<init>(r4, r6, r2)
                java.io.File r2 = com.appsflyer.internal.C4999ah.AFInAppEventType((android.content.Context) r9)     // Catch:{ Exception -> 0x0243 }
                boolean r4 = r2.exists()     // Catch:{ Exception -> 0x0243 }
                if (r4 != 0) goto L_0x01ca
                r2.mkdir()     // Catch:{ Exception -> 0x0243 }
                goto L_0x0254
            L_0x01ca:
                java.io.File[] r2 = r2.listFiles()     // Catch:{ Exception -> 0x0243 }
                if (r2 == 0) goto L_0x01dc
                int r2 = r2.length     // Catch:{ Exception -> 0x0243 }
                r4 = 40
                if (r2 <= r4) goto L_0x01dc
                java.lang.String r0 = "reached cache limit, not caching request"
                com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ Exception -> 0x0243 }
                goto L_0x0254
            L_0x01dc:
                java.lang.String r2 = "caching request..."
                com.appsflyer.AFLogger.AFInAppEventType(r2)     // Catch:{ Exception -> 0x0243 }
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0243 }
                java.io.File r4 = com.appsflyer.internal.C4999ah.AFInAppEventType((android.content.Context) r9)     // Catch:{ Exception -> 0x0243 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0243 }
                java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ Exception -> 0x0243 }
                r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0243 }
                r2.createNewFile()     // Catch:{ Exception -> 0x0243 }
                java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0243 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0243 }
                java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0243 }
                r5.<init>(r2, r8)     // Catch:{ Exception -> 0x0243 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0243 }
                java.lang.String r2 = "version="
                r4.write(r2)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                java.lang.String r2 = r0.values     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.write(r2)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r2 = 10
                r4.write(r2)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                java.lang.String r3 = "url="
                r4.write(r3)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                java.lang.String r3 = r0.AFKeystoreWrapper     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.write(r3)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.write(r2)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                java.lang.String r3 = "data="
                r4.write(r3)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                byte[] r0 = r0.AFInAppEventParameterName()     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.write(r0)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.write(r2)     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.flush()     // Catch:{ Exception -> 0x023d, all -> 0x0239 }
                r4.close()     // Catch:{ IOException -> 0x024f }
                goto L_0x0254
            L_0x0239:
                r0 = move-exception
                r2 = r0
                r3 = r4
                goto L_0x025c
            L_0x023d:
                r0 = move-exception
                r3 = r4
                goto L_0x0244
            L_0x0240:
                r0 = move-exception
                r2 = r0
                goto L_0x025c
            L_0x0243:
                r0 = move-exception
            L_0x0244:
                java.lang.String r2 = "Could not cache request"
                com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0240 }
                if (r3 == 0) goto L_0x0254
                r3.close()     // Catch:{ IOException -> 0x024f }
                goto L_0x0254
            L_0x024f:
                r0 = move-exception
                r2 = r0
                com.appsflyer.AFLogger.values((java.lang.Throwable) r2)
            L_0x0254:
                java.lang.String r0 = r12.getMessage()
                com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0, (java.lang.Throwable) r12)
                goto L_0x0268
            L_0x025c:
                if (r3 == 0) goto L_0x0267
                r3.close()     // Catch:{ IOException -> 0x0262 }
                goto L_0x0267
            L_0x0262:
                r0 = move-exception
                r3 = r0
                com.appsflyer.AFLogger.values((java.lang.Throwable) r3)
            L_0x0267:
                throw r2
            L_0x0268:
                com.appsflyer.internal.f r0 = r1.values
                com.appsflyer.attribution.AppsFlyerRequestListener r0 = r0.AFKeystoreWrapper
                if (r0 == 0) goto L_0x0277
                int r2 = com.appsflyer.attribution.RequestError.NETWORK_FAILURE
                java.lang.String r3 = r12.getMessage()
                r0.onError(r2, r3)
            L_0x0277:
                com.appsflyer.internal.ag r6 = com.appsflyer.internal.C4986ag.this
                com.appsflyer.internal.f r7 = r1.values
                java.lang.String r8 = r7.init
                android.content.SharedPreferences r10 = com.appsflyer.internal.C4986ag.AFInAppEventParameterName((android.content.Context) r9)
                r11 = 0
                com.appsflyer.internal.C5047bn.AFKeystoreWrapper(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.C4996a.run():void");
        }

        private C4996a(C5089f fVar) {
            this.values = fVar;
        }
    }

    /* renamed from: com.appsflyer.internal.ag$c */
    public class C4997c implements Runnable {
        private final Application values;

        public C4997c(Context context) {
            this.values = (Application) context.getApplicationContext();
        }

        public final void run() {
            if (!C4986ag.this.onResponseError) {
                C4986ag.this.AFVersionDeclaration = System.currentTimeMillis();
                boolean unused = C4986ag.this.onResponseError = true;
                try {
                    String devKey = AppsFlyerProperties.getInstance().getDevKey();
                    C4999ah.AFInAppEventParameterName();
                    for (C5090h next : C4999ah.values(this.values)) {
                        StringBuilder sb = new StringBuilder("resending request: ");
                        sb.append(next.AFKeystoreWrapper);
                        AFLogger.AFInAppEventType(sb.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(next.AFInAppEventParameterName, 10);
                            C4986ag agVar = C4986ag.this;
                            C5060bz bzVar = new C5060bz();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(next.AFKeystoreWrapper);
                            sb2.append("&isCachedRequest=true&timeincache=");
                            sb2.append((currentTimeMillis - parseLong) / 1000);
                            C5089f AFKeystoreWrapper2 = bzVar.AFKeystoreWrapper(sb2.toString());
                            AFKeystoreWrapper2.getLevel = next.AFInAppEventParameterName();
                            AFKeystoreWrapper2.init = devKey;
                            Application application = this.values;
                            if (application != null) {
                                AFKeystoreWrapper2.values = (Application) application.getApplicationContext();
                            }
                            AFKeystoreWrapper2.AppsFlyer2dXConversionCallback = next.AFInAppEventParameterName;
                            AFKeystoreWrapper2.onInstallConversionDataLoadedNative = false;
                            C4986ag.AFInAppEventType(agVar, AFKeystoreWrapper2);
                        } catch (Exception e) {
                            AFLogger.AFKeystoreWrapper("Failed to resend cached request", (Throwable) e);
                        }
                    }
                } catch (Exception e2) {
                    AFLogger.AFKeystoreWrapper("failed to check cache. ", (Throwable) e2);
                } catch (Throwable th) {
                    boolean unused2 = C4986ag.this.onResponseError = false;
                    throw th;
                }
                boolean unused3 = C4986ag.this.onResponseError = false;
                C4986ag.this.onDeepLinking.shutdown();
                ScheduledExecutorService unused4 = C4986ag.this.onDeepLinking = null;
            }
        }
    }

    /* renamed from: com.appsflyer.internal.ag$e */
    public class C4998e implements Runnable {
        private final C5089f AFKeystoreWrapper;

        public /* synthetic */ C4998e(C4986ag agVar, C5089f fVar, byte b) {
            this(fVar);
        }

        public final void run() {
            C4986ag.AFInAppEventParameterName(C4986ag.this, this.AFKeystoreWrapper);
        }

        private C4998e(C5089f fVar) {
            this.AFKeystoreWrapper = fVar;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(values);
        sb.append("/androidevent?buildnumber=6.4.3&app_id=");
        AFKeystoreWrapper = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb2.append(values);
        sb2.append("/android?buildnumber=6.4.3&app_id=");
        onInstallConversionDataLoadedNative = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(values);
        sb3.append("/androidevent?app_id=");
        String obj = sb3.toString();
        onAppOpenAttributionNative = obj;
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        onResponseNative = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        onAppOpenAttribution = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        onResponseErrorNative = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sattr.%s/api/v");
        sb7.append(obj);
        onConversionDataSuccess = sb7.toString();
    }

    public C4986ag() {
        AFVersionDeclaration.init();
        this.onInstallConversionFailureNative = new C5037be();
    }

    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List asList = Arrays.asList(strArr);
        List<List<String>> list = C5095j.AFInAppEventParameterName().AppsFlyer2dXConversionCallback;
        if (!list.contains(asList)) {
            list.add(asList);
        }
    }

    public final void anonymizeUser(boolean z) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        C5095j AFInAppEventParameterName2 = C5095j.AFInAppEventParameterName();
        AFInAppEventParameterName2.init = str;
        AFInAppEventParameterName2.AFVersionDeclaration = map;
    }

    public final void enableFacebookDeferredApplinks(boolean z) {
        this.setOaidData = z;
    }

    public final AppsFlyerLib enableLocationCollection(boolean z) {
        this.onValidateInApp = z;
        return this;
    }

    public final String getAppsFlyerUID(Context context) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "getAppsFlyerUID", new String[0]);
        if (context == null) {
            return null;
        }
        return C5003al.AFInAppEventParameterName(new WeakReference(new C5100n(context).values));
    }

    public final String getAttributionId(Context context) {
        try {
            return new C5000ai(context).AFKeystoreWrapper();
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    public final String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : "appsflyer.com";
    }

    public final String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String AFInAppEventParameterName2 = context == null ? null : AFInAppEventParameterName("AF_STORE", context.getPackageManager(), context.getPackageName());
        if (AFInAppEventParameterName2 != null) {
            return AFInAppEventParameterName2;
        }
        AFLogger.AFInAppEventType("No out-of-store value set");
        return null;
    }

    public final String getSdkVersion() {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 6.4.3 (build ");
        sb.append(AFInAppEventType);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isPreInstalledApp(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.AFKeystoreWrapper("Could not check if app is pre installed", (Throwable) e);
        }
    }

    public final boolean isStopped() {
        return this.updateServerUninstallToken;
    }

    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        C5061ca caVar = new C5061ca();
        if (context != null) {
            caVar.values = (Application) context.getApplicationContext();
        }
        caVar.AFLogger$LogLevel = str;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        caVar.AFInAppEventType = hashMap;
        caVar.AFKeystoreWrapper = appsFlyerRequestListener;
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak akVar = C5002ak.AFInAppEventType;
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = caVar.AFInAppEventType;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        akVar.valueOf("public_api_call", "logEvent", strArr);
        if (str != null) {
            C4965ab.AFKeystoreWrapper(context).valueOf();
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        AFKeystoreWrapper((C5089f) caVar, activity);
    }

    public final void logLocation(Context context, double d, double d2) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFInAppEventParameterName(context, AFInAppEventType.LOCATION_COORDINATES, (Map<String, Object>) hashMap);
    }

    public final void logSession(Context context) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "logSession", new String[0]);
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.AFInAppEventParameterName = false;
        AFInAppEventParameterName(context, (String) null, (Map<String, Object>) null);
    }

    public final void onPause(Context context) {
        C4978ae.C4984c cVar = C4978ae.valueOf;
        if (cVar != null) {
            cVar.AFInAppEventType(context);
        }
    }

    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri == null || uri.toString().isEmpty()) {
            StringBuilder sb = new StringBuilder("Link is \"");
            sb.append(uri);
            sb.append("\"");
            C5015aq.valueOf(sb.toString(), DeepLinkResult.Error.NETWORK);
        } else if (context == null) {
            StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context);
            sb2.append("\"");
            C5015aq.valueOf(sb2.toString(), DeepLinkResult.Error.NETWORK);
        } else {
            C5095j.AFInAppEventParameterName().valueOf(context, new HashMap(), Uri.parse(uri.toString()));
        }
    }

    public final void performOnDeepLinking(final Intent intent, Context context) {
        if (intent == null) {
            C5015aq.valueOf("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else if (context == null) {
            C5015aq.valueOf("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            final Context applicationContext = context.getApplicationContext();
            this.setPhoneNumber.execute(new Runnable() {
                public final void run() {
                    C5095j.AFInAppEventParameterName();
                    Intent intent = intent;
                    Context context = applicationContext;
                    C4986ag agVar = C4986ag.this;
                    if (agVar.AppsFlyer2dXConversionCallback == null) {
                        agVar.AppsFlyer2dXConversionCallback = new C5021au(context);
                    }
                    C5021au auVar = agVar.AppsFlyer2dXConversionCallback;
                    Uri AFInAppEventType2 = C5095j.AFInAppEventType(intent);
                    boolean z = AFInAppEventType2 != null && !AFInAppEventType2.toString().isEmpty();
                    if (!C4986ag.AFInAppEventParameterName(context).getBoolean("ddl_sent", false) || z) {
                        C5095j.AFInAppEventParameterName().AFKeystoreWrapper(new HashMap(), auVar, intent, context);
                    } else {
                        C5015aq.valueOf("No direct deep link", (DeepLinkResult.Error) null);
                    }
                }
            });
        }
    }

    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            valueOf = appsFlyerConversionListener;
        }
    }

    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.valueOf("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.valueOf("registerValidatorListener null listener");
        } else {
            AFInAppEventParameterName = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        C5057bw bwVar = new C5057bw();
        if (context != null) {
            bwVar.values = (Application) context.getApplicationContext();
        }
        bwVar.AFInAppEventType = map;
        Application application = bwVar.values;
        StringBuilder h = C0072d.m201h(String.format(onInstallConversionDataLoadedNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataFail.getHostName()}));
        h.append(application.getPackageName());
        String obj = h.toString();
        SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName((Context) application);
        int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName2, "appsFlyerCount", false);
        int AFInAppEventType3 = AFInAppEventType(AFInAppEventParameterName2, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", bwVar.AFInAppEventType);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFInAppEventType3));
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        hashMap.put("af_key", devKey);
        hashMap.put("launch_counter", Integer.valueOf(AFInAppEventType2));
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", C5003al.AFInAppEventParameterName(new WeakReference(application)));
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
        if (string2 != null) {
            hashMap.put("advertiserIdEnabled", string2);
        }
        if (string != null) {
            hashMap.put("advertiserId", string);
        }
        hashMap.put("device", Build.DEVICE);
        AFInAppEventParameterName((Context) application, (Map<String, Object>) hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(j)));
            String string3 = AFInAppEventParameterName2.getString("appsFlyerFirstInstall", (String) null);
            if (string3 == null) {
                string3 = values(simpleDateFormat, (Context) application);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("AdRevenue - Exception while collecting app version data ", th);
        }
        C5089f AFInAppEventType4 = bwVar.AFKeystoreWrapper(obj).AFInAppEventType(hashMap);
        AFInAppEventType4.onAttributionFailureNative = AFInAppEventType2;
        AFInAppEventType4.init = devKey;
        C4996a aVar = new C4996a(this, AFInAppEventType4, (byte) 0);
        if (C5097l.AFInAppEventType == null) {
            C5097l.AFInAppEventType = new C5097l();
        }
        AFInAppEventType(C5097l.AFInAppEventType.AFInAppEventType(), aVar, 1, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "public_api_call"
            java.lang.String r7 = "sendPushNotificationData"
            if (r17 == 0) goto L_0x0046
            android.content.Intent r8 = r17.getIntent()
            if (r8 == 0) goto L_0x0046
            com.appsflyer.internal.ak r8 = com.appsflyer.internal.C5002ak.AFInAppEventType
            if (r8 != 0) goto L_0x0020
            com.appsflyer.internal.ak r8 = new com.appsflyer.internal.ak
            r8.<init>()
            com.appsflyer.internal.C5002ak.AFInAppEventType = r8
        L_0x0020:
            com.appsflyer.internal.ak r8 = com.appsflyer.internal.C5002ak.AFInAppEventType
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r10 = "activity_intent_"
            r4.<init>(r10)
            android.content.Intent r10 = r17.getIntent()
            java.lang.String r10 = r10.toString()
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r9[r3] = r4
            r8.valueOf(r6, r7, r9)
            goto L_0x007b
        L_0x0046:
            if (r17 == 0) goto L_0x0065
            com.appsflyer.internal.ak r8 = com.appsflyer.internal.C5002ak.AFInAppEventType
            if (r8 != 0) goto L_0x0053
            com.appsflyer.internal.ak r8 = new com.appsflyer.internal.ak
            r8.<init>()
            com.appsflyer.internal.C5002ak.AFInAppEventType = r8
        L_0x0053:
            com.appsflyer.internal.ak r8 = com.appsflyer.internal.C5002ak.AFInAppEventType
            java.lang.String[] r9 = new java.lang.String[r5]
            java.lang.String r10 = r17.getLocalClassName()
            r9[r4] = r10
            java.lang.String r4 = "activity_intent_null"
            r9[r3] = r4
            r8.valueOf(r6, r7, r9)
            goto L_0x007b
        L_0x0065:
            com.appsflyer.internal.ak r3 = com.appsflyer.internal.C5002ak.AFInAppEventType
            if (r3 != 0) goto L_0x0070
            com.appsflyer.internal.ak r3 = new com.appsflyer.internal.ak
            r3.<init>()
            com.appsflyer.internal.C5002ak.AFInAppEventType = r3
        L_0x0070:
            com.appsflyer.internal.ak r3 = com.appsflyer.internal.C5002ak.AFInAppEventType
            java.lang.String r4 = "activity_null"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.valueOf(r6, r7, r4)
        L_0x007b:
            java.lang.String r3 = AFInAppEventType((android.app.Activity) r17)
            r1.onValidateInAppFailure = r3
            if (r3 == 0) goto L_0x0188
            long r3 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.getInstance
            java.lang.String r7 = ")"
            if (r6 != 0) goto L_0x009c
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.getInstance = r0
            r10 = r3
            goto L_0x014a
        L_0x009c:
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "pushPayloadMaxAging"
            r9 = 1800000(0x1b7740, double:8.89318E-318)
            long r8 = r6.getLong(r8, r9)     // Catch:{ all -> 0x012f }
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.getInstance     // Catch:{ all -> 0x012f }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x012f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x012f }
            r10 = r3
        L_0x00b4:
            boolean r12 = r6.hasNext()     // Catch:{ all -> 0x012d }
            if (r12 == 0) goto L_0x014a
            java.lang.Object r12 = r6.next()     // Catch:{ all -> 0x012d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x012d }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x012d }
            java.lang.String r14 = r1.onValidateInAppFailure     // Catch:{ all -> 0x012d }
            r13.<init>(r14)     // Catch:{ all -> 0x012d }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x012d }
            java.util.Map<java.lang.Long, java.lang.String> r15 = r1.getInstance     // Catch:{ all -> 0x012d }
            java.lang.Object r15 = r15.get(r12)     // Catch:{ all -> 0x012d }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x012d }
            r14.<init>(r15)     // Catch:{ all -> 0x012d }
            java.lang.Object r15 = r13.opt(r2)     // Catch:{ all -> 0x012d }
            java.lang.Object r5 = r14.opt(r2)     // Catch:{ all -> 0x012d }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x012d }
            if (r5 == 0) goto L_0x0110
            java.lang.Object r5 = r13.opt(r0)     // Catch:{ all -> 0x012d }
            java.lang.Object r15 = r14.opt(r0)     // Catch:{ all -> 0x012d }
            boolean r5 = r5.equals(r15)     // Catch:{ all -> 0x012d }
            if (r5 == 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x012d }
            r0.append(r14)     // Catch:{ all -> 0x012d }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x012d }
            r0.append(r13)     // Catch:{ all -> 0x012d }
            r0.append(r7)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012d }
            com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ all -> 0x012d }
            r0 = 0
            r1.onValidateInAppFailure = r0     // Catch:{ all -> 0x012d }
            return
        L_0x0110:
            long r13 = r12.longValue()     // Catch:{ all -> 0x012d }
            long r13 = r3 - r13
            int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x011f
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.getInstance     // Catch:{ all -> 0x012d }
            r5.remove(r12)     // Catch:{ all -> 0x012d }
        L_0x011f:
            long r13 = r12.longValue()     // Catch:{ all -> 0x012d }
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x012b
            long r10 = r12.longValue()     // Catch:{ all -> 0x012d }
        L_0x012b:
            r5 = 2
            goto L_0x00b4
        L_0x012d:
            r0 = move-exception
            goto L_0x0131
        L_0x012f:
            r0 = move-exception
            r10 = r3
        L_0x0131:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while handling push notification measurement: "
            r2.<init>(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x014a:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r5 = 2
            int r0 = r0.getInt(r2, r5)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.getInstance
            int r2 = r2.size()
            if (r2 != r0) goto L_0x017a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFInAppEventType(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.getInstance
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r0.remove(r2)
        L_0x017a:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.getInstance
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = r1.onValidateInAppFailure
            r0.put(r2, r3)
            r16.start(r17)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.sendPushNotificationData(android.app.Activity):void");
    }

    public final void setAdditionalData(Map<String, Object> map) {
        if (map != null) {
            if (C5002ak.AFInAppEventType == null) {
                C5002ak.AFInAppEventType = new C5002ak();
            }
            C5002ak.AFInAppEventType.valueOf("public_api_call", "setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
    }

    public final void setAndroidIdData(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setAndroidIdData", str);
        this.AFLogger$LogLevel = str;
    }

    public final void setAppId(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    public final void setAppInviteOneLink(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setAppInviteOneLink", str);
        AFLogger.AFInAppEventType("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    public final void setCollectAndroidID(boolean z) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    public final void setCollectIMEI(boolean z) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    @Deprecated
    public final void setCollectOaid(boolean z) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    public final void setCurrencyCode(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context == null) {
            return;
        }
        if (AFKeystoreWrapper()) {
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.AFInAppEventParameterName(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            String devKey = AppsFlyerProperties.getInstance().getDevKey();
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            C5062cb cbVar = new C5062cb();
            cbVar.values = (Application) context.getApplicationContext();
            cbVar.AFLogger$LogLevel = null;
            cbVar.init = devKey;
            cbVar.AFInAppEventType = null;
            cbVar.AFVersionDeclaration = referrer;
            cbVar.valueOf = null;
            AFInAppEventType((C5089f) cbVar);
            return;
        }
        setCustomerUserId(str);
        AFLogger.AFInAppEventParameterName("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
    }

    public final void setCustomerUserId(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setCustomerUserId", str);
        AFLogger.AFInAppEventType("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
    }

    public final void setDebugLog(boolean z) {
        setLogLevel(z ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    public final void setDisableAdvertisingIdentifiers(boolean z) {
        AFLogger.valueOf("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        C5115z.values = Boolean.valueOf(!z);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
    }

    public final void setExtension(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    public final void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.AppsFlyer2dXConversionCallback("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    public final void setImeiData(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setImeiData", str);
        this.getLevel = str;
    }

    public final void setIsUpdate(boolean z) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", AnalyticsLogDatabaseHelper.LOG, String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public final void setMinTimeBetweenSessions(int i) {
        this.AppsFlyerConversionListener = TimeUnit.SECONDS.toMillis((long) i);
    }

    public final void setOaidData(String str) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setOaidData", str);
        C5115z.valueOf = str;
    }

    public final void setOneLinkCustomDomain(String... strArr) {
        AFLogger.valueOf(String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        C5095j.AFLogger$LogLevel = strArr;
    }

    public final void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.AFInAppEventParameterName("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.AFInAppEventParameterName("Cannot set setOutOfStore with null");
    }

    public final void setPartnerData(String str, Map<String, Object> map) {
        if (this.waitForCustomerUserId == null) {
            this.waitForCustomerUserId = new C5034bb();
        }
        C5034bb bbVar = this.waitForCustomerUserId;
        if (str == null || str.isEmpty()) {
            AFLogger.AppsFlyer2dXConversionCallback("Partner ID is missing or `null`");
        } else if (map == null || map.isEmpty()) {
            AFLogger.AppsFlyer2dXConversionCallback(bbVar.AFInAppEventParameterName.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
        } else {
            StringBuilder sb = new StringBuilder("Setting partner data for ");
            sb.append(str);
            sb.append(": ");
            sb.append(map);
            AFLogger.valueOf(sb.toString());
            int length = new JSONObject(map).toString().length();
            if (length > 1000) {
                AFLogger.AppsFlyer2dXConversionCallback("Partner data 1000 characters limit exceeded");
                HashMap hashMap = new HashMap();
                hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                bbVar.AFInAppEventType.put(str, hashMap);
                return;
            }
            bbVar.AFInAppEventParameterName.put(str, map);
            bbVar.AFInAppEventType.remove(str);
        }
    }

    public final void setPhoneNumber(String str) {
        this.setOutOfStore = C4985af.AFInAppEventType(str);
    }

    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.valueOf("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.AFKeystoreWrapper(e.getMessage(), (Throwable) e);
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
    }

    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.valueOf(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        C5095j.AFKeystoreWrapper = strArr;
    }

    @Deprecated
    public final void setSharingFilter(String... strArr) {
        setSharingFilterForPartners(strArr);
    }

    @Deprecated
    public final void setSharingFilterForAllPartners() {
        setSharingFilterForPartners("all");
    }

    public final void setSharingFilterForPartners(String... strArr) {
        this.onDeepLinkingNative = new C5101o(strArr);
    }

    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        String str = null;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : strArr) {
            if (C49958.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(C4985af.AFInAppEventType(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public final void start(Context context) {
        start(context, (String) null);
    }

    public final void stop(boolean z, Context context) {
        this.updateServerUninstallToken = z;
        C4999ah.AFInAppEventParameterName();
        try {
            File AFInAppEventType2 = C4999ah.AFInAppEventType(context);
            if (!AFInAppEventType2.exists()) {
                AFInAppEventType2.mkdir();
            } else {
                for (File file : AFInAppEventType2.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    AFLogger.AFInAppEventType(sb.toString());
                    C4999ah.AFInAppEventParameterName(C4999ah.AFInAppEventType(file).AFInAppEventParameterName, context);
                }
            }
        } catch (Exception e) {
            AFLogger.AFKeystoreWrapper("Could not cache request", (Throwable) e);
        }
        if (this.updateServerUninstallToken) {
            SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
            edit.putBoolean("is_stop_tracking_used", true);
            edit.apply();
        }
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3));
    }

    public final void unregisterConversionListener() {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "unregisterConversionListener", new String[0]);
        valueOf = null;
    }

    public final void updateServerUninstallToken(Context context, String str) {
        new C5049bp(context).AFInAppEventType(str);
    }

    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Context context2 = context;
        String str6 = str3;
        String str7 = str4;
        String str8 = str5;
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak akVar = C5002ak.AFInAppEventType;
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str6;
        strArr[3] = str7;
        strArr[4] = str8;
        strArr[5] = map == null ? "" : map.toString();
        akVar.valueOf("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            AFLogger.AFInAppEventType(sb.toString());
        }
        if (str == null || str7 == null || str2 == null || str8 == null || str6 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventParameterName;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String devKey = AppsFlyerProperties.getInstance().getDevKey();
        if (context2 instanceof Activity) {
            ((Activity) context2).getIntent();
        }
        new Thread(new C4976ad(applicationContext, devKey, str, str2, str3, str4, str5, map)).start();
    }

    public final void waitForCustomerUserId(boolean z) {
        AFLogger.AFInAppEventParameterName("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    public static void AFInAppEventParameterName(Context context, String str) {
        SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
        edit.putBoolean(str, true);
        edit.apply();
    }

    private static boolean AFLogger$LogLevel(Context context) {
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !getLevel(context)) {
            return true;
        }
        return false;
    }

    private static float AFVersionDeclaration(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra(ResponseConstants.SCALE, -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return 1.0f;
        }
    }

    private boolean getLevel() {
        Map<String, Object> map = this.enableLocationCollection;
        return map != null && !map.isEmpty();
    }

    public static void valueOf(Context context, String str, String str2) {
        SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (this.stop) {
            return this;
        }
        this.stop = true;
        if (context != null) {
            if (this.AppsFlyer2dXConversionCallback == null) {
                this.AppsFlyer2dXConversionCallback = new C5021au(context);
            }
            C5021au auVar = this.AppsFlyer2dXConversionCallback;
            if (auVar.AFInAppEventType()) {
                auVar.AFInAppEventParameterName.edit().putLong("init_ts", System.currentTimeMillis()).apply();
            }
            this.setCustomerUserId = (Application) context.getApplicationContext();
            this.onInstallConversionFailureNative.AFInAppEventType = context.getApplicationContext();
            final C5067cg cgVar = new C5067cg(new Runnable() {
                public final void run() {
                    if (C5097l.AFInAppEventType == null) {
                        C5097l.AFInAppEventType = new C5097l();
                    }
                    C4986ag.AFInAppEventType(C5097l.AFInAppEventType.AFInAppEventType(), new Runnable() {
                        public final void run() {
                            try {
                                C5054bt btVar = new C5054bt();
                                Application valueOf2 = C4986ag.this.setCustomerUserId;
                                if (valueOf2 != null) {
                                    btVar.values = (Application) valueOf2.getApplicationContext();
                                }
                                C4986ag agVar = C4986ag.this;
                                if (agVar.AFKeystoreWrapper((C5089f) btVar, C4986ag.AFInAppEventParameterName((Context) agVar.setCustomerUserId))) {
                                    C4986ag.AFInAppEventParameterName(C4986ag.this, (C5089f) btVar);
                                }
                            } catch (Throwable th) {
                                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
                            }
                        }
                    }, 0, TimeUnit.MILLISECONDS);
                }
            });
            C49871 r4 = new Runnable() {
                public final void run() {
                    SharedPreferences AFInAppEventParameterName2 = C4986ag.AFInAppEventParameterName((Context) C4986ag.this.setCustomerUserId);
                    boolean z = false;
                    int AFInAppEventType = C4986ag.AFInAppEventType(AFInAppEventParameterName2, "appsFlyerCount", false);
                    boolean z2 = AFInAppEventParameterName2.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    if (cgVar.AFKeystoreWrapper == C5072cj.C5074e.NOT_STARTED) {
                        z = true;
                    }
                    if (AFInAppEventType != 1) {
                        return;
                    }
                    if (z || z2) {
                        C4986ag agVar = C4986ag.this;
                        C5054bt btVar = new C5054bt();
                        Application valueOf = C4986ag.this.setCustomerUserId;
                        if (valueOf != null) {
                            btVar.values = (Application) valueOf.getApplicationContext();
                        }
                        C4986ag.AFInAppEventParameterName(agVar, (C5089f) btVar);
                    }
                }
            };
            C5072cj[] cjVarArr = {cgVar, new C5077cl(r4), new C5075ck(r4)};
            this.init = cjVarArr;
            for (C5072cj AFInAppEventType2 : cjVarArr) {
                AFInAppEventType2.AFInAppEventType(this.setCustomerUserId);
            }
            this.setImeiData = values(context);
            C5035bc.AFKeystoreWrapper = this.setCustomerUserId;
            if (AFInAppEventType(AFInAppEventParameterName(context), "appsFlyerCount", false) == 0 && Build.VERSION.SDK_INT >= 29) {
                C5069ch chVar = new C5069ch(context);
                this.getOutOfStore = chVar;
                new Thread(chVar.values).start();
            }
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("context is null, Google Install Referrer will be not initialized");
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak akVar = C5002ak.AFInAppEventType;
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        akVar.valueOf("public_api_call", "init", strArr);
        AFLogger.values(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.4.3", AFInAppEventType}));
        AppsFlyerProperties.getInstance().setDevKey(str);
        C5004am.values(str);
        valueOf = appsFlyerConversionListener;
        return this;
    }

    public final void start(Context context, String str) {
        start(context, str, (AppsFlyerRequestListener) null);
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        C5095j.AFInAppEventParameterName().valueOf = deepLinkListener;
        C5009ao.onDeepLinkingNative = j;
    }

    public static C4986ag AFInAppEventType() {
        return onConversionDataFail;
    }

    private static boolean getLevel(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.AFKeystoreWrapper("WARNING:  Google Play Services is unavailable. ", (Throwable) e);
            return false;
        }
    }

    public final boolean AFKeystoreWrapper() {
        if (!AFInAppEventParameterName(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) || AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) != null) {
            return false;
        }
        return true;
    }

    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        String str2;
        Context context2 = context;
        final String str3 = str;
        final AppsFlyerRequestListener appsFlyerRequestListener2 = appsFlyerRequestListener;
        if (C4978ae.valueOf == null) {
            if (!this.stop) {
                AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str3 == null) {
                    if (appsFlyerRequestListener2 != null) {
                        appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, C5028ay.valueOf);
                        return;
                    }
                    return;
                }
            }
            this.onInstallConversionFailureNative.AFInAppEventType = context.getApplicationContext();
            if (this.AppsFlyer2dXConversionCallback == null) {
                this.AppsFlyer2dXConversionCallback = new C5021au(context2);
            }
            final C5021au auVar = this.AppsFlyer2dXConversionCallback;
            if (context2 instanceof Activity) {
                str2 = "activity";
            } else {
                str2 = context2 instanceof Application ? "application" : "other";
            }
            auVar.AFKeystoreWrapper.put("start_with", str2);
            this.setCustomerUserId = (Application) context.getApplicationContext();
            if (C5002ak.AFInAppEventType == null) {
                C5002ak.AFInAppEventType = new C5002ak();
            }
            C5002ak.AFInAppEventType.valueOf("public_api_call", "start", str3);
            String str4 = AFInAppEventType;
            AFLogger.AFInAppEventType(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.4.3", str4}));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str4);
            AFLogger.AFInAppEventType(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.setCustomerUserId.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerProperties.getInstance().setDevKey(str3);
                C5004am.values(str);
            } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getDevKey())) {
                AFLogger.AppsFlyer2dXConversionCallback("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener2 != null) {
                    appsFlyerRequestListener2.onError(RequestError.NO_DEV_KEY, C5028ay.valueOf);
                    return;
                }
                return;
            }
            Context baseContext = this.setCustomerUserId.getBaseContext();
            try {
                if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                    if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                        AFLogger.AFInAppEventParameterName("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    } else {
                        AFLogger.AFInAppEventParameterName("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    }
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
                sb2.append(e.toString());
                AFLogger.AFKeystoreWrapper(sb2.toString());
            }
            if (this.setOaidData) {
                Context applicationContext = this.setCustomerUserId.getApplicationContext();
                this.setAndroidIdData = new HashMap();
                final long currentTimeMillis = System.currentTimeMillis();
                C49924 r11 = new C5101o.C5103d() {
                    public final void valueOf(String str, String str2, String str3) {
                        if (str != null) {
                            AFLogger.AFInAppEventType("Facebook Deferred AppLink data received: ".concat(str));
                            C4986ag.this.setAndroidIdData.put(ResponseConstants.LINK, str);
                            if (str2 != null) {
                                C4986ag.this.setAndroidIdData.put("target_url", str2);
                            }
                            if (str3 != null) {
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("promo_code", str3);
                                hashMap.put("deeplink_context", hashMap2);
                                C4986ag.this.setAndroidIdData.put("extras", hashMap);
                            }
                        } else {
                            C4986ag.this.setAndroidIdData.put(ResponseConstants.LINK, "");
                        }
                        C4986ag.this.setAndroidIdData.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }

                    public final void valueOf(String str) {
                        C4986ag.this.setAndroidIdData.put("error", str);
                    }
                };
                Class<C13418j> cls = C13418j.class;
                try {
                    String str5 = C13418j.f29381a;
                    cls.getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{applicationContext});
                    Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData");
                    Class<?> cls3 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                    Method method = cls2.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls3});
                    Object newProxyInstance = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new InvocationHandler(cls2, r11) {
                        private /* synthetic */ C5103d AFInAppEventParameterName;
                        private /* synthetic */ Class AFInAppEventType;

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.o.2.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.o.2.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                    String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                    if (TextUtils.isEmpty(string)) {
                        r11.valueOf("Facebook app id not defined in resources");
                    } else {
                        method.invoke((Object) null, new Object[]{applicationContext, string, newProxyInstance});
                    }
                } catch (NoSuchMethodException e2) {
                    r11.valueOf(e2.toString());
                } catch (InvocationTargetException e3) {
                    r11.valueOf(e3.toString());
                } catch (ClassNotFoundException e4) {
                    r11.valueOf(e4.toString());
                } catch (IllegalAccessException e5) {
                    r11.valueOf(e5.toString());
                }
            }
            C4978ae.AFKeystoreWrapper(context2, new C4978ae.C4984c() {
                public final void AFInAppEventType(Context context) {
                    AFLogger.AFInAppEventType("onBecameBackground");
                    long unused = C4986ag.this.AppsFlyerInAppPurchaseValidatorListener = System.currentTimeMillis();
                    long values2 = C4986ag.this.AppsFlyerInAppPurchaseValidatorListener - C4986ag.this.AppsFlyerLib;
                    if (values2 > 0 && values2 < 1000) {
                        values2 = 1000;
                    }
                    C4986ag agVar = C4986ag.this;
                    if (agVar.AppsFlyer2dXConversionCallback == null) {
                        agVar.AppsFlyer2dXConversionCallback = new C5021au(context);
                    }
                    agVar.AppsFlyer2dXConversionCallback.AFInAppEventParameterName.edit().putLong("prev_session_dur", TimeUnit.MILLISECONDS.toSeconds(values2)).apply();
                    AFLogger.AFInAppEventType("callStatsBackground background call");
                    C4986ag.this.AFInAppEventParameterName((WeakReference<Context>) new WeakReference(context));
                    if (C5002ak.AFInAppEventType == null) {
                        C5002ak.AFInAppEventType = new C5002ak();
                    }
                    C5002ak akVar = C5002ak.AFInAppEventType;
                    if (akVar.AFLogger$LogLevel()) {
                        akVar.valueOf();
                        if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                            try {
                                akVar.values(context.getPackageName(), context.getPackageManager());
                                Map<String, Object> AFInAppEventParameterName2 = akVar.AFInAppEventParameterName();
                                C5040bh AFInAppEventType2 = C4986ag.AFInAppEventType().onInstallConversionFailureNative.AFInAppEventType();
                                StringBuilder sb = new StringBuilder();
                                sb.append(String.format(C5040bh.valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), C4986ag.AFInAppEventType().getHostName()}));
                                sb.append(AFInAppEventType2.AFInAppEventType.values.getPackageName());
                                C5107v vVar = new C5107v(sb.toString(), new JSONObject(AFInAppEventParameterName2).toString().getBytes(), "POST", Collections.emptyMap());
                                C5104u uVar = AFInAppEventType2.AFKeystoreWrapper;
                                C5045bm bmVar = new C5045bm(vVar, uVar.AFInAppEventParameterName, uVar.valueOf, new C5043bk());
                                if (!bmVar.values.getAndSet(true)) {
                                    bmVar.valueOf.submit(new Runnable((C5044bl) null) {
                                        private /* synthetic */ C5044bl values;

                                        public final void run(
/*
Method generation error in method: com.appsflyer.internal.bm.3.run():void, dex: classes.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.bm.3.run():void, class status: UNLOADED
                                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                        
*/
                                    });
                                } else {
                                    throw new IllegalStateException("Http call is already executed");
                                }
                            } catch (Throwable th) {
                                AFLogger.values(th);
                            }
                        }
                        akVar.values();
                    } else {
                        AFLogger.valueOf("RD status is OFF");
                    }
                    if (C5097l.AFInAppEventType == null) {
                        C5097l.AFInAppEventType = new C5097l();
                    }
                    C5097l lVar = C5097l.AFInAppEventType;
                    try {
                        C5097l.AFInAppEventType(lVar.values);
                        Executor executor = lVar.AFInAppEventParameterName;
                        if (executor instanceof ThreadPoolExecutor) {
                            C5097l.AFInAppEventType((ThreadPoolExecutor) executor);
                        }
                    } catch (Throwable th2) {
                        AFLogger.AFKeystoreWrapper("failed to stop Executors", th2);
                    }
                    C4965ab AFKeystoreWrapper2 = C4965ab.AFKeystoreWrapper(context);
                    AFKeystoreWrapper2.AFInAppEventParameterName.post(AFKeystoreWrapper2.getLevel);
                }

                public final void valueOf(Activity activity) {
                    long unused = C4986ag.this.AppsFlyerLib = System.currentTimeMillis();
                    C5021au auVar = auVar;
                    if (auVar.AFInAppEventType()) {
                        auVar.AFInAppEventParameterName.edit().putLong("fg_ts", System.currentTimeMillis()).apply();
                    }
                    int AFInAppEventType2 = C4986ag.AFInAppEventType(C4986ag.AFInAppEventParameterName((Context) activity), "appsFlyerCount", false);
                    if (AFInAppEventType2 == 0) {
                        C5021au auVar2 = auVar;
                        auVar2.AFKeystoreWrapper.put("init_to_fg", Long.valueOf(C4986ag.this.AppsFlyerLib - auVar.AFInAppEventParameterName.getLong("init_ts", 0)));
                    }
                    AFLogger.AFInAppEventType("onBecameForeground");
                    if (AFInAppEventType2 < 2) {
                        C4965ab AFKeystoreWrapper2 = C4965ab.AFKeystoreWrapper((Context) activity);
                        AFKeystoreWrapper2.AFInAppEventParameterName.post(AFKeystoreWrapper2.getLevel);
                        AFKeystoreWrapper2.AFInAppEventParameterName.post(AFKeystoreWrapper2.AFKeystoreWrapper);
                    }
                    C5062cb cbVar = new C5062cb();
                    C5095j.AFInAppEventParameterName().AFKeystoreWrapper(cbVar.AFKeystoreWrapper(), auVar, activity.getIntent(), activity.getApplication());
                    C4986ag agVar = C4986ag.this;
                    cbVar.values = (Application) activity.getApplicationContext();
                    cbVar.init = str3;
                    cbVar.AFKeystoreWrapper = appsFlyerRequestListener2;
                    agVar.AFKeystoreWrapper((C5089f) cbVar, activity);
                }
            }, this.setPhoneNumber);
        }
    }

    private static void values(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public final void AFInAppEventType(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.AppsFlyer2dXConversionCallback("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.AFKeystoreWrapper("Error parsing JSON for preinstall", (Throwable) e);
            }
        }
        AFLogger.AFInAppEventType("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.AFInAppEventType("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
            edit.putString("referrer", stringExtra2);
            edit.apply();
            AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            instance.set("AF_REFERRER", stringExtra2);
            instance.AFInAppEventType = stringExtra2;
            if (AppsFlyerProperties.getInstance().AFInAppEventParameterName()) {
                AFLogger.AFInAppEventType("onReceive: isLaunchCalled");
                C5058bx bxVar = new C5058bx();
                if (context != null) {
                    bxVar.values = (Application) context.getApplicationContext();
                }
                bxVar.AFVersionDeclaration = stringExtra2;
                if (stringExtra2.length() > 5 && AFKeystoreWrapper((C5089f) bxVar, AFInAppEventParameterName(context))) {
                    if (C5097l.AFInAppEventType == null) {
                        C5097l.AFInAppEventType = new C5097l();
                    }
                    AFInAppEventType(C5097l.AFInAppEventType.AFInAppEventType(), new C4998e(this, bxVar, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private static void AFKeystoreWrapper(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.internal.C4964aa.valueOf()
            if (r0 == 0) goto L_0x000e
            r0 = 23
            java.lang.String r1 = "OPPO device found"
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r1)
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00bf
            java.lang.String r0 = "keyPropDisableAFKeystore"
            r2 = 1
            boolean r0 = AFInAppEventParameterName((java.lang.String) r0, (boolean) r2)
            if (r0 != 0) goto L_0x00bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "OS SDK is="
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = "; use KeyStore"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0)
            com.appsflyer.AFKeystoreWrapper r0 = new com.appsflyer.AFKeystoreWrapper
            r0.<init>(r4)
            boolean r1 = r0.AFKeystoreWrapper()
            if (r1 != 0) goto L_0x0054
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.C5003al.AFInAppEventParameterName(r1)
            r0.valueOf = r4
            r4 = 0
            r0.values = r4
            java.lang.String r4 = r0.valueOf()
            r0.AFInAppEventType(r4)
            goto L_0x009d
        L_0x0054:
            java.lang.String r4 = r0.valueOf()
            java.lang.Object r1 = r0.AFInAppEventType
            monitor-enter(r1)
            int r3 = r0.values     // Catch:{ all -> 0x00bc }
            int r3 = r3 + r2
            r0.values = r3     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x00bc }
            com.appsflyer.AFLogger.AFInAppEventType(r2)     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r0.AFInAppEventType     // Catch:{ KeyStoreException -> 0x007a }
            monitor-enter(r2)     // Catch:{ KeyStoreException -> 0x007a }
            java.security.KeyStore r3 = r0.AFInAppEventParameterName     // Catch:{ all -> 0x0077 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0095
        L_0x0077:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ KeyStoreException -> 0x007a }
            throw r4     // Catch:{ KeyStoreException -> 0x007a }
        L_0x007a:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "Exception "
            r2.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = " occurred"
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bc }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r2, (java.lang.Throwable) r4)     // Catch:{ all -> 0x00bc }
        L_0x0095:
            monitor-exit(r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r0.valueOf()
            r0.AFInAppEventType(r4)
        L_0x009d:
            java.lang.String r4 = "KSAppsFlyerId"
            java.lang.String r1 = r0.AFInAppEventParameterName()
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2.set((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r4 = "KSAppsFlyerRICounter"
            int r0 = r0.AFInAppEventType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1.set((java.lang.String) r4, (java.lang.String) r0)
            return
        L_0x00bc:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x00bf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFKeystoreWrapper(android.content.Context):void");
    }

    private boolean valueOf() {
        if (this.onAttributionFailure > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onAttributionFailure;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            long j = this.onAttributionFailure;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.onResponse;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.AppsFlyerConversionListener && !isStopped()) {
                AFLogger.AFInAppEventType(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.AppsFlyerConversionListener)}));
                return true;
            } else if (!isStopped()) {
                AFLogger.AFInAppEventType(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isStopped()) {
            AFLogger.AFInAppEventType("Sending first launch for this session!");
        }
        return false;
    }

    public final void AFInAppEventParameterName(Context context, String str, long j) {
        SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    private static boolean AFInAppEventParameterName(String str, boolean z) {
        return AppsFlyerProperties.getInstance().getBoolean(str, z);
    }

    public final void AFInAppEventParameterName(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.AFInAppEventType("app went to background");
            SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(AFInAppEventParameterName2);
            long j = this.AppsFlyerInAppPurchaseValidatorListener - this.AppsFlyerLib;
            HashMap hashMap = new HashMap();
            String devKey = AppsFlyerProperties.getInstance().getDevKey();
            if (devKey == null) {
                AFLogger.AppsFlyer2dXConversionCallback("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
            C5030b.C5031e.C5032a AFKeystoreWrapper2 = C5115z.AFKeystoreWrapper(weakReference.get().getContentResolver());
            if (AFKeystoreWrapper2 != null) {
                hashMap.put("amazon_aid", AFKeystoreWrapper2.AFKeystoreWrapper);
                hashMap.put("amazon_aid_limit", String.valueOf(AFKeystoreWrapper2.valueOf));
            }
            String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string2 != null) {
                hashMap.put("advertiserId", string2);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", devKey);
            hashMap.put("uid", C5003al.AFInAppEventParameterName(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(AFInAppEventType(AFInAppEventParameterName2, "appsFlyerCount", false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, AFInAppEventType(weakReference.get()));
            if (string == null) {
                string = "";
            }
            hashMap.put("originalAppsflyerId", string);
            if (this.onPause) {
                try {
                    AFLogger.valueOf("Running callStats task");
                    C5064cd cdVar = new C5064cd();
                    cdVar.onAppOpenAttribution = isStopped();
                    new Thread(new C4985af((C5056bv) cdVar.AFInAppEventType(hashMap).AFKeystoreWrapper(String.format(onAttributionFailureNative, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), onConversionDataFail.getHostName()})))).start();
                } catch (Throwable th) {
                    AFLogger.AFKeystoreWrapper("Could not send callStats request", th);
                }
            } else {
                AFLogger.valueOf("Stats call is disabled, ignore ...");
            }
        }
    }

    public final void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, (AppsFlyerRequestListener) null);
    }

    public final void setUserEmails(String... strArr) {
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    private boolean values(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.enableLocationCollection = new ConcurrentHashMap();
            C49913 r4 = new C5104u.C5106e() {
                public final void AFInAppEventParameterName(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    C4986ag.this.enableLocationCollection.put("error", message);
                    AFLogger.AFInAppEventType(str, exc);
                }

                public final void values(String str, String str2) {
                    C4986ag.this.enableLocationCollection.put("signedData", str);
                    C4986ag.this.enableLocationCollection.put("signature", str2);
                    C4986ag.this.enableLocationCollection.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.AFInAppEventType("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                C5104u.C51053 r7 = new InvocationHandler() {
                    public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.u.3.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.u.3.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7)});
            } catch (ClassNotFoundException e) {
                r4.AFInAppEventParameterName(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r4.AFInAppEventParameterName(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r4.AFInAppEventParameterName(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r4.AFInAppEventParameterName(e4.getClass().getSimpleName(), e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean valueOf(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
    }

    public static boolean valueOf(Context context) {
        return !AFInAppEventParameterName(context).contains("appsFlyerCount");
    }

    public static Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    private static boolean init(Context context) {
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                    NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                    if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                AFLogger.AFKeystoreWrapper("Failed collecting ivc data", (Throwable) e);
            }
        }
        return false;
    }

    public final void AFKeystoreWrapper(Context context, Map<String, Object> map, Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            String AFInAppEventParameterName2 = AFInAppEventParameterName(uri.toString());
            C5095j AFInAppEventParameterName3 = C5095j.AFInAppEventParameterName();
            String str = AFInAppEventParameterName3.init;
            if (!(str == null || AFInAppEventParameterName3.AFVersionDeclaration == null || !AFInAppEventParameterName2.contains(str))) {
                Uri.Builder buildUpon = Uri.parse(AFInAppEventParameterName2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry next : AFInAppEventParameterName3.AFVersionDeclaration.entrySet()) {
                    buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                    buildUpon2.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                }
                AFInAppEventParameterName2 = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", AFInAppEventParameterName2);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(ResponseConstants.LINK, uri.toString());
        C5017as asVar = new C5017as(uri, this, context);
        if (asVar.valueOf) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        C4964aa.values(context, hashMap, uri);
        if (asVar.AFInAppEventParameterName()) {
            asVar.AFInAppEventType = new C5017as.C5018a() {
                public final void valueOf(String str) {
                    C5015aq.valueOf(str, DeepLinkResult.Error.NETWORK);
                }

                public final void values(Map<String, String> map) {
                    for (String next : map.keySet()) {
                        hashMap.put(next, map.get(next));
                    }
                    C5015aq.AFInAppEventType(hashMap);
                }
            };
            if (C5097l.AFInAppEventType == null) {
                C5097l.AFInAppEventType = new C5097l();
            }
            C5097l.AFInAppEventType.valueOf().execute(asVar);
            return;
        }
        C5015aq.AFInAppEventType(hashMap);
    }

    private boolean values() {
        Map<String, Object> map = this.setAndroidIdData;
        return map != null && !map.isEmpty();
    }

    public final void AFInAppEventType(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.valueOf("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = AFInAppEventParameterName(context).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                values(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject4 = jSONObject.toString();
            SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
            edit.putString("extraReferrers", jSONObject4);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
        }
    }

    private static File values(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return null;
        }
    }

    public final String values(Context context, String str) {
        SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        if (AFInAppEventParameterName2.contains("CACHED_CHANNEL")) {
            return AFInAppEventParameterName2.getString("CACHED_CHANNEL", (String) null);
        }
        SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    private String values(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = AFInAppEventParameterName(context).getString("appsFlyerFirstInstall", (String) null);
        if (string == null) {
            if (valueOf(context)) {
                AFLogger.valueOf("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            SharedPreferences.Editor edit = AFInAppEventParameterName(context).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.AFInAppEventType("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    private void AFInAppEventParameterName(Context context, String str, Map<String, Object> map) {
        C5061ca caVar = new C5061ca();
        if (context != null) {
            caVar.values = (Application) context.getApplicationContext();
        }
        caVar.AFLogger$LogLevel = str;
        caVar.AFInAppEventType = map;
        AFKeystoreWrapper((C5089f) caVar, context instanceof Activity ? (Activity) context : null);
    }

    private static String AFInAppEventType(Activity activity) {
        Intent intent;
        String str = null;
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            try {
                Bundle extras = intent.getExtras();
                if (!(extras == null || (str = extras.getString("af")) == null)) {
                    AFLogger.AFInAppEventType("Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:315:0x067b, code lost:
        if (r3 != null) goto L_0x067d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0229 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0279 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x027c A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0293 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0357 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x036a A[Catch:{ Exception -> 0x0370 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ab A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03b1 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03e6 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03ff A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x048e A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04a3 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04a4 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04b8 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04c5 A[SYNTHETIC, Splitter:B:226:0x04c5] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e1 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04f0 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04fd A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0503 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x051a A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0532 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0549 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0577 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0593 A[SYNTHETIC, Splitter:B:261:0x0593] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05b2 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05c3 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x05ce A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x062e A[SYNTHETIC, Splitter:B:301:0x062e] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0636 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0655 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x065d A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0682 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0698 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06b4 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06ed A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06f5 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x070b A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0716 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0744 A[SYNTHETIC, Splitter:B:360:0x0744] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0896 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x089f A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x08d6 A[SYNTHETIC, Splitter:B:440:0x08d6] */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x0922 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0947 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x097b A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x097d A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x098d A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0a07 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0a08 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0a43 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0bac A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0c63 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022d A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0238 A[SYNTHETIC, Splitter:B:86:0x0238] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244 A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x026a A[Catch:{ Exception -> 0x00cd, all -> 0x0c6f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> values(com.appsflyer.internal.C5089f r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            java.lang.String r3 = "sdkExtension"
            java.lang.String r4 = "AppsFlyerTimePassedSincePrevLaunch"
            java.lang.String r5 = "yyyy-MM-dd_HHmmssZ"
            java.lang.String r6 = "use cached IMEI: "
            java.lang.String r7 = "uid"
            java.lang.String r8 = "appid"
            java.lang.String r9 = "INSTALL_STORE"
            java.lang.String r10 = "gcd"
            java.lang.String r11 = "prev_event_name"
            java.lang.String r12 = "preInstallName"
            android.app.Application r13 = r2.values
            java.lang.String r14 = r2.init
            java.lang.String r15 = r2.AFLogger$LogLevel
            r16 = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r17 = r7
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.AFInAppEventType
            if (r7 != 0) goto L_0x002d
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
        L_0x002d:
            r5.<init>(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = r2.AFVersionDeclaration
            r18 = r6
            android.content.SharedPreferences r6 = AFInAppEventParameterName((android.content.Context) r13)
            r19 = r8
            boolean r8 = r34.AFInAppEventType()
            r20 = r5
            java.lang.String r5 = r2.valueOf
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.AFInAppEventParameterName
            com.appsflyer.internal.C5115z.AFKeystoreWrapper(r13, r2)
            java.lang.Boolean r21 = com.appsflyer.internal.C5115z.values
            r22 = r5
            if (r21 == 0) goto L_0x0071
            boolean r23 = r21.booleanValue()
            if (r23 != 0) goto L_0x0071
            java.util.Map r5 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r21 = r21.booleanValue()
            r23 = 1
            r21 = r21 ^ 1
            r23 = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r21)
            r21 = r12
            java.lang.String r12 = "ad_ids_disabled"
            r5.put(r12, r14)
            goto L_0x0075
        L_0x0071:
            r21 = r12
            r23 = r14
        L_0x0075:
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            r12 = r15
            long r14 = r5.getTime()
            java.lang.String r5 = java.lang.Long.toString(r14)
            r24 = r9
            java.lang.String r9 = "af_timestamp"
            r2.put(r9, r5)
            java.lang.String r5 = com.appsflyer.internal.C5030b.values((android.content.Context) r13, (long) r14)
            if (r5 == 0) goto L_0x0095
            java.lang.String r14 = "cksm_v1"
            r2.put(r14, r5)
        L_0x0095:
            boolean r5 = r33.isStopped()     // Catch:{ all -> 0x0c6f }
            if (r5 != 0) goto L_0x00b3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = "******* sendTrackingWithEvent: "
            r5.<init>(r14)     // Catch:{ all -> 0x0c6f }
            if (r8 == 0) goto L_0x00a7
            java.lang.String r14 = "Launch"
            goto L_0x00a8
        L_0x00a7:
            r14 = r12
        L_0x00a8:
            r5.append(r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFInAppEventType(r5)     // Catch:{ all -> 0x0c6f }
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r5 = "Reporting has been stopped"
            com.appsflyer.AFLogger.AFInAppEventType(r5)     // Catch:{ all -> 0x0c6f }
        L_0x00b8:
            com.appsflyer.internal.C4999ah.AFInAppEventParameterName()     // Catch:{ all -> 0x0c6f }
            java.io.File r5 = com.appsflyer.internal.C4999ah.AFInAppEventType((android.content.Context) r13)     // Catch:{ Exception -> 0x00cd }
            boolean r5 = r5.exists()     // Catch:{ Exception -> 0x00cd }
            if (r5 != 0) goto L_0x00d4
            java.io.File r5 = com.appsflyer.internal.C4999ah.AFInAppEventType((android.content.Context) r13)     // Catch:{ Exception -> 0x00cd }
            r5.mkdir()     // Catch:{ Exception -> 0x00cd }
            goto L_0x00d4
        L_0x00cd:
            r0 = move-exception
            r5 = r0
            java.lang.String r14 = "Could not create cache directory"
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r14, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0c6f }
        L_0x00d4:
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r14 = r13.getPackageName()     // Catch:{ Exception -> 0x0110 }
            r15 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r14, r15)     // Catch:{ Exception -> 0x0110 }
            java.lang.String[] r5 = r5.requestedPermissions     // Catch:{ Exception -> 0x0110 }
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ Exception -> 0x0110 }
            java.lang.String r14 = "android.permission.INTERNET"
            boolean r14 = r5.contains(r14)     // Catch:{ Exception -> 0x0110 }
            if (r14 != 0) goto L_0x00f5
            java.lang.String r14 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r14)     // Catch:{ Exception -> 0x0110 }
        L_0x00f5:
            java.lang.String r14 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r14 = r5.contains(r14)     // Catch:{ Exception -> 0x0110 }
            if (r14 != 0) goto L_0x0102
            java.lang.String r14 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r14)     // Catch:{ Exception -> 0x0110 }
        L_0x0102:
            java.lang.String r14 = "android.permission.ACCESS_WIFI_STATE"
            boolean r5 = r5.contains(r14)     // Catch:{ Exception -> 0x0110 }
            if (r5 != 0) goto L_0x0117
            java.lang.String r5 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r5)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0117
        L_0x0110:
            r0 = move-exception
            r5 = r0
            java.lang.String r14 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r14, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0c6f }
        L_0x0117:
            java.lang.String r5 = "af_events_api"
            java.lang.String r14 = "1"
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "brand"
            java.lang.String r14 = android.os.Build.BRAND     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "device"
            java.lang.String r14 = android.os.Build.DEVICE     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "product"
            java.lang.String r14 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "sdk"
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = java.lang.Integer.toString(r14)     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "model"
            java.lang.String r14 = android.os.Build.MODEL     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "deviceType"
            java.lang.String r14 = android.os.Build.TYPE     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r14)     // Catch:{ all -> 0x0c6f }
            AFInAppEventParameterName((android.content.Context) r13, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.internal.au r14 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0c6f }
            if (r14 != 0) goto L_0x015e
            com.appsflyer.internal.au r14 = new com.appsflyer.internal.au     // Catch:{ all -> 0x0c6f }
            r14.<init>(r13)     // Catch:{ all -> 0x0c6f }
            r1.AppsFlyer2dXConversionCallback = r14     // Catch:{ all -> 0x0c6f }
        L_0x015e:
            com.appsflyer.internal.au r14 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0c6f }
            java.lang.String r15 = "phone"
            r25 = r11
            r26 = r12
            if (r8 == 0) goto L_0x02c3
            boolean r12 = valueOf((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            if (r12 == 0) goto L_0x01a9
            boolean r12 = r5.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0c6f }
            if (r12 != 0) goto L_0x0181
            float r12 = AFVersionDeclaration((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r11 = "batteryLevel"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0c6f }
            r2.put(r11, r12)     // Catch:{ all -> 0x0c6f }
        L_0x0181:
            AFKeystoreWrapper((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.lang.Class<android.app.UiModeManager> r11 = android.app.UiModeManager.class
            java.lang.Object r11 = r13.getSystemService(r11)     // Catch:{ all -> 0x0c6f }
            android.app.UiModeManager r11 = (android.app.UiModeManager) r11     // Catch:{ all -> 0x0c6f }
            if (r11 == 0) goto L_0x019c
            int r11 = r11.getCurrentModeType()     // Catch:{ all -> 0x0c6f }
            r12 = 4
            if (r11 != r12) goto L_0x019c
            java.lang.String r11 = "tv"
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0c6f }
            r2.put(r11, r12)     // Catch:{ all -> 0x0c6f }
        L_0x019c:
            boolean r11 = com.appsflyer.internal.C5053bs.AFInAppEventType(r13)     // Catch:{ all -> 0x0c6f }
            if (r11 == 0) goto L_0x01a9
            java.lang.String r11 = "inst_app"
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0c6f }
            r2.put(r11, r12)     // Catch:{ all -> 0x0c6f }
        L_0x01a9:
            java.lang.String r11 = "timepassedsincelastlaunch"
            android.content.SharedPreferences r12 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            r27 = r8
            r28 = r9
            r8 = 0
            long r29 = r12.getLong(r4, r8)     // Catch:{ all -> 0x0c6f }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c6f }
            r1.AFInAppEventParameterName((android.content.Context) r13, (java.lang.String) r4, (long) r8)     // Catch:{ all -> 0x0c6f }
            r31 = 0
            int r4 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cd
            long r8 = r8 - r29
            r29 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r29
            goto L_0x01cf
        L_0x01cd:
            r8 = -1
        L_0x01cf:
            java.lang.String r4 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x0c6f }
            r2.put(r11, r4)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "oneLinkSlug"
            java.lang.String r4 = r4.getString(r8)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "onelinkVersion"
            java.lang.String r8 = r8.getString(r9)     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x01f1
            java.lang.String r9 = "onelink_id"
            r2.put(r9, r4)     // Catch:{ all -> 0x0c6f }
        L_0x01f1:
            if (r8 == 0) goto L_0x01f8
            java.lang.String r4 = "onelink_ver"
            r2.put(r4, r8)     // Catch:{ all -> 0x0c6f }
        L_0x01f8:
            com.appsflyer.internal.au r4 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences r4 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            r8 = 0
            java.lang.String r4 = r4.getString(r10, r8)     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x0229
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0229 }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x0229 }
            java.util.Map r4 = com.appsflyer.internal.C5100n.AFInAppEventParameterName((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x0229 }
            boolean r8 = r4.isEmpty()     // Catch:{ JSONException -> 0x0229 }
            if (r8 != 0) goto L_0x0229
            java.util.Map r8 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ JSONException -> 0x0229 }
            r8.put(r10, r4)     // Catch:{ JSONException -> 0x0229 }
            com.appsflyer.internal.au r4 = r1.AppsFlyer2dXConversionCallback     // Catch:{ JSONException -> 0x0229 }
            android.content.SharedPreferences r4 = r4.AFInAppEventParameterName     // Catch:{ JSONException -> 0x0229 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ JSONException -> 0x0229 }
            r8 = 0
            android.content.SharedPreferences$Editor r4 = r4.putString(r10, r8)     // Catch:{ JSONException -> 0x0229 }
            r4.apply()     // Catch:{ JSONException -> 0x0229 }
        L_0x0229:
            java.lang.String r4 = r1.setOutOfStore     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x0230
            r2.put(r15, r4)     // Catch:{ all -> 0x0c6f }
        L_0x0230:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "referrer"
            if (r4 != 0) goto L_0x023b
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x023b:
            java.lang.String r4 = "extraReferrers"
            r7 = 0
            java.lang.String r4 = r6.getString(r4, r7)     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x0249
            java.lang.String r7 = "extraReferrers"
            r2.put(r7, r4)     // Catch:{ all -> 0x0c6f }
        L_0x0249:
            java.lang.String r4 = r5.getReferrer(r13)     // Catch:{ all -> 0x0c6f }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x025c
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x025c
            r2.put(r8, r4)     // Catch:{ all -> 0x0c6f }
        L_0x025c:
            java.lang.String r4 = "prev_session_dur"
            android.content.SharedPreferences r7 = r14.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            r8 = 0
            long r10 = r7.getLong(r4, r8)     // Catch:{ all -> 0x0c6f }
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0273
            java.lang.String r4 = "prev_session_dur"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0c6f }
            r2.put(r4, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0273:
            java.lang.String r4 = "exception_number"
            android.app.Application r7 = com.appsflyer.internal.C5035bc.AFKeystoreWrapper     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x027c
            r11 = -1
            goto L_0x0288
        L_0x027c:
            android.content.SharedPreferences r7 = AFInAppEventParameterName((android.content.Context) r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "exception_number"
            r9 = 0
            long r11 = r7.getLong(r8, r9)     // Catch:{ all -> 0x0c6f }
        L_0x0288:
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0c6f }
            r2.put(r4, r7)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.internal.bb r4 = r1.waitForCustomerUserId     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x02bc
            java.util.Map<java.lang.String, java.lang.Object> r7 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x02a2
            java.lang.String r7 = "partner_data"
            java.util.Map<java.lang.String, java.lang.Object> r8 = r4.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c6f }
        L_0x02a2:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r4.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x02bc
            java.util.Map r7 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "partner_data"
            java.util.Map<java.lang.String, java.lang.Object> r9 = r4.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            r7.put(r8, r9)     // Catch:{ all -> 0x0c6f }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r7.<init>()     // Catch:{ all -> 0x0c6f }
            r4.AFInAppEventType = r7     // Catch:{ all -> 0x0c6f }
        L_0x02bc:
            r12 = r14
            r25 = r15
            r4 = r26
            goto L_0x031f
        L_0x02c3:
            r27 = r8
            r28 = r9
            android.content.SharedPreferences r4 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences$Editor r7 = r4.edit()     // Catch:{ all -> 0x0c6f }
            r8 = r25
            r9 = 0
            java.lang.String r10 = r4.getString(r8, r9)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r9 = "prev_event_timestamp"
            if (r10 == 0) goto L_0x02fe
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x02f6 }
            r11.<init>()     // Catch:{ Exception -> 0x02f6 }
            r12 = r14
            r25 = r15
            r14 = -1
            long r14 = r4.getLong(r9, r14)     // Catch:{ Exception -> 0x02f4 }
            r11.put(r9, r14)     // Catch:{ Exception -> 0x02f4 }
            r11.put(r8, r10)     // Catch:{ Exception -> 0x02f4 }
            java.lang.String r4 = "prev_event"
            r2.put(r4, r11)     // Catch:{ Exception -> 0x02f4 }
            goto L_0x0301
        L_0x02f4:
            r0 = move-exception
            goto L_0x02fa
        L_0x02f6:
            r0 = move-exception
            r12 = r14
            r25 = r15
        L_0x02fa:
            r7 = r0
            r4 = r26
            goto L_0x031a
        L_0x02fe:
            r12 = r14
            r25 = r15
        L_0x0301:
            r4 = r26
            r7.putString(r8, r4)     // Catch:{ Exception -> 0x0311 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0311 }
            r7.putLong(r9, r10)     // Catch:{ Exception -> 0x0311 }
            r7.apply()     // Catch:{ Exception -> 0x0311 }
            goto L_0x031f
        L_0x0311:
            r0 = move-exception
            goto L_0x0319
        L_0x0313:
            r0 = move-exception
            r12 = r14
            r25 = r15
            r4 = r26
        L_0x0319:
            r7 = r0
        L_0x031a:
            java.lang.String r8 = "Error while processing previous event."
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0c6f }
        L_0x031f:
            java.lang.String r7 = "KSAppsFlyerId"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "KSAppsFlyerRICounter"
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = r9.getString(r8)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x034b
            if (r8 == 0) goto L_0x034b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0c6f }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0c6f }
            if (r9 <= 0) goto L_0x034b
            java.lang.String r9 = "reinstallCounter"
            r2.put(r9, r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "originalAppsflyerId"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x034b:
            java.lang.String r7 = "additionalCustomData"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x035c
            java.lang.String r8 = "customData"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x035c:
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ Exception -> 0x0370 }
            java.lang.String r8 = r13.getPackageName()     // Catch:{ Exception -> 0x0370 }
            java.lang.String r7 = r7.getInstallerPackageName(r8)     // Catch:{ Exception -> 0x0370 }
            if (r7 == 0) goto L_0x0377
            java.lang.String r8 = "installer_package"
            r2.put(r8, r7)     // Catch:{ Exception -> 0x0370 }
            goto L_0x0377
        L_0x0370:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0c6f }
        L_0x0377:
            java.lang.String r7 = r5.getString(r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0386
            int r8 = r7.length()     // Catch:{ all -> 0x0c6f }
            if (r8 <= 0) goto L_0x0386
            r2.put(r3, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0386:
            java.lang.String r3 = r1.AFInAppEventType((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r1.values((android.content.Context) r13, (java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0396
            boolean r8 = r7.equals(r3)     // Catch:{ all -> 0x0c6f }
            if (r8 == 0) goto L_0x039a
        L_0x0396:
            if (r7 != 0) goto L_0x039f
            if (r3 == 0) goto L_0x039f
        L_0x039a:
            java.lang.String r7 = "af_latestchannel"
            r2.put(r7, r3)     // Catch:{ all -> 0x0c6f }
        L_0x039f:
            android.content.SharedPreferences r3 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            r7 = r24
            boolean r8 = r3.contains(r7)     // Catch:{ all -> 0x0c6f }
            if (r8 == 0) goto L_0x03b1
            r8 = 0
            java.lang.String r3 = r3.getString(r7, r8)     // Catch:{ all -> 0x0c6f }
            goto L_0x03e4
        L_0x03b1:
            boolean r3 = valueOf((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x03d5
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "api_store_value"
            java.lang.String r3 = r3.getString(r8)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x03c4
            goto L_0x03d6
        L_0x03c4:
            java.lang.String r3 = "AF_STORE"
            if (r13 == 0) goto L_0x03d5
            android.content.pm.PackageManager r8 = r13.getPackageManager()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = AFInAppEventParameterName((java.lang.String) r3, (android.content.pm.PackageManager) r8, (java.lang.String) r9)     // Catch:{ all -> 0x0c6f }
            goto L_0x03d6
        L_0x03d5:
            r3 = 0
        L_0x03d6:
            android.content.SharedPreferences r8 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences$Editor r8 = r8.edit()     // Catch:{ all -> 0x0c6f }
            r8.putString(r7, r3)     // Catch:{ all -> 0x0c6f }
            r8.apply()     // Catch:{ all -> 0x0c6f }
        L_0x03e4:
            if (r3 == 0) goto L_0x03ef
            java.lang.String r7 = "af_installstore"
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r3)     // Catch:{ all -> 0x0c6f }
        L_0x03ef:
            android.content.SharedPreferences r3 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            r8 = r21
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x048c
            boolean r9 = r3.contains(r8)     // Catch:{ all -> 0x0c6f }
            if (r9 == 0) goto L_0x040d
            r7 = 0
            java.lang.String r3 = r3.getString(r8, r7)     // Catch:{ all -> 0x0c6f }
            r7 = r3
            goto L_0x0483
        L_0x040d:
            boolean r3 = valueOf((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0473
            java.lang.String r3 = "ro.appsflyer.preinstall.path"
            java.lang.String r3 = AFKeystoreWrapper((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
            java.io.File r3 = values((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
            boolean r7 = AFInAppEventType((java.io.File) r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0435
            java.lang.String r3 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = AFInAppEventParameterName((java.lang.String) r3, (android.content.pm.PackageManager) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0c6f }
            java.io.File r3 = values((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
        L_0x0435:
            boolean r7 = AFInAppEventType((java.io.File) r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0441
            java.lang.String r3 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r3 = values((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
        L_0x0441:
            boolean r7 = AFInAppEventType((java.io.File) r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x044d
            java.lang.String r3 = "/etc/pre_install.appsflyer"
            java.io.File r3 = values((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
        L_0x044d:
            boolean r7 = AFInAppEventType((java.io.File) r3)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0455
            r3 = 0
            goto L_0x045d
        L_0x0455:
            java.lang.String r7 = r13.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = AFInAppEventType((java.io.File) r3, (java.lang.String) r7)     // Catch:{ all -> 0x0c6f }
        L_0x045d:
            if (r3 == 0) goto L_0x0460
            goto L_0x0472
        L_0x0460:
            java.lang.String r3 = "AF_PRE_INSTALL_NAME"
            if (r13 != 0) goto L_0x0466
            r3 = 0
            goto L_0x0472
        L_0x0466:
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = AFInAppEventParameterName((java.lang.String) r3, (android.content.pm.PackageManager) r7, (java.lang.String) r9)     // Catch:{ all -> 0x0c6f }
        L_0x0472:
            r7 = r3
        L_0x0473:
            if (r7 == 0) goto L_0x0483
            android.content.SharedPreferences r3 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0c6f }
            r3.putString(r8, r7)     // Catch:{ all -> 0x0c6f }
            r3.apply()     // Catch:{ all -> 0x0c6f }
        L_0x0483:
            if (r7 == 0) goto L_0x048c
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            r3.set((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x0c6f }
        L_0x048c:
            if (r7 == 0) goto L_0x0497
            java.lang.String r3 = "af_preinstall_name"
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0497:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "api_store_value"
            java.lang.String r3 = r3.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x04a4
            goto L_0x04b6
        L_0x04a4:
            java.lang.String r3 = "AF_STORE"
            if (r13 != 0) goto L_0x04aa
            r3 = 0
            goto L_0x04b6
        L_0x04aa:
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = r13.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = AFInAppEventParameterName((java.lang.String) r3, (android.content.pm.PackageManager) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0c6f }
        L_0x04b6:
            if (r3 == 0) goto L_0x04c1
            java.lang.String r7 = "af_currentstore"
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r3)     // Catch:{ all -> 0x0c6f }
        L_0x04c1:
            java.lang.String r3 = "appsflyerKey"
            if (r23 == 0) goto L_0x04d1
            int r7 = r23.length()     // Catch:{ all -> 0x0c6f }
            if (r7 <= 0) goto L_0x04d1
            r7 = r23
            r2.put(r3, r7)     // Catch:{ all -> 0x0c6f }
            goto L_0x04e4
        L_0x04d1:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r7.getDevKey()     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0c63
            int r8 = r7.length()     // Catch:{ all -> 0x0c6f }
            if (r8 <= 0) goto L_0x0c63
            r2.put(r3, r7)     // Catch:{ all -> 0x0c6f }
        L_0x04e4:
            java.lang.String r7 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x04f5
            java.lang.String r8 = "appUserId"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x04f5:
            java.lang.String r7 = "userEmails"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0503
            java.lang.String r8 = "user_emails"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
            goto L_0x0518
        L_0x0503:
            java.lang.String r7 = "userEmail"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0518
            java.lang.String r8 = "sha1_el"
            java.lang.String r7 = com.appsflyer.internal.C4985af.AFKeystoreWrapper((java.lang.String) r7)     // Catch:{ all -> 0x0c6f }
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0518:
            if (r4 == 0) goto L_0x0526
            java.lang.String r7 = "eventName"
            r2.put(r7, r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "eventValue"
            r8 = r20
            r2.put(r7, r8)     // Catch:{ all -> 0x0c6f }
        L_0x0526:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            r8 = r19
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x053d
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0c6f }
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x053d:
            java.lang.String r7 = "currencyCode"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x056b
            int r8 = r7.length()     // Catch:{ all -> 0x0c6f }
            r9 = 3
            if (r8 == r9) goto L_0x0566
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "WARNING: currency code should be 3 characters!!! '"
            r8.<init>(r9)     // Catch:{ all -> 0x0c6f }
            r8.append(r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "' is not a legal value."
            r8.append(r9)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r8)     // Catch:{ all -> 0x0c6f }
        L_0x0566:
            java.lang.String r8 = "currency"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x056b:
            java.lang.String r7 = "IS_UPDATE"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x057c
            java.lang.String r8 = "isUpdate"
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x057c:
            boolean r7 = r1.isPreInstalledApp(r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "af_preinstalled"
            java.lang.String r7 = java.lang.Boolean.toString(r7)     // Catch:{ all -> 0x0c6f }
            r2.put(r8, r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "collectFacebookAttrId"
            r8 = 1
            boolean r7 = r5.getBoolean(r7, r8)     // Catch:{ all -> 0x0c6f }
            r8 = 0
            if (r7 == 0) goto L_0x05b7
            android.content.pm.PackageManager r7 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x05aa, all -> 0x05a1 }
            java.lang.String r9 = "com.facebook.katana"
            r7.getApplicationInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x05aa, all -> 0x05a1 }
            java.lang.String r7 = r1.getAttributionId(r13)     // Catch:{ NameNotFoundException -> 0x05aa, all -> 0x05a1 }
            goto L_0x05b0
        L_0x05a1:
            r0 = move-exception
            r7 = r0
            java.lang.String r9 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0c6f }
        L_0x05a8:
            r7 = 0
            goto L_0x05b0
        L_0x05aa:
            java.lang.String r7 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r7)     // Catch:{ all -> 0x0c6f }
            goto L_0x05a8
        L_0x05b0:
            if (r7 == 0) goto L_0x05b7
            java.lang.String r9 = "fb"
            r2.put(r9, r7)     // Catch:{ all -> 0x0c6f }
        L_0x05b7:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "deviceTrackingDisabled"
            boolean r9 = r7.getBoolean(r9, r8)     // Catch:{ all -> 0x0c6f }
            if (r9 == 0) goto L_0x05ce
            java.lang.String r7 = "deviceTrackingDisabled"
            java.lang.String r9 = "true"
            r2.put(r7, r9)     // Catch:{ all -> 0x0c6f }
            r19 = r3
            goto L_0x0737
        L_0x05ce:
            android.content.SharedPreferences r9 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = "collectIMEI"
            boolean r10 = r7.getBoolean(r10, r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r11 = "imeiCached"
            r14 = 0
            java.lang.String r11 = r9.getString(r11, r14)     // Catch:{ all -> 0x0c6f }
            if (r10 == 0) goto L_0x0677
            java.lang.String r10 = r1.getLevel     // Catch:{ all -> 0x0c6f }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0c6f }
            if (r10 == 0) goto L_0x0677
            boolean r10 = AFLogger$LogLevel((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            if (r10 == 0) goto L_0x0674
            r10 = r25
            java.lang.Object r10 = r13.getSystemService(r10)     // Catch:{ InvocationTargetException -> 0x064d, Exception -> 0x0626 }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ InvocationTargetException -> 0x064d, Exception -> 0x0626 }
            java.lang.Class r14 = r10.getClass()     // Catch:{ InvocationTargetException -> 0x064d, Exception -> 0x0626 }
            java.lang.String r15 = "getDeviceId"
            r19 = r3
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ InvocationTargetException -> 0x0624, Exception -> 0x0622 }
            java.lang.reflect.Method r3 = r14.getMethod(r15, r3)     // Catch:{ InvocationTargetException -> 0x0624, Exception -> 0x0622 }
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ InvocationTargetException -> 0x0624, Exception -> 0x0622 }
            java.lang.Object r3 = r3.invoke(r10, r14)     // Catch:{ InvocationTargetException -> 0x0624, Exception -> 0x0622 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ InvocationTargetException -> 0x0624, Exception -> 0x0622 }
            if (r3 == 0) goto L_0x0611
            goto L_0x067d
        L_0x0611:
            if (r11 == 0) goto L_0x067f
            r3 = r18
            java.lang.String r10 = r3.concat(r11)     // Catch:{ InvocationTargetException -> 0x0620, Exception -> 0x061e }
            com.appsflyer.AFLogger.valueOf(r10)     // Catch:{ InvocationTargetException -> 0x0620, Exception -> 0x061e }
            goto L_0x0680
        L_0x061e:
            r0 = move-exception
            goto L_0x062b
        L_0x0620:
            r0 = move-exception
            goto L_0x0652
        L_0x0622:
            r0 = move-exception
            goto L_0x0629
        L_0x0624:
            r0 = move-exception
            goto L_0x0650
        L_0x0626:
            r0 = move-exception
            r19 = r3
        L_0x0629:
            r3 = r18
        L_0x062b:
            r10 = r0
            if (r11 == 0) goto L_0x0636
            java.lang.String r3 = r3.concat(r11)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0c6f }
            goto L_0x0637
        L_0x0636:
            r11 = 0
        L_0x0637:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = "WARNING: Can't collect IMEI: other reason: "
            r3.<init>(r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = r10.getMessage()     // Catch:{ all -> 0x0c6f }
            r3.append(r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r3, (java.lang.Throwable) r10)     // Catch:{ all -> 0x0c6f }
            goto L_0x0680
        L_0x064d:
            r0 = move-exception
            r19 = r3
        L_0x0650:
            r3 = r18
        L_0x0652:
            r10 = r0
            if (r11 == 0) goto L_0x065d
            java.lang.String r3 = r3.concat(r11)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0c6f }
            goto L_0x065e
        L_0x065d:
            r11 = 0
        L_0x065e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = "WARNING: Can't collect IMEI because of missing permissions: "
            r3.<init>(r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r14 = r10.getMessage()     // Catch:{ all -> 0x0c6f }
            r3.append(r14)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r3, (java.lang.Throwable) r10)     // Catch:{ all -> 0x0c6f }
            goto L_0x0680
        L_0x0674:
            r19 = r3
            goto L_0x067f
        L_0x0677:
            r19 = r3
            java.lang.String r3 = r1.getLevel     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x067f
        L_0x067d:
            r11 = r3
            goto L_0x0680
        L_0x067f:
            r11 = 0
        L_0x0680:
            if (r11 == 0) goto L_0x0698
            java.lang.String r3 = "imeiCached"
            android.content.SharedPreferences r10 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x0c6f }
            r10.putString(r3, r11)     // Catch:{ all -> 0x0c6f }
            r10.apply()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "imei"
            r2.put(r3, r11)     // Catch:{ all -> 0x0c6f }
            goto L_0x069d
        L_0x0698:
            java.lang.String r3 = "IMEI was not collected."
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ all -> 0x0c6f }
        L_0x069d:
            java.lang.String r3 = "collectAndroidId"
            boolean r3 = r7.getBoolean(r3, r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "androidIdCached"
            r10 = 0
            java.lang.String r7 = r9.getString(r7, r10)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x06ed
            java.lang.String r3 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0c6f }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x06ed
            boolean r3 = AFLogger$LogLevel((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x06f2
            android.content.ContentResolver r3 = r13.getContentResolver()     // Catch:{ Exception -> 0x06d5 }
            java.lang.String r9 = "android_id"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r9)     // Catch:{ Exception -> 0x06d5 }
            if (r3 == 0) goto L_0x06c7
            goto L_0x06f3
        L_0x06c7:
            if (r7 == 0) goto L_0x06d3
            java.lang.String r3 = "use cached AndroidId: "
            java.lang.String r3 = r3.concat(r7)     // Catch:{ Exception -> 0x06d5 }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ Exception -> 0x06d5 }
            goto L_0x06eb
        L_0x06d3:
            r7 = 0
            goto L_0x06eb
        L_0x06d5:
            r0 = move-exception
            r3 = r0
            if (r7 == 0) goto L_0x06e3
            java.lang.String r9 = "use cached AndroidId: "
            java.lang.String r9 = r9.concat(r7)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.valueOf(r9)     // Catch:{ all -> 0x0c6f }
            goto L_0x06e4
        L_0x06e3:
            r7 = 0
        L_0x06e4:
            java.lang.String r9 = r3.getMessage()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x06eb:
            r3 = r7
            goto L_0x06f3
        L_0x06ed:
            java.lang.String r3 = r1.AFLogger$LogLevel     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x06f2
            goto L_0x06f3
        L_0x06f2:
            r3 = 0
        L_0x06f3:
            if (r3 == 0) goto L_0x070b
            java.lang.String r7 = "androidIdCached"
            android.content.SharedPreferences r9 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch:{ all -> 0x0c6f }
            r9.putString(r7, r3)     // Catch:{ all -> 0x0c6f }
            r9.apply()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "android_id"
            r2.put(r7, r3)     // Catch:{ all -> 0x0c6f }
            goto L_0x0710
        L_0x070b:
            java.lang.String r3 = "Android ID was not collected."
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ all -> 0x0c6f }
        L_0x0710:
            com.appsflyer.internal.b$e$a r3 = com.appsflyer.internal.C5115z.AFInAppEventParameterName(r13)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0737
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r7.<init>()     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "isManual"
            java.lang.Boolean r10 = r3.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            r7.put(r9, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = "val"
            java.lang.String r10 = r3.AFKeystoreWrapper     // Catch:{ all -> 0x0c6f }
            r7.put(r9, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.Boolean r3 = r3.valueOf     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0732
            java.lang.String r9 = "isLat"
            r7.put(r9, r3)     // Catch:{ all -> 0x0c6f }
        L_0x0732:
            java.lang.String r3 = "oaid"
            r2.put(r3, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0737:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x074a }
            r3.<init>(r13)     // Catch:{ Exception -> 0x074a }
            java.lang.String r3 = com.appsflyer.internal.C5003al.AFInAppEventParameterName(r3)     // Catch:{ Exception -> 0x074a }
            r7 = r17
            if (r3 == 0) goto L_0x0763
            r2.put(r7, r3)     // Catch:{ Exception -> 0x0748 }
            goto L_0x0763
        L_0x0748:
            r0 = move-exception
            goto L_0x074d
        L_0x074a:
            r0 = move-exception
            r7 = r17
        L_0x074d:
            r3 = r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = "ERROR: could not get uid "
            r9.<init>(r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = r3.getMessage()     // Catch:{ all -> 0x0c6f }
            r9.append(r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x0763:
            java.lang.String r3 = "lang"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0771 }
            java.lang.String r9 = r9.getDisplayLanguage()     // Catch:{ Exception -> 0x0771 }
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0771 }
            goto L_0x0778
        L_0x0771:
            r0 = move-exception
            r3 = r0
            java.lang.String r9 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x0778:
            java.lang.String r3 = "lang_code"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0786 }
            java.lang.String r9 = r9.getLanguage()     // Catch:{ Exception -> 0x0786 }
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0786 }
            goto L_0x078d
        L_0x0786:
            r0 = move-exception
            r3 = r0
            java.lang.String r9 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x078d:
            java.lang.String r3 = "country"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x079b }
            java.lang.String r9 = r9.getCountry()     // Catch:{ Exception -> 0x079b }
            r2.put(r3, r9)     // Catch:{ Exception -> 0x079b }
            goto L_0x07a2
        L_0x079b:
            r0 = move-exception
            r3 = r0
            java.lang.String r9 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x07a2:
            java.lang.String r3 = "platformextension"
            com.appsflyer.internal.an r9 = r1.setDebugLog     // Catch:{ all -> 0x0c6f }
            java.lang.String r9 = r9.AFInAppEventParameterName()     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r9)     // Catch:{ all -> 0x0c6f }
            AFKeystoreWrapper((android.content.Context) r13, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x0c6f }
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0c6f }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0c6f }
            r10 = r16
            r3.<init>(r10, r9)     // Catch:{ all -> 0x0c6f }
            android.content.pm.PackageManager r9 = r13.getPackageManager()     // Catch:{ Exception -> 0x07df }
            java.lang.String r11 = r13.getPackageName()     // Catch:{ Exception -> 0x07df }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r11, r8)     // Catch:{ Exception -> 0x07df }
            long r14 = r9.firstInstallTime     // Catch:{ Exception -> 0x07df }
            java.lang.String r9 = "installDate"
            java.lang.String r11 = "UTC"
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r11)     // Catch:{ Exception -> 0x07df }
            r3.setTimeZone(r11)     // Catch:{ Exception -> 0x07df }
            java.util.Date r11 = new java.util.Date     // Catch:{ Exception -> 0x07df }
            r11.<init>(r14)     // Catch:{ Exception -> 0x07df }
            java.lang.String r11 = r3.format(r11)     // Catch:{ Exception -> 0x07df }
            r2.put(r9, r11)     // Catch:{ Exception -> 0x07df }
            goto L_0x07e6
        L_0x07df:
            r0 = move-exception
            r9 = r0
            java.lang.String r11 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r11, (java.lang.Throwable) r9)     // Catch:{ all -> 0x0c6f }
        L_0x07e6:
            android.content.pm.PackageManager r9 = r13.getPackageManager()     // Catch:{ all -> 0x086c }
            java.lang.String r11 = r13.getPackageName()     // Catch:{ all -> 0x086c }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r11, r8)     // Catch:{ all -> 0x086c }
            java.lang.String r11 = "versionCode"
            int r11 = r6.getInt(r11, r8)     // Catch:{ all -> 0x086c }
            int r14 = r9.versionCode     // Catch:{ all -> 0x086c }
            if (r14 <= r11) goto L_0x0816
            java.lang.String r11 = "versionCode"
            android.content.SharedPreferences r15 = AFInAppEventParameterName((android.content.Context) r13)     // Catch:{ all -> 0x080d }
            android.content.SharedPreferences$Editor r15 = r15.edit()     // Catch:{ all -> 0x080d }
            r15.putInt(r11, r14)     // Catch:{ all -> 0x080d }
            r15.apply()     // Catch:{ all -> 0x080d }
            goto L_0x0816
        L_0x080d:
            r0 = move-exception
            r3 = r0
            r18 = r5
            r17 = r7
            r20 = r12
            goto L_0x0874
        L_0x0816:
            java.lang.String r11 = "app_version_code"
            int r14 = r9.versionCode     // Catch:{ all -> 0x086c }
            java.lang.String r14 = java.lang.Integer.toString(r14)     // Catch:{ all -> 0x086c }
            r2.put(r11, r14)     // Catch:{ all -> 0x086c }
            java.lang.String r11 = "app_version_name"
            java.lang.String r14 = r9.versionName     // Catch:{ all -> 0x086c }
            r2.put(r11, r14)     // Catch:{ all -> 0x086c }
            long r14 = r9.firstInstallTime     // Catch:{ all -> 0x086c }
            long r8 = r9.lastUpdateTime     // Catch:{ all -> 0x086c }
            java.lang.String r11 = "date1"
            r17 = r7
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0868 }
            r18 = r5
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x0866 }
            r7.<init>(r10, r5)     // Catch:{ all -> 0x0866 }
            r20 = r12
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x0864 }
            r12.<init>(r14)     // Catch:{ all -> 0x0864 }
            java.lang.String r7 = r7.format(r12)     // Catch:{ all -> 0x0864 }
            r2.put(r11, r7)     // Catch:{ all -> 0x0864 }
            java.lang.String r7 = "date2"
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0864 }
            r11.<init>(r10, r5)     // Catch:{ all -> 0x0864 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x0864 }
            r5.<init>(r8)     // Catch:{ all -> 0x0864 }
            java.lang.String r5 = r11.format(r5)     // Catch:{ all -> 0x0864 }
            r2.put(r7, r5)     // Catch:{ all -> 0x0864 }
            java.lang.String r3 = r1.values((java.text.SimpleDateFormat) r3, (android.content.Context) r13)     // Catch:{ all -> 0x0864 }
            java.lang.String r5 = "firstLaunchDate"
            r2.put(r5, r3)     // Catch:{ all -> 0x0864 }
            goto L_0x0879
        L_0x0864:
            r0 = move-exception
            goto L_0x0873
        L_0x0866:
            r0 = move-exception
            goto L_0x0871
        L_0x0868:
            r0 = move-exception
            r18 = r5
            goto L_0x0871
        L_0x086c:
            r0 = move-exception
            r18 = r5
            r17 = r7
        L_0x0871:
            r20 = r12
        L_0x0873:
            r3 = r0
        L_0x0874:
            java.lang.String r5 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0c6f }
        L_0x0879:
            boolean r3 = com.appsflyer.internal.C5049bp.AFInAppEventType((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            r1.getSdkVersion = r3     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "didConfigureTokenRefreshService="
            r3.<init>(r5)     // Catch:{ all -> 0x0c6f }
            boolean r5 = r1.getSdkVersion     // Catch:{ all -> 0x0c6f }
            r3.append(r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0c6f }
            boolean r3 = r1.getSdkVersion     // Catch:{ all -> 0x0c6f }
            if (r3 != 0) goto L_0x089d
            java.lang.String r3 = "tokenRefreshConfigured"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r5)     // Catch:{ all -> 0x0c6f }
        L_0x089d:
            if (r27 == 0) goto L_0x08d2
            java.lang.String r3 = r1.onValidateInAppFailure     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x08c8
            java.lang.String r3 = "af_deeplink"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x08b1
            java.lang.String r3 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.valueOf(r3)     // Catch:{ all -> 0x0c6f }
            goto L_0x08c8
        L_0x08b1:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r1.onValidateInAppFailure     // Catch:{ all -> 0x0c6f }
            r3.<init>(r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "isPush"
            java.lang.String r7 = "true"
            r3.put(r5, r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "af_deeplink"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r3)     // Catch:{ all -> 0x0c6f }
        L_0x08c8:
            r3 = 0
            r1.onValidateInAppFailure = r3     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "open_referrer"
            r5 = r22
            r2.put(r3, r5)     // Catch:{ all -> 0x0c6f }
        L_0x08d2:
            java.lang.String r3 = "sensors"
            if (r27 != 0) goto L_0x0916
            com.appsflyer.internal.ab r5 = com.appsflyer.internal.C4965ab.AFKeystoreWrapper((android.content.Context) r13)     // Catch:{ Exception -> 0x08ff }
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x08ff }
            r7.<init>()     // Catch:{ Exception -> 0x08ff }
            java.util.List r5 = r5.AFInAppEventType()     // Catch:{ Exception -> 0x08ff }
            boolean r8 = r5.isEmpty()     // Catch:{ Exception -> 0x08ff }
            if (r8 != 0) goto L_0x08f6
            com.appsflyer.internal.i r8 = new com.appsflyer.internal.i     // Catch:{ Exception -> 0x08ff }
            r8.<init>()     // Catch:{ Exception -> 0x08ff }
            java.util.Map r5 = r8.valueOf(r5)     // Catch:{ Exception -> 0x08ff }
            r7.put(r3, r5)     // Catch:{ Exception -> 0x08ff }
            goto L_0x08fb
        L_0x08f6:
            java.lang.String r5 = "na"
            r7.put(r3, r5)     // Catch:{ Exception -> 0x08ff }
        L_0x08fb:
            r2.putAll(r7)     // Catch:{ Exception -> 0x08ff }
            goto L_0x0916
        L_0x08ff:
            r0 = move-exception
            r5 = r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "Unexpected exception from AFSensorManager: "
            r7.<init>(r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0c6f }
            r7.append(r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5)     // Catch:{ all -> 0x0c6f }
        L_0x0916:
            java.lang.String r5 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ all -> 0x0c6f }
            if (r5 != 0) goto L_0x093d
            com.appsflyer.internal.C5115z.AFKeystoreWrapper(r13, r2)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "GAID_retry"
            java.lang.String r7 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r8.getString(r7)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0935
            r7 = 1
            goto L_0x0936
        L_0x0935:
            r7 = 0
        L_0x0936:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0c6f }
            r2.put(r5, r7)     // Catch:{ all -> 0x0c6f }
        L_0x093d:
            android.content.ContentResolver r5 = r13.getContentResolver()     // Catch:{ all -> 0x0c6f }
            com.appsflyer.internal.b$e$a r5 = com.appsflyer.internal.C5115z.AFKeystoreWrapper(r5)     // Catch:{ all -> 0x0c6f }
            if (r5 == 0) goto L_0x0959
            java.lang.String r7 = "amazon_aid"
            java.lang.String r8 = r5.AFKeystoreWrapper     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "amazon_aid_limit"
            java.lang.Boolean r5 = r5.valueOf     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r5)     // Catch:{ all -> 0x0c6f }
        L_0x0959:
            boolean r5 = com.appsflyer.internal.C5049bp.values(r6)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "registeredUninstall"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0c6f }
            r2.put(r7, r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "appsFlyerCount"
            r7 = r27
            int r5 = AFInAppEventType(r6, r5, r7)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "counter"
            java.lang.String r9 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0c6f }
            r2.put(r8, r9)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "iaecounter"
            if (r4 == 0) goto L_0x097d
            r4 = 1
            goto L_0x097e
        L_0x097d:
            r4 = 0
        L_0x097e:
            java.lang.String r9 = "appsFlyerInAppEventCount"
            int r4 = AFInAppEventType(r6, r9, r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0c6f }
            r2.put(r8, r4)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x09fc
            r4 = 1
            if (r5 == r4) goto L_0x09ad
            r4 = 2
            if (r5 == r4) goto L_0x0994
            goto L_0x09fc
        L_0x0994:
            java.util.Map r4 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0c6f }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r9 = r20
            java.util.Map<java.lang.String, java.lang.Object> r10 = r9.AFKeystoreWrapper     // Catch:{ all -> 0x0c6f }
            r8.<init>(r10)     // Catch:{ all -> 0x0c6f }
            boolean r10 = r8.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r10 != 0) goto L_0x09fe
            java.lang.String r10 = "first_launch"
            r4.put(r10, r8)     // Catch:{ all -> 0x0c6f }
            goto L_0x09fe
        L_0x09ad:
            r8 = r4
            r4 = r18
            r9 = r20
            r4.AFInAppEventParameterName = r8     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "waitForCustomerId"
            r10 = 0
            boolean r4 = AFInAppEventParameterName((java.lang.String) r4, (boolean) r10)     // Catch:{ all -> 0x0c6f }
            if (r4 == 0) goto L_0x09c6
            java.lang.String r4 = "wait_cid"
            java.lang.String r10 = java.lang.Boolean.toString(r8)     // Catch:{ all -> 0x0c6f }
            r2.put(r4, r10)     // Catch:{ all -> 0x0c6f }
        L_0x09c6:
            java.util.Map r4 = AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = "ddl"
            android.content.SharedPreferences r12 = r9.AFInAppEventParameterName     // Catch:{ all -> 0x0c6f }
            r14 = 0
            java.lang.String r10 = r12.getString(r10, r14)     // Catch:{ all -> 0x0c6f }
            if (r10 == 0) goto L_0x09e9
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0c6f }
            r12.<init>(r10)     // Catch:{ all -> 0x0c6f }
            java.util.Map r10 = com.appsflyer.internal.C5100n.AFInAppEventParameterName((org.json.JSONObject) r12)     // Catch:{ all -> 0x0c6f }
            boolean r12 = r10.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r12 != 0) goto L_0x09e9
            java.lang.String r12 = "ddl"
            r4.put(r12, r10)     // Catch:{ all -> 0x0c6f }
        L_0x09e9:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            java.util.Map<java.lang.String, java.lang.Object> r12 = r9.AFKeystoreWrapper     // Catch:{ all -> 0x0c6f }
            r10.<init>(r12)     // Catch:{ all -> 0x0c6f }
            boolean r12 = r10.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r12 != 0) goto L_0x09ff
            java.lang.String r12 = "first_launch"
            r4.put(r12, r10)     // Catch:{ all -> 0x0c6f }
            goto L_0x09ff
        L_0x09fc:
            r9 = r20
        L_0x09fe:
            r8 = 1
        L_0x09ff:
            java.lang.String r4 = "isFirstCall"
            boolean r10 = valueOf((android.content.SharedPreferences) r6)     // Catch:{ all -> 0x0c6f }
            if (r10 != 0) goto L_0x0a08
            goto L_0x0a09
        L_0x0a08:
            r8 = 0
        L_0x0a09:
            java.lang.String r8 = java.lang.Boolean.toString(r8)     // Catch:{ all -> 0x0c6f }
            r2.put(r4, r8)     // Catch:{ all -> 0x0c6f }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "cpu_abi"
            java.lang.String r10 = "ro.product.cpu.abi"
            java.lang.String r10 = AFKeystoreWrapper((java.lang.String) r10)     // Catch:{ all -> 0x0c6f }
            r4.put(r8, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "cpu_abi2"
            java.lang.String r10 = "ro.product.cpu.abi2"
            java.lang.String r10 = AFKeystoreWrapper((java.lang.String) r10)     // Catch:{ all -> 0x0c6f }
            r4.put(r8, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "arch"
            java.lang.String r10 = "os.arch"
            java.lang.String r10 = AFKeystoreWrapper((java.lang.String) r10)     // Catch:{ all -> 0x0c6f }
            r4.put(r8, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "build_display_id"
            java.lang.String r10 = "ro.build.display.id"
            java.lang.String r10 = AFKeystoreWrapper((java.lang.String) r10)     // Catch:{ all -> 0x0c6f }
            r4.put(r8, r10)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0acb
            boolean r7 = r1.onValidateInApp     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0a87
            com.appsflyer.internal.w r7 = com.appsflyer.internal.C5108w.C5109e.valueOf     // Catch:{ all -> 0x0c6f }
            android.location.Location r7 = r7.AFInAppEventType(r13)     // Catch:{ all -> 0x0c6f }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r10 = 3
            r8.<init>(r10)     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0a7c
            java.lang.String r10 = "lat"
            double r14 = r7.getLatitude()     // Catch:{ all -> 0x0c6f }
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0c6f }
            r8.put(r10, r12)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = "lon"
            double r14 = r7.getLongitude()     // Catch:{ all -> 0x0c6f }
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0c6f }
            r8.put(r10, r12)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = "ts"
            long r14 = r7.getTime()     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0c6f }
            r8.put(r10, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0a7c:
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r7 != 0) goto L_0x0a87
            java.lang.String r7 = "loc"
            r4.put(r7, r8)     // Catch:{ all -> 0x0c6f }
        L_0x0a87:
            com.appsflyer.internal.d r7 = com.appsflyer.internal.C5085d.C5087e.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            com.appsflyer.internal.d$b r7 = r7.AFKeystoreWrapper(r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r8 = "btl"
            float r10 = r7.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = java.lang.Float.toString(r10)     // Catch:{ all -> 0x0c6f }
            r4.put(r8, r10)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = r7.values     // Catch:{ all -> 0x0c6f }
            if (r7 == 0) goto L_0x0aa1
            java.lang.String r8 = "btch"
            r4.put(r8, r7)     // Catch:{ all -> 0x0c6f }
        L_0x0aa1:
            r7 = 2
            if (r5 > r7) goto L_0x0acb
            com.appsflyer.internal.ab r5 = com.appsflyer.internal.C4965ab.AFKeystoreWrapper((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0c6f }
            r7.<init>()     // Catch:{ all -> 0x0c6f }
            java.util.List r8 = r5.AFKeystoreWrapper()     // Catch:{ all -> 0x0c6f }
            boolean r10 = r8.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r10 != 0) goto L_0x0abb
            r7.put(r3, r8)     // Catch:{ all -> 0x0c6f }
            goto L_0x0ac8
        L_0x0abb:
            java.util.List r5 = r5.AFInAppEventType()     // Catch:{ all -> 0x0c6f }
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0c6f }
            if (r8 != 0) goto L_0x0ac8
            r7.put(r3, r5)     // Catch:{ all -> 0x0c6f }
        L_0x0ac8:
            r4.putAll(r7)     // Catch:{ all -> 0x0c6f }
        L_0x0acb:
            java.util.Map r3 = com.appsflyer.internal.C5107v.AFInAppEventType(r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = "dim"
            r4.put(r5, r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "deviceData"
            r2.put(r3, r4)     // Catch:{ all -> 0x0c6f }
            r3 = r19
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0c6f }
            r5 = r28
            java.lang.Object r7 = r2.get(r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0c6f }
            r8 = r17
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0c6f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r12.<init>()     // Catch:{ all -> 0x0c6f }
            r14 = 7
            r11 = 0
            java.lang.String r4 = r4.substring(r11, r14)     // Catch:{ all -> 0x0c6f }
            r12.append(r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = r10.substring(r11, r14)     // Catch:{ all -> 0x0c6f }
            r12.append(r4)     // Catch:{ all -> 0x0c6f }
            int r4 = r7.length()     // Catch:{ all -> 0x0c6f }
            int r4 = r4 - r14
            java.lang.String r4 = r7.substring(r4)     // Catch:{ all -> 0x0c6f }
            r12.append(r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = r12.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = com.appsflyer.internal.C4985af.AFKeystoreWrapper((java.lang.String) r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r7 = "af_v"
            r2.put(r7, r4)     // Catch:{ all -> 0x0c6f }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.Object r3 = r2.get(r8)     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "installDate"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "counter"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r4.<init>()     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "iaecounter"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x0c6f }
            r4.append(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = com.appsflyer.internal.C4985af.valueOf((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = com.appsflyer.internal.C4985af.AFKeystoreWrapper((java.lang.String) r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "af_v2"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c6f }
            boolean r3 = init((android.content.Context) r13)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0c6f }
            r2.put(r4, r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "is_stop_tracking_used"
            boolean r3 = r6.contains(r3)     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0bbc
            java.lang.String r3 = "istu"
            java.lang.String r4 = "is_stop_tracking_used"
            r5 = 0
            boolean r4 = r6.getBoolean(r4, r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c6f }
        L_0x0bbc:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0c6f }
            r3.<init>()     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0c6f }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0c6f }
            int r5 = r5.mcc     // Catch:{ all -> 0x0c6f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c6f }
            r3.put(r4, r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0c6f }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0c6f }
            int r5 = r5.mnc     // Catch:{ all -> 0x0c6f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0c6f }
            r3.put(r4, r5)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "sig"
            android.app.Application r4 = r9.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x0c6f }
            android.app.Application r5 = r9.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = com.appsflyer.internal.C4964aa.valueOf((android.content.pm.PackageManager) r4, (java.lang.String) r5)     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "last_boot_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c6f }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0c6f }
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "disk"
            android.os.StatFs r4 = new android.os.StatFs     // Catch:{ all -> 0x0c6f }
            java.io.File r5 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x0c6f }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0c6f }
            r4.<init>(r5)     // Catch:{ all -> 0x0c6f }
            long r5 = r4.getBlockSizeLong()     // Catch:{ all -> 0x0c6f }
            long r7 = r4.getAvailableBlocksLong()     // Catch:{ all -> 0x0c6f }
            long r7 = r7 * r5
            long r9 = r4.getBlockCountLong()     // Catch:{ all -> 0x0c6f }
            long r9 = r9 * r5
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r4 = java.lang.Math.pow(r4, r11)     // Catch:{ all -> 0x0c6f }
            double r6 = (double) r7     // Catch:{ all -> 0x0c6f }
            double r6 = r6 / r4
            long r6 = (long) r6     // Catch:{ all -> 0x0c6f }
            double r8 = (double) r9     // Catch:{ all -> 0x0c6f }
            double r8 = r8 / r4
            long r4 = (long) r8     // Catch:{ all -> 0x0c6f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c6f }
            r8.<init>()     // Catch:{ all -> 0x0c6f }
            r8.append(r6)     // Catch:{ all -> 0x0c6f }
            java.lang.String r6 = "/"
            r8.append(r6)     // Catch:{ all -> 0x0c6f }
            r8.append(r4)     // Catch:{ all -> 0x0c6f }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0c6f }
            r2.put(r3, r4)     // Catch:{ all -> 0x0c6f }
            com.appsflyer.internal.o r3 = r1.onDeepLinkingNative     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0c78
            java.lang.String[] r3 = r3.AFInAppEventType     // Catch:{ all -> 0x0c6f }
            if (r3 == 0) goto L_0x0c78
            java.lang.String r4 = "sharing_filter"
            r2.put(r4, r3)     // Catch:{ all -> 0x0c6f }
            goto L_0x0c78
        L_0x0c63:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ all -> 0x0c6f }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ all -> 0x0c6f }
            r2 = 0
            return r2
        L_0x0c6f:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            com.appsflyer.AFLogger.AFInAppEventType(r4, r3)
        L_0x0c78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.values(com.appsflyer.internal.f):java.util.Map");
    }

    public static String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    private static String AFKeystoreWrapper(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getMessage(), th);
            return null;
        }
    }

    private static void AFInAppEventParameterName(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : Constants.APPBOY_PUSH_PRIORITY_KEY);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r5 = com.appsflyer.internal.C5016ar.AFInAppEventParameterName(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AFKeystoreWrapper(com.appsflyer.internal.C5089f r4, android.app.Activity r5) {
        /*
            r3 = this;
            android.app.Application r0 = r4.values
            java.lang.String r1 = ""
            if (r5 == 0) goto L_0x0017
            android.content.Intent r2 = r5.getIntent()
            if (r2 == 0) goto L_0x0017
            android.net.Uri r5 = com.appsflyer.internal.C5016ar.AFInAppEventParameterName(r5)
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = r5.toString()
            goto L_0x0018
        L_0x0017:
            r5 = r1
        L_0x0018:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = r2.getDevKey()
            if (r2 != 0) goto L_0x0033
            java.lang.String r5 = "[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.AppsFlyer2dXConversionCallback(r5)
            com.appsflyer.attribution.AppsFlyerRequestListener r4 = r4.AFKeystoreWrapper
            if (r4 == 0) goto L_0x0032
            int r5 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.C5028ay.valueOf
            r4.onError(r5, r0)
        L_0x0032:
            return
        L_0x0033:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r2.getReferrer(r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = r0
        L_0x003f:
            r4.AFVersionDeclaration = r1
            r4.valueOf = r5
            r3.AFInAppEventType((com.appsflyer.internal.C5089f) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFKeystoreWrapper(com.appsflyer.internal.f, android.app.Activity):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventType(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.AFInAppEventType(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0, (java.lang.Throwable) r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r5, (java.lang.Throwable) r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.valueOf(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r0, (java.lang.Throwable) r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFInAppEventType(java.io.File, java.lang.String):java.lang.String");
    }

    private static String AFInAppEventParameterName(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains(AccessToken.ACCESS_TOKEN_KEY)) {
            return str;
        }
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            str2 = "";
        } else {
            str2 = str.substring(indexOf);
        }
        if (str2.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (str2.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(str2.split("&")));
        } else {
            arrayList.add(str2);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.contains(AccessToken.ACCESS_TOKEN_KEY)) {
                it.remove();
            } else {
                if (sb.length() != 0) {
                    sb.append("&");
                } else if (!str3.startsWith("?")) {
                    sb.append("?");
                }
                sb.append(str3);
            }
        }
        return str.replace(str2, sb.toString());
    }

    /* access modifiers changed from: private */
    public boolean AFKeystoreWrapper(C5089f fVar, SharedPreferences sharedPreferences) {
        int AFInAppEventType2 = AFInAppEventType(sharedPreferences, "appsFlyerCount", false);
        return (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false) && AFInAppEventType2 == 1) || (AFInAppEventType2 == 1 && !(fVar instanceof C5054bt));
    }

    private static boolean AFInAppEventType(File file) {
        return file == null || !file.exists();
    }

    public static void AFKeystoreWrapper(Context context, Map<String, ? super String> map) {
        C5112y yVar = C5112y.C5113c.values;
        C5112y.C5114e AFInAppEventParameterName2 = C5112y.AFInAppEventParameterName(context);
        map.put("network", AFInAppEventParameterName2.values);
        String str = AFInAppEventParameterName2.valueOf;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFInAppEventParameterName2.AFInAppEventType;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    public final String AFInAppEventType(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = context == null ? null : AFInAppEventParameterName("CHANNEL", context.getPackageManager(), context.getPackageName());
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public static int AFInAppEventType(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        if (C5002ak.AFInAppEventType.AFLogger$LogLevel()) {
            if (C5002ak.AFInAppEventType == null) {
                C5002ak.AFInAppEventType = new C5002ak();
            }
            C5002ak.AFInAppEventType.AFKeystoreWrapper(String.valueOf(i));
        }
        return i;
    }

    private static String AFInAppEventParameterName(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
            return null;
        }
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        if (getLevel()) {
            hashMap.put("lvl", this.enableLocationCollection);
        } else if (this.setImeiData) {
            HashMap hashMap2 = new HashMap();
            this.enableLocationCollection = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.enableLocationCollection);
        }
        return hashMap;
    }

    public static void AFInAppEventType(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.AFKeystoreWrapper("scheduleJob failed with RejectedExecutionException Exception", (Throwable) e);
                return;
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.AppsFlyer2dXConversionCallback("scheduler is null, shut downed or terminated");
    }

    public static SharedPreferences AFInAppEventParameterName(Context context) {
        C4986ag agVar = onConversionDataFail;
        if (agVar.setCustomerIdAndLogSession == null) {
            agVar.setCustomerIdAndLogSession = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        }
        return onConversionDataFail.setCustomerIdAndLogSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[Catch:{ all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFInAppEventType(java.net.HttpURLConnection r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r7.getErrorStream()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ all -> 0x0047 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0047 }
            r3.<init>(r2)     // Catch:{ all -> 0x0047 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0045 }
            r2.<init>(r3)     // Catch:{ all -> 0x0045 }
            r1 = 0
        L_0x001b:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x002a
            r1 = 10
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = ""
        L_0x002c:
            r0.append(r1)     // Catch:{ all -> 0x0040 }
            r0.append(r4)     // Catch:{ all -> 0x0040 }
            r1 = 1
            goto L_0x001b
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x003b }
            r3.close()     // Catch:{ all -> 0x003b }
            goto L_0x006c
        L_0x003b:
            r7 = move-exception
            com.appsflyer.AFLogger.values((java.lang.Throwable) r7)
            goto L_0x006c
        L_0x0040:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            goto L_0x0049
        L_0x0047:
            r2 = move-exception
            r3 = r1
        L_0x0049:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x008f }
            java.net.URL r7 = r7.getURL()     // Catch:{ all -> 0x008f }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x008f }
            r4.append(r7)     // Catch:{ all -> 0x008f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x008f }
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r7, (java.lang.Throwable) r2)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x006c:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0076 }
            return r7
        L_0x0076:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0085 }
            return r7
        L_0x0085:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r7 = r7.toString()
            return r7
        L_0x008f:
            r7 = move-exception
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r0 = move-exception
            goto L_0x009e
        L_0x0098:
            if (r3 == 0) goto L_0x00a1
            r3.close()     // Catch:{ all -> 0x0096 }
            goto L_0x00a1
        L_0x009e:
            com.appsflyer.AFLogger.values((java.lang.Throwable) r0)
        L_0x00a1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFInAppEventType(java.net.HttpURLConnection):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ba A[SYNTHETIC, Splitter:B:70:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(com.appsflyer.internal.C5089f r19) throws java.io.IOException {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            java.net.URL r1 = new java.net.URL
            java.lang.String r2 = r0.onInstallConversionFailureNative
            r1.<init>(r2)
            byte[] r2 = r19.values()
            java.lang.String r3 = r0.init
            java.lang.String r4 = r0.AppsFlyer2dXConversionCallback
            boolean r5 = r19.AFInAppEventType()
            android.app.Application r6 = r0.values
            com.appsflyer.attribution.AppsFlyerRequestListener r7 = r0.AFKeystoreWrapper
            r10 = 1
            if (r5 == 0) goto L_0x0024
            int r11 = r0.onAttributionFailureNative
            if (r11 != r10) goto L_0x0024
            r11 = r10
            goto L_0x0025
        L_0x0024:
            r11 = 0
        L_0x0025:
            com.appsflyer.internal.au r12 = r8.AppsFlyer2dXConversionCallback
            if (r12 != 0) goto L_0x0030
            com.appsflyer.internal.au r12 = new com.appsflyer.internal.au
            r12.<init>(r6)
            r8.AppsFlyer2dXConversionCallback = r12
        L_0x0030:
            com.appsflyer.internal.au r12 = r8.AppsFlyer2dXConversionCallback
            if (r11 == 0) goto L_0x004b
            long r13 = java.lang.System.currentTimeMillis()
            long r9 = r8.AppsFlyerLib
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.util.Map<java.lang.String, java.lang.Object> r10 = r12.AFKeystoreWrapper
            java.lang.String r13 = "from_fg"
            r10.put(r13, r9)
            long r9 = java.lang.System.currentTimeMillis()
            goto L_0x004d
        L_0x004b:
            r9 = 0
        L_0x004d:
            java.net.URLConnection r14 = r1.openConnection()     // Catch:{ all -> 0x01c1 }
            java.net.HttpURLConnection r14 = (java.net.HttpURLConnection) r14     // Catch:{ all -> 0x01c1 }
            java.lang.String r13 = "POST"
            r14.setRequestMethod(r13)     // Catch:{ all -> 0x01be }
            int r13 = r2.length     // Catch:{ all -> 0x01be }
            java.lang.String r15 = "Content-Length"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01be }
            r14.setRequestProperty(r15, r13)     // Catch:{ all -> 0x01be }
            java.lang.String r13 = "Content-Type"
            boolean r15 = r19.valueOf()     // Catch:{ all -> 0x01be }
            if (r15 == 0) goto L_0x006d
            java.lang.String r15 = "application/octet-stream"
            goto L_0x006f
        L_0x006d:
            java.lang.String r15 = "application/json"
        L_0x006f:
            r14.setRequestProperty(r13, r15)     // Catch:{ all -> 0x01be }
            r13 = 10000(0x2710, float:1.4013E-41)
            r14.setConnectTimeout(r13)     // Catch:{ all -> 0x01be }
            r13 = 1
            r14.setDoOutput(r13)     // Catch:{ all -> 0x01be }
            com.appsflyer.AppsFlyerProperties r15 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x01be }
            java.lang.String r0 = "http_cache"
            boolean r0 = r15.getBoolean(r0, r13)     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x008b
            r0 = 0
            r14.setUseCaches(r0)     // Catch:{ all -> 0x01be }
        L_0x008b:
            java.io.DataOutputStream r13 = new java.io.DataOutputStream     // Catch:{ all -> 0x01b6 }
            java.io.OutputStream r0 = r14.getOutputStream()     // Catch:{ all -> 0x01b6 }
            r13.<init>(r0)     // Catch:{ all -> 0x01b6 }
            r13.write(r2)     // Catch:{ all -> 0x01b4 }
            r13.close()     // Catch:{ all -> 0x01be }
            int r0 = r14.getResponseCode()     // Catch:{ all -> 0x01be }
            if (r11 == 0) goto L_0x00b1
            java.lang.String r2 = "net"
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01be }
            long r16 = r16 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01be }
            java.util.Map<java.lang.String, java.lang.Object> r10 = r12.AFKeystoreWrapper     // Catch:{ all -> 0x01be }
            r10.put(r2, r9)     // Catch:{ all -> 0x01be }
        L_0x00b1:
            java.lang.String r2 = AFInAppEventType((java.net.HttpURLConnection) r14)     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.ak r9 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x01be }
            if (r9 != 0) goto L_0x00c0
            com.appsflyer.internal.ak r9 = new com.appsflyer.internal.ak     // Catch:{ all -> 0x01be }
            r9.<init>()     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.C5002ak.AFInAppEventType = r9     // Catch:{ all -> 0x01be }
        L_0x00c0:
            com.appsflyer.internal.ak r9 = com.appsflyer.internal.C5002ak.AFInAppEventType     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01be }
            java.lang.String r10 = "server_response"
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ all -> 0x01be }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01be }
            r13 = 0
            r11[r13] = r12     // Catch:{ all -> 0x01be }
            r12 = 1
            r11[r12] = r2     // Catch:{ all -> 0x01be }
            r9.valueOf(r10, r1, r11)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = "response code: "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r1.concat(r9)     // Catch:{ all -> 0x01be }
            com.appsflyer.AFLogger.AFInAppEventType(r1)     // Catch:{ all -> 0x01be }
            android.content.SharedPreferences r9 = AFInAppEventParameterName((android.content.Context) r6)     // Catch:{ all -> 0x01be }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0184
            if (r6 == 0) goto L_0x00fc
            if (r5 == 0) goto L_0x00fc
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01be }
            r8.onResponse = r10     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.be r1 = r8.onInstallConversionFailureNative     // Catch:{ all -> 0x01be }
            r1.AFKeystoreWrapper()     // Catch:{ all -> 0x01be }
        L_0x00fc:
            if (r7 == 0) goto L_0x0101
            r7.onSuccess()     // Catch:{ all -> 0x01be }
        L_0x0101:
            if (r4 == 0) goto L_0x010a
            com.appsflyer.internal.C4999ah.AFInAppEventParameterName()     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.C4999ah.AFInAppEventParameterName(r4, r6)     // Catch:{ all -> 0x01be }
            goto L_0x0153
        L_0x010a:
            java.lang.String r1 = "sentSuccessfully"
            java.lang.String r4 = "true"
            android.content.SharedPreferences r5 = AFInAppEventParameterName((android.content.Context) r6)     // Catch:{ all -> 0x01be }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x01be }
            r5.putString(r1, r4)     // Catch:{ all -> 0x01be }
            r5.apply()     // Catch:{ all -> 0x01be }
            boolean r1 = r8.onResponseError     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x0153
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01be }
            long r10 = r8.AFVersionDeclaration     // Catch:{ all -> 0x01be }
            long r4 = r4 - r10
            r10 = 15000(0x3a98, double:7.411E-320)
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x012e
            goto L_0x0153
        L_0x012e:
            java.util.concurrent.ScheduledExecutorService r1 = r8.onDeepLinking     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x0153
            com.appsflyer.internal.l r1 = com.appsflyer.internal.C5097l.AFInAppEventType     // Catch:{ all -> 0x01be }
            if (r1 != 0) goto L_0x013d
            com.appsflyer.internal.l r1 = new com.appsflyer.internal.l     // Catch:{ all -> 0x01be }
            r1.<init>()     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.C5097l.AFInAppEventType = r1     // Catch:{ all -> 0x01be }
        L_0x013d:
            com.appsflyer.internal.l r1 = com.appsflyer.internal.C5097l.AFInAppEventType     // Catch:{ all -> 0x01be }
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.AFInAppEventType()     // Catch:{ all -> 0x01be }
            r8.onDeepLinking = r1     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.ag$c r1 = new com.appsflyer.internal.ag$c     // Catch:{ all -> 0x01be }
            r1.<init>(r6)     // Catch:{ all -> 0x01be }
            java.util.concurrent.ScheduledExecutorService r4 = r8.onDeepLinking     // Catch:{ all -> 0x01be }
            r10 = 1
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01be }
            AFInAppEventType(r4, r1, r10, r5)     // Catch:{ all -> 0x01be }
        L_0x0153:
            com.appsflyer.internal.bp r1 = new com.appsflyer.internal.bp     // Catch:{ all -> 0x01be }
            r1.<init>(r6)     // Catch:{ all -> 0x01be }
            com.appsflyer.internal.ac r4 = r1.AFInAppEventParameterName()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x0176
            boolean r5 = r4.AFInAppEventType()     // Catch:{ all -> 0x01be }
            if (r5 == 0) goto L_0x0176
            java.lang.String r4 = r4.AFInAppEventType     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "Resending Uninstall token to AF servers: "
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01be }
            java.lang.String r5 = r5.concat(r7)     // Catch:{ all -> 0x01be }
            com.appsflyer.AFLogger.valueOf(r5)     // Catch:{ all -> 0x01be }
            r1.valueOf(r4)     // Catch:{ all -> 0x01be }
        L_0x0176:
            org.json.JSONObject r1 = com.appsflyer.internal.C5014ap.AFInAppEventType(r2)     // Catch:{ all -> 0x01be }
            java.lang.String r2 = "send_background"
            r4 = 0
            boolean r1 = r1.optBoolean(r2, r4)     // Catch:{ all -> 0x01be }
            r8.onPause = r1     // Catch:{ all -> 0x01be }
            goto L_0x01a1
        L_0x0184:
            if (r7 == 0) goto L_0x01a1
            int r1 = com.appsflyer.attribution.RequestError.RESPONSE_CODE_FAILURE     // Catch:{ all -> 0x01be }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01be }
            r2.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = com.appsflyer.internal.C5028ay.AFKeystoreWrapper     // Catch:{ all -> 0x01be }
            r2.append(r4)     // Catch:{ all -> 0x01be }
            java.lang.String r4 = " "
            r2.append(r4)     // Catch:{ all -> 0x01be }
            r2.append(r0)     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01be }
            r7.onError(r1, r2)     // Catch:{ all -> 0x01be }
        L_0x01a1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01be }
            r7 = 0
            r1 = r18
            r2 = r19
            r4 = r6
            r5 = r9
            r6 = r0
            com.appsflyer.internal.C5047bn.AFKeystoreWrapper(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01be }
            r14.disconnect()
            return
        L_0x01b4:
            r0 = move-exception
            goto L_0x01b8
        L_0x01b6:
            r0 = move-exception
            r13 = 0
        L_0x01b8:
            if (r13 == 0) goto L_0x01bd
            r13.close()     // Catch:{ all -> 0x01be }
        L_0x01bd:
            throw r0     // Catch:{ all -> 0x01be }
        L_0x01be:
            r0 = move-exception
            r13 = r14
            goto L_0x01c3
        L_0x01c1:
            r0 = move-exception
            r13 = 0
        L_0x01c3:
            if (r13 == 0) goto L_0x01c8
            r13.disconnect()
        L_0x01c8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFInAppEventParameterName(com.appsflyer.internal.f):void");
    }

    private void AFInAppEventType(C5089f fVar) {
        boolean z = fVar.AFLogger$LogLevel == null;
        if (AFKeystoreWrapper()) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.AFInAppEventType("Allowing multiple launches within a 5 second time window.");
            } else if (valueOf()) {
                AppsFlyerRequestListener appsFlyerRequestListener = fVar.AFKeystoreWrapper;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, C5028ay.values);
                    return;
                }
                return;
            }
            this.onAttributionFailure = System.currentTimeMillis();
        }
        if (C5097l.AFInAppEventType == null) {
            C5097l.AFInAppEventType = new C5097l();
        }
        AFInAppEventType(C5097l.AFInAppEventType.AFInAppEventType(), new C4998e(this, fVar, (byte) 0), 0, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void AFInAppEventType(C4986ag agVar, C5089f fVar) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(fVar.onInstallConversionFailureNative);
        AFLogger.AFInAppEventType(sb.toString());
        if (fVar.AppsFlyer2dXConversionCallback != null) {
            str = Base64.encodeToString(fVar.values(), 2);
            AFLogger.AFInAppEventType("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(fVar.AFKeystoreWrapper()).toString();
            String replaceAll = str.replaceAll("\\p{C}", "*Non-printing character*");
            if (!replaceAll.equals(str)) {
                AFLogger.AppsFlyer2dXConversionCallback("Payload contains non-printing characters");
                str = replaceAll;
            }
            C5004am.AFInAppEventType("data: ".concat(str));
        }
        if (C5002ak.AFInAppEventType == null) {
            C5002ak.AFInAppEventType = new C5002ak();
        }
        C5002ak.AFInAppEventType.valueOf("server_request", fVar.onInstallConversionFailureNative, str);
        try {
            agVar.AFInAppEventParameterName(fVar);
        } catch (IOException e) {
            AFLogger.AFKeystoreWrapper("Exception in sendRequestToServer. ", (Throwable) e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                agVar.AFInAppEventParameterName(fVar.AFKeystoreWrapper(fVar.onInstallConversionFailureNative.replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send request to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.AFInAppEventType(sb2.toString());
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c6, code lost:
        if (r9.getLevel() == false) goto L_0x01ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void AFInAppEventParameterName(com.appsflyer.internal.C4986ag r9, com.appsflyer.internal.C5089f r10) {
        /*
            android.app.Application r0 = r10.values
            java.lang.String r1 = r10.AFLogger$LogLevel
            if (r0 != 0) goto L_0x000c
            java.lang.String r9 = "sendWithEvent - got null context. skipping event/launch."
            com.appsflyer.AFLogger.valueOf(r9)
            return
        L_0x000c:
            android.content.SharedPreferences r2 = AFInAppEventParameterName((android.content.Context) r0)
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()
            r3.saveProperties(r2)
            boolean r3 = r9.isStopped()
            if (r3 != 0) goto L_0x0036
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "sendWithEvent from activity: "
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.appsflyer.AFLogger.AFInAppEventType(r3)
        L_0x0036:
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x003c
            r1 = r3
            goto L_0x003d
        L_0x003c:
            r1 = r4
        L_0x003d:
            boolean r5 = r10 instanceof com.appsflyer.internal.C5058bx
            boolean r6 = r10 instanceof com.appsflyer.internal.C5054bt
            r10.onInstallConversionDataLoadedNative = r1
            java.util.Map r7 = r9.values((com.appsflyer.internal.C5089f) r10)
            java.lang.String r8 = "appsflyerKey"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x020d
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0059
            goto L_0x020d
        L_0x0059:
            boolean r8 = r9.isStopped()
            if (r8 != 0) goto L_0x0064
            java.lang.String r8 = "AppsFlyerLib.sendWithEvent"
            com.appsflyer.AFLogger.AFInAppEventType(r8)
        L_0x0064:
            java.lang.String r8 = "appsFlyerCount"
            int r2 = AFInAppEventType(r2, r8, r4)
            r8 = 2
            if (r6 != 0) goto L_0x00c5
            if (r5 == 0) goto L_0x0070
            goto L_0x00c5
        L_0x0070:
            if (r1 == 0) goto L_0x00aa
            if (r2 >= r8) goto L_0x008f
            java.lang.String r5 = onResponseNative
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.appsflyer.AppsFlyerLib r8 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r8 = r8.getHostPrefix()
            r6[r4] = r8
            com.appsflyer.internal.ag r8 = onConversionDataFail
            java.lang.String r8 = r8.getHostName()
            r6[r3] = r8
            java.lang.String r5 = java.lang.String.format(r5, r6)
            goto L_0x00df
        L_0x008f:
            java.lang.String r5 = onAppOpenAttribution
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.appsflyer.AppsFlyerLib r8 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r8 = r8.getHostPrefix()
            r6[r4] = r8
            com.appsflyer.internal.ag r8 = onConversionDataFail
            java.lang.String r8 = r8.getHostName()
            r6[r3] = r8
            java.lang.String r5 = java.lang.String.format(r5, r6)
            goto L_0x00df
        L_0x00aa:
            java.lang.String r5 = onResponseErrorNative
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.appsflyer.AppsFlyerLib r8 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r8 = r8.getHostPrefix()
            r6[r4] = r8
            com.appsflyer.internal.ag r8 = onConversionDataFail
            java.lang.String r8 = r8.getHostName()
            r6[r3] = r8
            java.lang.String r5 = java.lang.String.format(r5, r6)
            goto L_0x00df
        L_0x00c5:
            java.lang.String r5 = onConversionDataSuccess
            java.lang.Object[] r6 = new java.lang.Object[r8]
            com.appsflyer.AppsFlyerLib r8 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r8 = r8.getHostPrefix()
            r6[r4] = r8
            com.appsflyer.internal.ag r8 = onConversionDataFail
            java.lang.String r8 = r8.getHostName()
            r6[r3] = r8
            java.lang.String r5 = java.lang.String.format(r5, r6)
        L_0x00df:
            java.lang.StringBuilder r5 = android.support.p013v4.media.C0072d.m201h(r5)
            java.lang.String r6 = r0.getPackageName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "&buildnumber=6.4.3"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r0 = r9.AFInAppEventType((android.content.Context) r0)
            if (r0 == 0) goto L_0x0119
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "&channel="
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
        L_0x0119:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = "collectAndroidIdForceByUser"
            boolean r0 = r0.getBoolean(r6, r4)
            if (r0 != 0) goto L_0x0134
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r6, r4)
            if (r0 == 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r0 = r4
            goto L_0x0135
        L_0x0134:
            r0 = r3
        L_0x0135:
            if (r0 != 0) goto L_0x0170
            java.lang.String r0 = "advertiserId"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = r9.AFLogger$LogLevel     // Catch:{ Exception -> 0x016a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "android_id"
            java.lang.Object r0 = r7.remove(r0)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ Exception -> 0x016a }
        L_0x0154:
            java.lang.String r0 = r9.getLevel     // Catch:{ Exception -> 0x016a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "imei"
            java.lang.Object r0 = r7.remove(r0)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.AFInAppEventType(r0)     // Catch:{ Exception -> 0x016a }
            goto L_0x0170
        L_0x016a:
            r0 = move-exception
            java.lang.String r6 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r6, (java.lang.Throwable) r0)
        L_0x0170:
            com.appsflyer.internal.ag$a r0 = new com.appsflyer.internal.ag$a
            com.appsflyer.internal.f r10 = r10.AFKeystoreWrapper(r5)
            com.appsflyer.internal.f r10 = r10.AFInAppEventType(r7)
            r10.onAttributionFailureNative = r2
            r0.<init>(r9, r10, r4)
            if (r1 == 0) goto L_0x01c9
            com.appsflyer.internal.cj[] r10 = r9.init
            if (r10 == 0) goto L_0x01ae
            int r1 = r10.length
            r2 = r4
        L_0x0187:
            if (r4 >= r1) goto L_0x01ad
            r5 = r10[r4]
            com.appsflyer.internal.cj$e r6 = r5.AFKeystoreWrapper
            com.appsflyer.internal.cj$e r7 = com.appsflyer.internal.C5072cj.C5074e.STARTED
            if (r6 != r7) goto L_0x01aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to get "
            r2.<init>(r6)
            java.lang.String r5 = r5.values
            r2.append(r5)
            java.lang.String r5 = " referrer, wait ..."
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.valueOf(r2)
            r2 = r3
        L_0x01aa:
            int r4 = r4 + 1
            goto L_0x0187
        L_0x01ad:
            r4 = r2
        L_0x01ae:
            boolean r10 = r9.setOaidData
            if (r10 == 0) goto L_0x01be
            boolean r10 = r9.values()
            if (r10 != 0) goto L_0x01be
            java.lang.String r10 = "fetching Facebook deferred AppLink data, wait ..."
            com.appsflyer.AFLogger.valueOf(r10)
            r4 = r3
        L_0x01be:
            boolean r10 = r9.setImeiData
            if (r10 == 0) goto L_0x01c9
            boolean r9 = r9.getLevel()
            if (r9 != 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r3 = r4
        L_0x01ca:
            boolean r9 = com.appsflyer.internal.C5095j.values
            if (r9 == 0) goto L_0x01ef
            java.lang.String r9 = "ESP deeplink: execute launch on SerialExecutor"
            com.appsflyer.AFLogger.AFKeystoreWrapper((java.lang.String) r9)
            com.appsflyer.internal.l r9 = com.appsflyer.internal.C5097l.AFInAppEventType
            if (r9 != 0) goto L_0x01de
            com.appsflyer.internal.l r9 = new com.appsflyer.internal.l
            r9.<init>()
            com.appsflyer.internal.C5097l.AFInAppEventType = r9
        L_0x01de:
            com.appsflyer.internal.l r9 = com.appsflyer.internal.C5097l.AFInAppEventType
            java.util.concurrent.ScheduledExecutorService r10 = r9.AFKeystoreWrapper
            if (r10 != 0) goto L_0x01ec
            java.util.concurrent.ThreadFactory r10 = r9.valueOf
            java.util.concurrent.ScheduledExecutorService r10 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r10)
            r9.AFKeystoreWrapper = r10
        L_0x01ec:
            java.util.concurrent.ScheduledExecutorService r9 = r9.AFKeystoreWrapper
            goto L_0x0200
        L_0x01ef:
            com.appsflyer.internal.l r9 = com.appsflyer.internal.C5097l.AFInAppEventType
            if (r9 != 0) goto L_0x01fa
            com.appsflyer.internal.l r9 = new com.appsflyer.internal.l
            r9.<init>()
            com.appsflyer.internal.C5097l.AFInAppEventType = r9
        L_0x01fa:
            com.appsflyer.internal.l r9 = com.appsflyer.internal.C5097l.AFInAppEventType
            java.util.concurrent.ScheduledThreadPoolExecutor r9 = r9.AFInAppEventType()
        L_0x0200:
            if (r3 == 0) goto L_0x0205
            r1 = 500(0x1f4, double:2.47E-321)
            goto L_0x0207
        L_0x0205:
            r1 = 0
        L_0x0207:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            AFInAppEventType(r9, r0, r1, r10)
            return
        L_0x020d:
            java.lang.String r9 = "Not sending data yet, waiting for dev key"
            com.appsflyer.AFLogger.valueOf(r9)
            com.appsflyer.attribution.AppsFlyerRequestListener r9 = r10.AFKeystoreWrapper
            if (r9 == 0) goto L_0x021d
            int r10 = com.appsflyer.attribution.RequestError.NO_DEV_KEY
            java.lang.String r0 = com.appsflyer.internal.C5028ay.valueOf
            r9.onError(r10, r0)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C4986ag.AFInAppEventParameterName(com.appsflyer.internal.ag, com.appsflyer.internal.f):void");
    }
}
