package com.etsy.android.lib.models.apiv3;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class NotificationTooltipJsonAdapter extends JsonAdapter<NotificationTooltip> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("request_in_milliseconds", "display_interval_days");

    public NotificationTooltipJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, EmptySet.INSTANCE, "requestInMillis");
    }

    public String toString() {
        return "GeneratedJsonAdapter(NotificationTooltip)";
    }

    public NotificationTooltip fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("requestInMillis", "request_in_milliseconds", jsonReader);
                }
            } else if (Q == 1 && (num2 = this.intAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("displayIntervalDays", "display_interval_days", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new NotificationTooltip(intValue, num2.intValue());
            }
            throw C18215a.m30728g("displayIntervalDays", "display_interval_days", jsonReader);
        }
        throw C18215a.m30728g("requestInMillis", "request_in_milliseconds", jsonReader);
    }

    public void toJson(C17412w wVar, NotificationTooltip notificationTooltip) {
        C19383o.m32797g(wVar, "writer");
        if (notificationTooltip != null) {
            wVar.mo68522b();
            wVar.mo68529h("request_in_milliseconds");
            this.intAdapter.toJson(wVar, Integer.valueOf(notificationTooltip.getRequestInMillis()));
            wVar.mo68529h("display_interval_days");
            this.intAdapter.toJson(wVar, Integer.valueOf(notificationTooltip.getDisplayIntervalDays()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
