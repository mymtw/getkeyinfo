package com.bugsnag.android;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$lastRunInfo$2 extends Lambda implements C19846a<C5758i1> {
    public final /* synthetic */ StorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$lastRunInfo$2(StorageModule storageModule) {
        super(0);
        this.this$0 = storageModule;
    }

    public final C5758i1 invoke() {
        C5758i1 i1Var;
        C5775j1 j1Var = (C5775j1) this.this$0.f12133f.getValue();
        ReentrantReadWriteLock.ReadLock readLock = j1Var.f12369c.readLock();
        C19383o.m32793c(readLock, "lock.readLock()");
        readLock.lock();
        try {
            i1Var = j1Var.mo16561a();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
        readLock.unlock();
        ((C5775j1) this.this$0.f12133f.getValue()).mo16562b(new C5758i1(0, false, false));
        return i1Var;
    }
}
