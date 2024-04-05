package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ float $bottom$inlined;
    public final /* synthetic */ float $end$inlined;
    public final /* synthetic */ float $start$inlined;
    public final /* synthetic */ float $top$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$start$inlined = f;
        this.$top$inlined = f2;
        this.$end$inlined = f3;
        this.$bottom$inlined = f4;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C0069a.m179j(this.$start$inlined, o0Var.f4114b, "start");
        C0069a.m179j(this.$top$inlined, o0Var.f4114b, "top");
        C0069a.m179j(this.$end$inlined, o0Var.f4114b, ResponseConstants.PROMOTION_END);
        C0069a.m179j(this.$bottom$inlined, o0Var.f4114b, "bottom");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
