package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class VariationJsonAdapter extends JsonAdapter<Variation> {
    public static final int $stable = 8;
    private volatile Constructor<Variation> constructorRef;
    private final JsonAdapter<List<VariationValue>> nullableListOfVariationValueAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<VariationValue> nullableVariationValueAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("property_id", "name", ResponseConstants.VALUES, "selectedValue");

    public VariationJsonAdapter(C17414y yVar) {
        Class<VariationValue> cls = VariationValue.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, ResponseConstants.PROPERTY_ID_CAMELCASE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableListOfVariationValueAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.VALUES);
        this.nullableVariationValueAdapter = yVar.mo68558c(cls, emptySet, "selectedValue");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Variation)";
    }

    public Variation fromJson(JsonReader jsonReader) {
        Variation variation;
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        boolean z = false;
        Long l = null;
        String str = null;
        List list = null;
        VariationValue variationValue = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfVariationValueAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                variationValue = this.nullableVariationValueAdapter.fromJson(jsonReader2);
                z = true;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            variation = new Variation(l, str, list);
        } else {
            Constructor<Variation> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = Variation.class.getDeclaredConstructor(new Class[]{Long.class, String.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "Variation::class.java.ge…his.constructorRef = it }");
            }
            Variation newInstance = constructor.newInstance(new Object[]{l, str, list, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            variation = newInstance;
        }
        if (z) {
            variation.setSelectedValue(variationValue);
        }
        return variation;
    }

    public void toJson(C17412w wVar, Variation variation) {
        C19383o.m32797g(wVar, "writer");
        if (variation != null) {
            wVar.mo68522b();
            wVar.mo68529h("property_id");
            this.nullableLongAdapter.toJson(wVar, variation.getPropertyId());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, variation.getName());
            wVar.mo68529h(ResponseConstants.VALUES);
            this.nullableListOfVariationValueAdapter.toJson(wVar, variation.getValues());
            wVar.mo68529h("selectedValue");
            this.nullableVariationValueAdapter.toJson(wVar, variation.getSelectedValue());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
