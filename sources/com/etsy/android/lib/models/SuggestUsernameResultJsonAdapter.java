package com.etsy.android.lib.models;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class SuggestUsernameResultJsonAdapter extends JsonAdapter<SuggestUsernameResult> {
    public static final int $stable = 8;
    private final JsonAdapter<List<UsernameSuggestion>> listOfUsernameSuggestionAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SUGGESTIONS);

    public SuggestUsernameResultJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.listOfUsernameSuggestionAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, UsernameSuggestion.class), EmptySet.INSTANCE, "usernameSuggestions");
    }

    public String toString() {
        return "GeneratedJsonAdapter(SuggestUsernameResult)";
    }

    public SuggestUsernameResult fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0 && (list = this.listOfUsernameSuggestionAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("usernameSuggestions", ResponseConstants.SUGGESTIONS, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (list != null) {
            return new SuggestUsernameResult(list);
        }
        throw C18215a.m30728g("usernameSuggestions", ResponseConstants.SUGGESTIONS, jsonReader);
    }

    public void toJson(C17412w wVar, SuggestUsernameResult suggestUsernameResult) {
        C19383o.m32797g(wVar, "writer");
        if (suggestUsernameResult != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SUGGESTIONS);
            this.listOfUsernameSuggestionAdapter.toJson(wVar, suggestUsernameResult.getUsernameSuggestions());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
