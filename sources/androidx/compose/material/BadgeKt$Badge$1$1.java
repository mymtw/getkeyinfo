package androidx.compose.material;

import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.text.C2023s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

final class BadgeKt$Badge$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty$1;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0763z $this_Row;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$Badge$1$1(C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, C0763z zVar, int i, int i2) {
        super(2);
        this.$content = qVar;
        this.$this_Row = zVar;
        this.$$dirty = i;
        this.$$dirty$1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C2023s a = C2023s.m4469a(((C1178d2) dVar.mo5410J(TypographyKt.f2371a)).f2412k, 0, C1179e.f2417c, (C1952g) null, (C2029d) null, 262141);
            final C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
            final C0763z zVar = this.$this_Row;
            final int i2 = this.$$dirty;
            final int i3 = this.$$dirty$1;
            TextKt.m2282a(a, C18263b.m30805A(dVar, 915155142, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        qVar.invoke(zVar, dVar, Integer.valueOf((i2 & 14) | ((i3 >> 6) & 112)));
                    } else {
                        dVar.mo5396C();
                    }
                }
            }), dVar, 48);
            return;
        }
        dVar.mo5396C();
    }
}
