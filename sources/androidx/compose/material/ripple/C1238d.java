package androidx.compose.material.ripple;

import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.C0872q;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1415u;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7284d;

/* renamed from: androidx.compose.material.ripple.d */
public abstract class C1238d implements C0871p {

    /* renamed from: a */
    public final boolean f2588a;

    /* renamed from: b */
    public final float f2589b;

    /* renamed from: c */
    public final C1342k1<C1545s> f2590c;

    public C1238d() {
        throw null;
    }

    public C1238d(boolean z, float f, C1338j0 j0Var) {
        this.f2588a = z;
        this.f2589b = f;
        this.f2590c = j0Var;
    }

    /* renamed from: a */
    public final C0872q mo3872a(C0639i iVar, C1302d dVar) {
        C19383o.m32797g(iVar, "interactionSource");
        dVar.mo5465u(988743187);
        C1245k kVar = (C1245k) dVar.mo5410J(RippleThemeKt.f2573a);
        dVar.mo5465u(-1524341038);
        long a = (this.f2590c.getValue().f3366a > C1545s.f3364i ? 1 : (this.f2590c.getValue().f3366a == C1545s.f3364i ? 0 : -1)) != 0 ? this.f2590c.getValue().f3366a : kVar.mo5326a(dVar);
        dVar.mo5406H();
        C1243i b = mo5328b(iVar, this.f2588a, this.f2589b, C0761x.m1664E0(new C1545s(a), dVar), C0761x.m1664E0(kVar.mo5327b(dVar), dVar), dVar);
        C1415u.m3030d(b, iVar, new Ripple$rememberUpdatedInstance$1(iVar, b, (C19340c<? super Ripple$rememberUpdatedInstance$1>) null), dVar);
        dVar.mo5406H();
        return b;
    }

    /* renamed from: b */
    public abstract C1243i mo5328b(C0639i iVar, boolean z, float f, C1338j0 j0Var, C1338j0 j0Var2, C1302d dVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1238d)) {
            return false;
        }
        C1238d dVar = (C1238d) obj;
        return this.f2588a == dVar.f2588a && C7284d.m13983a(this.f2589b, dVar.f2589b) && C19383o.m32792b(this.f2590c, dVar.f2590c);
    }

    public final int hashCode() {
        return this.f2590c.hashCode() + C0023f.m104c(this.f2589b, Boolean.hashCode(this.f2588a) * 31, 31);
    }
}
