package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.semantics.C1903j;
import androidx.compose.p015ui.semantics.C1904k;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1 */
final class C1770xe4d02f47 extends Lambda implements C19857l<LayoutNode, Boolean> {
    public static final C1770xe4d02f47 INSTANCE = new C1770xe4d02f47();

    public C1770xe4d02f47() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C1903j c;
        C19383o.m32797g(layoutNode, ResponseConstants.PARENT);
        C1904k T = C18263b.m30825T(layoutNode);
        boolean z = true;
        if (T == null || (c = T.mo7349c()) == null || !c.f4247c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
