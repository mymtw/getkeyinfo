package androidx.compose.p015ui.focus;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.FocusManagerImpl$moveFocus$1 */
public final class FocusManagerImpl$moveFocus$1 extends Lambda implements C19857l<FocusModifier, Boolean> {
    public final /* synthetic */ FocusModifier $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusManagerImpl$moveFocus$1(FocusModifier focusModifier) {
        super(1);
        this.$source = focusModifier;
    }

    public final Boolean invoke(FocusModifier focusModifier) {
        C19383o.m32797g(focusModifier, "destination");
        if (C19383o.m32792b(focusModifier, this.$source)) {
            return Boolean.FALSE;
        }
        if (focusModifier.f3151c != null) {
            C1482p.m3148f(focusModifier);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("Move focus landed at the root.".toString());
    }
}
