package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.appsflyer.internal.ab */
public final class C4965ab {
    private static volatile C4965ab AFLogger$LogLevel;
    private static final Handler AFVersionDeclaration = new Handler(Looper.getMainLooper());
    private static final BitSet init;
    public final Handler AFInAppEventParameterName;
    public final Runnable AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Executor AppsFlyer2dXConversionCallback;
    public final Runnable getLevel;
    private long onAppOpenAttribution;
    /* access modifiers changed from: private */
    public boolean onAppOpenAttributionNative;
    /* access modifiers changed from: private */
    public final Map<C5110x, C5110x> onAttributionFailureNative;
    /* access modifiers changed from: private */
    public int onDeepLinkingNative;
    /* access modifiers changed from: private */
    public final Map<C5110x, Map<String, Object>> onInstallConversionDataLoadedNative;
    /* access modifiers changed from: private */
    public final SensorManager onInstallConversionFailureNative;
    /* access modifiers changed from: private */
    public final Runnable onResponseErrorNative;
    public final Object valueOf = new Object();
    public boolean values;

    static {
        BitSet bitSet = new BitSet(6);
        init = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private C4965ab(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = init;
        this.onAttributionFailureNative = new HashMap(bitSet.size());
        this.onInstallConversionDataLoadedNative = new ConcurrentHashMap(bitSet.size());
        this.AFKeystoreWrapper = new Runnable() {
            public final void run() {
                synchronized (C4965ab.this.valueOf) {
                    C4965ab abVar = C4965ab.this;
                    abVar.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                        public final void run() {
                            try {
                                for (Sensor next : C4965ab.this.onInstallConversionFailureNative.getSensorList(-1)) {
                                    if (C4965ab.values(next.getType())) {
                                        C5110x xVar = new C5110x(next, C4965ab.this.AppsFlyer2dXConversionCallback);
                                        if (!C4965ab.this.onAttributionFailureNative.containsKey(xVar)) {
                                            C4965ab.this.onAttributionFailureNative.put(xVar, xVar);
                                        }
                                        C4965ab.this.onInstallConversionFailureNative.registerListener((SensorEventListener) C4965ab.this.onAttributionFailureNative.get(xVar), next, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            boolean unused2 = C4965ab.this.onAppOpenAttributionNative = true;
                        }
                    });
                    C4965ab abVar2 = C4965ab.this;
                    abVar2.AFInAppEventParameterName.postDelayed(abVar2.onResponseErrorNative, 100);
                    C4965ab.this.values = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() {
            public final void run() {
                synchronized (C4965ab.this.valueOf) {
                    C4965ab abVar = C4965ab.this;
                    abVar.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                        public final void run() {
                            try {
                                if (!C4965ab.this.onAttributionFailureNative.isEmpty()) {
                                    for (C5110x xVar : C4965ab.this.onAttributionFailureNative.values()) {
                                        C4965ab.this.onInstallConversionFailureNative.unregisterListener(xVar);
                                        xVar.AFKeystoreWrapper((Map<C5110x, Map<String, Object>>) C4965ab.this.onInstallConversionDataLoadedNative, true);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            int unused2 = C4965ab.this.onDeepLinkingNative = 0;
                            boolean unused3 = C4965ab.this.onAppOpenAttributionNative = false;
                        }
                    });
                }
            }
        };
        this.getLevel = new Runnable() {
            public final void run() {
                synchronized (C4965ab.this.valueOf) {
                    C4965ab abVar = C4965ab.this;
                    if (abVar.values) {
                        abVar.AFInAppEventParameterName.removeCallbacks(abVar.AFKeystoreWrapper);
                        C4965ab abVar2 = C4965ab.this;
                        abVar2.AFInAppEventParameterName.removeCallbacks(abVar2.AFInAppEventType);
                        C4965ab abVar3 = C4965ab.this;
                        abVar3.AppsFlyer2dXConversionCallback.execute(new Runnable() {
                            public final void run() {
                                try {
                                    if (!C4965ab.this.onAttributionFailureNative.isEmpty()) {
                                        for (C5110x xVar : C4965ab.this.onAttributionFailureNative.values()) {
                                            C4965ab.this.onInstallConversionFailureNative.unregisterListener(xVar);
                                            xVar.AFKeystoreWrapper((Map<C5110x, Map<String, Object>>) C4965ab.this.onInstallConversionDataLoadedNative, true);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                int unused2 = C4965ab.this.onDeepLinkingNative = 0;
                                boolean unused3 = C4965ab.this.onAppOpenAttributionNative = false;
                            }
                        });
                        C4965ab.this.values = false;
                    }
                }
            }
        };
        this.onDeepLinkingNative = 1;
        this.onAppOpenAttribution = 0;
        this.onResponseErrorNative = new Runnable() {
            public final void run() {
                synchronized (C4965ab.this.valueOf) {
                    if (C4965ab.this.onDeepLinkingNative == 0) {
                        int unused = C4965ab.this.onDeepLinkingNative = 1;
                    }
                    C4965ab abVar = C4965ab.this;
                    abVar.AFInAppEventParameterName.postDelayed(abVar.AFInAppEventType, ((long) abVar.onDeepLinkingNative) * 500);
                }
            }
        };
        this.AppsFlyer2dXConversionCallback = Executors.newSingleThreadExecutor();
        this.onInstallConversionFailureNative = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    public static C4965ab AFKeystoreWrapper(Context context) {
        if (AFLogger$LogLevel != null) {
            return AFLogger$LogLevel;
        }
        return AFInAppEventParameterName((SensorManager) context.getApplicationContext().getSystemService("sensor"), AFVersionDeclaration);
    }

    /* access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && init.get(i);
    }

    private static C4965ab AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (AFLogger$LogLevel == null) {
            synchronized (C4965ab.class) {
                if (AFLogger$LogLevel == null) {
                    AFLogger$LogLevel = new C4965ab(sensorManager, handler);
                }
            }
        }
        return AFLogger$LogLevel;
    }

    public final List<Map<String, Object>> AFInAppEventType() {
        for (C5110x AFKeystoreWrapper2 : this.onAttributionFailureNative.values()) {
            AFKeystoreWrapper2.AFKeystoreWrapper(this.onInstallConversionDataLoadedNative, true);
        }
        Map<C5110x, Map<String, Object>> map = this.onInstallConversionDataLoadedNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
    }

    public final void valueOf() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onAppOpenAttribution;
        if (j != 0) {
            this.onDeepLinkingNative++;
            if (j - currentTimeMillis < 500) {
                this.AFInAppEventParameterName.removeCallbacks(this.AFInAppEventType);
                this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
            }
        } else {
            this.AFInAppEventParameterName.post(this.getLevel);
            this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
        }
        this.onAppOpenAttribution = currentTimeMillis;
    }

    public final List<Map<String, Object>> AFKeystoreWrapper() {
        synchronized (this.valueOf) {
            if (!this.onAttributionFailureNative.isEmpty() && this.onAppOpenAttributionNative) {
                for (C5110x AFKeystoreWrapper2 : this.onAttributionFailureNative.values()) {
                    AFKeystoreWrapper2.AFKeystoreWrapper(this.onInstallConversionDataLoadedNative, false);
                }
            }
            if (this.onInstallConversionDataLoadedNative.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
            return copyOnWriteArrayList2;
        }
    }
}
