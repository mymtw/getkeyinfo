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

public final class ReceiptUserReviewJsonAdapter extends JsonAdapter<ReceiptUserReview> {
    public static final int $stable = 8;
    private volatile Constructor<ReceiptUserReview> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RATING);

    public ReceiptUserReviewJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, EmptySet.INSTANCE, ResponseConstants.RATING);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReceiptUserReview)";
    }

    public ReceiptUserReview fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            return new ReceiptUserReview(num);
        }
        Constructor<ReceiptUserReview> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReceiptUserReview.class.getDeclaredConstructor(new Class[]{Integer.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReceiptUserReview::class…his.constructorRef = it }");
        }
        ReceiptUserReview newInstance = constructor.newInstance(new Object[]{num, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ReceiptUserReview receiptUserReview) {
        C19383o.m32797g(wVar, "writer");
        if (receiptUserReview != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RATING);
            this.nullableIntAdapter.toJson(wVar, receiptUserReview.getRating());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
