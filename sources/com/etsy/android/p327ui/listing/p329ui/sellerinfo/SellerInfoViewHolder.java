package com.etsy.android.p327ui.listing.p329ui.sellerinfo;

import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10639c;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageButton;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.sellerinfo.SellerInfoViewHolder */
public final class SellerInfoViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f23339b;

    /* renamed from: c */
    public final C11786n f23340c;

    /* renamed from: d */
    public final TextView f23341d;

    /* renamed from: e */
    public final TextView f23342e;

    /* renamed from: f */
    public final Button f23343f;

    /* renamed from: g */
    public final CollageButton f23344g;

    /* renamed from: h */
    public final ImageView f23345h;

    /* renamed from: i */
    public final TextView f23346i;

    /* renamed from: j */
    public final GlideRequests f23347j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SellerInfoViewHolder(ViewGroup viewGroup, C13573c cVar, C11786n nVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_listing_seller_info, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(nVar, "resourceProvider");
        this.f23339b = cVar;
        this.f23340c = nVar;
        View findViewById = this.itemView.findViewById(R.id.shop_name);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.shop_name)");
        TextView textView = (TextView) findViewById;
        this.f23341d = textView;
        View findViewById2 = this.itemView.findViewById(R.id.shop_owner_name);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.shop_owner_name)");
        TextView textView2 = (TextView) findViewById2;
        this.f23342e = textView2;
        View findViewById3 = this.itemView.findViewById(R.id.btn_ask_question);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.btn_ask_question)");
        this.f23343f = (Button) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.btn_follow_shop);
        C19383o.m32796f(findViewById4, "itemView.findViewById(R.id.btn_follow_shop)");
        this.f23344g = (CollageButton) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.shop_avatar);
        C19383o.m32796f(findViewById5, "itemView.findViewById(R.id.shop_avatar)");
        this.f23345h = (ImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.trader_distinction);
        C19383o.m32796f(findViewById6, "itemView.findViewById(R.id.trader_distinction)");
        this.f23346i = (TextView) findViewById6;
        GlideRequests B0 = C0114h.m270B0(this.itemView.getContext());
        C19383o.m32796f(B0, "with(itemView.context)");
        this.f23347j = B0;
        AccessibilityClassNames accessibilityClassNames = AccessibilityClassNames.BUTTON;
        ViewsExtensionsKt.m17423b(textView2, accessibilityClassNames);
        ViewsExtensionsKt.m17423b(textView, accessibilityClassNames);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        String str;
        if (jVar instanceof C10635b) {
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12866j(view, new SellerInfoViewHolder$bind$1(this, jVar));
            C10635b bVar = (C10635b) jVar;
            this.f23342e.setText(bVar.f23349a);
            this.f23341d.setText(this.itemView.getResources().getQuantityString(R.plurals.owner_of_shop, 1, new Object[]{bVar.f23350b}));
            String str2 = bVar.f23351c;
            if (str2 != null) {
                this.f23347j.load(str2).mo46137e0().mo16816M(this.f23345h);
            }
            if (bVar.f23353e) {
                ViewExtensions.m12866j(this.f23343f, new SellerInfoViewHolder$bind$3(this));
                ViewExtensions.m12869m(this.f23343f);
            } else {
                ViewExtensions.m12860d(this.f23343f);
                this.f23343f.setOnClickListener((View.OnClickListener) null);
            }
            C10639c cVar = bVar.f23358j;
            if (cVar != null) {
                CollageButton collageButton = this.f23344g;
                collageButton.setIconResource(cVar.f23372a ? R.drawable.clg_icon_favorited : R.drawable.clg_icon_unfavorited);
                C11786n nVar = this.f23340c;
                String str3 = bVar.f23350b;
                C19383o.m32797g(nVar, "resourceProvider");
                C19383o.m32797g(str3, "shopName");
                StringBuilder sb = new StringBuilder();
                sb.append(nVar.mo38059c(R.string.favorite_shop, new Object[0]));
                sb.append(' ');
                sb.append(str3);
                if (cVar.f23372a) {
                    StringBuilder h = C0072d.m201h(", ");
                    h.append(nVar.mo38059c(R.string.selected_content_description, new Object[0]));
                    str = h.toString();
                } else {
                    str = "";
                }
                sb.append(str);
                collageButton.setContentDescription(sb.toString());
                ViewExtensions.m12866j(this.f23344g, new SellerInfoViewHolder$bind$4$1(this, cVar));
                ViewExtensions.m12869m(collageButton);
            } else {
                ViewExtensions.m12860d(this.f23344g);
            }
            Spanned spanned = bVar.f23359k;
            if (spanned != null) {
                this.f23346i.setText(spanned);
                EtsyLinkify.m19609c(this.f23346i, true, new SellerInfoViewHolder$bind$5(this));
                ViewExtensions.m12869m(this.f23346i);
                return;
            }
            ViewExtensions.m12860d(this.f23346i);
            return;
        }
        throw new IllegalArgumentException();
    }
}
