package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingGiftInfoJsonAdapter extends JsonAdapter<ListingGiftInfo> {
    public static final int $stable = 8;
    private volatile Constructor<ListingGiftInfo> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("description", ResponseConstants.IS_ELIGIBLE, ResponseConstants.OFFERS_GIFT_MESSAGE, ResponseConstants.PREVIEW_IMAGE, ResponseConstants.PRICE, ResponseConstants.SHOP_NAME);

    public ListingGiftInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "description");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isEligible");
        this.nullableImageAdapter = yVar.mo68558c(Image.class, emptySet, "previewImage");
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, ResponseConstants.PRICE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingGiftInfo)";
    }

    public ListingGiftInfo fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Image image = null;
        Money money = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    image = this.nullableImageAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -64) {
            return new ListingGiftInfo(str, bool, bool2, image, money, str2);
        }
        Constructor<ListingGiftInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingGiftInfo.class.getDeclaredConstructor(new Class[]{cls2, cls, cls, Image.class, Money.class, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingGiftInfo::class.j…his.constructorRef = it }");
        }
        ListingGiftInfo newInstance = constructor.newInstance(new Object[]{str, bool, bool2, image, money, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingGiftInfo listingGiftInfo) {
        C19383o.m32797g(wVar, "writer");
        if (listingGiftInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, listingGiftInfo.getDescription());
            wVar.mo68529h(ResponseConstants.IS_ELIGIBLE);
            this.nullableBooleanAdapter.toJson(wVar, listingGiftInfo.isEligible());
            wVar.mo68529h(ResponseConstants.OFFERS_GIFT_MESSAGE);
            this.nullableBooleanAdapter.toJson(wVar, listingGiftInfo.getOffersGiftMessage());
            wVar.mo68529h(ResponseConstants.PREVIEW_IMAGE);
            this.nullableImageAdapter.toJson(wVar, listingGiftInfo.getPreviewImage());
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableMoneyAdapter.toJson(wVar, listingGiftInfo.getPrice());
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, listingGiftInfo.getShopName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
