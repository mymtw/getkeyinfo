package com.etsy.android.lib.models.apiv3.pastpurchase;

import com.etsy.android.lib.models.pastpurchase.PastPurchaseReceiptV3;
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

public final class ReceiptsWithModuleJsonAdapter extends JsonAdapter<ReceiptsWithModule> {
    public static final int $stable = 8;
    private volatile Constructor<ReceiptsWithModule> constructorRef;
    private final JsonAdapter<List<PastPurchaseReceiptV3>> listOfPastPurchaseReceiptV3Adapter;
    private final JsonAdapter<ModulePlacement> nullableModulePlacementAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("receipts", "module_placement");

    public ReceiptsWithModuleJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, PastPurchaseReceiptV3.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfPastPurchaseReceiptV3Adapter = yVar.mo68558c(d, emptySet, "receipts");
        this.nullableModulePlacementAdapter = yVar.mo68558c(ModulePlacement.class, emptySet, "modulePlacement");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReceiptsWithModule)";
    }

    public ReceiptsWithModule fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        ModulePlacement modulePlacement = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfPastPurchaseReceiptV3Adapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("receipts", "receipts", jsonReader);
                }
            } else if (Q == 1) {
                modulePlacement = this.nullableModulePlacementAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i != -3) {
            Constructor<ReceiptsWithModule> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ReceiptsWithModule.class.getDeclaredConstructor(new Class[]{List.class, ModulePlacement.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ReceiptsWithModule::clas…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            if (list != null) {
                objArr[0] = list;
                objArr[1] = modulePlacement;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                ReceiptsWithModule newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("receipts", "receipts", jsonReader);
        } else if (list != null) {
            return new ReceiptsWithModule(list, modulePlacement);
        } else {
            throw C18215a.m30728g("receipts", "receipts", jsonReader);
        }
    }

    public void toJson(C17412w wVar, ReceiptsWithModule receiptsWithModule) {
        C19383o.m32797g(wVar, "writer");
        if (receiptsWithModule != null) {
            wVar.mo68522b();
            wVar.mo68529h("receipts");
            this.listOfPastPurchaseReceiptV3Adapter.toJson(wVar, receiptsWithModule.getReceipts());
            wVar.mo68529h("module_placement");
            this.nullableModulePlacementAdapter.toJson(wVar, receiptsWithModule.getModulePlacement());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
