package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C15050o3;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
public final class C14790r0 extends C14635f1 {

    /* renamed from: f */
    public final /* synthetic */ Context f33065f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f33066g;

    /* renamed from: h */
    public final /* synthetic */ C14726m1 f33067h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14790r0(C14726m1 m1Var, Context context, Bundle bundle) {
        super(m1Var, true);
        this.f33067h = m1Var;
        this.f33065f = context;
        this.f33066g = bundle;
    }

    /* renamed from: a */
    public final void mo50280a() {
        zzcc zzcc;
        try {
            Preconditions.checkNotNull(this.f33065f);
            C14726m1 m1Var = this.f33067h;
            Context context = this.f33065f;
            m1Var.getClass();
            try {
                zzcc = zzcb.asInterface(DynamiteModule.m22901c(context, DynamiteModule.f32575c, ModuleDescriptor.MODULE_ID).mo49525b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                m1Var.mo50665a(e, true, false);
                zzcc = null;
            }
            m1Var.f32950f = zzcc;
            if (this.f33067h.f32950f == null) {
                this.f33067h.getClass();
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m22900a(this.f33065f, ModuleDescriptor.MODULE_ID);
            int d = DynamiteModule.m22902d(this.f33065f, ModuleDescriptor.MODULE_ID, false);
            ((zzcc) Preconditions.checkNotNull(this.f33067h.f32950f)).initialize(ObjectWrapper.wrap(this.f33065f), new zzcl(46000, (long) Math.max(a, d), d < a, (String) null, (String) null, (String) null, this.f33066g, C15050o3.m24586a(this.f33065f)), this.f32832b);
        } catch (Exception e2) {
            this.f33067h.mo50665a(e2, true, false);
        }
    }
}
