package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
public final class C2841xfdb59cc4 implements C2885q {
    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.upTo((Lifecycle.State) null)) {
            throw null;
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}
