package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class IANTooltipsJsonAdapter extends JsonAdapter<IANTooltips> {
    public static final int $stable = 8;
    private final JsonAdapter<List<IANTooltip>> listOfIANTooltipAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("tooltips");

    public IANTooltipsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfIANTooltipAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, IANTooltip.class), EmptySet.INSTANCE, "tooltips");
    }

    public String toString() {
        return "GeneratedJsonAdapter(IANTooltips)";
    }

    public IANTooltips fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (list = this.listOfIANTooltipAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("tooltips", "tooltips", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new IANTooltips(list);
        }
        throw C18215a.m30728g("tooltips", "tooltips", jsonReader);
    }

    public void toJson(C17412w wVar, IANTooltips iANTooltips) {
        C19383o.m32797g(wVar, "writer");
        if (iANTooltips != null) {
            wVar.mo68522b();
            wVar.mo68529h("tooltips");
            this.listOfIANTooltipAdapter.toJson(wVar, iANTooltips.getTooltips());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
