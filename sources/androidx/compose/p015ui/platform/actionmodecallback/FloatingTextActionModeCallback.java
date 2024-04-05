package androidx.compose.p015ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p110g0.C6828a;
import p288y.C8345d;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    private final C6828a callback;

    public FloatingTextActionModeCallback(C6828a aVar) {
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

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C8345d dVar = this.callback.f15029b;
        if (rect != null) {
            rect.set((int) dVar.f18301a, (int) dVar.f18302b, (int) dVar.f18303c, (int) dVar.f18304d);
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.mo18956e(actionMode, menu);
    }
}
