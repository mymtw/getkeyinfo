package com.etsy.android.p327ui.listing.p329ui.morefromshop.row;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.compose.p015ui.text.font.C1948d;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.C9853h;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.uikit.viewholder.C12007s;
import kotlin.jvm.internal.C19383o;
import p204p1.C7650b;
import p260v0.C8184a;
import p466vc.C13573c;
import p467vd.C13780a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.row.MoreFromShopRowViewHolder */
public final class MoreFromShopRowViewHolder extends C10424k {

    /* renamed from: i */
    public static final /* synthetic */ int f22931i = 0;

    /* renamed from: b */
    public final C13573c f22932b;

    /* renamed from: c */
    public final C9853h f22933c;

    /* renamed from: d */
    public final C12007s f22934d;

    /* renamed from: e */
    public final C12007s f22935e;

    /* renamed from: f */
    public final Space f22936f = ((Space) this.itemView.findViewById(R.id.bottom_space));

    /* renamed from: g */
    public final Drawable f22937g;

    /* renamed from: h */
    public final int f22938h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFromShopRowViewHolder(ViewGroup viewGroup, C13573c cVar, C9853h hVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_more_from_shop_row, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(hVar, "favoriteAnimator");
        this.f22932b = cVar;
        this.f22933c = hVar;
        View findViewById = this.itemView.findViewById(R.id.first_listing);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.first_listing)");
        C12007s sVar = new C12007s(findViewById);
        this.f22934d = sVar;
        View findViewById2 = this.itemView.findViewById(R.id.second_listing);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.second_listing)");
        C12007s sVar2 = new C12007s(findViewById2);
        this.f22935e = sVar2;
        Context context = this.itemView.getContext();
        Object obj = C8184a.f17966a;
        Drawable b = C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_tag_fill_v1);
        C19383o.m32794d(b);
        Drawable mutate = b.mutate();
        C19383o.m32796f(mutate, "getDrawable(\n        ite…fill_v1,\n    )!!.mutate()");
        int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_icon_size_smallest);
        mutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        mutate.setTint(C8184a.C8188d.m16468a(this.itemView.getContext(), R.color.clg_color_slime));
        this.f22937g = mutate;
        this.f22938h = this.itemView.getResources().getDimensionPixelSize(R.dimen.clg_space_2);
        for (C12007s sVar3 : C17782b.m29865e0(sVar, sVar2)) {
            sVar3.mo38879c();
            sVar3.mo38886j(0);
            sVar3.mo38877a().setAspectRatio(0.75f);
            sVar3.mo38880d();
        }
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10455c) {
            C10455c cVar = (C10455c) jVar;
            mo33995f(this.f22934d, cVar.f22954a);
            mo33995f(this.f22935e, cVar.f22955b);
            Space space = this.f22936f;
            C19383o.m32796f(space, "bottomSpace");
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams != null) {
                C13780a aVar = cVar.f22956c;
                layoutParams.height = aVar != null ? aVar.f30310a : 0;
                space.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final void mo33995f(C12007s sVar, C10453a aVar) {
        sVar.f26763a.post(new C7650b(1, sVar, aVar));
        sVar.mo38884h(aVar.f22941c);
        sVar.mo38887k(aVar.f22944f);
        sVar.mo38886j(0);
        if (aVar.f22951m) {
            Drawable drawable = this.f22937g;
            int i = this.f22938h;
            TextView textView = (TextView) sVar.f26763a.findViewById(R.id.price_pill);
            textView.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(i);
        } else {
            TextView textView2 = (TextView) sVar.f26763a.findViewById(R.id.price_pill);
            textView2.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(0);
        }
        ViewExtensions.m12866j(sVar.f26763a, new MoreFromShopRowViewHolder$bindListing$2(this, aVar));
        View findViewById = sVar.f26763a.findViewById(R.id.favorite_button);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.favorite_button)");
        FavHeartButton favHeartButton = (FavHeartButton) findViewById;
        ViewExtensions.m12869m(favHeartButton);
        boolean b = aVar.mo33999b();
        String str = aVar.f22941c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        favHeartButton.setFav(b, str, false);
        ViewExtensions.m12866j(favHeartButton, new MoreFromShopRowViewHolder$bindListing$3$1(this, aVar));
        C10457d dVar = aVar.f22952n;
        if (dVar != null) {
            boolean b2 = aVar.mo33999b();
            String str3 = aVar.f22941c;
            if (str3 != null) {
                str2 = str3;
            }
            favHeartButton.setFav(b2, str2, true);
            C9853h hVar = this.f22933c;
            boolean z = dVar.f22957a;
            hVar.getClass();
            if (z) {
                Context context = favHeartButton.getContext();
                C19383o.m32796f(context, "favButton.context");
                C1948d.m4270b(context, 10);
            }
        }
    }
}
