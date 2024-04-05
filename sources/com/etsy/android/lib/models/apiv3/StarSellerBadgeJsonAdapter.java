package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class StarSellerBadgeJsonAdapter extends JsonAdapter<StarSellerBadge> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.LABEL, "modal_title", ResponseConstants.INFO_MODAL_BODY, ResponseConstants.EVENT_NAME);
    private final JsonAdapter<String> stringAdapter;

    public StarSellerBadgeJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.LABEL);
    }

    public String toString() {
        return "GeneratedJsonAdapter(StarSellerBadge)";
    }

    public StarSellerBadge fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m(ResponseConstants.LABEL, ResponseConstants.LABEL, jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw C18215a.m30734m("modalTitle", "modal_title", jsonReader);
                }
            } else if (Q == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw C18215a.m30734m("modalBody", ResponseConstants.INFO_MODAL_BODY, jsonReader);
                }
            } else if (Q == 3 && (str4 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("eventName", ResponseConstants.EVENT_NAME, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g(ResponseConstants.LABEL, ResponseConstants.LABEL, jsonReader);
        } else if (str2 == null) {
            throw C18215a.m30728g("modalTitle", "modal_title", jsonReader);
        } else if (str3 == null) {
            throw C18215a.m30728g("modalBody", ResponseConstants.INFO_MODAL_BODY, jsonReader);
        } else if (str4 != null) {
            return new StarSellerBadge(str, str2, str3, str4);
        } else {
            throw C18215a.m30728g("eventName", ResponseConstants.EVENT_NAME, jsonReader);
        }
    }

    public void toJson(C17412w wVar, StarSellerBadge starSellerBadge) {
        C19383o.m32797g(wVar, "writer");
        if (starSellerBadge != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.LABEL);
            this.stringAdapter.toJson(wVar, starSellerBadge.getLabel());
            wVar.mo68529h("modal_title");
            this.stringAdapter.toJson(wVar, starSellerBadge.getModalTitle());
            wVar.mo68529h(ResponseConstants.INFO_MODAL_BODY);
            this.stringAdapter.toJson(wVar, starSellerBadge.getModalBody());
            wVar.mo68529h(ResponseConstants.EVENT_NAME);
            this.stringAdapter.toJson(wVar, starSellerBadge.getEventName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
