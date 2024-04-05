package com.bugsnag.android;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$deviceIdStore$2 extends Lambda implements C19846a<DeviceIdStore> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ C5816o1 $logger;
    public final /* synthetic */ StorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$deviceIdStore$2(StorageModule storageModule, Context context, C5816o1 o1Var) {
        super(0);
        this.this$0 = storageModule;
        this.$appContext = context;
        this.$logger = o1Var;
    }

    public final DeviceIdStore invoke() {
        return new DeviceIdStore(this.$appContext, (C5755h2) this.this$0.f12129b.getValue(), this.$logger);
    }
}
