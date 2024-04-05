package com.etsy.android.lib.requests.apiv3.timezone;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class TimeZoneUpdateRequestJsonAdapter extends JsonAdapter<TimeZoneUpdateRequest> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("timezone");
    private final JsonAdapter<String> stringAdapter;

    public TimeZoneUpdateRequestJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "timeZone");
    }

    public String toString() {
        return "GeneratedJsonAdapter(TimeZoneUpdateRequest)";
    }

    public TimeZoneUpdateRequest fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("timeZone", "timezone", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str != null) {
            return new TimeZoneUpdateRequest(str);
        }
        throw C18215a.m30728g("timeZone", "timezone", jsonReader);
    }

    public void toJson(C17412w wVar, TimeZoneUpdateRequest timeZoneUpdateRequest) {
        C19383o.m32797g(wVar, "writer");
        if (timeZoneUpdateRequest != null) {
            wVar.mo68522b();
            wVar.mo68529h("timezone");
            this.stringAdapter.toJson(wVar, timeZoneUpdateRequest.getTimeZone());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
