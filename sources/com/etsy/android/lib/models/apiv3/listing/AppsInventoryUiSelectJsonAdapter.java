package com.etsy.android.lib.models.apiv3.listing;

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

public final class AppsInventoryUiSelectJsonAdapter extends JsonAdapter<AppsInventoryUiSelect> {
    public static final int $stable = 8;
    private final JsonAdapter<List<AppsInventoryUiOption>> listOfAppsInventoryUiOptionAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UiOption> nullableUiOptionAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LABEL, ResponseConstants.PROMPT, ResponseConstants.ENABLED, ResponseConstants.ERROR_TEXT, "defaultOption", ResponseConstants.OPTIONS);

    public AppsInventoryUiSelectJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.LABEL);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.ENABLED);
        this.nullableUiOptionAdapter = yVar.mo68558c(UiOption.class, emptySet, "defaultOption");
        this.listOfAppsInventoryUiOptionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, AppsInventoryUiOption.class), emptySet, ResponseConstants.OPTIONS);
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppsInventoryUiSelect)";
    }

    public AppsInventoryUiSelect fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        UiOption uiOption = null;
        List list = null;
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
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    uiOption = this.nullableUiOptionAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    list = this.listOfAppsInventoryUiOptionAdapter.fromJson(jsonReader);
                    if (list != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("options_", ResponseConstants.OPTIONS, jsonReader);
                    }
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new AppsInventoryUiSelect(str, str2, bool, str3, uiOption, list);
        }
        throw C18215a.m30728g("options_", ResponseConstants.OPTIONS, jsonReader);
    }

    public void toJson(C17412w wVar, AppsInventoryUiSelect appsInventoryUiSelect) {
        C19383o.m32797g(wVar, "writer");
        if (appsInventoryUiSelect != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LABEL);
            this.nullableStringAdapter.toJson(wVar, appsInventoryUiSelect.getLabel());
            wVar.mo68529h(ResponseConstants.PROMPT);
            this.nullableStringAdapter.toJson(wVar, appsInventoryUiSelect.getPrompt());
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.nullableBooleanAdapter.toJson(wVar, appsInventoryUiSelect.getEnabled());
            wVar.mo68529h(ResponseConstants.ERROR_TEXT);
            this.nullableStringAdapter.toJson(wVar, appsInventoryUiSelect.getErrorText());
            wVar.mo68529h("defaultOption");
            this.nullableUiOptionAdapter.toJson(wVar, appsInventoryUiSelect.getDefaultOption());
            wVar.mo68529h(ResponseConstants.OPTIONS);
            this.listOfAppsInventoryUiOptionAdapter.toJson(wVar, appsInventoryUiSelect.getOptions());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
