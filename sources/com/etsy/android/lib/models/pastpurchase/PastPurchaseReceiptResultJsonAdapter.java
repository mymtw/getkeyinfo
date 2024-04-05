package com.etsy.android.lib.models.pastpurchase;

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

public final class PastPurchaseReceiptResultJsonAdapter extends JsonAdapter<PastPurchaseReceiptResult> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchaseReceiptResult> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<PastPurchaseReceipt>> nullableListOfPastPurchaseReceiptAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.COUNT, ResponseConstants.RESULTS);

    public PastPurchaseReceiptResultJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.COUNT);
        this.nullableListOfPastPurchaseReceiptAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, PastPurchaseReceipt.class), emptySet, "receipts");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseReceiptResult)";
    }

    public PastPurchaseReceiptResult fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Integer num = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m(ResponseConstants.COUNT, ResponseConstants.COUNT, jsonReader);
                }
            } else if (Q == 1) {
                list = this.nullableListOfPastPurchaseReceiptAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i != -3) {
            Constructor<PastPurchaseReceiptResult> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = PastPurchaseReceiptResult.class.getDeclaredConstructor(new Class[]{cls, List.class, cls, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "PastPurchaseReceiptResul…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            if (num != null) {
                objArr[0] = Integer.valueOf(num.intValue());
                objArr[1] = list;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                PastPurchaseReceiptResult newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g(ResponseConstants.COUNT, ResponseConstants.COUNT, jsonReader);
        } else if (num != null) {
            return new PastPurchaseReceiptResult(num.intValue(), list);
        } else {
            throw C18215a.m30728g(ResponseConstants.COUNT, ResponseConstants.COUNT, jsonReader);
        }
    }

    public void toJson(C17412w wVar, PastPurchaseReceiptResult pastPurchaseReceiptResult) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseReceiptResult != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(pastPurchaseReceiptResult.getCount()));
            wVar.mo68529h(ResponseConstants.RESULTS);
            this.nullableListOfPastPurchaseReceiptAdapter.toJson(wVar, pastPurchaseReceiptResult.getReceipts());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
