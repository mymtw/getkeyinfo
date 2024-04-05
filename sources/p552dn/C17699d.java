package p552dn;

import com.etsy.android.lib.dagger.C8643c;
import com.etsy.android.lib.dagger.C8646e;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8648g;
import com.etsy.android.lib.logger.perf.C8705b;
import com.google.android.datatransport.C6518e;
import com.google.firebase.installations.C16563d;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.C17555d;
import p040c9.C4633n;
import p040c9.C4685r;
import p575gm.C17793c;
import p632nn.C18281g;
import p722ym.C18895a;
import p740eq.C19011a;

/* renamed from: dn.d */
public final class C17699d implements C17555d<C17697b> {

    /* renamed from: a */
    public final C19011a<C17793c> f38499a;

    /* renamed from: b */
    public final C19011a<C18895a<C18281g>> f38500b;

    /* renamed from: c */
    public final C19011a<C16563d> f38501c;

    /* renamed from: d */
    public final C19011a<C18895a<C6518e>> f38502d;

    /* renamed from: e */
    public final C19011a<RemoteConfigManager> f38503e;

    /* renamed from: f */
    public final C19011a<C16594a> f38504f;

    /* renamed from: g */
    public final C19011a<SessionManager> f38505g;

    public C17699d(C4633n nVar, C8647f fVar, C8646e eVar, C4685r rVar, C8648g gVar, C8643c cVar, C8705b bVar) {
        this.f38499a = nVar;
        this.f38500b = fVar;
        this.f38501c = eVar;
        this.f38502d = rVar;
        this.f38503e = gVar;
        this.f38504f = cVar;
        this.f38505g = bVar;
    }

    public final Object get() {
        return new C17697b(this.f38499a.get(), this.f38500b.get(), this.f38501c.get(), this.f38502d.get(), this.f38503e.get(), this.f38504f.get(), this.f38505g.get());
    }
}
