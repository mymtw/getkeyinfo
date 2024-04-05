package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i9 */
public final class C14682i9 implements C14669h9 {

    /* renamed from: a */
    public static final C14677i4 f32885a;

    /* renamed from: b */
    public static final C14677i4 f32886b;

    /* renamed from: c */
    public static final C14677i4 f32887c;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        l4Var.mo50656c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f32885a = l4Var.mo50656c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f32886b = l4Var.mo50656c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f32887c = l4Var.mo50656c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final void zza() {
    }

    public final boolean zzb() {
        return ((Boolean) f32885a.mo50725b()).booleanValue();
    }

    public final boolean zzc() {
        return ((Boolean) f32886b.mo50725b()).booleanValue();
    }

    public final boolean zzd() {
        return ((Boolean) f32887c.mo50725b()).booleanValue();
    }
}
