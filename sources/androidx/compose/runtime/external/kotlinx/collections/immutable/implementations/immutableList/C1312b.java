package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b */
public final class C1312b<T> extends C1311a<T> {

    /* renamed from: d */
    public final T[] f2867d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1312b(T[] tArr, int i, int i2) {
        super(i, i2);
        C19383o.m32797g(tArr, "buffer");
        this.f2867d = tArr;
    }

    public final T next() {
        if (hasNext()) {
            T[] tArr = this.f2867d;
            int i = this.f2865b;
            this.f2865b = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    public final T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f2867d;
            int i = this.f2865b - 1;
            this.f2865b = i;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }
}
