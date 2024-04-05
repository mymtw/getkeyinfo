package com.bugsnag.android;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$sharedPrefMigrator$2 extends Lambda implements C19846a<C5755h2> {
    public final /* synthetic */ Context $appContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$sharedPrefMigrator$2(Context context) {
        super(0);
        this.$appContext = context;
    }

    public final C5755h2 invoke() {
        return new C5755h2(this.$appContext);
    }
}
