package com.etsy.android.lib.models.apiv3;

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

public final class CollectionsUpdateResponseJsonAdapter extends JsonAdapter<CollectionsUpdateResponse> {
    public static final int $stable = 8;
    private volatile Constructor<CollectionsUpdateResponse> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("social_invites_flag", "failed_collection_keys");

    public CollectionsUpdateResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "socialInvitesFlag");
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, String.class), emptySet, "failedCollectionKeys");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CollectionsUpdateResponse)";
    }

    public CollectionsUpdateResponse fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Boolean bool = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new CollectionsUpdateResponse(bool, list);
        }
        Constructor<CollectionsUpdateResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CollectionsUpdateResponse.class.getDeclaredConstructor(new Class[]{Boolean.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "CollectionsUpdateRespons…his.constructorRef = it }");
        }
        CollectionsUpdateResponse newInstance = constructor.newInstance(new Object[]{bool, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, CollectionsUpdateResponse collectionsUpdateResponse) {
        C19383o.m32797g(wVar, "writer");
        if (collectionsUpdateResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("social_invites_flag");
            this.nullableBooleanAdapter.toJson(wVar, collectionsUpdateResponse.getSocialInvitesFlag());
            wVar.mo68529h("failed_collection_keys");
            this.nullableListOfStringAdapter.toJson(wVar, collectionsUpdateResponse.getFailedCollectionKeys());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
