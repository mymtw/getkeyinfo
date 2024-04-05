package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.assetpacks.C15581a2;
import com.google.android.play.core.assetpacks.C15588c1;
import com.google.android.play.core.assetpacks.C15662v;
import com.google.android.play.core.assetpacks.C15669w2;
import com.google.android.play.core.assetpacks.C15671x0;
import com.google.android.play.core.internal.C15686c0;

/* renamed from: com.google.android.play.core.appupdate.h */
public final class C15566h implements C15686c0 {

    /* renamed from: b */
    public final /* synthetic */ int f35032b;

    /* renamed from: c */
    public final C15686c0 f35033c;

    /* renamed from: d */
    public final C15686c0 f35034d;

    /* renamed from: e */
    public final C15686c0 f35035e;

    public /* synthetic */ C15566h(C15686c0 c0Var, C15686c0 c0Var2, C15686c0 c0Var3, int i) {
        this.f35032b = i;
        this.f35033c = c0Var;
        this.f35034d = c0Var2;
        this.f35035e = c0Var3;
    }

    public final Object zza() {
        switch (this.f35032b) {
            case 0:
                Object zza = this.f35033c.zza();
                Context context = (Context) ((C15568j) this.f35035e).f35038b.f35037c;
                C15588c1.m25311V0(context);
                return new C15565g((C15574p) zza, (C15564f) this.f35034d.zza(), context);
            default:
                return new C15662v(((C15669w2) this.f35033c).mo55501a(), (C15671x0) this.f35034d.zza(), (C15581a2) this.f35035e.zza());
        }
    }
}
