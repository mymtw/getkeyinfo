package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ float $x$inlined;
    public final /* synthetic */ float $y$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.$x$inlined = f;
        this.$y$inlined = f2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        C0069a.m179j(this.$x$inlined, o0Var.f4114b, EtsyDialogFragment.OPT_X_BUTTON);
        C0069a.m179j(this.$y$inlined, o0Var.f4114b, "y");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
