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

public final class LazyDslKt$LazyRow$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19857l<C0859r, C19394m> $content;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C0608f $flingBehavior;
    public final /* synthetic */ C0718d.C0722d $horizontalArrangement;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ boolean $userScrollEnabled;
    public final /* synthetic */ C1428a.C1431c $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyDslKt$LazyRow$1(C1436d dVar, LazyListState lazyListState, C0759v vVar, boolean z, C0718d.C0722d dVar2, C1428a.C1431c cVar, C0608f fVar, boolean z2, C19857l<? super C0859r, C19394m> lVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$state = lazyListState;
        this.$contentPadding = vVar;
        this.$reverseLayout = z;
        this.$horizontalArrangement = dVar2;
        this.$verticalAlignment = cVar;
        this.$flingBehavior = fVar;
        this.$userScrollEnabled = z2;
        this.$content = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LazyDslKt.m1772b(this.$modifier, this.$state, this.$contentPadding, this.$reverseLayout, this.$horizontalArrangement, this.$verticalAlignment, this.$flingBehavior, this.$userScrollEnabled, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
