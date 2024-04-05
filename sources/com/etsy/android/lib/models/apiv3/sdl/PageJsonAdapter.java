package com.etsy.android.lib.models.apiv3.sdl;

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

public final class PageJsonAdapter extends JsonAdapter<Page> {
    public static final int $stable = 8;
    private volatile Constructor<Page> constructorRef;
    private final JsonAdapter<List<ListSection>> listOfListSectionAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LIST);

    public PageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfListSectionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ListSection.class), EmptySet.INSTANCE, ResponseConstants.LIST);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Page)";
    }

    public Page fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfListSectionAdapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m(ResponseConstants.LIST, ResponseConstants.LIST, jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.apiv3.sdl.ListSection>");
            return new Page(list);
        }
        Constructor<Page> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Page.class.getDeclaredConstructor(new Class[]{List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Page::class.java.getDecl…his.constructorRef = it }");
        }
        Page newInstance = constructor.newInstance(new Object[]{list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Page page) {
        C19383o.m32797g(wVar, "writer");
        if (page != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LIST);
            this.listOfListSectionAdapter.toJson(wVar, page.getList());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
