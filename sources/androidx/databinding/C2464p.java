package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: androidx.databinding.p */
public final class C2464p<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a */
    public final C2457l<T> f5719a;

    /* renamed from: b */
    public final int f5720b;

    /* renamed from: c */
    public T f5721c;

    public C2464p(ViewDataBinding viewDataBinding, int i, C2457l<T> lVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f5720b = i;
        this.f5719a = lVar;
    }

    /* renamed from: a */
    public final boolean mo9295a() {
        boolean z;
        T t = this.f5721c;
        if (t != null) {
            this.f5719a.mo9267c(t);
            z = true;
        } else {
            z = false;
        }
        this.f5721c = null;
        return z;
    }
}
