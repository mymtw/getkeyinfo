package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import com.etsy.android.lib.models.apiv3.SearchSuggestion;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListSectionJsonAdapter extends JsonAdapter<ListSection> {
    public static final int $stable = 8;
    private volatile Constructor<ListSection> constructorRef;
    private final JsonAdapter<BasicSectionHeader> nullableBasicSectionHeaderAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ColorPair> nullableColorPairAdapter;
    private final JsonAdapter<LandingPageLink> nullableLandingPageLinkAdapter;
    private final JsonAdapter<List<CollectionV3>> nullableListOfCollectionV3Adapter;
    private final JsonAdapter<List<DelegateSdlEvent>> nullableListOfDelegateSdlEventAdapter;
    private final JsonAdapter<List<FormattedListingCard>> nullableListOfFormattedListingCardAdapter;
    private final JsonAdapter<List<FormattedTaxonomyCategory>> nullableListOfFormattedTaxonomyCategoryAdapter;
    private final JsonAdapter<List<HtmlText>> nullableListOfHtmlTextAdapter;
    private final JsonAdapter<List<SearchTermWithImage>> nullableListOfSearchTermWithImageAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("section_header", ResponseConstants.LANDING_PAGE, ResponseConstants.HORIZONTAL, ResponseConstants.ANALYTICS_NAME, ResponseConstants.BACKGROUND_IMAGE_COLOR_PAIR, FormattedListingCard.ITEM_TYPE, "listingCollection", SearchSuggestion.WITH_IMAGE_ITEM_TYPE, "formattedTaxonomyCategory", "htmlText", ResponseConstants.CARD_SIZE, ResponseConstants.ANALYTICS_PROPERTIES, ResponseConstants.ITEM_TYPE, ResponseConstants.CLIENT_EVENTS);
    private final JsonAdapter<String> stringAdapter;

    public ListSectionJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBasicSectionHeaderAdapter = yVar2.mo68558c(BasicSectionHeader.class, emptySet, "sectionHeader");
        this.nullableLandingPageLinkAdapter = yVar2.mo68558c(LandingPageLink.class, emptySet, "landingPageLinkField");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, ResponseConstants.HORIZONTAL);
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "analyticsNameField");
        this.nullableColorPairAdapter = yVar2.mo68558c(ColorPair.class, emptySet, "backgroundImageColor");
        this.nullableListOfFormattedListingCardAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, FormattedListingCard.class), emptySet, "formattedListingCards");
        this.nullableListOfCollectionV3Adapter = yVar2.mo68558c(C17387a0.m29126d(List.class, CollectionV3.class), emptySet, "listingCollection");
        this.nullableListOfSearchTermWithImageAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, SearchTermWithImage.class), emptySet, "searchTerms");
        this.nullableListOfFormattedTaxonomyCategoryAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, FormattedTaxonomyCategory.class), emptySet, "formattedTaxonomyCategories");
        this.nullableListOfHtmlTextAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, HtmlText.class), emptySet, "htmlTexts");
        this.nullableMapOfStringStringAdapter = yVar2.mo68558c(C17387a0.m29126d(Map.class, cls, cls), emptySet, "analyticsProperties");
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "itemType");
        this.nullableListOfDelegateSdlEventAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, DelegateSdlEvent.class), emptySet, "clientEvents");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListSection)";
    }

    public ListSection fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        String str = null;
        BasicSectionHeader basicSectionHeader = null;
        LandingPageLink landingPageLink = null;
        Boolean bool = null;
        String str2 = null;
        ColorPair colorPair = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String str3 = null;
        Map map = null;
        List list6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    basicSectionHeader = this.nullableBasicSectionHeaderAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    break;
                case 1:
                    landingPageLink = this.nullableLandingPageLinkAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    break;
                case 4:
                    colorPair = this.nullableColorPairAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    break;
                case 5:
                    list = this.nullableListOfFormattedListingCardAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    break;
                case 6:
                    list2 = this.nullableListOfCollectionV3Adapter.fromJson(jsonReader2);
                    i2 &= -65;
                    break;
                case 7:
                    list3 = this.nullableListOfSearchTermWithImageAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    break;
                case 8:
                    list4 = this.nullableListOfFormattedTaxonomyCategoryAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    break;
                case 9:
                    list5 = this.nullableListOfHtmlTextAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    break;
                case 10:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    break;
                case 12:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i2 &= -4097;
                        break;
                    } else {
                        throw C18215a.m30734m("itemType", ResponseConstants.ITEM_TYPE, jsonReader2);
                    }
                case 13:
                    list6 = this.nullableListOfDelegateSdlEventAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i2 == -16384) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            return new ListSection(basicSectionHeader, landingPageLink, bool, str2, colorPair, list, list2, list3, list4, list5, str3, map, str, list6);
        }
        String str4 = str;
        Constructor<ListSection> constructor = this.constructorRef;
        if (constructor == null) {
            i = i2;
            constructor = ListSection.class.getDeclaredConstructor(new Class[]{BasicSectionHeader.class, LandingPageLink.class, Boolean.class, cls, ColorPair.class, List.class, List.class, List.class, List.class, List.class, cls, Map.class, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListSection::class.java.…his.constructorRef = it }");
        } else {
            i = i2;
        }
        ListSection newInstance = constructor.newInstance(new Object[]{basicSectionHeader, landingPageLink, bool, str2, colorPair, list, list2, list3, list4, list5, str3, map, str4, list6, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListSection listSection) {
        C19383o.m32797g(wVar, "writer");
        if (listSection != null) {
            wVar.mo68522b();
            wVar.mo68529h("section_header");
            this.nullableBasicSectionHeaderAdapter.toJson(wVar, listSection.getSectionHeader());
            wVar.mo68529h(ResponseConstants.LANDING_PAGE);
            this.nullableLandingPageLinkAdapter.toJson(wVar, listSection.getLandingPageLinkField());
            wVar.mo68529h(ResponseConstants.HORIZONTAL);
            this.nullableBooleanAdapter.toJson(wVar, listSection.getHorizontal());
            wVar.mo68529h(ResponseConstants.ANALYTICS_NAME);
            this.nullableStringAdapter.toJson(wVar, listSection.getAnalyticsNameField());
            wVar.mo68529h(ResponseConstants.BACKGROUND_IMAGE_COLOR_PAIR);
            this.nullableColorPairAdapter.toJson(wVar, listSection.getBackgroundImageColor());
            wVar.mo68529h(FormattedListingCard.ITEM_TYPE);
            this.nullableListOfFormattedListingCardAdapter.toJson(wVar, listSection.getFormattedListingCards());
            wVar.mo68529h("listingCollection");
            this.nullableListOfCollectionV3Adapter.toJson(wVar, listSection.getListingCollection());
            wVar.mo68529h(SearchSuggestion.WITH_IMAGE_ITEM_TYPE);
            this.nullableListOfSearchTermWithImageAdapter.toJson(wVar, listSection.getSearchTerms());
            wVar.mo68529h("formattedTaxonomyCategory");
            this.nullableListOfFormattedTaxonomyCategoryAdapter.toJson(wVar, listSection.getFormattedTaxonomyCategories());
            wVar.mo68529h("htmlText");
            this.nullableListOfHtmlTextAdapter.toJson(wVar, listSection.getHtmlTexts());
            wVar.mo68529h(ResponseConstants.CARD_SIZE);
            this.nullableStringAdapter.toJson(wVar, listSection.getCardSize());
            wVar.mo68529h(ResponseConstants.ANALYTICS_PROPERTIES);
            this.nullableMapOfStringStringAdapter.toJson(wVar, listSection.getAnalyticsProperties());
            wVar.mo68529h(ResponseConstants.ITEM_TYPE);
            this.stringAdapter.toJson(wVar, listSection.getItemType());
            wVar.mo68529h(ResponseConstants.CLIENT_EVENTS);
            this.nullableListOfDelegateSdlEventAdapter.toJson(wVar, listSection.getClientEvents());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
