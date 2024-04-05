package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class Conversation3JsonAdapter extends JsonAdapter<Conversation3> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Conversation3> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Alert> nullableAlertAdapter;
    private final JsonAdapter<ConversationContextAdapterFactory> nullableConversationContextAdapterFactoryAdapter;
    private final JsonAdapter<ConversationUser> nullableConversationUserAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CONVERSATION_ID, ResponseConstants.MESSAGE_COUNT, "title", ResponseConstants.IS_READ, ResponseConstants.OTHER_USER, ResponseConstants.LAST_UPDATED_TIMESTAMP, ResponseConstants.LAST_MESSAGE, "last_message_me", "last_message_other", ResponseConstants.LAST_MESSAGE_DATE, ResponseConstants.LAST_MESSAGE_ME_DATE, ResponseConstants.LAST_MESSAGE_OTHER_DATE, ResponseConstants.HAS_ATTACHMENTS, ResponseConstants.IS_CUSTOM_SHOP, ResponseConstants.CONTEXT_TYPE_ID, ResponseConstants.CONTEXT_ID, ResponseConstants.CONTEXT, "alert");
    private final JsonAdapter<String> stringAdapter;

    public Conversation3JsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls, emptySet, "conversationId");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "messageCount");
        this.stringAdapter = yVar2.mo68558c(String.class, emptySet, "_title");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "read");
        this.nullableConversationUserAdapter = yVar2.mo68558c(ConversationUser.class, emptySet, "otherUser");
        this.nullableConversationContextAdapterFactoryAdapter = yVar2.mo68558c(ConversationContextAdapterFactory.class, emptySet, "conversationContextAdapterFactory");
        this.nullableAlertAdapter = yVar2.mo68558c(Alert.class, emptySet, "alert");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Conversation3)";
    }

    public Conversation3 fromJson(JsonReader jsonReader) {
        int i;
        int i2;
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        Class<String> cls = String.class;
        Long l2 = l;
        Long l3 = l2;
        Integer num = 0;
        Integer num2 = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        int i3 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ConversationUser conversationUser = null;
        ConversationContextAdapterFactory conversationContextAdapterFactory = null;
        Alert alert = null;
        Long l4 = l3;
        Long l5 = l4;
        Long l6 = l5;
        while (jsonReader.mo68414f()) {
            Boolean bool5 = bool4;
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        i3 &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("conversationId", ResponseConstants.CONVERSATION_ID, jsonReader2);
                    }
                case 1:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i3 &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("messageCount", ResponseConstants.MESSAGE_COUNT, jsonReader2);
                    }
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i3 &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("_title", "title", jsonReader2);
                    }
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool2 != null) {
                        i3 &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("read", ResponseConstants.IS_READ, jsonReader2);
                    }
                case 4:
                    conversationUser = this.nullableConversationUserAdapter.fromJson(jsonReader2);
                    i3 &= -17;
                    break;
                case 5:
                    l4 = this.longAdapter.fromJson(jsonReader2);
                    if (l4 != null) {
                        i3 &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("_lastUpdateDate", ResponseConstants.LAST_UPDATED_TIMESTAMP, jsonReader2);
                    }
                case 6:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i3 &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("_lastMessage", ResponseConstants.LAST_MESSAGE, jsonReader2);
                    }
                case 7:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i3 &= -129;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessageMe", "last_message_me", jsonReader2);
                    }
                case 8:
                    str4 = this.stringAdapter.fromJson(jsonReader2);
                    if (str4 != null) {
                        i3 &= -257;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessageOther", "last_message_other", jsonReader2);
                    }
                case 9:
                    l5 = this.longAdapter.fromJson(jsonReader2);
                    if (l5 != null) {
                        i3 &= -513;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessageDate", ResponseConstants.LAST_MESSAGE_DATE, jsonReader2);
                    }
                case 10:
                    l6 = this.longAdapter.fromJson(jsonReader2);
                    if (l6 != null) {
                        i3 &= -1025;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessageMeDate", ResponseConstants.LAST_MESSAGE_ME_DATE, jsonReader2);
                    }
                case 11:
                    l2 = this.longAdapter.fromJson(jsonReader2);
                    if (l2 != null) {
                        i3 &= -2049;
                        break;
                    } else {
                        throw C18215a.m30734m("lastMessageOtherDate", ResponseConstants.LAST_MESSAGE_OTHER_DATE, jsonReader2);
                    }
                case 12:
                    bool3 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool3 != null) {
                        i3 &= -4097;
                        break;
                    } else {
                        throw C18215a.m30734m("hasAttachments", ResponseConstants.HAS_ATTACHMENTS, jsonReader2);
                    }
                case 13:
                    bool4 = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool4 != null) {
                        i3 &= -8193;
                        continue;
                    } else {
                        throw C18215a.m30734m("isCustomShop", ResponseConstants.IS_CUSTOM_SHOP, jsonReader2);
                    }
                case 14:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        i3 &= -16385;
                        break;
                    } else {
                        throw C18215a.m30734m("contextTypeId", ResponseConstants.CONTEXT_TYPE_ID, jsonReader2);
                    }
                case 15:
                    l3 = this.longAdapter.fromJson(jsonReader2);
                    if (l3 != null) {
                        i2 = -32769;
                        break;
                    } else {
                        throw C18215a.m30734m("contextId", ResponseConstants.CONTEXT_ID, jsonReader2);
                    }
                case 16:
                    conversationContextAdapterFactory = this.nullableConversationContextAdapterFactoryAdapter.fromJson(jsonReader2);
                    i2 = -65537;
                    break;
                case 17:
                    alert = this.nullableAlertAdapter.fromJson(jsonReader2);
                    i2 = -131073;
                    break;
            }
            i3 &= i2;
            bool4 = bool5;
            continue;
        }
        Boolean bool6 = bool4;
        jsonReader.mo68413e();
        if (i3 == -262144) {
            long longValue = l.longValue();
            int intValue = num.intValue();
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool2.booleanValue();
            long longValue2 = l4.longValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str4, "null cannot be cast to non-null type kotlin.String");
            return new Conversation3(longValue, intValue, str2, booleanValue, conversationUser, longValue2, str, str3, str4, l5.longValue(), l6.longValue(), l2.longValue(), bool3.booleanValue(), bool6.booleanValue(), num2.intValue(), l3.longValue(), conversationContextAdapterFactory, alert);
        }
        Constructor<Conversation3> constructor = this.constructorRef;
        if (constructor == null) {
            i = i3;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            constructor = Conversation3.class.getDeclaredConstructor(new Class[]{cls2, cls3, cls, cls4, ConversationUser.class, cls2, cls, cls, cls, cls2, cls2, cls2, cls4, cls4, cls3, cls2, ConversationContextAdapterFactory.class, Alert.class, cls3, C18215a.f39928c});
            this.constructorRef = constructor;
            C19394m mVar = C19394m.f43287a;
            C19383o.m32796f(constructor, "Conversation3::class.jav…his.constructorRef = it }");
        } else {
            i = i3;
        }
        Conversation3 newInstance = constructor.newInstance(new Object[]{l, num, str2, bool2, conversationUser, l4, str, str3, str4, l5, l6, l2, bool3, bool6, num2, l3, conversationContextAdapterFactory, alert, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Conversation3 conversation3) {
        C19383o.m32797g(wVar, "writer");
        if (conversation3 != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CONVERSATION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.getConversationId()));
            wVar.mo68529h(ResponseConstants.MESSAGE_COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(conversation3.getMessageCount()));
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, conversation3.get_title());
            wVar.mo68529h(ResponseConstants.IS_READ);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversation3.getRead()));
            wVar.mo68529h(ResponseConstants.OTHER_USER);
            this.nullableConversationUserAdapter.toJson(wVar, conversation3.getOtherUser());
            wVar.mo68529h(ResponseConstants.LAST_UPDATED_TIMESTAMP);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.get_lastUpdateDate()));
            wVar.mo68529h(ResponseConstants.LAST_MESSAGE);
            this.stringAdapter.toJson(wVar, conversation3.get_lastMessage());
            wVar.mo68529h("last_message_me");
            this.stringAdapter.toJson(wVar, conversation3.getLastMessageMe());
            wVar.mo68529h("last_message_other");
            this.stringAdapter.toJson(wVar, conversation3.getLastMessageOther());
            wVar.mo68529h(ResponseConstants.LAST_MESSAGE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.getLastMessageDate()));
            wVar.mo68529h(ResponseConstants.LAST_MESSAGE_ME_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.getLastMessageMeDate()));
            wVar.mo68529h(ResponseConstants.LAST_MESSAGE_OTHER_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.getLastMessageOtherDate()));
            wVar.mo68529h(ResponseConstants.HAS_ATTACHMENTS);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversation3.getHasAttachments()));
            wVar.mo68529h(ResponseConstants.IS_CUSTOM_SHOP);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversation3.isCustomShop()));
            wVar.mo68529h(ResponseConstants.CONTEXT_TYPE_ID);
            this.intAdapter.toJson(wVar, Integer.valueOf(conversation3.getContextTypeId()));
            wVar.mo68529h(ResponseConstants.CONTEXT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(conversation3.getContextId()));
            wVar.mo68529h(ResponseConstants.CONTEXT);
            this.nullableConversationContextAdapterFactoryAdapter.toJson(wVar, conversation3.getConversationContextAdapterFactory());
            wVar.mo68529h("alert");
            this.nullableAlertAdapter.toJson(wVar, conversation3.getAlert());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
