package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19311d0;

/* renamed from: kotlin.jvm.internal.i */
public final class C19377i extends C19311d0 {

    /* renamed from: b */
    public final short[] f43246b;

    /* renamed from: c */
    public int f43247c;

    public C19377i(short[] sArr) {
        this.f43246b = sArr;
    }

    /* renamed from: a */
    public final short mo71720a() {
        try {
            short[] sArr = this.f43246b;
            int i = this.f43247c;
            this.f43247c = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43247c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f43247c < this.f43246b.length;
    }
}
