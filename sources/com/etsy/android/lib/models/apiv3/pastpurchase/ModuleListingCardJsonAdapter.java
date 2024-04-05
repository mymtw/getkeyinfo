package com.etsy.android.lib.models.apiv3.pastpurchase;

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

public final class ModuleListingCardJsonAdapter extends JsonAdapter<ModuleListingCard> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ModuleListingCard> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "title", "url", ResponseConstants.IMG, "is_favorite", ResponseConstants.IS_IN_COLLECTIONS, "shop_id", ResponseConstants.CONTENT_SOURCE);
    private final JsonAdapter<String> stringAdapter;

    public ModuleListingCardJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls2, emptySet, "listingId");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "listingTitle");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "listingUrl");
        this.nullableListingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMG);
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isFav");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ModuleListingCard)";
    }

    public ModuleListingCard fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        ListingImage listingImage = null;
        String str4 = null;
        Boolean bool2 = bool;
        while (true) {
            Class<String> cls2 = cls;
            ListingImage listingImage2 = listingImage;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l == null) {
                            throw C18215a.m30734m("listingId", "listing_id", jsonReader2);
                        }
                        break;
                    case 1:
                        str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -3;
                        break;
                    case 2:
                        str3 = this.stringAdapter.fromJson(jsonReader2);
                        if (str3 == null) {
                            throw C18215a.m30734m("listingUrl", "url", jsonReader2);
                        }
                        break;
                    case 3:
                        listingImage = this.nullableListingImageAdapter.fromJson(jsonReader2);
                        i &= -9;
                        cls = cls2;
                        continue;
                    case 4:
                        bool = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool != null) {
                            i &= -17;
                            break;
                        } else {
                            throw C18215a.m30734m("isFav", "is_favorite", jsonReader2);
                        }
                    case 5:
                        bool2 = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool2 != null) {
                            i &= -33;
                            break;
                        } else {
                            throw C18215a.m30734m("isInCollections", ResponseConstants.IS_IN_COLLECTIONS, jsonReader2);
                        }
                    case 6:
                        l2 = this.longAdapter.fromJson(jsonReader2);
                        if (l2 == null) {
                            throw C18215a.m30734m("shopId", "shop_id", jsonReader2);
                        }
                        break;
                    case 7:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -129;
                        break;
                }
                cls = cls2;
                listingImage = listingImage2;
            } else {
                jsonReader.mo68413e();
                if (i != -187) {
                    Constructor<ModuleListingCard> constructor = this.constructorRef;
                    String str5 = "listing_id";
                    if (constructor == null) {
                        str = "listingId";
                        Class cls3 = Long.TYPE;
                        Class cls4 = Boolean.TYPE;
                        constructor = ModuleListingCard.class.getDeclaredConstructor(new Class[]{cls3, cls2, cls2, ListingImage.class, cls4, cls4, cls3, cls2, Integer.TYPE, C18215a.f39928c});
                        this.constructorRef = constructor;
                        C19383o.m32796f(constructor, "ModuleListingCard::class…his.constructorRef = it }");
                    } else {
                        str = "listingId";
                    }
                    Object[] objArr = new Object[10];
                    if (l != null) {
                        objArr[0] = Long.valueOf(l.longValue());
                        objArr[1] = str2;
                        if (str3 != null) {
                            objArr[2] = str3;
                            objArr[3] = listingImage2;
                            objArr[4] = bool;
                            objArr[5] = bool2;
                            if (l2 != null) {
                                objArr[6] = Long.valueOf(l2.longValue());
                                objArr[7] = str4;
                                objArr[8] = Integer.valueOf(i);
                                objArr[9] = null;
                                ModuleListingCard newInstance = constructor.newInstance(objArr);
                                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return newInstance;
                            }
                            throw C18215a.m30728g("shopId", "shop_id", jsonReader2);
                        }
                        throw C18215a.m30728g("listingUrl", "url", jsonReader2);
                    }
                    throw C18215a.m30728g(str, str5, jsonReader2);
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (str3 != null) {
                        boolean booleanValue = bool.booleanValue();
                        boolean booleanValue2 = bool2.booleanValue();
                        if (l2 != null) {
                            return new ModuleListingCard(longValue, str2, str3, listingImage2, booleanValue, booleanValue2, l2.longValue(), str4);
                        }
                        throw C18215a.m30728g("shopId", "shop_id", jsonReader2);
                    }
                    throw C18215a.m30728g("listingUrl", "url", jsonReader2);
                } else {
                    throw C18215a.m30728g("listingId", "listing_id", jsonReader2);
                }
            }
        }
    }

    public void toJson(C17412w wVar, ModuleListingCard moduleListingCard) {
        C19383o.m32797g(wVar, "writer");
        if (moduleListingCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(moduleListingCard.getListingId()));
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, moduleListingCard.getListingTitle());
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, moduleListingCard.getListingUrl());
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, moduleListingCard.getImg());
            wVar.mo68529h("is_favorite");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(moduleListingCard.isFav()));
            wVar.mo68529h(ResponseConstants.IS_IN_COLLECTIONS);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(moduleListingCard.isInCollections()));
            wVar.mo68529h("shop_id");
            this.longAdapter.toJson(wVar, Long.valueOf(moduleListingCard.getShopId()));
            wVar.mo68529h(ResponseConstants.CONTENT_SOURCE);
            this.nullableStringAdapter.toJson(wVar, moduleListingCard.getContentSource());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
