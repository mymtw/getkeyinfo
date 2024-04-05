package com.etsy.android.p327ui.cart.saveforlater.models.network;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterVariationResponseJsonAdapter */
public final class SaveForLaterVariationResponseJsonAdapter extends JsonAdapter<SaveForLaterVariationResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveForLaterVariationResponse> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("property_id", ResponseConstants.VALUE_ID, "formatted_name", "formatted_value", ResponseConstants.COUPON_IS_VALID);

    public SaveForLaterVariationResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, ResponseConstants.PROPERTY_ID_CAMELCASE);
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "formattedName");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "isValid");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new SaveForLaterVariationResponse(l, l2, str, str2, bool);
        }
        Constructor<SaveForLaterVariationResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveForLaterVariationResponse.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls, cls, Boolean.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveForLaterVariationRes…his.constructorRef = it }");
        }
        SaveForLaterVariationResponse newInstance = constructor.newInstance(new Object[]{l, l2, str, str2, bool, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveForLaterVariationResponse saveForLaterVariationResponse = (SaveForLaterVariationResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveForLaterVariationResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("property_id");
            this.nullableLongAdapter.toJson(wVar, saveForLaterVariationResponse.f20665a);
            wVar.mo68529h(ResponseConstants.VALUE_ID);
            this.nullableLongAdapter.toJson(wVar, saveForLaterVariationResponse.f20666b);
            wVar.mo68529h("formatted_name");
            this.nullableStringAdapter.toJson(wVar, saveForLaterVariationResponse.f20667c);
            wVar.mo68529h("formatted_value");
            this.nullableStringAdapter.toJson(wVar, saveForLaterVariationResponse.f20668d);
            wVar.mo68529h(ResponseConstants.COUPON_IS_VALID);
            this.nullableBooleanAdapter.toJson(wVar, saveForLaterVariationResponse.f20669e);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveForLaterVariationResponse)";
    }
}
