package p145io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8059l;
import p248tp.C8073u;
import p287xp.C8336d;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator */
final class MaybeEqualSingle$EqualCoordinator<T> extends AtomicInteger implements Disposable {
    public final C8073u<? super Boolean> downstream;
    public final C8336d<? super T, ? super T> isEqual;
    public final MaybeEqualSingle$EqualObserver<T> observer1 = new MaybeEqualSingle$EqualObserver<>(this);
    public final MaybeEqualSingle$EqualObserver<T> observer2 = new MaybeEqualSingle$EqualObserver<>(this);

    public MaybeEqualSingle$EqualCoordinator(C8073u<? super Boolean> uVar, C8336d<? super T, ? super T> dVar) {
        super(2);
        this.downstream = uVar;
        this.isEqual = dVar;
    }

    public void dispose() {
        this.observer1.dispose();
        this.observer2.dispose();
    }

    public void done() {
        if (decrementAndGet() == 0) {
            Object obj = this.observer1.value;
            Object obj2 = this.observer2.value;
            if (obj == null || obj2 == null) {
                this.downstream.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                return;
            }
            try {
                ((C12965a.C12966a) this.isEqual).getClass();
                this.downstream.onSuccess(Boolean.valueOf(C12965a.m20649a(obj, obj2)));
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                this.downstream.onError(th);
            }
        }
    }

    public void error(MaybeEqualSingle$EqualObserver<T> maybeEqualSingle$EqualObserver, Throwable th) {
        if (getAndSet(0) > 0) {
            MaybeEqualSingle$EqualObserver<T> maybeEqualSingle$EqualObserver2 = this.observer1;
            if (maybeEqualSingle$EqualObserver == maybeEqualSingle$EqualObserver2) {
                this.observer2.dispose();
            } else {
                maybeEqualSingle$EqualObserver2.dispose();
            }
            this.downstream.onError(th);
            return;
        }
        C18981a.m32123b(th);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) this.observer1.get());
    }

    public void subscribe(C8059l<? extends T> lVar, C8059l<? extends T> lVar2) {
        lVar.mo20624a(this.observer1);
        lVar2.mo20624a(this.observer2);
    }
}
