package com.airbnb.paris.typed_array_wrappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class MapTypedArrayWrapper$styleableAttrIndexes$2 extends Lambda implements C19846a<List<? extends Integer>> {
    public final /* synthetic */ MapTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapTypedArrayWrapper$styleableAttrIndexes$2(MapTypedArrayWrapper mapTypedArrayWrapper) {
        super(0);
        this.this$0 = mapTypedArrayWrapper;
    }

    public final List<Integer> invoke() {
        Set<Integer> keySet = this.this$0.f11067g.keySet();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(keySet));
        Iterator<T> it = keySet.iterator();
        while (true) {
            int i = -1;
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            int[] iArr = this.this$0.f11066f;
            C19383o.m32797g(iArr, "<this>");
            int length = iArr.length;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (intValue == iArr[i2]) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).intValue() != -1) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
