package com.etsy.android.lib.models.conversation.ccm;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ConversationMetadataListResultJsonAdapter extends JsonAdapter<ConversationMetadataListResult> {
    public static final int $stable = 8;
    private final JsonAdapter<List<ConversationMetadata>> listOfConversationMetadataAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("page_state", "conversations");
    private final JsonAdapter<PageState> pageStateAdapter;

    public ConversationMetadataListResultJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.pageStateAdapter = yVar.mo68558c(PageState.class, emptySet, "pageState");
        this.listOfConversationMetadataAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ConversationMetadata.class), emptySet, "conversationMetaData");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ConversationMetadataListResult)";
    }

    public ConversationMetadataListResult fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        PageState pageState = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                pageState = this.pageStateAdapter.fromJson(jsonReader);
                if (pageState == null) {
                    throw C18215a.m30734m("pageState", "page_state", jsonReader);
                }
            } else if (Q == 1 && (list = this.listOfConversationMetadataAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("conversationMetaData", "conversations", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (pageState == null) {
            throw C18215a.m30728g("pageState", "page_state", jsonReader);
        } else if (list != null) {
            return new ConversationMetadataListResult(pageState, list);
        } else {
            throw C18215a.m30728g("conversationMetaData", "conversations", jsonReader);
        }
    }

    public void toJson(C17412w wVar, ConversationMetadataListResult conversationMetadataListResult) {
        C19383o.m32797g(wVar, "writer");
        if (conversationMetadataListResult != null) {
            wVar.mo68522b();
            wVar.mo68529h("page_state");
            this.pageStateAdapter.toJson(wVar, conversationMetadataListResult.getPageState());
            wVar.mo68529h("conversations");
            this.listOfConversationMetadataAdapter.toJson(wVar, conversationMetadataListResult.getConversationMetaData());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
