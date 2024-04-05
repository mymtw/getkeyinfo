package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import com.etsy.android.lib.models.interfaces.ITaxonomyCategory;
import com.etsy.android.p327ui.cardview.clickhandlers.C9134o;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.v */
public final class C9219v extends C12086e<IFormattedTaxonomyCategory> {

    /* renamed from: c */
    public final C9134o f20354c;

    public C9219v(ViewGroup viewGroup, C9134o oVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.search_suggestion_with_image, viewGroup, false));
        this.f20354c = oVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        List<ListingImage> images;
        IFormattedTaxonomyCategory iFormattedTaxonomyCategory = (IFormattedTaxonomyCategory) obj;
        C19383o.m32797g(iFormattedTaxonomyCategory, "formattedTaxonomyCategory");
        View view = this.itemView;
        TextView textView = (TextView) view.findViewById(R.id.query);
        ITaxonomyCategory category = iFormattedTaxonomyCategory.getCategory();
        textView.setText(category != null ? category.getName() : null);
        ITaxonomyCategory category2 = iFormattedTaxonomyCategory.getCategory();
        if (!(category2 == null || (images = category2.getImages()) == null)) {
            Glide.with(this.itemView.getContext()).load(images.get(0).getUrl300x300()).mo16816M((ImageView) view.findViewById(R.id.previewImage));
        }
        ViewExtensions.m12866j(view, new FormattedTaxonomyCategoriesPillsViewHolder$bind$1$2(this, iFormattedTaxonomyCategory));
    }

    /* renamed from: b */
    public final void mo31374b() {
        ((ImageView) this.itemView.findViewById(R.id.previewImage)).setImageResource(0);
    }
}
