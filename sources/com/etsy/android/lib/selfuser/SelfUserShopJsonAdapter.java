package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SelfUserShopJsonAdapter extends JsonAdapter<SelfUserShop> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> listOfNullableStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SelfUserListingDetails>> nullableListOfSelfUserListingDetailsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_id", ResponseConstants.SHOP_NAME, ResponseConstants.STATUS, ResponseConstants.LISTING_ACTIVE_COUNT, ResponseConstants.SHOP_ICON_URL_FULL, ResponseConstants.IMAGE_URL_760X100, ResponseConstants.CURRENCY_CODE, ResponseConstants.IS_VACATION, ResponseConstants.LANGUAGES, ResponseConstants.AVERAGE_RATING, ResponseConstants.TOTAL_RATING_COUNT, "displayed_featured_listings", "listings");
    private final JsonAdapter<String> stringAdapter;

    public SelfUserShopJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls2, emptySet, "shopId");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "name");
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, ResponseConstants.STATUS);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "listingActiveCount");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "isVacation");
        this.listOfNullableStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.LANGUAGES);
        this.nullableDoubleAdapter = yVar2.mo68558c(Double.class, emptySet, "averageRating");
        this.nullableListOfSelfUserListingDetailsAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, SelfUserListingDetails.class), emptySet, "displayedFeaturedListings");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        List list = null;
        Double d = null;
        Integer num2 = null;
        List list2 = null;
        List list3 = null;
        while (true) {
            Integer num3 = num2;
            Double d2 = d;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l == null) {
                            throw C18215a.m30734m("shopId", "shop_id", jsonReader2);
                        }
                        break;
                    case 1:
                        str = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        str2 = this.stringAdapter.fromJson(jsonReader2);
                        if (str2 == null) {
                            throw C18215a.m30734m(ResponseConstants.STATUS, ResponseConstants.STATUS, jsonReader2);
                        }
                        break;
                    case 3:
                        num = this.nullableIntAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        list = this.listOfNullableStringAdapter.fromJson(jsonReader2);
                        if (list == null) {
                            throw C18215a.m30734m(ResponseConstants.LANGUAGES, ResponseConstants.LANGUAGES, jsonReader2);
                        }
                        break;
                    case 9:
                        d = this.nullableDoubleAdapter.fromJson(jsonReader2);
                        num2 = num3;
                        continue;
                    case 10:
                        num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        list2 = this.nullableListOfSelfUserListingDetailsAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        list3 = this.nullableListOfSelfUserListingDetailsAdapter.fromJson(jsonReader2);
                        break;
                }
                num2 = num3;
                d = d2;
            } else {
                jsonReader.mo68413e();
                if (l != null) {
                    long longValue = l.longValue();
                    if (str2 == null) {
                        throw C18215a.m30728g(ResponseConstants.STATUS, ResponseConstants.STATUS, jsonReader2);
                    } else if (list != null) {
                        return new SelfUserShop(longValue, str, str2, num, str3, str4, str5, bool, list, d2, num3, list2, list3);
                    } else {
                        throw C18215a.m30728g(ResponseConstants.LANGUAGES, ResponseConstants.LANGUAGES, jsonReader2);
                    }
                } else {
                    throw C18215a.m30728g("shopId", "shop_id", jsonReader2);
                }
            }
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserShop selfUserShop = (SelfUserShop) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserShop != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(selfUserShop.f19514a));
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, selfUserShop.f19515b);
            wVar.mo68529h(ResponseConstants.STATUS);
            this.stringAdapter.toJson(wVar, selfUserShop.f19516c);
            wVar.mo68529h(ResponseConstants.LISTING_ACTIVE_COUNT);
            this.nullableIntAdapter.toJson(wVar, selfUserShop.f19517d);
            wVar.mo68529h(ResponseConstants.SHOP_ICON_URL_FULL);
            this.nullableStringAdapter.toJson(wVar, selfUserShop.f19518e);
            wVar.mo68529h(ResponseConstants.IMAGE_URL_760X100);
            this.nullableStringAdapter.toJson(wVar, selfUserShop.f19519f);
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, selfUserShop.f19520g);
            wVar.mo68529h(ResponseConstants.IS_VACATION);
            this.nullableBooleanAdapter.toJson(wVar, selfUserShop.f19521h);
            wVar.mo68529h(ResponseConstants.LANGUAGES);
            this.listOfNullableStringAdapter.toJson(wVar, selfUserShop.f19522i);
            wVar.mo68529h(ResponseConstants.AVERAGE_RATING);
            this.nullableDoubleAdapter.toJson(wVar, selfUserShop.f19523j);
            wVar.mo68529h(ResponseConstants.TOTAL_RATING_COUNT);
            this.nullableIntAdapter.toJson(wVar, selfUserShop.f19524k);
            wVar.mo68529h("displayed_featured_listings");
            this.nullableListOfSelfUserListingDetailsAdapter.toJson(wVar, selfUserShop.f19525l);
            wVar.mo68529h("listings");
            this.nullableListOfSelfUserListingDetailsAdapter.toJson(wVar, selfUserShop.f19526m);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserShop)";
    }
}
