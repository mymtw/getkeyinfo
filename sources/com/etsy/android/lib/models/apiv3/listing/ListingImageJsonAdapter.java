package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p618lp.C18215a;

public final class ListingImageJsonAdapter extends JsonAdapter<ListingImage> {
    public static final int $stable = 8;
    private volatile Constructor<ListingImage> constructorRef;
    private final JsonAdapter<EtsyId> etsyIdAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("color", ResponseConstants.RED, ResponseConstants.GREEN, ResponseConstants.BLUE, "extension", "extra_data", ResponseConstants.RANK, ResponseConstants.HUE, ResponseConstants.IMAGE_ID, "owner_id", ResponseConstants.SATURATION, "url", "url_1140xN", ResponseConstants.URL_170x135, "url_224xN", ResponseConstants.URL_300x300, ResponseConstants.URL_340x270, ResponseConstants.URL_570xN, "url_600x600", "url_642xN", ResponseConstants.URL_680X540, ResponseConstants.URL_75x75, ResponseConstants.URL_FULLxFULL, ResponseConstants.VERSION, "volume", ResponseConstants.FULL_WIDTH, ResponseConstants.FULL_HEIGHT, ResponseConstants.WIDTH, ResponseConstants.HEIGHT, "listing_id", "alt_text");

    public ListingImageJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "color");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, ResponseConstants.RED);
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.HUE);
        this.etsyIdAdapter = yVar2.mo68558c(EtsyId.class, emptySet, "imageId");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "listingId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingImage)";
    }

    public ListingImage fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i2 = -1;
        String str = null;
        EtsyId etsyId = null;
        String str2 = null;
        String str3 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Long l = null;
        String str16 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i2 &= -3;
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.RED, ResponseConstants.RED, jsonReader2);
                    }
                case 2:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        i2 &= -5;
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.GREEN, ResponseConstants.GREEN, jsonReader2);
                    }
                case 3:
                    num3 = this.intAdapter.fromJson(jsonReader2);
                    if (num3 != null) {
                        i2 &= -9;
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.BLUE, ResponseConstants.BLUE, jsonReader2);
                    }
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    num4 = this.intAdapter.fromJson(jsonReader2);
                    if (num4 != null) {
                        i2 &= -65;
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.RANK, ResponseConstants.RANK, jsonReader2);
                    }
                case 7:
                    num7 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    etsyId = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId != null) {
                        i2 &= -257;
                        continue;
                    } else {
                        throw C18215a.m30734m("imageId", ResponseConstants.IMAGE_ID, jsonReader2);
                    }
                case 9:
                    num8 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    num9 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
                case 17:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -131073;
                    break;
                case 18:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -262145;
                    break;
                case 19:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -524289;
                    break;
                case 20:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -1048577;
                    break;
                case 21:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -2097153;
                    break;
                case 22:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -4194305;
                    break;
                case 23:
                    num10 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i = -8388609;
                    break;
                case 24:
                    num11 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i = -16777217;
                    break;
                case 25:
                    num5 = this.intAdapter.fromJson(jsonReader2);
                    if (num5 != null) {
                        i = -33554433;
                        break;
                    } else {
                        throw C18215a.m30734m("fullWidth", ResponseConstants.FULL_WIDTH, jsonReader2);
                    }
                case 26:
                    num6 = this.intAdapter.fromJson(jsonReader2);
                    if (num6 != null) {
                        i = -67108865;
                        break;
                    } else {
                        throw C18215a.m30734m("fullHeight", ResponseConstants.FULL_HEIGHT, jsonReader2);
                    }
                case 27:
                    num12 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i = -134217729;
                    break;
                case 28:
                    num13 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i = -268435457;
                    break;
                case 29:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i = -536870913;
                    break;
                case 30:
                    str16 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -1073741825;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == Integer.MIN_VALUE) {
            EtsyId etsyId2 = etsyId;
            int intValue = num4.intValue();
            C19383o.m32795e(etsyId2, "null cannot be cast to non-null type com.etsy.android.lib.models.datatypes.EtsyId");
            return new ListingImage(str, num.intValue(), num2.intValue(), num3.intValue(), str2, str3, intValue, num7, etsyId2, num8, num9, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num10, num11, num5.intValue(), num6.intValue(), num12, num13, l, str16, 0, (String) null, (String) null, false, Integer.MIN_VALUE, 7, (DefaultConstructorMarker) null);
        }
        Constructor<ListingImage> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls3 = Integer.TYPE;
            constructor = ListingImage.class.getDeclaredConstructor(new Class[]{cls2, cls3, cls3, cls3, cls2, cls2, cls3, cls, EtsyId.class, cls, cls, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls, cls, cls3, cls3, cls, cls, Long.class, cls2, cls3, cls2, cls2, Boolean.TYPE, cls3, cls3, C18215a.f39928c});
            this.constructorRef = constructor;
            C19394m mVar = C19394m.f43287a;
            C19383o.m32796f(constructor, "ListingImage::class.java…his.constructorRef = it }");
        }
        ListingImage newInstance = constructor.newInstance(new Object[]{str, num, num2, num3, str2, str3, num4, num7, etsyId, num8, num9, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num10, num11, num5, num6, num12, num13, l, str16, 0, null, null, Boolean.FALSE, Integer.valueOf(i2), -1, null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingImage listingImage) {
        C19383o.m32797g(wVar, "writer");
        if (listingImage != null) {
            wVar.mo68522b();
            wVar.mo68529h("color");
            this.nullableStringAdapter.toJson(wVar, listingImage.getColor());
            wVar.mo68529h(ResponseConstants.RED);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getRed()));
            wVar.mo68529h(ResponseConstants.GREEN);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getGreen()));
            wVar.mo68529h(ResponseConstants.BLUE);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getBlue()));
            wVar.mo68529h("extension");
            this.nullableStringAdapter.toJson(wVar, listingImage.getExtension());
            wVar.mo68529h("extra_data");
            this.nullableStringAdapter.toJson(wVar, listingImage.getExtraData());
            wVar.mo68529h(ResponseConstants.RANK);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getRank()));
            wVar.mo68529h(ResponseConstants.HUE);
            this.nullableIntAdapter.toJson(wVar, listingImage.getHue());
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.etsyIdAdapter.toJson(wVar, listingImage.getImageId());
            wVar.mo68529h("owner_id");
            this.nullableIntAdapter.toJson(wVar, listingImage.getOwnerId());
            wVar.mo68529h(ResponseConstants.SATURATION);
            this.nullableIntAdapter.toJson(wVar, listingImage.getSaturation());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl());
            wVar.mo68529h("url_1140xN");
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl1140xN());
            wVar.mo68529h(ResponseConstants.URL_170x135);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl170x135());
            wVar.mo68529h("url_224xN");
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl224xN());
            wVar.mo68529h(ResponseConstants.URL_300x300);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl300x300());
            wVar.mo68529h(ResponseConstants.URL_340x270);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl340x270());
            wVar.mo68529h(ResponseConstants.URL_570xN);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl570xN());
            wVar.mo68529h("url_600x600");
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl600x600());
            wVar.mo68529h("url_642xN");
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl642xN());
            wVar.mo68529h(ResponseConstants.URL_680X540);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl680x540());
            wVar.mo68529h(ResponseConstants.URL_75x75);
            this.nullableStringAdapter.toJson(wVar, listingImage.getUrl75x75());
            wVar.mo68529h(ResponseConstants.URL_FULLxFULL);
            this.nullableStringAdapter.toJson(wVar, listingImage.getV3UrlFullxFull());
            wVar.mo68529h(ResponseConstants.VERSION);
            this.nullableIntAdapter.toJson(wVar, listingImage.getVersion());
            wVar.mo68529h("volume");
            this.nullableIntAdapter.toJson(wVar, listingImage.getVolume());
            wVar.mo68529h(ResponseConstants.FULL_WIDTH);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getFullWidth()));
            wVar.mo68529h(ResponseConstants.FULL_HEIGHT);
            this.intAdapter.toJson(wVar, Integer.valueOf(listingImage.getFullHeight()));
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.nullableIntAdapter.toJson(wVar, listingImage.getWidth());
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.nullableIntAdapter.toJson(wVar, listingImage.getHeight());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, listingImage.getListingId());
            wVar.mo68529h("alt_text");
            this.nullableStringAdapter.toJson(wVar, listingImage.getAltText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
