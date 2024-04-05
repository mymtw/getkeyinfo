package androidx.compose.p015ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p110g0.C6828a;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback */
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    private final C6828a callback;

    public PrimaryTextActionModeCallback(C6828a aVar) {
        C19383o.m32797g(aVar, "callback");
        this.callback = aVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.callback.mo18954c(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.callback.mo18955d(actionMode, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        C19846a<C19394m> aVar = this.callback.f15028a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.mo18956e(actionMode, menu);
    }
}
