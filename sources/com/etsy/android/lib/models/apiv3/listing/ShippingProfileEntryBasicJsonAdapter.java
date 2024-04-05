package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShippingProfileEntryBasicJsonAdapter extends JsonAdapter<ShippingProfileEntryBasic> {
    public static final int $stable = 8;
    private volatile Constructor<ShippingProfileEntryBasic> constructorRef;
    private final JsonAdapter<ShippingCost> nullableShippingCostAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", "primary_cost", "secondary_cost");

    public ShippingProfileEntryBasicJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableShippingCostAdapter = yVar.mo68558c(ShippingCost.class, emptySet, "primaryCost");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingProfileEntryBasic)";
    }

    public ShippingProfileEntryBasic fromJson(JsonReader jsonReader) {
        Class<ShippingCost> cls = ShippingCost.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        ShippingCost shippingCost = null;
        ShippingCost shippingCost2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                shippingCost = this.nullableShippingCostAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                shippingCost2 = this.nullableShippingCostAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new ShippingProfileEntryBasic(str, shippingCost, shippingCost2);
        }
        Constructor<ShippingProfileEntryBasic> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShippingProfileEntryBasic.class.getDeclaredConstructor(new Class[]{String.class, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShippingProfileEntryBasi…his.constructorRef = it }");
        }
        ShippingProfileEntryBasic newInstance = constructor.newInstance(new Object[]{str, shippingCost, shippingCost2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShippingProfileEntryBasic shippingProfileEntryBasic) {
        C19383o.m32797g(wVar, "writer");
        if (shippingProfileEntryBasic != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shippingProfileEntryBasic.getName());
            wVar.mo68529h("primary_cost");
            this.nullableShippingCostAdapter.toJson(wVar, shippingProfileEntryBasic.getPrimaryCost());
            wVar.mo68529h("secondary_cost");
            this.nullableShippingCostAdapter.toJson(wVar, shippingProfileEntryBasic.getSecondaryCost());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
