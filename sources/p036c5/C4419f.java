package p036c5;

import androidx.activity.C0114h;
import p273w4.C8244m;

/* renamed from: c5.f */
public final class C4419f implements C4420g<Object> {

    /* renamed from: a */
    public volatile Object f9696a;

    /* renamed from: b */
    public final /* synthetic */ C4420g f9697b;

    public C4419f(C8244m.C8245a aVar) {
        this.f9697b = aVar;
    }

    public final Object get() {
        if (this.f9696a == null) {
            synchronized (this) {
                if (this.f9696a == null) {
                    Object obj = this.f9697b.get();
                    C0114h.m281L(obj);
                    this.f9696a = obj;
                }
            }
        }
        return this.f9696a;
    }
}
