package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.C1843j1;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p174m0.C7282b;
import p288y.C8347f;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.input.pointer.c */
public interface C1631c extends C7282b {
    /* renamed from: B */
    <T> Object mo6564B(long j, C19861p<? super C1631c, ? super C19340c<? super T>, ? extends Object> pVar, C19340c<? super T> cVar) {
        return pVar.invoke(this, cVar);
    }

    /* renamed from: R */
    long mo6565R() {
        int i = C8347f.f18315d;
        return C8347f.f18313b;
    }

    /* renamed from: a */
    long mo6566a();

    /* renamed from: f0 */
    Object mo6568f0(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl);

    /* renamed from: g0 */
    C1640l mo6569g0();

    C1843j1 getViewConfiguration();

    /* renamed from: m0 */
    <T> Object mo6572m0(long j, C19861p<? super C1631c, ? super C19340c<? super T>, ? extends Object> pVar, C19340c<? super T> cVar) {
        return pVar.invoke(this, cVar);
    }
}
