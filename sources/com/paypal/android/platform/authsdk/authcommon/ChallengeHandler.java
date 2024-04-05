package com.paypal.android.platform.authsdk.authcommon;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import kotlin.coroutines.C19340c;

public interface ChallengeHandler {
    Object handleChallenge(Challenge challenge, C19340c<? super ChallengeResult> cVar);

    void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar);
}
