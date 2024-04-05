package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$ScaffoldKt$lambda3$1 extends Lambda implements C19862q<C1254t1, C1302d, Integer, C19394m> {
    public static final ComposableSingletons$ScaffoldKt$lambda3$1 INSTANCE = new ComposableSingletons$ScaffoldKt$lambda3$1();

    public ComposableSingletons$ScaffoldKt$lambda3$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1254t1) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1254t1 t1Var, C1302d dVar, int i) {
        C19383o.m32797g(t1Var, "it");
        if ((i & 14) == 0) {
            i |= dVar.mo5408I(t1Var) ? 4 : 2;
        }
        if ((i & 91) != 18 || !dVar.mo5442i()) {
            SnackbarHostKt.m2226b(t1Var, (C1436d) null, (C19862q<? super C1251s1, ? super C1302d, ? super Integer, C19394m>) null, dVar, i & 14, 6);
        } else {
            dVar.mo5396C();
        }
    }
}
