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

public final class ServerDrivenActionJsonAdapter extends JsonAdapter<ServerDrivenAction> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ServerDrivenAction> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.METHOD, ResponseConstants.PATH, ResponseConstants.AUTH_NEEDED, ResponseConstants.REFRESH_NEEDED, ResponseConstants.DISPLAY_NAME, ResponseConstants.BODY_PARAMS, ResponseConstants.ICON, "type", ResponseConstants.DEEP_LINK_URL);
    private final JsonAdapter<String> stringAdapter;

    public ServerDrivenActionJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "requestMethod");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "authNeeded");
        this.listOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "bodyParams");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ServerDrivenAction)";
    }

    public ServerDrivenAction fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        Boolean bool2 = bool;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("requestMethod", ResponseConstants.METHOD, jsonReader2);
                    }
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.PATH, ResponseConstants.PATH, jsonReader2);
                    }
                case 2:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("authNeeded", ResponseConstants.AUTH_NEEDED, jsonReader2);
                    }
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("refreshNeeded", ResponseConstants.REFRESH_NEEDED, jsonReader2);
                    }
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader2);
                    if (str4 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.DISPLAY_NAME, jsonReader2);
                    }
                case 5:
                    list = this.listOfStringAdapter.fromJson(jsonReader2);
                    if (list != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("bodyParams", ResponseConstants.BODY_PARAMS, jsonReader2);
                    }
                case 6:
                    str5 = this.stringAdapter.fromJson(jsonReader2);
                    if (str5 != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.ICON, ResponseConstants.ICON, jsonReader2);
                    }
                case 7:
                    str6 = this.stringAdapter.fromJson(jsonReader2);
                    if (str6 != null) {
                        i &= -129;
                        break;
                    } else {
                        throw C18215a.m30734m("type", "type", jsonReader2);
                    }
                case 8:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i &= -257;
                        break;
                    } else {
                        throw C18215a.m30734m("deepLink", ResponseConstants.DEEP_LINK_URL, jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -512) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            C19383o.m32795e(str4, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            C19383o.m32795e(str5, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str6, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            return new ServerDrivenAction(str, str2, booleanValue, booleanValue2, str4, list, str5, str6, str3);
        }
        String str7 = str3;
        Constructor<ServerDrivenAction> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls2 = Boolean.TYPE;
            constructor = ServerDrivenAction.class.getDeclaredConstructor(new Class[]{cls, cls, cls2, cls2, cls, List.class, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ServerDrivenAction::clas…his.constructorRef = it }");
        }
        ServerDrivenAction newInstance = constructor.newInstance(new Object[]{str, str2, bool, bool2, str4, list, str5, str6, str7, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ServerDrivenAction serverDrivenAction) {
        C19383o.m32797g(wVar, "writer");
        if (serverDrivenAction != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.METHOD);
            this.stringAdapter.toJson(wVar, serverDrivenAction.getRequestMethod());
            wVar.mo68529h(ResponseConstants.PATH);
            this.stringAdapter.toJson(wVar, serverDrivenAction.getPath());
            wVar.mo68529h(ResponseConstants.AUTH_NEEDED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(serverDrivenAction.getAuthNeeded()));
            wVar.mo68529h(ResponseConstants.REFRESH_NEEDED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(serverDrivenAction.getRefreshNeeded()));
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.stringAdapter.toJson(wVar, serverDrivenAction.getDisplayName());
            wVar.mo68529h(ResponseConstants.BODY_PARAMS);
            this.listOfStringAdapter.toJson(wVar, serverDrivenAction.getBodyParams());
            wVar.mo68529h(ResponseConstants.ICON);
            this.stringAdapter.toJson(wVar, serverDrivenAction.getIcon());
            wVar.mo68529h("type");
            this.stringAdapter.toJson(wVar, serverDrivenAction.getType());
            wVar.mo68529h(ResponseConstants.DEEP_LINK_URL);
            this.stringAdapter.toJson(wVar, serverDrivenAction.getDeepLink());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
