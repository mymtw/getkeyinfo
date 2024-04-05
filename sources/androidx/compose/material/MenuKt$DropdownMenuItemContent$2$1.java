package androidx.compose.material;

import androidx.compose.foundation.layout.C0763z;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19543e0;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

public final class MenuKt$DropdownMenuItemContent$2$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty$1;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0763z $this_Row;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$2$1(boolean z, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, C0763z zVar, int i, int i2) {
        super(2);
        this.$enabled = z;
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
        float f;
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            if (this.$enabled) {
                dVar.mo5465u(-1945695285);
                f = C19543e0.m33301S(dVar);
            } else {
                dVar.mo5465u(-1945695262);
                f = C19543e0.m33299P(dVar);
            }
            dVar.mo5406H();
            C1412t0[] t0VarArr = {ContentAlphaKt.f2198a.mo5908b(Float.valueOf(f))};
            final C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
            final C0763z zVar = this.$this_Row;
            final int i2 = this.$$dirty;
            final int i3 = this.$$dirty$1;
            CompositionLocalKt.m2530a(t0VarArr, C18263b.m30805A(dVar, -1705995688, new C19861p<C1302d, Integer, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1302d) obj, ((Number) obj2).intValue());
                    return C19394m.f43287a;
                }

                public final void invoke(C1302d dVar, int i) {
                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                        qVar.invoke(zVar, dVar, Integer.valueOf((i2 & 14) | ((i3 >> 12) & 112)));
                    } else {
                        dVar.mo5396C();
                    }
                }
            }), dVar, 56);
            return;
        }
        dVar.mo5396C();
    }
}
