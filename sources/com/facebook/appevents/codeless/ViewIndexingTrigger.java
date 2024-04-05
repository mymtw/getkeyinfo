package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.C19383o;
import p401mg.C13080a;

public final class ViewIndexingTrigger implements SensorEventListener {
    public static final C12219a Companion = new C12219a();
    private static final double SHAKE_THRESHOLD_GRAVITY = 2.3d;
    private C12220b onShakeListener;

    /* renamed from: com.facebook.appevents.codeless.ViewIndexingTrigger$a */
    public static final class C12219a {
    }

    /* renamed from: com.facebook.appevents.codeless.ViewIndexingTrigger$b */
    public interface C12220b {
        /* renamed from: a */
        void mo39315a();
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(sensor, "sensor");
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!C13080a.m20762b(this)) {
            try {
                C19383o.m32797g(sensorEvent, "event");
                C12220b bVar = this.onShakeListener;
                if (bVar != null) {
                    float[] fArr = sensorEvent.values;
                    float f = fArr[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (fArr[1] / 9.80665f);
                    double d3 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > SHAKE_THRESHOLD_GRAVITY) {
                        bVar.mo39315a();
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public final void setOnShakeListener(C12220b bVar) {
        if (!C13080a.m20762b(this)) {
            try {
                this.onShakeListener = bVar;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
