package androidx.activity.result;

import p019b.C3443a;

/* renamed from: androidx.activity.result.e */
public final class C0122e extends C0120c<Object> {

    /* renamed from: a */
    public final /* synthetic */ String f197a;

    /* renamed from: b */
    public final /* synthetic */ int f198b;

    /* renamed from: c */
    public final /* synthetic */ C3443a f199c;

    /* renamed from: d */
    public final /* synthetic */ C0123f f200d;

    public C0122e(C0123f fVar, String str, int i, C3443a aVar) {
        this.f200d = fVar;
        this.f197a = str;
        this.f198b = i;
        this.f199c = aVar;
    }

    /* renamed from: a */
    public final C3443a<Object, ?> mo1156a() {
        return this.f199c;
    }

    /* renamed from: b */
    public final void mo1157b(Object obj) {
        this.f200d.f205e.add(this.f197a);
        Integer num = (Integer) this.f200d.f203c.get(this.f197a);
        this.f200d.mo1103b(num != null ? num.intValue() : this.f198b, this.f199c, obj);
    }

    /* renamed from: c */
    public final void mo1158c() {
        this.f200d.mo1163f(this.f197a);
    }
}
