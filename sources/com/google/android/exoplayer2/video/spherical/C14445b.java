package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.C14443a;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;

/* renamed from: com.google.android.exoplayer2.video.spherical.b */
public final class C14445b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C14443a.C14444a {

    /* renamed from: b */
    public final PointF f32567b = new PointF();

    /* renamed from: c */
    public final PointF f32568c = new PointF();

    /* renamed from: d */
    public final C14446a f32569d;

    /* renamed from: e */
    public final float f32570e;

    /* renamed from: f */
    public final GestureDetector f32571f;

    /* renamed from: g */
    public volatile float f32572g;

    /* renamed from: com.google.android.exoplayer2.video.spherical.b$a */
    public interface C14446a {
    }

    public C14445b(Context context, SphericalGLSurfaceView.C14441a aVar) {
        this.f32569d = aVar;
        this.f32570e = 25.0f;
        this.f32571f = new GestureDetector(context, this);
        this.f32572g = 3.1415927f;
    }

    /* renamed from: a */
    public final void mo48206a(float[] fArr, float f) {
        this.f32572g = -f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f32567b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f32567b.x) / this.f32570e;
        float y = motionEvent2.getY();
        PointF pointF = this.f32567b;
        float f3 = (y - pointF.y) / this.f32570e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.f32572g;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f32568c;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C14446a aVar = this.f32569d;
        PointF pointF3 = this.f32568c;
        SphericalGLSurfaceView.C14441a aVar2 = (SphericalGLSurfaceView.C14441a) aVar;
        synchronized (aVar2) {
            float f5 = pointF3.y;
            aVar2.f32555h = f5;
            Matrix.setRotateM(aVar2.f32553f, 0, -f5, (float) Math.cos((double) aVar2.f32556i), (float) Math.sin((double) aVar2.f32556i), 0.0f);
            Matrix.setRotateM(aVar2.f32554g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f32571f.onTouchEvent(motionEvent);
    }
}
