package androidx.compose.animation.core;

import androidx.activity.C0114h;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8345d;
import p288y.C8347f;
import p753kq.C19862q;

public final class TransitionKt$animateSize$1 extends Lambda implements C19862q<Transition.C0402b<Object>, C1302d, Integer, C0429h0<C8347f>> {
    public static final TransitionKt$animateSize$1 INSTANCE = new TransitionKt$animateSize$1();

    public TransitionKt$animateSize$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<Object>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0429h0<C8347f> invoke(Transition.C0402b<Object> bVar, C1302d dVar, int i) {
        C19383o.m32797g(bVar, "$this$null");
        dVar.mo5465u(-1607152761);
        int i2 = C8347f.f18315d;
        C8345d dVar2 = C0467z0.f1203a;
        C0429h0<C8347f> L0 = C0761x.m1678L0(0.0f, 0.0f, new C8347f(C0114h.m319t(0.5f, 0.5f)), 3);
        dVar.mo5406H();
        return L0;
    }
}
