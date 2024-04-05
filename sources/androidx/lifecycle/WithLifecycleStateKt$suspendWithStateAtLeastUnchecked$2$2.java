package androidx.lifecycle;

import kotlin.C19394m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import p753kq.C19857l;

final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ CoroutineDispatcher $lifecycleDispatcher;
    public final /* synthetic */ C2841xfdb59cc4 $observer;
    public final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$a */
    public static final class C2840a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Lifecycle f6458b;

        /* renamed from: c */
        public final /* synthetic */ C2841xfdb59cc4 f6459c;

        public C2840a(Lifecycle lifecycle, C2841xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f6458b = lifecycle;
            this.f6459c = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        public final void run() {
            this.f6458b.mo10735c(this.f6459c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(CoroutineDispatcher coroutineDispatcher, Lifecycle lifecycle, C2841xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        super(1);
        this.$lifecycleDispatcher = coroutineDispatcher;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        CoroutineDispatcher coroutineDispatcher = this.$lifecycleDispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (coroutineDispatcher.mo10805C0(emptyCoroutineContext)) {
            this.$lifecycleDispatcher.mo7108A0(emptyCoroutineContext, new C2840a(this.$this_suspendWithStateAtLeastUnchecked, this.$observer));
        } else {
            this.$this_suspendWithStateAtLeastUnchecked.mo10735c(this.$observer);
        }
    }
}
