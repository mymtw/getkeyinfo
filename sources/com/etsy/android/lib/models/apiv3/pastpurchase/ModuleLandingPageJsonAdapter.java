package com.etsy.android.lib.models.apiv3.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ModuleLandingPageJsonAdapter extends JsonAdapter<ModuleLandingPage> {
    public static final int $stable = 8;
    private volatile Constructor<ModuleLandingPage> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LINK_TITLE, ResponseConstants.API_PATH, "title", ResponseConstants.EVENT_NAME);
    private final JsonAdapter<String> stringAdapter;

    public ModuleLandingPageJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "linkTitle");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "linkLandingTitle");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ModuleLandingPage)";
    }

    public ModuleLandingPage fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader2);
                if (str == null) {
                    throw C18215a.m30734m("linkTitle", ResponseConstants.LINK_TITLE, jsonReader2);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader2);
                if (str2 == null) {
                    throw C18215a.m30734m("apiPath", ResponseConstants.API_PATH, jsonReader2);
                }
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i != -13) {
            Constructor<ModuleLandingPage> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ModuleLandingPage.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ModuleLandingPage::class…his.constructorRef = it }");
            }
            Object[] objArr = new Object[6];
            if (str != null) {
                objArr[0] = str;
                if (str2 != null) {
                    objArr[1] = str2;
                    objArr[2] = str3;
                    objArr[3] = str4;
                    objArr[4] = Integer.valueOf(i);
                    objArr[5] = null;
                    ModuleLandingPage newInstance = constructor.newInstance(objArr);
                    C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                throw C18215a.m30728g("apiPath", ResponseConstants.API_PATH, jsonReader2);
            }
            throw C18215a.m30728g("linkTitle", ResponseConstants.LINK_TITLE, jsonReader2);
        } else if (str == null) {
            throw C18215a.m30728g("linkTitle", ResponseConstants.LINK_TITLE, jsonReader2);
        } else if (str2 != null) {
            return new ModuleLandingPage(str, str2, str3, str4);
        } else {
            throw C18215a.m30728g("apiPath", ResponseConstants.API_PATH, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ModuleLandingPage moduleLandingPage) {
        C19383o.m32797g(wVar, "writer");
        if (moduleLandingPage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LINK_TITLE);
            this.stringAdapter.toJson(wVar, moduleLandingPage.getLinkTitle());
            wVar.mo68529h(ResponseConstants.API_PATH);
            this.stringAdapter.toJson(wVar, moduleLandingPage.getApiPath());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, moduleLandingPage.getLinkLandingTitle());
            wVar.mo68529h(ResponseConstants.EVENT_NAME);
            this.nullableStringAdapter.toJson(wVar, moduleLandingPage.getEventName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
