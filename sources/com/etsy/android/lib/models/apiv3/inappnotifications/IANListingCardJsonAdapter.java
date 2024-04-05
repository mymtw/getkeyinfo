package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class IANListingCardJsonAdapter extends JsonAdapter<IANListingCard> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<IANListingCard> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "title", ResponseConstants.IMG, "is_favorite", ResponseConstants.IS_IN_COLLECTIONS, ResponseConstants.IS_VACATION, "state", "shop_id", "shouldShowRelatedListingsKt");

    public IANListingCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "listingId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "listingTitle");
        this.nullableListingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMG);
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isFav");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "listingState");
    }

    public String toString() {
        return "GeneratedJsonAdapter(IANListingCard)";
    }

    public IANListingCard fromJson(JsonReader jsonReader) {
        IANListingCard iANListingCard;
        boolean z;
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Boolean bool2 = bool;
        int i = -1;
        Long l = null;
        String str = null;
        ListingImage listingImage = null;
        Integer num = null;
        Long l2 = null;
        Boolean bool3 = null;
        Boolean bool4 = bool2;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    listingImage = this.nullableListingImageAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("isFav", "is_favorite", jsonReader2);
                    }
                case 4:
                    bool4 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool4 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("isInCollections", ResponseConstants.IS_IN_COLLECTIONS, jsonReader2);
                    }
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("isVacation", ResponseConstants.IS_VACATION, jsonReader2);
                    }
                case 6:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    bool3 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool3 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("shouldShowRelatedListingsKt", "shouldShowRelatedListingsKt", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            iANListingCard = new IANListingCard(l, str, listingImage, bool.booleanValue(), bool4.booleanValue(), bool2.booleanValue(), num, l2);
        } else {
            Constructor<IANListingCard> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls2 = Boolean.TYPE;
                constructor = IANListingCard.class.getDeclaredConstructor(new Class[]{cls, String.class, ListingImage.class, cls2, cls2, cls2, Integer.class, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "IANListingCard::class.ja…his.constructorRef = it }");
            }
            IANListingCard newInstance = constructor.newInstance(new Object[]{l, str, listingImage, bool, bool4, bool2, num, l2, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            iANListingCard = newInstance;
        }
        if (bool3 != null) {
            z = bool3.booleanValue();
        } else {
            z = iANListingCard.getShouldShowRelatedListingsKt();
        }
        iANListingCard.setShouldShowRelatedListingsKt(z);
        return iANListingCard;
    }

    public void toJson(C17412w wVar, IANListingCard iANListingCard) {
        C19383o.m32797g(wVar, "writer");
        if (iANListingCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, iANListingCard.getListingId());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, iANListingCard.getListingTitle());
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, iANListingCard.getImg());
            wVar.mo68529h("is_favorite");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(iANListingCard.isFav()));
            wVar.mo68529h(ResponseConstants.IS_IN_COLLECTIONS);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(iANListingCard.isInCollections()));
            wVar.mo68529h(ResponseConstants.IS_VACATION);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(iANListingCard.isVacation()));
            wVar.mo68529h("state");
            this.nullableIntAdapter.toJson(wVar, iANListingCard.getListingState());
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, iANListingCard.getShopId());
            wVar.mo68529h("shouldShowRelatedListingsKt");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(iANListingCard.getShouldShowRelatedListingsKt()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
