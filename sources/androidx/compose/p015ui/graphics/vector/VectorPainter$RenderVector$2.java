package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2 */
public final class VectorPainter$RenderVector$2 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1320f $composition;

    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$a */
    public static final class C1550a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1320f f3406a;

        public C1550a(C1320f fVar) {
            this.f3406a = fVar;
        }

        public final void dispose() {
            this.f3406a.dispose();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$RenderVector$2(C1320f fVar) {
        super(1);
        this.$composition = fVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C1550a(this.$composition);
    }
}
