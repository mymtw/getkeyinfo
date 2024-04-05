package androidx.compose.animation.core;

import android.support.p013v4.media.C0070b;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import com.etsy.android.lib.models.editable.EditableListing;
import kotlin.jvm.internal.C19383o;

public final class TransitionKt {
    /* renamed from: a */
    public static final Transition m1099a(Transition transition, EnterExitState enterExitState, EnterExitState enterExitState2, C1302d dVar, int i) {
        C19383o.m32797g(transition, "<this>");
        dVar.mo5465u(-198307638);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(transition);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new Transition(new C0418c0(enterExitState), C0070b.m184f(new StringBuilder(), transition.f1036b, EditableListing.CATEGORY_PATH_JOIN_STRING, "EnterExitTransition"));
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        Transition transition2 = (Transition) v;
        C1415u.m3028b(transition2, new TransitionKt$createChildTransitionInternal$1(transition, transition2), dVar);
        if (transition.mo3413e()) {
            transition2.mo3416h(transition.f1045k, enterExitState, enterExitState2);
        } else {
            transition2.mo3417i(enterExitState2, dVar, ((i >> 3) & 8) | ((i >> 6) & 14));
            transition2.f1044j.setValue(Boolean.FALSE);
        }
        dVar.mo5406H();
        return transition2;
    }

    /* renamed from: b */
    public static final Transition.C0400a m1100b(Transition transition, C0437l0 l0Var, String str, C1302d dVar, int i) {
        Transition<S>.a<T, V>.a<T, V> aVar;
        C19383o.m32797g(transition, "<this>");
        C19383o.m32797g(l0Var, "typeConverter");
        dVar.mo5465u(-1714122528);
        if ((i & 2) != 0) {
            str = "DeferredAnimation";
        }
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(transition);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new Transition.C0400a(transition, l0Var, str);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        Transition.C0400a aVar2 = (Transition.C0400a) v;
        C1415u.m3028b(aVar2, new TransitionKt$createDeferredAnimation$1(transition, aVar2), dVar);
        if (transition.mo3413e() && (aVar = aVar2.f1049c) != null) {
            Transition<S> transition2 = aVar2.f1050d;
            aVar.f1051b.mo3425g(aVar.f1053d.invoke(transition2.mo3411c().mo3270b()), aVar.f1053d.invoke(transition2.mo3411c().mo3269a()), (C0454t) aVar.f1052c.invoke(transition2.mo3411c()));
        }
        dVar.mo5406H();
        return aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.compose.animation.core.Transition$d} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r1 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.animation.core.Transition.C0404d m1101c(androidx.compose.animation.core.Transition r8, java.lang.Object r9, java.lang.Object r10, androidx.compose.animation.core.C0454t r11, androidx.compose.animation.core.C0435k0 r12, java.lang.String r13, androidx.compose.runtime.C1302d r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "animationSpec"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r0 = -304821198(0xffffffffedd4cc32, float:-8.23221E27)
            r14.mo5465u(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r14.mo5465u(r0)
            boolean r0 = r14.mo5408I(r8)
            java.lang.Object r1 = r14.mo5467v()
            if (r0 != 0) goto L_0x002e
            androidx.compose.runtime.d$a$a r0 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r0) goto L_0x003f
        L_0x002e:
            androidx.compose.animation.core.Transition$d r1 = new androidx.compose.animation.core.Transition$d
            androidx.compose.animation.core.j r5 = androidx.activity.C0114h.m290U(r12, r10)
            r2 = r1
            r3 = r8
            r4 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r14.mo5454o(r1)
        L_0x003f:
            r14.mo5406H()
            androidx.compose.animation.core.Transition$d r1 = (androidx.compose.animation.core.Transition.C0404d) r1
            boolean r12 = r8.mo3413e()
            if (r12 == 0) goto L_0x004e
            r1.mo3425g(r9, r10, r11)
            goto L_0x0051
        L_0x004e:
            r1.mo3426h(r10, r11)
        L_0x0051:
            androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1 r9 = new androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1
            r9.<init>(r8, r1)
            androidx.compose.runtime.C1415u.m3028b(r1, r9, r14)
            r14.mo5406H()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.TransitionKt.m1101c(androidx.compose.animation.core.Transition, java.lang.Object, java.lang.Object, androidx.compose.animation.core.t, androidx.compose.animation.core.k0, java.lang.String, androidx.compose.runtime.d):androidx.compose.animation.core.Transition$d");
    }

    /* renamed from: d */
    public static final Transition m1102d(C0418c0 c0Var, String str, C1302d dVar) {
        C19383o.m32797g(c0Var, "transitionState");
        dVar.mo5465u(882913843);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(c0Var);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new Transition(c0Var, str);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        Transition transition = (Transition) v;
        transition.mo3409a(c0Var.f1094b.getValue(), dVar, 0);
        C1415u.m3028b(transition, new TransitionKt$updateTransition$2(transition), dVar);
        dVar.mo5406H();
        return transition;
    }

    /* renamed from: e */
    public static final <T> Transition<T> m1103e(T t, String str, C1302d dVar, int i, int i2) {
        dVar.mo5465u(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        dVar.mo5465u(-492369756);
        Object v = dVar.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new Transition(new C0418c0(t), str);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        Transition<T> transition = (Transition) v;
        transition.mo3409a(t, dVar, (i & 8) | 48 | (i & 14));
        C1415u.m3028b(transition, new TransitionKt$updateTransition$1(transition), dVar);
        dVar.mo5406H();
        return transition;
    }
}
