package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SuggestUsernameResult {
    public static final int $stable = 8;
    private final transient List<String> suggestions;
    private final List<UsernameSuggestion> usernameSuggestions;

    public SuggestUsernameResult(@C17402n(name = "suggestions") List<UsernameSuggestion> list) {
        C19383o.m32797g(list, "usernameSuggestions");
        this.usernameSuggestions = list;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (UsernameSuggestion suggestion : list) {
            arrayList.add(suggestion.getSuggestion());
        }
        this.suggestions = arrayList;
    }

    public static /* synthetic */ SuggestUsernameResult copy$default(SuggestUsernameResult suggestUsernameResult, List<UsernameSuggestion> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = suggestUsernameResult.usernameSuggestions;
        }
        return suggestUsernameResult.copy(list);
    }

    public final List<UsernameSuggestion> component1() {
        return this.usernameSuggestions;
    }

    public final SuggestUsernameResult copy(@C17402n(name = "suggestions") List<UsernameSuggestion> list) {
        C19383o.m32797g(list, "usernameSuggestions");
        return new SuggestUsernameResult(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestUsernameResult) && C19383o.m32792b(this.usernameSuggestions, ((SuggestUsernameResult) obj).usernameSuggestions);
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public final List<UsernameSuggestion> getUsernameSuggestions() {
        return this.usernameSuggestions;
    }

    public int hashCode() {
        return this.usernameSuggestions.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("SuggestUsernameResult(usernameSuggestions="), this.usernameSuggestions, ')');
    }
}
