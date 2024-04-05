package androidx.activity.result;

import p019b.C3443a;

/* renamed from: androidx.activity.result.d */
public final class C0121d extends C0120c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f193a;

    /* renamed from: b */
    public final /* synthetic */ int f194b;

    /* renamed from: c */
    public final /* synthetic */ C3443a f195c;

    /* renamed from: d */
    public final /* synthetic */ C0123f f196d;

    public C0121d(C0123f fVar, String str, int i, C3443a aVar) {
        this.f196d = fVar;
        this.f193a = str;
        this.f194b = i;
        this.f195c = aVar;
    }

    /* renamed from: a */
    public final C3443a<Object, ?> mo1156a() {
        return this.f195c;
    }

    /* renamed from: b */
    public final void mo1157b(Object obj) {
        this.f196d.f205e.add(this.f193a);
        Integer num = (Integer) this.f196d.f203c.get(this.f193a);
        this.f196d.mo1103b(num != null ? num.intValue() : this.f194b, this.f195c, obj);
    }

    /* renamed from: c */
    public final void mo1158c() {
        this.f196d.mo1163f(this.f193a);
    }
}
