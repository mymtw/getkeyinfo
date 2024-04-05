package com.etsy.android.p327ui.cardview.viewholders;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.etsy.android.lib.models.interfaces.IFormattedListingCard;
import com.etsy.android.uikit.viewholder.ListingCardViewHolder;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.FormattedListingCardViewHolder */
public final class FormattedListingCardViewHolder extends C12086e<IFormattedListingCard> {

    /* renamed from: c */
    public final ViewGroup f20089c;

    /* renamed from: d */
    public final ListingCardViewHolder f20090d;

    /* renamed from: e */
    public final boolean f20091e;

    /* renamed from: f */
    public boolean f20092f;

    /* renamed from: g */
    public boolean f20093g;

    /* renamed from: h */
    public final C19285c f20094h = C19350d.m32677b(new FormattedListingCardViewHolder$freeShippingBadge$2(this));

    /* renamed from: i */
    public final C19285c f20095i = C19350d.m32677b(new FormattedListingCardViewHolder$ratings$2(this));

    /* renamed from: j */
    public final int f20096j;

    /* renamed from: k */
    public final int f20097k;

    /* renamed from: com.etsy.android.ui.cardview.viewholders.FormattedListingCardViewHolder$a */
    public /* synthetic */ class C9146a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20098a;

        static {
            int[] iArr = new int[FormattedListingCard.Format.values().length];
            iArr[FormattedListingCard.Format.SIGNALS_AND_NUDGES.ordinal()] = 1;
            iArr[FormattedListingCard.Format.MINIMAL.ordinal()] = 2;
            iArr[FormattedListingCard.Format.MINIMAL_WITH_PRICE.ordinal()] = 3;
            iArr[FormattedListingCard.Format.MINIMAL_WITH_PRICE_NO_AD_BADGE.ordinal()] = 4;
            iArr[FormattedListingCard.Format.MINIMAL_NO_AD_BADGE.ordinal()] = 5;
            iArr[FormattedListingCard.Format.EDGE_TO_EDGE.ordinal()] = 6;
            f20098a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormattedListingCardViewHolder(ViewGroup viewGroup, ListingCardViewHolder listingCardViewHolder, boolean z) {
        super(listingCardViewHolder.itemView);
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f20089c = viewGroup;
        this.f20090d = listingCardViewHolder;
        this.f20091e = z;
        this.f20096j = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        this.f20097k = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.clg_space_16);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        int i;
        IFormattedListingCard iFormattedListingCard = (IFormattedListingCard) obj;
        C19383o.m32797g(iFormattedListingCard, FormattedListingCard.ITEM_TYPE);
        this.f20090d.mo38778g(iFormattedListingCard.getCard());
        if (this.f20091e) {
            ListingCardSize listingCardSize = iFormattedListingCard.getListingCardSize();
            int cardPerScreen = listingCardSize.getCardPerScreen();
            int measuredWidth = this.f20089c.getMeasuredWidth();
            if (listingCardSize.getMargins() != null) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                C19383o.m32795e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                Resources resources = this.itemView.getContext().getResources();
                Integer margins = listingCardSize.getMargins();
                C19383o.m32794d(margins);
                int dimensionPixelSize = resources.getDimensionPixelSize(margins.intValue());
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                i = dimensionPixelSize * 2;
            } else {
                i = this.f20097k;
            }
            this.itemView.getLayoutParams().width = (((measuredWidth - this.f20096j) - i) / cardPerScreen) - i;
        }
        if (!iFormattedListingCard.getFormats().isEmpty()) {
            boolean z = false;
            switch (C9146a.f20098a[iFormattedListingCard.getFormats().get(0).ordinal()]) {
                case 1:
                    if (((View) this.f20094h.getValue()) != null) {
                        View view = (View) this.f20094h.getValue();
                        C19383o.m32796f(view, "freeShippingBadge");
                        if (!(view.getVisibility() == 0)) {
                            ViewExtensions.m12863g((View) this.f20094h.getValue());
                            this.f20092f = true;
                        }
                    }
                    if (((View) this.f20095i.getValue()) != null) {
                        View view2 = (View) this.f20095i.getValue();
                        C19383o.m32796f(view2, "ratings");
                        if (view2.getVisibility() == 0) {
                            z = true;
                        }
                        if (!z) {
                            ViewExtensions.m12863g((View) this.f20095i.getValue());
                            this.f20093g = true;
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    ListingCardViewHolder listingCardViewHolder = this.f20090d;
                    if (listingCardViewHolder.f26580x.mo38804r()) {
                        View view3 = listingCardViewHolder.f26581y.f26763a;
                        C19383o.m32795e(view3, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
                        MaterialCardView materialCardView = (MaterialCardView) view3;
                        materialCardView.setRadius(materialCardView.getContext().getResources().getDimension(R.dimen.clg_border_radius));
                    }
                    this.f20090d.mo38785n();
                    this.f20090d.f26581y.mo38879c();
                    return;
                case 3:
                    ListingCardViewHolder listingCardViewHolder2 = this.f20090d;
                    listingCardViewHolder2.f26581y.mo38879c();
                    listingCardViewHolder2.f26581y.mo38886j(0);
                    return;
                case 4:
                    ListingCardViewHolder listingCardViewHolder3 = this.f20090d;
                    listingCardViewHolder3.f26581y.mo38879c();
                    listingCardViewHolder3.f26581y.f26763a.findViewById(R.id.ad_badge).setVisibility(8);
                    listingCardViewHolder3.f26581y.mo38886j(0);
                    return;
                case 5:
                    this.f20090d.f26581y.mo38879c();
                    this.f20090d.f26581y.f26763a.findViewById(R.id.ad_badge).setVisibility(8);
                    return;
                case 6:
                    ListingCardViewHolder listingCardViewHolder4 = this.f20090d;
                    if (!listingCardViewHolder4.f26580x.mo38806t()) {
                        listingCardViewHolder4.f26581y.mo38888l(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        View view;
        View view2;
        this.f20090d.mo31374b();
        if (this.f20092f && (view2 = (View) this.f20094h.getValue()) != null) {
            ViewExtensions.m12860d(view2);
        }
        if (this.f20093g && (view = (View) this.f20095i.getValue()) != null) {
            ViewExtensions.m12860d(view);
        }
        this.f20093g = false;
        this.f20092f = false;
    }
}
