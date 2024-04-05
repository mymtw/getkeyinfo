package com.etsy.android.lib.models.conversation;

import com.etsy.android.lib.models.Conversation3;
import com.etsy.android.lib.models.ConversationMessage2;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ConversationThread2JsonAdapter extends JsonAdapter<ConversationThread2> {
    public static final int $stable = 8;
    private volatile Constructor<ConversationThread2> constructorRef;
    private final JsonAdapter<Conversation3> conversation3Adapter;
    private final JsonAdapter<List<ConversationMessage2>> listOfConversationMessage2Adapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CONVO, ResponseConstants.MESSAGES);

    public ConversationThread2JsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.conversation3Adapter = yVar.mo68558c(Conversation3.class, emptySet, "conversation");
        this.listOfConversationMessage2Adapter = yVar.mo68558c(C17387a0.m29126d(List.class, ConversationMessage2.class), emptySet, ResponseConstants.MESSAGES);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ConversationThread2)";
    }

    public ConversationThread2 fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Conversation3 conversation3 = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                conversation3 = this.conversation3Adapter.fromJson(jsonReader);
                if (conversation3 == null) {
                    throw C18215a.m30734m("conversation", ResponseConstants.CONVO, jsonReader);
                }
            } else if (Q == 1) {
                list = this.listOfConversationMessage2Adapter.fromJson(jsonReader);
                if (list != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m(ResponseConstants.MESSAGES, ResponseConstants.MESSAGES, jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i != -3) {
            Constructor<ConversationThread2> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ConversationThread2.class.getDeclaredConstructor(new Class[]{Conversation3.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ConversationThread2::cla…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            if (conversation3 != null) {
                objArr[0] = conversation3;
                objArr[1] = list;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                ConversationThread2 newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("conversation", ResponseConstants.CONVO, jsonReader);
        } else if (conversation3 != null) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.ConversationMessage2>");
            return new ConversationThread2(conversation3, list);
        } else {
            throw C18215a.m30728g("conversation", ResponseConstants.CONVO, jsonReader);
        }
    }

    public void toJson(C17412w wVar, ConversationThread2 conversationThread2) {
        C19383o.m32797g(wVar, "writer");
        if (conversationThread2 != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CONVO);
            this.conversation3Adapter.toJson(wVar, conversationThread2.getConversation());
            wVar.mo68529h(ResponseConstants.MESSAGES);
            this.listOfConversationMessage2Adapter.toJson(wVar, conversationThread2.getMessages());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
