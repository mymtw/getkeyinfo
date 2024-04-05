package com.etsy.android.uikit.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.viewholder.s */
public final class C12007s {

    /* renamed from: a */
    public final View f26763a;

    public C12007s(View view) {
        this.f26763a = view;
    }

    /* renamed from: a */
    public final ListingFullImageView mo38877a() {
        View findViewById = this.f26763a.findViewById(R.id.listing_image);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.listing_image)");
        return (ListingFullImageView) findViewById;
    }

    /* renamed from: b */
    public final void mo38878b() {
        ViewExtensions.m12860d(this.f26763a.findViewById(R.id.listing_shop_rating_and_reviews));
        ViewExtensions.m12860d(this.f26763a.findViewById(R.id.listing_shop_rating_and_reviews_numeric));
        ViewExtensions.m12860d(this.f26763a.findViewById(R.id.listing_shop_numeric_rating));
    }

    /* renamed from: c */
    public final void mo38879c() {
        TextView textView = (TextView) this.f26763a.findViewById(R.id.listing_title);
        if (textView != null) {
            textView.setVisibility(8);
        }
        mo38888l(8);
        this.f26763a.findViewById(R.id.btn_menu).setVisibility(8);
        this.f26763a.findViewById(R.id.free_shipping).setVisibility(8);
        this.f26763a.findViewById(R.id.sale).setVisibility(8);
        mo38883g(false);
        this.f26763a.findViewById(R.id.buyer_fulfillment_promise).setVisibility(8);
        mo38882f(8);
        ViewGroup.LayoutParams layoutParams = this.f26763a.findViewById(R.id.guide_bottom).getLayoutParams();
        C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).guideEnd = 0;
        ((TextView) this.f26763a.findViewById(R.id.listing_shop)).setVisibility(8);
        mo38878b();
        View view = this.f26763a;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        ((MaterialCardView) view).setCardBackgroundColor(0);
        this.f26763a.findViewById(R.id.only_n_left).setVisibility(8);
        TextView textView2 = (TextView) this.f26763a.findViewById(R.id.listing_title);
        mo38884h(textView2 != null ? textView2.getText() : null);
    }

    /* renamed from: d */
    public final void mo38880d() {
        View view = this.f26763a;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        ((MaterialCardView) view).setRadius(0.0f);
        View view2 = this.f26763a;
        C19383o.m32795e(view2, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        ((MaterialCardView) view2).setElevation(0.0f);
        this.f26763a.findViewById(R.id.btn_menu).setVisibility(8);
        View view3 = this.f26763a;
        C19383o.m32795e(view3, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
        ((MaterialCardView) view3).setCardBackgroundColor(0);
    }

    /* renamed from: e */
    public final void mo38881e(int i) {
        Context context = this.f26763a.getContext();
        C19383o.m32796f(context, "itemView.context");
        ((TextView) this.f26763a.findViewById(R.id.combo_nudge)).setTextColor(C13350a.m21013d(context, i));
    }

    /* renamed from: f */
    public final void mo38882f(int i) {
        this.f26763a.findViewById(R.id.combo_nudge).setVisibility(i);
    }

    /* renamed from: g */
    public final void mo38883g(boolean z) {
        this.f26763a.findViewById(R.id.signal_info).setVisibility(z ? 0 : 8);
        if (z) {
            ((TextView) this.f26763a.findViewById(R.id.signal_info)).setText(this.f26763a.getResources().getText(R.string.digital_download));
        }
    }

    /* renamed from: h */
    public final void mo38884h(CharSequence charSequence) {
        View findViewById = this.f26763a.findViewById(R.id.listing_image);
        findViewById.setContentDescription(charSequence);
        findViewById.setImportantForAccessibility(C18263b.m30839d0(charSequence) ? 1 : 2);
    }

    /* renamed from: i */
    public final void mo38885i(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "contentDescription");
        this.f26763a.findViewById(R.id.listing_price).setContentDescription(charSequence);
        ((TextView) this.f26763a.findViewById(R.id.price_pill)).setContentDescription(charSequence);
    }

    /* renamed from: j */
    public final void mo38886j(int i) {
        this.f26763a.findViewById(R.id.price_pill).setVisibility(i);
    }

    /* renamed from: k */
    public final void mo38887k(String str) {
        C19383o.m32797g(str, "priceText");
        ((TextView) this.f26763a.findViewById(R.id.listing_price)).setText(str);
        ((TextView) this.f26763a.findViewById(R.id.price_pill)).setText(str);
    }

    /* renamed from: l */
    public final void mo38888l(int i) {
        TextView textView = (TextView) this.f26763a.findViewById(R.id.listing_price);
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12007s(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624338(0x7f0e0192, float:1.8875853E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "from(parent.context).inf…          false\n        )"
            kotlin.jvm.internal.C19383o.m32796f(r4, r0)
            r3.<init>((android.view.View) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.C12007s.<init>(android.view.ViewGroup):void");
    }
}
