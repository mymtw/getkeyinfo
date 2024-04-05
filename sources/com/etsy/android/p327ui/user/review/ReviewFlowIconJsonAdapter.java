package com.etsy.android.p327ui.user.review;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowIconJsonAdapter */
public final class ReviewFlowIconJsonAdapter extends JsonAdapter<ReviewFlowIcon> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("icon_type", "icon_text");
    private final JsonAdapter<String> stringAdapter;

    public ReviewFlowIconJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "iconRes");
    }

    public final Object fromJson(JsonReader jsonReader) {
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
                    throw C18215a.m30734m("iconRes", "icon_type", jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("iconText", "icon_text", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("iconRes", "icon_type", jsonReader);
        } else if (str2 != null) {
            return new ReviewFlowIcon(str, str2);
        } else {
            throw C18215a.m30728g("iconText", "icon_text", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowIcon reviewFlowIcon = (ReviewFlowIcon) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowIcon != null) {
            wVar.mo68522b();
            wVar.mo68529h("icon_type");
            this.stringAdapter.toJson(wVar, reviewFlowIcon.f25993a);
            wVar.mo68529h("icon_text");
            this.stringAdapter.toJson(wVar, reviewFlowIcon.f25994b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowIcon)";
    }
}
