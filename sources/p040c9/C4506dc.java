package p040c9;

import android.content.pm.PackageManager;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.util.C8926x;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.you.YouFragment;
import com.etsy.android.p327ui.you.YouViewModel;
import com.etsy.android.push.C8939b;
import com.etsy.android.util.C12067x;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;
import p456ua.C13461f;
import p568fn.C17782b;

/* renamed from: c9.dc */
public final class C4506dc implements C17550a {

    /* renamed from: b */
    public final C17782b f9934b;

    /* renamed from: c */
    public final YouFragment f9935c;

    /* renamed from: d */
    public final C4579j1 f9936d;

    /* renamed from: e */
    public C8939b f9937e;

    public C4506dc(C4579j1 j1Var, C17782b bVar, YouFragment youFragment) {
        this.f9936d = j1Var;
        this.f9934b = bVar;
        this.f9935c = youFragment;
        this.f9937e = new C8939b(bVar, j1Var.f10111H0, j1Var.f10101F0, j1Var.f10141N0, j1Var.f10323v0);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        YouFragment youFragment = (YouFragment) obj;
        youFragment.session = (C13265p) this.f9936d.f10101F0.get();
        youFragment.rxSchedulers = new C13461f();
        C17782b bVar = this.f9934b;
        C4579j1 j1Var = this.f9936d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, YouViewModel.class, this.f9937e));
        YouFragment youFragment2 = this.f9935c;
        bVar.getClass();
        C19383o.m32797g(youFragment2, "target");
        youFragment.youViewModel = (YouViewModel) new C2870k0((C2880m0) youFragment2, (C2870k0.C2872b) oVar).mo10829a(YouViewModel.class);
        youFragment.logCat = this.f9936d.f10212b0.get();
        youFragment.etsyApplication = this.f9936d.f10242g0.get();
        C4579j1 j1Var2 = this.f9936d;
        j1Var2.f10205a.getClass();
        PackageManager packageManager = j1Var2.f10085C.get().getPackageManager();
        C17782b.m29841G(packageManager);
        youFragment.soeIntentRepository = new C12067x(new C8926x(packageManager));
        youFragment.customerCentricMessagingEligibility = this.f9936d.f10196Y0.get();
    }
}
