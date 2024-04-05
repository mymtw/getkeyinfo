package com.etsy.android.lib.models;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class MoshiModelFactory$logError$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $className;
    public final /* synthetic */ Throwable $throwable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoshiModelFactory$logError$1(String str, Throwable th) {
        super(0);
        this.$className = str;
        this.$throwable = th;
    }

    public final void invoke() {
        MoshiModelFactory.INSTANCE.getCrashUtil().mo30457b(new MoshiModelException(this.$className, this.$throwable));
    }
}
