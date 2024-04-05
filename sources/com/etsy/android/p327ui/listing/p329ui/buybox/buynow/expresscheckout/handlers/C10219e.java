package com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.C8727d;
import com.etsy.android.lib.network.C8729e;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.p329ui.C10421h;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers.C10345d;
import com.google.android.play.core.appupdate.C15560b;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import java.util.Objects;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20009t;
import p361hc.C12811c;
import p456ua.C13461f;
import p466vc.C13573c;
import p475we.C13825a;
import p475we.C13826b;
import p475we.C13827c;
import p475we.C13831g;
import p740eq.C19011a;
import p765pr.C20068g;
import p769rr.C20164a;
import retrofit2.C20146w;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.buynow.expresscheckout.handlers.e */
public final class C10219e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22477a;

    /* renamed from: b */
    public final C19011a f22478b;

    /* renamed from: c */
    public final C19011a f22479c;

    /* renamed from: d */
    public final C19011a f22480d;

    /* renamed from: e */
    public final Object f22481e;

    public /* synthetic */ C10219e(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, int i) {
        this.f22477a = i;
        this.f22478b = aVar;
        this.f22479c = aVar2;
        this.f22480d = aVar3;
        this.f22481e = aVar4;
    }

    public final Object get() {
        switch (this.f22477a) {
            case 0:
                return new FetchSingleListingCartHandler((C12811c) this.f22478b.get(), (C10101d) this.f22479c.get(), (C13461f) this.f22480d.get(), (C13573c) ((C19011a) this.f22481e).get());
            case 1:
                return new C10345d((C10421h) this.f22478b.get(), (C10156h) this.f22479c.get(), (C8890e0) this.f22480d.get(), (C9684a) ((C19011a) this.f22481e).get());
            case 2:
                return new C13831g((C15560b) this.f22478b.get(), (C13825a) this.f22479c.get(), (C13826b) this.f22480d.get(), (C13827c) ((C19011a) this.f22481e).get());
            default:
                C8618c cVar = (C8618c) this.f22478b.get();
                C8729e eVar = (C8729e) this.f22479c.get();
                C20164a aVar = (C20164a) this.f22480d.get();
                ((C15588c1) this.f22481e).getClass();
                C19383o.m32797g(cVar, "config");
                C19383o.m32797g(eVar, "client");
                C19383o.m32797g(aVar, "moshiConverterFactory");
                String f = cVar.mo21136f(C8592b.f18822q0);
                C19383o.m32794d(f);
                C20146w.C20148b bVar = new C20146w.C20148b();
                C20009t tVar = eVar.f19175a;
                Objects.requireNonNull(tVar, "client == null");
                bVar.f44628b = tVar;
                bVar.mo74393a(new C20068g());
                bVar.f44630d.add(aVar);
                bVar.mo74394b(f);
                return new C8727d(bVar.mo74395c());
        }
    }

    public C10219e(C15588c1 c1Var, C19011a aVar, C19011a aVar2, C19011a aVar3) {
        this.f22477a = 3;
        this.f22481e = c1Var;
        this.f22478b = aVar;
        this.f22479c = aVar2;
        this.f22480d = aVar3;
    }
}
