package androidx.compose.foundation;

import androidx.activity.C0114h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1532l0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.jvm.internal.C19383o;
import p202p.C7644f;
import p288y.C8341a;

/* renamed from: androidx.compose.foundation.f */
public final class C0555f {
    /* renamed from: a */
    public static final C1436d m1342a(C0556g gVar, C1530k0 k0Var) {
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C19383o.m32797g(gVar, "border");
        C19383o.m32797g(k0Var, "shape");
        float f = gVar.f1304a;
        C1533m mVar = gVar.f1305b;
        C19383o.m32797g(mVar, "brush");
        return ComposedModifierKt.m3049a(aVar, InspectableValueKt.f4032a, new BorderKt$border$2(f, k0Var, mVar));
    }

    /* renamed from: b */
    public static final C1436d m1343b(float f, long j, C7644f fVar) {
        return ComposedModifierKt.m3049a(C1436d.C1437a.f3125b, InspectableValueKt.f4032a, new BorderKt$border$2(f, fVar, new C1532l0(j)));
    }

    /* renamed from: c */
    public static final long m1344c(long j, float f) {
        return C0114h.m317s(Math.max(0.0f, C8341a.m16635b(j) - f), Math.max(0.0f, C8341a.m16636c(j) - f));
    }
}
