package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class UiOptionJsonAdapter extends JsonAdapter<UiOption> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.DISPLAY_VALUE, "value", ResponseConstants.SELECTED, ResponseConstants.ENABLED);

    public UiOptionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "displayValue");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.SELECTED);
    }

    public String toString() {
        return "GeneratedJsonAdapter(UiOption)";
    }

    public UiOption fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new UiOption(str, str2, bool, bool2);
    }

    public void toJson(C17412w wVar, UiOption uiOption) {
        C19383o.m32797g(wVar, "writer");
        if (uiOption != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.DISPLAY_VALUE);
            this.nullableStringAdapter.toJson(wVar, uiOption.getDisplayValue());
            wVar.mo68529h("value");
            this.nullableStringAdapter.toJson(wVar, uiOption.getValue());
            wVar.mo68529h(ResponseConstants.SELECTED);
            this.nullableBooleanAdapter.toJson(wVar, uiOption.getSelected());
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.nullableBooleanAdapter.toJson(wVar, uiOption.getEnabled());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
