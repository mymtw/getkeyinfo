package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 extends Lambda implements C19857l<Object, Integer> {
    public final /* synthetic */ C0829l $itemProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1(C0829l lVar) {
        super(1);
        this.$itemProvider = lVar;
    }

    public final Integer invoke(Object obj) {
        C19383o.m32797g(obj, "needle");
        LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1(this.$itemProvider);
        int itemCount = this.$itemProvider.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                i = -1;
                break;
            } else if (C19383o.m32792b(lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1.invoke(Integer.valueOf(i)), obj)) {
                break;
            } else {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
