package com.etsy.android.lib.config;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import kotlin.jvm.internal.C19383o;
import p409o9.C13122d;
import p409o9.C13132l;
import p409o9.C13137p;

public final class EtsyConfigKey implements C13137p {

    /* renamed from: a */
    public String f18695a;

    /* renamed from: b */
    public boolean f18696b = false;

    /* renamed from: c */
    public C13132l[] f18697c = new C13132l[Environment.values().length];

    /* renamed from: d */
    public C13132l[] f18698d = new C13132l[BuildTarget.values().length];

    /* renamed from: e */
    public C13132l[] f18699e = new C13132l[UserState.values().length];

    public enum Environment {
        PRODUCTION,
        PRINCESS,
        DEVELOPMENT,
        TEST
    }

    public enum UserState {
        IS_ADMIN
    }

    public EtsyConfigKey(String str, String str2) {
        this.f18695a = str;
        mo21101b(Environment.PRODUCTION, str2);
    }

    /* renamed from: a */
    public final void mo21100a(BuildTarget buildTarget, String str) {
        if (buildTarget != BuildTarget.GOOGLE_PLAY) {
            this.f18698d[buildTarget.ordinal()] = mo21102c(str);
            return;
        }
        throw new IllegalArgumentException("GOOGLE_PLAY is the assumed default build state. Don't add values for it, they'll never be used.");
    }

    /* renamed from: b */
    public final void mo21101b(Environment environment, String str) {
        this.f18697c[environment.ordinal()] = mo21102c(str);
    }

    /* renamed from: c */
    public final C13132l mo21102c(String str) {
        if (!this.f18696b) {
            return new C13132l(this.f18695a, str);
        }
        String str2 = this.f18695a;
        StringBuilder h = C0072d.m201h("mobile_dynamic_config.android.");
        h.append(this.f18695a);
        String sb = h.toString();
        C19383o.m32797g(str2, "name");
        C19383o.m32797g(str, "valueString");
        return new C13132l(str2, str, sb, EtsyDialogFragment.OPT_X_BUTTON, (C13122d) null, (String) null, 112);
    }

    /* renamed from: d */
    public final C13132l mo21103d(Environment environment, boolean z) {
        Environment environment2 = Environment.TEST;
        if (environment == environment2 && this.f18697c[environment2.ordinal()] != null) {
            return this.f18697c[environment2.ordinal()];
        }
        C13132l lVar = this.f18697c[environment.ordinal()] != null ? this.f18697c[environment.ordinal()] : this.f18697c[Environment.PRODUCTION.ordinal()];
        BuildTarget audience = BuildTarget.getAudience();
        if (!(audience == BuildTarget.GOOGLE_PLAY || this.f18698d[audience.ordinal()] == null)) {
            lVar = this.f18698d[audience.ordinal()];
        }
        if (!z) {
            return lVar;
        }
        C13132l[] lVarArr = this.f18699e;
        UserState userState = UserState.IS_ADMIN;
        return lVarArr[userState.ordinal()] != null ? this.f18699e[userState.ordinal()] : lVar;
    }

    public final String getName() {
        return this.f18695a;
    }
}
