package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class UserJsonAdapter extends JsonAdapter<User> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("user_id", ResponseConstants.DISPLAY_NAME, "login_name");
    private final JsonAdapter<String> stringAdapter;

    public UserJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "userId");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.DISPLAY_NAME_CAMELCASE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(User)";
    }

    public User fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw C18215a.m30734m("userId", "user_id", jsonReader);
                }
            } else if (Q == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m(ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.DISPLAY_NAME, jsonReader);
                }
            } else if (Q == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("loginName", "login_name", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (l != null) {
            long longValue = l.longValue();
            if (str == null) {
                throw C18215a.m30728g(ResponseConstants.DISPLAY_NAME_CAMELCASE, ResponseConstants.DISPLAY_NAME, jsonReader);
            } else if (str2 != null) {
                return new User(longValue, str, str2);
            } else {
                throw C18215a.m30728g("loginName", "login_name", jsonReader);
            }
        } else {
            throw C18215a.m30728g("userId", "user_id", jsonReader);
        }
    }

    public void toJson(C17412w wVar, User user) {
        C19383o.m32797g(wVar, "writer");
        if (user != null) {
            wVar.mo68522b();
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(user.getUserId()));
            wVar.mo68529h(ResponseConstants.DISPLAY_NAME);
            this.stringAdapter.toJson(wVar, user.getDisplayName());
            wVar.mo68529h("login_name");
            this.stringAdapter.toJson(wVar, user.getLoginName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
