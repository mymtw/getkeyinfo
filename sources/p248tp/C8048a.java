package p248tp;

import kotlin.reflect.C19421p;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.observers.CallbackCompletableObserver;
import p287xp.C8333a;
import p736cq.C18981a;

/* renamed from: tp.a */
public abstract class C8048a implements C8052e {
    /* renamed from: a */
    public final void mo20607a(C8050c cVar) {
        if (cVar != null) {
            try {
                mo20609d(cVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    /* renamed from: c */
    public final CallbackCompletableObserver mo20608c(Consumer consumer, C8333a aVar) {
        if (aVar != null) {
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, aVar);
            mo20607a(callbackCompletableObserver);
            return callbackCompletableObserver;
        }
        throw new NullPointerException("onComplete is null");
    }

    /* renamed from: d */
    public abstract void mo20609d(C8050c cVar);
}
