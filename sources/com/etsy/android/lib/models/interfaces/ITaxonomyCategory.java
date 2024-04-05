package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import java.util.List;

public interface ITaxonomyCategory {
    TaxonomyNode buildTaxonomyNode();

    String getDeepLink();

    List<ListingImage> getImages();

    String getName();

    ISearchPageLink getPageLink();

    EtsyId getTaxonomyId();
}
