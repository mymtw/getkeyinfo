package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.a0 */
public final class C0547a0 implements C1033z {

    /* renamed from: a */
    public static final C0547a0 f1290a = new C0547a0();

    /* renamed from: androidx.compose.foundation.a0$a */
    public static class C0548a implements C1032y {

        /* renamed from: a */
        public final Magnifier f1291a;

        public C0548a(Magnifier magnifier) {
            this.f1291a = magnifier;
        }

        /* renamed from: a */
        public final long mo3708a() {
            return C0761x.m1707a(this.f1291a.getWidth(), this.f1291a.getHeight());
        }

        /* renamed from: b */
        public final void mo3709b() {
            this.f1291a.update();
        }

        /* renamed from: c */
        public void mo3710c(long j, float f, long j2) {
            this.f1291a.show(C8343c.m16642c(j), C8343c.m16643d(j));
        }

        public final void dismiss() {
            this.f1291a.dismiss();
        }
    }

    /* renamed from: a */
    public final C1032y mo3706a(C0894t tVar, View view, C7282b bVar, float f) {
        C19383o.m32797g(tVar, "style");
        C19383o.m32797g(view, "view");
        C19383o.m32797g(bVar, "density");
        return new C0548a(new Magnifier(view));
    }

    /* renamed from: b */
    public final boolean mo3707b() {
        return false;
    }
}
