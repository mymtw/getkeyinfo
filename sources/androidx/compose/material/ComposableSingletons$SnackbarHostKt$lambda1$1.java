package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements C19862q<C1251s1, C1302d, Integer, C19394m> {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    public ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1251s1) obj, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1251s1 s1Var, C1302d dVar, int i) {
        int i2;
        C1251s1 s1Var2 = s1Var;
        C19383o.m32797g(s1Var2, "it");
        C1302d dVar2 = dVar;
        if ((i & 14) == 0) {
            i2 = i | (dVar2.mo5408I(s1Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !dVar.mo5442i()) {
            SnackbarKt.m2228b(s1Var, (C1436d) null, false, (C1530k0) null, 0, 0, 0, 0.0f, dVar, i2 & 14, 254);
        } else {
            dVar.mo5396C();
        }
    }
}
