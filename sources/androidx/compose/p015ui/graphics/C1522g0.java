package androidx.compose.p015ui.graphics;

import android.graphics.RenderEffect;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p288y.C8343c;

/* renamed from: androidx.compose.ui.graphics.g0 */
public final class C1522g0 {

    /* renamed from: a */
    public static final C1522g0 f3300a = new C1522g0();

    /* renamed from: a */
    public final RenderEffect mo6341a(C1520f0 f0Var, float f, float f2, int i) {
        if (f0Var == null) {
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(f, f2, C19388s.m32814C0(i));
            C19383o.m32796f(createBlurEffect, "{\n            android.gr…)\n            )\n        }");
            return createBlurEffect;
        }
        RenderEffect renderEffect = f0Var.f3295a;
        if (renderEffect == null) {
            renderEffect = f0Var.mo6337a();
            f0Var.f3295a = renderEffect;
        }
        RenderEffect createBlurEffect2 = RenderEffect.createBlurEffect(f, f2, renderEffect, C19388s.m32814C0(i));
        C19383o.m32796f(createBlurEffect2, "{\n            android.gr…)\n            )\n        }");
        return createBlurEffect2;
    }

    /* renamed from: b */
    public final RenderEffect mo6342b(C1520f0 f0Var, long j) {
        if (f0Var == null) {
            RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(C8343c.m16642c(j), C8343c.m16643d(j));
            C19383o.m32796f(createOffsetEffect, "{\n            android.gr…et.x, offset.y)\n        }");
            return createOffsetEffect;
        }
        float c = C8343c.m16642c(j);
        float d = C8343c.m16643d(j);
        RenderEffect renderEffect = f0Var.f3295a;
        if (renderEffect == null) {
            renderEffect = f0Var.mo6337a();
            f0Var.f3295a = renderEffect;
        }
        RenderEffect createOffsetEffect2 = RenderEffect.createOffsetEffect(c, d, renderEffect);
        C19383o.m32796f(createOffsetEffect2, "{\n            android.gr…)\n            )\n        }");
        return createOffsetEffect2;
    }
}
