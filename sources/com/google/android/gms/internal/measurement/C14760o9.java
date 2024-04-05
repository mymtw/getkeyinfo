package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o9 */
public final class C14760o9 implements C14747n9 {

    /* renamed from: a */
    public static final C14677i4 f33028a;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        l4Var.mo50656c("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f33028a = l4Var.mo50656c("measurement.collection.redundant_engagement_removal_enabled", false);
        l4Var.mo50654a(0, "measurement.id.collection.redundant_engagement_removal_enabled");
    }

    public final boolean zza() {
        return ((Boolean) f33028a.mo50725b()).booleanValue();
    }
}
