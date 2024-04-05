package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7292j;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1 */
public final class C0651x79f276d2 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ long $after$inlined;
    public final /* synthetic */ C1665a $alignmentLine$inlined;
    public final /* synthetic */ long $before$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0651x79f276d2(C1665a aVar, long j, long j2) {
        super(1);
        this.$alignmentLine$inlined = aVar;
        this.$before$inlined = j;
        this.$after$inlined = j2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$alignmentLine$inlined, "alignmentLine");
        o0Var.f4114b.mo7222b(new C7292j(this.$before$inlined), "before");
        o0Var.f4114b.mo7222b(new C7292j(this.$after$inlined), "after");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
