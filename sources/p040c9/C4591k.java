package p040c9;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.onboarding.CategoryQuizViewModel;
import com.etsy.android.p327ui.user.purchases.C11679u;
import com.etsy.android.p327ui.user.purchases.PurchasesRepository;
import dagger.internal.C17554c;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p342ed.C12682a;
import p568fn.C17782b;
import p628nj.C18263b;
import p634np.C18289a;
import p740eq.C19011a;

/* renamed from: c9.k */
public final class C4591k implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10376a;

    /* renamed from: b */
    public final C19011a f10377b;

    /* renamed from: c */
    public final Object f10378c;

    public /* synthetic */ C4591k(Object obj, C17555d dVar, int i) {
        this.f10376a = i;
        this.f10378c = obj;
        this.f10377b = dVar;
    }

    /* renamed from: a */
    public final C2866i0 mo14414a() {
        switch (this.f10376a) {
            case 1:
                C18289a a = C17554c.m29426a(this.f10377b);
                ((C0114h) this.f10378c).getClass();
                C19383o.m32797g(a, "eventRouter");
                return new CategoryQuizViewModel(a);
            default:
                PurchasesRepository purchasesRepository = (PurchasesRepository) this.f10377b.get();
                ((C0761x) this.f10378c).getClass();
                C19383o.m32797g(purchasesRepository, "repo");
                return new C11679u(purchasesRepository);
        }
    }

    public final Object get() {
        switch (this.f10376a) {
            case 0:
                ((C4479c) this.f10378c).getClass();
                C8623e eVar = ((C8591a) this.f10377b.get()).f18706f;
                C17782b.m29841G(eVar);
                return eVar;
            case 1:
                return mo14414a();
            case 2:
                C8731g gVar = (C8731g) this.f10377b.get();
                ((C18263b) this.f10378c).getClass();
                C19383o.m32797g(gVar, "configuredRetrofit");
                Object b = gVar.f19177a.mo74387b(C12682a.class);
                C19383o.m32796f(b, "configuredRetrofit.v3mos…tionEndpoint::class.java)");
                return (C12682a) b;
            default:
                return mo14414a();
        }
    }
}
