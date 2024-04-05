package com.etsy.android.lib.models.apiv3.pastpurchase;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ModulePlacementJsonAdapter extends JsonAdapter<ModulePlacement> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Module> moduleAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("index_placement", "module");

    public ModulePlacementJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "position");
        this.moduleAdapter = yVar.mo68558c(Module.class, emptySet, "module");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ModulePlacement)";
    }

    public ModulePlacement fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Module module = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("position", "index_placement", jsonReader);
                }
            } else if (Q == 1 && (module = this.moduleAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("module", "module", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            int intValue = num.intValue();
            if (module != null) {
                return new ModulePlacement(intValue, module);
            }
            throw C18215a.m30728g("module", "module", jsonReader);
        }
        throw C18215a.m30728g("position", "index_placement", jsonReader);
    }

    public void toJson(C17412w wVar, ModulePlacement modulePlacement) {
        C19383o.m32797g(wVar, "writer");
        if (modulePlacement != null) {
            wVar.mo68522b();
            wVar.mo68529h("index_placement");
            this.intAdapter.toJson(wVar, Integer.valueOf(modulePlacement.getPosition()));
            wVar.mo68529h("module");
            this.moduleAdapter.toJson(wVar, modulePlacement.getModule());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
