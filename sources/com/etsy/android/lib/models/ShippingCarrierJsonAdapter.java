package com.etsy.android.lib.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShippingCarrierJsonAdapter extends JsonAdapter<ShippingCarrier> {
    public static final int $stable = 8;
    private volatile Constructor<ShippingCarrier> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("carrier_id", "tracking_num", "provider_id", ResponseConstants.DISPLAY_NAME, "provider_name");

    public ShippingCarrierJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "carrierId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShippingCarrier)";
    }

    public ShippingCarrier fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new ShippingCarrier(str, str2, str3, str4, str5);
        }
        Constructor<ShippingCarrier> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShippingCarrier.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShippingCarrier::class.j…his.constructorRef = it }");
        }
        ShippingCarrier newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShippingCarrier shippingCarrier) {
        C19383o.m32797g(wVar, "writer");
        if (shippingCarrier != null) {
            wVar.mo68522b();
            wVar.mo68529h("carrier_id");
            this.nullableStringAdapter.toJson(wVar, shippingCarrier.getCarrierId());
            wVar.mo68529h("tracking_num");
            this.nullableStringAdapter.toJson(wVar, shippingCarrier.getTrackingNum());
            wVar.mo68529h("provider_id");
            this.nullableStringAdapter.toJson(wVar, shippingCarrier.getProviderId());
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.nullableStringAdapter.toJson(wVar, shippingCarrier.getDisplayName());
            wVar.mo68529h("provider_name");
            this.nullableStringAdapter.toJson(wVar, shippingCarrier.getProviderName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
