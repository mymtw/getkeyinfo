package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* renamed from: androidx.appcompat.view.menu.f */
public interface C0218f {

    /* renamed from: androidx.appcompat.view.menu.f$a */
    public interface C0219a {
        /* renamed from: a */
        boolean mo1342a(MenuBuilder menuBuilder);

        void onCloseMenu(MenuBuilder menuBuilder, boolean z);
    }

    boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, MenuBuilder menuBuilder);

    void onCloseMenu(MenuBuilder menuBuilder, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder);

    void setCallback(C0219a aVar);

    void updateMenuView(boolean z);
}
