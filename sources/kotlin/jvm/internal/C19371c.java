package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19321n;

/* renamed from: kotlin.jvm.internal.c */
public final class C19371c extends C19321n {

    /* renamed from: b */
    public final char[] f43234b;

    /* renamed from: c */
    public int f43235c;

    public C19371c(char[] cArr) {
        this.f43234b = cArr;
    }

    /* renamed from: a */
    public final char mo71769a() {
        try {
            char[] cArr = this.f43234b;
            int i = this.f43235c;
            this.f43235c = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43235c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f43235c < this.f43234b.length;
    }
}
