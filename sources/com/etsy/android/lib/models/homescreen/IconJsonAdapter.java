package com.etsy.android.lib.models.homescreen;

import com.etsy.android.lib.models.Listing;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class IconJsonAdapter extends JsonAdapter<Icon> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("active", Listing.INACTIVE_STATE);
    private final JsonAdapter<String> stringAdapter;

    public IconJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "active");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Icon)";
    }

    public Icon fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("active", "active", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(Listing.INACTIVE_STATE, Listing.INACTIVE_STATE, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("active", "active", jsonReader);
        } else if (str2 != null) {
            return new Icon(str, str2);
        } else {
            throw C18215a.m30728g(Listing.INACTIVE_STATE, Listing.INACTIVE_STATE, jsonReader);
        }
    }

    public void toJson(C17412w wVar, Icon icon) {
        C19383o.m32797g(wVar, "writer");
        if (icon != null) {
            wVar.mo68522b();
            wVar.mo68529h("active");
            this.stringAdapter.toJson(wVar, icon.getActive());
            wVar.mo68529h(Listing.INACTIVE_STATE);
            this.stringAdapter.toJson(wVar, icon.getInactive());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
