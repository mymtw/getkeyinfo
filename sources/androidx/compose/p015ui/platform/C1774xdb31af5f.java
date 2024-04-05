package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1 */
public final class C1774xdb31af5f extends Lambda implements C19857l<LayoutNode, Boolean> {
    public static final C1774xdb31af5f INSTANCE = new C1774xdb31af5f();

    public C1774xdb31af5f() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "it");
        return Boolean.valueOf(C18263b.m30825T(layoutNode) != null);
    }
}
