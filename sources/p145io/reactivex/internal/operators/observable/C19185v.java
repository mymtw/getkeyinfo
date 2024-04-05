package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.Observer;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8061n;
import p248tp.C8065q;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.observable.v */
public final class C19185v<T, R> extends C8061n<R> {

    /* renamed from: b */
    public final T f42864b;

    /* renamed from: c */
    public final C8339g<? super T, ? extends C8065q<? extends R>> f42865c;

    public C19185v(C8339g gVar, Object obj) {
        this.f42864b = obj;
        this.f42865c = gVar;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super R> observer) {
        try {
            Object apply = this.f42865c.apply(this.f42864b);
            C12965a.m20650b(apply, "The mapper returned a null ObservableSource");
            C8065q qVar = (C8065q) apply;
            if (qVar instanceof Callable) {
                try {
                    Object call = ((Callable) qVar).call();
                    if (call == null) {
                        EmptyDisposable.complete((Observer<?>) observer);
                        return;
                    }
                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, call);
                    observer.onSubscribe(observableScalarXMap$ScalarDisposable);
                    observableScalarXMap$ScalarDisposable.run();
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    EmptyDisposable.error(th, (Observer<?>) observer);
                }
            } else {
                qVar.subscribe(observer);
            }
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, (Observer<?>) observer);
        }
    }
}
