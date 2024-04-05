package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import p513bj.C14075p;

public final class DummySurface extends Surface {
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final C14439b thread;
    private boolean threadReleased;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$b */
    public static class C14439b extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        public EGLSurfaceTexture f32532b;

        /* renamed from: c */
        public Handler f32533c;

        /* renamed from: d */
        public Error f32534d;

        /* renamed from: e */
        public RuntimeException f32535e;

        /* renamed from: f */
        public DummySurface f32536f;

        public C14439b() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: a */
        public final void mo48189a(int i) {
            this.f32532b.getClass();
            this.f32532b.init(i);
            this.f32536f = new DummySurface(this, this.f32532b.getSurfaceTexture(), i != 0);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    mo48189a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C14075p.m21698j(DummySurface.TAG, "Failed to initialize dummy surface", e);
                    this.f32535e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C14075p.m21698j(DummySurface.TAG, "Failed to initialize dummy surface", e2);
                        this.f32534d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    this.f32532b.getClass();
                    this.f32532b.release();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r7 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getSecureMode(android.content.Context r7) {
        /*
            int r0 = p513bj.C14049b0.f30913a
            r1 = 24
            r2 = 12373(0x3055, float:1.7338E-41)
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            r1 = 26
            if (r0 >= r1) goto L_0x0024
            java.lang.String r5 = p513bj.C14049b0.f30915c
            java.lang.String r6 = "samsung"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = p513bj.C14049b0.f30916d
            java.lang.String r6 = "XT1650"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0024
            goto L_0x0047
        L_0x0024:
            if (r0 >= r1) goto L_0x0033
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)
            if (r7 != 0) goto L_0x0033
            goto L_0x0047
        L_0x0033:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L_0x0047
            java.lang.String r1 = "EGL_EXT_protected_content"
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x0047
            r7 = r3
            goto L_0x0048
        L_0x0047:
            r7 = r4
        L_0x0048:
            if (r7 == 0) goto L_0x0067
            r7 = 17
            if (r0 >= r7) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            android.opengl.EGLDisplay r7 = android.opengl.EGL14.eglGetDisplay(r4)
            java.lang.String r7 = android.opengl.EGL14.eglQueryString(r7, r2)
            if (r7 == 0) goto L_0x0062
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x0062
            r4 = r3
        L_0x0062:
            if (r4 == 0) goto L_0x0065
            return r3
        L_0x0065:
            r7 = 2
            return r7
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.getSecureMode(android.content.Context):int");
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!secureModeInitialized) {
                secureMode = getSecureMode(context);
                secureModeInitialized = true;
            }
            if (secureMode == 0) {
                z = false;
            }
        }
        return z;
    }

    public static DummySurface newInstanceV17(Context context, boolean z) {
        boolean z2 = false;
        C14075p.m21694f(!z || isSecureSupported(context));
        C14439b bVar = new C14439b();
        int i = z ? secureMode : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f32533c = handler;
        bVar.f32532b = new EGLSurfaceTexture(handler);
        synchronized (bVar) {
            bVar.f32533c.obtainMessage(1, i, 0).sendToTarget();
            while (bVar.f32536f == null && bVar.f32535e == null && bVar.f32534d == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f32535e;
        if (runtimeException == null) {
            Error error = bVar.f32534d;
            if (error == null) {
                DummySurface dummySurface = bVar.f32536f;
                dummySurface.getClass();
                return dummySurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                C14439b bVar = this.thread;
                bVar.f32533c.getClass();
                bVar.f32533c.sendEmptyMessage(2);
                this.threadReleased = true;
            }
        }
    }

    private DummySurface(C14439b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = bVar;
        this.secure = z;
    }
}
