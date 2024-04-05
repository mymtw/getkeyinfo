package p718yi;

import java.util.Arrays;

/* renamed from: yi.e */
public final class C18887e {

    /* renamed from: a */
    public final int f42063a;

    /* renamed from: b */
    public final C18886d[] f42064b;

    /* renamed from: c */
    public int f42065c;

    public C18887e(C18886d... dVarArr) {
        this.f42064b = dVarArr;
        this.f42063a = dVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18887e.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f42064b, ((C18887e) obj).f42064b);
    }

    public final int hashCode() {
        if (this.f42065c == 0) {
            this.f42065c = 527 + Arrays.hashCode(this.f42064b);
        }
        return this.f42065c;
    }
}
