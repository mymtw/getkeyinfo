package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p297z.C8410c;
import p297z.C8412e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.DrawModifierKt */
public final class DrawModifierKt {
    /* renamed from: a */
    public static final C1436d m3070a(C1436d dVar, C19857l<? super C8412e, C19394m> lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(lVar, "onDraw");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1441c(lVar));
    }

    /* renamed from: b */
    public static final C1436d m3071b(C19857l lVar) {
        return ComposedModifierKt.m3049a(C1436d.C1437a.f3125b, InspectableValueKt.f4032a, new DrawModifierKt$drawWithCache$2(lVar));
    }

    /* renamed from: c */
    public static final C1436d m3072c(C1436d dVar, C19857l<? super C8410c, C19394m> lVar) {
        C19383o.m32797g(dVar, "<this>");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return dVar.mo6148i0(new C1446h(lVar));
    }
}
