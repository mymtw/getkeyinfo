package com.paypal.android.platform.authsdk.captcha.p532ui;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeHandler", mo70541f = "CaptchaChallengeHandler.kt", mo70542l = {64}, mo70543m = "proceedCaptchaChallenge")
/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeHandler$proceedCaptchaChallenge$1 */
public final class CaptchaChallengeHandler$proceedCaptchaChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CaptchaChallengeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallengeHandler$proceedCaptchaChallenge$1(CaptchaChallengeHandler captchaChallengeHandler, C19340c<? super CaptchaChallengeHandler$proceedCaptchaChallenge$1> cVar) {
        super(cVar);
        this.this$0 = captchaChallengeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.proceedCaptchaChallenge((Challenge) null, this);
    }
}
