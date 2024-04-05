package androidx.compose.animation.core;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1415u;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import p174m0.C7284d;
import p174m0.C7287g;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8347f;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.core.a */
public final class C0411a {

    /* renamed from: a */
    public static final C0429h0<Float> f1085a = C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7);

    static {
        C8345d dVar = C0467z0.f1203a;
        C0761x.m1678L0(0.0f, 0.0f, new C7284d(0.1f), 3);
        int i = C8347f.f18315d;
        C0114h.m319t(0.5f, 0.5f);
        int i2 = C8343c.f18298e;
        C19421p.m32952q(0.5f, 0.5f);
        int i3 = C7287g.f16165c;
        C19421p.m32949o(1, 1);
    }

    /* renamed from: a */
    public static final C0424f m1105a(float f, C0454t tVar, C1302d dVar, int i) {
        dVar.mo5465u(704104481);
        C0424f c = m1107c(new C7284d(f), VectorConvertersKt.f1078c, tVar, (Float) null, (C19857l) null, dVar, (i & 14) | ((i << 3) & 896) | ((i << 6) & 57344), 8);
        dVar.mo5406H();
        return c;
    }

    /* renamed from: b */
    public static final C0424f m1106b(float f, C0433j0 j0Var, C1302d dVar, int i, int i2) {
        dVar.mo5465u(1091643291);
        C0422e eVar = j0Var;
        if ((i2 & 2) != 0) {
            eVar = f1085a;
        }
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        dVar.mo5465u(841393485);
        C0422e eVar2 = eVar;
        if (eVar == f1085a) {
            Float valueOf = Float.valueOf(f2);
            dVar.mo5465u(1157296644);
            boolean I = dVar.mo5408I(valueOf);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = C0761x.m1678L0(0.0f, 0.0f, Float.valueOf(f2), 3);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            eVar2 = (C0422e) v;
        }
        dVar.mo5406H();
        int i3 = i & 14;
        int i4 = i << 3;
        C0424f c = m1107c(Float.valueOf(f), VectorConvertersKt.f1076a, eVar2, Float.valueOf(f2), (C19857l) null, dVar, i3 | (i4 & 7168) | (i4 & 57344), 0);
        dVar.mo5406H();
        return c;
    }

    /* renamed from: c */
    public static final C0424f m1107c(Object obj, C0435k0 k0Var, C0422e eVar, Float f, C19857l lVar, C1302d dVar, int i, int i2) {
        C19383o.m32797g(k0Var, "typeConverter");
        dVar.mo5465u(-846382129);
        if ((i2 & 4) != 0) {
            dVar.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            if (v == C1302d.C1303a.f2828a) {
                v = C0761x.m1678L0(0.0f, 0.0f, f, 3);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            eVar = (C0422e) v;
        }
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        dVar.mo5465u(-492369756);
        Object v2 = dVar.mo5467v();
        C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
        if (v2 == aVar) {
            v2 = new Animatable(obj, k0Var, null);
            dVar.mo5454o(v2);
        }
        dVar.mo5406H();
        Animatable animatable = (Animatable) v2;
        C1338j0 E0 = C0761x.m1664E0(lVar, dVar);
        C1338j0 E02 = C0761x.m1664E0(eVar, dVar);
        dVar.mo5465u(-492369756);
        Object v3 = dVar.mo5467v();
        if (v3 == aVar) {
            v3 = C17782b.m29872l(-1, (BufferOverflow) null, 6);
            dVar.mo5454o(v3);
        }
        dVar.mo5406H();
        C19499d dVar2 = (C19499d) v3;
        C1415u.m3033g(new AnimateAsStateKt$animateValueAsState$2(dVar2, obj), dVar);
        C1415u.m3031e(dVar2, new AnimateAsStateKt$animateValueAsState$3(dVar2, animatable, E02, E0, (C19340c<? super AnimateAsStateKt$animateValueAsState$3>) null), dVar);
        C0424f<T, V> fVar = animatable.f1008c;
        dVar.mo5406H();
        return fVar;
    }
}
