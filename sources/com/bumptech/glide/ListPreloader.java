package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.request.C6124d;
import com.bumptech.glide.request.C6125e;
import java.util.ArrayDeque;
import java.util.List;
import p036c5.C4416e;
import p036c5.C4426l;
import p302z4.C8447h;
import p302z4.C8448i;

public class ListPreloader<T> implements AbsListView.OnScrollListener {
    private boolean isIncreasing = true;
    private int lastEnd;
    private int lastFirstVisible = -1;
    private int lastStart;
    private final int maxPreload;
    private final C5943b<T> preloadDimensionProvider;
    private final C5942a<T> preloadModelProvider;
    private final C5945d preloadTargetQueue;
    private final RequestManager requestManager;
    private int totalItemCount;

    /* renamed from: com.bumptech.glide.ListPreloader$a */
    public interface C5942a<U> {
        /* renamed from: a */
        C5959e mo16746a();

        /* renamed from: b */
        List mo16747b();
    }

    /* renamed from: com.bumptech.glide.ListPreloader$b */
    public interface C5943b<T> {
        /* renamed from: a */
        int[] mo16748a();
    }

    /* renamed from: com.bumptech.glide.ListPreloader$c */
    public static final class C5944c implements C8448i<Object> {

        /* renamed from: b */
        public int f12721b;

        /* renamed from: c */
        public int f12722c;

        /* renamed from: d */
        public C6124d f12723d;

        /* renamed from: a */
        public final void mo16749a(C8447h hVar) {
            hVar.mo17122b(this.f12722c, this.f12721b);
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
        }

        /* renamed from: c */
        public final void mo16751c(Drawable drawable) {
        }

        /* renamed from: d */
        public final void mo16752d(Drawable drawable) {
        }

        /* renamed from: g */
        public final void mo16753g(C6124d dVar) {
            this.f12723d = dVar;
        }

        public final C6124d getRequest() {
            return this.f12723d;
        }

        /* renamed from: i */
        public final void mo16755i(Drawable drawable) {
        }

        /* renamed from: j */
        public final void mo16756j(C8447h hVar) {
        }

        public final void onDestroy() {
        }

        public final void onStart() {
        }

        public final void onStop() {
        }
    }

    /* renamed from: com.bumptech.glide.ListPreloader$d */
    public static final class C5945d {

        /* renamed from: a */
        public final ArrayDeque f12724a;

        public C5945d(int i) {
            char[] cArr = C4426l.f9710a;
            this.f12724a = new ArrayDeque(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f12724a.offer(new C5944c());
            }
        }
    }

    public ListPreloader(RequestManager requestManager2, C5942a<T> aVar, C5943b<T> bVar, int i) {
        this.requestManager = requestManager2;
        this.preloadModelProvider = aVar;
        this.preloadDimensionProvider = bVar;
        this.maxPreload = i;
        this.preloadTargetQueue = new C5945d(i + 1);
    }

    private void cancelAll() {
        for (int i = 0; i < this.preloadTargetQueue.f12724a.size(); i++) {
            RequestManager requestManager2 = this.requestManager;
            C5945d dVar = this.preloadTargetQueue;
            C5944c cVar = (C5944c) dVar.f12724a.poll();
            dVar.f12724a.offer(cVar);
            cVar.f12722c = 0;
            cVar.f12721b = 0;
            requestManager2.clear((C8448i<?>) cVar);
        }
    }

    private void preload(int i, boolean z) {
        if (this.isIncreasing != z) {
            this.isIncreasing = z;
            cancelAll();
        }
        preload(i, (z ? this.maxPreload : -this.maxPreload) + i);
    }

    private void preloadAdapterPosition(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                preloadItem(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            preloadItem(list.get(i3), i, i3);
        }
    }

    private void preloadItem(T t, int i, int i2) {
        int[] a;
        C5959e a2;
        if (t != null && (a = this.preloadDimensionProvider.mo16748a()) != null && (a2 = this.preloadModelProvider.mo16746a()) != null) {
            C5945d dVar = this.preloadTargetQueue;
            int i3 = a[0];
            int i4 = a[1];
            C5944c cVar = (C5944c) dVar.f12724a.poll();
            dVar.f12724a.offer(cVar);
            cVar.f12722c = i3;
            cVar.f12721b = i4;
            a2.mo16817N(cVar, (C6125e) null, a2, C4416e.f9694a);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.totalItemCount = i3;
        int i4 = this.lastFirstVisible;
        if (i > i4) {
            preload(i2 + i, true);
        } else if (i < i4) {
            preload(i, false);
        }
        this.lastFirstVisible = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    private void preload(int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            i3 = Math.max(this.lastEnd, i);
            i4 = i2;
        } else {
            i4 = Math.min(this.lastStart, i);
            i3 = i2;
        }
        int min = Math.min(this.totalItemCount, i4);
        int min2 = Math.min(this.totalItemCount, Math.max(0, i3));
        if (i < i2) {
            for (int i5 = min2; i5 < min; i5++) {
                preloadAdapterPosition(this.preloadModelProvider.mo16747b(), i5, true);
            }
        } else {
            for (int i6 = min - 1; i6 >= min2; i6--) {
                preloadAdapterPosition(this.preloadModelProvider.mo16747b(), i6, false);
            }
        }
        this.lastStart = min2;
        this.lastEnd = min;
    }
}
