package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.search.QueryCorrection;
import java.util.List;

public class SearchFilterHeader extends BasicSectionHeader {
    public String actionTitle;
    public String categories;
    public QueryCorrection queryCorrection;

    public SearchFilterHeader() {
    }

    public String getActionTitle() {
        return this.actionTitle;
    }

    public String getCategories() {
        return this.categories;
    }

    public QueryCorrection getQueryCorrection() {
        return this.queryCorrection;
    }

    public /* bridge */ /* synthetic */ List getViewStyles() {
        return null;
    }

    public int getViewType() {
        return R.id.view_type_search_filter_header;
    }

    public void setActionTitle(String str) {
        this.actionTitle = str;
    }

    public void setCategories(String str) {
        this.categories = str;
    }

    public void setQueryCorrection(QueryCorrection queryCorrection2) {
        this.queryCorrection = queryCorrection2;
    }

    public SearchFilterHeader(String str) {
        this.actionTitle = str;
    }
}
