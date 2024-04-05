package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p002a1.C0013g;

/* renamed from: androidx.recyclerview.widget.p */
public final class C3181p implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<C3181p> f7361f = new ThreadLocal<>();

    /* renamed from: g */
    public static C3182a f7362g = new C3182a();

    /* renamed from: b */
    public ArrayList<RecyclerView> f7363b = new ArrayList<>();

    /* renamed from: c */
    public long f7364c;

    /* renamed from: d */
    public long f7365d;

    /* renamed from: e */
    public ArrayList<C3184c> f7366e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    public class C3182a implements Comparator<C3184c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.p$c r7 = (androidx.recyclerview.widget.C3181p.C3184c) r7
                androidx.recyclerview.widget.p$c r8 = (androidx.recyclerview.widget.C3181p.C3184c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f7374d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f7374d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f7371a
                boolean r3 = r8.f7371a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f7372b
                int r2 = r7.f7372b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f7373c
                int r8 = r8.f7373c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C3181p.C3182a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.p$b */
    public static class C3183b implements RecyclerView.C3100o.C3103c {

        /* renamed from: a */
        public int f7367a;

        /* renamed from: b */
        public int f7368b;

        /* renamed from: c */
        public int[] f7369c;

        /* renamed from: d */
        public int f7370d;

        /* renamed from: a */
        public final void mo11915a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f7370d * 2;
                int[] iArr = this.f7369c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f7369c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f7369c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f7369c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f7370d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public final void mo11916b(RecyclerView recyclerView, boolean z) {
            this.f7370d = 0;
            int[] iArr = this.f7369c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C3100o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.f7079i) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo11792g()) {
                        oVar.mo11305k(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo11302j(this.f7367a, this.f7368b, recyclerView.mState, this);
                }
                int i = this.f7370d;
                if (i > oVar.f7080j) {
                    oVar.f7080j = i;
                    oVar.f7081k = z;
                    recyclerView.mRecycler.mo11703m();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$c */
    public static class C3184c {

        /* renamed from: a */
        public boolean f7371a;

        /* renamed from: b */
        public int f7372b;

        /* renamed from: c */
        public int f7373c;

        /* renamed from: d */
        public RecyclerView f7374d;

        /* renamed from: e */
        public int f7375e;
    }

    /* renamed from: c */
    public static RecyclerView.C3084b0 m7778c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.mChildHelper.mo11852h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo11851g(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C3111u uVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C3084b0 k = uVar.mo11701k(i, j);
            if (k != null) {
                if (!k.isBound() || k.isInvalid()) {
                    uVar.mo11692a(k, false);
                } else {
                    uVar.mo11697g(k.itemView);
                }
            }
            return k;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public final void mo11911a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f7364c == 0) {
            this.f7364c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C3183b bVar = recyclerView.mPrefetchRegistry;
        bVar.f7367a = i;
        bVar.f7368b = i2;
    }

    /* renamed from: b */
    public final void mo11912b(long j) {
        C3184c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C3184c cVar2;
        int size = this.f7363b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f7363b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.mo11916b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f7370d;
            }
        }
        this.f7366e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f7363b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C3183b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.f7368b) + Math.abs(bVar.f7367a);
                for (int i5 = 0; i5 < bVar.f7370d * 2; i5 += 2) {
                    if (i3 >= this.f7366e.size()) {
                        cVar2 = new C3184c();
                        this.f7366e.add(cVar2);
                    } else {
                        cVar2 = this.f7366e.get(i3);
                    }
                    int[] iArr = bVar.f7369c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f7371a = i6 <= abs;
                    cVar2.f7372b = abs;
                    cVar2.f7373c = i6;
                    cVar2.f7374d = recyclerView4;
                    cVar2.f7375e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f7366e, f7362g);
        for (int i7 = 0; i7 < this.f7366e.size() && (recyclerView = cVar.f7374d) != null; i7++) {
            RecyclerView.C3084b0 c = m7778c(recyclerView, (cVar = this.f7366e.get(i7)).f7375e, cVar.f7371a ? Long.MAX_VALUE : j);
            if (!(c == null || c.mNestedRecyclerView == null || !c.isBound() || c.isInvalid() || (recyclerView2 = c.mNestedRecyclerView.get()) == null)) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.mo11852h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C3183b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.mo11916b(recyclerView2, true);
                if (bVar2.f7370d != 0) {
                    try {
                        int i8 = C0013g.f24a;
                        Trace.beginSection(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.C3117y yVar = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        yVar.f7125d = 1;
                        yVar.f7126e = adapter.getItemCount();
                        yVar.f7128g = false;
                        yVar.f7129h = false;
                        yVar.f7130i = false;
                        for (int i9 = 0; i9 < bVar2.f7370d * 2; i9 += 2) {
                            m7778c(recyclerView2, bVar2.f7369c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C0013g.f24a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f7371a = false;
            cVar.f7372b = 0;
            cVar.f7373c = 0;
            cVar.f7374d = null;
            cVar.f7375e = 0;
        }
    }

    public final void run() {
        try {
            int i = C0013g.f24a;
            Trace.beginSection(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.f7363b.isEmpty()) {
                this.f7364c = 0;
                Trace.endSection();
                return;
            }
            int size = this.f7363b.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f7363b.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f7364c = 0;
                Trace.endSection();
                return;
            }
            mo11912b(TimeUnit.MILLISECONDS.toNanos(j) + this.f7365d);
            this.f7364c = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f7364c = 0;
            int i3 = C0013g.f24a;
            Trace.endSection();
            throw th;
        }
    }
}
