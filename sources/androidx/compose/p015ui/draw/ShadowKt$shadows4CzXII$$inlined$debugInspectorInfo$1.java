package androidx.compose.p015ui.draw;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ long $ambientColor$inlined;
    public final /* synthetic */ boolean $clip$inlined;
    public final /* synthetic */ float $elevation$inlined;
    public final /* synthetic */ C1530k0 $shape$inlined;
    public final /* synthetic */ long $spotColor$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f, C1530k0 k0Var, boolean z, long j, long j2) {
        super(1);
        this.$elevation$inlined = f;
        this.$shape$inlined = k0Var;
        this.$clip$inlined = z;
        this.$ambientColor$inlined = j;
        this.$spotColor$inlined = j2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C0069a.m179j(this.$elevation$inlined, o0Var.f4114b, "elevation");
        o0Var.f4114b.mo7222b(this.$shape$inlined, "shape");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$clip$inlined), "clip");
        o0Var.f4114b.mo7222b(new C1545s(this.$ambientColor$inlined), "ambientColor");
        o0Var.f4114b.mo7222b(new C1545s(this.$spotColor$inlined), "spotColor");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
