package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class LazyListKt$LazyList$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19857l<C0859r, C19394m> $content;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ C1428a.C1430b $horizontalAlignment;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C1428a.C1431c $verticalAlignment;
    public final /* synthetic */ C0718d.C0729k $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyListKt$LazyList$2(C1436d dVar, LazyListState lazyListState, C0759v vVar, boolean z, boolean z2, C0608f fVar, boolean z3, C1428a.C1430b bVar, C0718d.C0729k kVar, C1428a.C1431c cVar, C0718d.C0722d dVar2, C19857l<? super C0859r, C19394m> lVar, int i, int i2, int i3) {
        super(2);
        this.$modifier = dVar;
        this.$state = lazyListState;
        this.$contentPadding = vVar;
        this.$reverseLayout = z;
        this.$isVertical = z2;
        this.$flingBehavior = fVar;
        this.$userScrollEnabled = z3;
        this.$horizontalAlignment = bVar;
        this.$verticalArrangement = kVar;
        this.$verticalAlignment = cVar;
        this.$horizontalArrangement = dVar2;
        this.$content = lVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LazyListKt.m1784a(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$isVertical, this.$flingBehavior, this.$userScrollEnabled, this.$horizontalAlignment, this.$verticalArrangement, this.$verticalAlignment, this.$horizontalArrangement, this.$content, dVar, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
