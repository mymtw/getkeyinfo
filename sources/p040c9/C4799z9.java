package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.sdl.C10716b;
import com.etsy.android.p327ui.sdl.C10722e;
import com.etsy.android.p327ui.sdl.SdlModalFragment;
import com.etsy.android.p327ui.sdl.ServerDrivenActionDelegate;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p383ke.C12995a;
import p456ua.C13461f;

/* renamed from: c9.z9 */
public final class C4799z9 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10795b;

    public C4799z9(C4579j1 j1Var) {
        this.f10795b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SdlModalFragment sdlModalFragment = (SdlModalFragment) obj;
        sdlModalFragment.grafana = (C12703a) this.f10795b.f10308s0.get();
        sdlModalFragment.favoriteRepository = this.f10795b.mo14405n();
        C4579j1 j1Var = this.f10795b;
        C12995a aVar = j1Var.f10253i;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        aVar.getClass();
        C19383o.m32797g(gVar, "retrofit");
        Object b = gVar.f19177a.mo74387b(C10722e.class);
        C19383o.m32796f(b, "retrofit.v3moshiRetrofit…tionEndpoint::class.java)");
        sdlModalFragment.sdlViewDelegateFactory = new C10716b.C10718b(new ServerDrivenActionDelegate.C10714a((C10722e) b, new C13461f(), this.f10795b.mo14404m()), this.f10795b.f10336x3.get(), this.f10795b.f10341y3.get(), this.f10795b.mo14408q(), this.f10795b.mo14400i(), C4579j1.m10250a(this.f10795b));
        sdlModalFragment.rxSchedulers = new C13461f();
        sdlModalFragment.adImpressionRepository = this.f10795b.f10336x3.get();
        sdlModalFragment.deepLinkEligibility = this.f10795b.f10341y3.get();
        sdlModalFragment.routeInspector = this.f10795b.mo14408q();
        sdlModalFragment.deepLinkEntityChecker = this.f10795b.mo14400i();
        sdlModalFragment.seasrchUriParser = C4579j1.m10250a(this.f10795b);
    }
}
