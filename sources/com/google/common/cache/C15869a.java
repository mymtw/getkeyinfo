package com.google.common.cache;

/* renamed from: com.google.common.cache.a */
public final class C15869a implements C15870b {

    /* renamed from: a */
    public final C15875g f35719a = LongAddables.m25698a();

    /* renamed from: b */
    public final C15875g f35720b = LongAddables.m25698a();

    /* renamed from: c */
    public final C15875g f35721c = LongAddables.m25698a();

    /* renamed from: d */
    public final C15875g f35722d = LongAddables.m25698a();

    /* renamed from: e */
    public final C15875g f35723e = LongAddables.m25698a();

    /* renamed from: f */
    public final C15875g f35724f = LongAddables.m25698a();

    /* renamed from: a */
    public final void mo55792a(int i) {
        this.f35719a.add((long) i);
    }

    /* renamed from: b */
    public final void mo55793b(int i) {
        this.f35720b.add((long) i);
    }

    /* renamed from: c */
    public final void mo55794c() {
        this.f35724f.increment();
    }

    /* renamed from: d */
    public final void mo55795d(long j) {
        this.f35722d.increment();
        this.f35723e.add(j);
    }

    /* renamed from: e */
    public final void mo55796e(long j) {
        this.f35721c.increment();
        this.f35723e.add(j);
    }

    /* renamed from: f */
    public final C15872d mo55797f() {
        return new C15872d(this.f35719a.sum(), this.f35720b.sum(), this.f35721c.sum(), this.f35722d.sum(), this.f35723e.sum(), this.f35724f.sum());
    }

    /* renamed from: g */
    public final void mo56016g(C15870b bVar) {
        C15872d f = bVar.mo55797f();
        this.f35719a.add(f.f35725a);
        this.f35720b.add(f.f35726b);
        this.f35721c.add(f.f35727c);
        this.f35722d.add(f.f35728d);
        this.f35723e.add(f.f35729e);
        this.f35724f.add(f.f35730f);
    }
}
