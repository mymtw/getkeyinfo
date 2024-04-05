package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0641k;
import androidx.compose.foundation.layout.C0760w;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class SnackbarKt$Snackbar$actionComposable$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ long $actionColor;
    public final /* synthetic */ String $actionLabel;
    public final /* synthetic */ C1251s1 $snackbarData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$actionComposable$1(long j, int i, C1251s1 s1Var, String str) {
        super(2);
        this.$actionColor = j;
        this.$$dirty = i;
        this.$snackbarData = s1Var;
        this.$actionLabel = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1302d dVar2 = dVar;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C0760w wVar = C1217o.f2534a;
            long j = this.$actionColor;
            dVar2.mo5465u(182742216);
            long j2 = C1545s.f3363h;
            C1262w wVar2 = new C1262w(j2, j, j2, C1545s.m3356b(((C1259v) dVar2.mo5410J(ColorsKt.f2187a)).mo5358e(), C19543e0.m33299P(dVar)));
            dVar.mo5406H();
            final C1251s1 s1Var = this.$snackbarData;
            C11381 r1 = new C19846a<C19394m>() {
                public final void invoke() {
                    s1Var.mo5347b();
                }
            };
            final String str = this.$actionLabel;
            ComposableLambdaImpl A = C18263b.m30805A(dVar2, -929149933, new C19862q<C0763z, C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C0763z) obj, (C1302d) obj2, ((Number) obj3).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C0763z zVar, C1302d dVar, int i) {
                    C19383o.m32797g(zVar, "$this$TextButton");
                    if ((i & 81) != 16 || !dVar.mo5442i()) {
                        TextKt.m2283b(str, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, 0, (C2030e) null, (C2029d) null, 0, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, (C2023s) null, dVar, 0, 0, 65534);
                        return;
                    }
                    dVar.mo5396C();
                }
            });
            dVar2.mo5465u(288797557);
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            dVar2.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            if (v == C1302d.C1303a.f2828a) {
                v = new C0641k();
                dVar2.mo5454o(v);
            }
            dVar.mo5406H();
            ButtonKt.m2170a(r1, aVar, true, (C0640j) v, (C1220p) null, ((C1225q1) dVar2.mo5410J(ShapesKt.f2252a)).f2547a, (C0556g) null, wVar2, C1217o.f2537d, A, dVar, 805306368, 0);
            dVar.mo5406H();
            return;
        }
        dVar.mo5396C();
    }
}
