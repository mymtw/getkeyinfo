package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$sessionStore$2 extends Lambda implements C19846a<C5733d2> {
    public final /* synthetic */ C5763c $immutableConfig;
    public final /* synthetic */ C5816o1 $logger;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$sessionStore$2(C5763c cVar, C5816o1 o1Var) {
        super(0);
        this.$immutableConfig = cVar;
        this.$logger = o1Var;
    }

    public final C5733d2 invoke() {
        return new C5733d2(this.$immutableConfig, this.$logger);
    }
}
