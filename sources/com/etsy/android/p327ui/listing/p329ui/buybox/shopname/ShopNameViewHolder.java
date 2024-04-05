package com.etsy.android.p327ui.listing.p329ui.buybox.shopname;

import android.support.p013v4.media.C0069a;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10424k;
import com.etsy.android.p327ui.listing.p329ui.buybox.shopname.C10304a;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p466vc.C13573c;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.shopname.ShopNameViewHolder */
public final class ShopNameViewHolder extends C10424k {

    /* renamed from: b */
    public final C13573c f22617b;

    /* renamed from: c */
    public final TextView f22618c;

    /* renamed from: d */
    public final View f22619d;

    /* renamed from: e */
    public final TextView f22620e;

    public ShopNameViewHolder(ViewGroup viewGroup, C13573c cVar) {
        super(C0069a.m172c(viewGroup, ResponseConstants.PARENT, cVar, "listingEventDispatcher", viewGroup, R.layout.list_item_listing_shop_name, false));
        this.f22617b = cVar;
        View findViewById = this.itemView.findViewById(R.id.listing_shop_name);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.listing_shop_name)");
        TextView textView = (TextView) findViewById;
        this.f22618c = textView;
        View findViewById2 = this.itemView.findViewById(R.id.star_seller_badge_layout);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.…star_seller_badge_layout)");
        this.f22619d = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.star_seller_badge_label);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.….star_seller_badge_label)");
        this.f22620e = (TextView) findViewById3;
        ViewsExtensionsKt.m17423b(textView, AccessibilityClassNames.BUTTON);
    }

    /* renamed from: e */
    public final void mo33569e(C10423j jVar) {
        if (jVar instanceof C10304a) {
            C10304a aVar = (C10304a) jVar;
            String str = aVar.f22621a;
            String string = this.itemView.getResources().getString(R.string.by_generic, new Object[]{str});
            C19383o.m32796f(string, "itemView.resources.getSt…ing.by_generic, shopName)");
            int l1 = C19459m.m33043l1(string, str, 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new StyleSpan(1), l1, str.length() + l1, 0);
            this.f22618c.setText(spannableStringBuilder);
            C10304a.C10305a aVar2 = aVar.f22622b;
            if (aVar2.f22623a) {
                ViewExtensions.m12869m(this.f22619d);
                ViewExtensions.m12866j(this.f22619d, new ShopNameViewHolder$bind$1$1(this));
                this.f22620e.setText(aVar2.f22624b);
                this.f22617b.mo38043a(C13597g.C13673k4.f30167a);
            } else {
                ViewExtensions.m12860d(this.f22619d);
                this.f22619d.setOnClickListener((View.OnClickListener) null);
                this.f22620e.setText("");
            }
            View view = this.itemView;
            C19383o.m32796f(view, "itemView");
            ViewExtensions.m12866j(view, new ShopNameViewHolder$bind$2(this));
            return;
        }
        throw new IllegalArgumentException();
    }
}
