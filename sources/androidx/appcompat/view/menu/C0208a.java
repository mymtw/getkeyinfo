package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.C0218f;
import com.etsy.android.R;

/* renamed from: androidx.appcompat.view.menu.a */
public abstract class C0208a implements C0218f {

    /* renamed from: b */
    public Context f564b;

    /* renamed from: c */
    public Context f565c;

    /* renamed from: d */
    public MenuBuilder f566d;

    /* renamed from: e */
    public LayoutInflater f567e;

    /* renamed from: f */
    public C0218f.C0219a f568f;

    /* renamed from: g */
    public int f569g = R.layout.abc_action_menu_layout;

    /* renamed from: h */
    public int f570h = R.layout.abc_action_menu_item_layout;

    /* renamed from: i */
    public C0220g f571i;

    /* renamed from: j */
    public int f572j;

    public C0208a(Context context) {
        this.f564b = context;
        this.f567e = LayoutInflater.from(context);
    }

    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public final int getId() {
        return this.f572j;
    }

    public final void setCallback(C0218f.C0219a aVar) {
        this.f568f = aVar;
    }
}
