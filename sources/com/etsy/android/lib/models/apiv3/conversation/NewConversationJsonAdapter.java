package com.etsy.android.lib.models.apiv3.conversation;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class NewConversationJsonAdapter extends JsonAdapter<NewConversation> {
    public static final int $stable = 8;
    private volatile Constructor<NewConversation> constructorRef;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("recipient_loginname", ResponseConstants.SUBJECT, "message");
    private final JsonAdapter<String> stringAdapter;

    public NewConversationJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "recipientLoginName");
    }

    public String toString() {
        return "GeneratedJsonAdapter(NewConversation)";
    }

    public NewConversation fromJson(JsonReader jsonReader) {
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    throw C18215a.m30734m("recipientLoginName", "recipient_loginname", jsonReader);
                }
            } else if (Q == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m(ResponseConstants.SUBJECT, ResponseConstants.SUBJECT, jsonReader);
                }
            } else if (Q == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("message", "message", jsonReader);
                }
            } else {
                continue;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            return new NewConversation(str, str2, str3);
        }
        Constructor<NewConversation> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NewConversation.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "NewConversation::class.j…his.constructorRef = it }");
        }
        NewConversation newInstance = constructor.newInstance(new Object[]{str, str2, str3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, NewConversation newConversation) {
        C19383o.m32797g(wVar, "writer");
        if (newConversation != null) {
            wVar.mo68522b();
            wVar.mo68529h("recipient_loginname");
            this.stringAdapter.toJson(wVar, newConversation.getRecipientLoginName());
            wVar.mo68529h(ResponseConstants.SUBJECT);
            this.stringAdapter.toJson(wVar, newConversation.getSubject());
            wVar.mo68529h("message");
            this.stringAdapter.toJson(wVar, newConversation.getMessage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
