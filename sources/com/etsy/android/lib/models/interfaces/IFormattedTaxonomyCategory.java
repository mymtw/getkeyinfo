package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.sdl.ISdlEvent;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p415of.C13186o;

public interface IFormattedTaxonomyCategory extends C13186o {
    List<Pair<String, Map<AnalyticsProperty, Object>>> extractOnTappedEventParameters();

    ITaxonomyCategory getCategory();

    List<FormattedTaxonomyCategory.Format> getFormats();

    List<ISdlEvent> getSdlEvents();

    /* synthetic */ int getViewType();

    void setCategory(ITaxonomyCategory iTaxonomyCategory);

    void setFormats(List<? extends FormattedTaxonomyCategory.Format> list);

    void setSdlEvents(List<? extends ISdlEvent> list);
}
