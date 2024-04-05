package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ long $color$inlined;
    public final /* synthetic */ C1530k0 $shape$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j, C1530k0 k0Var) {
        super(1);
        this.$color$inlined = j;
        this.$shape$inlined = k0Var;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(new C1545s(this.$color$inlined), "color");
        o0Var.f4114b.mo7222b(this.$shape$inlined, "shape");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
