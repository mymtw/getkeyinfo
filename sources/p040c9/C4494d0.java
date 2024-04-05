package p040c9;

import androidx.activity.C0114h;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.favorites.add.AddToListFragment;
import com.etsy.android.p327ui.favorites.add.AddToListPresenter;
import com.etsy.android.p327ui.favorites.add.C9766h;
import com.etsy.android.p327ui.favorites.add.C9770k;
import com.etsy.android.p327ui.favorites.add.C9790y;
import com.etsy.android.p327ui.favorites.add.FavoriteAndCollectionRepository;
import com.etsy.android.p327ui.util.C11780h;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: c9.d0 */
public final class C4494d0 implements C17550a {

    /* renamed from: b */
    public final AddToListFragment f9809b;

    /* renamed from: c */
    public final C4579j1 f9810c;

    /* renamed from: d */
    public final C4690r4 f9811d;

    public C4494d0(C4579j1 j1Var, C4690r4 r4Var, AddToListFragment addToListFragment) {
        this.f9810c = j1Var;
        this.f9811d = r4Var;
        this.f9809b = addToListFragment;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        Class cls = C9770k.class;
        AddToListFragment addToListFragment = (AddToListFragment) obj;
        AddToListFragment addToListFragment2 = this.f9809b;
        C13461f fVar = new C13461f();
        C4579j1 j1Var = this.f9810c;
        C0114h hVar = j1Var.f10312t;
        C8731g gVar = (C8731g) j1Var.f10091D0.get();
        hVar.getClass();
        C19383o.m32797g(gVar, "configuredRetrofit");
        Object b = gVar.f19177a.mo74387b(cls);
        C19383o.m32796f(b, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
        C9766h hVar2 = new C9766h((C9770k) b);
        C4579j1 j1Var2 = this.f9810c;
        C11780h n = j1Var2.mo14405n();
        C0114h hVar3 = j1Var2.f10312t;
        C8731g gVar2 = (C8731g) j1Var2.f10091D0.get();
        hVar3.getClass();
        C19383o.m32797g(gVar2, "configuredRetrofit");
        Object b2 = gVar2.f19177a.mo74387b(cls);
        C19383o.m32796f(b2, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
        C9766h hVar4 = new C9766h((C9770k) b2);
        C0114h hVar5 = j1Var2.f10312t;
        C8731g gVar3 = (C8731g) j1Var2.f10091D0.get();
        hVar5.getClass();
        C19383o.m32797g(gVar3, "configuredRetrofit");
        Object b3 = gVar3.f19177a.mo74387b(cls);
        C19383o.m32796f(b3, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
        addToListFragment.presenter = new AddToListPresenter(addToListFragment2, fVar, hVar2, new FavoriteAndCollectionRepository(n, hVar4, new C9790y(j1Var2.f10146O0.get(), (C9770k) b3), new C13461f()), (C13265p) this.f9810c.f10101F0.get(), this.f9811d.mo14417c());
        addToListFragment.preferencesProvider = this.f9810c.f10090D.get();
    }
}
