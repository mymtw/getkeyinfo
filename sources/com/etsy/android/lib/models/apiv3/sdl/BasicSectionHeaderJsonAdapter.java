package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.vespa.IVespaListSectionHeader;
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

public final class BasicSectionHeaderJsonAdapter extends JsonAdapter<BasicSectionHeader> {
    public static final int $stable = 8;
    private volatile Constructor<BasicSectionHeader> constructorRef;
    private final JsonAdapter<LandingPageLink> nullableLandingPageLinkAdapter;
    private final JsonAdapter<List<IVespaListSectionHeader.Style>> nullableListOfStyleAdapter;
    private final JsonAdapter<ServerDrivenAction> nullableServerDrivenActionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", ResponseConstants.SUB_TITLE, ResponseConstants.VIEW_TYPE, ResponseConstants.ACTION, ResponseConstants.STYLES, "pageLinkField", "trackingNameField");
    private final JsonAdapter<String> stringAdapter;

    public BasicSectionHeaderJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "titleField");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "subtitleField");
        this.nullableServerDrivenActionAdapter = yVar.mo68558c(ServerDrivenAction.class, emptySet, ResponseConstants.ACTION);
        this.nullableListOfStyleAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IVespaListSectionHeader.Style.class), emptySet, ResponseConstants.STYLES);
        this.nullableLandingPageLinkAdapter = yVar.mo68558c(LandingPageLink.class, emptySet, "pageLinkField");
    }

    public String toString() {
        return "GeneratedJsonAdapter(BasicSectionHeader)";
    }

    public BasicSectionHeader fromJson(JsonReader jsonReader) {
        BasicSectionHeader basicSectionHeader;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        ServerDrivenAction serverDrivenAction = null;
        List list = null;
        boolean z = false;
        LandingPageLink landingPageLink = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("titleField", "title", jsonReader2);
                    }
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    serverDrivenAction = this.nullableServerDrivenActionAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    list = this.nullableListOfStyleAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    landingPageLink = this.nullableLandingPageLinkAdapter.fromJson(jsonReader2);
                    z = true;
                    break;
                case 6:
                    str4 = this.stringAdapter.fromJson(jsonReader2);
                    if (str4 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("trackingNameField", "trackingNameField", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i != -31) {
            Constructor<BasicSectionHeader> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = BasicSectionHeader.class.getDeclaredConstructor(new Class[]{cls, cls, cls, ServerDrivenAction.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "BasicSectionHeader::clas…his.constructorRef = it }");
            }
            Object[] objArr = new Object[7];
            if (str != null) {
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = str3;
                objArr[3] = serverDrivenAction;
                objArr[4] = list;
                objArr[5] = Integer.valueOf(i);
                objArr[6] = null;
                BasicSectionHeader newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                basicSectionHeader = newInstance;
            } else {
                throw C18215a.m30728g("titleField", "title", jsonReader);
            }
        } else if (str != null) {
            basicSectionHeader = new BasicSectionHeader(str, str2, str3, serverDrivenAction, list);
        } else {
            throw C18215a.m30728g("titleField", "title", jsonReader2);
        }
        if (z) {
            basicSectionHeader.setPageLinkField(landingPageLink);
        }
        if (str4 == null) {
            str4 = basicSectionHeader.getTrackingNameField();
        }
        basicSectionHeader.setTrackingNameField(str4);
        return basicSectionHeader;
    }

    public void toJson(C17412w wVar, BasicSectionHeader basicSectionHeader) {
        C19383o.m32797g(wVar, "writer");
        if (basicSectionHeader != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, basicSectionHeader.getTitleField());
            wVar.mo68529h(ResponseConstants.SUB_TITLE);
            this.nullableStringAdapter.toJson(wVar, basicSectionHeader.getSubtitleField());
            wVar.mo68529h(ResponseConstants.VIEW_TYPE);
            this.nullableStringAdapter.toJson(wVar, basicSectionHeader.getViewTitle());
            wVar.mo68529h(ResponseConstants.ACTION);
            this.nullableServerDrivenActionAdapter.toJson(wVar, basicSectionHeader.getAction());
            wVar.mo68529h(ResponseConstants.STYLES);
            this.nullableListOfStyleAdapter.toJson(wVar, basicSectionHeader.getStyles());
            wVar.mo68529h("pageLinkField");
            this.nullableLandingPageLinkAdapter.toJson(wVar, basicSectionHeader.getPageLinkField());
            wVar.mo68529h("trackingNameField");
            this.stringAdapter.toJson(wVar, basicSectionHeader.getTrackingNameField());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
