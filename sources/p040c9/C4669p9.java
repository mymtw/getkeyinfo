package p040c9;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.core.ListingMapper;
import com.etsy.android.p327ui.user.C11358a;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.user.C11762u;
import com.etsy.android.p327ui.user.C11769z;
import com.etsy.android.p327ui.user.ReceiptFragment;
import com.etsy.android.util.C12043f;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p143i9.C7007f;
import p277w8.C8271i;
import p317bf.C8550a;
import p395ma.C13028a;
import p395ma.C13034d;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.p9 */
public final class C4669p9 implements C17550a {

    /* renamed from: b */
    public final C1993m f10486b;

    /* renamed from: c */
    public final C0005b f10487c;

    /* renamed from: d */
    public final C19421p f10488d;

    /* renamed from: e */
    public final C4579j1 f10489e;

    /* renamed from: f */
    public final C4690r4 f10490f;

    public C4669p9(C4579j1 j1Var, C4690r4 r4Var, C1993m mVar, C0005b bVar, C19421p pVar) {
        this.f10489e = j1Var;
        this.f10490f = r4Var;
        this.f10486b = mVar;
        this.f10487c = bVar;
        this.f10488d = pVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ReceiptFragment receiptFragment = (ReceiptFragment) obj;
        receiptFragment.schedulers = new C13461f();
        receiptFragment.listingRepository = C4579j1.m10256g(this.f10489e);
        receiptFragment.listingMapper = new ListingMapper(this.f10489e.f10141N0.get());
        receiptFragment.qualtricsWrapper = this.f10489e.f10117I1.get();
        receiptFragment.currentLocale = this.f10489e.f10298q0.get();
        receiptFragment.session = (C13265p) this.f10489e.f10101F0.get();
        C4579j1 j1Var = this.f10489e;
        C0761x xVar = j1Var.f10217c;
        C12043f fVar = j1Var.f10107G1.get();
        xVar.getClass();
        C19383o.m32797g(fVar, "appsFlyer");
        receiptFragment.eventTrack = fVar;
        C11358a a = C8271i.m16554a(this.f10486b, (C8731g) this.f10489e.f10091D0.get());
        C4579j1 j1Var2 = this.f10489e;
        C0761x xVar2 = j1Var2.f10217c;
        C12043f fVar2 = j1Var2.f10107G1.get();
        xVar2.getClass();
        C19383o.m32797g(fVar2, "appsFlyer");
        receiptFragment.addToCartRepository = new C11488b((C13265p) this.f10489e.f10101F0.get(), a, fVar2, C4579j1.m10252c(this.f10489e), this.f10489e.f10310s2.get());
        receiptFragment.installInfo = this.f10489e.f10260j0.get();
        receiptFragment.cartBadgeCountRepo = this.f10489e.f10168S2.get();
        C0005b bVar = this.f10487c;
        C8731g gVar = (C8731g) this.f10489e.f10091D0.get();
        bVar.getClass();
        C19383o.m32797g(gVar, "moshiRetrofit");
        Object b = gVar.f19177a.mo74387b(C11762u.class);
        C19383o.m32796f(b, "moshiRetrofit.v3moshiRet…eiptEndpoint::class.java)");
        receiptFragment.receiptRepository = new C11769z((C11762u) b, new C8550a(this.f10489e.f10141N0.get()), this.f10489e.f10146O0.get());
        C19421p pVar = this.f10488d;
        C8731g gVar2 = (C8731g) this.f10489e.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar2, "v3MoshiRetrofit");
        Object b2 = gVar2.f19177a.mo74387b(C13028a.class);
        C19383o.m32796f(b2, "v3MoshiRetrofit.v3moshiR…mentEndpoint::class.java)");
        receiptFragment.paymentRepository = new C13034d((C13028a) b2, this.f10489e.f10146O0.get());
        receiptFragment.reviewPromptEligibility = new C7007f(this.f10489e.f10248h0.get(), C4690r4.m10336a(this.f10490f), this.f10489e.f10090D.get());
        receiptFragment.favoriteRepository = this.f10489e.mo14405n();
    }
}
