package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0087d;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.vespa.viewholders.C12086e;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.n1 */
public final class C9201n1 extends C12086e<TaxonomyCategory> {

    /* renamed from: c */
    public C13171a f20307c;

    /* renamed from: d */
    public int f20308d;

    /* renamed from: e */
    public ImageView f20309e = ((ImageView) this.itemView.findViewById(R.id.search_taxonomy_image));

    /* renamed from: f */
    public TextView f20310f = ((TextView) this.itemView.findViewById(R.id.search_taxonomy_text));

    /* renamed from: g */
    public int f20311g;

    public C9201n1(ViewGroup viewGroup, C13171a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_taxonomy_category_search_interstitial, viewGroup, false));
        this.f20307c = aVar;
        this.f20311g = viewGroup.getResources().getDimensionPixelSize(R.dimen.category_row_icon_size);
        this.f20308d = C0087d.m233b(this.itemView, R.dimen.sk_cardview_corner_radius);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19450a(java.lang.Object r8) {
        /*
            r7 = this;
            com.etsy.android.lib.models.apiv3.TaxonomyCategory r8 = (com.etsy.android.lib.models.apiv3.TaxonomyCategory) r8
            android.widget.ImageView r0 = r7.f20309e
            int r1 = r7.f20311g
            android.widget.TextView r2 = r7.f20310f
            java.lang.String r3 = r8.getName()
            r2.setText(r3)
            r2 = 0
            r0.setImageDrawable(r2)
            java.lang.String r2 = r8.getPath()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 0
            if (r2 != 0) goto L_0x011f
            java.lang.String r2 = r8.getPath()
            r4 = 2131230967(0x7f0800f7, float:1.8078002E38)
            if (r2 == 0) goto L_0x0103
            int r5 = r2.hashCode()
            switch(r5) {
                case -2131278479: goto L_0x00f6;
                case -1901913285: goto L_0x00e9;
                case -1760973648: goto L_0x00dc;
                case -1704298038: goto L_0x00cf;
                case -1210747392: goto L_0x00c2;
                case -1031015936: goto L_0x00b5;
                case -1017666768: goto L_0x00a8;
                case -656904801: goto L_0x0099;
                case -405703440: goto L_0x008a;
                case 109413096: goto L_0x007b;
                case 316125551: goto L_0x006c;
                case 1052057782: goto L_0x005d;
                case 1093847944: goto L_0x004e;
                case 1870351597: goto L_0x003f;
                case 1890381825: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0103
        L_0x0030:
            java.lang.String r5 = "paper_and_party_supplies"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x003a
            goto L_0x0103
        L_0x003a:
            r2 = 2131232124(0x7f08057c, float:1.8080348E38)
            goto L_0x0104
        L_0x003f:
            java.lang.String r5 = "pet_supplies"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0049
            goto L_0x0103
        L_0x0049:
            r2 = 2131232125(0x7f08057d, float:1.808035E38)
            goto L_0x0104
        L_0x004e:
            java.lang.String r5 = "clothing"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0058
            goto L_0x0103
        L_0x0058:
            r2 = 2131232119(0x7f080577, float:1.8080338E38)
            goto L_0x0104
        L_0x005d:
            java.lang.String r5 = "books_movies_and_music"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0067
            goto L_0x0103
        L_0x0067:
            r2 = 2131232118(0x7f080576, float:1.8080336E38)
            goto L_0x0104
        L_0x006c:
            java.lang.String r5 = "toys_and_games"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0076
            goto L_0x0103
        L_0x0076:
            r2 = 2131232127(0x7f08057f, float:1.8080354E38)
            goto L_0x0104
        L_0x007b:
            java.lang.String r5 = "shoes"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0085
            goto L_0x0103
        L_0x0085:
            r2 = 2131232126(0x7f08057e, float:1.8080352E38)
            goto L_0x0104
        L_0x008a:
            java.lang.String r5 = "bags_and_purses"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0094
            goto L_0x0103
        L_0x0094:
            r2 = 2131232116(0x7f080574, float:1.8080332E38)
            goto L_0x0104
        L_0x0099:
            java.lang.String r5 = "weddings"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00a3
            goto L_0x0103
        L_0x00a3:
            r2 = 2131232128(0x7f080580, float:1.8080357E38)
            goto L_0x0104
        L_0x00a8:
            java.lang.String r5 = "accessories"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00b1
            goto L_0x0103
        L_0x00b1:
            r2 = 2131232114(0x7f080572, float:1.8080328E38)
            goto L_0x0104
        L_0x00b5:
            java.lang.String r5 = "craft_supplies_and_tools"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00be
            goto L_0x0103
        L_0x00be:
            r2 = 2131232120(0x7f080578, float:1.808034E38)
            goto L_0x0104
        L_0x00c2:
            java.lang.String r5 = "electronics_and_accessories"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00cb
            goto L_0x0103
        L_0x00cb:
            r2 = 2131232121(0x7f080579, float:1.8080342E38)
            goto L_0x0104
        L_0x00cf:
            java.lang.String r5 = "jewelry"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00d8
            goto L_0x0103
        L_0x00d8:
            r2 = 2131232123(0x7f08057b, float:1.8080346E38)
            goto L_0x0104
        L_0x00dc:
            java.lang.String r5 = "bath_and_beauty"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00e5
            goto L_0x0103
        L_0x00e5:
            r2 = 2131232117(0x7f080575, float:1.8080334E38)
            goto L_0x0104
        L_0x00e9:
            java.lang.String r5 = "art_and_collectibles"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00f2
            goto L_0x0103
        L_0x00f2:
            r2 = 2131232115(0x7f080573, float:1.808033E38)
            goto L_0x0104
        L_0x00f6:
            java.lang.String r5 = "home_and_living"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            r2 = 2131232122(0x7f08057a, float:1.8080344E38)
            goto L_0x0104
        L_0x0103:
            r2 = r4
        L_0x0104:
            if (r2 == r4) goto L_0x011f
            r0.setImageResource(r2)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMargins(r3, r3, r3, r3)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r4 = -2
            r2.width = r4
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.height = r4
        L_0x011f:
            java.util.List r2 = r8.getImages()
            r4 = 1
            if (r2 == 0) goto L_0x015a
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x015a
            java.lang.Object r2 = r2.get(r3)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r2 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r2
            java.lang.String r1 = r2.getImageUrlForPixelWidth(r1)
            android.view.View r2 = r7.itemView
            com.etsy.android.lib.core.img.GlideRequests r2 = androidx.activity.C0114h.m272C0(r2)
            u9.b r1 = r2.load((java.lang.String) r1)
            r2 = 2
            j4.h[] r2 = new p150j4.C7117h[r2]
            com.bumptech.glide.load.resource.bitmap.i r5 = new com.bumptech.glide.load.resource.bitmap.i
            r5.<init>()
            r2[r3] = r5
            com.bumptech.glide.load.resource.bitmap.w r5 = new com.bumptech.glide.load.resource.bitmap.w
            int r6 = r7.f20308d
            r5.<init>(r6)
            r2[r4] = r5
            u9.b r1 = r1.mo46145m0(r2)
            r1.mo16816M(r0)
        L_0x015a:
            android.view.View r0 = r7.itemView
            com.etsy.android.ui.cardview.viewholders.m1 r1 = new com.etsy.android.ui.cardview.viewholders.m1
            com.etsy.android.lib.logger.l[] r2 = new com.etsy.android.lib.logger.C8698l[r4]
            r2[r3] = r8
            r1.<init>(r7, r2, r8)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.viewholders.C9201n1.mo19450a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20309e.setImageDrawable((Drawable) null);
    }
}
