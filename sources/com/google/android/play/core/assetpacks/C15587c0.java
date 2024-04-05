package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.internal.C15686c0;
import com.google.android.play.core.internal.C15709u;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
public final class C15587c0 implements C15686c0 {

    /* renamed from: b */
    public final /* synthetic */ int f35073b;

    /* renamed from: c */
    public final C15686c0 f35074c;

    /* renamed from: d */
    public final C15686c0 f35075d;

    public /* synthetic */ C15587c0(C15686c0 c0Var, C15686c0 c0Var2, int i) {
        this.f35073b = i;
        this.f35074c = c0Var;
        this.f35075d = c0Var2;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        switch (this.f35073b) {
            case 0:
                return new C15583b0(((C15669w2) this.f35074c).mo55501a(), (C15589c2) this.f35075d.zza());
            default:
                Object zza = this.f35074c.zza();
                Context a = ((C15669w2) this.f35075d).mo55501a();
                C15645q2 q2Var = (C15645q2) zza;
                C15709u.m25540a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
                C15709u.m25540a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
                C15588c1.m25311V0(q2Var);
                return q2Var;
        }
    }
}
