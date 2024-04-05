package com.etsy.android.lib.models.pastpurchase;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchasesGiftCardDesignJsonAdapter extends JsonAdapter<PastPurchasesGiftCardDesign> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchasesGiftCardDesign> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("url_150x119");

    public PastPurchasesGiftCardDesignJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "url150x119");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchasesGiftCardDesign)";
    }

    public PastPurchasesGiftCardDesign fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            return new PastPurchasesGiftCardDesign(str);
        }
        Constructor<PastPurchasesGiftCardDesign> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PastPurchasesGiftCardDesign.class.getDeclaredConstructor(new Class[]{String.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PastPurchasesGiftCardDes…his.constructorRef = it }");
        }
        PastPurchasesGiftCardDesign newInstance = constructor.newInstance(new Object[]{str, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PastPurchasesGiftCardDesign pastPurchasesGiftCardDesign) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchasesGiftCardDesign != null) {
            wVar.mo68522b();
            wVar.mo68529h("url_150x119");
            this.nullableStringAdapter.toJson(wVar, pastPurchasesGiftCardDesign.getUrl150x119());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
