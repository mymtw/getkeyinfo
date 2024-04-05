package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class IANMessageCardJsonAdapter extends JsonAdapter<IANMessageCard> {
    public static final int $stable = 8;
    private volatile Constructor<IANMessageCard> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", ResponseConstants.SUB_TITLE, ResponseConstants.IMAGE, ResponseConstants.LINK_TITLE, ResponseConstants.DEEP_LINK_URL);

    public IANMessageCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "title");
    }

    public String toString() {
        return "GeneratedJsonAdapter(IANMessageCard)";
    }

    public IANMessageCard fromJson(JsonReader jsonReader) {
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
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new IANMessageCard(str, str2, str3, str4, str5);
        }
        Constructor<IANMessageCard> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = IANMessageCard.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "IANMessageCard::class.ja…his.constructorRef = it }");
        }
        IANMessageCard newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, IANMessageCard iANMessageCard) {
        C19383o.m32797g(wVar, "writer");
        if (iANMessageCard != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, iANMessageCard.getTitle());
            wVar.mo68529h(ResponseConstants.SUB_TITLE);
            this.nullableStringAdapter.toJson(wVar, iANMessageCard.getSubtitle());
            wVar.mo68529h(ResponseConstants.IMAGE);
            this.nullableStringAdapter.toJson(wVar, iANMessageCard.getImageName());
            wVar.mo68529h(ResponseConstants.LINK_TITLE);
            this.nullableStringAdapter.toJson(wVar, iANMessageCard.getLinkTitle());
            wVar.mo68529h(ResponseConstants.DEEP_LINK_URL);
            this.nullableStringAdapter.toJson(wVar, iANMessageCard.getDeepLinkUrl());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
