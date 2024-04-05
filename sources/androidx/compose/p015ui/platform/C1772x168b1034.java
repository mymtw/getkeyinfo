package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1 */
public final class C1772x168b1034 extends Lambda implements C19857l<C1892z0, C19394m> {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1772x168b1034(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1892z0) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1892z0 z0Var) {
        C19383o.m32797g(z0Var, "it");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
        int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.f3953w;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        if (z0Var.isValid()) {
            androidComposeViewAccessibilityDelegateCompat.f3954a.getSnapshotObserver().mo6824b(z0Var, androidComposeViewAccessibilityDelegateCompat.f3975v, new C1771x595e4e0d(z0Var, androidComposeViewAccessibilityDelegateCompat));
        }
    }
}
