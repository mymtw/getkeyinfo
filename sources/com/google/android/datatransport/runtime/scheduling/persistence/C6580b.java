package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.C6547k;
import com.google.android.datatransport.runtime.C6556p;
import java.io.Closeable;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
public interface C6580b extends Closeable {
    /* renamed from: N */
    long mo18779N(C6556p pVar);

    /* renamed from: P */
    boolean mo18780P(C6556p pVar);

    /* renamed from: T */
    void mo18781T(Iterable<C6590h> iterable);

    /* renamed from: a0 */
    Iterable<C6590h> mo18782a0(C6556p pVar);

    /* renamed from: c */
    void mo18783c(Iterable<C6590h> iterable);

    int cleanUp();

    /* renamed from: n0 */
    void mo18785n0(long j, C6556p pVar);

    /* renamed from: r0 */
    C6590h mo18786r0(C6556p pVar, C6547k kVar);

    /* renamed from: y */
    List mo18787y();
}
