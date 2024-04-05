package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.models.datatypes.EtsyId;
import p415of.C13186o;

public interface ISearchPageLink extends C13186o {
    String getPageTitle();

    EtsyId getTaxonomyId();

    /* synthetic */ int getViewType();

    boolean isCategoryPage();
}
