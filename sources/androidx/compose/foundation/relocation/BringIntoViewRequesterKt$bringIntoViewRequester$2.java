package androidx.compose.foundation.relocation;

import androidx.activity.C0114h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.C1415u;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19862q;

public final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0882d $bringIntoViewRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterKt$bringIntoViewRequester$2(C0882d dVar) {
        super(3);
        this.$bringIntoViewRequester = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-992853993);
        C0879a w0 = C0114h.m326w0(dVar2);
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(w0);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C0883e(w0);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        final C0883e eVar = (C0883e) v;
        final C0882d dVar3 = this.$bringIntoViewRequester;
        if (dVar3 instanceof BringIntoViewRequesterImpl) {
            C1415u.m3028b(dVar3, new C19857l<C1360s, C1358r>() {

                /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$a */
                public static final class C0876a implements C1358r {

                    /* renamed from: a */
                    public final /* synthetic */ C0882d f1885a;

                    /* renamed from: b */
                    public final /* synthetic */ C0883e f1886b;

                    public C0876a(C0882d dVar, C0883e eVar) {
                        this.f1885a = dVar;
                        this.f1886b = eVar;
                    }

                    public final void dispose() {
                        ((BringIntoViewRequesterImpl) this.f1885a).f1884a.mo20241o(this.f1886b);
                    }
                }

                public final C1358r invoke(C1360s sVar) {
                    C19383o.m32797g(sVar, "$this$DisposableEffect");
                    ((BringIntoViewRequesterImpl) dVar3).f1884a.mo20232c(eVar);
                    return new C0876a(dVar3, eVar);
                }
            }, dVar2);
        }
        dVar2.mo5406H();
        return eVar;
    }
}
