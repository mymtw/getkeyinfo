package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.core.listinggallery.ListingImageGalleryFragment;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9647a;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9665f;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.listing.C10156h;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p321cc.C8569c;
import p361hc.C12809a;
import p361hc.C12811c;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: c9.f8 */
public final class C4530f8 implements C17550a {

    /* renamed from: b */
    public final C18263b f9980b;

    /* renamed from: c */
    public final C4579j1 f9981c;

    /* renamed from: d */
    public final C4690r4 f9982d;

    public C4530f8(C4579j1 j1Var, C4690r4 r4Var, C18263b bVar) {
        this.f9981c = j1Var;
        this.f9982d = r4Var;
        this.f9980b = bVar;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ListingImageGalleryFragment listingImageGalleryFragment = (ListingImageGalleryFragment) obj;
        listingImageGalleryFragment.fileSupport = this.f9981c.f10291o3.get();
        listingImageGalleryFragment.listingViewEligibility = new C10156h(C4690r4.m10336a(this.f9982d));
        listingImageGalleryFragment.systemTime = this.f9981c.f10248h0.get();
        C0005b bVar = new C0005b();
        C8569c g = C4579j1.m10256g(this.f9981c);
        C18263b bVar2 = this.f9980b;
        C8731g gVar = (C8731g) this.f9981c.f10091D0.get();
        bVar2.getClass();
        C19383o.m32797g(gVar, "configuredRetrofit");
        Object b = gVar.f19177a.mo74387b(C12809a.class);
        C19383o.m32796f(b, "configuredRetrofit.v3mos…koutEndpoint::class.java)");
        listingImageGalleryFragment.buyItNowViewModel = new C9666g(bVar, new C9647a(g, new C12811c((C12809a) b), new C13461f()));
        listingImageGalleryFragment.buyItNowPresenter = new C9665f(new C0005b(), new C10156h(C4690r4.m10336a(this.f9982d)), new C9684a());
    }
}
