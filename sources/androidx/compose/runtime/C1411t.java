package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.runtime.t */
public final class C1411t<T> extends C1361s0<T> {

    /* renamed from: b */
    public final C1323f1<T> f3069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1411t(C1323f1<T> f1Var, C19846a<? extends T> aVar) {
        super(aVar);
        C19383o.m32797g(f1Var, "policy");
        C19383o.m32797g(aVar, "defaultFactory");
        this.f3069b = f1Var;
    }

    /* renamed from: a */
    public final C1342k1 mo5888a(Object obj, C1302d dVar) {
        dVar.mo5465u(-84026900);
        dVar.mo5465u(-492369756);
        Object v = dVar.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0(obj, this.f3069b);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1338j0 j0Var = (C1338j0) v;
        j0Var.setValue(obj);
        dVar.mo5406H();
        return j0Var;
    }
}
