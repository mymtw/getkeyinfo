package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.C6549l;
import com.google.android.datatransport.runtime.backends.C6531f;
import com.google.android.datatransport.runtime.backends.C6534h;
import com.google.android.datatransport.runtime.dagger.internal.C6538a;
import com.google.android.datatransport.runtime.dagger.internal.C6540c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6574j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6576l;
import com.google.android.datatransport.runtime.scheduling.persistence.C6585e;
import com.google.android.datatransport.runtime.scheduling.persistence.C6599q;
import com.google.android.datatransport.runtime.scheduling.persistence.C6602r;
import com.google.android.datatransport.runtime.scheduling.persistence.C6610y;
import java.util.concurrent.Executor;
import p108fh.C6820d;
import p108fh.C6822f;
import p108fh.C6823g;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.h */
public final class C6544h extends C6612u {

    /* renamed from: b */
    public C19011a<Executor> f14477b = C6538a.m12922a(C6549l.C6550a.f14484a);

    /* renamed from: c */
    public C6540c f14478c;

    /* renamed from: d */
    public C19011a f14479d;

    /* renamed from: e */
    public C19011a<C6599q> f14480e;

    /* renamed from: f */
    public C19011a<C6611t> f14481f;

    public C6544h(Context context) {
        if (context != null) {
            C6540c cVar = new C6540c(context);
            this.f14478c = cVar;
            this.f14479d = C6538a.m12922a(new C6534h(cVar, new C6531f(cVar)));
            C6540c cVar2 = this.f14478c;
            C19011a<C6599q> a = C6538a.m12922a(new C6602r(new C6610y(cVar2), new C6585e(cVar2)));
            this.f14480e = a;
            C6822f fVar = new C6822f();
            C6540c cVar3 = this.f14478c;
            C6823g gVar = new C6823g(cVar3, a, fVar);
            C19011a<Executor> aVar = this.f14477b;
            C19011a aVar2 = this.f14479d;
            this.f14481f = C6538a.m12922a(new C6613v(new C6820d(aVar, aVar2, gVar, a, a), new C6574j(cVar3, aVar2, a, gVar, aVar, a, a), new C6576l(aVar, a, gVar, a)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
