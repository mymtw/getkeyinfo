package com.google.common.collect;

import com.google.common.base.C15795m;
import java.util.Iterator;

/* renamed from: com.google.common.collect.k0 */
public final class C16190k0 extends C16221t<Object> {

    /* renamed from: c */
    public final /* synthetic */ Iterable f36281c;

    /* renamed from: d */
    public final /* synthetic */ C15795m f36282d;

    public C16190k0(Iterable iterable, C15795m mVar) {
        this.f36281c = iterable;
        this.f36282d = mVar;
    }

    public final Iterator<Object> iterator() {
        Iterator it = this.f36281c.iterator();
        C15795m mVar = this.f36282d;
        it.getClass();
        mVar.getClass();
        return new C16204o0(it, mVar);
    }
}
