package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.session.PlaybackStateCompat;
import com.facebook.login.LoginStatusClient;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
public final class C14746n8 implements C14733m8 {

    /* renamed from: A */
    public static final C14664h4 f32974A;

    /* renamed from: B */
    public static final C14664h4 f32975B;

    /* renamed from: C */
    public static final C14664h4 f32976C;

    /* renamed from: D */
    public static final C14664h4 f32977D;

    /* renamed from: E */
    public static final C14664h4 f32978E;

    /* renamed from: F */
    public static final C14664h4 f32979F;

    /* renamed from: G */
    public static final C14664h4 f32980G;

    /* renamed from: H */
    public static final C14703k4 f32981H;

    /* renamed from: I */
    public static final C14664h4 f32982I;

    /* renamed from: a */
    public static final C14664h4 f32983a;

    /* renamed from: b */
    public static final C14664h4 f32984b;

    /* renamed from: c */
    public static final C14664h4 f32985c;

    /* renamed from: d */
    public static final C14703k4 f32986d;

    /* renamed from: e */
    public static final C14703k4 f32987e;

    /* renamed from: f */
    public static final C14664h4 f32988f;

    /* renamed from: g */
    public static final C14664h4 f32989g;

    /* renamed from: h */
    public static final C14664h4 f32990h;

    /* renamed from: i */
    public static final C14664h4 f32991i;

    /* renamed from: j */
    public static final C14664h4 f32992j;

    /* renamed from: k */
    public static final C14664h4 f32993k;

    /* renamed from: l */
    public static final C14664h4 f32994l;

    /* renamed from: m */
    public static final C14664h4 f32995m;

    /* renamed from: n */
    public static final C14664h4 f32996n;

    /* renamed from: o */
    public static final C14664h4 f32997o;

    /* renamed from: p */
    public static final C14664h4 f32998p;

    /* renamed from: q */
    public static final C14664h4 f32999q;

    /* renamed from: r */
    public static final C14664h4 f33000r;

    /* renamed from: s */
    public static final C14664h4 f33001s;

    /* renamed from: t */
    public static final C14664h4 f33002t;

    /* renamed from: u */
    public static final C14664h4 f33003u;

    /* renamed from: v */
    public static final C14664h4 f33004v;

    /* renamed from: w */
    public static final C14664h4 f33005w;

    /* renamed from: x */
    public static final C14664h4 f33006x;

    /* renamed from: y */
    public static final C14664h4 f33007y;

    /* renamed from: z */
    public static final C14664h4 f33008z;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        f32983a = l4Var.mo50654a(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, "measurement.ad_id_cache_time");
        f32984b = l4Var.mo50654a(100, "measurement.max_bundles_per_iteration");
        f32985c = l4Var.mo50654a(DateUtils.MILLIS_PER_DAY, "measurement.config.cache_time");
        l4Var.mo50655b("measurement.log_tag", "FA");
        f32986d = new C14703k4(l4Var, "measurement.config.url_authority", "app-measurement.com");
        f32987e = new C14703k4(l4Var, "measurement.config.url_scheme", "https");
        f32988f = l4Var.mo50654a(1000, "measurement.upload.debug_upload_interval");
        f32989g = l4Var.mo50654a(4, "measurement.lifetimevalue.max_currency_tracked");
        f32990h = l4Var.mo50654a(100000, "measurement.store.max_stored_events_per_app");
        f32991i = l4Var.mo50654a(50, "measurement.experiment.max_ids");
        f32992j = l4Var.mo50654a(200, "measurement.audience.filter_result_max_count");
        f32993k = l4Var.mo50654a(DateUtils.MILLIS_PER_MINUTE, "measurement.alarm_manager.minimum_interval");
        f32994l = l4Var.mo50654a(500, "measurement.upload.minimum_delay");
        f32995m = l4Var.mo50654a(DateUtils.MILLIS_PER_DAY, "measurement.monitoring.sample_period_millis");
        f32996n = l4Var.mo50654a(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, "measurement.upload.realtime_upload_interval");
        f32997o = l4Var.mo50654a(604800000, "measurement.upload.refresh_blacklisted_config_interval");
        l4Var.mo50654a(DateUtils.MILLIS_PER_HOUR, "measurement.config.cache_time.service");
        f32998p = l4Var.mo50654a(LoginStatusClient.DEFAULT_TOAST_DURATION_MS, "measurement.service_client.idle_disconnect_millis");
        l4Var.mo50655b("measurement.log_tag.service", "FA-SVC");
        f32999q = l4Var.mo50654a(DateUtils.MILLIS_PER_DAY, "measurement.upload.stale_data_deletion_interval");
        f33000r = l4Var.mo50654a(604800000, "measurement.sdk.attribution.cache.ttl");
        f33001s = l4Var.mo50654a(43200000, "measurement.upload.backoff_period");
        f33002t = l4Var.mo50654a(15000, "measurement.upload.initial_upload_delay_time");
        f33003u = l4Var.mo50654a(DateUtils.MILLIS_PER_HOUR, "measurement.upload.interval");
        f33004v = l4Var.mo50654a(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, "measurement.upload.max_bundle_size");
        f33005w = l4Var.mo50654a(100, "measurement.upload.max_bundles");
        f33006x = l4Var.mo50654a(500, "measurement.upload.max_conversions_per_day");
        f33007y = l4Var.mo50654a(1000, "measurement.upload.max_error_events_per_day");
        f33008z = l4Var.mo50654a(1000, "measurement.upload.max_events_per_bundle");
        f32974A = l4Var.mo50654a(100000, "measurement.upload.max_events_per_day");
        f32975B = l4Var.mo50654a(50000, "measurement.upload.max_public_events_per_day");
        f32976C = l4Var.mo50654a(2419200000L, "measurement.upload.max_queue_time");
        f32977D = l4Var.mo50654a(10, "measurement.upload.max_realtime_events_per_day");
        f32978E = l4Var.mo50654a(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, "measurement.upload.max_batch_size");
        f32979F = l4Var.mo50654a(6, "measurement.upload.retry_count");
        f32980G = l4Var.mo50654a(1800000, "measurement.upload.retry_time");
        f32981H = new C14703k4(l4Var, "measurement.upload.url", "https://app-measurement.com/a");
        f32982I = l4Var.mo50654a(DateUtils.MILLIS_PER_HOUR, "measurement.upload.window_interval");
    }

    /* renamed from: a */
    public final long mo50685a() {
        return ((Long) f32996n.mo50725b()).longValue();
    }

    /* renamed from: b */
    public final long mo50686b() {
        return ((Long) f32997o.mo50725b()).longValue();
    }

    /* renamed from: c */
    public final long mo50687c() {
        return ((Long) f32999q.mo50725b()).longValue();
    }

    /* renamed from: d */
    public final long mo50688d() {
        return ((Long) f32982I.mo50725b()).longValue();
    }

    /* renamed from: e */
    public final String mo50689e() {
        return (String) f32986d.mo50725b();
    }

    /* renamed from: f */
    public final long mo50690f() {
        return ((Long) f32979F.mo50725b()).longValue();
    }

    /* renamed from: g */
    public final long mo50691g() {
        return ((Long) f32980G.mo50725b()).longValue();
    }

    /* renamed from: h */
    public final String mo50692h() {
        return (String) f32987e.mo50725b();
    }

    /* renamed from: i */
    public final String mo50693i() {
        return (String) f32981H.mo50725b();
    }

    /* renamed from: j */
    public final long mo50694j() {
        return ((Long) f33000r.mo50725b()).longValue();
    }

    /* renamed from: k */
    public final long mo50695k() {
        return ((Long) f33001s.mo50725b()).longValue();
    }

    /* renamed from: l */
    public final long mo50696l() {
        return ((Long) f33002t.mo50725b()).longValue();
    }

    /* renamed from: m */
    public final long mo50697m() {
        return ((Long) f32998p.mo50725b()).longValue();
    }

    /* renamed from: n */
    public final long mo50698n() {
        return ((Long) f32977D.mo50725b()).longValue();
    }

    /* renamed from: o */
    public final long mo50699o() {
        return ((Long) f32978E.mo50725b()).longValue();
    }

    public final long zzA() {
        return ((Long) f32976C.mo50725b()).longValue();
    }

    public final long zza() {
        return ((Long) f32983a.mo50725b()).longValue();
    }

    public final long zzb() {
        return ((Long) f32984b.mo50725b()).longValue();
    }

    public final long zzc() {
        return ((Long) f32985c.mo50725b()).longValue();
    }

    public final long zzd() {
        return ((Long) f32988f.mo50725b()).longValue();
    }

    public final long zze() {
        return ((Long) f32989g.mo50725b()).longValue();
    }

    public final long zzf() {
        return ((Long) f32990h.mo50725b()).longValue();
    }

    public final long zzg() {
        return ((Long) f32991i.mo50725b()).longValue();
    }

    public final long zzh() {
        return ((Long) f32992j.mo50725b()).longValue();
    }

    public final long zzi() {
        return ((Long) f32993k.mo50725b()).longValue();
    }

    public final long zzj() {
        return ((Long) f32994l.mo50725b()).longValue();
    }

    public final long zzk() {
        return ((Long) f32995m.mo50725b()).longValue();
    }

    public final long zzs() {
        return ((Long) f33003u.mo50725b()).longValue();
    }

    public final long zzt() {
        return ((Long) f33004v.mo50725b()).longValue();
    }

    public final long zzu() {
        return ((Long) f33005w.mo50725b()).longValue();
    }

    public final long zzv() {
        return ((Long) f33006x.mo50725b()).longValue();
    }

    public final long zzw() {
        return ((Long) f33007y.mo50725b()).longValue();
    }

    public final long zzx() {
        return ((Long) f33008z.mo50725b()).longValue();
    }

    public final long zzy() {
        return ((Long) f32974A.mo50725b()).longValue();
    }

    public final long zzz() {
        return ((Long) f32975B.mo50725b()).longValue();
    }
}
