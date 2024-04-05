package androidx.compose.foundation.interaction;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1415u;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.interaction.o */
public final class C0645o {
    /* renamed from: a */
    public static final C1338j0 m1449a(C0639i iVar, C1302d dVar, int i) {
        C19383o.m32797g(iVar, "<this>");
        dVar.mo5465u(-1692965168);
        dVar.mo5465u(-492369756);
        Object v = dVar.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = C0761x.m1751w0(Boolean.FALSE, C1351n1.f2948a);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1338j0 j0Var = (C1338j0) v;
        C1415u.m3031e(iVar, new PressInteractionKt$collectIsPressedAsState$1(iVar, j0Var, (C19340c<? super PressInteractionKt$collectIsPressedAsState$1>) null), dVar);
        dVar.mo5406H();
        return j0Var;
    }
}
