package androidx.compose.p015ui.semantics;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1 */
public final class SemanticsProperties$IsPopup$1 extends Lambda implements C19861p<C19394m, C19394m, C19394m> {
    public static final SemanticsProperties$IsPopup$1 INSTANCE = new SemanticsProperties$IsPopup$1();

    public SemanticsProperties$IsPopup$1() {
        super(2);
    }

    public final C19394m invoke(C19394m mVar, C19394m mVar2) {
        C19383o.m32797g(mVar2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
