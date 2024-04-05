package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.TreeMultiset;

/* renamed from: com.google.common.collect.e2 */
public final class C16166e2 extends Multisets.C16064a<Object> {

    /* renamed from: b */
    public final /* synthetic */ TreeMultiset.C16127d f36263b;

    /* renamed from: c */
    public final /* synthetic */ TreeMultiset f36264c;

    public C16166e2(TreeMultiset treeMultiset, TreeMultiset.C16127d dVar) {
        this.f36264c = treeMultiset;
        this.f36263b = dVar;
    }

    public final int getCount() {
        TreeMultiset.C16127d dVar = this.f36263b;
        int i = dVar.f36204b;
        return i == 0 ? this.f36264c.count(dVar.f36203a) : i;
    }

    public final Object getElement() {
        return this.f36263b.f36203a;
    }
}
