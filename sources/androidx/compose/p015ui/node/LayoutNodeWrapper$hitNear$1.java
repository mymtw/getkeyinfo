package androidx.compose.p015ui.node;

import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$hitNear$1 */
public final class LayoutNodeWrapper$hitNear$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ float $distanceFromEdge;
    public final /* synthetic */ C1734c<C> $hitTestResult;
    public final /* synthetic */ LayoutNodeWrapper.C1729c<T, C, M> $hitTestSource;
    public final /* synthetic */ boolean $isInLayer;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ T $this_hitNear;
    public final /* synthetic */ LayoutNodeWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeWrapper$hitNear$1(LayoutNodeWrapper layoutNodeWrapper, T t, LayoutNodeWrapper.C1729c<T, C, M> cVar, long j, C1734c<C> cVar2, boolean z, boolean z2, float f) {
        super(0);
        this.this$0 = layoutNodeWrapper;
        this.$this_hitNear = t;
        this.$hitTestSource = cVar;
        this.$pointerPosition = j;
        this.$hitTestResult = cVar2;
        this.$isTouchEvent = z;
        this.$isInLayer = z2;
        this.$distanceFromEdge = f;
    }

    public final void invoke() {
        LayoutNodeWrapper layoutNodeWrapper = this.this$0;
        T t = this.$this_hitNear.f3921d;
        LayoutNodeWrapper.C1729c<T, C, M> cVar = this.$hitTestSource;
        long j = this.$pointerPosition;
        C1734c<C> cVar2 = this.$hitTestResult;
        boolean z = this.$isTouchEvent;
        boolean z2 = this.$isInLayer;
        float f = this.$distanceFromEdge;
        C19857l<LayoutNodeWrapper, C19394m> lVar = LayoutNodeWrapper.f3847x;
        layoutNodeWrapper.mo6795f1(t, cVar, j, cVar2, z, z2, f);
    }
}
