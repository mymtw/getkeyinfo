package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponseJsonAdapter */
public final class AddressDetailsLayoutResponseJsonAdapter extends JsonAdapter<AddressDetailsLayoutResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Map<String, List<String>>> nullableMapOfStringListOfStringAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("locale", ResponseConstants.FORMAT, "required_fields", "uppercase_fields", "name", "administrative_area_type", "locality_type", "postal_code_type", "second_line_type", "postal_code_pattern", "administrative_areas", "input_format", "local_input_format", "iso_code", "administrative_area_translation_map", ResponseConstants.PHONE, "invalid_address_char_pattern");

    public AddressDetailsLayoutResponseJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "locale");
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "requiredFields");
        this.nullableMapOfStringStringAdapter = yVar2.mo68558c(C17387a0.m29126d(Map.class, cls, cls), emptySet, "administrativeAreas");
        this.nullableMapOfStringListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(Map.class, cls, C17387a0.m29126d(List.class, cls)), emptySet, "administrativeAreaTranslationMap");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Map map = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Map map2 = null;
        String str12 = null;
        String str13 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
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
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    map2 = this.nullableMapOfStringListOfStringAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new AddressDetailsLayoutResponse(str, str2, list, list2, str3, str4, str5, str6, str7, str8, map, str9, str10, str11, map2, str12, str13);
    }

    public final void toJson(C17412w wVar, Object obj) {
        AddressDetailsLayoutResponse addressDetailsLayoutResponse = (AddressDetailsLayoutResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (addressDetailsLayoutResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("locale");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25072a);
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25073b);
            wVar.mo68529h("required_fields");
            this.nullableListOfStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25074c);
            wVar.mo68529h("uppercase_fields");
            this.nullableListOfStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25075d);
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25076e);
            wVar.mo68529h("administrative_area_type");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25077f);
            wVar.mo68529h("locality_type");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25078g);
            wVar.mo68529h("postal_code_type");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25079h);
            wVar.mo68529h("second_line_type");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25080i);
            wVar.mo68529h("postal_code_pattern");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25081j);
            wVar.mo68529h("administrative_areas");
            this.nullableMapOfStringStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25082k);
            wVar.mo68529h("input_format");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25083l);
            wVar.mo68529h("local_input_format");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25084m);
            wVar.mo68529h("iso_code");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25085n);
            wVar.mo68529h("administrative_area_translation_map");
            this.nullableMapOfStringListOfStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25086o);
            wVar.mo68529h(ResponseConstants.PHONE);
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25087p);
            wVar.mo68529h("invalid_address_char_pattern");
            this.nullableStringAdapter.toJson(wVar, addressDetailsLayoutResponse.f25088q);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AddressDetailsLayoutResponse)";
    }
}
