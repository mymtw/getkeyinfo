package p609ko;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: ko.a */
public final class C18157a implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a */
    public final int[] f39654a;

    /* renamed from: b */
    public final int f39655b = 8;

    /* renamed from: c */
    public final int f39656c = 8;

    /* renamed from: d */
    public final int f39657d = 8;

    public C18157a() {
        int[] iArr = new int[15];
        System.arraycopy(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, 0, iArr, 0, 12);
        iArr[12] = 12352;
        iArr[13] = 4;
        iArr[14] = 12344;
        this.f39654a = iArr;
    }

    /* renamed from: a */
    public static int m30658a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, this.f39654a, (EGLConfig[]) null, 0, iArr)) {
            int i = 0;
            int i2 = iArr[0];
            if (i2 > 0) {
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (egl10.eglChooseConfig(eGLDisplay, this.f39654a, eGLConfigArr, i2, iArr)) {
                    while (true) {
                        if (i >= i2) {
                            eGLConfig = null;
                            break;
                        }
                        eGLConfig = eGLConfigArr[i];
                        int a = m30658a(egl10, eGLDisplay, eGLConfig, 12325);
                        int a2 = m30658a(egl10, eGLDisplay, eGLConfig, 12326);
                        if (a >= 0 && a2 >= 0) {
                            int a3 = m30658a(egl10, eGLDisplay, eGLConfig, 12324);
                            int a4 = m30658a(egl10, eGLDisplay, eGLConfig, 12323);
                            int a5 = m30658a(egl10, eGLDisplay, eGLConfig, 12322);
                            int a6 = m30658a(egl10, eGLDisplay, eGLConfig, 12321);
                            if (a3 == this.f39655b && a4 == this.f39656c && a5 == this.f39657d && a6 == 0) {
                                break;
                            }
                        }
                        i++;
                    }
                    if (eGLConfig != null) {
                        return eGLConfig;
                    }
                    throw new IllegalArgumentException("No config chosen");
                }
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new IllegalArgumentException("No configs match configSpec");
        }
        throw new IllegalArgumentException("eglChooseConfig failed");
    }
}
