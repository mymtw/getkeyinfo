package p040c9;

import com.etsy.android.config.flags.events.C6367n;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.p327ui.listing.fetch.C10142f;
import com.etsy.android.p327ui.listing.p329ui.C10421h;
import com.etsy.android.p327ui.listing.p329ui.C10422i;
import com.etsy.android.p327ui.listing.p329ui.ListingSections;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p418pa.C13195a;
import p418pa.C13198d;
import p425q9.C13265p;
import p456ua.C13461f;
import p456ua.C13462g;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: c9.u */
public final class C4724u implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10680a = 0;

    /* renamed from: b */
    public final C19011a f10681b;

    /* renamed from: c */
    public final C19011a f10682c;

    /* renamed from: d */
    public final C19011a f10683d;

    /* renamed from: e */
    public final Object f10684e;

    public C4724u(C4479c cVar, C19011a aVar, C19011a aVar2) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f10684e = cVar;
        this.f10681b = aVar;
        this.f10682c = aVar2;
        this.f10683d = gVar;
    }

    public final Object get() {
        switch (this.f10680a) {
            case 0:
                ((C4479c) this.f10684e).getClass();
                return new C13198d((C13195a) this.f10681b.get(), (C8857c) this.f10682c.get(), (C13461f) this.f10683d.get());
            default:
                return new C10142f((C13573c) this.f10681b.get(), (C10421h) this.f10682c.get(), (C13265p) this.f10683d.get(), (ListingSections) ((C19011a) this.f10684e).get());
        }
    }

    public C4724u(C19011a aVar, C10422i iVar, C17553b bVar, C6367n nVar) {
        this.f10681b = aVar;
        this.f10682c = iVar;
        this.f10683d = bVar;
        this.f10684e = nVar;
    }
}
