package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$userStore$2 extends Lambda implements C19846a<C5931w2> {
    public final /* synthetic */ C5763c $immutableConfig;
    public final /* synthetic */ C5816o1 $logger;
    public final /* synthetic */ StorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$userStore$2(StorageModule storageModule, C5763c cVar, C5816o1 o1Var) {
        super(0);
        this.this$0 = storageModule;
        this.$immutableConfig = cVar;
        this.$logger = o1Var;
    }

    public final C5931w2 invoke() {
        return new C5931w2(this.$immutableConfig, (String) this.this$0.f12131d.getValue(), (C5755h2) this.this$0.f12129b.getValue(), this.$logger);
    }
}
