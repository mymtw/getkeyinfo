package com.etsy.android.lib.models.cardviewelement;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseBackgroundColorFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.List;

public class BasicSectionHeader extends BaseBackgroundColorFieldModel implements IVespaListSectionHeader {
    private static final String TYPE_CARDED_HEADER = "listing_cards_header";
    private static final String TYPE_CATEGORY = "category";
    private static final String TYPE_HOME = "home";
    private static final String TYPE_LIST_REMINDER = "view_type_list_reminder";
    private static final String TYPE_SEARCH = "search";
    private static final String TYPE_SEARCH_INTERSTITIAL_CATEGORY = "search_interstitial_category";
    private static final String TYPE_SEARCH_INTERSTITIAL_TOP_RESULTS = "search_interstitial_top_results";
    public ServerDrivenAction action;
    public String icon;
    public List<ListingCard> listingCards;
    public int mViewType;
    public PageLink pageLink;
    public String subtitle;
    public String title;

    public BasicSectionHeader() {
        this.title = null;
        this.subtitle = null;
        this.mViewType = R.id.view_type_section_header;
        this.icon = null;
        this.pageLink = null;
        this.action = null;
        this.listingCards = null;
    }

    public String getIcon() {
        return this.icon;
    }

    public List<ListingCard> getListingCards() {
        return this.listingCards;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public /* bridge */ /* synthetic */ List getViewStyles() {
        return null;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            setTitle(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.SUB_TITLE.equals(str)) {
            setSubtitle(BaseModel.parseString(jsonParser));
            return true;
        } else if (ResponseConstants.VIEW_TYPE.equals(str)) {
            String parseString = BaseModel.parseString(jsonParser);
            if ("category".equals(parseString)) {
                this.mViewType = R.id.view_type_left_aligned_all_caps_header;
                return true;
            } else if (TYPE_SEARCH.equals(parseString)) {
                this.mViewType = R.id.view_type_search_filter_header;
                return true;
            } else if (TYPE_HOME.equals(parseString)) {
                this.mViewType = R.id.view_type_section_header_with_page_link;
                return true;
            } else if (TYPE_CARDED_HEADER.equals(parseString)) {
                this.mViewType = R.id.view_type_carded_section_header_with_page_link;
                return true;
            } else if (TYPE_SEARCH_INTERSTITIAL_CATEGORY.equals(parseString)) {
                this.mViewType = R.id.view_type_search_interstitial_category_header;
                return true;
            } else if (TYPE_SEARCH_INTERSTITIAL_TOP_RESULTS.equals(parseString)) {
                this.mViewType = R.id.view_type_search_interstitial_top_results_header;
                return true;
            } else if (!TYPE_LIST_REMINDER.equals(parseString)) {
                return true;
            } else {
                this.mViewType = R.id.view_type_list_reminder;
                return true;
            }
        } else if (ResponseConstants.ETSICON.equals(str)) {
            this.icon = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ACTION.equals(str)) {
            this.action = (ServerDrivenAction) BaseModel.parseObject(jsonParser, ServerDrivenAction.class);
            return true;
        } else if (!"listings".equals(str)) {
            return false;
        } else {
            this.listingCards = BaseModel.parseArray(jsonParser, ListingCard.class);
            return true;
        }
    }

    public void setPageLink(PageLink pageLink2) {
        this.pageLink = pageLink2;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }

    public ServerDrivenAction getAction() {
        return this.action;
    }

    public PageLink getPageLink() {
        return this.pageLink;
    }

    public BasicSectionHeader(String str, String str2) {
        this.mViewType = R.id.view_type_section_header;
        this.icon = null;
        this.pageLink = null;
        this.action = null;
        this.listingCards = null;
        this.title = str;
        this.subtitle = str2;
    }

    public BasicSectionHeader(String str, String str2, PageLink pageLink2, ServerDrivenAction serverDrivenAction) {
        this.mViewType = R.id.view_type_section_header;
        this.icon = null;
        this.listingCards = null;
        this.title = str;
        this.subtitle = str2;
        this.pageLink = pageLink2;
        this.action = serverDrivenAction;
    }
}
