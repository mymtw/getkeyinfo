package p609ko;

import android.opengl.GLSurfaceView;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: ko.b */
public final class C18158b implements GLSurfaceView.EGLContextFactory {
    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            Log.e("EContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            StringBuilder h = C0072d.m201h("eglDestroyContex");
            h.append(egl10.eglGetError());
            throw new RuntimeException(h.toString());
        }
    }
}
