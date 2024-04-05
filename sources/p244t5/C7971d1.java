package p244t5;

import java.io.Serializable;

/* renamed from: t5.d1 */
public final class C7971d1 {

    /* renamed from: a */
    public int f17452a = 0;

    /* renamed from: b */
    public Serializable f17453b;

    /* JADX WARNING: type inference failed for: r1v1, types: [byte[], java.io.Serializable] */
    public /* synthetic */ C7971d1(int i) {
        this.f17453b = new byte[i];
    }

    public /* synthetic */ C7971d1(String str) {
        this.f17453b = str;
    }

    /* renamed from: a */
    public final String mo20537a() {
        int i = this.f17452a;
        if (i == -1) {
            return null;
        }
        int indexOf = ((String) this.f17453b).indexOf(46, i);
        if (indexOf == -1) {
            String substring = ((String) this.f17453b).substring(this.f17452a);
            this.f17452a = -1;
            return substring;
        }
        String substring2 = ((String) this.f17453b).substring(this.f17452a, indexOf);
        this.f17452a = indexOf + 1;
        return substring2;
    }
}
