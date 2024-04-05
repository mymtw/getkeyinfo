package p109g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportSubMenu;

/* renamed from: g.d */
public final class C6827d extends MenuWrapperICS implements SubMenu {

    /* renamed from: a */
    public final SupportSubMenu f15027a;

    public C6827d(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f15027a = supportSubMenu;
    }

    public final void clearHeader() {
        this.f15027a.clearHeader();
    }

    public final MenuItem getItem() {
        return getMenuItemWrapper(this.f15027a.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f15027a.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f15027a.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f15027a.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f15027a.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f15027a.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f15027a.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f15027a.setIcon(drawable);
        return this;
    }
}
