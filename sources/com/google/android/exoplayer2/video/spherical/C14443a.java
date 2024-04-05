package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p548dj.C17562c;

/* renamed from: com.google.android.exoplayer2.video.spherical.a */
public final class C14443a implements SensorEventListener {

    /* renamed from: a */
    public final float[] f32560a = new float[16];

    /* renamed from: b */
    public final float[] f32561b = new float[16];

    /* renamed from: c */
    public final float[] f32562c = new float[16];

    /* renamed from: d */
    public final float[] f32563d = new float[3];

    /* renamed from: e */
    public final Display f32564e;

    /* renamed from: f */
    public final C14444a[] f32565f;

    /* renamed from: g */
    public boolean f32566g;

    /* renamed from: com.google.android.exoplayer2.video.spherical.a$a */
    public interface C14444a {
        /* renamed from: a */
        void mo48206a(float[] fArr, float f);
    }

    public C14443a(Display display, C14444a... aVarArr) {
        this.f32564e = display;
        this.f32565f = aVarArr;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f32560a, sensorEvent.values);
        float[] fArr = this.f32560a;
        int rotation = this.f32564e.getRotation();
        if (rotation != 0) {
            int i = 130;
            int i2 = 129;
            if (rotation == 1) {
                i = 2;
            } else if (rotation == 2) {
                i2 = 130;
                i = 129;
            } else if (rotation == 3) {
                i2 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f32561b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f32561b, i, i2, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f32560a, 1, 131, this.f32561b);
        SensorManager.getOrientation(this.f32561b, this.f32563d);
        float f = this.f32563d[2];
        Matrix.rotateM(this.f32560a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f32560a;
        if (!this.f32566g) {
            C17562c.m29435a(this.f32562c, fArr3);
            this.f32566g = true;
        }
        float[] fArr4 = this.f32561b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f32561b, 0, this.f32562c, 0);
        float[] fArr5 = this.f32560a;
        for (C14444a a : this.f32565f) {
            a.mo48206a(fArr5, f);
        }
    }
}
