package com.etsy.android.search.savedsearch;

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

public final class SignUpEmailRequestBodyJsonAdapter extends JsonAdapter<SignUpEmailRequestBody> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SignUpEmailRequestBody> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("campaign_slugs", "subscribe");

    public SignUpEmailRequestBodyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfStringAdapter = yVar.mo68558c(d, emptySet, "campaignSlugs");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "subscribe");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("campaignSlugs", "campaign_slugs", jsonReader);
                }
            } else if (Q == 1) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("subscribe", "subscribe", jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new SignUpEmailRequestBody(list, bool.booleanValue());
        }
        Constructor<SignUpEmailRequestBody> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SignUpEmailRequestBody.class.getDeclaredConstructor(new Class[]{List.class, Boolean.TYPE, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SignUpEmailRequestBody::…his.constructorRef = it }");
        }
        SignUpEmailRequestBody newInstance = constructor.newInstance(new Object[]{list, bool, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SignUpEmailRequestBody signUpEmailRequestBody = (SignUpEmailRequestBody) obj;
        C19383o.m32797g(wVar, "writer");
        if (signUpEmailRequestBody != null) {
            wVar.mo68522b();
            wVar.mo68529h("campaign_slugs");
            this.listOfStringAdapter.toJson(wVar, signUpEmailRequestBody.f19807a);
            wVar.mo68529h("subscribe");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(signUpEmailRequestBody.f19808b));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SignUpEmailRequestBody)";
    }
}
