package com.etsy.android.lib.models;

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

public final class ConversationMessage2JsonAdapter extends JsonAdapter<ConversationMessage2> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ConversationMessage2> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ImageInfo>> listOfImageInfoAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SENDER_ID, ResponseConstants.CONVERSATION_ID, ResponseConstants.MESSAGE_ORDER, "message", "language", "translated_message", ResponseConstants.HAS_IMAGES, ResponseConstants.CREATE_DATE, "images");
    private final JsonAdapter<String> stringAdapter;

    public ConversationMessage2JsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls2, emptySet, "userId");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "messageOrder");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "_message");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "language");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "hasImages");
        this.listOfImageInfoAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ImageInfo.class), emptySet, "images");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ConversationMessage2)";
    }

    public ConversationMessage2 fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        Boolean bool = Boolean.FALSE;
        Long l = 0L;
        jsonReader.mo68410b();
        int i = -1;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            Class<String> cls2 = cls;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l2 = this.longAdapter.fromJson(jsonReader2);
                        if (l2 != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("userId", ResponseConstants.SENDER_ID, jsonReader2);
                        }
                    case 1:
                        l3 = this.longAdapter.fromJson(jsonReader2);
                        if (l3 != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("conversationId", ResponseConstants.CONVERSATION_ID, jsonReader2);
                        }
                    case 2:
                        num = this.intAdapter.fromJson(jsonReader2);
                        if (num != null) {
                            i &= -5;
                            break;
                        } else {
                            throw C18215a.m30734m("messageOrder", ResponseConstants.MESSAGE_ORDER, jsonReader2);
                        }
                    case 3:
                        str = this.stringAdapter.fromJson(jsonReader2);
                        if (str != null) {
                            i &= -9;
                            break;
                        } else {
                            throw C18215a.m30734m("_message", "message", jsonReader2);
                        }
                    case 4:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -17;
                        break;
                    case 5:
                        str2 = this.stringAdapter.fromJson(jsonReader2);
                        if (str2 != null) {
                            i &= -33;
                            break;
                        } else {
                            throw C18215a.m30734m("translatedMessage", "translated_message", jsonReader2);
                        }
                    case 6:
                        bool = this.booleanAdapter.fromJson(jsonReader2);
                        if (bool != null) {
                            i &= -65;
                            break;
                        } else {
                            throw C18215a.m30734m("hasImages", ResponseConstants.HAS_IMAGES, jsonReader2);
                        }
                    case 7:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l != null) {
                            i &= -129;
                            break;
                        } else {
                            throw C18215a.m30734m("_creationDate", ResponseConstants.CREATE_DATE, jsonReader2);
                        }
                    case 8:
                        list = this.listOfImageInfoAdapter.fromJson(jsonReader2);
                        if (list != null) {
                            i &= -257;
                            break;
                        } else {
                            throw C18215a.m30734m("images", "images", jsonReader2);
                        }
                }
                cls = cls2;
            } else {
                jsonReader.mo68413e();
                if (i != -509) {
                    List list2 = list;
                    String str4 = str;
                    String str5 = str2;
                    Constructor<ConversationMessage2> constructor = this.constructorRef;
                    if (constructor == null) {
                        Class cls3 = Long.TYPE;
                        Class cls4 = Integer.TYPE;
                        constructor = ConversationMessage2.class.getDeclaredConstructor(new Class[]{cls3, cls3, cls4, cls2, cls2, cls2, Boolean.TYPE, cls3, List.class, cls4, C18215a.f39928c});
                        this.constructorRef = constructor;
                        C19383o.m32796f(constructor, "ConversationMessage2::cl…his.constructorRef = it }");
                    }
                    Object[] objArr = new Object[11];
                    if (l2 != null) {
                        objArr[0] = Long.valueOf(l2.longValue());
                        if (l3 != null) {
                            objArr[1] = Long.valueOf(l3.longValue());
                            objArr[2] = num;
                            objArr[3] = str4;
                            objArr[4] = str3;
                            objArr[5] = str5;
                            objArr[6] = bool;
                            objArr[7] = l;
                            objArr[8] = list2;
                            objArr[9] = Integer.valueOf(i);
                            objArr[10] = null;
                            ConversationMessage2 newInstance = constructor.newInstance(objArr);
                            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                            return newInstance;
                        }
                        throw C18215a.m30728g("conversationId", ResponseConstants.CONVERSATION_ID, jsonReader2);
                    }
                    throw C18215a.m30728g("userId", ResponseConstants.SENDER_ID, jsonReader2);
                } else if (l2 != null) {
                    long longValue = l2.longValue();
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        int intValue = num.intValue();
                        C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
                        C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
                        boolean booleanValue = bool.booleanValue();
                        long longValue3 = l.longValue();
                        C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<com.etsy.android.lib.models.ImageInfo>");
                        return new ConversationMessage2(longValue, longValue2, intValue, str, str3, str2, booleanValue, longValue3, list);
                    }
                    throw C18215a.m30728g("conversationId", ResponseConstants.CONVERSATION_ID, jsonReader2);
                } else {
                    throw C18215a.m30728g("userId", ResponseConstants.SENDER_ID, jsonReader2);
                }
            }
        }
    }

    public void toJson(C17412w wVar, ConversationMessage2 conversationMessage2) {
        C19383o.m32797g(wVar, "writer");
        if (conversationMessage2 != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SENDER_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(conversationMessage2.getUserId()));
            wVar.mo68529h(ResponseConstants.CONVERSATION_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(conversationMessage2.getConversationId()));
            wVar.mo68529h(ResponseConstants.MESSAGE_ORDER);
            this.intAdapter.toJson(wVar, Integer.valueOf(conversationMessage2.getMessageOrder()));
            wVar.mo68529h("message");
            this.stringAdapter.toJson(wVar, conversationMessage2.get_message());
            wVar.mo68529h("language");
            this.nullableStringAdapter.toJson(wVar, conversationMessage2.getLanguage());
            wVar.mo68529h("translated_message");
            this.stringAdapter.toJson(wVar, conversationMessage2.getTranslatedMessage());
            wVar.mo68529h(ResponseConstants.HAS_IMAGES);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversationMessage2.getHasImages()));
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(conversationMessage2.get_creationDate()));
            wVar.mo68529h("images");
            this.listOfImageInfoAdapter.toJson(wVar, conversationMessage2.getImages());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
