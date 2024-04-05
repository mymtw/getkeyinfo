package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

final class LazyMeasuredLineProvider$childConstraints$1 extends Lambda implements C19861p<Integer, Integer, C7280a> {
    public final /* synthetic */ int $crossAxisSpacing;
    public final /* synthetic */ List<Integer> $slotSizesSums;
    public final /* synthetic */ C0821w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyMeasuredLineProvider$childConstraints$1(List<Integer> list, int i, C0821w wVar) {
        super(2);
        this.$slotSizesSums = list;
        this.$crossAxisSpacing = i;
        this.this$0 = wVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C7280a(m34697invokeJhjzzOo(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-JhjzzOo  reason: not valid java name */
    public final long m34697invokeJhjzzOo(int i, int i2) {
        int intValue = ((i2 - 1) * this.$crossAxisSpacing) + (this.$slotSizesSums.get((i + i2) - 1).intValue() - (i == 0 ? 0 : this.$slotSizesSums.get(i - 1).intValue()));
        return this.this$0.f1770a ? C7280a.C7281a.m13971e(intValue) : C7280a.C7281a.m13970d(intValue);
    }
}
