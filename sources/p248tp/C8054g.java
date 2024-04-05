package p248tp;

import kotlin.reflect.C19421p;
import org.reactivestreams.Subscription;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.operators.flowable.FlowableObserveOn;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p145io.reactivex.internal.subscribers.StrictSubscriber;
import p287xp.C8333a;
import p736cq.C18981a;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: tp.g */
public abstract class C8054g<T> implements C20023b<T> {

    /* renamed from: b */
    public static final int f17572b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public final FlowableObserveOn mo20617a(C8066r rVar) {
        int i = f17572b;
        if (rVar != null) {
            C12965a.m20651c(i, "bufferSize");
            return new FlowableObserveOn(this, rVar, i);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: b */
    public final Disposable mo20618b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C8333a aVar, Consumer<? super Subscription> consumer3) {
        if (consumer == null) {
            throw new NullPointerException("onNext is null");
        } else if (consumer2 == null) {
            throw new NullPointerException("onError is null");
        } else if (aVar == null) {
            throw new NullPointerException("onComplete is null");
        } else if (consumer3 != null) {
            LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, aVar, consumer3);
            mo20619c(lambdaSubscriber);
            return lambdaSubscriber;
        } else {
            throw new NullPointerException("onSubscribe is null");
        }
    }

    /* renamed from: c */
    public final void mo20619c(C8056i<? super T> iVar) {
        if (iVar != null) {
            try {
                mo20620d(iVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C19421p.m32940h0(th);
                C18981a.m32123b(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("s is null");
        }
    }

    /* renamed from: d */
    public abstract void mo20620d(C20024c<? super T> cVar);

    public final void subscribe(C20024c<? super T> cVar) {
        if (cVar instanceof C8056i) {
            mo20619c((C8056i) cVar);
        } else if (cVar != null) {
            mo20619c(new StrictSubscriber(cVar));
        } else {
            throw new NullPointerException("s is null");
        }
    }
}
