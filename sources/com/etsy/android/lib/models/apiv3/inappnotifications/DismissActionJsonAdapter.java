package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class DismissActionJsonAdapter extends JsonAdapter<DismissAction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DismissAction> constructorRef;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("is_dismissible", ResponseConstants.API_PATH, "api_method");
    private final JsonAdapter<String> stringAdapter;

    public DismissActionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = yVar.mo68558c(cls, emptySet, "isDismissable");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "apiPathField");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DismissAction)";
    }

    public DismissAction fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
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
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("isDismissable", "is_dismissible", jsonReader);
                }
            } else if (Q == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("apiPathField", ResponseConstants.API_PATH, jsonReader);
                }
            } else if (Q == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("apiMethodField", "api_method", jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            boolean booleanValue = bool.booleanValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            return new DismissAction(booleanValue, str, str2);
        }
        Constructor<DismissAction> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DismissAction.class.getDeclaredConstructor(new Class[]{Boolean.TYPE, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "DismissAction::class.jav…his.constructorRef = it }");
        }
        DismissAction newInstance = constructor.newInstance(new Object[]{bool, str, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, DismissAction dismissAction) {
        C19383o.m32797g(wVar, "writer");
        if (dismissAction != null) {
            wVar.mo68522b();
            wVar.mo68529h("is_dismissible");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(dismissAction.isDismissable()));
            wVar.mo68529h(ResponseConstants.API_PATH);
            this.stringAdapter.toJson(wVar, dismissAction.getApiPathField());
            wVar.mo68529h("api_method");
            this.stringAdapter.toJson(wVar, dismissAction.getApiMethodField());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
