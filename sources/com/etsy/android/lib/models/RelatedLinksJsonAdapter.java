package com.etsy.android.lib.models;

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

public final class RelatedLinksJsonAdapter extends JsonAdapter<RelatedLinks> {
    public static final int $stable = 8;
    private volatile Constructor<RelatedLinks> constructorRef;
    private final JsonAdapter<List<ShopRelatedLink>> nullableListOfNullableShopRelatedLinkAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("links");

    public RelatedLinksJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableListOfNullableShopRelatedLinkAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ShopRelatedLink.class), EmptySet.INSTANCE, "links");
    }

    public String toString() {
        return "GeneratedJsonAdapter(RelatedLinks)";
    }

    public RelatedLinks fromJson(JsonReader jsonReader) {
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
                list = this.nullableListOfNullableShopRelatedLinkAdapter.fromJson(jsonReader);
                i &= -2;
            }
        }
        jsonReader.mo68413e();
        if (i == -2) {
            return new RelatedLinks(list);
        }
        Constructor<RelatedLinks> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RelatedLinks.class.getDeclaredConstructor(new Class[]{List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "RelatedLinks::class.java…his.constructorRef = it }");
        }
        RelatedLinks newInstance = constructor.newInstance(new Object[]{list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, RelatedLinks relatedLinks) {
        C19383o.m32797g(wVar, "writer");
        if (relatedLinks != null) {
            wVar.mo68522b();
            wVar.mo68529h("links");
            this.nullableListOfNullableShopRelatedLinkAdapter.toJson(wVar, relatedLinks.getLinks());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
