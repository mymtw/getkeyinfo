package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p755lq.C19875a;

/* renamed from: kotlin.collections.a */
public abstract class C19286a<T> implements Iterator<T>, C19875a {

    /* renamed from: b */
    public State f43154b = State.NotReady;

    /* renamed from: c */
    public T f43155c;

    /* renamed from: kotlin.collections.a$a */
    public /* synthetic */ class C19287a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43156a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.Done.ordinal()] = 1;
            iArr[State.Ready.ordinal()] = 2;
            f43156a = iArr;
        }
    }

    /* renamed from: a */
    public abstract void mo71570a();

    /* renamed from: b */
    public final void mo71571b() {
        this.f43154b = State.Done;
    }

    /* renamed from: c */
    public final void mo71572c(T t) {
        this.f43155c = t;
        this.f43154b = State.Ready;
    }

    public final boolean hasNext() {
        State state = this.f43154b;
        State state2 = State.Failed;
        if (state != state2) {
            int i = C19287a.f43156a[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                this.f43154b = state2;
                mo71570a();
                if (this.f43154b != State.Ready) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final T next() {
        if (hasNext()) {
            this.f43154b = State.NotReady;
            return this.f43155c;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
