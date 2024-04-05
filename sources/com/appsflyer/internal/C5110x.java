package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.appsflyer.internal.x */
final class C5110x implements SensorEventListener {
    public long AFInAppEventParameterName;
    public final long[] AFInAppEventType = new long[2];
    private final int AFKeystoreWrapper;
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final Executor init;
    public double valueOf;
    public final float[][] values = new float[2][];

    public C5110x(Sensor sensor, Executor executor) {
        this.init = executor;
        int type = sensor.getType();
        this.AFKeystoreWrapper = type;
        String name = sensor.getName();
        String str = "";
        name = name == null ? str : name;
        this.AFLogger$LogLevel = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AFVersionDeclaration = str;
        this.AppsFlyer2dXConversionCallback = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    private boolean AFInAppEventType(int i, String str, String str2) {
        return this.AFKeystoreWrapper == i && this.AFLogger$LogLevel.equals(str) && this.AFVersionDeclaration.equals(str2);
    }

    private static List<Float> valueOf(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf2 : fArr) {
            arrayList.add(Float.valueOf(valueOf2));
        }
        return arrayList;
    }

    public final void AFKeystoreWrapper(Map<C5110x, Map<String, Object>> map, boolean z) {
        if (AFInAppEventType()) {
            map.put(this, AFKeystoreWrapper());
            if (z) {
                int length = this.values.length;
                for (int i = 0; i < length; i++) {
                    this.values[i] = null;
                }
                int length2 = this.AFInAppEventType.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventType[i2] = 0;
                }
                this.valueOf = ShadowDrawableWrapper.COS_45;
                this.AFInAppEventParameterName = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFKeystoreWrapper());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5110x)) {
            return false;
        }
        C5110x xVar = (C5110x) obj;
        return AFInAppEventType(xVar.AFKeystoreWrapper, xVar.AFLogger$LogLevel, xVar.AFVersionDeclaration);
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.init.execute(new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C5110x xVar = C5110x.this;
                float[][] fArr = xVar.values;
                float[] fArr2 = fArr[0];
                if (fArr2 == null) {
                    float[] fArr3 = fArr;
                    fArr[0] = Arrays.copyOf(fArr3, fArr3.length);
                    C5110x.this.AFInAppEventType[0] = currentTimeMillis;
                    return;
                }
                float[] fArr4 = fArr[1];
                if (fArr4 == null) {
                    float[] fArr5 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr5, fArr5.length);
                    C5110x xVar2 = C5110x.this;
                    xVar2.values[1] = copyOf;
                    xVar2.AFInAppEventType[1] = currentTimeMillis;
                    xVar2.valueOf = C5110x.AFKeystoreWrapper(fArr2, copyOf);
                    return;
                }
                long j = j;
                if (50000000 <= j - xVar.AFInAppEventParameterName) {
                    xVar.AFInAppEventParameterName = j;
                    if (Arrays.equals(fArr4, fArr)) {
                        C5110x.this.AFInAppEventType[1] = currentTimeMillis;
                        return;
                    }
                    double AFKeystoreWrapper = C5110x.AFKeystoreWrapper(fArr2, fArr);
                    C5110x xVar3 = C5110x.this;
                    if (AFKeystoreWrapper > xVar3.valueOf) {
                        float[][] fArr6 = xVar3.values;
                        float[] fArr7 = fArr;
                        fArr6[1] = Arrays.copyOf(fArr7, fArr7.length);
                        C5110x xVar4 = C5110x.this;
                        xVar4.AFInAppEventType[1] = currentTimeMillis;
                        xVar4.valueOf = AFKeystoreWrapper;
                    }
                }
            }
        });
    }

    private boolean AFInAppEventType() {
        return this.values[0] != null;
    }

    private Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFKeystoreWrapper));
        concurrentHashMap.put("sN", this.AFLogger$LogLevel);
        concurrentHashMap.put("sV", this.AFVersionDeclaration);
        float[] fArr = this.values[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.values[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    public static /* synthetic */ double AFKeystoreWrapper(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = ShadowDrawableWrapper.COS_45;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }
}
