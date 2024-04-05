package com.etsy.android.p327ui.search.p330v2;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.SortOrder;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19459m;
import p003a2.C0023f;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;

@SuppressLint({"ParcelCreator"})
/* renamed from: com.etsy.android.ui.search.v2.SearchOptions */
public final class SearchOptions implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SearchOptions> CREATOR = new Creator();
    public static final Companion Companion = new Companion();
    public static final Void DEFAULT_HIGH_PRICE = null;
    public static final BigDecimal DEFAULT_LOW_PRICE = new BigDecimal(0);
    /* access modifiers changed from: private */
    public static final Locale systemLocale;
    private boolean acceptsGiftCards;
    private String attributeValuesParam;
    private List<? extends FacetCount> categoryFacets;
    private boolean categoryProlist;
    private boolean customizable;
    private boolean freeShipping;
    private boolean giftWrap;
    private boolean isMerchLibrary;
    private MarketPlace marketplace;
    private BigDecimal maxPrice;
    private String merchCollectionId;
    private String merchOnSearchVariant;
    private String merchSectionId;
    private BigDecimal minPrice;
    private boolean onSale;
    private boolean oneDayShipping;
    private String pctDiscountMax;
    private String pctDiscountMin;
    private int priceIndex;
    private String query;
    private String shipsToCountryCode;
    private String shipsToCountryName;
    private final Location shopLocation;
    private SortOrder sortOrder;
    private String spellingCorrectionShowOriginal;
    private boolean threeDayShipping;
    private boolean userSpecifiedMax;
    private boolean userSpecifiedMin;

    /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Companion */
    public static final class Companion {
        /* renamed from: a */
        public static SearchOptions m18947a(C10865h hVar, Uri uri, C8694h hVar2) {
            C19383o.m32797g(hVar, "searchUriParser");
            C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            SearchOptions b = m18948b(hVar2, new SearchOptions$Companion$extractOptions$options$2(hVar, uri));
            if (b.hasDefaults()) {
                return null;
            }
            return b;
        }

        /* renamed from: b */
        public static SearchOptions m18948b(C8694h hVar, C19857l lVar) {
            String str;
            String str2;
            String str3;
            boolean z;
            SortOrder sortOrder;
            String str4;
            C19857l lVar2 = lVar;
            String str5 = (String) lVar2.invoke(SearchOptionsParams.LOCATION.toString());
            String str6 = (String) lVar2.invoke(SearchOptionsParams.SHIP_TO.toString());
            Object invoke = lVar2.invoke(SearchOptionsParams.MIN_PRICE.toString());
            CharSequence charSequence = (CharSequence) invoke;
            if (charSequence == null || charSequence.length() == 0) {
                invoke = lVar2.invoke(SearchOptionsParams.MIN_PRICE_LEGACY.toString());
            }
            Object invoke2 = lVar2.invoke(SearchOptionsParams.MAX_PRICE.toString());
            CharSequence charSequence2 = (CharSequence) invoke2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                invoke2 = lVar2.invoke(SearchOptionsParams.MAX_PRICE_LEGACY.toString());
            }
            String str7 = (String) lVar2.invoke(SearchOptionsParams.MARKETPLACE.toString());
            String str8 = (String) lVar2.invoke(SearchOptionsParams.FREE_SHIPPING.toString());
            String str9 = (String) lVar2.invoke(SearchOptionsParams.ACCEPTS_GIFT_CARDS.toString());
            String str10 = (String) lVar2.invoke(SearchOptionsParams.MAX_PROCESSING_DAYS.toString());
            String str11 = (String) lVar2.invoke(SearchOptionsParams.IS_DISCOUNTED.toString());
            String str12 = (String) lVar2.invoke(SearchOptionsParams.CUSTOMIZABLE.toString());
            String str13 = (String) lVar2.invoke(SearchOptionsParams.GIFT_WRAP.toString());
            String str14 = (String) lVar2.invoke(SearchOptionsParams.SPELLING_CORRECTION_SHOW_ORIGINAL.toString());
            String str15 = (String) lVar2.invoke(SearchOptionsParams.CATEGORY_PROLIST.toString());
            String str16 = (String) lVar2.invoke(SearchOptionsParams.PCT_DISCOUNT_MAX.toString());
            String str17 = (String) lVar2.invoke(SearchOptionsParams.PCT_DISCOUNT_MIN.toString());
            String str18 = (String) lVar2.invoke(SearchOptionsParams.QUERY.toString());
            String str19 = (String) lVar2.invoke(SearchOptionsParams.CATEGORY.toString());
            String str20 = (String) lVar2.invoke(SearchOptionsParams.SORT_ON.toString());
            String str21 = (String) lVar2.invoke(SearchOptionsParams.SORT_ORDER.toString());
            String str22 = (String) lVar2.invoke("attribute_values");
            String str23 = (String) lVar2.invoke(SearchOptionsParams.IS_MERCH_LIBRARY.toString());
            String str24 = (String) lVar2.invoke(SearchOptionsParams.MERCH_ON_SEARCH_VARIANT.toString());
            String str25 = (String) lVar2.invoke(SearchOptionsParams.MERCH_COLLECTION_ID.toString());
            String str26 = (String) lVar2.invoke(SearchOptionsParams.MERCH_SECTION_ID.toString());
            SearchOptions searchOptions = new SearchOptions((List) null, false, false, false, false, false, false, false, (Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
            if (C18263b.m30839d0(str5)) {
                str = str26;
                str3 = str16;
                str2 = str15;
                searchOptions.getShopLocation().set(Location.LocationType.CUSTOM, C18263b.m30813H(hVar, str5));
            } else {
                str = str26;
                str3 = str16;
                str2 = str15;
            }
            if (C18263b.m30839d0(str6)) {
                Locale locale = Locale.ROOT;
                C19383o.m32796f(locale, "ROOT");
                String upperCase = str6.toUpperCase(locale);
                C19383o.m32796f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                SearchOptions.Companion.getClass();
                String displayCountry = new Locale(SearchOptions.systemLocale.getLanguage(), str6).getDisplayCountry();
                C19383o.m32796f(displayCountry, "Locale(systemLocale.lang…e, shipTo).displayCountry");
                searchOptions.setShipsTo(upperCase, displayCountry);
            }
            if (C18263b.m30839d0((CharSequence) invoke)) {
                searchOptions.setMinPrice(new BigDecimal((String) invoke));
            }
            if (C18263b.m30839d0((CharSequence) invoke2)) {
                searchOptions.setMaxPrice(new BigDecimal((String) invoke2));
            }
            if (C18263b.m30839d0(str7)) {
                searchOptions.setMarketplace(str7);
            }
            if (C18263b.m30839d0(str8)) {
                searchOptions.setFreeShipping(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str8) || Boolean.parseBoolean(str8));
            }
            if (C18263b.m30839d0(str9)) {
                searchOptions.setAcceptsGiftCards(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str9) || Boolean.parseBoolean(str9));
            }
            if (C18263b.m30839d0(str10)) {
                searchOptions.setOneDayShipping(C19459m.m33036e1(str10, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false));
                searchOptions.setThreeDayShipping(C19459m.m33036e1(str10, "3", false));
            }
            if (C18263b.m30839d0(str11)) {
                searchOptions.setOnSale(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str11) || Boolean.parseBoolean(str11));
            }
            if (C18263b.m30839d0(str12)) {
                searchOptions.setCustomizable(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str12) || Boolean.parseBoolean(str12));
            }
            if (C18263b.m30839d0(str13)) {
                searchOptions.setGiftWrap(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str13) || Boolean.parseBoolean(str13));
            }
            if (C18263b.m30839d0(str14)) {
                searchOptions.setSpellingCorrectionShowOriginal(str14);
            }
            if (C18263b.m30839d0(str2)) {
                String str27 = str2;
                searchOptions.setCategoryProlist(C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str27) || Boolean.parseBoolean(str27));
            }
            if (C18263b.m30839d0(str3)) {
                searchOptions.setPctDiscountMax(str3);
                z = false;
                searchOptions.setOnSale(false);
            } else {
                z = false;
            }
            if (C18263b.m30839d0(str17)) {
                searchOptions.setPctDiscountMin(str17);
                searchOptions.setOnSale(z);
            }
            if (C18263b.m30839d0(str18)) {
                searchOptions.setQuery(str18);
            }
            if (C18263b.m30839d0(str19)) {
                searchOptions.setCategoryFacets(C17782b.m29864d0(new FacetCount(str19)));
            }
            if (!(str20 == null || str21 == null)) {
                String str28 = str20;
                if (C19383o.m32792b(str28, ResponseConstants.PRICE)) {
                    str4 = str21;
                    if (searchOptions.isDescending(str4)) {
                        sortOrder = SortOrder.HIGHEST_PRICE;
                        searchOptions.setSortOrder(sortOrder);
                    }
                } else {
                    str4 = str21;
                }
                if (C19383o.m32792b(str28, ResponseConstants.PRICE) && searchOptions.isAscending(str4)) {
                    sortOrder = SortOrder.LOWEST_PRICE;
                    searchOptions.setSortOrder(sortOrder);
                } else if (!C19383o.m32792b(str28, "score") || !searchOptions.isDescending(str4)) {
                    if (!C19383o.m32792b(str28, "created") || !searchOptions.isDescending(str4)) {
                        SortOrder.Companion.getClass();
                        sortOrder = SortOrder.DEFAULT;
                    } else {
                        sortOrder = SortOrder.MOST_RECENT;
                    }
                    searchOptions.setSortOrder(sortOrder);
                } else {
                    sortOrder = SortOrder.RELEVANCY;
                    searchOptions.setSortOrder(sortOrder);
                }
            }
            if (C18263b.m30839d0(str22)) {
                searchOptions.setAttributeValuesParam(str22);
            }
            if (C18263b.m30839d0(str23)) {
                String str29 = str23;
                searchOptions.setMerchLibrary((C19383o.m32792b(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, str29) || Boolean.parseBoolean(str29)) ? true : z);
            }
            if (C18263b.m30839d0(str24)) {
                searchOptions.setMerchOnSearchVariant(str24);
            }
            if (C18263b.m30839d0(str25)) {
                searchOptions.setMerchCollectionId(str25);
            }
            if (C18263b.m30839d0(str)) {
                searchOptions.setMerchSectionId(str);
            }
            return searchOptions;
        }

        /* renamed from: c */
        public static SearchOptions m18949c(Map map, C8694h hVar) {
            C19383o.m32797g(map, "filterMap");
            return m18948b(hVar, new SearchOptions$Companion$fromMap$1(map));
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Creator */
    public static final class Creator implements Parcelable.Creator<SearchOptions> {
        public final SearchOptions createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C19383o.m32797g(parcel2, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new SearchOptions(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, Location.CREATOR.createFromParcel(parcel2), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), SortOrder.valueOf(parcel.readString()), MarketPlace.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final SearchOptions[] newArray(int i) {
            return new SearchOptions[i];
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Location */
    public static final class Location implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Location> CREATOR = new Creator();
        private String location;
        private LocationType type;

        /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Location$Creator */
        public static final class Creator implements Parcelable.Creator<Location> {
            public final Location createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return new Location(parcel.readString(), LocationType.valueOf(parcel.readString()));
            }

            public final Location[] newArray(int i) {
                return new Location[i];
            }
        }

        /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$Location$LocationType */
        public enum LocationType {
            ANYWHERE,
            LOCAL,
            CUSTOM
        }

        public Location() {
            this((String) null, (LocationType) null, 3, (DefaultConstructorMarker) null);
        }

        public Location(String str, LocationType locationType) {
            C19383o.m32797g(str, "location");
            C19383o.m32797g(locationType, "type");
            this.location = str;
            this.type = locationType;
        }

        public static /* synthetic */ Location copy$default(Location location2, String str, LocationType locationType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = location2.location;
            }
            if ((i & 2) != 0) {
                locationType = location2.type;
            }
            return location2.copy(str, locationType);
        }

        public final void apply(Map<String, String> map) {
            C19383o.m32797g(map, "map");
            if (!isAnywhere()) {
                map.put("location", this.location);
            }
        }

        public final String component1() {
            return this.location;
        }

        public final LocationType component2() {
            return this.type;
        }

        public final Location copy(String str, LocationType locationType) {
            C19383o.m32797g(str, "location");
            C19383o.m32797g(locationType, "type");
            return new Location(str, locationType);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location2 = (Location) obj;
            return C19383o.m32792b(this.location, location2.location) && this.type == location2.type;
        }

        public final String getLocation() {
            return this.location;
        }

        public final LocationType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.location.hashCode() * 31);
        }

        public final boolean isAnywhere() {
            return this.type == LocationType.ANYWHERE;
        }

        public final void resetToDefault() {
            this.type = LocationType.ANYWHERE;
            this.location = "";
        }

        public final void set(LocationType locationType, String str) {
            C19383o.m32797g(locationType, "type");
            C19383o.m32797g(str, "location");
            if (locationType == LocationType.ANYWHERE) {
                resetToDefault();
                return;
            }
            this.type = locationType;
            this.location = str;
        }

        public final void setLocation(String str) {
            C19383o.m32797g(str, "<set-?>");
            this.location = str;
        }

        public final void setType(LocationType locationType) {
            C19383o.m32797g(locationType, "<set-?>");
            this.type = locationType;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Location(location=");
            h.append(this.location);
            h.append(", type=");
            h.append(this.type);
            h.append(')');
            return h.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeString(this.location);
            parcel.writeString(this.type.name());
        }

        public final String getLocation(Resources resources) {
            C19383o.m32797g(resources, "resources");
            if (this.type != LocationType.ANYWHERE) {
                return this.location;
            }
            String string = resources.getString(R.string.new_search_filter_shop_location_anywhere);
            C19383o.m32796f(string, "resources.getString(R.st…r_shop_location_anywhere)");
            return string;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Location(String str, LocationType locationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LocationType.ANYWHERE : locationType);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$MarketPlace */
    public enum MarketPlace {
        MARKETPLACE_ALL_ITEMS,
        MARKETPLACE_HANDMADE,
        MARKETPLACE_VINTAGE;

        /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$MarketPlace$a */
        public /* synthetic */ class C10967a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24317a = null;

            static {
                int[] iArr = new int[MarketPlace.values().length];
                iArr[MarketPlace.MARKETPLACE_HANDMADE.ordinal()] = 1;
                iArr[MarketPlace.MARKETPLACE_VINTAGE.ordinal()] = 2;
                f24317a = iArr;
            }
        }

        public final String getHttpParamValue() {
            int i = C10967a.f24317a[ordinal()];
            return i != 1 ? i != 2 ? "" : "vintage" : ResponseConstants.HANDMADE;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.SearchOptions$a */
    public /* synthetic */ class C10968a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24318a;

        static {
            int[] iArr = new int[SortOrder.values().length];
            iArr[SortOrder.RELEVANCY.ordinal()] = 1;
            iArr[SortOrder.MOST_RECENT.ordinal()] = 2;
            iArr[SortOrder.HIGHEST_PRICE.ordinal()] = 3;
            iArr[SortOrder.LOWEST_PRICE.ordinal()] = 4;
            f24318a = iArr;
        }
    }

    static {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        C19383o.m32796f(locale, "getSystem().configuration.locales.get(0)");
        systemLocale = locale;
    }

    public SearchOptions() {
        this((List) null, false, false, false, false, false, false, false, (Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
    }

    public SearchOptions(List<? extends FacetCount> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Location location, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z8, boolean z9, String str, String str2, SortOrder sortOrder2, MarketPlace marketPlace, String str3, boolean z10, String str4, String str5, String str6, String str7, int i, boolean z11, String str8, String str9, String str10) {
        List<? extends FacetCount> list2 = list;
        Location location2 = location;
        BigDecimal bigDecimal3 = bigDecimal;
        String str11 = str;
        String str12 = str2;
        SortOrder sortOrder3 = sortOrder2;
        MarketPlace marketPlace2 = marketPlace;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        C19383o.m32797g(list2, "categoryFacets");
        C19383o.m32797g(location2, "shopLocation");
        C19383o.m32797g(bigDecimal3, "minPrice");
        C19383o.m32797g(str11, "shipsToCountryCode");
        C19383o.m32797g(str12, "shipsToCountryName");
        C19383o.m32797g(sortOrder3, "sortOrder");
        C19383o.m32797g(marketPlace2, "marketplace");
        C19383o.m32797g(str13, "spellingCorrectionShowOriginal");
        C19383o.m32797g(str14, "pctDiscountMax");
        C19383o.m32797g(str15, "pctDiscountMin");
        C19383o.m32797g(str16, "query");
        C19383o.m32797g(str17, "attributeValuesParam");
        C19383o.m32797g(str18, "merchOnSearchVariant");
        C19383o.m32797g(str19, "merchCollectionId");
        C19383o.m32797g(str20, "merchSectionId");
        this.categoryFacets = list2;
        this.onSale = z;
        this.freeShipping = z2;
        this.oneDayShipping = z3;
        this.threeDayShipping = z4;
        this.acceptsGiftCards = z5;
        this.customizable = z6;
        this.giftWrap = z7;
        this.shopLocation = location2;
        this.minPrice = bigDecimal3;
        this.maxPrice = bigDecimal2;
        this.userSpecifiedMax = z8;
        this.userSpecifiedMin = z9;
        this.shipsToCountryCode = str11;
        this.shipsToCountryName = str12;
        this.sortOrder = sortOrder3;
        this.marketplace = marketPlace2;
        this.spellingCorrectionShowOriginal = str13;
        this.categoryProlist = z10;
        this.pctDiscountMax = str14;
        this.pctDiscountMin = str15;
        this.query = str16;
        this.attributeValuesParam = str17;
        this.priceIndex = i;
        this.isMerchLibrary = z11;
        this.merchOnSearchVariant = str18;
        this.merchCollectionId = str19;
        this.merchSectionId = str20;
    }

    public static /* synthetic */ SearchOptions copy$default(SearchOptions searchOptions, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Location location, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z8, boolean z9, String str, String str2, SortOrder sortOrder2, MarketPlace marketPlace, String str3, boolean z10, String str4, String str5, String str6, String str7, int i, boolean z11, String str8, String str9, String str10, int i2, Object obj) {
        SearchOptions searchOptions2 = searchOptions;
        int i3 = i2;
        return searchOptions.copy((i3 & 1) != 0 ? searchOptions2.categoryFacets : list, (i3 & 2) != 0 ? searchOptions2.onSale : z, (i3 & 4) != 0 ? searchOptions2.freeShipping : z2, (i3 & 8) != 0 ? searchOptions2.oneDayShipping : z3, (i3 & 16) != 0 ? searchOptions2.threeDayShipping : z4, (i3 & 32) != 0 ? searchOptions2.acceptsGiftCards : z5, (i3 & 64) != 0 ? searchOptions2.customizable : z6, (i3 & 128) != 0 ? searchOptions2.giftWrap : z7, (i3 & 256) != 0 ? searchOptions2.shopLocation : location, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? searchOptions2.minPrice : bigDecimal, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? searchOptions2.maxPrice : bigDecimal2, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? searchOptions2.userSpecifiedMax : z8, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? searchOptions2.userSpecifiedMin : z9, (i3 & 8192) != 0 ? searchOptions2.shipsToCountryCode : str, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? searchOptions2.shipsToCountryName : str2, (i3 & 32768) != 0 ? searchOptions2.sortOrder : sortOrder2, (i3 & 65536) != 0 ? searchOptions2.marketplace : marketPlace, (i3 & 131072) != 0 ? searchOptions2.spellingCorrectionShowOriginal : str3, (i3 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? searchOptions2.categoryProlist : z10, (i3 & 524288) != 0 ? searchOptions2.pctDiscountMax : str4, (i3 & 1048576) != 0 ? searchOptions2.pctDiscountMin : str5, (i3 & 2097152) != 0 ? searchOptions2.query : str6, (i3 & 4194304) != 0 ? searchOptions2.attributeValuesParam : str7, (i3 & 8388608) != 0 ? searchOptions2.priceIndex : i, (i3 & 16777216) != 0 ? searchOptions2.isMerchLibrary : z11, (i3 & 33554432) != 0 ? searchOptions2.merchOnSearchVariant : str8, (i3 & 67108864) != 0 ? searchOptions2.merchCollectionId : str9, (i3 & 134217728) != 0 ? searchOptions2.merchSectionId : str10);
    }

    public static /* synthetic */ void getSelectedCategoryFacet$annotations() {
    }

    private final boolean hasMerchOnSearch() {
        if (this.merchOnSearchVariant.length() > 0) {
            return true;
        }
        if (this.merchCollectionId.length() > 0) {
            return true;
        }
        return this.merchSectionId.length() > 0;
    }

    private final boolean hasSpellingCorrectionShowOriginal() {
        return this.spellingCorrectionShowOriginal.length() > 0;
    }

    /* access modifiers changed from: private */
    public final boolean isAscending(String str) {
        return C19383o.m32792b(str, "asc") || C19383o.m32792b(str, "up") || C19383o.m32792b(str, "ascending") || C19383o.m32792b(str, "ASC");
    }

    /* access modifiers changed from: private */
    public final boolean isDescending(String str) {
        return C19383o.m32792b(str, "desc") || C19383o.m32792b(str, "down") || C19383o.m32792b(str, "descending") || C19383o.m32792b(str, "DESC");
    }

    public final Map<String, String> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.onSale) {
            linkedHashMap.put("is_discounted", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.freeShipping) {
            linkedHashMap.put("free_shipping", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        boolean z = this.oneDayShipping;
        if (z && this.threeDayShipping) {
            linkedHashMap.put("max_processing_days", "1,3");
        } else if (z) {
            linkedHashMap.put("max_processing_days", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } else if (this.threeDayShipping) {
            linkedHashMap.put("max_processing_days", "3");
        }
        if (this.acceptsGiftCards) {
            linkedHashMap.put("accepts_gift_cards", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.minPrice.compareTo(DEFAULT_LOW_PRICE) > 0) {
            String bigDecimal = this.minPrice.toString();
            C19383o.m32796f(bigDecimal, "minPrice.toString()");
            linkedHashMap.put(ResponseConstants.MIN_PRICE, bigDecimal);
        }
        BigDecimal bigDecimal2 = this.maxPrice;
        if (bigDecimal2 != null || this.userSpecifiedMax) {
            linkedHashMap.put(ResponseConstants.MAX_PRICE, String.valueOf(bigDecimal2));
        }
        if (this.shipsToCountryCode.length() > 0) {
            linkedHashMap.put("ship_to", this.shipsToCountryCode);
        }
        MarketPlace marketPlace = this.marketplace;
        if (marketPlace != MarketPlace.MARKETPLACE_ALL_ITEMS) {
            linkedHashMap.put("marketplace", marketPlace.getHttpParamValue());
        }
        FacetCount selectedCategoryFacet = getSelectedCategoryFacet();
        String id = selectedCategoryFacet != null ? selectedCategoryFacet.getId() : null;
        if (hasCategoryFacets() && id != null) {
            linkedHashMap.put(ResponseConstants.CATEGORY, id);
        }
        if (this.customizable) {
            linkedHashMap.put("customizable", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.giftWrap) {
            linkedHashMap.put("gift_wrap", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (C18263b.m30839d0(this.spellingCorrectionShowOriginal)) {
            linkedHashMap.put("spelling_correction_show_original", this.spellingCorrectionShowOriginal);
        }
        if (this.categoryProlist) {
            linkedHashMap.put("category_prolist", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (C18263b.m30839d0(this.pctDiscountMin) && C18263b.m30839d0(this.pctDiscountMax) && C19383o.m32792b(this.pctDiscountMin, this.pctDiscountMax)) {
            linkedHashMap.put(SearchOptionsParams.PCT_DISCOUNT_MIN.getSearchParam(), this.pctDiscountMin);
            linkedHashMap.put(SearchOptionsParams.PCT_DISCOUNT_MAX.getSearchParam(), this.pctDiscountMax);
        } else if (C18263b.m30839d0(this.pctDiscountMin)) {
            linkedHashMap.put(SearchOptionsParams.PCT_DISCOUNT_MIN.getSearchParam(), this.pctDiscountMin);
        }
        if (C18263b.m30839d0(this.attributeValuesParam)) {
            linkedHashMap.put("attribute_values", this.attributeValuesParam);
        }
        this.shopLocation.apply(linkedHashMap);
        if (this.isMerchLibrary) {
            linkedHashMap.put(SearchOptionsParams.IS_MERCH_LIBRARY.getSearchParam(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (C18263b.m30839d0(this.merchOnSearchVariant)) {
            linkedHashMap.put(SearchOptionsParams.MERCH_ON_SEARCH_VARIANT.getSearchParam(), this.merchOnSearchVariant);
        }
        if (C18263b.m30839d0(this.merchCollectionId)) {
            linkedHashMap.put(SearchOptionsParams.MERCH_COLLECTION_ID.getSearchParam(), this.merchCollectionId);
        }
        if (C18263b.m30839d0(this.merchSectionId)) {
            linkedHashMap.put(SearchOptionsParams.MERCH_SECTION_ID.getSearchParam(), this.merchSectionId);
        }
        Pair<String, String> sortOrderParams = getSortOrderParams();
        linkedHashMap.put("sort_on", sortOrderParams.getFirst());
        linkedHashMap.put(ResponseConstants.SORT_ORDER, sortOrderParams.getSecond());
        return linkedHashMap;
    }

    public final List<FacetCount> component1() {
        return this.categoryFacets;
    }

    public final BigDecimal component10() {
        return this.minPrice;
    }

    public final BigDecimal component11() {
        return this.maxPrice;
    }

    public final boolean component12() {
        return this.userSpecifiedMax;
    }

    public final boolean component13() {
        return this.userSpecifiedMin;
    }

    public final String component14() {
        return this.shipsToCountryCode;
    }

    public final String component15() {
        return this.shipsToCountryName;
    }

    public final SortOrder component16() {
        return this.sortOrder;
    }

    public final MarketPlace component17() {
        return this.marketplace;
    }

    public final String component18() {
        return this.spellingCorrectionShowOriginal;
    }

    public final boolean component19() {
        return this.categoryProlist;
    }

    public final boolean component2() {
        return this.onSale;
    }

    public final String component20() {
        return this.pctDiscountMax;
    }

    public final String component21() {
        return this.pctDiscountMin;
    }

    public final String component22() {
        return this.query;
    }

    public final String component23() {
        return this.attributeValuesParam;
    }

    public final int component24() {
        return this.priceIndex;
    }

    public final boolean component25() {
        return this.isMerchLibrary;
    }

    public final String component26() {
        return this.merchOnSearchVariant;
    }

    public final String component27() {
        return this.merchCollectionId;
    }

    public final String component28() {
        return this.merchSectionId;
    }

    public final boolean component3() {
        return this.freeShipping;
    }

    public final boolean component4() {
        return this.oneDayShipping;
    }

    public final boolean component5() {
        return this.threeDayShipping;
    }

    public final boolean component6() {
        return this.acceptsGiftCards;
    }

    public final boolean component7() {
        return this.customizable;
    }

    public final boolean component8() {
        return this.giftWrap;
    }

    public final Location component9() {
        return this.shopLocation;
    }

    public final SearchOptions copy(List<? extends FacetCount> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Location location, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z8, boolean z9, String str, String str2, SortOrder sortOrder2, MarketPlace marketPlace, String str3, boolean z10, String str4, String str5, String str6, String str7, int i, boolean z11, String str8, String str9, String str10) {
        List<? extends FacetCount> list2 = list;
        C19383o.m32797g(list2, "categoryFacets");
        C19383o.m32797g(location, "shopLocation");
        C19383o.m32797g(bigDecimal, "minPrice");
        C19383o.m32797g(str, "shipsToCountryCode");
        C19383o.m32797g(str2, "shipsToCountryName");
        C19383o.m32797g(sortOrder2, "sortOrder");
        C19383o.m32797g(marketPlace, "marketplace");
        C19383o.m32797g(str3, "spellingCorrectionShowOriginal");
        C19383o.m32797g(str4, "pctDiscountMax");
        C19383o.m32797g(str5, "pctDiscountMin");
        C19383o.m32797g(str6, "query");
        C19383o.m32797g(str7, "attributeValuesParam");
        C19383o.m32797g(str8, "merchOnSearchVariant");
        C19383o.m32797g(str9, "merchCollectionId");
        C19383o.m32797g(str10, "merchSectionId");
        return new SearchOptions(list2, z, z2, z3, z4, z5, z6, z7, location, bigDecimal, bigDecimal2, z8, z9, str, str2, sortOrder2, marketPlace, str3, z10, str4, str5, str6, str7, i, z11, str8, str9, str10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOptions)) {
            return false;
        }
        SearchOptions searchOptions = (SearchOptions) obj;
        return C19383o.m32792b(this.categoryFacets, searchOptions.categoryFacets) && this.onSale == searchOptions.onSale && this.freeShipping == searchOptions.freeShipping && this.oneDayShipping == searchOptions.oneDayShipping && this.threeDayShipping == searchOptions.threeDayShipping && this.acceptsGiftCards == searchOptions.acceptsGiftCards && this.customizable == searchOptions.customizable && this.giftWrap == searchOptions.giftWrap && C19383o.m32792b(this.shopLocation, searchOptions.shopLocation) && C19383o.m32792b(this.minPrice, searchOptions.minPrice) && C19383o.m32792b(this.maxPrice, searchOptions.maxPrice) && this.userSpecifiedMax == searchOptions.userSpecifiedMax && this.userSpecifiedMin == searchOptions.userSpecifiedMin && C19383o.m32792b(this.shipsToCountryCode, searchOptions.shipsToCountryCode) && C19383o.m32792b(this.shipsToCountryName, searchOptions.shipsToCountryName) && this.sortOrder == searchOptions.sortOrder && this.marketplace == searchOptions.marketplace && C19383o.m32792b(this.spellingCorrectionShowOriginal, searchOptions.spellingCorrectionShowOriginal) && this.categoryProlist == searchOptions.categoryProlist && C19383o.m32792b(this.pctDiscountMax, searchOptions.pctDiscountMax) && C19383o.m32792b(this.pctDiscountMin, searchOptions.pctDiscountMin) && C19383o.m32792b(this.query, searchOptions.query) && C19383o.m32792b(this.attributeValuesParam, searchOptions.attributeValuesParam) && this.priceIndex == searchOptions.priceIndex && this.isMerchLibrary == searchOptions.isMerchLibrary && C19383o.m32792b(this.merchOnSearchVariant, searchOptions.merchOnSearchVariant) && C19383o.m32792b(this.merchCollectionId, searchOptions.merchCollectionId) && C19383o.m32792b(this.merchSectionId, searchOptions.merchSectionId);
    }

    public final boolean getAcceptsGiftCards() {
        return this.acceptsGiftCards;
    }

    public final String getAttributeValuesParam() {
        return this.attributeValuesParam;
    }

    public final List<FacetCount> getCategoryFacets() {
        return this.categoryFacets;
    }

    public final boolean getCategoryProlist() {
        return this.categoryProlist;
    }

    public final boolean getCustomizable() {
        return this.customizable;
    }

    public final boolean getFreeShipping() {
        return this.freeShipping;
    }

    public final boolean getGiftWrap() {
        return this.giftWrap;
    }

    public final MarketPlace getMarketplace() {
        return this.marketplace;
    }

    public final BigDecimal getMaxPrice() {
        return this.maxPrice;
    }

    public final String getMerchCollectionId() {
        return this.merchCollectionId;
    }

    public final String getMerchOnSearchVariant() {
        return this.merchOnSearchVariant;
    }

    public final String getMerchSectionId() {
        return this.merchSectionId;
    }

    public final BigDecimal getMinPrice() {
        return this.minPrice;
    }

    public final boolean getOnSale() {
        return this.onSale;
    }

    public final boolean getOneDayShipping() {
        return this.oneDayShipping;
    }

    public final String getPctDiscountMax() {
        return this.pctDiscountMax;
    }

    public final String getPctDiscountMin() {
        return this.pctDiscountMin;
    }

    public final int getPriceIndex() {
        return this.priceIndex;
    }

    public final String getQuery() {
        return this.query;
    }

    public final FacetCount getSelectedCategoryFacet() {
        if (this.categoryFacets.isEmpty()) {
            return null;
        }
        return (FacetCount) C19327t.m32645a1(this.categoryFacets);
    }

    public final String getShipsToCountryCode() {
        return this.shipsToCountryCode;
    }

    public final String getShipsToCountryName() {
        return this.shipsToCountryName;
    }

    public final Location getShopLocation() {
        return this.shopLocation;
    }

    public final SortOrder getSortOrder() {
        return this.sortOrder;
    }

    public final Pair<String, String> getSortOrderParams() {
        int i = C10968a.f24318a[this.sortOrder.ordinal()];
        String str = ResponseConstants.PRICE;
        String str2 = "down";
        if (i == 1) {
            str = "score";
        } else if (i == 2) {
            str = "created";
        } else if (i != 3) {
            if (i != 4) {
                str = null;
            } else {
                str2 = "up";
            }
        }
        return new Pair<>(str, str2);
    }

    public final String getSpellingCorrectionShowOriginal() {
        return this.spellingCorrectionShowOriginal;
    }

    public final boolean getThreeDayShipping() {
        return this.threeDayShipping;
    }

    public final boolean getUserSpecifiedMax() {
        return this.userSpecifiedMax;
    }

    public final boolean getUserSpecifiedMin() {
        return this.userSpecifiedMin;
    }

    public final boolean hasCategoryFacets() {
        return !this.categoryFacets.isEmpty();
    }

    public final boolean hasDefaultFilters() {
        if (!hasCategoryFacets() && !this.onSale && !this.freeShipping && !this.oneDayShipping && !this.threeDayShipping && !this.acceptsGiftCards && !this.customizable && !this.giftWrap && this.shopLocation.isAnywhere() && !hasShipsToCountry() && !hasMinPrice() && !hasMaxPrice() && !hasMarketplace() && !hasSpellingCorrectionShowOriginal()) {
            SortOrder sortOrder2 = this.sortOrder;
            SortOrder.Companion.getClass();
            if (sortOrder2 == SortOrder.DEFAULT) {
                String str = this.pctDiscountMin;
                if (str == null || str.length() == 0) {
                    String str2 = this.pctDiscountMax;
                    if (str2 == null || str2.length() == 0) {
                        if ((this.attributeValuesParam.length() == 0) && !this.userSpecifiedMax && !this.userSpecifiedMin) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean hasDefaults() {
        if (!hasCategoryFacets() && !this.onSale && !this.freeShipping && !this.oneDayShipping && !this.threeDayShipping && !this.acceptsGiftCards && !this.customizable && !this.giftWrap && this.shopLocation.isAnywhere() && !hasShipsToCountry() && !hasMinPrice() && !hasMaxPrice() && !hasMarketplace() && !hasSpellingCorrectionShowOriginal()) {
            SortOrder sortOrder2 = this.sortOrder;
            SortOrder.Companion.getClass();
            if (sortOrder2 == SortOrder.DEFAULT && !this.categoryProlist) {
                String str = this.pctDiscountMin;
                if (str == null || str.length() == 0) {
                    String str2 = this.pctDiscountMax;
                    if (str2 == null || str2.length() == 0) {
                        String str3 = this.attributeValuesParam;
                        if ((str3 == null || str3.length() == 0) && !this.userSpecifiedMax && !this.userSpecifiedMin && !this.isMerchLibrary && !hasMerchOnSearch()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean hasMarketplace() {
        return this.marketplace != MarketPlace.MARKETPLACE_ALL_ITEMS;
    }

    public final boolean hasMaxPrice() {
        return !C19383o.m32792b(this.maxPrice, DEFAULT_HIGH_PRICE) || this.userSpecifiedMax;
    }

    public final boolean hasMinPrice() {
        return !C19383o.m32792b(this.minPrice, DEFAULT_LOW_PRICE);
    }

    public final boolean hasPriceBucketSelected() {
        return !isAnyPriceSelected() && !this.userSpecifiedMin && !this.userSpecifiedMax;
    }

    public final boolean hasShipsToCountry() {
        return !C19383o.m32792b(systemLocale.getCountry(), this.shipsToCountryCode);
    }

    public final boolean hasSortOrder() {
        SortOrder sortOrder2 = this.sortOrder;
        SortOrder.Companion.getClass();
        return sortOrder2 != SortOrder.DEFAULT;
    }

    public int hashCode() {
        int hashCode = this.categoryFacets.hashCode() * 31;
        boolean z = this.onSale;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.freeShipping;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.oneDayShipping;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.threeDayShipping;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.acceptsGiftCards;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.customizable;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.giftWrap;
        if (z8) {
            z8 = true;
        }
        int hashCode2 = (this.minPrice.hashCode() + ((this.shopLocation.hashCode() + ((i6 + (z8 ? 1 : 0)) * 31)) * 31)) * 31;
        BigDecimal bigDecimal = this.maxPrice;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        boolean z9 = this.userSpecifiedMax;
        if (z9) {
            z9 = true;
        }
        int i7 = (hashCode3 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.userSpecifiedMin;
        if (z10) {
            z10 = true;
        }
        int e = C0023f.m105e(this.spellingCorrectionShowOriginal, (this.marketplace.hashCode() + ((this.sortOrder.hashCode() + C0023f.m105e(this.shipsToCountryName, C0023f.m105e(this.shipsToCountryCode, (i7 + (z10 ? 1 : 0)) * 31, 31), 31)) * 31)) * 31, 31);
        boolean z11 = this.categoryProlist;
        if (z11) {
            z11 = true;
        }
        int a = C0069a.m170a(this.priceIndex, C0023f.m105e(this.attributeValuesParam, C0023f.m105e(this.query, C0023f.m105e(this.pctDiscountMin, C0023f.m105e(this.pctDiscountMax, (e + (z11 ? 1 : 0)) * 31, 31), 31), 31), 31), 31);
        boolean z12 = this.isMerchLibrary;
        if (!z12) {
            z2 = z12;
        }
        return this.merchSectionId.hashCode() + C0023f.m105e(this.merchCollectionId, C0023f.m105e(this.merchOnSearchVariant, (a + (z2 ? 1 : 0)) * 31, 31), 31);
    }

    public final boolean isAnyPriceSelected() {
        return C19383o.m32792b(this.minPrice, BigDecimal.ZERO) && this.maxPrice == null;
    }

    public final boolean isMerchLibrary() {
        return this.isMerchLibrary;
    }

    public final void resetCategoryFacets() {
        this.categoryFacets = new ArrayList();
    }

    public final void resetPriceLimit() {
        this.maxPrice = (BigDecimal) DEFAULT_HIGH_PRICE;
        this.minPrice = DEFAULT_LOW_PRICE;
        this.priceIndex = 0;
    }

    public final void resetShipsToCountry() {
        Locale locale = systemLocale;
        String country = locale.getCountry();
        C19383o.m32796f(country, "systemLocale.country");
        this.shipsToCountryCode = country;
        String displayCountry = locale.getDisplayCountry();
        C19383o.m32796f(displayCountry, "systemLocale.displayCountry");
        this.shipsToCountryName = displayCountry;
    }

    public final void resetToDefault() {
        this.categoryFacets = new ArrayList();
        this.onSale = false;
        this.acceptsGiftCards = false;
        this.freeShipping = false;
        this.oneDayShipping = false;
        this.threeDayShipping = false;
        this.customizable = false;
        this.giftWrap = false;
        this.shopLocation.resetToDefault();
        resetShipsToCountry();
        resetPriceLimit();
        this.marketplace = MarketPlace.MARKETPLACE_ALL_ITEMS;
        SortOrder.Companion.getClass();
        this.sortOrder = SortOrder.DEFAULT;
        this.categoryProlist = false;
        this.attributeValuesParam = "";
        this.priceIndex = 0;
        this.userSpecifiedMin = false;
        this.userSpecifiedMax = false;
        this.merchOnSearchVariant = "";
        this.merchCollectionId = "";
        this.merchSectionId = "";
    }

    public final void setAcceptsGiftCards(boolean z) {
        this.acceptsGiftCards = z;
    }

    public final void setAttributeValuesParam(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.attributeValuesParam = str;
    }

    public final void setCategoryFacets(List<? extends FacetCount> list) {
        C19383o.m32797g(list, "<set-?>");
        this.categoryFacets = list;
    }

    public final void setCategoryProlist(boolean z) {
        this.categoryProlist = z;
    }

    public final void setCustomizable(boolean z) {
        this.customizable = z;
    }

    public final void setFreeShipping(boolean z) {
        this.freeShipping = z;
    }

    public final void setGiftWrap(boolean z) {
        this.giftWrap = z;
    }

    public final void setMarketplace(MarketPlace marketPlace) {
        C19383o.m32797g(marketPlace, "<set-?>");
        this.marketplace = marketPlace;
    }

    public final void setMaxPrice(BigDecimal bigDecimal) {
        this.maxPrice = bigDecimal;
    }

    public final void setMerchCollectionId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.merchCollectionId = str;
    }

    public final void setMerchLibrary(boolean z) {
        this.isMerchLibrary = z;
    }

    public final void setMerchOnSearchVariant(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.merchOnSearchVariant = str;
    }

    public final void setMerchSectionId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.merchSectionId = str;
    }

    public final void setMinPrice(BigDecimal bigDecimal) {
        C19383o.m32797g(bigDecimal, "<set-?>");
        this.minPrice = bigDecimal;
    }

    public final void setOnSale(boolean z) {
        this.onSale = z;
    }

    public final void setOneDayShipping(boolean z) {
        this.oneDayShipping = z;
    }

    public final void setPctDiscountMax(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.pctDiscountMax = str;
    }

    public final void setPctDiscountMin(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.pctDiscountMin = str;
    }

    public final void setPriceIndex(int i) {
        this.priceIndex = i;
    }

    public final void setQuery(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.query = str;
    }

    public final void setShipsTo(String str, String str2) {
        C19383o.m32797g(str, ResponseConstants.CODE);
        C19383o.m32797g(str2, "name");
        this.shipsToCountryCode = str;
        this.shipsToCountryName = str2;
    }

    public final void setShipsToCountryCode(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.shipsToCountryCode = str;
    }

    public final void setShipsToCountryName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.shipsToCountryName = str;
    }

    public final void setSortOrder(SortOrder sortOrder2) {
        C19383o.m32797g(sortOrder2, "<set-?>");
        this.sortOrder = sortOrder2;
    }

    public final void setSpellingCorrectionShowOriginal(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.spellingCorrectionShowOriginal = str;
    }

    public final void setThreeDayShipping(boolean z) {
        this.threeDayShipping = z;
    }

    public final void setUserSpecifiedMax(boolean z) {
        this.userSpecifiedMax = z;
    }

    public final void setUserSpecifiedMin(boolean z) {
        this.userSpecifiedMin = z;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchOptions(categoryFacets=");
        h.append(this.categoryFacets);
        h.append(", onSale=");
        h.append(this.onSale);
        h.append(", freeShipping=");
        h.append(this.freeShipping);
        h.append(", oneDayShipping=");
        h.append(this.oneDayShipping);
        h.append(", threeDayShipping=");
        h.append(this.threeDayShipping);
        h.append(", acceptsGiftCards=");
        h.append(this.acceptsGiftCards);
        h.append(", customizable=");
        h.append(this.customizable);
        h.append(", giftWrap=");
        h.append(this.giftWrap);
        h.append(", shopLocation=");
        h.append(this.shopLocation);
        h.append(", minPrice=");
        h.append(this.minPrice);
        h.append(", maxPrice=");
        h.append(this.maxPrice);
        h.append(", userSpecifiedMax=");
        h.append(this.userSpecifiedMax);
        h.append(", userSpecifiedMin=");
        h.append(this.userSpecifiedMin);
        h.append(", shipsToCountryCode=");
        h.append(this.shipsToCountryCode);
        h.append(", shipsToCountryName=");
        h.append(this.shipsToCountryName);
        h.append(", sortOrder=");
        h.append(this.sortOrder);
        h.append(", marketplace=");
        h.append(this.marketplace);
        h.append(", spellingCorrectionShowOriginal=");
        h.append(this.spellingCorrectionShowOriginal);
        h.append(", categoryProlist=");
        h.append(this.categoryProlist);
        h.append(", pctDiscountMax=");
        h.append(this.pctDiscountMax);
        h.append(", pctDiscountMin=");
        h.append(this.pctDiscountMin);
        h.append(", query=");
        h.append(this.query);
        h.append(", attributeValuesParam=");
        h.append(this.attributeValuesParam);
        h.append(", priceIndex=");
        h.append(this.priceIndex);
        h.append(", isMerchLibrary=");
        h.append(this.isMerchLibrary);
        h.append(", merchOnSearchVariant=");
        h.append(this.merchOnSearchVariant);
        h.append(", merchCollectionId=");
        h.append(this.merchCollectionId);
        h.append(", merchSectionId=");
        return C0391c.m1057c(h, this.merchSectionId, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        List<? extends FacetCount> list = this.categoryFacets;
        parcel.writeInt(list.size());
        for (Serializable writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
        parcel.writeInt(this.onSale ? 1 : 0);
        parcel.writeInt(this.freeShipping ? 1 : 0);
        parcel.writeInt(this.oneDayShipping ? 1 : 0);
        parcel.writeInt(this.threeDayShipping ? 1 : 0);
        parcel.writeInt(this.acceptsGiftCards ? 1 : 0);
        parcel.writeInt(this.customizable ? 1 : 0);
        parcel.writeInt(this.giftWrap ? 1 : 0);
        this.shopLocation.writeToParcel(parcel, i);
        parcel.writeSerializable(this.minPrice);
        parcel.writeSerializable(this.maxPrice);
        parcel.writeInt(this.userSpecifiedMax ? 1 : 0);
        parcel.writeInt(this.userSpecifiedMin ? 1 : 0);
        parcel.writeString(this.shipsToCountryCode);
        parcel.writeString(this.shipsToCountryName);
        parcel.writeString(this.sortOrder.name());
        parcel.writeString(this.marketplace.name());
        parcel.writeString(this.spellingCorrectionShowOriginal);
        parcel.writeInt(this.categoryProlist ? 1 : 0);
        parcel.writeString(this.pctDiscountMax);
        parcel.writeString(this.pctDiscountMin);
        parcel.writeString(this.query);
        parcel.writeString(this.attributeValuesParam);
        parcel.writeInt(this.priceIndex);
        parcel.writeInt(this.isMerchLibrary ? 1 : 0);
        parcel.writeString(this.merchOnSearchVariant);
        parcel.writeString(this.merchCollectionId);
        parcel.writeString(this.merchSectionId);
    }

    public final void setMarketplace(String str) {
        C19383o.m32797g(str, "marketplace");
        if (C19383o.m32792b(str, ResponseConstants.HANDMADE)) {
            this.marketplace = MarketPlace.MARKETPLACE_HANDMADE;
        } else if (C19383o.m32792b(str, "vintage")) {
            this.marketplace = MarketPlace.MARKETPLACE_VINTAGE;
        } else {
            this.marketplace = MarketPlace.MARKETPLACE_ALL_ITEMS;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchOptions(java.util.List r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, com.etsy.android.p327ui.search.p330v2.SearchOptions.Location r38, java.math.BigDecimal r39, java.math.BigDecimal r40, boolean r41, boolean r42, java.lang.String r43, java.lang.String r44, com.etsy.android.p327ui.search.SortOrder r45, com.etsy.android.p327ui.search.p330v2.SearchOptions.MarketPlace r46, java.lang.String r47, boolean r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, boolean r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            r29 = this;
            r0 = r58
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x000e
        L_0x000c:
            r1 = r30
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0014
            r2 = 0
            goto L_0x0016
        L_0x0014:
            r2 = r31
        L_0x0016:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001e
        L_0x001c:
            r4 = r32
        L_0x001e:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0024
            r5 = 0
            goto L_0x0026
        L_0x0024:
            r5 = r33
        L_0x0026:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002c
            r6 = 0
            goto L_0x002e
        L_0x002c:
            r6 = r34
        L_0x002e:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0034
            r7 = 0
            goto L_0x0036
        L_0x0034:
            r7 = r35
        L_0x0036:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003c
            r8 = 0
            goto L_0x003e
        L_0x003c:
            r8 = r36
        L_0x003e:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0044
            r9 = 0
            goto L_0x0046
        L_0x0044:
            r9 = r37
        L_0x0046:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0052
            com.etsy.android.ui.search.v2.SearchOptions$Location r10 = new com.etsy.android.ui.search.v2.SearchOptions$Location
            r11 = 3
            r12 = 0
            r10.<init>(r12, r12, r11, r12)
            goto L_0x0054
        L_0x0052:
            r10 = r38
        L_0x0054:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005b
            java.math.BigDecimal r11 = DEFAULT_LOW_PRICE
            goto L_0x005d
        L_0x005b:
            r11 = r39
        L_0x005d:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0066
            java.lang.Void r12 = DEFAULT_HIGH_PRICE
            java.math.BigDecimal r12 = (java.math.BigDecimal) r12
            goto L_0x0068
        L_0x0066:
            r12 = r40
        L_0x0068:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006e
            r13 = 0
            goto L_0x0070
        L_0x006e:
            r13 = r41
        L_0x0070:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0076
            r14 = 0
            goto L_0x0078
        L_0x0076:
            r14 = r42
        L_0x0078:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0088
            java.util.Locale r15 = systemLocale
            java.lang.String r15 = r15.getCountry()
            java.lang.String r3 = "systemLocale.country"
            kotlin.jvm.internal.C19383o.m32796f(r15, r3)
            goto L_0x008a
        L_0x0088:
            r15 = r43
        L_0x008a:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x009c
            java.util.Locale r3 = systemLocale
            java.lang.String r3 = r3.getDisplayCountry()
            r59 = r15
            java.lang.String r15 = "systemLocale.displayCountry"
            kotlin.jvm.internal.C19383o.m32796f(r3, r15)
            goto L_0x00a0
        L_0x009c:
            r59 = r15
            r3 = r44
        L_0x00a0:
            r15 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 & r0
            if (r15 == 0) goto L_0x00b0
            com.etsy.android.ui.search.SortOrder$a r15 = com.etsy.android.p327ui.search.SortOrder.Companion
            r15.getClass()
            com.etsy.android.ui.search.SortOrder r15 = com.etsy.android.p327ui.search.SortOrder.DEFAULT
            goto L_0x00b2
        L_0x00b0:
            r15 = r45
        L_0x00b2:
            r16 = 65536(0x10000, float:9.18355E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x00bb
            com.etsy.android.ui.search.v2.SearchOptions$MarketPlace r16 = com.etsy.android.p327ui.search.p330v2.SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS
            goto L_0x00bd
        L_0x00bb:
            r16 = r46
        L_0x00bd:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r0 & r17
            java.lang.String r18 = ""
            if (r17 == 0) goto L_0x00c8
            r17 = r18
            goto L_0x00ca
        L_0x00c8:
            r17 = r47
        L_0x00ca:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00d3
            r19 = 0
            goto L_0x00d5
        L_0x00d3:
            r19 = r48
        L_0x00d5:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00de
            r20 = r18
            goto L_0x00e0
        L_0x00de:
            r20 = r49
        L_0x00e0:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00e9
            r21 = r18
            goto L_0x00eb
        L_0x00e9:
            r21 = r50
        L_0x00eb:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00f4
            r22 = r18
            goto L_0x00f6
        L_0x00f4:
            r22 = r51
        L_0x00f6:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00ff
            r23 = r18
            goto L_0x0101
        L_0x00ff:
            r23 = r52
        L_0x0101:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x010a
            r24 = 0
            goto L_0x010c
        L_0x010a:
            r24 = r53
        L_0x010c:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x0115
            r25 = 0
            goto L_0x0117
        L_0x0115:
            r25 = r54
        L_0x0117:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x0120
            r26 = r18
            goto L_0x0122
        L_0x0120:
            r26 = r55
        L_0x0122:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x012b
            r27 = r18
            goto L_0x012d
        L_0x012b:
            r27 = r56
        L_0x012d:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r28
            if (r0 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r18 = r57
        L_0x0136:
            r30 = r29
            r31 = r1
            r32 = r2
            r33 = r4
            r34 = r5
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r43 = r14
            r44 = r59
            r45 = r3
            r46 = r15
            r47 = r16
            r48 = r17
            r49 = r19
            r50 = r20
            r51 = r21
            r52 = r22
            r53 = r23
            r54 = r24
            r55 = r25
            r56 = r26
            r57 = r27
            r58 = r18
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.SearchOptions.<init>(java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, boolean, com.etsy.android.ui.search.v2.SearchOptions$Location, java.math.BigDecimal, java.math.BigDecimal, boolean, boolean, java.lang.String, java.lang.String, com.etsy.android.ui.search.SortOrder, com.etsy.android.ui.search.v2.SearchOptions$MarketPlace, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
