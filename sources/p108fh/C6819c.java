package p108fh;

import android.support.p013v4.media.C0073e;
import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.C6611t;
import com.google.android.datatransport.runtime.backends.C6526b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6577m;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p120gh.C6898a;

/* renamed from: fh.c */
public final class C6819c implements C6821e {

    /* renamed from: f */
    public static final Logger f15010f = Logger.getLogger(C6611t.class.getName());

    /* renamed from: a */
    public final C6577m f15011a;

    /* renamed from: b */
    public final Executor f15012b;

    /* renamed from: c */
    public final C6526b f15013c;

    /* renamed from: d */
    public final C6580b f15014d;

    /* renamed from: e */
    public final C6898a f15015e;

    public C6819c(Executor executor, C6526b bVar, C6577m mVar, C6580b bVar2, C6898a aVar) {
        this.f15012b = executor;
        this.f15013c = bVar;
        this.f15011a = mVar;
        this.f15014d = bVar2;
        this.f15015e = aVar;
    }

    /* renamed from: a */
    public final void mo18938a(C0073e eVar, C6547k kVar, C6556p pVar) {
        this.f15012b.execute(new C6817a(this, pVar, eVar, kVar));
    }
}
