package p040c9;

import com.etsy.android.config.flags.C6347e;
import com.etsy.android.config.flags.C6376f;
import com.etsy.android.config.flags.C6378h;
import com.etsy.android.config.flags.C6380i;
import com.etsy.android.config.flags.C6381j;
import com.etsy.android.config.flags.ConfigFlagsFragment;
import com.etsy.android.config.flags.events.C6359f;
import com.etsy.android.config.flags.events.C6364k;
import com.etsy.android.config.flags.events.C6367n;
import com.etsy.android.config.flags.p073ui.search.C6414f;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6426e;
import com.etsy.android.lib.network.C8738n;
import dagger.android.C17550a;
import dagger.internal.C17556e;
import kotlin.jvm.internal.C19388s;

/* renamed from: c9.o5 */
public final class C4652o5 implements C17550a {

    /* renamed from: b */
    public C8738n f10457b;

    /* renamed from: c */
    public C6376f f10458c;

    /* renamed from: d */
    public C6381j f10459d;

    public C4652o5(C4579j1 j1Var, C19388s sVar, ConfigFlagsFragment configFlagsFragment) {
        C4579j1 j1Var2 = j1Var;
        C19388s sVar2 = sVar;
        this.f10457b = new C8738n(sVar2, 3);
        this.f10458c = new C6376f(sVar2, 0);
        C6347e eVar = new C6347e(sVar2, C17556e.m29429a(configFlagsFragment), 0);
        this.f10459d = new C6381j(new C6359f(new C6364k(C6378h.C6379a.f14204a, j1Var2.f10272l0, this.f10457b, this.f10458c, eVar, 0), new C6419c(eVar, 0), new C6426e(eVar, 0), new C6414f(eVar, 0), new C6367n(j1Var2.f10308s0, 0)), 0);
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ((ConfigFlagsFragment) obj).configFlagsViewModelFactory = new C6380i(this.f10459d);
    }
}
