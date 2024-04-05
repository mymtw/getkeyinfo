package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.material.ripple.g */
public final class C1241g {

    /* renamed from: a */
    public final LinkedHashMap f2596a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f2597b = new LinkedHashMap();

    /* renamed from: a */
    public final void mo5334a(C1235a aVar) {
        C19383o.m32797g(aVar, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) this.f2596a.get(aVar);
        if (rippleHostView != null) {
            C1235a aVar2 = (C1235a) this.f2597b.remove(rippleHostView);
        }
        this.f2596a.remove(aVar);
    }
}
