package com.etsy.android.lib.models.apiv3.sdl;

import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.DynamicAnalyticsProperty;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ListingCardFormatPresenter;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.SearchSuggestion;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p003a2.C0023f;
import p415of.C13183l;
import p415of.C13186o;

@C17403o(generateAdapter = true)
public final class ListSection implements C13183l, ITrackedObject {
    public static final int $stable = 8;
    private final String analyticsNameField;
    private final Map<String, String> analyticsProperties;
    private final ColorPair backgroundImageColor;
    private final String cardSize;
    private final List<DelegateSdlEvent> clientEvents;
    private final List<FormattedListingCard> formattedListingCards;
    private final List<FormattedTaxonomyCategory> formattedTaxonomyCategories;
    private final Boolean horizontal;
    private final List<HtmlText> htmlTexts;
    private final String itemType;
    private final LandingPageLink landingPageLinkField;
    private transient Parcelable layoutStateField;
    private final List<CollectionV3> listingCollection;
    private final List<SearchTermWithImage> searchTerms;
    private final BasicSectionHeader sectionHeader;

    public ListSection() {
        this((BasicSectionHeader) null, (LandingPageLink) null, (Boolean) null, (String) null, (ColorPair) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (Map) null, (String) null, (List) null, 16383, (DefaultConstructorMarker) null);
    }

    public ListSection(@C17402n(name = "section_header") BasicSectionHeader basicSectionHeader, @C17402n(name = "landing_page") LandingPageLink landingPageLink, @C17402n(name = "horizontal") Boolean bool, @C17402n(name = "analytics_name") String str, @C17402n(name = "background_image_color_pair") ColorPair colorPair, @C17402n(name = "formattedListingCard") List<FormattedListingCard> list, @C17402n(name = "listingCollection") List<CollectionV3> list2, @C17402n(name = "searchTermAndImage") List<SearchTermWithImage> list3, @C17402n(name = "formattedTaxonomyCategory") List<FormattedTaxonomyCategory> list4, @C17402n(name = "htmlText") List<HtmlText> list5, @C17402n(name = "card_size") String str2, @C17402n(name = "analytics_properties") Map<String, String> map, @C17402n(name = "item_type") String str3, @C17402n(name = "client_events") List<DelegateSdlEvent> list6) {
        BasicSectionHeader basicSectionHeader2;
        Set<String> keySet;
        List<FormattedListingCard> list7 = list;
        String str4 = str2;
        String str5 = str3;
        C19383o.m32797g(str5, "itemType");
        this.sectionHeader = basicSectionHeader;
        this.landingPageLinkField = landingPageLink;
        this.horizontal = bool;
        this.analyticsNameField = str;
        this.backgroundImageColor = colorPair;
        this.formattedListingCards = list7;
        this.listingCollection = list2;
        this.searchTerms = list3;
        this.formattedTaxonomyCategories = list4;
        this.htmlTexts = list5;
        this.cardSize = str4;
        this.analyticsProperties = map;
        this.itemType = str5;
        this.clientEvents = list6;
        if (str4 != null) {
            ListingCardSize listingCardSize = new ListingCardSize(0, 0.0f, (Integer) null, 7, (DefaultConstructorMarker) null);
            new ListingCardFormatPresenter(listingCardSize).updateListingCardFormat(str4);
            if (list7 != null) {
                for (FormattedListingCard listingCardSize2 : list) {
                    listingCardSize2.setListingCardSize(listingCardSize);
                }
            }
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map2 = this.analyticsProperties;
        if (!(map2 == null || (keySet = map2.keySet()) == null)) {
            for (String str6 : keySet) {
                hashMap.put(new DynamicAnalyticsProperty(str6), this.analyticsProperties.get(str6));
            }
        }
        BasicSectionHeader basicSectionHeader3 = this.sectionHeader;
        if (basicSectionHeader3 != null) {
            LandingPageLink landingPageLink2 = this.landingPageLinkField;
            if (landingPageLink2 != null) {
                basicSectionHeader3.setPageLinkField(landingPageLink2);
            }
            C19388s.m32898z0(basicSectionHeader3, C19388s.m32882r0(this));
        }
        LandingPageLink landingPageLink3 = this.landingPageLinkField;
        if (!(landingPageLink3 == null || (basicSectionHeader2 = this.sectionHeader) == null)) {
            landingPageLink3.setPageTitleField(basicSectionHeader2.getTitleField());
        }
        if (this.clientEvents != null && !isHorizontal() && (!getItems().isEmpty())) {
            Object T0 = C19327t.m32638T0(getItems());
            C19383o.m32795e(T0, "null cannot be cast to non-null type com.etsy.android.lib.logger.Trackable");
            C8698l lVar = (C8698l) T0;
            C19388s.m32820F0(lVar, C19382n.m32718K0(this.clientEvents));
            C19388s.m32896y0(lVar, C19388s.m32863g0(this));
            C19388s.m32818E0(lVar, C19388s.m32882r0(this));
        }
    }

    public static /* synthetic */ ListSection copy$default(ListSection listSection, BasicSectionHeader basicSectionHeader, LandingPageLink landingPageLink, Boolean bool, String str, ColorPair colorPair, List list, List list2, List list3, List list4, List list5, String str2, Map map, String str3, List list6, int i, Object obj) {
        ListSection listSection2 = listSection;
        int i2 = i;
        return listSection.copy((i2 & 1) != 0 ? listSection2.sectionHeader : basicSectionHeader, (i2 & 2) != 0 ? listSection2.landingPageLinkField : landingPageLink, (i2 & 4) != 0 ? listSection2.horizontal : bool, (i2 & 8) != 0 ? listSection2.analyticsNameField : str, (i2 & 16) != 0 ? listSection2.backgroundImageColor : colorPair, (i2 & 32) != 0 ? listSection2.formattedListingCards : list, (i2 & 64) != 0 ? listSection2.listingCollection : list2, (i2 & 128) != 0 ? listSection2.searchTerms : list3, (i2 & 256) != 0 ? listSection2.formattedTaxonomyCategories : list4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listSection2.htmlTexts : list5, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listSection2.cardSize : str2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listSection2.analyticsProperties : map, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listSection2.itemType : str3, (i2 & 8192) != 0 ? listSection2.clientEvents : list6);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getOnSeenTrackingEvents$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingName$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final BasicSectionHeader component1() {
        return this.sectionHeader;
    }

    public final List<HtmlText> component10() {
        return this.htmlTexts;
    }

    public final String component11() {
        return this.cardSize;
    }

    public final Map<String, String> component12() {
        return this.analyticsProperties;
    }

    public final String component13() {
        return this.itemType;
    }

    public final List<DelegateSdlEvent> component14() {
        return this.clientEvents;
    }

    public final LandingPageLink component2() {
        return this.landingPageLinkField;
    }

    public final Boolean component3() {
        return this.horizontal;
    }

    public final String component4() {
        return this.analyticsNameField;
    }

    public final ColorPair component5() {
        return this.backgroundImageColor;
    }

    public final List<FormattedListingCard> component6() {
        return this.formattedListingCards;
    }

    public final List<CollectionV3> component7() {
        return this.listingCollection;
    }

    public final List<SearchTermWithImage> component8() {
        return this.searchTerms;
    }

    public final List<FormattedTaxonomyCategory> component9() {
        return this.formattedTaxonomyCategories;
    }

    public final ListSection copy(@C17402n(name = "section_header") BasicSectionHeader basicSectionHeader, @C17402n(name = "landing_page") LandingPageLink landingPageLink, @C17402n(name = "horizontal") Boolean bool, @C17402n(name = "analytics_name") String str, @C17402n(name = "background_image_color_pair") ColorPair colorPair, @C17402n(name = "formattedListingCard") List<FormattedListingCard> list, @C17402n(name = "listingCollection") List<CollectionV3> list2, @C17402n(name = "searchTermAndImage") List<SearchTermWithImage> list3, @C17402n(name = "formattedTaxonomyCategory") List<FormattedTaxonomyCategory> list4, @C17402n(name = "htmlText") List<HtmlText> list5, @C17402n(name = "card_size") String str2, @C17402n(name = "analytics_properties") Map<String, String> map, @C17402n(name = "item_type") String str3, @C17402n(name = "client_events") List<DelegateSdlEvent> list6) {
        String str4 = str3;
        C19383o.m32797g(str4, "itemType");
        return new ListSection(basicSectionHeader, landingPageLink, bool, str, colorPair, list, list2, list3, list4, list5, str2, map, str4, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListSection)) {
            return false;
        }
        ListSection listSection = (ListSection) obj;
        return C19383o.m32792b(this.sectionHeader, listSection.sectionHeader) && C19383o.m32792b(this.landingPageLinkField, listSection.landingPageLinkField) && C19383o.m32792b(this.horizontal, listSection.horizontal) && C19383o.m32792b(this.analyticsNameField, listSection.analyticsNameField) && C19383o.m32792b(this.backgroundImageColor, listSection.backgroundImageColor) && C19383o.m32792b(this.formattedListingCards, listSection.formattedListingCards) && C19383o.m32792b(this.listingCollection, listSection.listingCollection) && C19383o.m32792b(this.searchTerms, listSection.searchTerms) && C19383o.m32792b(this.formattedTaxonomyCategories, listSection.formattedTaxonomyCategories) && C19383o.m32792b(this.htmlTexts, listSection.htmlTexts) && C19383o.m32792b(this.cardSize, listSection.cardSize) && C19383o.m32792b(this.analyticsProperties, listSection.analyticsProperties) && C19383o.m32792b(this.itemType, listSection.itemType) && C19383o.m32792b(this.clientEvents, listSection.clientEvents);
    }

    public String getAnalyticsName() {
        String str = this.analyticsNameField;
        return str == null ? "" : str;
    }

    public final String getAnalyticsNameField() {
        return this.analyticsNameField;
    }

    public final Map<String, String> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public int getBackgroundColor() {
        return 0;
    }

    public Image getBackgroundImage() {
        return null;
    }

    public final ColorPair getBackgroundImageColor() {
        return this.backgroundImageColor;
    }

    public String getBackgroundImageColorDark() {
        return null;
    }

    public String getBackgroundImageColorLight() {
        return null;
    }

    public final String getCardSize() {
        return this.cardSize;
    }

    public final List<DelegateSdlEvent> getClientEvents() {
        return this.clientEvents;
    }

    public C13186o getFooter() {
        return null;
    }

    public final List<FormattedListingCard> getFormattedListingCards() {
        return this.formattedListingCards;
    }

    public final List<FormattedTaxonomyCategory> getFormattedTaxonomyCategories() {
        return this.formattedTaxonomyCategories;
    }

    public boolean getHasMatchingItemViewHeights() {
        return false;
    }

    public C13186o getHeaderWithViewAll() {
        return this.sectionHeader;
    }

    public final Boolean getHorizontal() {
        return this.horizontal;
    }

    public final List<HtmlText> getHtmlTexts() {
        return this.htmlTexts;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public List<C13186o> getItems() {
        Collection collection = this.formattedListingCards;
        if (collection == null && (collection = this.searchTerms) == null && (collection = this.htmlTexts) == null && (collection = this.formattedTaxonomyCategories) == null) {
            collection = EmptyList.INSTANCE;
        }
        ArrayList q1 = C19327t.m32661q1(collection);
        List<CollectionV3> list = this.listingCollection;
        if (list != null) {
            q1.addAll(list);
        }
        return q1;
    }

    public final LandingPageLink getLandingPageLinkField() {
        return this.landingPageLinkField;
    }

    public Parcelable getLayoutState() {
        return this.layoutStateField;
    }

    public final Parcelable getLayoutStateField() {
        return this.layoutStateField;
    }

    public final List<CollectionV3> getListingCollection() {
        return this.listingCollection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = r2.clientEvents;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.etsy.android.lib.logger.C8696j> getOnSeenTrackingEvents() {
        /*
            r2 = this;
            boolean r0 = r2.isHorizontal()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = r2.itemType
            java.lang.String r1 = "formattedTopicFirstFeatured"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            if (r0 == 0) goto L_0x0019
        L_0x0010:
            java.util.List<com.etsy.android.lib.models.apiv3.sdl.DelegateSdlEvent> r0 = r2.clientEvents
            if (r0 == 0) goto L_0x0019
            java.util.ArrayList r0 = kotlin.jvm.internal.C19382n.m32718K0(r0)
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.ListSection.getOnSeenTrackingEvents():java.util.List");
    }

    public C13186o getPageLink() {
        return this.landingPageLinkField;
    }

    public final List<SearchTermWithImage> getSearchTerms() {
        return this.searchTerms;
    }

    public final BasicSectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    public String getTrackingName() {
        return (isHorizontal() || C19383o.m32792b(this.itemType, FormattedTopicFirstFeatured.ITEM_TYPE)) ? getAnalyticsName() : "";
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        Map<String, String> map = this.analyticsProperties;
        if (map == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C19421p.m32930T(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(new DynamicAnalyticsProperty((String) entry.getKey()), entry.getValue());
        }
        return new HashMap(linkedHashMap);
    }

    public int getViewType() {
        return C19383o.m32792b(this.itemType, "formattedTaxonomyCategory") ? C19543e0.m33306Y(this.formattedTaxonomyCategories) ? this.formattedTaxonomyCategories.get(0).getFormats().get(0) == FormattedTaxonomyCategory.Format.IMAGE_LEFT_PILL ? R.id.view_type_list_section_formatted_taxonomy_category_pills : this.formattedTaxonomyCategories.get(0).getFormats().get(0) == FormattedTaxonomyCategory.Format.SMALL_CIRCLE_IMAGE_SEPARATE_TEXT ? R.id.view_type_formatted_taxonomy_featured_categories : R.id.view_type_horizontal_list_section : R.id.view_type_horizontal_list_section : C19383o.m32792b(this.itemType, SearchSuggestion.WITH_IMAGE_ITEM_TYPE) ? R.id.view_type_list_section_search_suggestion_with_image : C19383o.m32792b(this.itemType, FormattedListingCard.ITEM_TYPE) ? R.id.view_type_horizontal_formatted_listing : R.id.view_type_horizontal_list_section;
    }

    public int hashCode() {
        BasicSectionHeader basicSectionHeader = this.sectionHeader;
        int i = 0;
        int hashCode = (basicSectionHeader == null ? 0 : basicSectionHeader.hashCode()) * 31;
        LandingPageLink landingPageLink = this.landingPageLinkField;
        int hashCode2 = (hashCode + (landingPageLink == null ? 0 : landingPageLink.hashCode())) * 31;
        Boolean bool = this.horizontal;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.analyticsNameField;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ColorPair colorPair = this.backgroundImageColor;
        int hashCode5 = (hashCode4 + (colorPair == null ? 0 : colorPair.hashCode())) * 31;
        List<FormattedListingCard> list = this.formattedListingCards;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<CollectionV3> list2 = this.listingCollection;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SearchTermWithImage> list3 = this.searchTerms;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FormattedTaxonomyCategory> list4 = this.formattedTaxonomyCategories;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<HtmlText> list5 = this.htmlTexts;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str2 = this.cardSize;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.analyticsProperties;
        int e = C0023f.m105e(this.itemType, (hashCode11 + (map == null ? 0 : map.hashCode())) * 31, 31);
        List<DelegateSdlEvent> list6 = this.clientEvents;
        if (list6 != null) {
            i = list6.hashCode();
        }
        return e + i;
    }

    public boolean isHorizontal() {
        Boolean bool = this.horizontal;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean isNested() {
        return false;
    }

    public void setLayoutState(Parcelable parcelable) {
        C19383o.m32797g(parcelable, "layoutState");
        this.layoutStateField = parcelable;
    }

    public final void setLayoutStateField(Parcelable parcelable) {
        this.layoutStateField = parcelable;
    }

    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "value");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListSection(sectionHeader=");
        h.append(this.sectionHeader);
        h.append(", landingPageLinkField=");
        h.append(this.landingPageLinkField);
        h.append(", horizontal=");
        h.append(this.horizontal);
        h.append(", analyticsNameField=");
        h.append(this.analyticsNameField);
        h.append(", backgroundImageColor=");
        h.append(this.backgroundImageColor);
        h.append(", formattedListingCards=");
        h.append(this.formattedListingCards);
        h.append(", listingCollection=");
        h.append(this.listingCollection);
        h.append(", searchTerms=");
        h.append(this.searchTerms);
        h.append(", formattedTaxonomyCategories=");
        h.append(this.formattedTaxonomyCategories);
        h.append(", htmlTexts=");
        h.append(this.htmlTexts);
        h.append(", cardSize=");
        h.append(this.cardSize);
        h.append(", analyticsProperties=");
        h.append(this.analyticsProperties);
        h.append(", itemType=");
        h.append(this.itemType);
        h.append(", clientEvents=");
        return C0070b.m186i(h, this.clientEvents, ')');
    }

    public BasicSectionHeader getHeader() {
        return this.sectionHeader;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ListSection(com.etsy.android.lib.models.apiv3.sdl.BasicSectionHeader r15, com.etsy.android.lib.models.apiv3.sdl.LandingPageLink r16, java.lang.Boolean r17, java.lang.String r18, com.etsy.android.lib.models.apiv3.sdl.ColorPair r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.util.List r24, java.lang.String r25, java.util.Map r26, java.lang.String r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r14 = this;
            r0 = r29
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r25
        L_0x0059:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0062
            java.util.Map r12 = kotlin.collections.C19294b0.m32559p0()
            goto L_0x0064
        L_0x0062:
            r12 = r26
        L_0x0064:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x006b
            java.lang.String r13 = ""
            goto L_0x006d
        L_0x006b:
            r13 = r27
        L_0x006d:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0074
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x0076
        L_0x0074:
            r0 = r28
        L_0x0076:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r2
            r27 = r12
            r28 = r13
            r29 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.ListSection.<init>(com.etsy.android.lib.models.apiv3.sdl.BasicSectionHeader, com.etsy.android.lib.models.apiv3.sdl.LandingPageLink, java.lang.Boolean, java.lang.String, com.etsy.android.lib.models.apiv3.sdl.ColorPair, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.Map, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
