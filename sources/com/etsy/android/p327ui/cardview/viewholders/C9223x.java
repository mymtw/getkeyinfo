package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.x */
public final class C9223x extends C12086e<IFormattedTaxonomyCategory> {

    /* renamed from: c */
    public final C13171a<C13186o> f20360c;

    /* renamed from: d */
    public TextView f20361d;

    /* renamed from: e */
    public ImageView f20362e;

    /* renamed from: f */
    public MaterialCardView f20363f;

    /* renamed from: g */
    public final C9221w f20364g = new C9221w(this);

    /* renamed from: com.etsy.android.ui.cardview.viewholders.x$a */
    public /* synthetic */ class C9224a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20365a;

        static {
            int[] iArr = new int[FormattedTaxonomyCategory.Format.values().length];
            iArr[FormattedTaxonomyCategory.Format.IMAGE_FIRST_SEPARATE_TEXT.ordinal()] = 1;
            iArr[FormattedTaxonomyCategory.Format.CIRCLE_IMAGE_SEPARATE_TEXT.ordinal()] = 2;
            f20365a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9223x(ViewGroup viewGroup, C8703p pVar, C13171a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_formatted_taxonomy_category, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, "analyticsTracker");
        this.f20360c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0036, code lost:
        r1 = r7.getCategory();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19450a(java.lang.Object r7) {
        /*
            r6 = this;
            com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory r7 = (com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory) r7
            android.view.View r0 = r6.itemView
            r1 = 2131430094(0x7f0b0ace, float:1.848188E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f20361d = r0
            android.view.View r0 = r6.itemView
            r1 = 2131427719(0x7f0b0187, float:1.8477062E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.f20362e = r0
            android.view.View r0 = r6.itemView
            r1 = 2131428854(0x7f0b05f6, float:1.8479364E38)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            com.etsy.android.ui.cardview.viewholders.w r1 = r6.f20364g
            r0.removeOnLayoutChangeListener(r1)
            com.etsy.android.ui.cardview.viewholders.w r1 = r6.f20364g
            r0.addOnLayoutChangeListener(r1)
            r6.f20363f = r0
            r0 = 0
            if (r7 == 0) goto L_0x0041
            com.etsy.android.lib.models.interfaces.ITaxonomyCategory r1 = r7.getCategory()
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r1.getImages()
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            r2 = 1
            if (r1 == 0) goto L_0x006d
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x006d
            android.widget.ImageView r3 = r6.f20362e
            if (r3 == 0) goto L_0x006d
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = (com.etsy.android.lib.models.apiv3.listing.ListingImage) r1
            java.lang.String r1 = r1.getUrl()
            android.view.View r3 = r6.itemView
            com.etsy.android.lib.core.img.GlideRequests r3 = androidx.activity.C0114h.m272C0(r3)
            u9.b r1 = r3.load((java.lang.String) r1)
            android.widget.ImageView r3 = r6.f20362e
            kotlin.jvm.internal.C19383o.m32794d(r3)
            r1.mo16816M(r3)
        L_0x006d:
            if (r7 == 0) goto L_0x00e6
            java.util.List r1 = r7.getFormats()
            if (r1 == 0) goto L_0x00e6
            java.util.Iterator r1 = r1.iterator()
        L_0x0079:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e6
            java.lang.Object r3 = r1.next()
            com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory$Format r3 = (com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory.Format) r3
            int[] r4 = com.etsy.android.p327ui.cardview.viewholders.C9223x.C9224a.f20365a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            if (r3 == r2) goto L_0x00ca
            r4 = 2
            if (r3 == r4) goto L_0x0093
            goto L_0x0079
        L_0x0093:
            android.widget.TextView r3 = r6.f20361d
            if (r3 == 0) goto L_0x009a
            com.etsy.android.extensions.ViewExtensions.m12869m(r3)
        L_0x009a:
            android.widget.TextView r3 = r6.f20361d
            if (r3 != 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.etsy.android.lib.models.interfaces.ITaxonomyCategory r5 = r7.getCategory()
            if (r5 == 0) goto L_0x00aa
            java.lang.String r5 = r5.getName()
            goto L_0x00ab
        L_0x00aa:
            r5 = r0
        L_0x00ab:
            r3.setText(r5)
        L_0x00ae:
            android.widget.TextView r3 = r6.f20361d
            if (r3 != 0) goto L_0x00b3
            goto L_0x00b6
        L_0x00b3:
            r3.setMaxLines(r4)
        L_0x00b6:
            android.widget.TextView r3 = r6.f20361d
            if (r3 != 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.MARQUEE
            r3.setEllipsize(r4)
        L_0x00c0:
            android.widget.TextView r3 = r6.f20361d
            if (r3 != 0) goto L_0x00c5
            goto L_0x0079
        L_0x00c5:
            r4 = 4
            r3.setTextAlignment(r4)
            goto L_0x0079
        L_0x00ca:
            android.widget.TextView r3 = r6.f20361d
            if (r3 == 0) goto L_0x00d1
            com.etsy.android.extensions.ViewExtensions.m12869m(r3)
        L_0x00d1:
            android.widget.TextView r3 = r6.f20361d
            if (r3 != 0) goto L_0x00d6
            goto L_0x0079
        L_0x00d6:
            com.etsy.android.lib.models.interfaces.ITaxonomyCategory r4 = r7.getCategory()
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = r4.getName()
            goto L_0x00e2
        L_0x00e1:
            r4 = r0
        L_0x00e2:
            r3.setText(r4)
            goto L_0x0079
        L_0x00e6:
            if (r7 == 0) goto L_0x00f7
            android.view.View r0 = r6.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            com.etsy.android.ui.cardview.viewholders.FormattedTaxonomyCategoryViewHolder$bind$3 r1 = new com.etsy.android.ui.cardview.viewholders.FormattedTaxonomyCategoryViewHolder$bind$3
            r1.<init>(r6, r7)
            com.etsy.android.extensions.ViewExtensions.m12866j(r0, r1)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.viewholders.C9223x.mo19450a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo31374b() {
        TextView textView = this.f20361d;
        if (textView != null) {
            ViewExtensions.m12860d(textView);
        }
        this.f20361d = null;
        this.f20362e = null;
        MaterialCardView materialCardView = this.f20363f;
        if (materialCardView != null) {
            materialCardView.removeOnLayoutChangeListener(this.f20364g);
        }
        this.f20363f = null;
    }
}
