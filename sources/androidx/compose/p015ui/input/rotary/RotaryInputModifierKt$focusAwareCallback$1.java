package androidx.compose.p015ui.input.rotary;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p076d0.C6615a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt$focusAwareCallback$1 */
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements C19857l<C6615a, Boolean> {
    public final /* synthetic */ C19857l<C1658a, Boolean> $this_focusAwareCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotaryInputModifierKt$focusAwareCallback$1(C19857l<? super C1658a, Boolean> lVar) {
        super(1);
        this.$this_focusAwareCallback = lVar;
    }

    public final Boolean invoke(C6615a aVar) {
        C19383o.m32797g(aVar, "e");
        if (aVar instanceof C1658a) {
            return this.$this_focusAwareCallback.invoke(aVar);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
