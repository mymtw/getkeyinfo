package androidx.compose.p015ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.d1 */
public final class C1825d1 {

    /* renamed from: a */
    public static final C1825d1 f4086a = new C1825d1();

    /* renamed from: a */
    public final void mo7203a(ActionMode actionMode) {
        C19383o.m32797g(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    /* renamed from: b */
    public final ActionMode mo7204b(View view, ActionMode.Callback callback, int i) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(callback, "actionModeCallback");
        return view.startActionMode(callback, i);
    }
}
