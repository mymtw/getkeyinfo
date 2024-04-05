package com.paypal.android.platform.authsdk.authcommon;

public interface ChallengeRegistry {
    boolean registerChallengeHandler(ChallengeType challengeType, ChallengeHandler challengeHandler);
}
