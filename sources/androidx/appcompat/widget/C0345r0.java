package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.ActionMenuItem;

/* renamed from: androidx.appcompat.widget.r0 */
public final class C0345r0 implements View.OnClickListener {

    /* renamed from: b */
    public final ActionMenuItem f897b;

    /* renamed from: c */
    public final /* synthetic */ C0347s0 f898c;

    public C0345r0(C0347s0 s0Var) {
        this.f898c = s0Var;
        this.f897b = new ActionMenuItem(s0Var.f902a.getContext(), 0, 16908332, 0, 0, s0Var.f910i);
    }

    public final void onClick(View view) {
        C0347s0 s0Var = this.f898c;
        Window.Callback callback = s0Var.f913l;
        if (callback != null && s0Var.f914m) {
            callback.onMenuItemSelected(0, this.f897b);
        }
    }
}
