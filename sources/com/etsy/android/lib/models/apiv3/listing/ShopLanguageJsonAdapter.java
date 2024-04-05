package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopLanguageJsonAdapter extends JsonAdapter<ShopLanguage> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CODE, "id", "is_machine_language", "lang_code", "lang_id", "language", "machine_code", "machine_id", "name");

    public ShopLanguageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.CODE);
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "id");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "isMachineLanguage");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopLanguage)";
    }

    public ShopLanguage fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Long l = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        String str4 = null;
        Long l2 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopLanguage(str, l, num, str2, num2, str3, str4, l2, str5);
    }

    public void toJson(C17412w wVar, ShopLanguage shopLanguage) {
        C19383o.m32797g(wVar, "writer");
        if (shopLanguage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CODE);
            this.nullableStringAdapter.toJson(wVar, shopLanguage.getCode());
            wVar.mo68529h("id");
            this.nullableLongAdapter.toJson(wVar, shopLanguage.getId());
            wVar.mo68529h("is_machine_language");
            this.nullableIntAdapter.toJson(wVar, shopLanguage.isMachineLanguage());
            wVar.mo68529h("lang_code");
            this.nullableStringAdapter.toJson(wVar, shopLanguage.getLangCode());
            wVar.mo68529h("lang_id");
            this.nullableIntAdapter.toJson(wVar, shopLanguage.getLangId());
            wVar.mo68529h("language");
            this.nullableStringAdapter.toJson(wVar, shopLanguage.getLanguage());
            wVar.mo68529h("machine_code");
            this.nullableStringAdapter.toJson(wVar, shopLanguage.getMachineCode());
            wVar.mo68529h("machine_id");
            this.nullableLongAdapter.toJson(wVar, shopLanguage.getMachineId());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shopLanguage.getName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
