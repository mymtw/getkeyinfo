package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.fragment.app.C2783s;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.perf.util.C16627c;
import com.google.firebase.remoteconfig.internal.C16688a;
import com.google.firebase.remoteconfig.internal.C16690b;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003a2.C0015b;
import p030bo.app.C3653e7;
import p030bo.app.C3673f7;
import p568fn.C17781a;
import p632nn.C18276b;
import p632nn.C18277c;
import p632nn.C18281g;
import p641on.C18328f;
import p722ym.C18895a;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final C17781a logger = C17781a.m29823d();
    private final ConcurrentHashMap<String, C18277c> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final Executor executor;
    private C18276b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private C18895a<C18281g> firebaseRemoteConfigProvider;

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue()), (C18276b) null);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private C18277c getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        C18277c cVar = this.allRcConfigMap.get(str);
        if (cVar.mo69824a() != 2) {
            return null;
        }
        logger.mo69015b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", cVar.mo69825b(), str);
        return cVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m27421xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.mo69823a());
    }

    /* access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m27422xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        C18276b bVar = this.firebaseRemoteConfig;
        C16688a aVar = bVar.f40116e;
        aVar.f36906f.mo69860b().mo69662i(aVar.f36903c, new C18328f(aVar, aVar.f36908h.f36915a.getLong("minimum_fetch_interval_in_seconds", C16688a.f36899j))).mo69670q(new C0015b()).mo69669p(bVar.f40113b, new C2783s(bVar, 3)).mo69658e(this.executor, new C3653e7(this, 8)).mo69657d(this.executor, new C3673f7(this, 4));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.mo69823a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public C16627c<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.mo69014a("The key to get Remote Config boolean value is null.");
            return new C16627c<>();
        }
        C18277c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C16627c<>(Boolean.valueOf(remoteConfigValue.mo69828e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo69825b().isEmpty()) {
                    logger.mo69015b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo69825b(), str);
                }
            }
        }
        return new C16627c<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C16627c<Float> getFloat(String str) {
        if (str == null) {
            logger.mo69014a("The key to get Remote Config float value is null.");
            return new C16627c<>();
        }
        C18277c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C16627c<>(Float.valueOf(Double.valueOf(remoteConfigValue.mo69827d()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo69825b().isEmpty()) {
                    logger.mo69015b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo69825b(), str);
                }
            }
        }
        return new C16627c<>();
    }

    public C16627c<Long> getLong(String str) {
        if (str == null) {
            logger.mo69014a("The key to get Remote Config long value is null.");
            return new C16627c<>();
        }
        C18277c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new C16627c<>(Long.valueOf(remoteConfigValue.mo69826c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo69825b().isEmpty()) {
                    logger.mo69015b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo69825b(), str);
                }
            }
        }
        return new C16627c<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            nn.c r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x0075
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.mo69828e()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
        L_0x0014:
            r9 = r8
            goto L_0x0075
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x002b
            double r3 = r0.mo69827d()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Float r8 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x002b:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 != 0) goto L_0x0050
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0059 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r8 = r0.mo69825b()     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x003d:
            java.lang.String r3 = r0.mo69825b()     // Catch:{ IllegalArgumentException -> 0x0059 }
            fn.a r4 = logger     // Catch:{ IllegalArgumentException -> 0x004e }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x004e }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x004e }
            r4.mo69015b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x004e }
            r9 = r3
            goto L_0x0075
        L_0x004e:
            r9 = r3
            goto L_0x0059
        L_0x0050:
            long r3 = r0.mo69826c()     // Catch:{ IllegalArgumentException -> 0x0059 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0059 }
            goto L_0x0014
        L_0x0059:
            java.lang.String r3 = r0.mo69825b()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0075
            fn.a r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.mo69825b()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.mo69015b(r8, r4)
        L_0x0075:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public C16627c<String> getString(String str) {
        if (str == null) {
            logger.mo69014a("The key to get Remote Config String value is null.");
            return new C16627c<>();
        }
        C18277c remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new C16627c<>(remoteConfigValue.mo69825b()) : new C16627c<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        C18895a<C18281g> aVar;
        C18281g gVar;
        if (!(this.firebaseRemoteConfig != null || (aVar = this.firebaseRemoteConfigProvider) == null || (gVar = aVar.get()) == null)) {
            this.firebaseRemoteConfig = gVar.mo69831b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        int i;
        C18276b bVar = this.firebaseRemoteConfig;
        if (bVar != null) {
            C16690b bVar2 = bVar.f40118g;
            synchronized (bVar2.f36916b) {
                bVar2.f36915a.getLong("last_fetch_time_in_millis", -1);
                i = bVar2.f36915a.getInt("last_fetch_status", 0);
                int[] iArr = C16688a.f36900k;
                long j = bVar2.f36915a.getLong("fetch_timeout_in_seconds", 60);
                if (j >= 0) {
                    long j2 = bVar2.f36915a.getLong("minimum_fetch_interval_in_seconds", C16688a.f36899j);
                    if (j2 < 0) {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
                }
            }
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public void setFirebaseRemoteConfigProvider(C18895a<C18281g> aVar) {
        this.firebaseRemoteConfigProvider = aVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, C18277c> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
    }

    public RemoteConfigManager(Executor executor2, C18276b bVar) {
        this(executor2, bVar, ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)) + 5000);
    }

    @VisibleForTesting
    public RemoteConfigManager(Executor executor2, C18276b bVar, long j) {
        ConcurrentHashMap<String, C18277c> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.executor = executor2;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.mo69823a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().getMicros());
        this.appStartConfigFetchDelayInMs = j;
    }
}
