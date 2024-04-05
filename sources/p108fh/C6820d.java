package p108fh;

import com.google.android.datatransport.runtime.backends.C6526b;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6577m;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import java.util.concurrent.Executor;
import p120gh.C6898a;
import p740eq.C19011a;

/* renamed from: fh.d */
public final class C6820d implements C6539b<C6819c> {

    /* renamed from: a */
    public final C19011a<Executor> f15016a;

    /* renamed from: b */
    public final C19011a<C6526b> f15017b;

    /* renamed from: c */
    public final C19011a<C6577m> f15018c;

    /* renamed from: d */
    public final C19011a<C6580b> f15019d;

    /* renamed from: e */
    public final C19011a<C6898a> f15020e;

    public C6820d(C19011a aVar, C19011a aVar2, C6823g gVar, C19011a aVar3, C19011a aVar4) {
        this.f15016a = aVar;
        this.f15017b = aVar2;
        this.f15018c = gVar;
        this.f15019d = aVar3;
        this.f15020e = aVar4;
    }

    public final Object get() {
        return new C6819c(this.f15016a.get(), this.f15017b.get(), this.f15018c.get(), this.f15019d.get(), this.f15020e.get());
    }
}
