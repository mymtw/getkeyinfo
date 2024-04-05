package com.etsy.android.lib.models.pastpurchase;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class GiftCardDesignJsonAdapter extends JsonAdapter<GiftCardDesign> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("design_id", "url_69x69", "url_150x119", "url_280x166", "url_560x332", "url_banner");

    public GiftCardDesignJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "id");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "url69x69");
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftCardDesign)";
    }

    public GiftCardDesign fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new GiftCardDesign(num, str, str2, str3, str4, str5);
    }

    public void toJson(C17412w wVar, GiftCardDesign giftCardDesign) {
        C19383o.m32797g(wVar, "writer");
        if (giftCardDesign != null) {
            wVar.mo68522b();
            wVar.mo68529h("design_id");
            this.nullableIntAdapter.toJson(wVar, giftCardDesign.getId());
            wVar.mo68529h("url_69x69");
            this.nullableStringAdapter.toJson(wVar, giftCardDesign.getUrl69x69());
            wVar.mo68529h("url_150x119");
            this.nullableStringAdapter.toJson(wVar, giftCardDesign.getUrl150x119());
            wVar.mo68529h("url_280x166");
            this.nullableStringAdapter.toJson(wVar, giftCardDesign.getUrl280x166());
            wVar.mo68529h("url_560x332");
            this.nullableStringAdapter.toJson(wVar, giftCardDesign.getUrl560x332());
            wVar.mo68529h("url_banner");
            this.nullableStringAdapter.toJson(wVar, giftCardDesign.getUrlBanner());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
