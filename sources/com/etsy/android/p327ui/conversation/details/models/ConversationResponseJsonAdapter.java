package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.conversation.ConversationThread2;
import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.ConversationResponseJsonAdapter */
public final class ConversationResponseJsonAdapter extends JsonAdapter<ConversationResponse> {
    public static final int $stable = 8;
    private final JsonAdapter<ConversationMetadata> conversationMetadataAdapter;
    private final JsonAdapter<MessageData> messageDataAdapter;
    private final JsonAdapter<ConversationThread2> nullableConversationThread2Adapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("conversation", "most_recent_legacy_conversation", "message_data");

    public ConversationResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.conversationMetadataAdapter = yVar.mo68558c(ConversationMetadata.class, emptySet, "conversation");
        this.nullableConversationThread2Adapter = yVar.mo68558c(ConversationThread2.class, emptySet, "legacyConversation");
        this.messageDataAdapter = yVar.mo68558c(MessageData.class, emptySet, "messageData");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        ConversationMetadata conversationMetadata = null;
        MessageData messageData = null;
        ConversationThread2 conversationThread2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                conversationMetadata = this.conversationMetadataAdapter.fromJson(jsonReader);
                if (conversationMetadata == null) {
                    throw C18215a.m30734m("conversation", "conversation", jsonReader);
                }
            } else if (Q == 1) {
                conversationThread2 = this.nullableConversationThread2Adapter.fromJson(jsonReader);
            } else if (Q == 2 && (messageData = this.messageDataAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("messageData", "message_data", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (conversationMetadata == null) {
            throw C18215a.m30728g("conversation", "conversation", jsonReader);
        } else if (messageData != null) {
            return new ConversationResponse(conversationMetadata, conversationThread2, messageData);
        } else {
            throw C18215a.m30728g("messageData", "message_data", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ConversationResponse conversationResponse = (ConversationResponse) obj;
        C19383o.m32797g(wVar, "writer");
        if (conversationResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("conversation");
            this.conversationMetadataAdapter.toJson(wVar, conversationResponse.f21172a);
            wVar.mo68529h("most_recent_legacy_conversation");
            this.nullableConversationThread2Adapter.toJson(wVar, conversationResponse.f21173b);
            wVar.mo68529h("message_data");
            this.messageDataAdapter.toJson(wVar, conversationResponse.f21174c);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ConversationResponse)";
    }
}
