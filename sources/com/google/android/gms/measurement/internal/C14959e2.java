package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.requests.EtsyRequest;
import com.etsy.android.p327ui.user.addresses.C11416h;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14638f4;
import com.google.android.gms.internal.measurement.C14889z3;
import com.google.android.play.core.appupdate.C15562d;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import org.apache.commons.lang3.time.DateUtils;
import p040c9.C4697rb;
import p322cd.C8580a;
import p322cd.C8581b;
import p514bk.C14088a;
import p628nj.C18263b;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.e2 */
public final class C14959e2 {

    /* renamed from: A */
    public static final C14950d2<Long> f33367A = m24282a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C14992i.f33559b);

    /* renamed from: B */
    public static final C14950d2<Long> f33368B = m24282a("measurement.upload.retry_time", 1800000L, 1800000L, C15562d.f35020e);

    /* renamed from: C */
    public static final C14950d2<Integer> f33369C = m24282a("measurement.upload.retry_count", 6, 6, C0114h.f180q);

    /* renamed from: D */
    public static final C14950d2<Long> f33370D = m24282a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C15073r.f33792b);

    /* renamed from: E */
    public static final C14950d2<Integer> f33371E = m24282a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C8581b.f18676b);

    /* renamed from: F */
    public static final C14950d2<Integer> f33372F = m24282a("measurement.audience.filter_result_max_count", 200, 200, C15091t.f33845b);

    /* renamed from: G */
    public static final C14950d2<Integer> f33373G = m24282a("measurement.upload.max_public_user_properties", 25, 25, (C14941c2) null);

    /* renamed from: H */
    public static final C14950d2<Integer> f33374H = m24282a("measurement.upload.max_event_name_cardinality", 500, 500, (C14941c2) null);

    /* renamed from: I */
    public static final C14950d2<Integer> f33375I = m24282a("measurement.upload.max_public_event_params", 25, 25, (C14941c2) null);

    /* renamed from: J */
    public static final C14950d2<Long> f33376J;

    /* renamed from: K */
    public static final C14950d2<Boolean> f33377K;

    /* renamed from: L */
    public static final C14950d2<String> f33378L = m24282a("measurement.test.string_flag", "---", "---", C4697rb.f10629b);

    /* renamed from: M */
    public static final C14950d2<Long> f33379M = m24282a("measurement.test.long_flag", -1L, -1L, C15107v.f33903b);

    /* renamed from: N */
    public static final C14950d2<Integer> f33380N = m24282a("measurement.test.int_flag", -2, -2, C15115w.f33937b);

    /* renamed from: O */
    public static final C14950d2<Double> f33381O;

    /* renamed from: P */
    public static final C14950d2<Integer> f33382P = m24282a("measurement.experiment.max_ids", 50, 50, C15139z.f34001b);

    /* renamed from: Q */
    public static final C14950d2<Integer> f33383Q = m24282a("measurement.max_bundles_per_iteration", 100, 100, C14921a0.f33258b);

    /* renamed from: R */
    public static final C14950d2<Long> f33384R = m24282a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C14930b0.f33277b);

    /* renamed from: S */
    public static final C14950d2<Boolean> f33385S;

    /* renamed from: T */
    public static final C14950d2<Boolean> f33386T;

    /* renamed from: U */
    public static final C14950d2<Boolean> f33387U;

    /* renamed from: V */
    public static final C14950d2<Boolean> f33388V;

    /* renamed from: W */
    public static final C14950d2<Boolean> f33389W;

    /* renamed from: X */
    public static final C14950d2<Boolean> f33390X;

    /* renamed from: Y */
    public static final C14950d2<Boolean> f33391Y;

    /* renamed from: Z */
    public static final C14950d2<Boolean> f33392Z;

    /* renamed from: a */
    public static final List<C14950d2<?>> f33393a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C14950d2<Boolean> f33394a0;

    /* renamed from: b */
    public static final Set<C14950d2<?>> f33395b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0 */
    public static final C14950d2<Boolean> f33396b0;

    /* renamed from: c */
    public static final C14950d2<Long> f33397c;

    /* renamed from: c0 */
    public static final C14950d2<Boolean> f33398c0;

    /* renamed from: d */
    public static final C14950d2<Long> f33399d;

    /* renamed from: d0 */
    public static final C14950d2<Boolean> f33400d0;

    /* renamed from: e */
    public static final C14950d2<Long> f33401e;

    /* renamed from: e0 */
    public static final C14950d2<Boolean> f33402e0;

    /* renamed from: f */
    public static final C14950d2<String> f33403f = m24282a("measurement.config.url_scheme", "https", "https", C15082s.f33817b);

    /* renamed from: f0 */
    public static final C14950d2<Boolean> f33404f0;

    /* renamed from: g */
    public static final C14950d2<String> f33405g = m24282a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C14939c0.f33296b);

    /* renamed from: g0 */
    public static final C14950d2<Boolean> f33406g0;

    /* renamed from: h */
    public static final C14950d2<Integer> f33407h = m24282a("measurement.upload.max_bundles", 100, 100, C15056p0.f33741b);

    /* renamed from: h0 */
    public static final C14950d2<Boolean> f33408h0;

    /* renamed from: i */
    public static final C14950d2<Integer> f33409i = m24282a("measurement.upload.max_batch_size", 65536, 65536, C14931b1.f33278b);

    /* renamed from: i0 */
    public static final C14950d2<Boolean> f33410i0;

    /* renamed from: j */
    public static final C14950d2<Integer> f33411j = m24282a("measurement.upload.max_bundle_size", 65536, 65536, C15048o1.f33720b);

    /* renamed from: j0 */
    public static final C14950d2<Boolean> f33412j0;

    /* renamed from: k */
    public static final C14950d2<Integer> f33413k = m24282a("measurement.upload.max_events_per_bundle", 1000, 1000, C15125x1.f33964b);

    /* renamed from: k0 */
    public static final C14950d2<Boolean> f33414k0;

    /* renamed from: l */
    public static final C14950d2<Integer> f33415l = m24282a("measurement.upload.max_events_per_day", 100000, 100000, C15133y1.f33982b);

    /* renamed from: l0 */
    public static final C14950d2<Boolean> f33416l0;

    /* renamed from: m */
    public static final C14950d2<Integer> f33417m = m24282a("measurement.upload.max_error_events_per_day", 1000, 1000, C15123x.f33962b);

    /* renamed from: m0 */
    public static final C14950d2<Integer> f33418m0 = m24282a("measurement.service.storage_consent_support_version", 203600, 203600, C14949d1.f33337b);

    /* renamed from: n */
    public static final C14950d2<Integer> f33419n = m24282a("measurement.upload.max_public_events_per_day", 50000, 50000, C15002j0.f33588b);

    /* renamed from: n0 */
    public static final C14950d2<Boolean> f33420n0;

    /* renamed from: o */
    public static final C14950d2<Integer> f33421o;

    /* renamed from: o0 */
    public static final C14950d2<Boolean> f33422o0;

    /* renamed from: p */
    public static final C14950d2<Integer> f33423p = m24282a("measurement.upload.max_realtime_events_per_day", 10, 10, C14967f1.f33468b);

    /* renamed from: p0 */
    public static final C14950d2<Boolean> f33424p0;

    /* renamed from: q */
    public static final C14950d2<Integer> f33425q = m24282a("measurement.store.max_stored_events_per_app", 100000, 100000, C15075r1.f33794b);

    /* renamed from: q0 */
    public static final C14950d2<Boolean> f33426q0;

    /* renamed from: r */
    public static final C14950d2<String> f33427r = m24282a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C15141z1.f34003b);

    /* renamed from: r0 */
    public static final C14950d2<Boolean> f33428r0;

    /* renamed from: s */
    public static final C14950d2<Long> f33429s = m24282a("measurement.upload.backoff_period", 43200000L, 43200000L, C14923a2.f33261b);

    /* renamed from: s0 */
    public static final C14950d2<Boolean> f33430s0;

    /* renamed from: t */
    public static final C14950d2<Long> f33431t;

    /* renamed from: t0 */
    public static final C14950d2<Boolean> f33432t0;

    /* renamed from: u */
    public static final C14950d2<Long> f33433u;

    /* renamed from: u0 */
    public static final C14950d2<Boolean> f33434u0;

    /* renamed from: v */
    public static final C14950d2<Long> f33435v = m24282a("measurement.upload.debug_upload_interval", 1000L, 1000L, C19543e0.f43493f);

    /* renamed from: v0 */
    public static final C14950d2<Boolean> f33436v0;

    /* renamed from: w */
    public static final C14950d2<Long> f33437w = m24282a("measurement.upload.minimum_delay", 500L, 500L, C18263b.f40060Y);

    /* renamed from: w0 */
    public static final C14950d2<Boolean> f33438w0;

    /* renamed from: x */
    public static final C14950d2<Long> f33439x;

    /* renamed from: x0 */
    public static final C14950d2<Boolean> f33440x0;

    /* renamed from: y */
    public static final C14950d2<Long> f33441y;

    /* renamed from: y0 */
    public static final C14950d2<Boolean> f33442y0;

    /* renamed from: z */
    public static final C14950d2<Long> f33443z = m24282a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C19421p.f43317g);

    static {
        Long valueOf = Long.valueOf(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);
        f33397c = m24282a("measurement.ad_id_cache_time", valueOf, valueOf, C8580a.f18675b);
        Long valueOf2 = Long.valueOf(DateUtils.MILLIS_PER_DAY);
        f33399d = m24282a("measurement.monitoring.sample_period_millis", valueOf2, valueOf2, C0761x.f1558b);
        Long valueOf3 = Long.valueOf(DateUtils.MILLIS_PER_HOUR);
        f33401e = m24282a("measurement.config.cache_time", valueOf2, valueOf3, C14088a.f31027h);
        Integer valueOf4 = Integer.valueOf(EtsyRequest.DEFAULT_TIMEOUT);
        f33421o = m24282a("measurement.upload.max_conversions_per_day", valueOf4, valueOf4, C15100u0.f33860b);
        m24282a("measurement.upload.window_interval", valueOf3, valueOf3, C14932b2.f33279b);
        f33431t = m24282a("measurement.upload.interval", valueOf3, valueOf3, C1993m.f4506u);
        f33433u = m24282a("measurement.upload.realtime_upload_interval", valueOf, valueOf, C15055p.f33739b);
        Long valueOf5 = Long.valueOf(DateUtils.MILLIS_PER_MINUTE);
        f33439x = m24282a("measurement.alarm_manager.minimum_interval", valueOf5, valueOf5, C19382n.f43252b);
        f33441y = m24282a("measurement.upload.stale_data_deletion_interval", valueOf2, valueOf2, C19388s.f43276g);
        Long valueOf6 = Long.valueOf(LoginStatusClient.DEFAULT_TOAST_DURATION_MS);
        f33376J = m24282a("measurement.service_client.idle_disconnect_millis", valueOf6, valueOf6, C11416h.f25159c);
        Boolean bool = Boolean.FALSE;
        f33377K = m24282a("measurement.test.boolean_flag", bool, bool, C15099u.f33859b);
        Double valueOf7 = Double.valueOf(-3.0d);
        f33381O = m24282a("measurement.test.double_flag", valueOf7, valueOf7, C15131y.f33980b);
        f33385S = m24282a("measurement.validation.internal_limits_internal_event_params", bool, bool, C14948d0.f33336b);
        Boolean bool2 = Boolean.TRUE;
        f33386T = m24282a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C14957e0.f33365b);
        f33387U = m24282a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, C14966f0.f33467b);
        m24282a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C14984h0.f33549b);
        f33388V = m24282a("measurement.quality.checksum", bool, bool, (C14941c2) null);
        f33389W = m24282a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C14993i0.f33560b);
        f33390X = m24282a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C15011k0.f33624b);
        f33391Y = m24282a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C15020l0.f33646b);
        f33392Z = m24282a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C15029m0.f33674b);
        f33394a0 = m24282a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C15038n0.f33697b);
        f33396b0 = m24282a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, C15047o0.f33719b);
        f33398c0 = m24282a("measurement.ga.ga_app_id", bool, bool, C15065q0.f33762b);
        f33400d0 = m24282a("measurement.lifecycle.app_in_background_parameter", bool, bool, C15074r0.f33793b);
        f33402e0 = m24282a("measurement.integration.disable_firebase_instance_id", bool, bool, C15083s0.f33818b);
        f33404f0 = m24282a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, C15092t0.f33846b);
        f33406g0 = m24282a("measurement.collection.service.update_with_analytics_fix", bool, bool, C15108v0.f33904b);
        f33408h0 = m24282a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C15116w0.f33938b);
        f33410i0 = m24282a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C15124x0.f33963b);
        f33412j0 = m24282a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C15132y0.f33981b);
        f33414k0 = m24282a("measurement.upload.file_truncate_fix", bool, bool, C15140z0.f34002b);
        m24282a("measurement.collection.synthetic_data_mitigation", bool, bool, C14922a1.f33260b);
        f33416l0 = m24282a("measurement.androidId.delete_feature", bool2, bool2, C14940c1.f33297b);
        m24282a("measurement.client.click_identifier_control.dev", bool, bool, C14958e1.f33366b);
        m24282a("measurement.service.click_identifier_control", bool, bool, C14976g1.f33515b);
        f33420n0 = m24282a("measurement.config.persist_last_modified", bool2, bool2, C14994i1.f33561b);
        f33422o0 = m24282a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, C15003j1.f33589b);
        f33424p0 = m24282a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C15012k1.f33625b);
        f33426q0 = m24282a("measurement.module.pixie.ees", bool2, bool2, C15021l1.f33647b);
        f33428r0 = m24282a("measurement.module.pixie.fix_array", bool2, bool2, C15030m1.f33675b);
        f33430s0 = m24282a("measurement.adid_zero.service", bool, bool, C15039n1.f33698b);
        f33432t0 = m24282a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C15057p1.f33742b);
        f33434u0 = m24282a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C15066q1.f33763b);
        m24282a("measurement.adid_zero.adid_uid", bool, bool, C15084s1.f33819b);
        f33436v0 = m24282a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C15093t1.f33847b);
        f33438w0 = m24282a("measurement.service.refactor.package_side_screen", bool2, bool2, C15101u1.f33861b);
        f33440x0 = m24282a("measurement.config.fix_feature_flags_from_config", bool2, bool2, C15109v1.f33905b);
        f33442y0 = m24282a("measurement.service.event_config_fix", bool2, bool2, C15117w1.f33939b);
    }

    @VisibleForTesting
    /* renamed from: a */
    public static <V> C14950d2<V> m24282a(String str, V v, V v2, C14941c2<V> c2Var) {
        C14950d2<V> d2Var = new C14950d2<>(str, v, v2, c2Var);
        f33393a.add(d2Var);
        return d2Var;
    }

    /* renamed from: b */
    public static Map<String, String> m24283b(Context context) {
        C14889z3 a = C14889z3.m24204a(context.getContentResolver(), C14638f4.m23568a());
        return a == null ? Collections.emptyMap() : a.mo51008b();
    }
}
