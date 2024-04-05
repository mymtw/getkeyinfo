package p473wc;

import com.etsy.android.lib.session.C8855a;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import p425q9.C13265p;
import p456ua.C13461f;
import p466vc.C13573c;
import p491ye.C13921e;
import p740eq.C19011a;

/* renamed from: wc.b */
public final class C13813b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f30427a;

    /* renamed from: b */
    public final C19011a f30428b;

    /* renamed from: c */
    public final C19011a f30429c;

    /* renamed from: d */
    public final C19011a f30430d;

    /* renamed from: e */
    public final C19011a f30431e;

    public /* synthetic */ C13813b(C19011a aVar, C17555d dVar, C19011a aVar2, C19011a aVar3, int i) {
        this.f30427a = i;
        this.f30428b = aVar;
        this.f30429c = dVar;
        this.f30430d = aVar2;
        this.f30431e = aVar3;
    }

    public final Object get() {
        switch (this.f30427a) {
            case 0:
                return new C13812a((C13573c) this.f30428b.get(), (C11786n) this.f30429c.get(), (C13265p) this.f30430d.get(), (C8855a) this.f30431e.get());
            default:
                return new UserBadgeCountManager(C17554c.m29426a(this.f30428b), (C13461f) this.f30429c.get(), C17554c.m29426a(this.f30430d), (C13921e) this.f30431e.get());
        }
    }
}
