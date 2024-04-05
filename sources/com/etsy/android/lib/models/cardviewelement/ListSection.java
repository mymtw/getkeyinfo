package com.etsy.android.lib.models.cardviewelement;

import android.os.Parcelable;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.AnalyticsProperties;
import com.etsy.android.lib.models.BaseBackgroundColorFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ColorPairModel;
import com.etsy.android.lib.models.ListingCardFormatPresenter;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ReviewCarouselCard;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.SearchSuggestion;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.ordershippingstate.OrderShippingStatusCard;
import com.etsy.android.lib.models.apiv3.vespa.CardActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.DeeplinkTableRow;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopic;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.etsy.android.lib.models.cardviewelement.stats.SdlEvent;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.lib.models.homescreen.LandingPageInfoHolder;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.lib.models.homescreen.RelatedTagLink;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p415of.C13183l;
import p415of.C13186o;
import p415of.C13187p;
import p415of.C13188q;
import p415of.C13191t;

public class ListSection extends BaseBackgroundColorFieldModel implements C13183l, C13191t {
    private static final long serialVersionUID = -4492212913528156734L;
    private Map<AnalyticsProperty, Object> analyticsProperties = new HashMap();
    public int backgroundColor = 0;
    public Image backgroundImage = null;
    public String backgroundImageColorDark = "";
    public String backgroundImageColorLight = "";
    public SectionFooter footer = null;
    private List<SdlEvent> listSectionEvents = new ArrayList();
    public String mAnalyticsName = "";
    public String mCardSize = "";
    public C13186o mHeader = null;
    public boolean mIsHorizontal = false;
    public String mItemType = "";
    public List<C13186o> mItems = new ArrayList();
    public Parcelable mLayoutState;
    public ListingCardSize mListingCardSize = new ListingCardSize();
    public boolean mNested = false;
    public PageLink mPageLink = null;
    public List<String> styles = null;

    private boolean isHeaderWithPageLink(C13186o oVar) {
        C13186o oVar2 = this.mHeader;
        return oVar2 != null && (oVar2 instanceof BasicSectionHeader) && (oVar2.getViewType() == R.id.view_type_section_header_with_page_link || this.mHeader.getViewType() == R.id.view_type_carded_section_header_with_page_link);
    }

    private void setListingCardSize(String str) {
        if (str != null) {
            new ListingCardFormatPresenter(this.mListingCardSize).updateListingCardFormat(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSection listSection = (ListSection) obj;
        return this.mIsHorizontal == listSection.mIsHorizontal && this.mNested == listSection.mNested && this.backgroundColor == listSection.backgroundColor && Objects.equals(this.mHeader, listSection.mHeader) && Objects.equals(this.footer, listSection.footer) && Objects.equals(this.mPageLink, listSection.mPageLink) && Objects.equals(this.mAnalyticsName, listSection.mAnalyticsName) && Objects.equals(this.mItemType, listSection.mItemType) && Objects.equals(this.mCardSize, listSection.mCardSize) && Objects.equals(this.listSectionEvents, listSection.listSectionEvents) && Objects.equals(this.analyticsProperties, listSection.analyticsProperties) && Objects.equals(this.backgroundImageColorLight, listSection.backgroundImageColorLight) && Objects.equals(this.backgroundImageColorDark, listSection.backgroundImageColorDark) && Objects.equals(this.backgroundImage, listSection.backgroundImage) && Objects.equals(this.styles, listSection.styles) && Objects.equals(this.mListingCardSize, listSection.mListingCardSize) && Objects.equals(this.mLayoutState, listSection.mLayoutState) && Objects.equals(this.mItems, listSection.mItems);
    }

    public void foldLinkIntoCards() {
        List<C13186o> list = this.mItems;
        if (list != null) {
            for (C13186o next : list) {
                if (next instanceof LandingPageInfoHolder) {
                    PageLink pageLink = this.mPageLink;
                    if (pageLink instanceof LandingPageInfo) {
                        ((LandingPageInfoHolder) next).setLandingPage((LandingPageInfo) pageLink);
                    }
                }
            }
        }
    }

    public String getAnalyticsName() {
        return this.mAnalyticsName;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getBackgroundColorTop() {
        return this.backgroundColor;
    }

    public Image getBackgroundImage() {
        return this.backgroundImage;
    }

    public String getBackgroundImageColorDark() {
        return this.backgroundImageColorDark;
    }

    public String getBackgroundImageColorLight() {
        return this.backgroundImageColorLight;
    }

    public C13186o getFooter() {
        SectionFooter sectionFooter = this.footer;
        if (sectionFooter != null) {
            return sectionFooter;
        }
        PageLink pageLink = this.mPageLink;
        if (pageLink != null) {
            return pageLink;
        }
        return null;
    }

    public boolean getHasMatchingItemViewHeights() {
        List<String> list = this.styles;
        return list != null && list.contains("match_heights");
    }

    public C13186o getHeader() {
        C13186o oVar = this.mHeader;
        if (oVar != null && !(oVar instanceof DeeplinkTableRowSectionHeader) && this.mItemType.equals(DeeplinkTableRow.ITEM_TYPE)) {
            DeeplinkTableRowSectionHeader deeplinkTableRowSectionHeader = new DeeplinkTableRowSectionHeader(((IVespaListSectionHeader) this.mHeader).getTitle(), ((IVespaListSectionHeader) this.mHeader).getSubtitle());
            this.mHeader = deeplinkTableRowSectionHeader;
            DeeplinkTableRowSectionHeader deeplinkTableRowSectionHeader2 = deeplinkTableRowSectionHeader;
            deeplinkTableRowSectionHeader.setBackgroundColorTop(this.backgroundColor);
        }
        return this.mHeader;
    }

    public C13186o getHeaderWithViewAll() {
        if (isHeaderWithPageLink(this.mHeader)) {
            ((BasicSectionHeader) this.mHeader).setPageLink(this.mPageLink);
        }
        return this.mHeader;
    }

    public List<C13186o> getItems() {
        for (C13186o next : this.mItems) {
            if (next instanceof C13188q) {
                ((C13188q) next).injectMetadataProvider(this);
            }
        }
        if (this.mIsHorizontal || this.mItemType.equals(FormattedTopicFirstFeatured.ITEM_TYPE)) {
            String str = this.mAnalyticsName;
            C19383o.m32797g(str, "name");
            C19388s.m32824H0(this, str);
            C19388s.m32820F0(this, C19382n.m32714I0(this.listSectionEvents));
        } else if (this.mItems.size() != 0) {
            C8698l lVar = (C8698l) this.mItems.get(0);
            ArrayList I0 = C19382n.m32714I0(this.listSectionEvents);
            C19383o.m32797g(lVar, "item");
            C19388s.m32820F0(lVar, I0);
            String str2 = this.mAnalyticsName;
            C19383o.m32797g(str2, "name");
            C19388s.m32824H0(lVar, str2);
            C19388s.m32818E0(lVar, C19388s.m32882r0(this));
        }
        return this.mItems;
    }

    public Parcelable getLayoutState() {
        return this.mLayoutState;
    }

    public String getListSectionAnalyticsName() {
        return this.mAnalyticsName;
    }

    public List<SdlEvent> getListSectionEvents() {
        return this.listSectionEvents;
    }

    public C13186o getPageLink() {
        return this.mPageLink;
    }

    public String getTitle() {
        C13186o oVar = this.mHeader;
        if (oVar == null || !(oVar instanceof IVespaListSectionHeader)) {
            return null;
        }
        return ((IVespaListSectionHeader) oVar).getTitle();
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return this.analyticsProperties;
    }

    public int getViewType() {
        List<C13186o> list;
        if (this.mItemType.equals("formattedTaxonomyCategory") && (list = this.mItems) != null && !list.isEmpty() && (this.mItems.get(0) instanceof FormattedTaxonomyCategory)) {
            FormattedTaxonomyCategory.Format format = ((FormattedTaxonomyCategory) this.mItems.get(0)).getFormats().get(0);
            if (format.equals(FormattedTaxonomyCategory.Format.IMAGE_LEFT_PILL)) {
                return R.id.view_type_list_section_formatted_taxonomy_category_pills;
            }
            if (format.equals(FormattedTaxonomyCategory.Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT)) {
                return R.id.view_type_formatted_taxonomy_featured_categories;
            }
            if (format.equals(FormattedTaxonomyCategory.Format.CIRCLE_IMAGE_SEPARATE_TEXT) && isHorizontal()) {
                return R.id.view_type_list_section_formatted_taxonomy_category_horizontal;
            }
        }
        return this.mItemType.equals(FormattedTopic.ITEM_TYPE) ? R.id.view_type_horizontal_topics : this.mItemType.equals(FormattedTopicFirstFeatured.ITEM_TYPE) ? R.id.view_type_formatted_topic_first_featured : this.mItemType.equals(RelatedTagLink.ITEM_TYPE) ? this.mIsHorizontal ? R.id.view_type_horizontal_related_link_tag_section : R.id.view_type_related_link_tag : this.mItemType.equals(SearchSuggestion.WITH_IMAGE_ITEM_TYPE) ? R.id.view_type_list_section_search_suggestion_with_image : this.mItemType.equals(ShopCard.SHOP_CARD) ? R.id.view_type_horizontal_shops : this.mItemType.equals(ReviewCarouselCard.REVIEW_CAROUSEL) ? R.id.view_type_review_carousel : this.mItemType.equals(OrderShippingStatusCard.ORDER_SHIPPING_STATUS_CARD) ? R.id.view_type_order_shipping_status : this.mNested ? R.id.view_type_nested_list_section : this.mItemType.equals(FormattedListingCard.ITEM_TYPE) ? R.id.view_type_horizontal_formatted_listing : this.mItemType.equals("savedForLaterCard") ? R.id.view_type_multishop_saved_for_later_carousel : R.id.view_type_horizontal_list_section;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mHeader, this.footer, this.mPageLink, Boolean.valueOf(this.mIsHorizontal), this.mAnalyticsName, Boolean.valueOf(this.mNested), this.mItemType, this.mCardSize, this.listSectionEvents, this.analyticsProperties, Integer.valueOf(this.backgroundColor), this.backgroundImageColorLight, this.backgroundImageColorDark, this.backgroundImage, this.styles, this.mListingCardSize, this.mLayoutState, this.mItems});
    }

    public boolean isHorizontal() {
        return this.mIsHorizontal;
    }

    public boolean isNested() {
        return this.mNested;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        super.parseData(jsonParser);
        foldLinkIntoCards();
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            if (this.mHeader == null) {
                this.mHeader = new BasicSectionHeader();
            }
            ((BasicSectionHeader) this.mHeader).setTitle(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.SUB_TITLE.equals(str)) {
            if (this.mHeader == null) {
                this.mHeader = new BasicSectionHeader();
            }
            ((BasicSectionHeader) this.mHeader).setSubtitle(BaseModel.parseString(jsonParser));
        } else if ("section_header".equals(str)) {
            this.mHeader = (C13186o) BaseModel.parseObject(jsonParser, BasicSectionHeader.class);
        } else if (ResponseConstants.ACTIONABLE_HEADER.equals(str)) {
            this.mHeader = (C13186o) BaseModel.parseObject(jsonParser, CardActionableItem.class);
            this.mNested = true;
        } else if ("section_footer".equals(str)) {
            this.footer = (SectionFooter) BaseModel.parseObject(jsonParser, SectionFooter.class);
        } else if (ResponseConstants.LANDING_PAGE.equals(str)) {
            this.mPageLink = (PageLink) BaseModel.parseObject(jsonParser, LandingPageLink.class);
        } else if (ResponseConstants.SEARCH_PAGE.equals(str)) {
            this.mPageLink = (PageLink) BaseModel.parseObject(jsonParser, SearchPageLink.class);
        } else if (ResponseConstants.DEEP_LINK.equals(str)) {
            this.mPageLink = (PageLink) BaseModel.parseObject(jsonParser, PageDeepLink.class);
        } else if (ResponseConstants.HORIZONTAL.equals(str)) {
            this.mIsHorizontal = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.ANALYTICS_NAME.equals(str)) {
            this.mAnalyticsName = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.ITEM_TYPE.equals(str)) {
            this.mItemType = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.NESTED.equals(str)) {
            this.mNested = jsonParser.getBooleanValue();
        } else if (ResponseConstants.BACKGROUND_COLOR.equals(str)) {
            this.backgroundColor = C15562d.m25182T(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.BACKGROUND_IMAGE_COLOR_PAIR.equals(str)) {
            ColorPairModel colorPairModel = (ColorPairModel) BaseModel.parseObject(jsonParser, ColorPairModel.class);
            if (colorPairModel != null) {
                this.backgroundImageColorLight = colorPairModel.backgroundColorDefault;
                this.backgroundImageColorDark = colorPairModel.backgroundColorDark;
            }
        } else if (ResponseConstants.BACKGROUND_IMAGE.equals(str)) {
            this.backgroundImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
        } else if (ResponseConstants.STYLES.equals(str)) {
            this.styles = BaseModel.parseStringArray(jsonParser);
        } else if (ResponseConstants.CARD_SIZE.equals(str)) {
            setListingCardSize(BaseModel.parseString(jsonParser));
            this.mCardSize = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.ANALYTICS_PROPERTIES.equals(str)) {
            this.analyticsProperties = ((AnalyticsProperties) BaseModel.parseObject(jsonParser, AnalyticsProperties.class)).getAnalyticsProperties();
        } else if (ResponseConstants.CLIENT_EVENTS.equals(str)) {
            this.listSectionEvents = BaseModel.parseArray(jsonParser, SdlEvent.class);
        } else {
            Map<String, Class<? extends C13186o>> map = C13187p.f29017a;
            C19383o.m32797g(str, "itemType");
            Map<String, Class<? extends C13186o>> map2 = C13187p.f29017a;
            if (!map2.containsKey(str)) {
                return false;
            }
            for (C13186o oVar : BaseModel.parseArray(jsonParser, map2.get(str))) {
                if (oVar.getViewType() != R.id.view_type_undefined) {
                    if (oVar instanceof C8698l) {
                        C19388s.m32822G0((C8698l) oVar, this.mItems.size());
                    }
                    if (oVar instanceof ListingCard) {
                        ListingCard listingCard = (ListingCard) oVar;
                        listingCard.setListingCardSize(this.mListingCardSize);
                        if (this.mItemType.equals(ListingCard.DISCOVER_LISTING_ITEM_TYPE)) {
                            listingCard.setViewType(R.id.view_type_discover_listing_card);
                        }
                    }
                    if (oVar instanceof ShopCard) {
                        ((ShopCard) oVar).setListingCardSize(this.mListingCardSize);
                    }
                    if (oVar instanceof FormattedListingCard) {
                        ((FormattedListingCard) oVar).setListingCardSize(this.mListingCardSize);
                    }
                    if (this.mItemType.equals(SearchSuggestion.WITH_IMAGE_ITEM_TYPE)) {
                        ((SearchSuggestion) oVar).setViewType(R.id.view_type_search_suggestion_with_image);
                    }
                    if (this.mItemType.equals("savedForLaterCard")) {
                        ((SavedCart) oVar).setViewType(R.id.view_type_multishop_saved_for_later_card);
                    }
                    this.mItems.add(oVar);
                }
            }
        }
        return true;
    }

    public void setHeader(IVespaListSectionHeader iVespaListSectionHeader) {
        this.mHeader = iVespaListSectionHeader;
    }

    public void setHorizontal(boolean z) {
        this.mIsHorizontal = z;
    }

    public void setItemType(String str) {
        this.mItemType = str;
    }

    public void setItems(List<? extends C13186o> list) {
        this.mItems.clear();
        this.mItems.addAll(list);
    }

    public void setLayoutState(Parcelable parcelable) {
        this.mLayoutState = parcelable;
    }

    public void setNested(boolean z) {
        this.mNested = z;
    }

    public void setPageLink(PageLink pageLink) {
        this.mPageLink = pageLink;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        this.analyticsProperties = map;
    }
}
