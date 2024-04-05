package com.airbnb.paris.typed_array_wrappers;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19846a;
import p764pq.C20056h;

public final class MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2 extends Lambda implements C19846a<HashMap<Integer, List<C4870c>>> {
    public final /* synthetic */ MultiTypedArrayWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2(MultiTypedArrayWrapper multiTypedArrayWrapper) {
        super(0);
        this.this$0 = multiTypedArrayWrapper;
    }

    public final HashMap<Integer, List<C4870c>> invoke() {
        HashMap<Integer, List<C4870c>> hashMap = new HashMap<>();
        for (C4870c next : this.this$0.f11071d) {
            C20056h l = C19388s.m32816D0(0, next.mo14765h()).iterator();
            while (true) {
                if (l.f44419d) {
                    int g = next.mo14764g(l.nextInt());
                    if (!hashMap.containsKey(Integer.valueOf(g))) {
                        hashMap.put(Integer.valueOf(g), C17782b.m29866f0(next));
                    } else {
                        List<C4870c> list = hashMap.get(Integer.valueOf(g));
                        if (list != null) {
                            list.add(next);
                        } else {
                            C19383o.m32803m();
                            throw null;
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
