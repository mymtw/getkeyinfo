package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image2;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class Image2_SourceJsonAdapter extends JsonAdapter<Image2.Source> {
    public static final int $stable = 8;
    private volatile Constructor<Image2.Source> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.WIDTH, ResponseConstants.HEIGHT, "url");
    private final JsonAdapter<String> stringAdapter;

    public Image2_SourceJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.WIDTH);
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "url");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Image2.Source)";
    }

    public Image2.Source fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        Integer num2 = num;
        int i = -1;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m(ResponseConstants.WIDTH, ResponseConstants.WIDTH, jsonReader2);
                }
            } else if (Q == 1) {
                num2 = this.intAdapter.fromJson(jsonReader2);
                if (num2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m(ResponseConstants.HEIGHT, ResponseConstants.HEIGHT, jsonReader2);
                }
            } else if (Q == 2 && (str = this.stringAdapter.fromJson(jsonReader2)) == null) {
                throw C18215a.m30734m("url", "url", jsonReader2);
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (str != null) {
                return new Image2.Source(intValue, intValue2, str);
            }
            throw C18215a.m30728g("url", "url", jsonReader2);
        }
        Constructor<Image2.Source> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = Image2.Source.class.getDeclaredConstructor(new Class[]{cls, cls, String.class, cls, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Image2.Source::class.jav…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        objArr[0] = num;
        objArr[1] = num2;
        if (str != null) {
            objArr[2] = str;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            Image2.Source newInstance = constructor.newInstance(objArr);
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw C18215a.m30728g("url", "url", jsonReader2);
    }

    public void toJson(C17412w wVar, Image2.Source source) {
        C19383o.m32797g(wVar, "writer");
        if (source != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.WIDTH);
            this.intAdapter.toJson(wVar, Integer.valueOf(source.getWidth()));
            wVar.mo68529h(ResponseConstants.HEIGHT);
            this.intAdapter.toJson(wVar, Integer.valueOf(source.getHeight()));
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, source.getUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
