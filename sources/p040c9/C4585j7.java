package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.giftcards.C9916f;
import com.etsy.android.p327ui.giftcards.C9917g;
import com.etsy.android.p327ui.giftcards.GiftCardCreateFragment;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p456ua.C13461f;
import p568fn.C17782b;

/* renamed from: c9.j7 */
public final class C4585j7 implements C17550a {

    /* renamed from: b */
    public final C17782b f10352b;

    /* renamed from: c */
    public final C4579j1 f10353c;

    public C4585j7(C4579j1 j1Var, C17782b bVar) {
        this.f10353c = j1Var;
        this.f10352b = bVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        GiftCardCreateFragment giftCardCreateFragment = (GiftCardCreateFragment) obj;
        giftCardCreateFragment.etsyMoneyFactory = this.f10353c.f10141N0.get();
        giftCardCreateFragment.userCurrency = this.f10353c.f10318u0.get();
        giftCardCreateFragment.currentLocale = this.f10353c.f10298q0.get();
        giftCardCreateFragment.session = (C13265p) this.f10353c.f10101F0.get();
        giftCardCreateFragment.schedulers = new C13461f();
        giftCardCreateFragment.cartBadgeCountRepo = this.f10353c.f10168S2.get();
        C17782b bVar = this.f10352b;
        C8731g gVar = (C8731g) this.f10353c.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        C9916f fVar = (C9916f) gVar.f19177a.mo74387b(C9916f.class);
        C17782b.m29841G(fVar);
        giftCardCreateFragment.giftCardRepository = new C9917g(fVar);
        giftCardCreateFragment.installInfo = this.f10353c.f10260j0.get();
        giftCardCreateFragment.configMap = this.f10353c.mo14404m();
        giftCardCreateFragment.cartRefreshEventManager = this.f10353c.f10310s2.get();
    }
}
