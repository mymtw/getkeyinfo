package com.etsy.android.p327ui.user.inappnotifications;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesFeedJsonAdapter */
public final class UpdatesFeedJsonAdapter extends JsonAdapter<UpdatesFeed> {
    public static final int $stable = 8;
    private final JsonAdapter<List<UpdatesGroup>> listOfUpdatesGroupAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "groups");
    private final JsonAdapter<String> stringAdapter;

    public UpdatesFeedJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "feedId");
        this.listOfUpdatesGroupAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, UpdatesGroup.class), emptySet, "groups");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("feedId", "notification_feed_id", jsonReader);
                }
            } else if (Q == 1 && (list = this.listOfUpdatesGroupAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("groups", "groups", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g("feedId", "notification_feed_id", jsonReader);
        } else if (list != null) {
            return new UpdatesFeed(str, list);
        } else {
            throw C18215a.m30728g("groups", "groups", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        UpdatesFeed updatesFeed = (UpdatesFeed) obj;
        C19383o.m32797g(wVar, "writer");
        if (updatesFeed != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, updatesFeed.f25525a);
            wVar.mo68529h("groups");
            this.listOfUpdatesGroupAdapter.toJson(wVar, updatesFeed.f25526b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UpdatesFeed)";
    }
}
