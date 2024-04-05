package com.etsy.android.uikit.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.uikit.view.ListingDynamicSizeImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p407nf.C13113a;

/* renamed from: com.etsy.android.uikit.viewholder.p */
public final class C12004p extends C12086e<ListingCard> {

    /* renamed from: c */
    public final C13113a f26747c;

    /* renamed from: d */
    public final C8630b f26748d;

    /* renamed from: e */
    public final C12008t f26749e;

    /* renamed from: f */
    public final ListingDynamicSizeImageView f26750f;

    /* renamed from: g */
    public final TextView f26751g;

    /* renamed from: h */
    public final FavHeartButton f26752h;

    /* renamed from: i */
    public final TextView f26753i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12004p(ViewGroup viewGroup, C9125j jVar, C8630b bVar, C12008t tVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_card_view_listing_3x3, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(tVar, "dependencies");
        this.f26747c = jVar;
        this.f26748d = bVar;
        this.f26749e = tVar;
        View f = mo38986f(R.id.listing_image);
        C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.uikit.view.ListingDynamicSizeImageView");
        this.f26750f = (ListingDynamicSizeImageView) f;
        View f2 = mo38986f(R.id.ad_badge);
        C19383o.m32795e(f2, "null cannot be cast to non-null type android.widget.TextView");
        this.f26751g = (TextView) f2;
        View f3 = mo38986f(R.id.favorite_button);
        C19383o.m32795e(f3, "null cannot be cast to non-null type com.etsy.android.stylekit.views.FavHeartButton");
        this.f26752h = (FavHeartButton) f3;
        View f4 = mo38986f(R.id.listing_price);
        C19383o.m32795e(f4, "null cannot be cast to non-null type android.widget.TextView");
        this.f26753i = (TextView) f4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19450a(java.lang.Object r10) {
        /*
            r9 = this;
            com.etsy.android.lib.models.apiv3.ListingCard r10 = (com.etsy.android.lib.models.apiv3.ListingCard) r10
            java.lang.String r0 = "listing"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            com.etsy.android.uikit.viewholder.q r8 = new com.etsy.android.uikit.viewholder.q
            android.view.View r0 = r9.itemView
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r0 = "itemView.resources"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            com.etsy.android.uikit.viewholder.t r0 = r9.f26749e
            q9.p r3 = r0.f26765b
            com.etsy.android.lib.currency.b r4 = r9.f26748d
            android.text.style.StrikethroughSpan r5 = r0.f26767d
            android.text.style.ForegroundColorSpan r6 = r0.f26768e
            com.etsy.android.stylekit.typefaces.StyleKitSpan$NormalSpan r7 = r0.f26769f
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r8.f26754a
            java.util.List r0 = r0.getListingImages()
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0035
            r0 = r1
            goto L_0x0041
        L_0x0035:
            com.etsy.android.lib.models.apiv3.ListingCard r0 = r8.f26754a
            java.util.List r0 = r0.getListingImages()
            java.lang.Object r0 = r0.get(r2)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r0 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r0
        L_0x0041:
            java.lang.String r3 = ""
            r4 = 1
            if (r0 == 0) goto L_0x0073
            java.lang.String r5 = r0.getUrlFullxFull()
            if (r5 == 0) goto L_0x0055
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r5 = r2
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            if (r5 == 0) goto L_0x0062
            java.lang.String r5 = r0.getUrl()
            if (r5 != 0) goto L_0x005f
            r5 = r3
        L_0x005f:
            r0.setUrlFullxFull(r5)
        L_0x0062:
            com.etsy.android.uikit.view.ListingDynamicSizeImageView r5 = r9.f26750f
            java.lang.String r6 = r0.getUrlFullxFull()
            int r0 = r0.getImageColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.setImageInfo(r6, r0)
        L_0x0073:
            com.etsy.android.uikit.view.ListingDynamicSizeImageView r0 = r9.f26750f
            android.content.res.Resources r5 = r8.f26755b
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.etsy.android.lib.models.apiv3.ListingCard r7 = r8.f26754a
            java.lang.String r7 = r7.getTitle()
            r6[r2] = r7
            r7 = 2131952393(0x7f130309, float:1.9541227E38)
            java.lang.String r5 = r5.getString(r7, r6)
            java.lang.String r6 = "resources.getString(R.st…em_button, listing.title)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r0.setContentDescription(r5)
            com.etsy.android.uikit.view.ListingDynamicSizeImageView r0 = r9.f26750f
            r0.setImportantForAccessibility(r4)
            android.widget.TextView r0 = r9.f26751g
            com.etsy.android.lib.models.apiv3.ListingCard r5 = r8.f26754a
            boolean r5 = r5.isAd()
            if (r5 == 0) goto L_0x00a1
            r5 = r2
            goto L_0x00a2
        L_0x00a1:
            r5 = 4
        L_0x00a2:
            r0.setVisibility(r5)
            android.widget.TextView r0 = r9.f26753i
            com.etsy.android.lib.models.apiv3.ListingCard r5 = r8.f26754a
            com.etsy.android.lib.currency.EtsyMoney r5 = r5.getPrice()
            java.lang.String r5 = r8.mo38870a(r5)
            com.etsy.android.lib.models.apiv3.ListingCard r6 = r8.f26754a
            com.etsy.android.lib.models.apiv3.Money r6 = r6.getDiscountedPrice()
            if (r6 == 0) goto L_0x00bd
            com.etsy.android.lib.currency.EtsyMoney r1 = r6.asEtsyMoney()
        L_0x00bd:
            if (r1 == 0) goto L_0x00c3
            java.lang.String r3 = r8.mo38870a(r1)
        L_0x00c3:
            com.etsy.android.lib.models.apiv3.ListingCard r1 = r8.f26754a
            boolean r1 = r1.isSoldOut()
            if (r1 == 0) goto L_0x00da
            android.content.res.Resources r1 = r8.f26755b
            r3 = 2131953569(0x7f1307a1, float:1.9543613E38)
            java.lang.String r5 = r1.getString(r3)
            java.lang.String r1 = "resources.getString(R.string.sold)"
            kotlin.jvm.internal.C19383o.m32796f(r5, r1)
            goto L_0x0116
        L_0x00da:
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r5, r3)
            if (r1 == 0) goto L_0x00e1
            goto L_0x0116
        L_0x00e1:
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x00e9
            r1 = r4
            goto L_0x00ea
        L_0x00e9:
            r1 = r2
        L_0x00ea:
            if (r1 == 0) goto L_0x0116
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " "
            r1.append(r3)
            int r3 = r1.length()
            r1.append(r5)
            int r5 = r1.length()
            android.text.style.StrikethroughSpan r6 = r8.f26758e
            r7 = 33
            r1.setSpan(r6, r3, r5, r7)
            android.text.style.ForegroundColorSpan r6 = r8.f26759f
            r1.setSpan(r6, r3, r5, r7)
            android.text.style.MetricAffectingSpan r6 = r8.f26760g
            r1.setSpan(r6, r3, r5, r7)
            r5 = r1
        L_0x0116:
            r0.setText(r5)
            com.etsy.android.stylekit.views.FavHeartButton r0 = r9.f26752h
            com.etsy.android.extensions.ViewExtensions.m12869m(r0)
            q9.p r1 = r8.f26756c
            boolean r1 = r1.mo45960e()
            if (r1 == 0) goto L_0x0130
            com.etsy.android.lib.models.apiv3.ListingCard r1 = r8.f26754a
            boolean r1 = r1.isFavorite()
            if (r1 == 0) goto L_0x0130
            r1 = r4
            goto L_0x0131
        L_0x0130:
            r1 = r2
        L_0x0131:
            com.etsy.android.lib.models.apiv3.ListingCard r3 = r8.f26754a
            java.lang.String r3 = r3.getTitle()
            java.lang.String r5 = "viewModel.listing.title"
            kotlin.jvm.internal.C19383o.m32796f(r3, r5)
            r0.setFav(r1, r3, r2)
            com.etsy.android.lib.logger.l[] r1 = new com.etsy.android.lib.logger.C8698l[r4]
            com.etsy.android.lib.models.apiv3.ListingCard r3 = r8.f26754a
            r1[r2] = r3
            com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bindFavoriteButton$1 r3 = new com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bindFavoriteButton$1
            r3.<init>(r9, r8, r0, r1)
            r0.setOnClickListener(r3)
            android.view.View r0 = r9.itemView
            com.etsy.android.lib.logger.l[] r1 = new com.etsy.android.lib.logger.C8698l[r4]
            r1[r2] = r10
            com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bind$2 r3 = new com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bind$2
            r3.<init>(r9, r10, r1)
            r0.setOnClickListener(r3)
            android.view.View r0 = r9.itemView
            com.etsy.android.lib.logger.l[] r1 = new com.etsy.android.lib.logger.C8698l[r4]
            r1[r2] = r10
            com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bind$3 r2 = new com.etsy.android.uikit.viewholder.ListingCard3x3ViewHolder$bind$3
            r2.<init>(r9, r10, r1)
            r0.setOnLongClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.viewholder.C12004p.mo19450a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f26750f.cleanUp();
    }
}
