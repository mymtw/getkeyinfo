package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.lazy.layout.C0845h;
import androidx.compose.p015ui.layout.SubcomposeLayoutState;
import androidx.compose.runtime.C1426z0;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p219r.C7734e;

public final class LazyLayoutPrefetcher implements C1426z0, C0845h.C0847b, Runnable, Choreographer.FrameCallback {
    public static final C0834a Companion = new C0834a();
    /* access modifiers changed from: private */
    public static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private final Choreographer choreographer = Choreographer.getInstance();
    private boolean isActive;
    private final C0839c itemContentFactory;
    private final C7734e<C0835b> prefetchRequests = new C7734e<>(new C0835b[16]);
    private boolean prefetchScheduled;
    private final C0845h prefetchState;
    private final SubcomposeLayoutState subcomposeLayoutState;
    private final View view;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher$a */
    public static final class C0834a {
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher$b */
    public static final class C0835b implements C0845h.C0846a {

        /* renamed from: a */
        public final int f1787a;

        /* renamed from: b */
        public final long f1788b;

        /* renamed from: c */
        public SubcomposeLayoutState.C1662a f1789c;

        /* renamed from: d */
        public boolean f1790d;

        public C0835b(int i, long j) {
            this.f1787a = i;
            this.f1788b = j;
        }

        public final void cancel() {
            if (!this.f1790d) {
                this.f1790d = true;
                SubcomposeLayoutState.C1662a aVar = this.f1789c;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.f1789c = null;
            }
        }
    }

    public LazyLayoutPrefetcher(C0845h hVar, SubcomposeLayoutState subcomposeLayoutState2, C0839c cVar, View view2) {
        C19383o.m32797g(hVar, "prefetchState");
        C19383o.m32797g(subcomposeLayoutState2, "subcomposeLayoutState");
        C19383o.m32797g(cVar, "itemContentFactory");
        C19383o.m32797g(view2, "view");
        this.prefetchState = hVar;
        this.subcomposeLayoutState = subcomposeLayoutState2;
        this.itemContentFactory = cVar;
        this.view = view2;
        Companion.getClass();
        if (frameIntervalNs == 0) {
            Display display = view2.getDisplay();
            float f = 60.0f;
            if (!view2.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            frameIntervalNs = (long) (((float) 1000000000) / f);
        }
    }

    private final long calculateAverageTime(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = (long) 4;
        return (j / j3) + ((j2 / j3) * ((long) 3));
    }

    private final boolean enoughTimeLeft(long j, long j2, long j3) {
        return j > j2 || j + j3 < j2;
    }

    public void doFrame(long j) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    public void onAbandoned() {
    }

    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.f1811a.setValue(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    public void onRemembered() {
        this.prefetchState.f1811a.setValue(this);
        this.isActive = true;
    }

    public void run() {
        if (this.prefetchRequests.mo20239m() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
        boolean z = false;
        while (this.prefetchRequests.mo20240n() && !z) {
            C0835b bVar = (C0835b) this.prefetchRequests.f17155b[0];
            C0841d invoke = this.itemContentFactory.f1797b.invoke();
            if (!bVar.f1790d) {
                int itemCount = invoke.getItemCount();
                int i = bVar.f1787a;
                if (i >= 0 && i < itemCount) {
                    if (bVar.f1789c == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (enoughTimeLeft(nanoTime, nanos, this.averagePrecomposeTimeNs)) {
                                Object e = invoke.mo4201e(bVar.f1787a);
                                bVar.f1789c = this.subcomposeLayoutState.mo6651b(e, this.itemContentFactory.mo4384a(bVar.f1787a, e));
                                this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                            } else {
                                z = true;
                            }
                            C19394m mVar = C19394m.f43287a;
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (enoughTimeLeft(nanoTime2, nanos, this.averagePremeasureTimeNs)) {
                                SubcomposeLayoutState.C1662a aVar = bVar.f1789c;
                                C19383o.m32794d(aVar);
                                int a = aVar.mo6652a();
                                for (int i2 = 0; i2 < a; i2++) {
                                    aVar.mo6653b(i2, bVar.f1788b);
                                }
                                this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                                this.prefetchRequests.mo20243q(0);
                            } else {
                                C19394m mVar2 = C19394m.f43287a;
                                z = true;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
            }
            this.prefetchRequests.mo20243q(0);
        }
        if (z) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    /* renamed from: schedulePrefetch-0kLqBqw  reason: not valid java name */
    public C0845h.C0846a m34699schedulePrefetch0kLqBqw(int i, long j) {
        C0835b bVar = new C0835b(i, j);
        this.prefetchRequests.mo20232c(bVar);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return bVar;
    }
}
