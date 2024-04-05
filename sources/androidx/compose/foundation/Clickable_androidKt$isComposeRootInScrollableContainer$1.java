package androidx.compose.foundation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    public final Boolean invoke() {
        boolean z;
        View view = this.$view;
        int i = C0620h.f1363b;
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null || !(parent instanceof ViewGroup)) {
                z = false;
            } else {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    z = true;
                    break;
                }
                parent = viewGroup.getParent();
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
