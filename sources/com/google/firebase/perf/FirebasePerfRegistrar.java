package com.google.firebase.perf;

import androidx.annotation.Keep;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.dagger.C8643c;
import com.etsy.android.lib.dagger.C8646e;
import com.etsy.android.lib.dagger.C8647f;
import com.etsy.android.lib.dagger.C8648g;
import com.etsy.android.lib.logger.perf.C8705b;
import com.google.android.datatransport.C6518e;
import com.google.firebase.installations.C16563d;
import com.google.firebase.platforminfo.C16685e;
import dagger.internal.C17554c;
import java.util.Arrays;
import java.util.List;
import p040c9.C4633n;
import p040c9.C4685r;
import p552dn.C17697b;
import p552dn.C17699d;
import p560en.C17726a;
import p575gm.C17793c;
import p632nn.C18281g;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;

@Keep
public class FirebasePerfRegistrar implements C18401f {
    /* access modifiers changed from: private */
    public static C17697b providesFirebasePerformance(C18398c cVar) {
        C17726a aVar = new C17726a((C17793c) cVar.get(C17793c.class), (C16563d) cVar.get(C16563d.class), cVar.mo69938d(C18281g.class), cVar.mo69938d(C6518e.class));
        return (C17697b) C17554c.m29427b(new C17699d(new C4633n(aVar, 2), new C8647f(aVar, 3), new C8646e(aVar, 1), new C4685r(aVar, 1), new C8648g(aVar, 2), new C8643c(aVar, 1), new C8705b(aVar, 11))).get();
    }

    @Keep
    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C17697b> a = C18396b.m31103a(C17697b.class);
        a.mo69934a(new C18409l(1, 0, C17793c.class));
        a.mo69934a(new C18409l(1, 1, C18281g.class));
        a.mo69934a(new C18409l(1, 0, C16563d.class));
        a.mo69934a(new C18409l(1, 1, C6518e.class));
        a.f40470e = new C0472h();
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-perf", "20.0.4")});
    }
}
