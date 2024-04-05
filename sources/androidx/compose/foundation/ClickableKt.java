package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0612j;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.input.key.KeyInputModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ClickableKt {
    /* renamed from: a */
    public static final void m1295a(C0640j jVar, C1338j0<C0643m> j0Var, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(jVar, "interactionSource");
        C19383o.m32797g(j0Var, "pressedInteraction");
        ComposerImpl h = dVar.mo5440h(1761107222);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(j0Var) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            h.mo5465u(511388516);
            boolean I = h.mo5408I(j0Var) | h.mo5408I(jVar);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new ClickableKt$PressedInteractionSourceDisposableEffect$1$1(j0Var, jVar);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1415u.m3028b(jVar, (C19857l) c0, h);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ClickableKt$PressedInteractionSourceDisposableEffect$2(jVar, j0Var, i);
        }
    }

    /* renamed from: b */
    public static final C1436d m1296b(C1436d dVar, C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(dVar, "$this$clickable");
        C19383o.m32797g(jVar, "interactionSource");
        C19383o.m32797g(aVar, "onClick");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new ClickableKt$clickable$4(aVar, z, jVar, pVar, str, gVar));
    }

    /* renamed from: c */
    public static /* synthetic */ C1436d m1297c(C1436d dVar, C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar, C19846a aVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m1296b(dVar, jVar, pVar, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : gVar, aVar);
    }

    /* renamed from: d */
    public static C1436d m1298d(C1436d dVar, C19846a aVar) {
        C19383o.m32797g(dVar, "$this$clickable");
        C19383o.m32797g(aVar, "onClick");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new ClickableKt$clickable$2(true, (String) null, (C1900g) null, aVar));
    }

    /* renamed from: e */
    public static final C1436d m1299e(C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar, String str2, C19846a aVar, C19846a aVar2, C19846a aVar3) {
        C1436d.C1437a aVar4 = C1436d.C1437a.f3125b;
        C19383o.m32797g(jVar, "interactionSource");
        C19846a aVar5 = aVar3;
        C19383o.m32797g(aVar5, "onClick");
        return ComposedModifierKt.m3049a(aVar4, InspectableValueKt.f4032a, new ClickableKt$combinedClickable$4(aVar5, aVar, aVar2, z, jVar, pVar, str, gVar, str2));
    }

    /* renamed from: f */
    public static final C1436d m1300f(C1436d dVar, C1436d dVar2, C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar, String str2, C19846a<C19394m> aVar, C19846a<C19394m> aVar2) {
        C1436d dVar3 = dVar2;
        C0640j jVar2 = jVar;
        boolean z2 = z;
        C19846a<C19394m> aVar3 = aVar2;
        C19383o.m32797g(dVar2, "gestureModifiers");
        C19383o.m32797g(jVar, "interactionSource");
        C19383o.m32797g(aVar3, "onClick");
        C1436d dVar4 = dVar;
        C0871p pVar2 = pVar;
        return FocusableKt.m1306c(jVar, C0870o.m1926a(jVar, IndicationKt.m1310a(KeyInputModifierKt.m3421a(SemanticsModifierKt.m4174a(dVar, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(gVar, str, aVar, str2, z, aVar2)), new ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(z2, aVar3)), jVar, pVar), z2), z2).mo6148i0(dVar2);
    }

    /* renamed from: g */
    public static final Object m1301g(C0612j jVar, long j, C0640j jVar2, C1338j0<C0643m> j0Var, C1342k1<? extends C19846a<Boolean>> k1Var, C19340c<? super C19394m> cVar) {
        Object d = C19697g.m33466d(new ClickableKt$handlePressInteraction$2(jVar, j, jVar2, j0Var, k1Var, (C19340c<? super ClickableKt$handlePressInteraction$2>) null), cVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : C19394m.f43287a;
    }
}
