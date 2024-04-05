package com.etsy.android.push;

import android.content.SharedPreferences;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.util.C8890e0;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import p496za.C13943a;

public final class PushOptInFatigue {

    /* renamed from: a */
    public final C8672b f19710a;

    /* renamed from: b */
    public final C13943a f19711b;

    /* renamed from: c */
    public final C8890e0 f19712c;

    /* renamed from: d */
    public final C19285c f19713d = C19350d.m32677b(new PushOptInFatigue$enabled$2(this));

    public PushOptInFatigue(C8672b bVar, C13943a aVar, C8890e0 e0Var) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(aVar, "sharedPrefsProvider");
        C19383o.m32797g(e0Var, "systemTime");
        this.f19710a = bVar;
        this.f19711b = aVar;
        this.f19712c = e0Var;
    }

    /* renamed from: a */
    public final boolean mo30551a() {
        this.f19712c.getClass();
        return (((System.currentTimeMillis() - this.f19711b.mo46761a().getLong("push_opt_in_last_prompt", 0)) > 604800000 ? 1 : ((System.currentTimeMillis() - this.f19711b.mo46761a().getLong("push_opt_in_last_prompt", 0)) == 604800000 ? 0 : -1)) > 0) || !((Boolean) this.f19713d.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final void mo30552b() {
        SharedPreferences.Editor edit = this.f19711b.mo46761a().edit();
        C19383o.m32796f(edit, "editor");
        this.f19712c.getClass();
        edit.putLong("push_opt_in_last_prompt", System.currentTimeMillis());
        edit.apply();
    }
}
