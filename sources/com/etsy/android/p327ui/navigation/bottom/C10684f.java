package com.etsy.android.p327ui.navigation.bottom;

import com.etsy.android.R;

/* renamed from: com.etsy.android.ui.navigation.bottom.f */
public abstract class C10684f {

    /* renamed from: a */
    public final int f23561a;

    /* renamed from: b */
    public final int f23562b;

    /* renamed from: c */
    public final int f23563c;

    /* renamed from: d */
    public final int f23564d;

    /* renamed from: e */
    public final int f23565e;

    /* renamed from: com.etsy.android.ui.navigation.bottom.f$a */
    public static final class C10685a extends C10684f {

        /* renamed from: f */
        public static final C10685a f23566f = new C10685a();

        public C10685a() {
            super(R.id.menu_bottom_nav_cart, R.drawable.ic_nav_cart_selector, R.string.nav_cart, R.string.cart_tab_desc, R.string.cart_tab_desc5);
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.bottom.f$b */
    public static final class C10686b extends C10684f {

        /* renamed from: f */
        public static final C10686b f23567f = new C10686b();

        public C10686b() {
            super(R.id.menu_bottom_nav_favorites, R.drawable.ic_nav_favorite_selector, R.string.nav_favorites, R.string.favorites_tab_desc, R.string.favorites_tab_desc5);
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.bottom.f$c */
    public static final class C10687c extends C10684f {

        /* renamed from: f */
        public static final C10687c f23568f = new C10687c();

        public C10687c() {
            super(R.id.menu_bottom_nav_home, R.drawable.ic_nav_home_selector, R.string.nav_home, R.string.home_tab_desc, R.string.home_tab_desc5);
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.bottom.f$d */
    public static final class C10688d extends C10684f {

        /* renamed from: f */
        public static final C10688d f23569f = new C10688d();

        public C10688d() {
            super(R.id.menu_bottom_nav_updates, R.drawable.ic_nav_notification_bell_selector, R.string.nav_updates, R.string.updates_tab_desc5, R.string.updates_tab_desc5);
        }
    }

    /* renamed from: com.etsy.android.ui.navigation.bottom.f$e */
    public static final class C10689e extends C10684f {

        /* renamed from: f */
        public static final C10689e f23570f = new C10689e();

        public C10689e() {
            super(R.id.menu_bottom_nav_you, R.drawable.ic_nav_you_selector, R.string.nav_you, R.string.you_tab_desc, R.string.you_tab_desc5);
        }
    }

    public C10684f(int i, int i2, int i3, int i4, int i5) {
        this.f23561a = i;
        this.f23562b = i2;
        this.f23563c = i3;
        this.f23564d = i4;
        this.f23565e = i5;
    }
}
