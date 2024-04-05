package com.google.android.gms.internal.measurement;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.support.p013v4.media.C0073e;
import android.view.Surface;
import com.bumptech.glide.load.resource.bitmap.C6077b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c3 */
public final class C14598c3 {

    /* renamed from: a */
    public Object f32778a;

    /* renamed from: b */
    public Object f32779b;

    /* renamed from: c */
    public Object f32780c;

    /* renamed from: d */
    public Object f32781d;

    public /* synthetic */ C14598c3(C14598c3 c3Var, C6077b bVar) {
        this.f32780c = new HashMap();
        this.f32781d = new HashMap();
        this.f32778a = c3Var;
        this.f32779b = bVar;
    }

    /* renamed from: a */
    public static void m23385a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder k = C0073e.m211k(str, ": EGL error: 0x");
            k.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(k.toString());
        }
    }

    /* renamed from: b */
    public final C14598c3 mo50399b() {
        return new C14598c3(this, (C6077b) this.f32779b);
    }

    /* renamed from: c */
    public final C14763p mo50400c(C14763p pVar) {
        return ((C6077b) this.f32779b).mo17028c(this, pVar);
    }

    /* renamed from: d */
    public final C14763p mo50401d(C14633f fVar) {
        C14763p pVar = C14763p.f33033g0;
        Iterator<Integer> p = fVar.mo50493p();
        while (p.hasNext()) {
            pVar = ((C6077b) this.f32779b).mo17028c(this, fVar.mo50491n(p.next().intValue()));
            if (pVar instanceof C14659h) {
                break;
            }
        }
        return pVar;
    }

    /* renamed from: e */
    public final C14763p mo50402e(String str) {
        if (((Map) this.f32780c).containsKey(str)) {
            return (C14763p) ((Map) this.f32780c).get(str);
        }
        C14598c3 c3Var = (C14598c3) this.f32778a;
        if (c3Var != null) {
            return c3Var.mo50402e(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: f */
    public final void mo50403f(String str, C14763p pVar) {
        if (!((Map) this.f32781d).containsKey(str)) {
            if (pVar == null) {
                ((Map) this.f32780c).remove(str);
            } else {
                ((Map) this.f32780c).put(str, pVar);
            }
        }
    }

    /* renamed from: g */
    public final void mo50404g(String str, C14763p pVar) {
        C14598c3 c3Var;
        if (!((Map) this.f32780c).containsKey(str) && (c3Var = (C14598c3) this.f32778a) != null && c3Var.mo50405h(str)) {
            ((C14598c3) this.f32778a).mo50404g(str, pVar);
        } else if (!((Map) this.f32781d).containsKey(str)) {
            if (pVar == null) {
                ((Map) this.f32780c).remove(str);
            } else {
                ((Map) this.f32780c).put(str, pVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo50405h(String str) {
        if (((Map) this.f32780c).containsKey(str)) {
            return true;
        }
        C14598c3 c3Var = (C14598c3) this.f32778a;
        if (c3Var != null) {
            return c3Var.mo50405h(str);
        }
        return false;
    }

    public C14598c3(Surface surface) {
        this.f32778a = EGL14.EGL_NO_DISPLAY;
        this.f32779b = EGL14.EGL_NO_CONTEXT;
        this.f32780c = EGL14.EGL_NO_SURFACE;
        this.f32781d = surface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f32778a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.f32778a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    this.f32779b = EGL14.eglCreateContext((EGLDisplay) this.f32778a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m23385a("eglCreateContext");
                    if (((EGLContext) this.f32779b) != null) {
                        this.f32780c = EGL14.eglCreateWindowSurface((EGLDisplay) this.f32778a, eGLConfigArr[0], (Surface) this.f32781d, new int[]{12344}, 0);
                        m23385a("eglCreateWindowSurface");
                        EGLSurface eGLSurface = (EGLSurface) this.f32780c;
                        if (eGLSurface == null) {
                            throw new RuntimeException("surface was null");
                        } else if (!EGL14.eglMakeCurrent((EGLDisplay) this.f32778a, eGLSurface, eGLSurface, (EGLContext) this.f32779b)) {
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                    } else {
                        throw new RuntimeException("null context");
                    }
                } else {
                    throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                }
            } else {
                this.f32778a = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
        } else {
            throw new RuntimeException("unable to get EGL14 display");
        }
    }
}
