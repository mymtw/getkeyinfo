package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1$1$2$1$1 */
public final class SplitLoginHandler$handleChallenge$result$1$1$1$2$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ ChallengeResult $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$handleChallenge$result$1$1$1$2$1$1(ChallengeResult challengeResult) {
        super(1);
        this.$it = challengeResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
    }
}
