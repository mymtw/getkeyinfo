package com.paypal.android.platform.authsdk.authcommon;

import kotlin.jvm.internal.C19383o;

public final class ChallengeKt {
    public static final ChallengeType toChallengeType(String str) {
        C19383o.m32797g(str, "<this>");
        ChallengeType[] values = ChallengeType.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ChallengeType challengeType = values[i];
            i++;
            if (C19383o.m32792b(challengeType.getValue(), str)) {
                return challengeType;
            }
        }
        return null;
    }
}
