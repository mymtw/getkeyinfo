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

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterShopResponseJsonAdapter */
public final class SaveForLaterShopResponseJsonAdapter extends JsonAdapter<SaveForLaterShopResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveForLaterShopResponse> constructorRef;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_id", ResponseConstants.SHOP_NAME);

    public SaveForLaterShopResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "shopId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "shopName");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new SaveForLaterShopResponse(l, str);
        }
        Constructor<SaveForLaterShopResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveForLaterShopResponse.class.getDeclaredConstructor(new Class[]{Long.class, String.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveForLaterShopResponse…his.constructorRef = it }");
        }
        SaveForLaterShopResponse newInstance = constructor.newInstance(new Object[]{l, str, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveForLaterShopResponse saveForLaterShopResponse = (SaveForLaterShopResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveForLaterShopResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, saveForLaterShopResponse.f20663a);
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, saveForLaterShopResponse.f20664b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveForLaterShopResponse)";
    }
}
