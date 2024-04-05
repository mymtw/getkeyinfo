package p108fh;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6566b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6577m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import p132hh.C6963a;
import p132hh.C6966c;
import p740eq.C19011a;

/* renamed from: fh.g */
public final class C6823g implements C6539b<C6577m> {

    /* renamed from: a */
    public final C19011a<Context> f15022a;

    /* renamed from: b */
    public final C19011a<C6580b> f15023b;

    /* renamed from: c */
    public final C19011a<SchedulerConfig> f15024c;

    /* renamed from: d */
    public final C19011a<C6963a> f15025d;

    public C6823g(C19011a aVar, C19011a aVar2, C6822f fVar) {
        C6966c cVar = C6966c.C6967a.f15450a;
        this.f15022a = aVar;
        this.f15023b = aVar2;
        this.f15024c = fVar;
        this.f15025d = cVar;
    }

    public final Object get() {
        C6963a aVar = this.f15025d.get();
        return new C6566b(this.f15022a.get(), this.f15023b.get(), this.f15024c.get());
    }
}
