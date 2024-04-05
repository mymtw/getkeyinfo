package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19320m;

/* renamed from: kotlin.jvm.internal.b */
public final class C19370b extends C19320m {

    /* renamed from: b */
    public final byte[] f43232b;

    /* renamed from: c */
    public int f43233c;

    public C19370b(byte[] bArr) {
        this.f43232b = bArr;
    }

    public final boolean hasNext() {
        return this.f43233c < this.f43232b.length;
    }

    public final byte nextByte() {
        try {
            byte[] bArr = this.f43232b;
            int i = this.f43233c;
            this.f43233c = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43233c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
