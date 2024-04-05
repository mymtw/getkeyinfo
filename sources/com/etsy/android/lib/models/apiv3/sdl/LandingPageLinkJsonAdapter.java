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

public final class LandingPageLinkJsonAdapter extends JsonAdapter<LandingPageLink> {
    public static final int $stable = 8;
    private volatile Constructor<LandingPageLink> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.API_PATH, ResponseConstants.LINK_TITLE, ResponseConstants.LAYOUT, ResponseConstants.PAGE_TYPE, ResponseConstants.PAGE_TITLE, ResponseConstants.EVENT_NAME, ResponseConstants.METHOD, ResponseConstants.DEEP_LINK);
    private final JsonAdapter<String> stringAdapter;

    public LandingPageLinkJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "apiPath");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "deepLink");
    }

    public String toString() {
        return "GeneratedJsonAdapter(LandingPageLink)";
    }

    public LandingPageLink fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                        throw C18215a.m30734m("apiPath", ResponseConstants.API_PATH, jsonReader2);
                    }
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("linkTitleField", ResponseConstants.LINK_TITLE, jsonReader2);
                    }
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("layoutField", ResponseConstants.LAYOUT, jsonReader2);
                    }
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader2);
                    if (str4 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("pageType", ResponseConstants.PAGE_TYPE, jsonReader2);
                    }
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader2);
                    if (str5 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("pageTitleField", ResponseConstants.PAGE_TITLE, jsonReader2);
                    }
                case 5:
                    str6 = this.stringAdapter.fromJson(jsonReader2);
                    if (str6 != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("eventNameField", ResponseConstants.EVENT_NAME, jsonReader2);
                    }
                case 6:
                    str7 = this.stringAdapter.fromJson(jsonReader2);
                    if (str7 != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("methodField", ResponseConstants.METHOD, jsonReader2);
                    }
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str4, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str5, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str6, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str7, "null cannot be cast to non-null type kotlin.String");
            return new LandingPageLink(str, str2, str3, str4, str5, str6, str7, str8);
        }
        Constructor<LandingPageLink> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LandingPageLink.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "LandingPageLink::class.j…his.constructorRef = it }");
        }
        LandingPageLink newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, LandingPageLink landingPageLink) {
        C19383o.m32797g(wVar, "writer");
        if (landingPageLink != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.API_PATH);
            this.stringAdapter.toJson(wVar, landingPageLink.getApiPath());
            wVar.mo68529h(ResponseConstants.LINK_TITLE);
            this.stringAdapter.toJson(wVar, landingPageLink.getLinkTitleField());
            wVar.mo68529h(ResponseConstants.LAYOUT);
            this.stringAdapter.toJson(wVar, landingPageLink.getLayoutField());
            wVar.mo68529h(ResponseConstants.PAGE_TYPE);
            this.stringAdapter.toJson(wVar, landingPageLink.getPageType());
            wVar.mo68529h(ResponseConstants.PAGE_TITLE);
            this.stringAdapter.toJson(wVar, landingPageLink.getPageTitleField());
            wVar.mo68529h(ResponseConstants.EVENT_NAME);
            this.stringAdapter.toJson(wVar, landingPageLink.getEventNameField());
            wVar.mo68529h(ResponseConstants.METHOD);
            this.stringAdapter.toJson(wVar, landingPageLink.getMethodField());
            wVar.mo68529h(ResponseConstants.DEEP_LINK);
            this.nullableStringAdapter.toJson(wVar, landingPageLink.getDeepLink());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
