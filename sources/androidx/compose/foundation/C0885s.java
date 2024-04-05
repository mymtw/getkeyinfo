package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1909p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.s */
public final class C0885s {

    /* renamed from: a */
    public static final C1909p<C19846a<C8343c>> f1894a = new C1909p<>("MagnifierPositionInRoot");

    /* renamed from: a */
    public static C1436d m1942a(C19857l lVar, C0894t tVar, C19857l lVar2) {
        C1436d dVar;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        MagnifierKt$magnifier$1 magnifierKt$magnifier$1 = MagnifierKt$magnifier$1.INSTANCE;
        C19383o.m32797g(magnifierKt$magnifier$1, "magnifierCenter");
        C19383o.m32797g(tVar, "style");
        C19857l<C1859o0, C19394m> lVar3 = InspectableValueKt.f4032a;
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i >= 28) {
            if (i < 28) {
                z = false;
            }
            if (z) {
                dVar = ComposedModifierKt.m3049a(aVar, InspectableValueKt.f4032a, new MagnifierKt$magnifier$4(lVar, magnifierKt$magnifier$1, Float.NaN, lVar2, i == 28 ? C0547a0.f1290a : C0550b0.f1292a, tVar));
            } else {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
        } else {
            dVar = aVar;
        }
        return InspectableValueKt.m3945a(aVar, dVar);
    }
}
