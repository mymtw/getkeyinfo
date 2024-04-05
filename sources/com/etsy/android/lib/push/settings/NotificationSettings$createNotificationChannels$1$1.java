package com.etsy.android.lib.push.settings;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p248tp.C8072t;
import p753kq.C19857l;

final class NotificationSettings$createNotificationChannels$1$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ C8072t<Boolean> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettings$createNotificationChannels$1$1(C8072t<Boolean> tVar) {
        super(1);
        this.$it = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
        this.$it.tryOnError(th);
    }
}
