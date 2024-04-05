package p040c9;

import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.network.oauth2.C8764n;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.push.registration.C8832e;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.tabs.HomePagerViewModel;
import com.etsy.android.p327ui.user.C11518d0;
import com.etsy.android.p327ui.user.SettingsFragment;
import com.google.android.play.core.appupdate.C15562d;
import com.google.common.collect.ImmutableMap;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import p456ua.C13461f;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: c9.xa */
public final class C4774xa implements C17550a {

    /* renamed from: b */
    public final C15562d f10758b;

    /* renamed from: c */
    public final SettingsFragment f10759c;

    /* renamed from: d */
    public final C4579j1 f10760d;

    /* renamed from: e */
    public C8764n f10761e;

    public C4774xa(C4579j1 j1Var, C15562d dVar, SettingsFragment settingsFragment) {
        this.f10760d = j1Var;
        this.f10758b = dVar;
        this.f10759c = settingsFragment;
        C8782j jVar = new C8782j(j1Var.f10085C, 1);
        C19011a<C13943a> aVar = j1Var.f10090D;
        C15562d dVar2 = dVar;
        this.f10761e = new C8764n(dVar2, j1Var.f10101F0, j1Var.f10278m0, j1Var.f10338y0, jVar, (C19011a) aVar, new C8832e(aVar, 6));
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SettingsFragment settingsFragment = (SettingsFragment) obj;
        settingsFragment.rxSchedulers = new C13461f();
        C15562d dVar = this.f10758b;
        C4579j1 j1Var = this.f10760d;
        C8656o oVar = new C8656o(ImmutableMap.m25857of(HomePagerViewModel.class, j1Var.f10158Q2, C9974e.class, j1Var.f10163R2, C10677n.class, j1Var.f10269k3, C11518d0.class, this.f10761e));
        SettingsFragment settingsFragment2 = this.f10759c;
        dVar.getClass();
        C19383o.m32797g(settingsFragment2, "target");
        settingsFragment.settingsViewModel = (C11518d0) new C2870k0((C2880m0) settingsFragment2, (C2870k0.C2872b) oVar).mo10829a(C11518d0.class);
    }
}
