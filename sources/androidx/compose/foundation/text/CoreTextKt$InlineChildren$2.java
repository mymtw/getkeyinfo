package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class CoreTextKt$InlineChildren$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> $inlineContents;
    public final /* synthetic */ C1913a $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextKt$InlineChildren$2(C1913a aVar, List<C1913a.C1916b<C19862q<String, C1302d, Integer, C19394m>>> list, int i) {
        super(2);
        this.$text = aVar;
        this.$inlineContents = list;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CoreTextKt.m1964a(this.$text, this.$inlineContents, dVar, this.$$changed | 1);
    }
}
