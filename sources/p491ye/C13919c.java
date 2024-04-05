package p491ye;

import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.p327ui.user.inappnotifications.UpdatesEligibility;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: ye.c */
public final class C13919c {

    /* renamed from: a */
    public final C13921e f30582a;

    /* renamed from: b */
    public final C8890e0 f30583b;

    /* renamed from: c */
    public final UpdatesEligibility f30584c;

    public C13919c(C13921e eVar, C8890e0 e0Var, UpdatesEligibility updatesEligibility) {
        C19383o.m32797g(eVar, "tooltipPrefs");
        C19383o.m32797g(e0Var, "systemTime");
        C19383o.m32797g(updatesEligibility, "updatesEligibility");
        this.f30582a = eVar;
        this.f30583b = e0Var;
        this.f30584c = updatesEligibility;
    }

    /* renamed from: a */
    public final boolean mo46729a() {
        if (((Boolean) this.f30584c.f25524a.getValue()).booleanValue()) {
            return false;
        }
        long j = this.f30582a.f30588a.mo46761a().getLong("tooltip_displayed", 0);
        this.f30583b.getClass();
        return ((TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - j) > 24 ? 1 : (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - j) == 24 ? 0 : -1)) >= 0) && (this.f30582a.f30588a.mo46761a().getInt("tooltip_displayed_updates_viewed", 0) < 2);
    }
}
