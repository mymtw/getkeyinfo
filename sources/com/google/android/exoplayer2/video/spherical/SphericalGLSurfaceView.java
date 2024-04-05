package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import androidx.core.widget.C2399d;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.video.spherical.C14443a;
import com.google.android.exoplayer2.video.spherical.C14445b;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p204p1.C7649a;
import p513bj.C14049b0;
import p513bj.C14085x;
import p520cj.C14154h;
import p548dj.C17560a;
import p548dj.C17562c;
import p548dj.C17563d;
import p548dj.C17567f;
import p548dj.C17570h;

public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    public static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final Handler mainHandler;
    private final C14443a orientationListener;
    private final Sensor orientationSensor;
    private final C17570h scene;
    private final SensorManager sensorManager;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final C14445b touchTracker;
    private boolean useSensorRotation;
    private final CopyOnWriteArrayList<C14442b> videoSurfaceListeners;

    /* renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$a */
    public final class C14441a implements GLSurfaceView.Renderer, C14445b.C14446a, C14443a.C14444a {

        /* renamed from: b */
        public final C17570h f32549b;

        /* renamed from: c */
        public final float[] f32550c = new float[16];

        /* renamed from: d */
        public final float[] f32551d = new float[16];

        /* renamed from: e */
        public final float[] f32552e;

        /* renamed from: f */
        public final float[] f32553f;

        /* renamed from: g */
        public final float[] f32554g;

        /* renamed from: h */
        public float f32555h;

        /* renamed from: i */
        public float f32556i;

        /* renamed from: j */
        public final float[] f32557j;

        /* renamed from: k */
        public final float[] f32558k;

        public C14441a(C17570h hVar) {
            float[] fArr = new float[16];
            this.f32552e = fArr;
            float[] fArr2 = new float[16];
            this.f32553f = fArr2;
            float[] fArr3 = new float[16];
            this.f32554g = fArr3;
            this.f32557j = new float[16];
            this.f32558k = new float[16];
            this.f32549b = hVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f32556i = 3.1415927f;
        }

        /* renamed from: a */
        public final synchronized void mo48206a(float[] fArr, float f) {
            float[] fArr2 = this.f32552e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f32556i = f2;
            Matrix.setRotateM(this.f32553f, 0, -this.f32555h, (float) Math.cos((double) f2), (float) Math.sin((double) this.f32556i), 0.0f);
        }

        /* JADX INFO: finally extract failed */
        public final void onDrawFrame(GL10 gl10) {
            Long d;
            C17563d d2;
            float[] d3;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f32558k, 0, this.f32552e, 0, this.f32554g, 0);
                Matrix.multiplyMM(this.f32557j, 0, this.f32553f, 0, this.f32558k, 0);
            }
            Matrix.multiplyMM(this.f32551d, 0, this.f32550c, 0, this.f32557j, 0);
            C17570h hVar = this.f32549b;
            float[] fArr2 = this.f32551d;
            hVar.getClass();
            GLES20.glClear(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
            C15588c1.m25292M();
            if (hVar.f38429b.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = hVar.f38438k;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                C15588c1.m25292M();
                if (hVar.f38430c.compareAndSet(true, false)) {
                    Matrix.setIdentityM(hVar.f38435h, 0);
                }
                long timestamp = hVar.f38438k.getTimestamp();
                C14085x<Long> xVar = hVar.f38433f;
                synchronized (xVar) {
                    try {
                        d = xVar.mo46955d(timestamp, false);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Long l = d;
                if (l != null) {
                    C17562c cVar = hVar.f38432e;
                    float[] fArr3 = hVar.f38435h;
                    long longValue = l.longValue();
                    C14085x<float[]> xVar2 = cVar.f38400c;
                    synchronized (xVar2) {
                        try {
                            d3 = xVar2.mo46955d(longValue, true);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    float[] fArr4 = d3;
                    if (fArr4 != null) {
                        float[] fArr5 = cVar.f38399b;
                        float f = fArr4[0];
                        float f2 = -fArr4[1];
                        float f3 = -fArr4[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!cVar.f38401d) {
                            C17562c.m29435a(cVar.f38398a, cVar.f38399b);
                            cVar.f38401d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, cVar.f38398a, 0, cVar.f38399b, 0);
                    }
                }
                C14085x<C17563d> xVar3 = hVar.f38434g;
                synchronized (xVar3) {
                    try {
                        d2 = xVar3.mo46955d(timestamp, true);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C17563d dVar = d2;
                if (dVar != null) {
                    C17567f fVar = hVar.f38431d;
                    fVar.getClass();
                    if (C17567f.m29437a(dVar)) {
                        fVar.f38416a = dVar.f38404c;
                        fVar.f38417b = new C17567f.C17568a(dVar.f38402a.f38406a[0]);
                        if (!dVar.f38405d) {
                            C17563d.C17565b bVar = dVar.f38403b.f38406a[0];
                            float[] fArr6 = bVar.f38409c;
                            int length2 = fArr6.length / 3;
                            C15588c1.m25302R(fArr6);
                            C15588c1.m25302R(bVar.f38410d);
                            int i = bVar.f38408b;
                        }
                    }
                }
            }
            Matrix.multiplyMM(hVar.f38436i, 0, fArr2, 0, hVar.f38435h, 0);
            C17567f fVar2 = hVar.f38431d;
            int i2 = hVar.f38437j;
            float[] fArr7 = hVar.f38436i;
            C17567f.C17568a aVar = fVar2.f38417b;
            if (aVar != null) {
                GLES20.glUseProgram(fVar2.f38418c);
                C15588c1.m25292M();
                GLES20.glEnableVertexAttribArray(fVar2.f38421f);
                GLES20.glEnableVertexAttribArray(fVar2.f38422g);
                C15588c1.m25292M();
                int i3 = fVar2.f38416a;
                GLES20.glUniformMatrix3fv(fVar2.f38420e, 1, false, i3 == 1 ? C17567f.f38414l : i3 == 2 ? C17567f.f38415m : C17567f.f38413k, 0);
                GLES20.glUniformMatrix4fv(fVar2.f38419d, 1, false, fArr7, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, i2);
                GLES20.glUniform1i(fVar2.f38423h, 0);
                C15588c1.m25292M();
                GLES20.glVertexAttribPointer(fVar2.f38421f, 3, 5126, false, 12, aVar.f38425b);
                C15588c1.m25292M();
                GLES20.glVertexAttribPointer(fVar2.f38422g, 2, 5126, false, 8, aVar.f38426c);
                C15588c1.m25292M();
                GLES20.glDrawArrays(aVar.f38427d, 0, aVar.f38424a);
                C15588c1.m25292M();
                GLES20.glDisableVertexAttribArray(fVar2.f38421f);
                GLES20.glDisableVertexAttribArray(fVar2.f38422g);
            }
        }

        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            boolean z = false;
            GLES20.glViewport(0, 0, i, i2);
            float f = ((float) i) / ((float) i2);
            if (f > 1.0f) {
                z = true;
            }
            Matrix.perspectiveM(this.f32550c, 0, z ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, SphericalGLSurfaceView.Z_FAR);
        }

        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.onSurfaceTextureAvailable(this.f32549b.mo68900d());
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b */
    public interface C14442b {
        /* renamed from: c */
        void mo48210c(Surface surface);

        /* renamed from: j */
        void mo48211j();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onDetachedFromWindow$0() {
        Surface surface2 = this.surface;
        if (surface2 != null) {
            Iterator<C14442b> it = this.videoSurfaceListeners.iterator();
            while (it.hasNext()) {
                it.next().mo48211j();
            }
        }
        releaseSurface(this.surfaceTexture, surface2);
        this.surfaceTexture = null;
        this.surface = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSurfaceTextureAvailable$1(SurfaceTexture surfaceTexture2) {
        SurfaceTexture surfaceTexture3 = this.surfaceTexture;
        Surface surface2 = this.surface;
        Surface surface3 = new Surface(surfaceTexture2);
        this.surfaceTexture = surfaceTexture2;
        this.surface = surface3;
        Iterator<C14442b> it = this.videoSurfaceListeners.iterator();
        while (it.hasNext()) {
            it.next().mo48210c(surface3);
        }
        releaseSurface(surfaceTexture3, surface2);
    }

    /* access modifiers changed from: private */
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture2) {
        this.mainHandler.post(new C7649a(4, this, surfaceTexture2));
    }

    private static void releaseSurface(SurfaceTexture surfaceTexture2, Surface surface2) {
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface2 != null) {
            surface2.release();
        }
    }

    private void updateOrientationListenerRegistration() {
        boolean z = this.useSensorRotation && this.isStarted;
        Sensor sensor = this.orientationSensor;
        if (sensor != null && z != this.isOrientationListenerRegistered) {
            if (z) {
                this.sensorManager.registerListener(this.orientationListener, sensor, 0);
            } else {
                this.sensorManager.unregisterListener(this.orientationListener);
            }
            this.isOrientationListenerRegistered = z;
        }
    }

    public void addVideoSurfaceListener(C14442b bVar) {
        this.videoSurfaceListeners.add(bVar);
    }

    public C17560a getCameraMotionListener() {
        return this.scene;
    }

    public C14154h getVideoFrameMetadataListener() {
        return this.scene;
    }

    public Surface getVideoSurface() {
        return this.surface;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new C2399d(this, 8));
    }

    public void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }

    public void removeVideoSurfaceListener(C14442b bVar) {
        this.videoSurfaceListeners.remove(bVar);
    }

    public void setDefaultStereoMode(int i) {
        this.scene.f38439l = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.useSensorRotation = z;
        updateOrientationListenerRegistration();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager2 = (SensorManager) systemService;
        this.sensorManager = sensorManager2;
        Sensor defaultSensor = C14049b0.f30913a >= 18 ? sensorManager2.getDefaultSensor(15) : null;
        this.orientationSensor = defaultSensor == null ? sensorManager2.getDefaultSensor(11) : defaultSensor;
        C17570h hVar = new C17570h();
        this.scene = hVar;
        C14441a aVar = new C14441a(hVar);
        C14445b bVar = new C14445b(context, aVar);
        this.touchTracker = bVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.orientationListener = new C14443a(windowManager.getDefaultDisplay(), bVar, aVar);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }
}
