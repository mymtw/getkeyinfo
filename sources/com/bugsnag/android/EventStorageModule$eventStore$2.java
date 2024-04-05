package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class EventStorageModule$eventStore$2 extends Lambda implements C19846a<C5926w0> {
    public final /* synthetic */ C5746g $bgTaskService;
    public final /* synthetic */ C5805m $callbackState;
    public final /* synthetic */ C5914t1 $notifier;
    public final /* synthetic */ EventStorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventStorageModule$eventStore$2(EventStorageModule eventStorageModule, C5914t1 t1Var, C5746g gVar, C5805m mVar) {
        super(0);
        this.this$0 = eventStorageModule;
        this.$notifier = t1Var;
        this.$bgTaskService = gVar;
        this.$callbackState = mVar;
    }

    public final C5926w0 invoke() {
        EventStorageModule eventStorageModule = this.this$0;
        C5763c cVar = eventStorageModule.f12115b;
        return new C5926w0(cVar, cVar.f12329s, this.$notifier, this.$bgTaskService, (C5744f1) eventStorageModule.f12116c.getValue(), this.$callbackState);
    }
}
