package com.etsy.android.p327ui.cardview.viewholders;

import com.etsy.android.R;
import com.etsy.android.lib.models.datatypes.UntrackedObject;
import com.etsy.android.lib.models.interfaces.IFormattedTaxonomyCategory;
import java.util.List;
import p415of.C13186o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.p */
public final class C9205p extends UntrackedObject implements C13186o {

    /* renamed from: b */
    public final List<IFormattedTaxonomyCategory> f20320b;

    public C9205p(List<? extends IFormattedTaxonomyCategory> list) {
        this.f20320b = list;
    }

    public final int getViewType() {
        return R.id.view_type_search_featured_categories_carousel;
    }
}
