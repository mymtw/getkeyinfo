package androidx.compose.material.ripple;

import androidx.compose.foundation.C0872q;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.runtime.C1338j0;
import kotlinx.coroutines.C19525d0;
import p288y.C8347f;
import p297z.C8406a;
import p297z.C8412e;
import p297z.C8413f;

/* renamed from: androidx.compose.material.ripple.i */
public abstract class C1243i implements C0872q {

    /* renamed from: b */
    public final C1246l f2600b;

    public C1243i(boolean z, C1338j0 j0Var) {
        this.f2600b = new C1246l(z, j0Var);
    }

    /* renamed from: b */
    public abstract void mo5301b(C0643m mVar, C19525d0 d0Var);

    /* renamed from: c */
    public final void mo5336c(float f, long j, C1741h hVar) {
        C1246l lVar = this.f2600b;
        lVar.getClass();
        float a = Float.isNaN(f) ? C1240f.m2364a(hVar, lVar.f2602a, hVar.mo6913b()) : hVar.mo3789B0(f);
        float floatValue = lVar.f2604c.mo3375e().floatValue();
        if (floatValue > 0.0f) {
            long b = C1545s.m3356b(j, floatValue);
            if (lVar.f2602a) {
                float d = C8347f.m16656d(hVar.mo6913b());
                float b2 = C8347f.m16654b(hVar.mo6913b());
                C8406a.C8408b bVar = hVar.f3917b.f18423c;
                long b3 = bVar.mo20992b();
                bVar.mo20991a().mo6264r();
                bVar.f18430a.mo20995b(0.0f, 0.0f, d, b2, 1);
                C8412e.m16793y(hVar, b, a, 0, (C8413f) null, 124);
                bVar.mo20991a().mo6261m();
                bVar.mo20993c(b3);
                return;
            }
            C8412e.m16793y(hVar, b, a, 0, (C8413f) null, 124);
        }
    }

    /* renamed from: d */
    public abstract void mo5302d(C0643m mVar);
}
