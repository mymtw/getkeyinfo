package androidx.compose.p015ui.platform;

import android.view.ViewParent;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.u1 */
public final class C1880u1 {

    /* renamed from: a */
    public static final C1880u1 f4161a = new C1880u1();

    /* renamed from: a */
    public final void mo7284a(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
