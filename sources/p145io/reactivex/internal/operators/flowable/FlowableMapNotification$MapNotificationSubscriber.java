package p145io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.exceptions.CompositeException;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p287xp.C8339g;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableMapNotification$MapNotificationSubscriber */
final class FlowableMapNotification$MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {
    private static final long serialVersionUID = 2757120512858778108L;
    public final Callable<? extends R> onCompleteSupplier;
    public final C8339g<? super Throwable, ? extends R> onErrorMapper;
    public final C8339g<? super T, ? extends R> onNextMapper;

    public FlowableMapNotification$MapNotificationSubscriber(C20024c<? super R> cVar, C8339g<? super T, ? extends R> gVar, C8339g<? super Throwable, ? extends R> gVar2, Callable<? extends R> callable) {
        super(cVar);
        this.onNextMapper = gVar;
        this.onErrorMapper = gVar2;
        this.onCompleteSupplier = callable;
    }

    public void onComplete() {
        try {
            Object call = this.onCompleteSupplier.call();
            C12965a.m20650b(call, "The onComplete publisher returned is null");
            complete(call);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }

    public void onError(Throwable th) {
        try {
            Object apply = this.onErrorMapper.apply(th);
            C12965a.m20650b(apply, "The onError publisher returned is null");
            complete(apply);
        } catch (Throwable th2) {
            C19421p.m32940h0(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    public void onNext(T t) {
        try {
            Object apply = this.onNextMapper.apply(t);
            C12965a.m20650b(apply, "The onNext publisher returned is null");
            this.produced++;
            this.downstream.onNext(apply);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            this.downstream.onError(th);
        }
    }
}
