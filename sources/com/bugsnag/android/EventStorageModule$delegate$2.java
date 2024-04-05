package com.bugsnag.android;

import android.content.Context;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.dag.C5767b;
import com.bugsnag.android.internal.dag.C5768c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class EventStorageModule$delegate$2 extends Lambda implements C19846a<C5744f1> {
    public final /* synthetic */ C5746g $bgTaskService;
    public final /* synthetic */ C5767b $contextModule;
    public final /* synthetic */ C5721b0 $dataCollectionModule;
    public final /* synthetic */ C5914t1 $notifier;
    public final /* synthetic */ C5768c $systemServiceModule;
    public final /* synthetic */ C5910s2 $trackerModule;
    public final /* synthetic */ EventStorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventStorageModule$delegate$2(EventStorageModule eventStorageModule, C5767b bVar, C5768c cVar, C5721b0 b0Var, C5910s2 s2Var, C5914t1 t1Var, C5746g gVar) {
        super(0);
        this.this$0 = eventStorageModule;
        this.$contextModule = bVar;
        this.$systemServiceModule = cVar;
        this.$dataCollectionModule = b0Var;
        this.$trackerModule = s2Var;
        this.$notifier = t1Var;
        this.$bgTaskService = gVar;
    }

    public final C5744f1 invoke() {
        Context context = this.$contextModule.f12340b;
        C5763c cVar = this.this$0.f12115b;
        C5738e2 e2Var = this.$trackerModule.f12606c;
        return new C5744f1(context, cVar.f12329s, cVar, this.$systemServiceModule.f12341b, (C5729d) this.$dataCollectionModule.f12154g.getValue(), (C5773j0) this.$dataCollectionModule.f12156i.getValue(), this.$notifier, this.$bgTaskService);
    }
}
