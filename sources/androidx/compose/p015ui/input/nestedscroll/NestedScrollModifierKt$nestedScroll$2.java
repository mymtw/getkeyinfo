package androidx.compose.p015ui.input.nestedscroll;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2 */
public final class NestedScrollModifierKt$nestedScroll$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C1617a $connection;
    public final /* synthetic */ NestedScrollDispatcher $dispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierKt$nestedScroll$2(NestedScrollDispatcher nestedScrollDispatcher, C1617a aVar) {
        super(3);
        this.$dispatcher = nestedScrollDispatcher;
        this.$connection = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(410346167);
        dVar2.mo5465u(773894976);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        if (v == aVar) {
            C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar2));
            dVar2.mo5454o(mVar);
            v = mVar;
        }
        dVar2.mo5406H();
        C19525d0 d0Var = ((C1346m) v).f2939b;
        dVar2.mo5406H();
        NestedScrollDispatcher nestedScrollDispatcher = this.$dispatcher;
        dVar2.mo5465u(100475938);
        if (nestedScrollDispatcher == null) {
            dVar2.mo5465u(-492369756);
            Object v2 = dVar2.mo5467v();
            if (v2 == aVar) {
                v2 = new NestedScrollDispatcher();
                dVar2.mo5454o(v2);
            }
            dVar2.mo5406H();
            nestedScrollDispatcher = (NestedScrollDispatcher) v2;
        }
        dVar2.mo5406H();
        C1617a aVar2 = this.$connection;
        dVar2.mo5465u(1618982084);
        boolean I = dVar2.mo5408I(aVar2) | dVar2.mo5408I(nestedScrollDispatcher) | dVar2.mo5408I(d0Var);
        Object v3 = dVar2.mo5467v();
        if (I || v3 == aVar) {
            nestedScrollDispatcher.f3594b = d0Var;
            v3 = new NestedScrollModifierLocal(nestedScrollDispatcher, aVar2);
            dVar2.mo5454o(v3);
        }
        dVar2.mo5406H();
        NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) v3;
        dVar2.mo5406H();
        return nestedScrollModifierLocal;
    }
}
