package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListBodyJsonAdapter */
public final class AddToListBodyJsonAdapter extends JsonAdapter<AddToListBody> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Long>> nullableListOfNullableLongAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("name", ResponseConstants.LISTING_IDS, ResponseConstants.PRIVACY_LEVEL);
    private final JsonAdapter<String> stringAdapter;

    public AddToListBodyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.nullableListOfNullableLongAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Long.class), emptySet, ResponseConstants.LISTING_IDS);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("name", "name", jsonReader);
                }
            } else if (Q == 1) {
                list = this.nullableListOfNullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.PRIVACY_LEVEL, ResponseConstants.PRIVACY_LEVEL, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("name", "name", jsonReader);
        } else if (str2 != null) {
            return new AddToListBody(str, list, str2);
        } else {
            throw C18215a.m30728g(ResponseConstants.PRIVACY_LEVEL, ResponseConstants.PRIVACY_LEVEL, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        AddToListBody addToListBody = (AddToListBody) obj;
        C19383o.m32797g(wVar, "writer");
        if (addToListBody != null) {
            wVar.mo68522b();
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, addToListBody.f21548a);
            wVar.mo68529h(ResponseConstants.LISTING_IDS);
            this.nullableListOfNullableLongAdapter.toJson(wVar, addToListBody.f21549b);
            wVar.mo68529h(ResponseConstants.PRIVACY_LEVEL);
            this.stringAdapter.toJson(wVar, addToListBody.f21550c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AddToListBody)";
    }
}
