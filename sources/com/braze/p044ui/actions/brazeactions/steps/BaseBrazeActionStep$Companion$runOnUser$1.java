package com.braze.p044ui.actions.brazeactions.steps;

import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import p301z3.C8435e;
import p753kq.C19857l;

/* renamed from: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1 */
public final class BaseBrazeActionStep$Companion$runOnUser$1 implements C8435e<BrazeUser> {

    /* renamed from: a */
    public final /* synthetic */ C19857l<BrazeUser, C19394m> f12022a;

    public BaseBrazeActionStep$Companion$runOnUser$1(C19857l<? super BrazeUser, C19394m> lVar) {
        this.f12022a = lVar;
    }

    /* renamed from: a */
    public final void mo16189a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, BaseBrazeActionStep$Companion$runOnUser$1$onError$1.INSTANCE, 7);
    }

    /* renamed from: b */
    public final void mo16190b(BrazeUser brazeUser) {
        this.f12022a.invoke(brazeUser);
    }
}
