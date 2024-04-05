package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19861p;

public final class SizeKt$createWrapContentSizeModifier$1 extends Lambda implements C19861p<C7290i, LayoutDirection, C7287g> {
    public final /* synthetic */ C1428a $align;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentSizeModifier$1(C1428a aVar) {
        super(2);
        this.$align = aVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C7287g(m34683invoke5SAbXVA(((C7290i) obj).f16171a, (LayoutDirection) obj2));
    }

    /* renamed from: invoke-5SAbXVA  reason: not valid java name */
    public final long m34683invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return this.$align.mo6133a(0, j, layoutDirection);
    }
}
