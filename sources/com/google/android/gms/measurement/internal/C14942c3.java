package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
public final class C14942c3 extends C15042n4 {
    @VisibleForTesting

    /* renamed from: x */
    public static final Pair<String, Long> f33298x = new Pair<>("", 0L);

    /* renamed from: d */
    public SharedPreferences f33299d;

    /* renamed from: e */
    public C15142z2 f33300e;

    /* renamed from: f */
    public final C15134y2 f33301f = new C15134y2(this, "first_open_time", 0);

    /* renamed from: g */
    public final C14924a3 f33302g;

    /* renamed from: h */
    public String f33303h;

    /* renamed from: i */
    public boolean f33304i;

    /* renamed from: j */
    public long f33305j;

    /* renamed from: k */
    public final C15134y2 f33306k = new C15134y2(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C15118w2 f33307l = new C15118w2(this, "start_new_session", true);

    /* renamed from: m */
    public final C14924a3 f33308m = new C14924a3(this, "non_personalized_ads");

    /* renamed from: n */
    public final C15118w2 f33309n = new C15118w2(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C15134y2 f33310o = new C15134y2(this, "last_pause_time", 0);

    /* renamed from: p */
    public boolean f33311p;

    /* renamed from: q */
    public final C15118w2 f33312q;

    /* renamed from: r */
    public final C15118w2 f33313r;

    /* renamed from: s */
    public final C15134y2 f33314s;

    /* renamed from: t */
    public final C14924a3 f33315t;

    /* renamed from: u */
    public final C14924a3 f33316u;

    /* renamed from: v */
    public final C15134y2 f33317v;

    /* renamed from: w */
    public final C15126x2 f33318w;

    public C14942c3(C15103u3 u3Var) {
        super(u3Var);
        Preconditions.checkNotEmpty("app_install_time");
        this.f33302g = new C14924a3(this, "app_instance_id");
        this.f33312q = new C15118w2(this, "app_backgrounded", false);
        this.f33313r = new C15118w2(this, "deep_link_retrieval_complete", false);
        this.f33314s = new C15134y2(this, "deep_link_retrieval_attempts", 0);
        this.f33315t = new C14924a3(this, "firebase_feature_rollouts");
        this.f33316u = new C14924a3(this, "deferred_attribution_cache");
        this.f33317v = new C15134y2(this, "deferred_attribution_cache_timestamp", 0);
        this.f33318w = new C15126x2(this);
    }

    /* renamed from: h */
    public final boolean mo51952h() {
        return true;
    }

    @VisibleForTesting
    /* renamed from: k */
    public final SharedPreferences mo51953k() {
        mo51995g();
        mo52264i();
        Preconditions.checkNotNull(this.f33299d);
        return this.f33299d;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: l */
    public final void mo51954l() {
        SharedPreferences sharedPreferences = ((C15103u3) this.f33681b).f33872b.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f33299d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f33311p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f33299d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        ((C15103u3) this.f33681b).getClass();
        this.f33300e = new C15142z2(this, Math.max(0, C14959e2.f33399d.mo51978a(null).longValue()));
    }

    /* renamed from: m */
    public final C14956e mo51955m() {
        mo51995g();
        return C14956e.m24275b(mo51953k().getString("consent_settings", "G1"));
    }

    /* renamed from: n */
    public final Boolean mo51956n() {
        mo51995g();
        if (mo51953k().contains("measurement_enabled")) {
            return Boolean.valueOf(mo51953k().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: o */
    public final void mo51957o(Boolean bool) {
        mo51995g();
        SharedPreferences.Editor edit = mo51953k().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: p */
    public final void mo51958p(boolean z) {
        mo51995g();
        ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = mo51953k().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: q */
    public final boolean mo51959q(long j) {
        return j - this.f33306k.mo52363a() > this.f33310o.mo52363a();
    }

    /* renamed from: r */
    public final boolean mo51960r(int i) {
        return i <= mo51953k().getInt("consent_source", 100);
    }
}
