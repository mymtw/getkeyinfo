package com.etsy.android.p327ui.cart.saveforlater.models.network;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterListingResponseJsonAdapter */
public final class SaveForLaterListingResponseJsonAdapter extends JsonAdapter<SaveForLaterListingResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveForLaterListingResponse> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SaveForLaterVariationResponse>> nullableListOfSaveForLaterVariationResponseAdapter;
    private final JsonAdapter<ListingImage> nullableListingImageAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CART_ID, "listing_id", "title", ResponseConstants.PURCHASE_QUANTITY, ResponseConstants.BUYER_DISPLAY_PRICE, ResponseConstants.DISCOUNT_DESCRIPTION, ResponseConstants.DISCOUNT_PRICE, ResponseConstants.IMG, "is_digital", "is_favorite", "can_move_to_cart", ResponseConstants.SELECTED_VARIATIONS);

    public SaveForLaterListingResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "cartId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "purchaseQuantity");
        this.nullableListingImageAdapter = yVar.mo68558c(ListingImage.class, emptySet, ResponseConstants.IMAGE);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isDigital");
        this.nullableListOfSaveForLaterVariationResponseAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SaveForLaterVariationResponse.class), emptySet, "selectedVariations");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<String> cls3 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ListingImage listingImage = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
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
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    listingImage = this.nullableListingImageAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
                case 11:
                    list = this.nullableListOfSaveForLaterVariationResponseAdapter.fromJson(jsonReader2);
                    i &= -2049;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -4096) {
            return new SaveForLaterListingResponse(l, l2, str, num, str2, str3, str4, listingImage, bool, bool2, bool3, list);
        }
        Constructor<SaveForLaterListingResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveForLaterListingResponse.class.getDeclaredConstructor(new Class[]{cls, cls, cls3, Integer.class, cls3, cls3, cls3, ListingImage.class, cls2, cls2, cls2, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveForLaterListingRespo…his.constructorRef = it }");
        }
        SaveForLaterListingResponse newInstance = constructor.newInstance(new Object[]{l, l2, str, num, str2, str3, str4, listingImage, bool, bool2, bool3, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveForLaterListingResponse saveForLaterListingResponse = (SaveForLaterListingResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveForLaterListingResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CART_ID);
            this.nullableLongAdapter.toJson(wVar, saveForLaterListingResponse.f20651a);
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, saveForLaterListingResponse.f20652b);
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, saveForLaterListingResponse.f20653c);
            wVar.mo68529h(ResponseConstants.PURCHASE_QUANTITY);
            this.nullableIntAdapter.toJson(wVar, saveForLaterListingResponse.f20654d);
            wVar.mo68529h(ResponseConstants.BUYER_DISPLAY_PRICE);
            this.nullableStringAdapter.toJson(wVar, saveForLaterListingResponse.f20655e);
            wVar.mo68529h(ResponseConstants.DISCOUNT_DESCRIPTION);
            this.nullableStringAdapter.toJson(wVar, saveForLaterListingResponse.f20656f);
            wVar.mo68529h(ResponseConstants.DISCOUNT_PRICE);
            this.nullableStringAdapter.toJson(wVar, saveForLaterListingResponse.f20657g);
            wVar.mo68529h(ResponseConstants.IMG);
            this.nullableListingImageAdapter.toJson(wVar, saveForLaterListingResponse.f20658h);
            wVar.mo68529h("is_digital");
            this.nullableBooleanAdapter.toJson(wVar, saveForLaterListingResponse.f20659i);
            wVar.mo68529h("is_favorite");
            this.nullableBooleanAdapter.toJson(wVar, saveForLaterListingResponse.f20660j);
            wVar.mo68529h("can_move_to_cart");
            this.nullableBooleanAdapter.toJson(wVar, saveForLaterListingResponse.f20661k);
            wVar.mo68529h(ResponseConstants.SELECTED_VARIATIONS);
            this.nullableListOfSaveForLaterVariationResponseAdapter.toJson(wVar, saveForLaterListingResponse.f20662l);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveForLaterListingResponse)";
    }
}
