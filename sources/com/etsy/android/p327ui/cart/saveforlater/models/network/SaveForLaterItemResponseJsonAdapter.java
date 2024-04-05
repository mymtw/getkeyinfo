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

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterItemResponseJsonAdapter */
public final class SaveForLaterItemResponseJsonAdapter extends JsonAdapter<SaveForLaterItemResponse> {
    public static final int $stable = 8;
    private volatile Constructor<SaveForLaterItemResponse> constructorRef;
    private final JsonAdapter<SaveForLaterListingResponse> nullableSaveForLaterListingResponseAdapter;
    private final JsonAdapter<SaveForLaterShopResponse> nullableSaveForLaterShopResponseAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LISTING, ResponseConstants.SHOP);

    public SaveForLaterItemResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableSaveForLaterListingResponseAdapter = yVar.mo68558c(SaveForLaterListingResponse.class, emptySet, ResponseConstants.LISTING);
        this.nullableSaveForLaterShopResponseAdapter = yVar.mo68558c(SaveForLaterShopResponse.class, emptySet, ResponseConstants.SHOP);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        SaveForLaterListingResponse saveForLaterListingResponse = null;
        SaveForLaterShopResponse saveForLaterShopResponse = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                saveForLaterListingResponse = this.nullableSaveForLaterListingResponseAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                saveForLaterShopResponse = this.nullableSaveForLaterShopResponseAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new SaveForLaterItemResponse(saveForLaterListingResponse, saveForLaterShopResponse);
        }
        Constructor<SaveForLaterItemResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SaveForLaterItemResponse.class.getDeclaredConstructor(new Class[]{SaveForLaterListingResponse.class, SaveForLaterShopResponse.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SaveForLaterItemResponse…his.constructorRef = it }");
        }
        SaveForLaterItemResponse newInstance = constructor.newInstance(new Object[]{saveForLaterListingResponse, saveForLaterShopResponse, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SaveForLaterItemResponse saveForLaterItemResponse = (SaveForLaterItemResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (saveForLaterItemResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LISTING);
            this.nullableSaveForLaterListingResponseAdapter.toJson(wVar, saveForLaterItemResponse.f20649a);
            wVar.mo68529h(ResponseConstants.SHOP);
            this.nullableSaveForLaterShopResponseAdapter.toJson(wVar, saveForLaterItemResponse.f20650b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SaveForLaterItemResponse)";
    }
}
