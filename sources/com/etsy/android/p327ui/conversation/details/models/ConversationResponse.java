package com.etsy.android.p327ui.conversation.details.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.conversation.ConversationThread2;
import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.conversation.details.models.ConversationResponse */
public final class ConversationResponse {

    /* renamed from: a */
    public final ConversationMetadata f21172a;

    /* renamed from: b */
    public final ConversationThread2 f21173b;

    /* renamed from: c */
    public final MessageData f21174c;

    public ConversationResponse(@C17402n(name = "conversation") ConversationMetadata conversationMetadata, @C17402n(name = "most_recent_legacy_conversation") ConversationThread2 conversationThread2, @C17402n(name = "message_data") MessageData messageData) {
        C19383o.m32797g(conversationMetadata, "conversation");
        C19383o.m32797g(messageData, "messageData");
        this.f21172a = conversationMetadata;
        this.f21173b = conversationThread2;
        this.f21174c = messageData;
    }

    public final ConversationResponse copy(@C17402n(name = "conversation") ConversationMetadata conversationMetadata, @C17402n(name = "most_recent_legacy_conversation") ConversationThread2 conversationThread2, @C17402n(name = "message_data") MessageData messageData) {
        C19383o.m32797g(conversationMetadata, "conversation");
        C19383o.m32797g(messageData, "messageData");
        return new ConversationResponse(conversationMetadata, conversationThread2, messageData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationResponse)) {
            return false;
        }
        ConversationResponse conversationResponse = (ConversationResponse) obj;
        return C19383o.m32792b(this.f21172a, conversationResponse.f21172a) && C19383o.m32792b(this.f21173b, conversationResponse.f21173b) && C19383o.m32792b(this.f21174c, conversationResponse.f21174c);
    }

    public final int hashCode() {
        int hashCode = this.f21172a.hashCode() * 31;
        ConversationThread2 conversationThread2 = this.f21173b;
        return this.f21174c.hashCode() + ((hashCode + (conversationThread2 == null ? 0 : conversationThread2.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationResponse(conversation=");
        h.append(this.f21172a);
        h.append(", legacyConversation=");
        h.append(this.f21173b);
        h.append(", messageData=");
        h.append(this.f21174c);
        h.append(')');
        return h.toString();
    }
}
