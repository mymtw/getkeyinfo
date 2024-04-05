package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.r0 */
public final class C16216r0 implements Comparator<C16199m1<Object>> {

    /* renamed from: b */
    public final /* synthetic */ Comparator f36318b;

    public C16216r0(Comparator comparator) {
        this.f36318b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f36318b.compare(((C16199m1) obj).peek(), ((C16199m1) obj2).peek());
    }
}
