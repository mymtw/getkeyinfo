package com.etsy.android.lib.models.language;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class EtsyLanguageJsonAdapter extends JsonAdapter<EtsyLanguage> {
    public static final int $stable = 8;
    private volatile Constructor<EtsyLanguage> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CODE, "id", "name");

    public EtsyLanguageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.CODE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(EtsyLanguage)";
    }

    public EtsyLanguage fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new EtsyLanguage(str, str2, str3);
        }
        Constructor<EtsyLanguage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EtsyLanguage.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "EtsyLanguage::class.java…his.constructorRef = it }");
        }
        EtsyLanguage newInstance = constructor.newInstance(new Object[]{str, str2, str3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, EtsyLanguage etsyLanguage) {
        C19383o.m32797g(wVar, "writer");
        if (etsyLanguage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CODE);
            this.nullableStringAdapter.toJson(wVar, etsyLanguage.getCode());
            wVar.mo68529h("id");
            this.nullableStringAdapter.toJson(wVar, etsyLanguage.getId());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, etsyLanguage.getName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
