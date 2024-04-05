package com.etsy.android.lib.logger.elk.uploading;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.listing.ListingViewModel;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.FetchRecommendationsIfNeededHandler;
import com.etsy.android.p327ui.user.purchases.C11651i;
import com.etsy.android.p327ui.user.purchases.C11652j;
import com.etsy.android.p327ui.user.purchases.PurchasesRepository;
import com.squareup.moshi.C17414y;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19179q;
import p340ea.C12658b;
import p361hc.C12810b;
import p402n9.C13093m;
import p456ua.C13461f;
import p456ua.C13462g;
import p459ud.C13490k;
import p464va.C13551d;
import p464va.C13552e;
import p466vc.C13573c;
import p486y9.C13886b;
import p491ye.C13919c;
import p491ye.C13920d;
import p491ye.C13921e;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.b */
public final class C8681b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19072a;

    /* renamed from: b */
    public final C19011a f19073b;

    /* renamed from: c */
    public final C19011a f19074c;

    /* renamed from: d */
    public final Object f19075d;

    public C8681b(C0761x xVar, C19011a aVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19072a = 6;
        this.f19075d = xVar;
        this.f19073b = aVar;
        this.f19074c = gVar;
    }

    public final Object get() {
        switch (this.f19072a) {
            case 0:
                return new C8680a((C12658b) this.f19073b.get(), (CrashUtil) this.f19074c.get(), (C8618c) ((C19011a) this.f19075d).get());
            case 1:
                return new C13552e((C13551d) this.f19073b.get(), (C8618c) this.f19074c.get(), (C17414y) ((C19011a) this.f19075d).get());
            case 2:
                return new ListingViewModel((C13461f) this.f19073b.get(), C17554c.m29426a(this.f19074c), (C8709f) ((C19011a) this.f19075d).get());
            case 3:
                return new FetchRecommendationsIfNeededHandler((C13490k) this.f19073b.get(), (C13461f) this.f19074c.get(), (C13573c) ((C19011a) this.f19075d).get());
            case 4:
                return new C13920d((C13919c) this.f19073b.get(), (C13921e) this.f19074c.get(), (C8890e0) ((C19011a) this.f19075d).get());
            case 5:
                return new PurchasesRepository((C11652j) this.f19073b.get(), (C17414y) this.f19074c.get(), (C11651i) ((C19011a) this.f19075d).get());
            default:
                C13886b bVar = (C13886b) this.f19073b.get();
                ((C0761x) this.f19075d).getClass();
                C19383o.m32797g(bVar, "config");
                C19383o.m32797g((C13461f) this.f19074c.get(), "schedulers");
                return new C19172m(new C19179q(new C19179q(bVar.mo46713a(), new C13093m(4)), new C12810b(3)).mo20635e(C13461f.m21236c()));
        }
    }

    public /* synthetic */ C8681b(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f19072a = i;
        this.f19073b = aVar;
        this.f19074c = aVar2;
        this.f19075d = aVar3;
    }
}
