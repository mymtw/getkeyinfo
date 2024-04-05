package p145io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8050c;
import p248tp.C8052e;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNextObserver */
final class CompletableResumeNext$ResumeNextObserver extends AtomicReference<Disposable> implements C8050c, Disposable {
    private static final long serialVersionUID = 5018523762564524046L;
    public final C8050c downstream;
    public final C8339g<? super Throwable, ? extends C8052e> errorMapper;
    public boolean once;

    public CompletableResumeNext$ResumeNextObserver(C8050c cVar, C8339g<? super Throwable, ? extends C8052e> gVar) {
        this.downstream = cVar;
        this.errorMapper = gVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.isDisposed((Disposable) get());
    }

    public void onComplete() {
        this.downstream.onComplete();
    }

    public void onError(Throwable th) {
        if (this.once) {
            this.downstream.onError(th);
            return;
        }
        this.once = true;
        try {
            Object apply = this.errorMapper.apply(th);
            C12965a.m20650b(apply, "The errorMapper returned a null CompletableSource");
            ((C8052e) apply).mo20607a(this);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this, disposable);
    }
}
