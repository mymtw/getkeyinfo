package com.etsy.android.lib.session;

import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SessionRepository$fetchSessionSettings$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRepository$fetchSessionSettings$1(SessionRepository sessionRepository) {
        super(1);
        this.this$0 = sessionRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        LogCatKt.m17045a().mo21306a("Error fetching session settings");
        this.this$0.f19541f.mo45474a("sessionsettings.error");
    }
}
