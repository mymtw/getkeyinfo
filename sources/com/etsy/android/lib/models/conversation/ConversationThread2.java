package com.etsy.android.lib.models.conversation;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Conversation3;
import com.etsy.android.lib.models.ConversationMessage2;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ConversationThread2 {
    public static final int $stable = 8;
    private final Conversation3 conversation;
    private final List<ConversationMessage2> messages;

    public ConversationThread2(@C17402n(name = "convo") Conversation3 conversation3, @C17402n(name = "messages") List<ConversationMessage2> list) {
        C19383o.m32797g(conversation3, "conversation");
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        this.conversation = conversation3;
        this.messages = list;
    }

    public static /* synthetic */ ConversationThread2 copy$default(ConversationThread2 conversationThread2, Conversation3 conversation3, List<ConversationMessage2> list, int i, Object obj) {
        if ((i & 1) != 0) {
            conversation3 = conversationThread2.conversation;
        }
        if ((i & 2) != 0) {
            list = conversationThread2.messages;
        }
        return conversationThread2.copy(conversation3, list);
    }

    public final Conversation3 component1() {
        return this.conversation;
    }

    public final List<ConversationMessage2> component2() {
        return this.messages;
    }

    public final ConversationThread2 copy(@C17402n(name = "convo") Conversation3 conversation3, @C17402n(name = "messages") List<ConversationMessage2> list) {
        C19383o.m32797g(conversation3, "conversation");
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        return new ConversationThread2(conversation3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationThread2)) {
            return false;
        }
        ConversationThread2 conversationThread2 = (ConversationThread2) obj;
        return C19383o.m32792b(this.conversation, conversationThread2.conversation) && C19383o.m32792b(this.messages, conversationThread2.messages);
    }

    public final Conversation3 getConversation() {
        return this.conversation;
    }

    public final List<ConversationMessage2> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + (this.conversation.hashCode() * 31);
    }

    public final boolean isRead() {
        return this.conversation.getRead();
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationThread2(conversation=");
        h.append(this.conversation);
        h.append(", messages=");
        return C0070b.m186i(h, this.messages, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationThread2(Conversation3 conversation3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversation3, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
