package com.etsy.android.p327ui.search.p330v2.relatedcategories;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p441sb.C13367a;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder */
public final class FeaturedCategoryViewHolder extends C12086e<IFormattedTaxonomyCategory> {

    /* renamed from: c */
    public final C9134o f24453c;

    /* renamed from: d */
    public final TextView f24454d;

    /* renamed from: e */
    public final ImageView f24455e;

    /* renamed from: com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder$a */
    public /* synthetic */ class C11030a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24456a;

        static {
            int[] iArr = new int[FormattedTaxonomyCategory.Format.values().length];
            iArr[FormattedTaxonomyCategory.Format.SELECTED.ordinal()] = 1;
            f24456a = iArr;
        }
    }

    public FeaturedCategoryViewHolder(ViewGroup viewGroup, C9134o oVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_circular_formatted_category, viewGroup, false));
        this.f24453c = oVar;
        View findViewById = this.itemView.findViewById(R.id.text_out_image);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.text_out_image)");
        this.f24454d = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.category_image);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.category_image)");
        this.f24455e = (ImageView) findViewById2;
    }

    /* renamed from: b */
    public final void mo31374b() {
        C19388s.m32810A0(this.f24454d, new C13367a.C13370c());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f24455e.setLayoutParams(layoutParams);
        this.f24455e.setImageResource(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r6.getCategory();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19450a(com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory r6) {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.f24454d
            r1 = 0
            if (r6 == 0) goto L_0x0010
            com.etsy.android.lib.models.interfaces.ITaxonomyCategory r2 = r6.getCategory()
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.getName()
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            r0.setText(r2)
            if (r6 == 0) goto L_0x0020
            com.etsy.android.lib.models.interfaces.ITaxonomyCategory r0 = r6.getCategory()
            if (r0 == 0) goto L_0x0020
            java.util.List r1 = r0.getImages()
        L_0x0020:
            r0 = 1
            if (r1 == 0) goto L_0x0055
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0055
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r1
            android.view.View r2 = r5.itemView
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165349(0x7f0700a5, float:1.7944913E38)
            int r2 = r2.getDimensionPixelSize(r3)
            java.lang.String r1 = r1.getImageUrlForPixelWidth(r2)
            android.view.View r2 = r5.itemView
            com.etsy.android.lib.core.img.GlideRequests r2 = androidx.activity.C0114h.m272C0(r2)
            u9.b r1 = r2.load((java.lang.String) r1)
            u9.b r1 = r1.mo46137e0()
            android.widget.ImageView r2 = r5.f24455e
            r1.mo16816M(r2)
        L_0x0055:
            if (r6 == 0) goto L_0x00a7
            java.util.List r1 = r6.getFormats()
            if (r1 == 0) goto L_0x00a7
            java.util.Iterator r1 = r1.iterator()
        L_0x0061:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.next()
            com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory$Format r2 = (com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory.Format) r2
            int[] r3 = com.etsy.android.p327ui.search.p330v2.relatedcategories.FeaturedCategoryViewHolder.C11030a.f24456a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 != r0) goto L_0x0061
            android.widget.TextView r2 = r5.f24454d
            r3 = 2131296256(0x7f090000, float:1.8210424E38)
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)
            android.content.Context r4 = r2.getContext()
            android.graphics.Typeface r3 = p280x0.C8292f.m16582a(r4, r3)
            r2.setTypeface(r3)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            android.view.View r3 = r5.itemView
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165388(0x7f0700cc, float:1.7944992E38)
            int r3 = r3.getDimensionPixelSize(r4)
            r2.setMargins(r3, r3, r3, r3)
            android.widget.ImageView r3 = r5.f24455e
            r3.setLayoutParams(r2)
            goto L_0x0061
        L_0x00a7:
            if (r6 == 0) goto L_0x00b8
            android.view.View r0 = r5.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder$bind$2 r1 = new com.etsy.android.ui.search.v2.relatedcategories.FeaturedCategoryViewHolder$bind$2
            r1.<init>(r5, r6)
            com.etsy.android.extensions.ViewExtensions.m12866j(r0, r1)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.relatedcategories.FeaturedCategoryViewHolder.mo19450a(com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory):void");
    }
}
