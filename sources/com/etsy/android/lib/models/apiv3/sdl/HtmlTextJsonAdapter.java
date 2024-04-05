package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class HtmlTextJsonAdapter extends JsonAdapter<HtmlText> {
    public static final int $stable = 8;
    private volatile Constructor<HtmlText> constructorRef;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("text", ResponseConstants.ALIGNMENT);
    private final JsonAdapter<String> stringAdapter;

    public HtmlTextJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "text");
    }

    public String toString() {
        return "GeneratedJsonAdapter(HtmlText)";
    }

    public HtmlText fromJson(JsonReader jsonReader) {
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("text", "text", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m(ResponseConstants.ALIGNMENT, ResponseConstants.ALIGNMENT, jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            return new HtmlText(str, str2);
        }
        Constructor<HtmlText> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HtmlText.class.getDeclaredConstructor(new Class[]{cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "HtmlText::class.java.get…his.constructorRef = it }");
        }
        HtmlText newInstance = constructor.newInstance(new Object[]{str, str2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, HtmlText htmlText) {
        C19383o.m32797g(wVar, "writer");
        if (htmlText != null) {
            wVar.mo68522b();
            wVar.mo68529h("text");
            this.stringAdapter.toJson(wVar, htmlText.getText());
            wVar.mo68529h(ResponseConstants.ALIGNMENT);
            this.stringAdapter.toJson(wVar, htmlText.getAlignment());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
