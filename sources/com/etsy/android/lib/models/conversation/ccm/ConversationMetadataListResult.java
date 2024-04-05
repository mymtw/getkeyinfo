package com.etsy.android.lib.models.conversation.ccm;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ConversationMetadataListResult {
    public static final int $stable = 8;
    private final List<ConversationMetadata> conversationMetaData;
    private final PageState pageState;

    public ConversationMetadataListResult(@C17402n(name = "page_state") PageState pageState2, @C17402n(name = "conversations") List<ConversationMetadata> list) {
        C19383o.m32797g(pageState2, "pageState");
        C19383o.m32797g(list, "conversationMetaData");
        this.pageState = pageState2;
        this.conversationMetaData = list;
    }

    public static /* synthetic */ ConversationMetadataListResult copy$default(ConversationMetadataListResult conversationMetadataListResult, PageState pageState2, List<ConversationMetadata> list, int i, Object obj) {
        if ((i & 1) != 0) {
            pageState2 = conversationMetadataListResult.pageState;
        }
        if ((i & 2) != 0) {
            list = conversationMetadataListResult.conversationMetaData;
        }
        return conversationMetadataListResult.copy(pageState2, list);
    }

    public final PageState component1() {
        return this.pageState;
    }

    public final List<ConversationMetadata> component2() {
        return this.conversationMetaData;
    }

    public final ConversationMetadataListResult copy(@C17402n(name = "page_state") PageState pageState2, @C17402n(name = "conversations") List<ConversationMetadata> list) {
        C19383o.m32797g(pageState2, "pageState");
        C19383o.m32797g(list, "conversationMetaData");
        return new ConversationMetadataListResult(pageState2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationMetadataListResult)) {
            return false;
        }
        ConversationMetadataListResult conversationMetadataListResult = (ConversationMetadataListResult) obj;
        return C19383o.m32792b(this.pageState, conversationMetadataListResult.pageState) && C19383o.m32792b(this.conversationMetaData, conversationMetadataListResult.conversationMetaData);
    }

    public final List<ConversationMetadata> getConversationMetaData() {
        return this.conversationMetaData;
    }

    public final PageState getPageState() {
        return this.pageState;
    }

    public int hashCode() {
        return this.conversationMetaData.hashCode() + (this.pageState.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationMetadataListResult(pageState=");
        h.append(this.pageState);
        h.append(", conversationMetaData=");
        return C0070b.m186i(h, this.conversationMetaData, ')');
    }
}
