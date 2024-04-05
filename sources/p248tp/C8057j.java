package p248tp;

import kotlin.reflect.C19421p;

/* renamed from: tp.j */
public abstract class C8057j<T> implements C8059l<T> {
    /* renamed from: a */
    public final void mo20624a(C8058k<? super T> kVar) {
        if (kVar != null) {
            try {
                mo20625b(kVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    /* renamed from: b */
    public abstract void mo20625b(C8058k<? super T> kVar);
}
