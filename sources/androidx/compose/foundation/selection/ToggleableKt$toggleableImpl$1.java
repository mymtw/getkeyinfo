package androidx.compose.foundation.selection;

import androidx.compose.foundation.C0620h;
import androidx.compose.foundation.C0870o;
import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p098f0.C6764b;
import p098f0.C6766d;
import p753kq.C19846a;
import p753kq.C19862q;

final class ToggleableKt$toggleableImpl$1 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0871p $indication;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C1900g $role;
    public final /* synthetic */ ToggleableState $state;

    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$a */
    public static final class C0889a implements C6764b {

        /* renamed from: b */
        public final /* synthetic */ C1338j0<Boolean> f1895b;

        public C0889a(C1338j0<Boolean> j0Var) {
            this.f1895b = j0Var;
        }

        /* renamed from: M */
        public final void mo3622M(C6766d dVar) {
            C19383o.m32797g(dVar, "scope");
            this.f1895b.setValue(dVar.mo6818a(ScrollableKt.f1341b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1(C19846a<C19394m> aVar, boolean z, C0640j jVar, C0871p pVar, C1900g gVar, ToggleableState toggleableState) {
        super(3);
        this.$onClick = aVar;
        this.$enabled = z;
        this.$interactionSource = jVar;
        this.$indication = pVar;
        this.$role = gVar;
        this.$state = toggleableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C1436d dVar3 = dVar;
        C1302d dVar4 = dVar2;
        C19383o.m32797g(dVar3, "$this$composed");
        dVar4.mo5465u(2121285826);
        dVar4.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        Object obj = C1302d.C1303a.f2828a;
        if (v == obj) {
            v = C0761x.m1751w0((Object) null, C1351n1.f2948a);
            dVar4.mo5454o(v);
        }
        dVar2.mo5406H();
        C1338j0 j0Var = (C1338j0) v;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C1436d a = SemanticsModifierKt.m4174a(aVar, true, new ToggleableKt$toggleableImpl$1$semantics$1(this.$role, this.$state, this.$enabled, this.$onClick));
        C1338j0 E0 = C0761x.m1664E0(this.$onClick, dVar4);
        dVar4.mo5465u(-2134919160);
        if (this.$enabled) {
            ClickableKt.m1295a(this.$interactionSource, j0Var, dVar4, 48);
        }
        dVar2.mo5406H();
        C19846a a2 = C0620h.m1437a(dVar2);
        dVar4.mo5465u(-492369756);
        Object v2 = dVar2.mo5467v();
        if (v2 == obj) {
            v2 = C0761x.m1751w0(Boolean.TRUE, C1351n1.f2948a);
            dVar4.mo5454o(v2);
        }
        dVar2.mo5406H();
        C1338j0 j0Var2 = (C1338j0) v2;
        C1338j0 E02 = C0761x.m1664E0(new ToggleableKt$toggleableImpl$1$delayPressInteraction$1(j0Var2, a2), dVar4);
        C0640j jVar = this.$interactionSource;
        Boolean valueOf = Boolean.valueOf(this.$enabled);
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$1 = r6;
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$12 = new ToggleableKt$toggleableImpl$1$gestures$1(this.$enabled, this.$interactionSource, j0Var, E02, E0, (C19340c<? super ToggleableKt$toggleableImpl$1$gestures$1>) null);
        C1436d a3 = SuspendingPointerInputFilterKt.m3483a(aVar, jVar, valueOf, toggleableKt$toggleableImpl$1$gestures$1);
        dVar4.mo5465u(-492369756);
        Object v3 = dVar2.mo5467v();
        if (v3 == obj) {
            v3 = new C0889a(j0Var2);
            dVar4.mo5454o(v3);
        }
        dVar2.mo5406H();
        C1436d i0 = FocusableKt.m1306c(this.$interactionSource, C0870o.m1926a(this.$interactionSource, IndicationKt.m1310a(dVar3.mo6148i0((C1436d) v3).mo6148i0(a), this.$interactionSource, this.$indication), this.$enabled), this.$enabled).mo6148i0(a3);
        dVar2.mo5406H();
        return i0;
    }
}
