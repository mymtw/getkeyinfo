package p040c9;

import android.content.IntentFilter;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.config.flags.C6347e;
import com.etsy.android.config.flags.C6381j;
import com.etsy.android.config.flags.events.C6367n;
import com.etsy.android.config.flags.p073ui.search.C6414f;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6426e;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.C8631c;
import com.etsy.android.lib.currency.C8633e;
import com.etsy.android.lib.dagger.C8641a;
import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8653l;
import com.etsy.android.lib.dagger.C8655n;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.elk.uploading.C8681b;
import com.etsy.android.lib.logger.elk.uploading.C8691k;
import com.etsy.android.lib.logger.perf.C8705b;
import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.lib.network.C8738n;
import com.etsy.android.lib.network.C8814x;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.network.oauth2.C8745a0;
import com.etsy.android.lib.network.oauth2.C8757g0;
import com.etsy.android.lib.network.oauth2.signin.C8777f;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.network.oauth2.signin.C8789p;
import com.etsy.android.lib.push.registration.C8832e;
import com.etsy.android.lib.push.registration.C8836i;
import com.etsy.android.lib.requests.apiv3.ShippingDetailsModule;
import com.etsy.android.lib.requests.apiv3.ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory;
import com.etsy.android.lib.session.C8856b;
import com.etsy.android.lib.user.C8863b;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.cart.C9268c0;
import com.etsy.android.p327ui.cart.C9310h;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.cart.googlepay.C9304b;
import com.etsy.android.p327ui.core.C9615c;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9685b;
import com.etsy.android.p327ui.favorites.C9793c;
import com.etsy.android.p327ui.favorites.C9898w;
import com.etsy.android.p327ui.favorites.add.C9791z;
import com.etsy.android.p327ui.listing.C10097b;
import com.etsy.android.p327ui.listing.C10100c;
import com.etsy.android.p327ui.listing.C10103f;
import com.etsy.android.p327ui.listing.C10155g;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.listing.C10189i;
import com.etsy.android.p327ui.listing.ListingFragment;
import com.etsy.android.p327ui.listing.fetch.C10140d;
import com.etsy.android.p327ui.listing.fetch.C10150l;
import com.etsy.android.p327ui.listing.p329ui.C10422i;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.AddToCartInterstitialHelper;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10211k;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10218d;
import com.etsy.android.p327ui.listing.p329ui.buybox.buynow.expresscheckout.handlers.C10219e;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10234d;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers.C10239i;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10332f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10576c;
import com.etsy.android.p327ui.listing.p329ui.recommendations.handlers.C10632e;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.favoriting.C10638b;
import com.etsy.android.p327ui.listing.screenshots.ListingScreenScreenshotObserver;
import com.etsy.android.p327ui.listing.util.ListingGlobalLayoutListener;
import com.etsy.android.p327ui.sdl.C10720c;
import com.etsy.android.p327ui.sdl.C10721d;
import com.etsy.android.qualtrics.QualtricsConfiguration;
import com.etsy.android.search.C8972d;
import com.etsy.android.search.savedsearch.C8977c;
import dagger.android.C17550a;
import dagger.internal.C17553b;
import dagger.internal.C17554c;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19383o;
import p084d9.C6672b;
import p251u1.C8115a;
import p277w8.C8269g;
import p277w8.C8270h;
import p277w8.C8271i;
import p277w8.C8275m;
import p309ad.C8505b;
import p309ad.C8506c;
import p334da.C12640i;
import p340ea.C12673n;
import p346fa.C12703a;
import p357gf.C12796e;
import p369id.C12933b;
import p394m9.C13027b;
import p405nc.C13110a;
import p409o9.C13129i;
import p410oa.C13146f;
import p413od.C13161e;
import p425q9.C13253e;
import p456ua.C13461f;
import p456ua.C13462g;
import p459ud.C13483f;
import p459ud.C13484g;
import p463v9.C13543f;
import p466vc.C13573c;
import p466vc.C13596f;
import p470w9.C13795c;
import p473wc.C13813b;
import p487ya.C13895a;
import p489yc.C13904c;
import p490yd.C13913a;
import p496za.C13943a;
import p498zc.C13946a;
import p498zc.C13947b;
import p498zc.C13948c;
import p514bk.C14088a;
import p568fn.C17782b;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: c9.d8 */
public final class C4502d8 implements C17550a {

    /* renamed from: A */
    public C8789p f9819A;

    /* renamed from: A1 */
    public C6367n f9820A1;

    /* renamed from: B */
    public C6367n f9821B;

    /* renamed from: B1 */
    public C8782j f9822B1;

    /* renamed from: C */
    public C8642b f9823C;

    /* renamed from: C1 */
    public C8757g0 f9824C1;

    /* renamed from: D */
    public C6672b f9825D;

    /* renamed from: D1 */
    public C8642b f9826D1;

    /* renamed from: E */
    public C6381j f9827E;

    /* renamed from: E1 */
    public C6367n f9828E1;

    /* renamed from: F */
    public C9615c f9829F;

    /* renamed from: F1 */
    public C6672b f9830F1;

    /* renamed from: G */
    public C13129i f9831G;

    /* renamed from: G1 */
    public C6426e f9832G1;

    /* renamed from: H */
    public C4493d f9833H;

    /* renamed from: H1 */
    public C4493d f9834H1;

    /* renamed from: I */
    public C9615c f9835I;

    /* renamed from: I1 */
    public C13129i f9836I1;

    /* renamed from: J */
    public C8705b f9837J;

    /* renamed from: J1 */
    public C9898w f9838J1;

    /* renamed from: K */
    public C13129i f9839K;

    /* renamed from: K1 */
    public C10218d f9840K1;

    /* renamed from: L */
    public C6419c f9841L;

    /* renamed from: L1 */
    public C10219e f9842L1;

    /* renamed from: M */
    public C6414f f9843M;

    /* renamed from: M1 */
    public C13543f f9844M1;

    /* renamed from: N */
    public C6426e f9845N;

    /* renamed from: N1 */
    public C8681b f9846N1;

    /* renamed from: O */
    public C13543f f9847O;

    /* renamed from: O1 */
    public C4493d f9848O1;

    /* renamed from: P */
    public C12640i f9849P;

    /* renamed from: P1 */
    public C8782j f9850P1;

    /* renamed from: Q */
    public C10234d f9851Q;

    /* renamed from: Q1 */
    public C8633e f9852Q1;

    /* renamed from: R */
    public C13543f f9853R;

    /* renamed from: R1 */
    public C10632e f9854R1;

    /* renamed from: S */
    public C9791z f9855S;

    /* renamed from: S1 */
    public C8814x f9856S1;

    /* renamed from: T */
    public C6426e f9857T;

    /* renamed from: T1 */
    public C6381j f9858T1;

    /* renamed from: U1 */
    public C13027b f9859U1;

    /* renamed from: V */
    public C8705b f9860V;

    /* renamed from: V1 */
    public C13795c f9861V1;

    /* renamed from: W */
    public C8832e f9862W;

    /* renamed from: W1 */
    public C8777f f9863W1;

    /* renamed from: X */
    public C8814x f9864X;

    /* renamed from: X1 */
    public C9793c f9865X1;

    /* renamed from: Y */
    public C13795c f9866Y;

    /* renamed from: Y1 */
    public C8691k f9867Y1;

    /* renamed from: Z */
    public C8633e f9868Z;

    /* renamed from: Z1 */
    public C8641a f9869Z1;

    /* renamed from: a2 */
    public C6367n f9870a2;

    /* renamed from: b */
    public final C14088a f9871b;

    /* renamed from: b2 */
    public C6672b f9872b2;

    /* renamed from: c */
    public final ListingFragment f9873c;

    /* renamed from: c2 */
    public C10239i f9874c2;

    /* renamed from: d */
    public final C4579j1 f9875d;

    /* renamed from: d2 */
    public C10219e f9876d2;

    /* renamed from: e */
    public final C4690r4 f9877e;

    /* renamed from: e2 */
    public C8642b f9878e2;

    /* renamed from: f */
    public C17556e f9879f;

    /* renamed from: f2 */
    public C10218d f9880f2;

    /* renamed from: g */
    public C8270h f9881g;

    /* renamed from: g2 */
    public C8641a f9882g2;

    /* renamed from: h */
    public C8269g f9883h;

    /* renamed from: h2 */
    public C8782j f9884h2;

    /* renamed from: i */
    public C9304b f9885i;

    /* renamed from: i2 */
    public C8705b f9886i2;

    /* renamed from: j */
    public C6672b f9887j;

    /* renamed from: j1 */
    public C8745a0 f9888j1;

    /* renamed from: j2 */
    public C8681b f9889j2;

    /* renamed from: k */
    public C19011a<C8710g> f9890k;

    /* renamed from: k0 */
    public C4493d f9891k0;

    /* renamed from: k1 */
    public C6414f f9892k1;

    /* renamed from: k2 */
    public C10155g f9893k2;

    /* renamed from: l */
    public C10140d f9894l;

    /* renamed from: l1 */
    public C13543f f9895l1;

    /* renamed from: l2 */
    public C10103f f9896l2;

    /* renamed from: m */
    public C9615c f9897m;

    /* renamed from: m1 */
    public C6419c f9898m1;

    /* renamed from: m2 */
    public C4633n f9899m2;

    /* renamed from: n */
    public C8738n f9900n;

    /* renamed from: n1 */
    public C6426e f9901n1;

    /* renamed from: n2 */
    public C19011a<C13483f> f9902n2;

    /* renamed from: o */
    public C4724u f9903o;

    /* renamed from: o1 */
    public C8832e f9904o1;

    /* renamed from: o2 */
    public C19011a<C10097b> f9905o2;

    /* renamed from: p */
    public C10150l f9906p;

    /* renamed from: p1 */
    public C8705b f9907p1;

    /* renamed from: p2 */
    public C4619m f9908p2;

    /* renamed from: q */
    public C13253e f9909q;

    /* renamed from: q1 */
    public C10638b f9910q1;

    /* renamed from: r */
    public C6426e f9911r;

    /* renamed from: r1 */
    public C6419c f9912r1;

    /* renamed from: s */
    public C13027b f9913s;

    /* renamed from: s1 */
    public C6414f f9914s1;

    /* renamed from: t */
    public C6367n f9915t;

    /* renamed from: t1 */
    public C13543f f9916t1;

    /* renamed from: u */
    public C8972d f9917u;

    /* renamed from: u1 */
    public C13813b f9918u1;

    /* renamed from: v */
    public C8856b f9919v;

    /* renamed from: v1 */
    public C8705b f9920v1;

    /* renamed from: w */
    public C8642b f9921w;

    /* renamed from: w1 */
    public C8642b f9922w1;

    /* renamed from: x */
    public C6414f f9923x;

    /* renamed from: x1 */
    public C13543f f9924x1;

    /* renamed from: y */
    public C6672b f9925y;

    /* renamed from: y1 */
    public C8832e f9926y1;

    /* renamed from: z */
    public C8863b f9927z;

    /* renamed from: z1 */
    public C6414f f9928z1;

    public C4502d8(C4579j1 j1Var, C4690r4 r4Var, C14088a aVar, C18263b bVar, ShippingDetailsModule shippingDetailsModule, C1993m mVar, C18263b bVar2, C13110a aVar2, ListingFragment listingFragment) {
        C4579j1 j1Var2 = j1Var;
        C4690r4 r4Var2 = r4Var;
        C14088a aVar3 = aVar;
        this.f9875d = j1Var2;
        this.f9877e = r4Var2;
        this.f9871b = aVar3;
        this.f9873c = listingFragment;
        C17556e a = C17556e.m29429a(listingFragment);
        this.f9879f = a;
        this.f9881g = new C8270h(aVar3, a, 1);
        this.f9883h = new C8269g(aVar3, a, 7);
        this.f9885i = new C9304b(j1Var2.f10085C, j1Var2.f10212b0, j1Var2.f10131L0, j1Var2.f10308s0, j1Var2.f10272l0, 0);
        this.f9887j = new C6672b(r4Var2.f10568Y1, 5);
        C19011a<C8710g> b = C17554c.m29427b(new C6347e(aVar3, a, 4));
        this.f9890k = b;
        C8270h hVar = this.f9881g;
        C8269g gVar = this.f9883h;
        C9304b bVar3 = this.f9885i;
        C6672b bVar4 = this.f9887j;
        C9268c0 c0Var = j1Var2.f10311s3;
        C10140d dVar = r9;
        C13462g gVar2 = C13462g.C13463a.f29482a;
        C9268c0 c0Var2 = c0Var;
        C6672b bVar5 = bVar4;
        C10140d dVar2 = new C10140d(hVar, gVar, bVar3, bVar4, c0Var, gVar2, b, 0);
        this.f9894l = dVar;
        this.f9897m = new C9615c(hVar, 2);
        this.f9900n = new C8738n(hVar, 1);
        C8275m mVar2 = j1Var2.f10234e4;
        C19011a<C8630b> aVar4 = j1Var2.f10141N0;
        C19011a<C8890e0> aVar5 = j1Var2.f10248h0;
        C8782j jVar = j1Var2.f10172T1;
        C8856b bVar6 = j1Var2.f10316t3;
        C9685b bVar7 = C9685b.C9686a.f21450a;
        C10422i iVar = new C10422i(bVar5, mVar2, aVar4, aVar5, jVar, bVar6);
        C6672b bVar8 = bVar5;
        C6367n nVar = new C6367n(bVar8, 5);
        C17553b bVar9 = j1Var2.f10101F0;
        this.f9903o = new C4724u(hVar, iVar, bVar9, nVar);
        C19011a<C12673n> aVar6 = j1Var2.f10131L0;
        C19011a<C8694h> aVar7 = j1Var2.f10212b0;
        C19011a<Connectivity> aVar8 = j1Var2.f10086C0;
        C17553b bVar10 = j1Var2.f10308s0;
        C4591k kVar = j1Var2.f10278m0;
        this.f9906p = new C10150l(aVar6, aVar7, aVar8, bVar10, kVar, 0);
        this.f9909q = new C13253e(bVar8, hVar, 1);
        this.f9911r = new C6426e(hVar, 6);
        this.f9913s = new C13027b(hVar, 4);
        this.f9915t = new C6367n(bVar8, 8);
        C17553b bVar11 = j1Var2.f10091D0;
        C19011a<Connectivity> aVar9 = aVar8;
        C13027b bVar12 = new C13027b(new C4591k(bVar2, bVar11, 2), 3);
        C8972d dVar3 = r9;
        C17553b bVar13 = bVar10;
        C10422i iVar2 = iVar;
        C17553b bVar14 = bVar11;
        C8270h hVar2 = hVar;
        C19011a<C8694h> aVar10 = aVar7;
        C8269g gVar3 = gVar;
        C17553b bVar15 = bVar9;
        C8972d dVar4 = new C8972d(bVar12, gVar2, hVar2, gVar3, 1);
        this.f9917u = dVar3;
        this.f9919v = new C8856b(jVar, hVar, 4);
        this.f9921w = new C8642b(bVar8, 8);
        this.f9923x = new C6414f(bVar8, 4);
        this.f9925y = new C6672b(hVar, 8);
        C13027b bVar16 = bVar12;
        this.f9927z = new C8863b(bVar16, hVar, gVar, 1);
        C6672b bVar17 = bVar8;
        C8789p pVar = r9;
        C8789p pVar2 = new C8789p(bVar16, gVar2, hVar2, gVar3, 1);
        this.f9819A = pVar;
        this.f9821B = new C6367n(hVar, 9);
        this.f9823C = new C8642b(hVar, 9);
        this.f9825D = new C6672b(hVar, 7);
        this.f9827E = new C6381j(hVar, 3);
        this.f9829F = new C9615c(hVar, 3);
        this.f9831G = new C13129i(hVar, aVar10, 4);
        this.f9833H = new C4493d(hVar, 3);
        this.f9835I = new C9615c(hVar, 5);
        this.f9837J = new C8705b(hVar, 4);
        this.f9839K = new C13129i(hVar, jVar, 6);
        this.f9841L = new C6419c(hVar, 9);
        this.f9843M = new C6414f(hVar, 6);
        this.f9845N = new C6426e(hVar, 8);
        this.f9847O = new C13543f(hVar, 8);
        this.f9849P = new C12640i(hVar, aVar10, 6);
        C17553b bVar18 = bVar14;
        C8271i iVar3 = new C8271i(mVar, bVar18, 7);
        C4619m mVar3 = j1Var2.f10099E3;
        C8782j jVar2 = jVar;
        C19011a<C8694h> aVar11 = aVar10;
        C17553b bVar19 = bVar18;
        C19011a<C9323l> aVar12 = j1Var2.f10310s2;
        C19011a<C12673n> aVar13 = aVar6;
        C8836i iVar4 = new C8836i(bVar15, iVar3, mVar3, jVar2, aVar12, 1);
        C8270h hVar3 = hVar;
        C17553b bVar20 = bVar15;
        C8836i iVar5 = iVar4;
        C6672b bVar21 = bVar17;
        this.f9851Q = new C10234d(hVar3, bVar20, j1Var2.f10260j0, iVar5, j1Var2.f10168S2, gVar, jVar2, kVar, 0);
        C17553b bVar22 = bVar15;
        this.f9853R = new C13543f(bVar22, 5);
        C4493d dVar5 = new C4493d(j1Var2.f10102F1, 8);
        this.f9855S = new C9791z(dVar5, hVar, 2);
        C13904c cVar = C13904c.C13905a.f30566a;
        this.f9857T = new C6426e(cVar, 4);
        this.f9860V = new C8705b(hVar, 3);
        this.f9862W = new C8832e(cVar, 3);
        C6419c cVar2 = j1Var2.f10240f4;
        this.f9864X = new C8814x(hVar, cVar2, 3);
        this.f9866Y = new C13795c(hVar, 3);
        this.f9868Z = new C8633e(hVar, dVar5, 2);
        this.f9891k0 = new C4493d(dVar5, 4);
        this.f9888j1 = new C8745a0(bVar22, hVar, 2);
        this.f9892k1 = new C6414f(hVar, 2);
        this.f9895l1 = new C13543f(cVar2, 3);
        this.f9898m1 = new C6419c(dVar5, 6);
        this.f9901n1 = new C6426e(hVar, 2);
        this.f9904o1 = new C8832e(hVar, 2);
        this.f9907p1 = new C8705b(hVar, 2);
        C6419c cVar3 = cVar2;
        C4493d dVar6 = dVar5;
        this.f9910q1 = new C10638b(bVar22, j1Var2.f10124J3, gVar, j1Var2.f10198Y2, hVar);
        this.f9912r1 = new C6419c(hVar, 7);
        this.f9914s1 = new C6414f(hVar, 3);
        this.f9916t1 = new C13543f(hVar, 4);
        this.f9918u1 = new C13813b(hVar, jVar2, bVar22, j1Var2.f10196Y0, 0);
        this.f9920v1 = new C8705b(hVar, 7);
        this.f9922w1 = new C8642b(hVar, 10);
        this.f9924x1 = new C13543f(hVar, 7);
        this.f9926y1 = new C8832e(hVar, 5);
        this.f9928z1 = new C6414f(hVar, 5);
        this.f9820A1 = new C6367n(hVar, 4);
        this.f9822B1 = new C8782j(hVar, 3);
        C8782j jVar3 = jVar2;
        this.f9824C1 = new C8757g0(jVar3, hVar, 1);
        this.f9826D1 = new C8642b(hVar, 7);
        this.f9828E1 = new C6367n(hVar, 6);
        this.f9830F1 = new C6672b(j1Var2.f10251h3, 6);
        this.f9832G1 = new C6426e(hVar, 5);
        this.f9834H1 = new C4493d(hVar, 5);
        this.f9836I1 = new C13129i(aVar9, hVar, 5);
        C8269g gVar4 = gVar;
        C8269g gVar5 = gVar;
        C8782j jVar4 = jVar3;
        this.f9838J1 = new C9898w(c0Var2, hVar, gVar2, gVar4, 1);
        this.f9840K1 = new C10218d(dVar6, jVar4, 1);
        this.f9842L1 = new C10219e(iVar2, bVar21, aVar5, bVar7, 1);
        this.f9844M1 = new C13543f(dVar6, 6);
        C13462g gVar6 = gVar2;
        this.f9846N1 = new C8681b(new C6672b(new C6347e(aVar2, bVar19, 5), 10), gVar6, hVar, 3);
        this.f9848O1 = new C4493d(hVar, 6);
        this.f9850P1 = new C8782j(hVar, 4);
        this.f9852Q1 = new C8633e(hVar, new C4493d(aVar3, 11), 3);
        C8269g gVar7 = gVar5;
        this.f9854R1 = new C10632e(j1Var2.f10331w3, gVar7, aVar13, aVar11);
        C6672b bVar23 = bVar21;
        this.f9856S1 = new C8814x(hVar, bVar23, 4);
        this.f9858T1 = new C6381j(hVar, 5);
        this.f9859U1 = new C13027b(hVar, 5);
        this.f9861V1 = new C13795c(hVar, 4);
        C8655n nVar2 = r4Var.f10568Y1;
        this.f9863W1 = new C8777f(hVar, nVar2, 2);
        this.f9865X1 = new C9793c(nVar2, 1);
        this.f9867Y1 = new C8691k(hVar, C12933b.C12934a.f28496a, C10332f.C10333a.f22673a, 3);
        this.f9869Z1 = new C8641a(hVar, 4);
        this.f9870a2 = new C6367n(jVar4, 7);
        this.f9872b2 = new C6672b(hVar, 9);
        this.f9874c2 = new C10239i(hVar, cVar3, 0);
        this.f9876d2 = new C10219e(new C8641a(new C8653l(bVar, bVar19, 4), 1), gVar7, gVar6, hVar, 0);
        this.f9878e2 = new C8642b(bVar13, 6);
        this.f9880f2 = new C10218d(hVar, bVar23, 0);
        this.f9882g2 = new C8641a(dVar6, 3);
        this.f9884h2 = new C8782j(hVar, 5);
        this.f9886i2 = new C8705b(hVar, 5);
        ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory create = ShippingDetailsModule_ProvidesShippingDetailsEndpointFactory.create(shippingDetailsModule, bVar19);
        C17553b bVar24 = j1Var2.f10101F0;
        C8745a0 a0Var = new C8745a0(create, bVar24, 1);
        C8270h hVar4 = this.f9881g;
        C8269g gVar8 = this.f9883h;
        C19011a<C13943a> aVar14 = j1Var2.f10090D;
        C10576c cVar4 = r8;
        C10576c cVar5 = new C10576c(hVar4, gVar8, a0Var, aVar14);
        C6381j jVar5 = r5;
        C6381j jVar6 = new C6381j(hVar4, 4);
        C6426e eVar = r5;
        C6426e eVar2 = new C6426e(hVar4, 7);
        C13795c cVar6 = r5;
        C13795c cVar7 = new C13795c(hVar4, 5);
        C8506c cVar8 = C8506c.C8507a.f18526a;
        C8782j jVar7 = j1Var2.f10172T1;
        C13146f fVar = r9;
        C13146f fVar2 = new C13146f(cVar8, jVar7, hVar4, 2);
        C8631c cVar9 = r133;
        C8631c cVar10 = new C8631c(gVar6, gVar8, hVar4, j1Var2.f10108G2, 1);
        C9793c cVar11 = r5;
        C9793c cVar12 = new C9793c(hVar4, 2);
        C8977c cVar13 = r5;
        C8977c cVar14 = new C8977c(jVar7, hVar4, 2);
        C8782j jVar8 = r5;
        C8782j jVar9 = new C8782j(aVar14, 6);
        C8705b bVar25 = r5;
        C8705b bVar26 = new C8705b(hVar4, 6);
        C6419c cVar15 = r5;
        C6419c cVar16 = new C6419c(hVar4, 8);
        C8856b bVar27 = r5;
        C8856b bVar28 = new C8856b(bVar24, hVar4, 3);
        C6426e eVar3 = r4;
        C6426e eVar4 = new C6426e(hVar4, 3);
        C4493d dVar7 = r4;
        C4493d dVar8 = new C4493d(hVar4, 7);
        C9615c cVar17 = r4;
        C9615c cVar18 = new C9615c(hVar4, 4);
        C8832e eVar5 = r4;
        C8832e eVar6 = new C8832e(hVar4, 4);
        C8757g0 g0Var = r4;
        C8757g0 g0Var2 = new C8757g0(hVar4, new C8691k(j1Var2.f10314t1, j1Var2.f10139M3, j1Var2.f10114H3, 1), 2);
        C6672b bVar29 = this.f9887j;
        C9310h hVar5 = r6;
        C9310h hVar6 = new C9310h(hVar4, bVar29, 2);
        C9615c cVar19 = r6;
        C9615c cVar20 = new C9615c(j1Var2.f10246g4, 6);
        this.f9889j2 = new C8681b(gVar6, new C13596f(this.f9894l, this.f9897m, this.f9900n, this.f9903o, this.f9906p, this.f9909q, this.f9911r, this.f9913s, this.f9915t, this.f9917u, this.f9919v, this.f9921w, this.f9923x, this.f9925y, this.f9927z, this.f9819A, this.f9821B, this.f9823C, this.f9825D, this.f9827E, this.f9829F, this.f9831G, this.f9833H, this.f9835I, this.f9837J, this.f9839K, this.f9841L, this.f9843M, this.f9845N, this.f9847O, this.f9849P, this.f9851Q, this.f9853R, this.f9855S, this.f9857T, this.f9860V, this.f9862W, this.f9864X, this.f9866Y, this.f9868Z, this.f9891k0, this.f9888j1, this.f9892k1, this.f9895l1, this.f9898m1, this.f9901n1, this.f9904o1, this.f9907p1, this.f9910q1, this.f9912r1, this.f9914s1, this.f9916t1, this.f9918u1, this.f9920v1, this.f9922w1, this.f9924x1, this.f9926y1, this.f9928z1, this.f9820A1, this.f9822B1, this.f9824C1, this.f9826D1, this.f9828E1, this.f9830F1, this.f9832G1, this.f9834H1, this.f9836I1, this.f9838J1, this.f9840K1, this.f9842L1, this.f9844M1, this.f9846N1, this.f9848O1, this.f9850P1, this.f9852Q1, this.f9854R1, this.f9856S1, this.f9858T1, this.f9859U1, this.f9861V1, this.f9863W1, this.f9865X1, this.f9867Y1, this.f9869Z1, this.f9870a2, this.f9872b2, this.f9874c2, this.f9876d2, this.f9878e2, this.f9880f2, this.f9882g2, this.f9884h2, this.f9886i2, cVar4, jVar5, eVar, cVar6, fVar, cVar9, cVar11, cVar13, jVar8, bVar25, cVar15, bVar27, eVar3, dVar7, cVar17, eVar5, g0Var, hVar5, cVar19), j1Var2.f10128K2, 2);
        this.f9893k2 = new C10155g(aVar3);
        C4690r4 r4Var3 = r4Var;
        C17556e eVar7 = r4Var3.f10564W1;
        C19011a<C13895a> aVar15 = j1Var2.f10291o3;
        C4591k kVar2 = j1Var2.f10278m0;
        this.f9896l2 = new C10103f(aVar, eVar7, aVar15, kVar2, bVar29);
        this.f9899m2 = new C4633n(aVar3, 1);
        C19011a<C13483f> b2 = C17554c.m29427b(new C13484g(new C10720c(new C10721d(j1Var2.f10252h4, kVar2), j1Var2.f10336x3, j1Var2.f10341y3, j1Var2.f10137M1, j1Var2.f10157Q1, j1Var2.f10290o2), hVar4, this.f9879f, r4Var3.f10566X1, j1Var2.f10124J3));
        this.f9902n2 = b2;
        C8647f fVar3 = new C8647f(aVar3, 2);
        this.f9905o2 = C17554c.m29427b(new C10100c(this.f9893k2, this.f9881g, this.f9896l2, this.f9899m2, j1Var2.f10172T1, b2, this.f9887j, fVar3, j1Var2.f10316t3, r4Var3.f10566X1, j1Var2.f10090D));
        this.f9908p2 = new C4619m(aVar3, r4Var3.f10564W1, 2);
    }

    /* renamed from: a */
    public final C13573c mo14398a() {
        C14088a aVar = this.f9871b;
        ListingFragment listingFragment = this.f9873c;
        aVar.getClass();
        C19383o.m32797g(listingFragment, "listingFragment");
        C13573c cVar = listingFragment.getViewModel().f22222c;
        C17782b.m29841G(cVar);
        return cVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ListingFragment listingFragment = (ListingFragment) obj;
        listingFragment.listingItemDecoration = new C13947b();
        listingFragment.listingItemAnimator = new C13946a();
        listingFragment.listingViewModelFactory = new C10189i(this.f9889j2);
        listingFragment.listingAdapter = this.f9905o2.get();
        listingFragment.listingOnScrollEvent = new C13948c(mo14398a());
        C14088a aVar = this.f9871b;
        BOEActivity bOEActivity = this.f9877e.f10573d;
        aVar.getClass();
        C19383o.m32797g(bOEActivity, "boeActivity");
        C8115a a = C8115a.m16322a(bOEActivity);
        C19383o.m32796f(a, "getInstance(boeActivity)");
        listingFragment.localBroadcastManager = a;
        this.f9871b.getClass();
        listingFragment.googlePayUpdatesFilter = new IntentFilter(EtsyAction.GOOGLE_PAY_RESULT.getIntentAction());
        listingFragment.appBarHelperProvider = this.f9908p2;
        this.f9871b.getClass();
        MovementMethod instance = LinkMovementMethod.getInstance();
        C19383o.m32796f(instance, "getInstance()");
        listingFragment.linkMovementMethod = instance;
        listingFragment.listingScreenScreenshotObserver = new ListingScreenScreenshotObserver(this.f9877e.f10573d, new C13461f(), mo14398a());
        listingFragment.qualtricsForListingScreen = new C13913a(this.f9877e.f10573d, this.f9875d.f10117I1.get(), this.f9875d.f10298q0.get(), new QualtricsConfiguration());
        listingFragment.favoriteHandler = this.f9875d.f10134L3.get();
        listingFragment.googlePayHelper = new C9303a(this.f9875d.f10085C.get(), this.f9875d.f10212b0.get(), this.f9875d.f10131L0.get(), (C12703a) this.f9875d.f10308s0.get(), (C8591a) this.f9875d.f10272l0.get());
        listingFragment.calculateShippingWorkflow = new C10554d(new C8505b());
        listingFragment.resourceProvider = C4579j1.m10252c(this.f9875d);
        listingFragment.listingGlobalLayoutListener = new ListingGlobalLayoutListener(mo14398a());
        listingFragment.eligibility = new C10156h(C4690r4.m10336a(this.f9877e));
        listingFragment.variationSelectionBottomSheetHelper = new C13161e(mo14398a(), new C10156h(C4690r4.m10336a(this.f9877e)), this.f9877e.f10573d);
        listingFragment.listingBottomSheetHelper = new C10211k(this.f9877e.f10573d, C4579j1.m10252c(this.f9875d), mo14398a());
        listingFragment.persistViewedBus = this.f9875d.f10263j3.get();
        listingFragment.addToCartInterstitialHelper = new AddToCartInterstitialHelper(mo14398a(), this.f9875d.mo14405n(), new C13461f(), this.f9875d.f10336x3.get(), this.f9875d.f10341y3.get(), this.f9875d.mo14408q(), this.f9875d.mo14400i(), C4579j1.m10250a(this.f9875d), new C12796e(C4579j1.m10253d(this.f9875d)), this.f9877e.mo14417c());
    }
}
