package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 */
public final class PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C1641m $icon$inlined;
    public final /* synthetic */ boolean $overrideDescendants$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(C1641m mVar, boolean z) {
        super(1);
        this.$icon$inlined = mVar;
        this.$overrideDescendants$inlined = z;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$icon$inlined, ResponseConstants.ICON);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$overrideDescendants$inlined), "overrideDescendants");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
