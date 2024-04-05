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

public final class AppsInventoryUiOptionJsonAdapter extends JsonAdapter<AppsInventoryUiOption> {
    public static final int $stable = 8;
    private volatile Constructor<AppsInventoryUiOption> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("value", ResponseConstants.SELECTED, ResponseConstants.ENABLED, ResponseConstants.DISPLAY_VALUE, "raw_display_value");

    public AppsInventoryUiOptionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "value");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.SELECTED);
        this.nullableFormattedMoneyAdapter = yVar.mo68558c(FormattedMoney.class, emptySet, "displayValue");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "rawDisplayValue");
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppsInventoryUiOption)";
    }

    public AppsInventoryUiOption fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        FormattedMoney formattedMoney = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                formattedMoney = this.nullableFormattedMoneyAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new AppsInventoryUiOption(l, bool, bool2, formattedMoney, str);
        }
        Constructor<AppsInventoryUiOption> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppsInventoryUiOption.class.getDeclaredConstructor(new Class[]{Long.class, cls, cls, FormattedMoney.class, String.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "AppsInventoryUiOption::c…his.constructorRef = it }");
        }
        AppsInventoryUiOption newInstance = constructor.newInstance(new Object[]{l, bool, bool2, formattedMoney, str, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, AppsInventoryUiOption appsInventoryUiOption) {
        C19383o.m32797g(wVar, "writer");
        if (appsInventoryUiOption != null) {
            wVar.mo68522b();
            wVar.mo68529h("value");
            this.nullableLongAdapter.toJson(wVar, appsInventoryUiOption.getValue());
            wVar.mo68529h(ResponseConstants.SELECTED);
            this.nullableBooleanAdapter.toJson(wVar, appsInventoryUiOption.getSelected());
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.nullableBooleanAdapter.toJson(wVar, appsInventoryUiOption.getEnabled());
            wVar.mo68529h(ResponseConstants.DISPLAY_VALUE);
            this.nullableFormattedMoneyAdapter.toJson(wVar, appsInventoryUiOption.getDisplayValue());
            wVar.mo68529h("raw_display_value");
            this.nullableStringAdapter.toJson(wVar, appsInventoryUiOption.getRawDisplayValue());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
