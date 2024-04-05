package p145io.reactivex.internal.functions;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p145io.reactivex.exceptions.OnErrorNotImplementedException;
import p145io.reactivex.functions.Consumer;
import p287xp.C8333a;
import p287xp.C8335c;
import p287xp.C8339g;
import p287xp.C8340h;
import p736cq.C18981a;

/* renamed from: io.reactivex.internal.functions.Functions */
public final class Functions {

    /* renamed from: a */
    public static final C12961f f28537a = new C12961f();

    /* renamed from: b */
    public static final C12960e f28538b = new C12960e();

    /* renamed from: c */
    public static final C12958c f28539c = new C12958c();

    /* renamed from: d */
    public static final C12959d f28540d = new C12959d();

    /* renamed from: e */
    public static final C12963h f28541e = new C12963h();

    /* renamed from: f */
    public static final C12964i f28542f = new C12964i();

    /* renamed from: io.reactivex.internal.functions.Functions$HashSetCallable */
    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$NaturalComparator */
    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$a */
    public static final class C12956a<T1, T2, R> implements C8339g<Object[], R> {

        /* renamed from: b */
        public final C8335c<? super T1, ? super T2, ? extends R> f28543b;

        public C12956a(C8335c<? super T1, ? super T2, ? extends R> cVar) {
            this.f28543b = cVar;
        }

        public final Object apply(Object obj) throws Exception {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 2) {
                return this.f28543b.apply(objArr[0], objArr[1]);
            }
            StringBuilder h = C0072d.m201h("Array of size 2 expected but got ");
            h.append(objArr.length);
            throw new IllegalArgumentException(h.toString());
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$b */
    public static final class C12957b<T> implements Callable<List<T>> {

        /* renamed from: b */
        public final int f28544b = 16;

        public final Object call() throws Exception {
            return new ArrayList(this.f28544b);
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$c */
    public static final class C12958c implements C8333a {
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$d */
    public static final class C12959d implements Consumer<Object> {
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$e */
    public static final class C12960e implements Runnable {
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$f */
    public static final class C12961f implements C8339g<Object, Object> {
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$g */
    public static final class C12962g<T, U> implements Callable<U>, C8339g<T, U> {

        /* renamed from: b */
        public final U f28545b;

        public C12962g(Throwable th) {
            this.f28545b = th;
        }

        public final U apply(T t) throws Exception {
            return this.f28545b;
        }

        public final U call() throws Exception {
            return this.f28545b;
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$h */
    public static final class C12963h implements Consumer<Throwable> {
        public final void accept(Object obj) throws Exception {
            C18981a.m32123b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }

    /* renamed from: io.reactivex.internal.functions.Functions$i */
    public static final class C12964i implements C8340h<Object> {
        public final boolean test(Object obj) {
            return true;
        }
    }
}
