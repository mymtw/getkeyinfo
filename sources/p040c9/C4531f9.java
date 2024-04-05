package p040c9;

import com.etsy.android.config.PrefsFragment;
import com.etsy.android.push.onboarding.C8945a;
import dagger.android.C17550a;
import p334da.C12639h;
import p425q9.C13265p;
import p456ua.C13461f;
import p491ye.C13921e;

/* renamed from: c9.f9 */
public final class C4531f9 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f9983b;

    public C4531f9(C4579j1 j1Var) {
        this.f9983b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        PrefsFragment prefsFragment = (PrefsFragment) obj;
        prefsFragment.rxSchedulers = new C13461f();
        C4579j1 j1Var = this.f9983b;
        prefsFragment.analyticsUploader = new C12639h(j1Var.mo14404m(), j1Var.f10171T0.get());
        prefsFragment.elkLogDao = this.f9983b.mo14403l();
        prefsFragment.elkLogUploader = this.f9983b.f10082B1.get();
        prefsFragment.session = (C13265p) this.f9983b.f10101F0.get();
        prefsFragment.sharedPreferencesProvider = this.f9983b.f10090D.get();
        C4579j1 j1Var2 = this.f9983b;
        prefsFragment.tooltipPrefs = new C13921e(j1Var2.f10090D.get(), j1Var2.f10248h0.get());
        prefsFragment.homeScreenEventManager = this.f9983b.f10208a2.get();
        prefsFragment.configMap = this.f9983b.mo14404m();
        prefsFragment.currentLocale = this.f9983b.f10298q0.get();
        prefsFragment.pushOptInOnboardingEligibility = new C8945a(this.f9983b.f10114H3.get(), this.f9983b.f10198Y2.get(), this.f9983b.f10090D.get(), this.f9983b.f10248h0.get());
    }
}
