package p145io.reactivex.internal.operators.flowable;

import com.etsy.android.lib.push.registration.C8834g;
import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.ScalarSubscription;
import p248tp.C8054g;
import p287xp.C8339g;
import p762or.C20023b;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.l */
public final class C19116l<T, R> extends C8054g<R> {

    /* renamed from: c */
    public final T f42680c;

    /* renamed from: d */
    public final C8339g<? super T, ? extends C20023b<? extends R>> f42681d;

    public C19116l(C8834g gVar, Object obj) {
        this.f42680c = obj;
        this.f42681d = gVar;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super R> cVar) {
        try {
            Object apply = this.f42681d.apply(this.f42680c);
            C12965a.m20650b(apply, "The mapper returned a null Publisher");
            C20023b bVar = (C20023b) apply;
            if (bVar instanceof Callable) {
                try {
                    Object call = ((Callable) bVar).call();
                    if (call == null) {
                        EmptySubscription.complete(cVar);
                    } else {
                        cVar.onSubscribe(new ScalarSubscription(cVar, call));
                    }
                } catch (Throwable th) {
                    C19421p.m32940h0(th);
                    EmptySubscription.error(th, cVar);
                }
            } else {
                bVar.subscribe(cVar);
            }
        } catch (Throwable th2) {
            EmptySubscription.error(th2, cVar);
        }
    }
}
