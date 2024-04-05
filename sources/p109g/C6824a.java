package p109g;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
import p193o.C7506i;

/* renamed from: g.a */
public abstract class C6824a {
    public final Context mContext;
    private C7506i<SupportMenuItem, MenuItem> mMenuItems;
    private C7506i<SupportSubMenu, SubMenu> mSubMenus;

    public C6824a(Context context) {
        this.mContext = context;
    }

    public final MenuItem getMenuItemWrapper(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.mMenuItems == null) {
            this.mMenuItems = new C7506i<>();
        }
        MenuItem orDefault = this.mMenuItems.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.mContext, supportMenuItem);
        this.mMenuItems.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu getSubMenuWrapper(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.mSubMenus == null) {
            this.mSubMenus = new C7506i<>();
        }
        SubMenu orDefault = this.mSubMenus.getOrDefault(supportSubMenu, null);
        if (orDefault != null) {
            return orDefault;
        }
        C6827d dVar = new C6827d(this.mContext, supportSubMenu);
        this.mSubMenus.put(supportSubMenu, dVar);
        return dVar;
    }

    public final void internalClear() {
        C7506i<SupportMenuItem, MenuItem> iVar = this.mMenuItems;
        if (iVar != null) {
            iVar.clear();
        }
        C7506i<SupportSubMenu, SubMenu> iVar2 = this.mSubMenus;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    public final void internalRemoveGroup(int i) {
        if (this.mMenuItems != null) {
            int i2 = 0;
            while (true) {
                C7506i<SupportMenuItem, MenuItem> iVar = this.mMenuItems;
                if (i2 < iVar.f16745d) {
                    if (iVar.mo19978h(i2).getGroupId() == i) {
                        this.mMenuItems.mo14353j(i2);
                        i2--;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void internalRemoveItem(int i) {
        if (this.mMenuItems != null) {
            int i2 = 0;
            while (true) {
                C7506i<SupportMenuItem, MenuItem> iVar = this.mMenuItems;
                if (i2 >= iVar.f16745d) {
                    return;
                }
                if (iVar.mo19978h(i2).getItemId() == i) {
                    this.mMenuItems.mo14353j(i2);
                    return;
                }
                i2++;
            }
        }
    }
}
