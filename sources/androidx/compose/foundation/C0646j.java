package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0634d;
import androidx.compose.foundation.interaction.C0637g;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.interaction.C0645o;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;
import p297z.C8412e;

/* renamed from: androidx.compose.foundation.j */
public final class C0646j implements C0871p {

    /* renamed from: a */
    public static final C0646j f1383a = new C0646j();

    /* renamed from: androidx.compose.foundation.j$a */
    public static final class C0647a implements C0872q {

        /* renamed from: b */
        public final C1342k1<Boolean> f1384b;

        /* renamed from: c */
        public final C1342k1<Boolean> f1385c;

        /* renamed from: d */
        public final C1342k1<Boolean> f1386d;

        public C0647a(C1338j0 j0Var, C1338j0 j0Var2, C1338j0 j0Var3) {
            C19383o.m32797g(j0Var, "isPressed");
            C19383o.m32797g(j0Var2, "isHovered");
            C19383o.m32797g(j0Var3, "isFocused");
            this.f1384b = j0Var;
            this.f1385c = j0Var2;
            this.f1386d = j0Var3;
        }

        /* renamed from: a */
        public final void mo3873a(C1741h hVar) {
            hVar.mo6911O0();
            if (this.f1384b.getValue().booleanValue()) {
                C8412e.m16785N(hVar, C1545s.m3356b(C1545s.f3357b, 0.3f), 0, hVar.mo6913b(), 0.0f, 122);
            } else if (this.f1385c.getValue().booleanValue() || this.f1386d.getValue().booleanValue()) {
                C8412e.m16785N(hVar, C1545s.m3356b(C1545s.f3357b, 0.1f), 0, hVar.mo6913b(), 0.0f, 122);
            }
        }
    }

    /* renamed from: a */
    public final C0872q mo3872a(C0639i iVar, C1302d dVar) {
        C19383o.m32797g(iVar, "interactionSource");
        dVar.mo5465u(1683566979);
        C1338j0 a = C0645o.m1449a(iVar, dVar, 0);
        C1338j0 a2 = C0637g.m1442a(iVar, dVar, 0);
        C1338j0 a3 = C0634d.m1441a(iVar, dVar, 0);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(iVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0647a(a, a2, a3);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C0647a aVar = (C0647a) v;
        dVar.mo5406H();
        return aVar;
    }
}
