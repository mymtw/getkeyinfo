package p499zd;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.oauth2.C8767q;
import com.etsy.android.lib.network.oauth2.C8768r;
import com.etsy.android.lib.requests.LocaleRequest;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.lib.session.C8858d;
import com.etsy.android.lib.session.SessionRepository;
import com.etsy.android.p327ui.user.auth.C11473a;
import com.etsy.android.p327ui.user.auth.C11474b;
import com.etsy.android.p327ui.user.auth.C11477e;
import dagger.internal.C17555d;
import dagger.internal.C17556e;
import p040c9.C4591k;
import p402n9.C13097q;
import p402n9.C13098r;
import p456ua.C13461f;
import p456ua.C13462g;
import p471wa.C13797a;
import p740eq.C19011a;

/* renamed from: zd.f */
public final class C13959f implements C17555d<C13957e> {

    /* renamed from: a */
    public final C19011a<C8767q> f30692a;

    /* renamed from: b */
    public final C19011a<C13797a> f30693b;

    /* renamed from: c */
    public final C19011a<C11473a> f30694c;

    /* renamed from: d */
    public final C19011a<C13461f> f30695d;

    /* renamed from: e */
    public final C19011a<C11477e> f30696e;

    /* renamed from: f */
    public final C19011a<C8618c> f30697f;

    /* renamed from: g */
    public final C19011a<C8857c> f30698g;

    /* renamed from: h */
    public final C19011a<SessionRepository> f30699h;

    /* renamed from: i */
    public final C19011a<C13097q> f30700i;

    /* renamed from: j */
    public final C19011a<LocaleRequest> f30701j;

    public C13959f(C8768r rVar, C19011a aVar, C11474b bVar, C17556e eVar, C4591k kVar, C19011a aVar2, C8858d dVar, C13098r rVar2, C19011a aVar3) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f30692a = rVar;
        this.f30693b = aVar;
        this.f30694c = bVar;
        this.f30695d = gVar;
        this.f30696e = eVar;
        this.f30697f = kVar;
        this.f30698g = aVar2;
        this.f30699h = dVar;
        this.f30700i = rVar2;
        this.f30701j = aVar3;
    }

    public final Object get() {
        return new C13957e(this.f30692a.get(), this.f30693b.get(), this.f30694c.get(), this.f30695d.get(), this.f30696e.get(), this.f30697f.get(), this.f30698g.get(), this.f30699h.get(), this.f30700i.get(), this.f30701j.get());
    }
}
