package com.paypal.android.platform.authsdk.authcommon;

import p753kq.C19857l;

public interface ChallengeParser {
    Challenge parseAndBuildChallenge(ChallengeRawResponse challengeRawResponse, C19857l<Object, ? extends ChallengeResult> lVar);
}
