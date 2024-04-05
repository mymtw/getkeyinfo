package p525co;

import com.jakewharton.rxbinding2.widget.C17026n;
import p145io.reactivex.Observer;
import p248tp.C8061n;

/* renamed from: co.a */
public abstract class C14173a<T> extends C8061n<T> {

    /* renamed from: co.a$a */
    public final class C14174a extends C8061n<T> {

        /* renamed from: b */
        public final /* synthetic */ C14173a f31287b;

        public C14174a(C17026n nVar) {
            this.f31287b = nVar;
        }

        /* renamed from: h */
        public final void mo20638h(Observer<? super T> observer) {
            this.f31287b.mo47115m(observer);
        }
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        mo47115m(observer);
        observer.onNext(mo47114l());
    }

    /* renamed from: l */
    public abstract T mo47114l();

    /* renamed from: m */
    public abstract void mo47115m(Observer<? super T> observer);
}
