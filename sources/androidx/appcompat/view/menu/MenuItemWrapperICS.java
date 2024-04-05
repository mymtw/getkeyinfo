package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.C2277b;
import java.lang.reflect.Method;
import p097f.C6760a;
import p109g.C6824a;

public class MenuItemWrapperICS extends C6824a implements MenuItem {
    public static final String LOG_TAG = "MenuItemWrapper";
    private Method mSetExclusiveCheckableMethod;
    private final SupportMenuItem mWrappedObject;

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$a */
    public class C0203a extends C2277b {

        /* renamed from: c */
        public final ActionProvider f556c;

        public C0203a(ActionProvider actionProvider) {
            this.f556c = actionProvider;
        }

        /* renamed from: a */
        public final boolean mo1956a() {
            return this.f556c.hasSubMenu();
        }

        /* renamed from: c */
        public final View mo1957c() {
            return this.f556c.onCreateActionView();
        }

        /* renamed from: e */
        public final boolean mo1958e() {
            return this.f556c.onPerformDefaultAction();
        }

        /* renamed from: f */
        public final void mo1959f(SubMenuBuilder subMenuBuilder) {
            this.f556c.onPrepareSubMenu(MenuItemWrapperICS.this.getSubMenuWrapper(subMenuBuilder));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$b */
    public class C0204b extends C0203a implements ActionProvider.VisibilityListener {

        /* renamed from: e */
        public C2277b.C2279b f558e;

        public C0204b(MenuItemWrapperICS menuItemWrapperICS, ActionProvider actionProvider) {
            super(actionProvider);
        }

        /* renamed from: b */
        public final boolean mo1960b() {
            return this.f556c.isVisible();
        }

        /* renamed from: d */
        public final View mo1961d(MenuItem menuItem) {
            return this.f556c.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public final boolean mo1962g() {
            return this.f556c.overridesItemVisibility();
        }

        /* renamed from: h */
        public final void mo1963h(MenuItemImpl.C0202a aVar) {
            this.f558e = aVar;
            this.f556c.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            C2277b.C2279b bVar = this.f558e;
            if (bVar != null) {
                MenuItemImpl menuItemImpl = MenuItemImpl.this;
                menuItemImpl.mMenu.onItemVisibleChanged(menuItemImpl);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$c */
    public static class C0205c extends FrameLayout implements C6760a {

        /* renamed from: b */
        public final CollapsibleActionView f559b;

        public C0205c(View view) {
            super(view.getContext());
            this.f559b = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f559b.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f559b.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$d */
    public class C0206d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f560a;

        public C0206d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f560a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f560a.onMenuItemActionCollapse(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f560a.onMenuItemActionExpand(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.MenuItemWrapperICS$e */
    public class C0207e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem.OnMenuItemClickListener f562b;

        public C0207e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f562b = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f562b.onMenuItemClick(MenuItemWrapperICS.this.getMenuItemWrapper(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.mWrappedObject = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.mWrappedObject.collapseActionView();
    }

    public boolean expandActionView() {
        return this.mWrappedObject.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C2277b supportActionProvider = this.mWrappedObject.getSupportActionProvider();
        if (supportActionProvider instanceof C0203a) {
            return ((C0203a) supportActionProvider).f556c;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.mWrappedObject.getActionView();
        return actionView instanceof C0205c ? (View) ((C0205c) actionView).f559b : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.mWrappedObject.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.mWrappedObject.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.mWrappedObject.getContentDescription();
    }

    public int getGroupId() {
        return this.mWrappedObject.getGroupId();
    }

    public Drawable getIcon() {
        return this.mWrappedObject.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.mWrappedObject.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.mWrappedObject.getIconTintMode();
    }

    public Intent getIntent() {
        return this.mWrappedObject.getIntent();
    }

    public int getItemId() {
        return this.mWrappedObject.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.mWrappedObject.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.mWrappedObject.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.mWrappedObject.getNumericShortcut();
    }

    public int getOrder() {
        return this.mWrappedObject.getOrder();
    }

    public SubMenu getSubMenu() {
        return getSubMenuWrapper(this.mWrappedObject.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.mWrappedObject.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.mWrappedObject.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.mWrappedObject.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.mWrappedObject.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.mWrappedObject.isCheckable();
    }

    public boolean isChecked() {
        return this.mWrappedObject.isChecked();
    }

    public boolean isEnabled() {
        return this.mWrappedObject.isEnabled();
    }

    public boolean isVisible() {
        return this.mWrappedObject.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0204b bVar = new C0204b(this, actionProvider);
        SupportMenuItem supportMenuItem = this.mWrappedObject;
        if (actionProvider == null) {
            bVar = null;
        }
        supportMenuItem.setSupportActionProvider(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0205c(view);
        }
        this.mWrappedObject.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.mWrappedObject.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.mWrappedObject.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.mWrappedObject.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.mWrappedObject.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.mWrappedObject.setEnabled(z);
        return this;
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            if (this.mSetExclusiveCheckableMethod == null) {
                this.mSetExclusiveCheckableMethod = this.mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.mSetExclusiveCheckableMethod.invoke(this.mWrappedObject, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w(LOG_TAG, "Error while calling setExclusiveCheckable", e);
        }
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mWrappedObject.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.mWrappedObject.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.mWrappedObject.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.mWrappedObject.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.mWrappedObject.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.mWrappedObject.setOnActionExpandListener(onActionExpandListener != null ? new C0206d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mWrappedObject.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0207e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.mWrappedObject.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.mWrappedObject.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.mWrappedObject.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.mWrappedObject.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mWrappedObject.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.mWrappedObject.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.mWrappedObject.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.mWrappedObject.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.mWrappedObject.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.mWrappedObject.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.mWrappedObject.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.mWrappedObject.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.mWrappedObject.setActionView(i);
        View actionView = this.mWrappedObject.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.mWrappedObject.setActionView((View) new C0205c(actionView));
        }
        return this;
    }
}
