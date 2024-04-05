package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p228s.C7792d;
import p239t.C7915c;
import p239t.C7917e;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements C19861p<C1302d, Integer, C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>>> {
    public final /* synthetic */ C7792d<C1340k<Object>, C1342k1<Object>> $parentScope;
    public final /* synthetic */ C1412t0<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$startProviders$currentProviders$1(C1412t0<?>[] t0VarArr, C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar) {
        super(2);
        this.$values = t0VarArr;
        this.$parentScope = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1302d) obj, ((Number) obj2).intValue());
    }

    public final C7792d<C1340k<Object>, C1342k1<Object>> invoke(C1302d dVar, int i) {
        dVar.mo5465u(935231726);
        C1412t0<?>[] t0VarArr = this.$values;
        C7792d<C1340k<Object>, C1342k1<Object>> dVar2 = this.$parentScope;
        C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> qVar = ComposerKt.f2748a;
        dVar.mo5465u(721128344);
        C7915c cVar = C7915c.f17371d;
        cVar.getClass();
        C7917e eVar = new C7917e(cVar);
        for (C1412t0<?> t0Var : t0VarArr) {
            if (!t0Var.f3072c) {
                C1340k<T> kVar = t0Var.f3070a;
                C19383o.m32797g(dVar2, "<this>");
                C19383o.m32797g(kVar, "key");
                if (dVar2.containsKey(kVar)) {
                }
            }
            C1340k<T> kVar2 = t0Var.f3070a;
            eVar.put(kVar2, kVar2.mo5888a(t0Var.f3071b, dVar));
        }
        C7915c e = eVar.mo20417e();
        dVar.mo5406H();
        dVar.mo5406H();
        return e;
    }
}
