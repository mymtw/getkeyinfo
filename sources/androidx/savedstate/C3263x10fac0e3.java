package androidx.savedstate;

import android.view.View;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
public final class C3263x10fac0e3 extends Lambda implements C19857l<View, C3269d> {
    public static final C3263x10fac0e3 INSTANCE = new C3263x10fac0e3();

    public C3263x10fac0e3() {
        super(1);
    }

    public final C3269d invoke(View view) {
        C19383o.m32797g(view, "view");
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof C3269d) {
            return (C3269d) tag;
        }
        return null;
    }
}
