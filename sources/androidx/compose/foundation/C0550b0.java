package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.C0547a0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7282b;
import p288y.C8343c;
import p288y.C8347f;

/* renamed from: androidx.compose.foundation.b0 */
public final class C0550b0 implements C1033z {

    /* renamed from: a */
    public static final C0550b0 f1292a = new C0550b0();

    /* renamed from: androidx.compose.foundation.b0$a */
    public static final class C0551a extends C0547a0.C0548a {
        public C0551a(Magnifier magnifier) {
            super(magnifier);
        }

        /* renamed from: c */
        public final void mo3710c(long j, float f, long j2) {
            if (!Float.isNaN(f)) {
                this.f1291a.setZoom(f);
            }
            if (C19421p.m32928R(j2)) {
                this.f1291a.show(C8343c.m16642c(j), C8343c.m16643d(j), C8343c.m16642c(j2), C8343c.m16643d(j2));
            } else {
                this.f1291a.show(C8343c.m16642c(j), C8343c.m16643d(j));
            }
        }
    }

    /* renamed from: a */
    public final C1032y mo3706a(C0894t tVar, View view, C7282b bVar, float f) {
        C19383o.m32797g(tVar, "style");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(bVar, "density");
        if (C19383o.m32792b(tVar, C0894t.f1897h)) {
            return new C0551a(new Magnifier(view));
        }
        long w = bVar.mo3799w(tVar.f1899b);
        float B0 = bVar.mo3789B0(tVar.f1900c);
        float B02 = bVar.mo3789B0(tVar.f1901d);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (w != C8347f.f18314c) {
            builder.setSize(C7279a.m13954l(C8347f.m16656d(w)), C7279a.m13954l(C8347f.m16654b(w)));
        }
        if (!Float.isNaN(B0)) {
            builder.setCornerRadius(B0);
        }
        if (!Float.isNaN(B02)) {
            builder.setElevation(B02);
        }
        if (!Float.isNaN(f)) {
            builder.setInitialZoom(f);
        }
        builder.setClippingEnabled(tVar.f1902e);
        Magnifier build = builder.build();
        C19383o.m32796f(build, "Builder(view).run {\n    …    build()\n            }");
        return new C0551a(build);
    }

    /* renamed from: b */
    public final boolean mo3707b() {
        return true;
    }
}
