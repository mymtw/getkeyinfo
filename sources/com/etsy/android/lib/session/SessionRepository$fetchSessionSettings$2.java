package com.etsy.android.lib.session;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SessionRepository$fetchSessionSettings$2 extends Lambda implements C19857l<SessionSettings, C19394m> {
    public final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRepository$fetchSessionSettings$2(SessionRepository sessionRepository) {
        super(1);
        this.this$0 = sessionRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SessionSettings) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SessionSettings sessionSettings) {
        SessionRepository sessionRepository = this.this$0;
        C19383o.m32796f(sessionSettings, "it");
        sessionRepository.getClass();
        sessionRepository.f19536a.mo45910d(sessionSettings.f19542a);
        C8855a aVar = sessionRepository.f19540e;
        boolean a = sessionSettings.mo30401a();
        aVar.f19546c = a;
        aVar.f19545b.mo46761a().edit().putBoolean("customerCentricMessagingEnrolled", a).apply();
        LogCatKt.m17045a().mo21310e("Fetched session settings");
    }
}
