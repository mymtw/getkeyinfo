package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19332y;

/* renamed from: kotlin.jvm.internal.f */
public final class C19374f extends C19332y {

    /* renamed from: b */
    public final int[] f43240b;

    /* renamed from: c */
    public int f43241c;

    public C19374f(int[] iArr) {
        this.f43240b = iArr;
    }

    public final boolean hasNext() {
        return this.f43241c < this.f43240b.length;
    }

    public final int nextInt() {
        try {
            int[] iArr = this.f43240b;
            int i = this.f43241c;
            this.f43241c = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43241c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
