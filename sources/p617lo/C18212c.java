package p617lo;

import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.google.android.gms.internal.measurement.C14598c3;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import p145io.C17877a;
import p388lb.C13006a;
import p577go.C17805c;
import p585ho.C17836b;
import p585ho.C17837c;

/* renamed from: lo.c */
public final class C18212c implements C18213d {

    /* renamed from: a */
    public final boolean f39915a;

    /* renamed from: b */
    public C18214e f39916b;

    /* renamed from: c */
    public C14598c3 f39917c;

    /* renamed from: d */
    public ArrayList f39918d;

    /* renamed from: e */
    public float[] f39919e = new float[16];

    /* renamed from: f */
    public boolean f39920f;

    public C18212c() {
        ArrayList arrayList = new ArrayList();
        this.f39918d = arrayList;
        this.f39915a = false;
        arrayList.add(new C17877a());
    }

    /* renamed from: a */
    public final void mo69738a(C17805c cVar, long j) {
        C18214e eVar = this.f39916b;
        synchronized (eVar.f39924e) {
            while (!eVar.f39925f) {
                try {
                    eVar.f39924e.wait(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);
                    if (!eVar.f39925f) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            eVar.f39925f = false;
        }
        C13006a.m20718g("before updateTexImage");
        eVar.f39921b.updateTexImage();
        if (!this.f39920f) {
            Iterator it = this.f39918d.iterator();
            while (it.hasNext()) {
                C17836b bVar = (C17836b) it.next();
                if (bVar instanceof C17837c) {
                    C18214e eVar2 = this.f39916b;
                    int i = eVar2.f39923d;
                    float[] fArr = new float[16];
                    eVar2.f39921b.getTransformMatrix(fArr);
                    ((C17837c) bVar).mo69073c(fArr, i);
                }
            }
            this.f39920f = true;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        Iterator it2 = this.f39918d.iterator();
        while (it2.hasNext()) {
            ((C17836b) it2.next()).apply();
        }
        GLES20.glFinish();
        C14598c3 c3Var = this.f39917c;
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) c3Var.f32778a, (EGLSurface) c3Var.f32780c, j);
        C14598c3 c3Var2 = this.f39917c;
        EGL14.eglSwapBuffers((EGLDisplay) c3Var2.f32778a, (EGLSurface) c3Var2.f32780c);
    }

    /* renamed from: b */
    public final boolean mo69739b() {
        return this.f39915a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[LOOP:0: B:31:0x00d0->B:33:0x00d6, LOOP_END] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69740c(android.view.Surface r28, android.media.MediaFormat r29, android.media.MediaFormat r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            if (r1 == 0) goto L_0x00f3
            if (r3 == 0) goto L_0x00eb
            java.lang.String r4 = "rotation-degrees"
            boolean r5 = r3.containsKey(r4)
            r6 = 0
            if (r5 == 0) goto L_0x001a
            int r2 = r3.getInteger(r4)
            goto L_0x0028
        L_0x001a:
            if (r2 == 0) goto L_0x0027
            boolean r5 = r2.containsKey(r4)
            if (r5 == 0) goto L_0x0027
            int r2 = r2.getInteger(r4)
            goto L_0x0028
        L_0x0027:
            r2 = r6
        L_0x0028:
            java.lang.String r4 = "width"
            boolean r5 = r3.containsKey(r4)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = "height"
            boolean r8 = r3.containsKey(r5)
            if (r8 == 0) goto L_0x0047
            int r4 = r3.getInteger(r4)
            float r4 = (float) r4
            int r3 = r3.getInteger(r5)
            float r3 = (float) r3
            float r4 = r4 / r3
            r11 = r4
            goto L_0x0048
        L_0x0047:
            r11 = r7
        L_0x0048:
            com.google.android.gms.internal.measurement.c3 r3 = new com.google.android.gms.internal.measurement.c3
            r3.<init>(r1)
            r0.f39917c = r3
            lo.e r1 = new lo.e
            r1.<init>()
            r0.f39916b = r1
            r1 = 16
            float[] r3 = new float[r1]
            android.opengl.Matrix.setIdentityM(r3, r6)
            float r10 = -r11
            r9 = 0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            android.opengl.Matrix.orthoM(r8, r9, r10, r11, r12, r13, r14, r15)
            float[] r1 = new float[r1]
            android.opengl.Matrix.setIdentityM(r1, r6)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            if (r2 == 0) goto L_0x00a1
            r8 = 90
            if (r2 == r8) goto L_0x009c
            r7 = 180(0xb4, float:2.52E-43)
            if (r2 == r7) goto L_0x009a
            r8 = 270(0x10e, float:3.78E-43)
            if (r2 == r8) goto L_0x0098
            int r2 = r2 / r7
            double r4 = (double) r2
            r7 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = r4 * r7
            double r7 = java.lang.Math.sin(r4)
            float r2 = (float) r7
            double r4 = java.lang.Math.cos(r4)
            float r4 = (float) r4
            r24 = r2
            r25 = r4
            goto L_0x00a5
        L_0x0098:
            r7 = r4
            goto L_0x009c
        L_0x009a:
            r7 = r4
            goto L_0x00a1
        L_0x009c:
            r25 = r5
            r24 = r7
            goto L_0x00a5
        L_0x00a1:
            r24 = r5
            r25 = r7
        L_0x00a5:
            r2 = 0
            r18 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r17 = 0
            r16 = r1
            android.opengl.Matrix.setLookAtM(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            float[] r4 = r0.f39919e
            android.opengl.Matrix.setIdentityM(r4, r6)
            float[] r12 = r0.f39919e
            r13 = 0
            r15 = 0
            r14 = r3
            r17 = r2
            android.opengl.Matrix.multiplyMM(r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r1 = r0.f39918d
            java.util.Iterator r1 = r1.iterator()
        L_0x00d0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r2 = r1.next()
            ho.b r2 = (p585ho.C17836b) r2
            r2.mo69069a()
            float[] r3 = r0.f39919e
            int r4 = r3.length
            float[] r3 = java.util.Arrays.copyOf(r3, r4)
            r2.mo69071b(r3)
            goto L_0x00d0
        L_0x00ea:
            return
        L_0x00eb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "GlVideoRenderer requires target media format"
            r1.<init>(r2)
            throw r1
        L_0x00f3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "GlVideoRenderer requires an output surface"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p617lo.C18212c.mo69740c(android.view.Surface, android.media.MediaFormat, android.media.MediaFormat):void");
    }

    /* renamed from: d */
    public final void mo69741d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
    }

    public final void release() {
        Iterator it = this.f39918d.iterator();
        while (it.hasNext()) {
            ((C17836b) it.next()).release();
        }
        C18214e eVar = this.f39916b;
        Surface surface = eVar.f39922c;
        if (surface != null) {
            surface.release();
            eVar.f39922c = null;
        }
        C14598c3 c3Var = this.f39917c;
        EGLDisplay eGLDisplay = (EGLDisplay) c3Var.f32778a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) c3Var.f32780c);
            EGL14.eglDestroyContext((EGLDisplay) c3Var.f32778a, (EGLContext) c3Var.f32779b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) c3Var.f32778a);
            c3Var.f32778a = EGL14.EGL_NO_DISPLAY;
            c3Var.f32779b = EGL14.EGL_NO_CONTEXT;
            c3Var.f32780c = EGL14.EGL_NO_SURFACE;
        }
        Surface surface2 = (Surface) c3Var.f32781d;
        if (surface2 != null) {
            surface2.release();
            c3Var.f32781d = null;
        }
    }
}
