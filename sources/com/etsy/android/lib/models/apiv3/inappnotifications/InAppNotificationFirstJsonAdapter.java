package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class InAppNotificationFirstJsonAdapter extends JsonAdapter<InAppNotificationFirst> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_text", "notification_subtext", "read");

    public InAppNotificationFirstJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "text");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationFirst)";
    }

    public InAppNotificationFirst fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 2 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("isRead", "read", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (bool != null) {
            return new InAppNotificationFirst(str, str2, bool.booleanValue());
        }
        throw C18215a.m30728g("isRead", "read", jsonReader);
    }

    public void toJson(C17412w wVar, InAppNotificationFirst inAppNotificationFirst) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationFirst != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_text");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationFirst.getText());
            wVar.mo68529h("notification_subtext");
            this.nullableStringAdapter.toJson(wVar, inAppNotificationFirst.getSubtext());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationFirst.isRead()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
