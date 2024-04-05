package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.q4 */
public final class C15069q4 {

    /* renamed from: a */
    public final Context f33768a;

    /* renamed from: b */
    public String f33769b;

    /* renamed from: c */
    public String f33770c;

    /* renamed from: d */
    public String f33771d;

    /* renamed from: e */
    public Boolean f33772e;

    /* renamed from: f */
    public long f33773f;

    /* renamed from: g */
    public zzcl f33774g;

    /* renamed from: h */
    public boolean f33775h = true;

    /* renamed from: i */
    public final Long f33776i;

    /* renamed from: j */
    public String f33777j;

    @VisibleForTesting
    public C15069q4(Context context, zzcl zzcl, Long l) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f33768a = applicationContext;
        this.f33776i = l;
        if (zzcl != null) {
            this.f33774g = zzcl;
            this.f33769b = zzcl.zzf;
            this.f33770c = zzcl.zze;
            this.f33771d = zzcl.zzd;
            this.f33775h = zzcl.zzc;
            this.f33773f = zzcl.zzb;
            this.f33777j = zzcl.zzh;
            Bundle bundle = zzcl.zzg;
            if (bundle != null) {
                this.f33772e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
