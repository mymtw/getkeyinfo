package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.firebase.platforminfo.C16685e;
import java.util.Arrays;
import java.util.List;
import p575gm.C17793c;
import p607km.C18144a;
import p607km.C18146b;
import p607km.C18147c;
import p607km.C18148d;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;
import p706wm.C18752d;
import p772tq.C20203a;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements C18401f {
    public static C18144a lambda$getComponents$0(C18398c cVar) {
        C17793c cVar2 = (C17793c) cVar.get(C17793c.class);
        Context context = (Context) cVar.get(Context.class);
        C18752d dVar = (C18752d) cVar.get(C18752d.class);
        Preconditions.checkNotNull(cVar2);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C18146b.f39625b == null) {
            synchronized (C18146b.class) {
                if (C18146b.f39625b == null) {
                    Bundle bundle = new Bundle(1);
                    cVar2.mo69021a();
                    if ("[DEFAULT]".equals(cVar2.f38673b)) {
                        dVar.mo69950c(C18148d.f39628b, C18147c.f39627a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar2.mo69025f());
                    }
                    C18146b.f39625b = new C18146b(C14726m1.m23709d(context, bundle).f32947c);
                }
            }
        }
        return C18146b.f39625b;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C18144a> a = C18396b.m31103a(C18144a.class);
        a.mo69934a(new C18409l(1, 0, C17793c.class));
        a.mo69934a(new C18409l(1, 0, Context.class));
        a.mo69934a(new C18409l(1, 0, C18752d.class));
        a.f40470e = C20203a.f44781k;
        a.mo69936c(2);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-analytics", "20.0.0")});
    }
}
