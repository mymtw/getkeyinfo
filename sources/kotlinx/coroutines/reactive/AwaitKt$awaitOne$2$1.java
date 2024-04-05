package kotlinx.coroutines.reactive;

import androidx.compose.foundation.layout.C0761x;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import org.reactivestreams.Subscription;
import p514bk.C14088a;
import p762or.C20024c;

public final class AwaitKt$awaitOne$2$1 implements C20024c<Object> {

    /* renamed from: b */
    public Subscription f43727b;

    /* renamed from: c */
    public Object f43728c;

    /* renamed from: d */
    public boolean f43729d;

    /* renamed from: e */
    public boolean f43730e;

    /* renamed from: f */
    public final /* synthetic */ C19747k<Object> f43731f;

    /* renamed from: g */
    public final /* synthetic */ Mode f43732g;

    /* renamed from: h */
    public final /* synthetic */ Object f43733h;

    /* renamed from: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$a */
    public /* synthetic */ class C19774a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43734a;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.FIRST.ordinal()] = 1;
            iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
            iArr[Mode.LAST.ordinal()] = 3;
            iArr[Mode.SINGLE.ordinal()] = 4;
            iArr[Mode.SINGLE_OR_DEFAULT.ordinal()] = 5;
            f43734a = iArr;
        }
    }

    public AwaitKt$awaitOne$2$1(C19753l lVar, Mode mode, Object obj) {
        this.f43731f = lVar;
        this.f43732g = mode;
        this.f43733h = obj;
    }

    public final void onComplete() {
        boolean z;
        if (this.f43730e) {
            C19775a.m33727a(this.f43731f.getContext(), "onComplete");
            z = false;
        } else {
            z = true;
            this.f43730e = true;
        }
        if (z) {
            if (this.f43729d) {
                Mode mode = this.f43732g;
                if (mode != Mode.FIRST_OR_DEFAULT && mode != Mode.FIRST && this.f43731f.isActive()) {
                    this.f43731f.resumeWith(Result.m35480constructorimpl(this.f43728c));
                    return;
                }
                return;
            }
            Mode mode2 = this.f43732g;
            if (mode2 == Mode.FIRST_OR_DEFAULT || mode2 == Mode.SINGLE_OR_DEFAULT) {
                this.f43731f.resumeWith(Result.m35480constructorimpl(this.f43733h));
            } else if (this.f43731f.isActive()) {
                this.f43731f.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(new NoSuchElementException(C19383o.m32802l(this.f43732g, "No value received via onNext for ")))));
            }
        }
    }

    public final void onError(Throwable th) {
        boolean z;
        if (this.f43730e) {
            C19775a.m33727a(this.f43731f.getContext(), "onError");
            z = false;
        } else {
            z = true;
            this.f43730e = true;
        }
        if (z) {
            this.f43731f.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
        }
    }

    public final void onNext(Object obj) {
        Subscription subscription = this.f43727b;
        C19747k<Object> kVar = this.f43731f;
        if (subscription == null) {
            C14088a.m21785m(new IllegalStateException("'onNext' was called before 'onSubscribe'"), kVar.getContext());
        } else if (this.f43730e) {
            C19775a.m33727a(kVar.getContext(), "onNext");
        } else {
            int i = C19774a.f43734a[this.f43732g.ordinal()];
            if (i == 1 || i == 2) {
                if (this.f43729d) {
                    CoroutineContext context = this.f43731f.getContext();
                    Mode mode = this.f43732g;
                    C14088a.m21785m(new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"), context);
                    return;
                }
                this.f43729d = true;
                subscription.cancel();
                this.f43731f.resumeWith(Result.m35480constructorimpl(obj));
            } else if (i == 3 || i == 4 || i == 5) {
                Mode mode2 = this.f43732g;
                if ((mode2 == Mode.SINGLE || mode2 == Mode.SINGLE_OR_DEFAULT) && this.f43729d) {
                    subscription.cancel();
                    if (this.f43731f.isActive()) {
                        this.f43731f.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(new IllegalArgumentException(C19383o.m32802l(this.f43732g, "More than one onNext value for ")))));
                        return;
                    }
                    return;
                }
                this.f43728c = obj;
                this.f43729d = true;
            }
        }
    }

    public final void onSubscribe(Subscription subscription) {
        if (this.f43727b != null) {
            subscription.cancel();
            return;
        }
        this.f43727b = subscription;
        this.f43731f.mo72497O(new AwaitKt$awaitOne$2$1$onSubscribe$1(subscription));
        Mode mode = this.f43732g;
        subscription.request((mode == Mode.FIRST || mode == Mode.FIRST_OR_DEFAULT) ? 1 : Long.MAX_VALUE);
    }
}
