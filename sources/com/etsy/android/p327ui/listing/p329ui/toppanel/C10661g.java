package com.etsy.android.p327ui.listing.p329ui.toppanel;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.listing.p329ui.toppanel.contactShopInfo.ContactShopHelper;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.FavoriteInfoViewHelper;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;
import p466vc.C13573c;
import p482xd.C13879a;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.g */
public final class C10661g {

    /* renamed from: a */
    public final C13573c f23440a;

    /* renamed from: b */
    public final View f23441b;

    /* renamed from: c */
    public final CollageButton f23442c;

    /* renamed from: d */
    public final CollageButton f23443d;

    /* renamed from: e */
    public final CollageButton f23444e;

    /* renamed from: f */
    public final CollageButton f23445f;

    /* renamed from: g */
    public final FavoriteInfoViewHelper f23446g;

    /* renamed from: h */
    public final ContactShopHelper f23447h;

    /* renamed from: i */
    public final MaterialShapeDrawable f23448i;

    public C10661g(View view, C13573c cVar, int i, C11786n nVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f23440a = cVar;
        View findViewById = view.findViewById(R.id.listing_top_panel_navigation_bar);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.l…top_panel_navigation_bar)");
        this.f23441b = findViewById;
        View findViewById2 = view.findViewById(R.id.status_bar_placeholder);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.status_bar_placeholder)");
        View findViewById3 = view.findViewById(R.id.navigation_button);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.navigation_button)");
        this.f23442c = (CollageButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.backgroundless_navigation_button);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.b…ndless_navigation_button)");
        this.f23443d = (CollageButton) findViewById4;
        View findViewById5 = view.findViewById(R.id.button_share);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.button_share)");
        this.f23444e = (CollageButton) findViewById5;
        View findViewById6 = view.findViewById(R.id.button_share_no_background);
        C19383o.m32796f(findViewById6, "view.findViewById(R.id.button_share_no_background)");
        this.f23445f = (CollageButton) findViewById6;
        this.f23446g = new FavoriteInfoViewHelper(view, cVar, nVar);
        this.f23447h = new ContactShopHelper(view, cVar);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f23448i = materialShapeDrawable;
        findViewById.setBackground((Drawable) null);
        ViewExtensions.m12869m(findViewById2);
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            findViewById2.setLayoutParams(layoutParams);
            materialShapeDrawable.initializeElevationOverlay(findViewById.getContext());
            Context context = findViewById.getContext();
            C19383o.m32796f(context, "customNavigationView.context");
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(C13350a.m21013d(context, R.attr.clg_color_bg_primary)));
            materialShapeDrawable.setElevation((float) findViewById.getContext().getResources().getDimensionPixelSize(R.dimen.app_bar_elevation));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: a */
    public final void mo34338a(C10658e eVar, boolean z) {
        String str;
        String str2;
        C19383o.m32797g(eVar, "uiModel");
        C19394m mVar = null;
        if (z) {
            ViewExtensions.m12869m(this.f23442c);
            ViewExtensions.m12866j(this.f23442c, new TopPanelHelper$bindTransparent$1(this));
            ViewExtensions.m12860d(this.f23443d);
            this.f23443d.setOnClickListener((View.OnClickListener) null);
            this.f23441b.setBackground((Drawable) null);
            this.f23441b.setOnClickListener((View.OnClickListener) null);
            this.f23447h.mo34313b(eVar.f23429c);
            this.f23446g.mo34322b(eVar.f23427a);
            ViewExtensions.m12869m(this.f23444e);
            ViewExtensions.m12860d(this.f23445f);
            C13879a aVar = eVar.f23428b;
            if (!(aVar == null || (str2 = aVar.f30538a) == null)) {
                ViewExtensions.m12866j(this.f23444e, new TopPanelHelper$bindTransparent$2$1(this, str2, eVar));
                mVar = C19394m.f43287a;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.f23444e);
                return;
            }
            return;
        }
        ViewExtensions.m12860d(this.f23442c);
        this.f23442c.setOnClickListener((View.OnClickListener) null);
        ViewExtensions.m12869m(this.f23443d);
        ViewExtensions.m12866j(this.f23443d, new TopPanelHelper$bindNotTransparent$1(this));
        this.f23441b.setBackground(this.f23448i);
        this.f23441b.setOnClickListener(new C10659f());
        this.f23447h.mo34312a(eVar.f23429c);
        this.f23446g.mo34321a(eVar.f23427a);
        ViewExtensions.m12860d(this.f23444e);
        ViewExtensions.m12869m(this.f23445f);
        C13879a aVar2 = eVar.f23428b;
        if (!(aVar2 == null || (str = aVar2.f30538a) == null)) {
            ViewExtensions.m12866j(this.f23445f, new TopPanelHelper$bindNotTransparent$3$1(this, str, eVar));
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            ViewExtensions.m12860d(this.f23445f);
        }
    }
}
