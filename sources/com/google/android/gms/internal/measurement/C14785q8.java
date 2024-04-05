package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
public final class C14785q8 implements C14772p8 {

    /* renamed from: a */
    public static final C14664h4 f33061a;

    static {
        C14716l4 l4Var = new C14716l4(C14638f4.m23568a(), false);
        l4Var.mo50656c("measurement.client.consent_state_v1", true);
        l4Var.mo50656c("measurement.client.3p_consent_state_v1", true);
        l4Var.mo50656c("measurement.service.consent_state_v1_W36", true);
        f33061a = l4Var.mo50654a(203600, "measurement.service.storage_consent_support_version");
    }

    public final long zza() {
        return ((Long) f33061a.mo50725b()).longValue();
    }
}
