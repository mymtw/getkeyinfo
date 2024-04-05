package androidx.savedstate;

import android.view.View;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19427e;
import kotlin.sequences.C19435k;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class ViewTreeSavedStateRegistryOwner {
    /* renamed from: a */
    public static final C3269d m7916a(View view) {
        C19383o.m32797g(view, "<this>");
        C19427e.C19428a aVar = new C19427e.C19428a(SequencesKt___SequencesKt.m32986q1(C19435k.m33001k1(C3262x10fac0e2.INSTANCE, view), C3263x10fac0e3.INSTANCE));
        return (C3269d) (!aVar.hasNext() ? null : aVar.next());
    }

    /* renamed from: b */
    public static final void m7917b(View view, C3269d dVar) {
        C19383o.m32797g(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }
}
