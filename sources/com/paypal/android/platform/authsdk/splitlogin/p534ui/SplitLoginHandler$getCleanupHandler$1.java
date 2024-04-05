package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$getCleanupHandler$1 */
public final class SplitLoginHandler$getCleanupHandler$1 implements CleanUp {
    public final /* synthetic */ C2895z<ChallengeResult> $mutableLiveData;
    public final /* synthetic */ String $requestId;

    public SplitLoginHandler$getCleanupHandler$1(C2895z<ChallengeResult> zVar, String str) {
        this.$mutableLiveData = zVar;
        this.$requestId = str;
    }

    public void onClean() {
        this.$mutableLiveData.postValue(new ChallengeResult.Failed(this.$requestId, new ChallengeError.Cancelled(new Error("User Cancelled"))));
    }
}
