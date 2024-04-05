package androidx.compose.p015ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.a0 */
public final class C1813a0 {

    /* renamed from: a */
    public static final C1813a0 f4066a = new C1813a0();

    /* renamed from: a */
    public final int mo7181a(AccessibilityManager accessibilityManager, int i, int i2) {
        C19383o.m32797g(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
