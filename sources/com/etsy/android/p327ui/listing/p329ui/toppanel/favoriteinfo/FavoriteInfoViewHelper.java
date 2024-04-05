package com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10457d;
import com.etsy.android.p327ui.listing.p329ui.toppanel.favoriteinfo.confetti.ConfettiView;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.uikit.util.AnimationUtil;
import kotlin.jvm.internal.C19383o;
import p396mb.C13038d;
import p396mb.C13046k;
import p404nb.C13100a;
import p466vc.C13573c;
import p610kp.C18161c;

/* renamed from: com.etsy.android.ui.listing.ui.toppanel.favoriteinfo.FavoriteInfoViewHelper */
public final class FavoriteInfoViewHelper {

    /* renamed from: a */
    public final C13573c f23430a;

    /* renamed from: b */
    public final C11786n f23431b;

    /* renamed from: c */
    public final ImageView f23432c;

    /* renamed from: d */
    public final ConfettiView f23433d;

    /* renamed from: e */
    public final ImageButton f23434e;

    /* renamed from: f */
    public final C18161c f23435f = new C18161c();

    public FavoriteInfoViewHelper(View view, C13573c cVar, C11786n nVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f23430a = cVar;
        this.f23431b = nVar;
        View findViewById = view.findViewById(R.id.button_favorite);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.button_favorite)");
        this.f23432c = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.favorite_confetti);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.favorite_confetti)");
        this.f23433d = (ConfettiView) findViewById2;
        View findViewById3 = view.findViewById(R.id.button_favorite_no_background);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.b…n_favorite_no_background)");
        this.f23434e = (ImageButton) findViewById3;
    }

    /* renamed from: a */
    public final void mo34321a(C10660a aVar) {
        ViewExtensions.m12860d(this.f23432c);
        if (aVar == null) {
            ViewExtensions.m12860d(this.f23434e);
            return;
        }
        ViewExtensions.m12869m(this.f23434e);
        String c = this.f23431b.mo38059c(aVar.mo34327a() ? R.string.add_to_favorites : R.string.favorited, aVar.f23439d);
        this.f23434e.setContentDescription(c);
        C13100a.m20770a(this.f23434e, new C13046k(c));
        C13100a.m20770a(this.f23434e, new C13038d(this.f23431b.mo38059c(R.string.add_listing_to_collection_content_description, aVar.f23439d)));
        this.f23434e.setImageResource(aVar.mo34327a() ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
        C10457d dVar = aVar.f23438c;
        if (dVar != null) {
            if (dVar.f22957a) {
                AnimationUtil.m19605a(this.f23434e, R.drawable.clg_icon_favorited_on_light);
                C18161c cVar = this.f23435f;
                ConfettiView confettiView = this.f23433d;
                cVar.getClass();
                C18161c.m30663g(confettiView);
            } else {
                this.f23434e.setImageResource(R.drawable.clg_icon_unfavorited_on_light);
            }
        }
        ViewExtensions.m12866j(this.f23434e, new FavoriteInfoViewHelper$bind$2(this, aVar));
        ViewExtensions.m12868l(this.f23434e, new FavoriteInfoViewHelper$bind$3(this));
    }

    /* renamed from: b */
    public final void mo34322b(C10660a aVar) {
        ViewExtensions.m12860d(this.f23434e);
        if (aVar == null) {
            ViewExtensions.m12860d(this.f23432c);
            return;
        }
        ViewExtensions.m12869m(this.f23432c);
        String c = this.f23431b.mo38059c(aVar.mo34327a() ? R.string.add_to_favorites : R.string.favorited, aVar.f23439d);
        this.f23432c.setContentDescription(c);
        C13100a.m20770a(this.f23432c, new C13046k(c));
        C13100a.m20770a(this.f23432c, new C13038d(this.f23431b.mo38059c(R.string.add_listing_to_collection_content_description, aVar.f23439d)));
        this.f23432c.setImageResource(aVar.mo34327a() ? R.drawable.clg_icon_favorited_on_light : R.drawable.clg_icon_unfavorited_on_light);
        C10457d dVar = aVar.f23438c;
        if (dVar != null) {
            if (dVar.f22957a) {
                AnimationUtil.m19605a(this.f23432c, R.drawable.clg_icon_favorited_on_light);
                C18161c cVar = this.f23435f;
                ConfettiView confettiView = this.f23433d;
                cVar.getClass();
                C18161c.m30663g(confettiView);
            } else {
                this.f23432c.setImageResource(R.drawable.clg_icon_unfavorited_on_light);
            }
        }
        ViewExtensions.m12866j(this.f23432c, new FavoriteInfoViewHelper$bindTransparent$2(this, aVar));
        ViewExtensions.m12868l(this.f23432c, new FavoriteInfoViewHelper$bindTransparent$3(this));
    }
}
