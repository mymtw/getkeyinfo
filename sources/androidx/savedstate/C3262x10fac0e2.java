package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
public final class C3262x10fac0e2 extends Lambda implements C19857l<View, View> {
    public static final C3262x10fac0e2 INSTANCE = new C3262x10fac0e2();

    public C3262x10fac0e2() {
        super(1);
    }

    public final View invoke(View view) {
        C19383o.m32797g(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
