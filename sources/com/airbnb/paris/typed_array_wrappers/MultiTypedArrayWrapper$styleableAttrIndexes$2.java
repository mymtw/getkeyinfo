package com.airbnb.paris.typed_array_wrappers;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class MultiTypedArrayWrapper$styleableAttrIndexes$2 extends Lambda implements C19846a<List<? extends Integer>> {
    public final /* synthetic */ MultiTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTypedArrayWrapper$styleableAttrIndexes$2(MultiTypedArrayWrapper multiTypedArrayWrapper) {
        super(0);
        this.this$0 = multiTypedArrayWrapper;
    }

    public final List<Integer> invoke() {
        MultiTypedArrayWrapper multiTypedArrayWrapper = this.this$0;
        int i = MultiTypedArrayWrapper.f11068e;
        Set keySet = ((HashMap) multiTypedArrayWrapper.f11070c.getValue()).keySet();
        C19383o.m32793c(keySet, "styleableAttrIndexToWrapperMap.keys");
        return C19327t.m32660p1(keySet);
    }
}
