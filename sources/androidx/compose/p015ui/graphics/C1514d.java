package androidx.compose.p015ui.graphics;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.d */
public final class C1514d implements C1604x {

    /* renamed from: a */
    public final Bitmap f3287a;

    public C1514d(Bitmap bitmap) {
        C19383o.m32797g(bitmap, "bitmap");
        this.f3287a = bitmap;
    }

    /* renamed from: a */
    public final void mo6319a() {
        this.f3287a.prepareToDraw();
    }

    /* renamed from: b */
    public final int mo6320b() {
        Bitmap.Config config = this.f3287a.getConfig();
        C19383o.m32796f(config, "bitmap.config");
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final int getHeight() {
        return this.f3287a.getHeight();
    }

    public final int getWidth() {
        return this.f3287a.getWidth();
    }
}
