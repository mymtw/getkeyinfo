package com.etsy.android.lib.models.conversation.ccm;

import com.etsy.android.lib.models.ConversationUser;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ConversationMetadataJsonAdapter extends JsonAdapter<ConversationMetadata> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ConversationMetadata> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Alert> nullableAlertAdapter;
    private final JsonAdapter<ConversationUser> nullableConversationUserAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("messenger_conversation_id", ResponseConstants.MESSAGE_COUNT, ResponseConstants.IS_READ, ResponseConstants.OTHER_USER, ResponseConstants.LAST_MESSAGE_DATE, "last_message_excerpt", ResponseConstants.HAS_ATTACHMENTS, "alert");
    private final JsonAdapter<String> stringAdapter;

    public ConversationMetadataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "conversationId");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "messageCount");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "read");
        this.nullableConversationUserAdapter = yVar.mo68558c(ConversationUser.class, emptySet, "otherUser");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "lastMessage");
        this.nullableAlertAdapter = yVar.mo68558c(Alert.class, emptySet, "alert");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ConversationMetadata)";
    }

    public ConversationMetadata fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Boolean bool2 = bool;
        int i = -1;
        String str = null;
        ConversationUser conversationUser = null;
        Alert alert = null;
        Integer num = 0;
        Boolean bool3 = bool2;
        Long l2 = l;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("conversationId", "messenger_conversation_id", jsonReader2);
                    }
                case 1:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("messageCount", ResponseConstants.MESSAGE_COUNT, jsonReader2);
                    }
                case 2:
                    bool3 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool3 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("read", ResponseConstants.IS_READ, jsonReader2);
                    }
                case 3:
                    conversationUser = this.nullableConversationUserAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    l2 = this.longAdapter.fromJson(jsonReader2);
                    if (l2 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("_lastUpdateDate", ResponseConstants.LAST_MESSAGE_DATE, jsonReader2);
                    }
                case 5:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessage", "last_message_excerpt", jsonReader2);
                    }
                case 6:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("hasAttachments", ResponseConstants.HAS_ATTACHMENTS, jsonReader2);
                    }
                case 7:
                    alert = this.nullableAlertAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            long longValue = l.longValue();
            int intValue = num.intValue();
            boolean booleanValue = bool3.booleanValue();
            long longValue2 = l2.longValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            return new ConversationMetadata(longValue, intValue, booleanValue, conversationUser, longValue2, str, bool2.booleanValue(), alert);
        }
        String str2 = str;
        Constructor<ConversationMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            constructor = ConversationMetadata.class.getDeclaredConstructor(new Class[]{cls, cls2, cls3, ConversationUser.class, cls, String.class, cls3, Alert.class, cls2, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ConversationMetadata::cl…his.constructorRef = it }");
        }
        ConversationMetadata newInstance = constructor.newInstance(new Object[]{l, num, bool3, conversationUser, l2, str2, bool2, alert, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ConversationMetadata conversationMetadata) {
        C19383o.m32797g(wVar, "writer");
        if (conversationMetadata != null) {
            wVar.mo68522b();
            wVar.mo68529h("messenger_conversation_id");
            this.longAdapter.toJson(wVar, Long.valueOf(conversationMetadata.getConversationId()));
            wVar.mo68529h(ResponseConstants.MESSAGE_COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(conversationMetadata.getMessageCount()));
            wVar.mo68529h(ResponseConstants.IS_READ);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversationMetadata.getRead()));
            wVar.mo68529h(ResponseConstants.OTHER_USER);
            this.nullableConversationUserAdapter.toJson(wVar, conversationMetadata.getOtherUser());
            wVar.mo68529h(ResponseConstants.LAST_MESSAGE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(conversationMetadata.get_lastUpdateDate()));
            wVar.mo68529h("last_message_excerpt");
            this.stringAdapter.toJson(wVar, conversationMetadata.getLastMessage());
            wVar.mo68529h(ResponseConstants.HAS_ATTACHMENTS);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversationMetadata.getHasAttachments()));
            wVar.mo68529h("alert");
            this.nullableAlertAdapter.toJson(wVar, conversationMetadata.getAlert());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
