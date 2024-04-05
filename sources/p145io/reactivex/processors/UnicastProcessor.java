package p145io.reactivex.processors;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C19382n;
import org.reactivestreams.Subscription;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.queue.C19213a;
import p145io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p145io.reactivex.internal.subscriptions.EmptySubscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p736cq.C18981a;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.UnicastProcessor */
public final class UnicastProcessor<T> extends C19250a<T> {

    /* renamed from: c */
    public final C19213a<T> f43047c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f43048d;

    /* renamed from: e */
    public final boolean f43049e = true;

    /* renamed from: f */
    public volatile boolean f43050f;

    /* renamed from: g */
    public Throwable f43051g;

    /* renamed from: h */
    public final AtomicReference<C20024c<? super T>> f43052h = new AtomicReference<>();

    /* renamed from: i */
    public volatile boolean f43053i;

    /* renamed from: j */
    public final AtomicBoolean f43054j = new AtomicBoolean();

    /* renamed from: k */
    public final BasicIntQueueSubscription<T> f43055k = new UnicastQueueSubscription();

    /* renamed from: l */
    public final AtomicLong f43056l = new AtomicLong();

    /* renamed from: m */
    public boolean f43057m;

    /* renamed from: io.reactivex.processors.UnicastProcessor$UnicastQueueSubscription */
    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        public void cancel() {
            if (!UnicastProcessor.this.f43053i) {
                UnicastProcessor.this.f43053i = true;
                Runnable andSet = UnicastProcessor.this.f43048d.getAndSet((Object) null);
                if (andSet != null) {
                    andSet.run();
                }
                UnicastProcessor.this.f43052h.lazySet((Object) null);
                if (UnicastProcessor.this.f43055k.getAndIncrement() == 0) {
                    UnicastProcessor.this.f43052h.lazySet((Object) null);
                    UnicastProcessor unicastProcessor = UnicastProcessor.this;
                    if (!unicastProcessor.f43057m) {
                        unicastProcessor.f43047c.clear();
                    }
                }
            }
        }

        public void clear() {
            UnicastProcessor.this.f43047c.clear();
        }

        public boolean isEmpty() {
            return UnicastProcessor.this.f43047c.isEmpty();
        }

        public T poll() {
            return UnicastProcessor.this.f43047c.poll();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C19382n.m32703D(UnicastProcessor.this.f43056l, j);
                UnicastProcessor.this.mo71380g();
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.f43057m = true;
            return 2;
        }
    }

    public UnicastProcessor(int i, Runnable runnable) {
        C12965a.m20651c(i, "capacityHint");
        this.f43047c = new C19213a<>(i);
        this.f43048d = new AtomicReference<>(runnable);
    }

    /* renamed from: f */
    public static UnicastProcessor m32491f(Runnable runnable, int i) {
        if (runnable != null) {
            return new UnicastProcessor(i, runnable);
        }
        throw new NullPointerException("onTerminate");
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        if (this.f43054j.get() || !this.f43054j.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f43055k);
        this.f43052h.set(cVar);
        if (this.f43053i) {
            this.f43052h.lazySet((Object) null);
        } else {
            mo71380g();
        }
    }

    /* renamed from: e */
    public final boolean mo71379e(boolean z, boolean z2, boolean z3, C20024c<? super T> cVar, C19213a<T> aVar) {
        if (this.f43053i) {
            aVar.clear();
            this.f43052h.lazySet((Object) null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.f43051g != null) {
                aVar.clear();
                this.f43052h.lazySet((Object) null);
                cVar.onError(this.f43051g);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.f43051g;
                this.f43052h.lazySet((Object) null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71380g() {
        /*
            r18 = this;
            r6 = r18
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r6.f43055k
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference<or.c<? super T>> r0 = r6.f43052h
            java.lang.Object r0 = r0.get()
            or.c r0 = (p762or.C20024c) r0
            r7 = 1
            r8 = r0
            r0 = r7
        L_0x0016:
            if (r8 == 0) goto L_0x00dc
            boolean r0 = r6.f43057m
            if (r0 == 0) goto L_0x0069
            io.reactivex.internal.queue.a<T> r0 = r6.f43047c
            boolean r1 = r6.f43049e
            r1 = r1 ^ r7
        L_0x0021:
            boolean r2 = r6.f43053i
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference<or.c<? super T>> r0 = r6.f43052h
            r0.lazySet(r3)
            goto L_0x00d9
        L_0x002d:
            boolean r2 = r6.f43050f
            if (r1 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            java.lang.Throwable r4 = r6.f43051g
            if (r4 == 0) goto L_0x0046
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<or.c<? super T>> r0 = r6.f43052h
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.f43051g
            r8.onError(r0)
            goto L_0x00d9
        L_0x0046:
            r8.onNext(r3)
            if (r2 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicReference<or.c<? super T>> r0 = r6.f43052h
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.f43051g
            if (r0 == 0) goto L_0x0059
            r8.onError(r0)
            goto L_0x00d9
        L_0x0059:
            r8.onComplete()
            goto L_0x00d9
        L_0x005e:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r2 = r6.f43055k
            int r3 = -r7
            int r7 = r2.addAndGet(r3)
            if (r7 != 0) goto L_0x0021
            goto L_0x00d9
        L_0x0069:
            io.reactivex.internal.queue.a<T> r9 = r6.f43047c
            boolean r0 = r6.f43049e
            r10 = r0 ^ 1
            r11 = r7
        L_0x0070:
            java.util.concurrent.atomic.AtomicLong r0 = r6.f43056l
            long r12 = r0.get()
            r4 = 0
        L_0x0078:
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00a6
            boolean r2 = r6.f43050f
            java.lang.Object r3 = r9.poll()
            if (r3 != 0) goto L_0x0087
            r17 = r7
            goto L_0x008a
        L_0x0087:
            r0 = 0
            r17 = r0
        L_0x008a:
            r0 = r18
            r1 = r10
            r7 = r3
            r3 = r17
            r14 = r4
            r4 = r8
            r5 = r9
            boolean r0 = r0.mo71379e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x009a
            goto L_0x00d9
        L_0x009a:
            if (r17 == 0) goto L_0x009d
            goto L_0x00a7
        L_0x009d:
            r8.onNext(r7)
            r0 = 1
            long r4 = r14 + r0
            r7 = 1
            goto L_0x0078
        L_0x00a6:
            r14 = r4
        L_0x00a7:
            if (r16 != 0) goto L_0x00bb
            boolean r2 = r6.f43050f
            boolean r3 = r9.isEmpty()
            r0 = r18
            r1 = r10
            r4 = r8
            r5 = r9
            boolean r0 = r0.mo71379e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00bb
            goto L_0x00d9
        L_0x00bb:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            java.util.concurrent.atomic.AtomicLong r0 = r6.f43056l
            long r1 = -r14
            r0.addAndGet(r1)
        L_0x00d0:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r0 = r6.f43055k
            int r1 = -r11
            int r11 = r0.addAndGet(r1)
            if (r11 != 0) goto L_0x00da
        L_0x00d9:
            return
        L_0x00da:
            r7 = 1
            goto L_0x0070
        L_0x00dc:
            io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> r1 = r6.f43055k
            int r0 = -r0
            int r0 = r1.addAndGet(r0)
            if (r0 != 0) goto L_0x00e6
            return
        L_0x00e6:
            java.util.concurrent.atomic.AtomicReference<or.c<? super T>> r1 = r6.f43052h
            java.lang.Object r1 = r1.get()
            r8 = r1
            or.c r8 = (p762or.C20024c) r8
            r7 = 1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.processors.UnicastProcessor.mo71380g():void");
    }

    public final void onComplete() {
        if (!this.f43050f && !this.f43053i) {
            this.f43050f = true;
            Runnable andSet = this.f43048d.getAndSet((Object) null);
            if (andSet != null) {
                andSet.run();
            }
            mo71380g();
        }
    }

    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.f43050f || this.f43053i) {
            C18981a.m32123b(th);
        } else {
            this.f43051g = th;
            this.f43050f = true;
            Runnable andSet = this.f43048d.getAndSet((Object) null);
            if (andSet != null) {
                andSet.run();
            }
            mo71380g();
        }
    }

    public final void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!this.f43050f && !this.f43053i) {
            this.f43047c.offer(t);
            mo71380g();
        }
    }

    public final void onSubscribe(Subscription subscription) {
        if (this.f43050f || this.f43053i) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }
}
