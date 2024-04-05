package androidx.work;

import androidx.work.C3438r;

/* renamed from: androidx.work.m */
public final class C3424m extends C3438r {

    /* renamed from: androidx.work.m$a */
    public static final class C3425a extends C3438r.C3439a<C3425a, C3424m> {
        public C3425a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f8043c.f9647d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: b */
        public final C3438r mo12930b() {
            if (!this.f8041a || !this.f8043c.f9653j.f7884c) {
                return new C3424m(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: c */
        public final C3438r.C3439a mo12931c() {
            return this;
        }
    }

    public C3424m(C3425a aVar) {
        super(aVar.f8042b, aVar.f8043c, aVar.f8044d);
    }
}
