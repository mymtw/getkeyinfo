package androidx.compose.p015ui;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.focus.C1466b;
import androidx.compose.p015ui.focus.C1479m;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.ComposedModifierKt */
public final class ComposedModifierKt {

    /* renamed from: a */
    public static final C19862q<C1466b, C1302d, Integer, C1436d> f3101a = ComposedModifierKt$WrapFocusEventModifier$1.INSTANCE;

    /* renamed from: b */
    public static final C19862q<C1479m, C1302d, Integer, C1436d> f3102b = ComposedModifierKt$WrapFocusRequesterModifier$1.INSTANCE;

    /* renamed from: a */
    public static final C1436d m3049a(C1436d dVar, C19857l<? super C1859o0, C19394m> lVar, C19862q<? super C1436d, ? super C1302d, ? super Integer, ? extends C1436d> qVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "inspectorInfo");
        C19383o.m32797g(qVar, "factory");
        return dVar.mo6148i0(new C1435c(lVar, qVar));
    }

    /* renamed from: c */
    public static final C1436d m3051c(C1302d dVar, C1436d dVar2) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(dVar2, "modifier");
        if (dVar2.mo6116c(ComposedModifierKt$materialize$1.INSTANCE)) {
            return dVar2;
        }
        dVar.mo5465u(1219399079);
        int i = C1436d.f3124a0;
        C1436d dVar3 = (C1436d) dVar2.mo6119i(C1436d.C1437a.f3125b, new ComposedModifierKt$materialize$result$1(dVar));
        dVar.mo5406H();
        return dVar3;
    }
}
