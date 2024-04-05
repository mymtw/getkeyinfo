package com.etsy.android.p327ui.shop;

import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import com.etsy.android.lib.util.C8914m;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.etsy.android.ui.shop.j0 */
public final class C11170j0 {

    /* renamed from: a */
    public final int f24704a;

    /* renamed from: b */
    public final int f24705b;

    /* renamed from: c */
    public final int f24706c;

    /* renamed from: d */
    public final int f24707d;

    /* renamed from: e */
    public final int f24708e;

    /* renamed from: f */
    public final int f24709f;

    /* renamed from: g */
    public final int f24710g;

    /* renamed from: h */
    public final boolean f24711h;

    public C11170j0(ShopHomePage shopHomePage, FragmentActivity fragmentActivity) {
        int integer = fragmentActivity.getResources().getInteger(R.integer.shop_home_max_span_size);
        boolean e = C8914m.m17347e(fragmentActivity);
        boolean c = C8914m.m17345c(fragmentActivity);
        boolean z = e || c;
        this.f24711h = z;
        int i = integer >> 2;
        this.f24708e = i;
        this.f24709f = z ? integer - i : integer;
        this.f24710g = ((!e || !c) && !fragmentActivity.getResources().getBoolean(R.bool.width_960)) ? integer >> 1 : integer / 3;
        if (e && c) {
            this.f24705b = i;
        } else if (z) {
            this.f24705b = integer / 3;
        } else {
            this.f24705b = integer;
        }
        this.f24706c = z ? integer - this.f24705b : integer;
        List featuredListings = shopHomePage.getFeaturedListings() != null ? shopHomePage.getFeaturedListings() : new ArrayList();
        if (C15588c1.m25338o0(featuredListings)) {
            featuredListings.size();
            if (fragmentActivity.getResources().getBoolean(R.bool.width_960)) {
                this.f24707d = Math.min(integer / 3, integer / featuredListings.size());
            } else {
                this.f24707d = integer >> 1;
            }
        } else {
            this.f24707d = integer;
        }
        this.f24704a = integer;
    }
}
