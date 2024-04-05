package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.focus.C1475i;
import androidx.compose.p015ui.focus.C1477k;
import androidx.compose.p015ui.focus.FocusPropertiesKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p031c0.C4351b;
import p098f0.C6767e;
import p753kq.C19857l;
import p753kq.C19862q;

final class FocusableKt$focusableInNonTouchMode$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$2(boolean z, C0640j jVar) {
        super(3);
        this.$enabled = z;
        this.$interactionSource = jVar;
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-618949501);
        final C4351b bVar = (C4351b) dVar2.mo5410J(CompositionLocalsKt.f4024j);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C05241 r0 = new C19857l<C1475i, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1475i) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1475i iVar) {
                C19383o.m32797g(iVar, "$this$focusProperties");
                iVar.mo6213a(!(bVar.mo14295a() == 1));
            }
        };
        C6767e<C1477k> eVar = FocusPropertiesKt.f3168a;
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        C1477k kVar = new C1477k(r0);
        aVar.mo6148i0(kVar);
        C1436d b = FocusableKt.m1305b(this.$interactionSource, kVar, this.$enabled);
        dVar2.mo5406H();
        return b;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }
}
