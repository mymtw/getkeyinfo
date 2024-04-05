package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e */
public final class C1315e<T> extends C1311a<T> {

    /* renamed from: d */
    public final T[] f2873d;

    /* renamed from: e */
    public final C1319i<T> f2874e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1315e(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        C19383o.m32797g(objArr, "root");
        C19383o.m32797g(objArr2, "tail");
        this.f2873d = objArr2;
        int i4 = (i2 - 1) & -32;
        this.f2874e = new C1319i<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else if (this.f2874e.hasNext()) {
            this.f2865b++;
            return this.f2874e.next();
        } else {
            T[] tArr = this.f2873d;
            int i = this.f2865b;
            this.f2865b = i + 1;
            return tArr[i - this.f2874e.f2866c];
        }
    }

    public final T previous() {
        if (hasPrevious()) {
            int i = this.f2865b;
            C1319i<T> iVar = this.f2874e;
            int i2 = iVar.f2866c;
            if (i > i2) {
                T[] tArr = this.f2873d;
                int i3 = i - 1;
                this.f2865b = i3;
                return tArr[i3 - i2];
            }
            this.f2865b = i - 1;
            return iVar.previous();
        }
        throw new NoSuchElementException();
    }
}
