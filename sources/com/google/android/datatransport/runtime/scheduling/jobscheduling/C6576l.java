package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import java.util.concurrent.Executor;
import p108fh.C6823g;
import p120gh.C6898a;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
public final class C6576l implements C6539b<C6575k> {

    /* renamed from: a */
    public final C19011a<Executor> f14541a;

    /* renamed from: b */
    public final C19011a<C6580b> f14542b;

    /* renamed from: c */
    public final C19011a<C6577m> f14543c;

    /* renamed from: d */
    public final C19011a<C6898a> f14544d;

    public C6576l(C19011a aVar, C19011a aVar2, C6823g gVar, C19011a aVar3) {
        this.f14541a = aVar;
        this.f14542b = aVar2;
        this.f14543c = gVar;
        this.f14544d = aVar3;
    }

    public final Object get() {
        return new C6575k(this.f14541a.get(), this.f14542b.get(), this.f14543c.get(), this.f14544d.get());
    }
}
