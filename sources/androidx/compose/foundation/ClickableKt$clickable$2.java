package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19862q;

final class ClickableKt$clickable$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ C1900g $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$2(boolean z, String str, C1900g gVar, C19846a<C19394m> aVar) {
        super(3);
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = gVar;
        this.$onClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(-756081143);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C0871p pVar = (C0871p) dVar2.mo5410J(IndicationKt.f1271a);
        dVar2.mo5465u(-492369756);
        Object v = dVar2.mo5467v();
        if (v == C1302d.C1303a.f2828a) {
            v = new C0641k();
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        C1436d b = ClickableKt.m1296b(aVar, (C0640j) v, pVar, this.$enabled, this.$onClickLabel, this.$role, this.$onClick);
        dVar2.mo5406H();
        return b;
    }
}
