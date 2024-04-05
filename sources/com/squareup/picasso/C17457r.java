package com.squareup.picasso;

import com.squareup.picasso.C17427a0;
import com.squareup.picasso.Picasso;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.r */
public final class C17457r extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.r$a */
    public static final class C17458a extends FutureTask<C17431c> implements Comparable<C17458a> {

        /* renamed from: b */
        public final C17431c f38145b;

        public C17458a(C17431c cVar) {
            super(cVar, (Object) null);
            this.f38145b = cVar;
        }

        public final int compareTo(Object obj) {
            C17431c cVar = this.f38145b;
            Picasso.Priority priority = cVar.f38097t;
            C17431c cVar2 = ((C17458a) obj).f38145b;
            Picasso.Priority priority2 = cVar2.f38097t;
            return priority == priority2 ? cVar.f38079b - cVar2.f38079b : priority2.ordinal() - priority.ordinal();
        }
    }

    public C17457r() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C17427a0.C17429b());
    }

    /* renamed from: a */
    public final void mo68626a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        C17458a aVar = new C17458a((C17431c) runnable);
        execute(aVar);
        return aVar;
    }
}
