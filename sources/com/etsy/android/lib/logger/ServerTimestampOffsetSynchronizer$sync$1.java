package com.etsy.android.lib.logger;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ServerTimestampOffsetSynchronizer$sync$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public static final ServerTimestampOffsetSynchronizer$sync$1 INSTANCE = new ServerTimestampOffsetSynchronizer$sync$1();

    public ServerTimestampOffsetSynchronizer$sync$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        LogCatKt.m17045a().mo21313g("Failed to retrieve server time");
    }
}
