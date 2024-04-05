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

public final class StructuredPolicyShippingJsonAdapter extends JsonAdapter<StructuredPolicyShipping> {
    public static final int $stable = 8;
    private volatile Constructor<StructuredPolicyShipping> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<StructuredPolicyShippingEstimate>> nullableListOfStructuredPolicyShippingEstimateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ESTIMATES, ResponseConstants.HAS_SHIPPING_UPGRADES, ResponseConstants.PROCESSING_TIME_TEXT, ResponseConstants.SHIPS_INTERNATIONAL);

    public StructuredPolicyShippingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, StructuredPolicyShippingEstimate.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStructuredPolicyShippingEstimateAdapter = yVar.mo68558c(d, emptySet, ResponseConstants.ESTIMATES);
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "hasShippingUpgrades");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "processingTimeText");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyShipping)";
    }

    public StructuredPolicyShipping fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfStructuredPolicyShippingEstimateAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i == -16) {
            return new StructuredPolicyShipping(list, bool, str, bool2);
        }
        Constructor<StructuredPolicyShipping> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = StructuredPolicyShipping.class.getDeclaredConstructor(new Class[]{List.class, cls, String.class, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "StructuredPolicyShipping…his.constructorRef = it }");
        }
        StructuredPolicyShipping newInstance = constructor.newInstance(new Object[]{list, bool, str, bool2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, StructuredPolicyShipping structuredPolicyShipping) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyShipping != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ESTIMATES);
            this.nullableListOfStructuredPolicyShippingEstimateAdapter.toJson(wVar, structuredPolicyShipping.getEstimates());
            wVar.mo68529h(ResponseConstants.HAS_SHIPPING_UPGRADES);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyShipping.getHasShippingUpgrades());
            wVar.mo68529h(ResponseConstants.PROCESSING_TIME_TEXT);
            this.nullableStringAdapter.toJson(wVar, structuredPolicyShipping.getProcessingTimeText());
            wVar.mo68529h(ResponseConstants.SHIPS_INTERNATIONAL);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyShipping.getShipsInternational());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
