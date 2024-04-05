package com.etsy.android.lib.models.apiv3.addresses;

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

public final class UserAddressFormatJsonAdapter extends JsonAdapter<UserAddressFormat> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("uppercase_fields", "required_fields", "country", "input_format", ResponseConstants.FORMAT, "local_input_format", "error");

    public UserAddressFormatJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, cls);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = yVar.mo68558c(d, emptySet, "uppercaseFields");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "country");
    }

    public String toString() {
        return "GeneratedJsonAdapter(UserAddressFormat)";
    }

    public UserAddressFormat fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        List list2 = null;
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
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new UserAddressFormat(list, list2, str, str2, str3, str4, str5);
    }

    public void toJson(C17412w wVar, UserAddressFormat userAddressFormat) {
        C19383o.m32797g(wVar, "writer");
        if (userAddressFormat != null) {
            wVar.mo68522b();
            wVar.mo68529h("uppercase_fields");
            this.nullableListOfStringAdapter.toJson(wVar, userAddressFormat.getUppercaseFields());
            wVar.mo68529h("required_fields");
            this.nullableListOfStringAdapter.toJson(wVar, userAddressFormat.getRequiredFields());
            wVar.mo68529h("country");
            this.nullableStringAdapter.toJson(wVar, userAddressFormat.getCountry());
            wVar.mo68529h("input_format");
            this.nullableStringAdapter.toJson(wVar, userAddressFormat.getInputFormat());
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, userAddressFormat.getFormat());
            wVar.mo68529h("local_input_format");
            this.nullableStringAdapter.toJson(wVar, userAddressFormat.getLocalInputFormat());
            wVar.mo68529h("error");
            this.nullableStringAdapter.toJson(wVar, userAddressFormat.getError());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
