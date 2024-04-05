package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseShopJsonAdapter extends JsonAdapter<PastPurchaseShop> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchaseShop> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SHOP_NAME, ResponseConstants.SHOP_ICON_URL_FULL);

    public PastPurchaseShopJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "shopName");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseShop)";
    }

    public PastPurchaseShop fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new PastPurchaseShop(str, str2);
        }
        Constructor<PastPurchaseShop> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PastPurchaseShop.class.getDeclaredConstructor(new Class[]{cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PastPurchaseShop::class.…his.constructorRef = it }");
        }
        PastPurchaseShop newInstance = constructor.newInstance(new Object[]{str, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PastPurchaseShop pastPurchaseShop) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseShop != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShop.getShopName());
            wVar.mo68529h(ResponseConstants.SHOP_ICON_URL_FULL);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseShop.getIcon());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
