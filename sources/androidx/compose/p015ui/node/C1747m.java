package androidx.compose.p015ui.node;

import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.m */
public final class C1747m implements Comparator<LayoutNode> {

    /* renamed from: b */
    public static final C1747m f3943b = new C1747m();

    public final int compare(Object obj, Object obj2) {
        LayoutNode layoutNode = (LayoutNode) obj;
        LayoutNode layoutNode2 = (LayoutNode) obj2;
        C19383o.m32797g(layoutNode, Constants.APPBOY_PUSH_CONTENT_KEY);
        C19383o.m32797g(layoutNode2, "b");
        int i = C19383o.m32799i(layoutNode2.f3824i, layoutNode.f3824i);
        return i != 0 ? i : C19383o.m32799i(layoutNode.hashCode(), layoutNode2.hashCode());
    }
}
