package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$styledLabel$1$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$label = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            TextKt.m2282a(C2023s.m4469a(((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2413l, 0, 0, (C1952g) null, new C2029d(3), 245759), this.$label, dVar, (this.$$dirty >> 12) & 112);
        } else {
            dVar.mo5396C();
        }
    }
}
