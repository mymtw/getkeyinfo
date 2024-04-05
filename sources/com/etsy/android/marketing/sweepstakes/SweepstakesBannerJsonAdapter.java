package com.etsy.android.marketing.sweepstakes;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SweepstakesBannerJsonAdapter extends JsonAdapter<SweepstakesBanner> {
    public static final int $stable = 8;
    private volatile Constructor<SweepstakesBanner> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", "description", ResponseConstants.ICON);
    private final JsonAdapter<String> stringAdapter;

    public SweepstakesBannerJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "title");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.ICON);
    }

    public final Object fromJson(JsonReader jsonReader) {
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
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("title", "title", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("description", "description", jsonReader);
                }
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            return new SweepstakesBanner(str, str2, str3);
        }
        Constructor<SweepstakesBanner> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SweepstakesBanner.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "SweepstakesBanner::class…his.constructorRef = it }");
        }
        SweepstakesBanner newInstance = constructor.newInstance(new Object[]{str, str2, str3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public final void toJson(C17412w wVar, Object obj) {
        SweepstakesBanner sweepstakesBanner = (SweepstakesBanner) obj;
        C19383o.m32797g(wVar, "writer");
        if (sweepstakesBanner != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, sweepstakesBanner.f19694a);
            wVar.mo68529h("description");
            this.stringAdapter.toJson(wVar, sweepstakesBanner.f19695b);
            wVar.mo68529h(ResponseConstants.ICON);
            this.nullableStringAdapter.toJson(wVar, sweepstakesBanner.f19696c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SweepstakesBanner)";
    }
}
