package com.bugsnag.android;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class DataCollectionModule$deviceDataCollector$2 extends Lambda implements C19846a<C5773j0> {
    public final /* synthetic */ C5746g $bgTaskService;
    public final /* synthetic */ C5935y $connectivity;
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ C5721b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataCollectionModule$deviceDataCollector$2(C5721b0 b0Var, C5935y yVar, String str, C5746g gVar) {
        super(0);
        this.this$0 = b0Var;
        this.$connectivity = yVar;
        this.$deviceId = str;
        this.$bgTaskService = gVar;
    }

    public final C5773j0 invoke() {
        C5935y yVar = this.$connectivity;
        Context context = this.this$0.f12149b;
        Resources resources = context.getResources();
        C19383o.m32793c(resources, "ctx.resources");
        String str = this.$deviceId;
        C5721b0 b0Var = this.this$0;
        C5757i0 i0Var = b0Var.f12152e;
        File file = b0Var.f12153f;
        C19383o.m32793c(file, "dataDir");
        return new C5773j0(yVar, context, resources, str, i0Var, file, (RootDetector) this.this$0.f12155h.getValue(), this.$bgTaskService, this.this$0.f12151d);
    }
}
