package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0735g, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C0737h $scope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(C19862q<? super C0735g, ? super C1302d, ? super Integer, C19394m> qVar, C0737h hVar, int i) {
        super(2);
        this.$content = qVar;
        this.$scope = hVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$content.invoke(this.$scope, dVar, Integer.valueOf((this.$$dirty >> 6) & 112));
        } else {
            dVar.mo5396C();
        }
    }
}
