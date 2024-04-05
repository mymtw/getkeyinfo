package com.etsy.android.p327ui.cart.saveforlater.models.network;

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

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterCartResponseJsonAdapter */
public final class SaveForLaterCartResponseJsonAdapter extends JsonAdapter<SaveForLaterCartResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveForLaterCartResponse> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SaveForLaterItemResponse>> nullableListOfSaveForLaterItemResponseAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("saved_count", "cart_count", "sfl_listings");

    public SaveForLaterCartResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "savedCount");
        this.nullableListOfSaveForLaterItemResponseAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SaveForLaterItemResponse.class), emptySet, "listings");
    }

    public final Object fromJson(JsonReader jsonReader) {
        Class<Integer> cls = Integer.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfSaveForLaterItemResponseAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new SaveForLaterCartResponse(num, num2, list);
        }
        Constructor<SaveForLaterCartResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveForLaterCartResponse.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveForLaterCartResponse…his.constructorRef = it }");
        }
        SaveForLaterCartResponse newInstance = constructor.newInstance(new Object[]{num, num2, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveForLaterCartResponse saveForLaterCartResponse = (SaveForLaterCartResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveForLaterCartResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("saved_count");
            this.nullableIntAdapter.toJson(wVar, saveForLaterCartResponse.f20646a);
            wVar.mo68529h("cart_count");
            this.nullableIntAdapter.toJson(wVar, saveForLaterCartResponse.f20647b);
            wVar.mo68529h("sfl_listings");
            this.nullableListOfSaveForLaterItemResponseAdapter.toJson(wVar, saveForLaterCartResponse.f20648c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveForLaterCartResponse)";
    }
}
