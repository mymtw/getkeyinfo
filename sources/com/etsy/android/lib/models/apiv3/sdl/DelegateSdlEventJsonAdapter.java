package com.etsy.android.lib.models.apiv3.sdl;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class DelegateSdlEventJsonAdapter extends JsonAdapter<DelegateSdlEvent> {
    public static final int $stable = 8;
    private volatile Constructor<DelegateSdlEvent> constructorRef;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("client_event_name", "client_event_trigger", "client_event_properties");
    private final JsonAdapter<String> stringAdapter;

    public DelegateSdlEventJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "clientEventName");
        this.nullableMapOfStringAnyAdapter = yVar.mo68558c(C17387a0.m29126d(Map.class, cls, Object.class), emptySet, "clientEventProperties");
    }

    public String toString() {
        return "GeneratedJsonAdapter(DelegateSdlEvent)";
    }

    public DelegateSdlEvent fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        Map map = null;
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
                    throw C18215a.m30734m("clientEventName", "client_event_name", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("clientEventTrigger", "client_event_trigger", jsonReader);
                }
            } else if (Q == 2) {
                map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            return new DelegateSdlEvent(str, str2, map);
        }
        Constructor<DelegateSdlEvent> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DelegateSdlEvent.class.getDeclaredConstructor(new Class[]{cls, cls, Map.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "DelegateSdlEvent::class.…his.constructorRef = it }");
        }
        DelegateSdlEvent newInstance = constructor.newInstance(new Object[]{str, str2, map, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, DelegateSdlEvent delegateSdlEvent) {
        C19383o.m32797g(wVar, "writer");
        if (delegateSdlEvent != null) {
            wVar.mo68522b();
            wVar.mo68529h("client_event_name");
            this.stringAdapter.toJson(wVar, delegateSdlEvent.getClientEventName());
            wVar.mo68529h("client_event_trigger");
            this.stringAdapter.toJson(wVar, delegateSdlEvent.getClientEventTrigger());
            wVar.mo68529h("client_event_properties");
            this.nullableMapOfStringAnyAdapter.toJson(wVar, delegateSdlEvent.getClientEventProperties());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
