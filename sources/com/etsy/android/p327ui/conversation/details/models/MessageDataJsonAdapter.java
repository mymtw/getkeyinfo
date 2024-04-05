package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.MessageDataJsonAdapter */
public final class MessageDataJsonAdapter extends JsonAdapter<MessageData> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Message>> listOfMessageAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("older_cursor", "newer_cursor", ResponseConstants.MESSAGES);

    public MessageDataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "olderCursor");
        this.listOfMessageAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Message.class), emptySet, ResponseConstants.MESSAGES);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        Long l = null;
        Long l2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                l2 = this.nullableLongAdapter.fromJson(jsonReader);
            } else if (Q == 2 && (list = this.listOfMessageAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new MessageData(l, l2, list);
        }
        throw C18215a.m30728g(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
    }

    public final void toJson(C17412w wVar, Object obj) {
        MessageData messageData = (MessageData) obj;
        C19383o.m32797g(wVar, "writer");
        if (messageData != null) {
            wVar.mo68522b();
            wVar.mo68529h("older_cursor");
            this.nullableLongAdapter.toJson(wVar, messageData.f21210a);
            wVar.mo68529h("newer_cursor");
            this.nullableLongAdapter.toJson(wVar, messageData.f21211b);
            wVar.mo68529h(ResponseConstants.MESSAGES);
            this.listOfMessageAdapter.toJson(wVar, messageData.f21212c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(MessageData)";
    }
}
