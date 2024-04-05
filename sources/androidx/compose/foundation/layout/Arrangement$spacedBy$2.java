package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class Arrangement$spacedBy$2 extends Lambda implements C19861p<Integer, LayoutDirection, Integer> {
    public final /* synthetic */ C1428a.C1430b $alignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$2(C1428a.C1430b bVar) {
        super(2);
        this.$alignment = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i, LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return Integer.valueOf(this.$alignment.mo6134a(0, i, layoutDirection));
    }
}
