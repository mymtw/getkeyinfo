package com.etsy.android.p327ui.singleactivity;

import com.etsy.android.R;

/* renamed from: com.etsy.android.ui.singleactivity.StackType */
public enum StackType {
    HOME(R.id.menu_bottom_nav_home),
    FAVORITES(R.id.menu_bottom_nav_favorites),
    NOTIFICATIONS(R.id.menu_bottom_nav_updates),
    YOU(R.id.menu_bottom_nav_you),
    CART(R.id.menu_bottom_nav_cart);
    
    public static final C11315a Companion = null;
    private final int bottomNavItemId;

    /* renamed from: com.etsy.android.ui.singleactivity.StackType$a */
    public static final class C11315a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C11315a();
    }

    private StackType(int i) {
        this.bottomNavItemId = i;
    }

    public final int getBottomNavItemId() {
        return this.bottomNavItemId;
    }
}
