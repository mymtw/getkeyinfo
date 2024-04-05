package com.etsy.android.lib.models;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class UsernameSuggestion {
    public static final int $stable = 0;
    private final String strategy;
    private final String suggestion;

    public UsernameSuggestion(@C17402n(name = "suggestion") String str, @C17402n(name = "strategy") String str2) {
        C19383o.m32797g(str, ResponseConstants.SUGGESTION);
        C19383o.m32797g(str2, ResponseConstants.STRATEGY);
        this.suggestion = str;
        this.strategy = str2;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public final String getSuggestion() {
        return this.suggestion;
    }
}
