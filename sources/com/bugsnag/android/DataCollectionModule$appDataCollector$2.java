package com.bugsnag.android;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.C5768c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class DataCollectionModule$appDataCollector$2 extends Lambda implements C19846a<C5729d> {
    public final /* synthetic */ C5825q1 $memoryTrimState;
    public final /* synthetic */ C5768c $systemServiceModule;
    public final /* synthetic */ C5910s2 $trackerModule;
    public final /* synthetic */ C5721b0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataCollectionModule$appDataCollector$2(C5721b0 b0Var, C5910s2 s2Var, C5768c cVar, C5825q1 q1Var) {
        super(0);
        this.this$0 = b0Var;
        this.$trackerModule = s2Var;
        this.$systemServiceModule = cVar;
        this.$memoryTrimState = q1Var;
    }

    public final C5729d invoke() {
        Context context = this.this$0.f12149b;
        PackageManager packageManager = context.getPackageManager();
        C5763c cVar = this.this$0.f12150c;
        C5910s2 s2Var = this.$trackerModule;
        return new C5729d(context, packageManager, cVar, s2Var.f12606c, this.$systemServiceModule.f12342c, s2Var.f12605b, this.$memoryTrimState);
    }
}
