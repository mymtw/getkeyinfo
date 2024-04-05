package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class BasicTextKt$BasicText$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> $inlineComposables;
    public final /* synthetic */ C1913a $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$6(C1913a aVar, List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> list, int i) {
        super(2);
        this.$text = aVar;
        this.$inlineComposables = list;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            CoreTextKt.m1964a(this.$text, this.$inlineComposables, dVar, (this.$$dirty & 14) | 64);
        } else {
            dVar.mo5396C();
        }
    }
}
