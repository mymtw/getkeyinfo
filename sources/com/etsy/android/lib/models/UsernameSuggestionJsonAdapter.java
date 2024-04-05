package com.etsy.android.lib.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class UsernameSuggestionJsonAdapter extends JsonAdapter<UsernameSuggestion> {
    public static final int $stable = 8;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SUGGESTION, ResponseConstants.STRATEGY);
    private final JsonAdapter<String> stringAdapter;

    public UsernameSuggestionJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.stringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, ResponseConstants.SUGGESTION);
    }

    public String toString() {
        return "GeneratedJsonAdapter(UsernameSuggestion)";
    }

    public UsernameSuggestion fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m(ResponseConstants.SUGGESTION, ResponseConstants.SUGGESTION, jsonReader);
                }
            } else if (Q == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m(ResponseConstants.STRATEGY, ResponseConstants.STRATEGY, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (str == null) {
            throw C18215a.m30728g(ResponseConstants.SUGGESTION, ResponseConstants.SUGGESTION, jsonReader);
        } else if (str2 != null) {
            return new UsernameSuggestion(str, str2);
        } else {
            throw C18215a.m30728g(ResponseConstants.STRATEGY, ResponseConstants.STRATEGY, jsonReader);
        }
    }

    public void toJson(C17412w wVar, UsernameSuggestion usernameSuggestion) {
        C19383o.m32797g(wVar, "writer");
        if (usernameSuggestion != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SUGGESTION);
            this.stringAdapter.toJson(wVar, usernameSuggestion.getSuggestion());
            wVar.mo68529h(ResponseConstants.STRATEGY);
            this.stringAdapter.toJson(wVar, usernameSuggestion.getStrategy());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
