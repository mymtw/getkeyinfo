package com.etsy.android.lib.deeplinks;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class BranchParamsJsonAdapter extends JsonAdapter<BranchParams> {
    public static final int $stable = 8;
    private volatile Constructor<BranchParams> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("+match_guaranteed");

    public BranchParamsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, EmptySet.INSTANCE, "matchGuaranteed");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            return new BranchParams(bool);
        }
        Constructor<BranchParams> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BranchParams.class.getDeclaredConstructor(new Class[]{Boolean.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "BranchParams::class.java…his.constructorRef = it }");
        }
        BranchParams newInstance = constructor.newInstance(new Object[]{bool, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        BranchParams branchParams = (BranchParams) obj;
        C19383o.m32797g(wVar, "writer");
        if (branchParams != null) {
            wVar.mo68522b();
            wVar.mo68529h("+match_guaranteed");
            this.nullableBooleanAdapter.toJson(wVar, branchParams.f19029a);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(BranchParams)";
    }
}
