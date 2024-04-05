package p145io.reactivex.internal.operators.single;

import com.etsy.android.p327ui.util.C11771a;
import java.util.concurrent.Callable;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.disposables.EmptyDisposable;
import p145io.reactivex.internal.functions.C12965a;
import p248tp.C8071s;
import p248tp.C8073u;
import p248tp.C8075w;

/* renamed from: io.reactivex.internal.operators.single.a */
public final class C19195a<T> extends C8071s<T> {

    /* renamed from: b */
    public final Callable<? extends C8075w<? extends T>> f42915b;

    public C19195a(C11771a aVar) {
        this.f42915b = aVar;
    }

    /* renamed from: h */
    public final void mo20659h(C8073u<? super T> uVar) {
        try {
            Object call = this.f42915b.call();
            C12965a.m20650b(call, "The singleSupplier returned a null SingleSource");
            ((C8075w) call).mo20655a(uVar);
        } catch (Throwable th) {
            C19421p.m32940h0(th);
            EmptyDisposable.error(th, (C8073u<?>) uVar);
        }
    }
}
