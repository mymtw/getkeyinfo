package com.etsy.android.lib.models;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p618lp.C18215a;

public final class ShopAboutImageJsonAdapter extends JsonAdapter<ShopAboutImage> {
    public static final int $stable = 8;
    private volatile Constructor<ShopAboutImage> constructorRef;
    private final JsonAdapter<EtsyId> etsyIdAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<List<Image.Source>> nullableListOfSourceAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.IMAGE_ID, ResponseConstants.URL_178x178, ResponseConstants.URL_545xN, ResponseConstants.URL_760XN, ResponseConstants.CAPTION, ResponseConstants.RANK, ResponseConstants.IMAGE, "key", "url", ResponseConstants.SOURCES, ResponseConstants.URL_75x75, ResponseConstants.URL_170x135, "url_224xN", ResponseConstants.URL_340x270, ResponseConstants.URL_680X540, ResponseConstants.URL_570xN, ResponseConstants.URL_300x300, ResponseConstants.URL_FULLxFULL, ResponseConstants.FULL_HEIGHT, ResponseConstants.FULL_WIDTH, "alt_text", "imageColor");
    private final JsonAdapter<String> stringAdapter;

    public ShopAboutImageJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.etsyIdAdapter = yVar2.mo68558c(EtsyId.class, emptySet, "imageId");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "imageUrl178x178");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, ResponseConstants.RANK);
        this.nullableImageAdapter = yVar2.mo68558c(Image.class, emptySet, "shopAboutImage");
        this.nullableListOfSourceAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Image.Source.class), emptySet, ResponseConstants.SOURCES);
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "urlFullxFull");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopAboutImage)";
    }

    public ShopAboutImage fromJson(JsonReader jsonReader) {
        ShopAboutImage shopAboutImage;
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        Integer num2 = num;
        int i2 = -1;
        EtsyId etsyId = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Image image = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        Integer num3 = null;
        Integer num4 = num2;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    etsyId = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId != null) {
                        i2 &= -2;
                        continue;
                    } else {
                        throw C18215a.m30734m("imageId", ResponseConstants.IMAGE_ID, jsonReader2);
                    }
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i2 &= -33;
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.RANK, ResponseConstants.RANK, jsonReader2);
                    }
                case 6:
                    image = this.nullableImageAdapter.fromJson(jsonReader2);
                    continue;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    list = this.nullableListOfSourceAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 13:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 14:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 15:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
                case 16:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -131073;
                    break;
                case 17:
                    str5 = this.stringAdapter.fromJson(jsonReader2);
                    if (str5 != null) {
                        i = -262145;
                        break;
                    } else {
                        throw C18215a.m30734m("urlFullxFull", ResponseConstants.URL_FULLxFULL, jsonReader2);
                    }
                case 18:
                    num4 = this.intAdapter.fromJson(jsonReader2);
                    if (num4 != null) {
                        i = -524289;
                        break;
                    } else {
                        throw C18215a.m30734m("fullHeight", ResponseConstants.FULL_HEIGHT, jsonReader2);
                    }
                case 19:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        i = -1048577;
                        break;
                    } else {
                        throw C18215a.m30734m("fullWidth", ResponseConstants.FULL_WIDTH, jsonReader2);
                    }
                case 20:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -2097153;
                    break;
                case 21:
                    num3 = this.intAdapter.fromJson(jsonReader2);
                    if (num3 != null) {
                        continue;
                    } else {
                        throw C18215a.m30734m("imageColor", "imageColor", jsonReader2);
                    }
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == -4193216) {
            C19383o.m32795e(etsyId, "null cannot be cast to non-null type com.etsy.android.lib.models.datatypes.EtsyId");
            String str16 = str5;
            C19383o.m32795e(str16, "null cannot be cast to non-null type kotlin.String");
            shopAboutImage = new ShopAboutImage(etsyId, str, str2, str3, str4, num.intValue(), image, str6, str7, list, (String) null, str8, str9, str10, str11, str12, str13, str14, str16, num4.intValue(), num2.intValue(), str15, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, (DefaultConstructorMarker) null);
        } else {
            Constructor<ShopAboutImage> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                constructor = ShopAboutImage.class.getDeclaredConstructor(new Class[]{EtsyId.class, cls, cls, cls, cls, cls2, Image.class, cls, cls, List.class, cls, cls, cls, cls, cls, cls, cls, cls, cls, cls2, cls2, cls, cls2, C18215a.f39928c});
                this.constructorRef = constructor;
                C19394m mVar = C19394m.f43287a;
                C19383o.m32796f(constructor, "ShopAboutImage::class.ja…his.constructorRef = it }");
            }
            ShopAboutImage newInstance = constructor.newInstance(new Object[]{etsyId, str, str2, str3, str4, num, image, str6, str7, list, null, str8, str9, str10, str11, str12, str13, str14, str5, num4, num2, str15, Integer.valueOf(i2), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            shopAboutImage = newInstance;
        }
        shopAboutImage.setImageColor(num3 != null ? num3.intValue() : shopAboutImage.getImageColor());
        return shopAboutImage;
    }

    public void toJson(C17412w wVar, ShopAboutImage shopAboutImage) {
        C19383o.m32797g(wVar, "writer");
        if (shopAboutImage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.IMAGE_ID);
            this.etsyIdAdapter.toJson(wVar, shopAboutImage.getImageId());
            wVar.mo68529h(ResponseConstants.URL_178x178);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getImageUrl178x178());
            wVar.mo68529h(ResponseConstants.URL_545xN);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getImageUrl545xN());
            wVar.mo68529h(ResponseConstants.URL_760XN);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getImageUrl760xN());
            wVar.mo68529h(ResponseConstants.CAPTION);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getCaption());
            wVar.mo68529h(ResponseConstants.RANK);
            this.intAdapter.toJson(wVar, Integer.valueOf(shopAboutImage.getRank()));
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.nullableImageAdapter.toJson(wVar, shopAboutImage.getShopAboutImage());
            wVar.mo68529h("key");
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getKey());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl());
            wVar.mo68529h(ResponseConstants.SOURCES);
            this.nullableListOfSourceAdapter.toJson(wVar, shopAboutImage.getSources());
            wVar.mo68529h(ResponseConstants.URL_75x75);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl75x75());
            wVar.mo68529h(ResponseConstants.URL_170x135);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl170x135());
            wVar.mo68529h("url_224xN");
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl224xN());
            wVar.mo68529h(ResponseConstants.URL_340x270);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl340x270());
            wVar.mo68529h(ResponseConstants.URL_680X540);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl680x540());
            wVar.mo68529h(ResponseConstants.URL_570xN);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl570xN());
            wVar.mo68529h(ResponseConstants.URL_300x300);
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getUrl300x300());
            wVar.mo68529h(ResponseConstants.URL_FULLxFULL);
            this.stringAdapter.toJson(wVar, shopAboutImage.getUrlFullxFull());
            wVar.mo68529h(ResponseConstants.FULL_HEIGHT);
            this.intAdapter.toJson(wVar, Integer.valueOf(shopAboutImage.getFullHeight()));
            wVar.mo68529h(ResponseConstants.FULL_WIDTH);
            this.intAdapter.toJson(wVar, Integer.valueOf(shopAboutImage.getFullWidth()));
            wVar.mo68529h("alt_text");
            this.nullableStringAdapter.toJson(wVar, shopAboutImage.getAltText());
            wVar.mo68529h("imageColor");
            this.intAdapter.toJson(wVar, Integer.valueOf(shopAboutImage.getImageColor()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
