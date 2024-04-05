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

public final class ServerDrivenResultJsonAdapter extends JsonAdapter<ServerDrivenResult> {
    public static final int $stable = 8;
    private volatile Constructor<ServerDrivenResult> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<ListSection> nullableListSectionAdapter;
    private final JsonAdapter<Page> nullablePageAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", "message", ResponseConstants.MESSAGES, ResponseConstants.LIST_SECTION, ResponseConstants.CONTENT);

    public ServerDrivenResultJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "type");
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.MESSAGES);
        this.nullableListSectionAdapter = yVar.mo68558c(ListSection.class, emptySet, "listSection");
        this.nullablePageAdapter = yVar.mo68558c(Page.class, emptySet, ResponseConstants.CONTENT);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ServerDrivenResult)";
    }

    public ServerDrivenResult fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        List list = null;
        ListSection listSection = null;
        Page page = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                listSection = this.nullableListSectionAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                page = this.nullablePageAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new ServerDrivenResult(str, str2, list, listSection, page);
        }
        Constructor<ServerDrivenResult> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ServerDrivenResult.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, ListSection.class, Page.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ServerDrivenResult::clas…his.constructorRef = it }");
        }
        ServerDrivenResult newInstance = constructor.newInstance(new Object[]{str, str2, list, listSection, page, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ServerDrivenResult serverDrivenResult) {
        C19383o.m32797g(wVar, "writer");
        if (serverDrivenResult != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, serverDrivenResult.getType());
            wVar.mo68529h("message");
            this.nullableStringAdapter.toJson(wVar, serverDrivenResult.getMessage());
            wVar.mo68529h(ResponseConstants.MESSAGES);
            this.nullableListOfStringAdapter.toJson(wVar, serverDrivenResult.getMessages());
            wVar.mo68529h(ResponseConstants.LIST_SECTION);
            this.nullableListSectionAdapter.toJson(wVar, serverDrivenResult.getListSection());
            wVar.mo68529h(ResponseConstants.CONTENT);
            this.nullablePageAdapter.toJson(wVar, serverDrivenResult.getContent());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
