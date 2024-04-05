package com.etsy.android.lib.models.loggers;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class EpochJsonAdapter extends JsonAdapter<Epoch> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("server_epoch");

    public EpochJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.longAdapter = yVar.mo68558c(Long.TYPE, EmptySet.INSTANCE, "serverTime");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Epoch)";
    }

    public Epoch fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (l = this.longAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("serverTime", "server_epoch", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            return new Epoch(l.longValue());
        }
        throw C18215a.m30728g("serverTime", "server_epoch", jsonReader);
    }

    public void toJson(C17412w wVar, Epoch epoch) {
        C19383o.m32797g(wVar, "writer");
        if (epoch != null) {
            wVar.mo68522b();
            wVar.mo68529h("server_epoch");
            this.longAdapter.toJson(wVar, Long.valueOf(epoch.getServerTime()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
