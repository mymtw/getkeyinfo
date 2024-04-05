package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.C19330w;

/* renamed from: kotlin.jvm.internal.e */
public final class C19373e extends C19330w {

    /* renamed from: b */
    public final float[] f43238b;

    /* renamed from: c */
    public int f43239c;

    public C19373e(float[] fArr) {
        this.f43238b = fArr;
    }

    /* renamed from: a */
    public final float mo71784a() {
        try {
            float[] fArr = this.f43238b;
            int i = this.f43239c;
            this.f43239c = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f43239c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f43239c < this.f43238b.length;
    }
}
