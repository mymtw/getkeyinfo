package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.C0218f;

/* renamed from: androidx.appcompat.view.menu.d */
public final class C0215d implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0218f.C0219a {

    /* renamed from: b */
    public MenuBuilder f609b;

    /* renamed from: c */
    public AlertDialog f610c;

    /* renamed from: d */
    public ListMenuPresenter f611d;

    public C0215d(MenuBuilder menuBuilder) {
        this.f609b = menuBuilder;
    }

    /* renamed from: a */
    public final boolean mo1342a(MenuBuilder menuBuilder) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f609b.performItemAction((MenuItemImpl) this.f611d.getAdapter().getItem(i), 0);
    }

    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        AlertDialog alertDialog;
        if ((z || menuBuilder == this.f609b) && (alertDialog = this.f610c) != null) {
            alertDialog.dismiss();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f611d.onCloseMenu(this.f609b, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f610c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f610c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f609b.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f609b.performShortcut(i, keyEvent, 0);
    }
}
