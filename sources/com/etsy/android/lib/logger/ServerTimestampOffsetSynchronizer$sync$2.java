package com.etsy.android.lib.logger;

import android.content.SharedPreferences;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ServerTimestampOffsetSynchronizer$sync$2 extends Lambda implements C19857l<Long, C19394m> {
    public final /* synthetic */ ServerTimestampOffsetSynchronizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerTimestampOffsetSynchronizer$sync$2(ServerTimestampOffsetSynchronizer serverTimestampOffsetSynchronizer) {
        super(1);
        this.this$0 = serverTimestampOffsetSynchronizer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Long l) {
        ServerTimestampOffsetSynchronizer serverTimestampOffsetSynchronizer = this.this$0;
        C19383o.m32796f(l, "epoch");
        long longValue = l.longValue();
        serverTimestampOffsetSynchronizer.f19045c.getClass();
        SharedPreferences sharedPreferences = serverTimestampOffsetSynchronizer.f19044b.f29135a.f19584a;
        C19383o.m32796f(sharedPreferences, "preferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C19383o.m32796f(edit, "editor");
        edit.putLong("ServerTimestampOffset", System.currentTimeMillis() - (longValue * ((long) 1000)));
        edit.apply();
    }
}
