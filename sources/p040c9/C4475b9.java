package p040c9;

import androidx.activity.C0114h;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.onboarding.CategoryQuizViewModel;
import com.etsy.android.onboarding.OnboardingCategoryQuizFragment;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19729m;
import p347fb.C12708d;
import p490yd.C13914b;
import p568fn.C17782b;
import p768rq.C20153b;

/* renamed from: c9.b9 */
public final class C4475b9 implements C17550a {

    /* renamed from: b */
    public final C0114h f9776b;

    /* renamed from: c */
    public final OnboardingCategoryQuizFragment f9777c;

    /* renamed from: d */
    public final C4579j1 f9778d;

    /* renamed from: e */
    public C4591k f9779e;

    public C4475b9(C4579j1 j1Var, C0114h hVar, OnboardingCategoryQuizFragment onboardingCategoryQuizFragment) {
        this.f9778d = j1Var;
        this.f9776b = hVar;
        this.f9777c = onboardingCategoryQuizFragment;
        this.f9779e = new C4591k(hVar, new C12708d(), 1);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        OnboardingCategoryQuizFragment onboardingCategoryQuizFragment = (OnboardingCategoryQuizFragment) obj;
        C0114h hVar = this.f9776b;
        C4579j1 j1Var = this.f9778d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, CategoryQuizViewModel.class, this.f9779e));
        OnboardingCategoryQuizFragment onboardingCategoryQuizFragment2 = this.f9777c;
        hVar.getClass();
        C19383o.m32797g(onboardingCategoryQuizFragment2, "fragment");
        onboardingCategoryQuizFragment.viewModel = (CategoryQuizViewModel) new C2870k0((C2880m0) onboardingCategoryQuizFragment2, (C2870k0.C2872b) oVar).mo10829a(CategoryQuizViewModel.class);
        this.f9778d.f10259j.getClass();
        C20153b bVar = C19760n0.f43719a;
        C19764o1 o1Var = C19729m.f43681a;
        C17782b.m29841G(o1Var);
        onboardingCategoryQuizFragment.mainDispatcher = o1Var;
        onboardingCategoryQuizFragment.toaster = new C13914b(this.f9778d.f10102F1.get());
    }
}
