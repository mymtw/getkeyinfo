package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ConversationUserJsonAdapter extends JsonAdapter<ConversationUser> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ConversationUser> constructorRef;
    private final JsonAdapter<EtsyId> etsyIdAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.DISPLAY_NAME, "avatar_url", ResponseConstants.USERNAME, "user_id", ResponseConstants.IS_GUEST, "userId");
    private final JsonAdapter<String> stringAdapter;

    public ConversationUserJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "avatarUrl");
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "userIdJson");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isGuest");
        this.etsyIdAdapter = yVar.mo68558c(EtsyId.class, emptySet, "userId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ConversationUser)";
    }

    public ConversationUser fromJson(JsonReader jsonReader) {
        ConversationUser conversationUser;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Long l = 0L;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        EtsyId etsyId = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.DISPLAY_NAME, jsonReader2);
                    }
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    l = this.longAdapter.fromJson(jsonReader2);
                    if (l != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("userIdJson", "user_id", jsonReader2);
                    }
                case 4:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("isGuest", ResponseConstants.IS_GUEST, jsonReader2);
                    }
                case 5:
                    etsyId = this.etsyIdAdapter.fromJson(jsonReader2);
                    if (etsyId != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("userId", "userId", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            conversationUser = new ConversationUser(str, str2, str3, l.longValue(), bool.booleanValue());
        } else {
            Constructor<ConversationUser> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ConversationUser.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Long.TYPE, Boolean.TYPE, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ConversationUser::class.…his.constructorRef = it }");
            }
            ConversationUser newInstance = constructor.newInstance(new Object[]{str, str2, str3, l, bool, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            conversationUser = newInstance;
        }
        if (etsyId == null) {
            etsyId = conversationUser.getUserId();
        }
        conversationUser.setUserId(etsyId);
        return conversationUser;
    }

    public void toJson(C17412w wVar, ConversationUser conversationUser) {
        C19383o.m32797g(wVar, "writer");
        if (conversationUser != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.stringAdapter.toJson(wVar, conversationUser.getDisplayName());
            wVar.mo68529h("avatar_url");
            this.nullableStringAdapter.toJson(wVar, conversationUser.getAvatarUrl());
            wVar.mo68529h(ResponseConstants.USERNAME);
            this.nullableStringAdapter.toJson(wVar, conversationUser.getUsername());
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(conversationUser.getUserIdJson()));
            wVar.mo68529h(ResponseConstants.IS_GUEST);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(conversationUser.isGuest()));
            wVar.mo68529h("userId");
            this.etsyIdAdapter.toJson(wVar, conversationUser.getUserId());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
