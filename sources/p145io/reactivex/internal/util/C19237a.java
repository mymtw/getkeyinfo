package p145io.reactivex.internal.util;

import p287xp.C8340h;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.util.a */
public final class C19237a<T> {

    /* renamed from: a */
    public final Object[] f43033a;

    /* renamed from: b */
    public Object[] f43034b;

    /* renamed from: c */
    public int f43035c;

    /* renamed from: io.reactivex.internal.util.a$a */
    public interface C19238a<T> extends C8340h<T> {
        boolean test(T t);
    }

    public C19237a() {
        Object[] objArr = new Object[5];
        this.f43033a = objArr;
        this.f43034b = objArr;
    }

    /* renamed from: a */
    public final <U> boolean mo71358a(C20024c<? super U> cVar) {
        Object[] objArr;
        Object[] objArr2 = this.f43033a;
        while (true) {
            int i = 0;
            if (objArr2 == null) {
                return false;
            }
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (NotificationLite.acceptFull((Object) objArr, cVar)) {
                    return true;
                }
                i++;
            }
            objArr2 = objArr2[4];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71359b(T r4) {
        /*
            r3 = this;
            int r0 = r3.f43035c
            r1 = 4
            if (r0 != r1) goto L_0x000f
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r3.f43034b
            r2[r1] = r0
            r3.f43034b = r0
            r0 = 0
        L_0x000f:
            java.lang.Object[] r1 = r3.f43034b
            r1[r0] = r4
            int r0 = r0 + 1
            r3.f43035c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.util.C19237a.mo71359b(java.lang.Object):void");
    }

    /* renamed from: c */
    public final void mo71360c(C19238a<? super T> aVar) {
        Object[] objArr;
        Object[] objArr2 = this.f43033a;
        while (objArr2 != null) {
            int i = 0;
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (!aVar.test(objArr)) {
                    i++;
                } else {
                    return;
                }
            }
            objArr2 = objArr2[4];
        }
    }
}
