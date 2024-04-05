package androidx.compose.p015ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.i */
public final class C1838i {

    /* renamed from: a */
    public static final C1838i f4096a = new C1838i();

    /* renamed from: a */
    public final void mo7262a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        C19383o.m32797g(accessibilityNodeInfo, "node");
        C19383o.m32797g(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
