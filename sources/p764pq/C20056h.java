package p764pq;

import java.util.NoSuchElementException;
import kotlin.collections.C19332y;

/* renamed from: pq.h */
public final class C20056h extends C19332y {

    /* renamed from: b */
    public final int f44417b;

    /* renamed from: c */
    public final int f44418c;

    /* renamed from: d */
    public boolean f44419d;

    /* renamed from: e */
    public int f44420e;

    public C20056h(int i, int i2, int i3) {
        this.f44417b = i3;
        this.f44418c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f44419d = z;
        this.f44420e = !z ? i2 : i;
    }

    public final boolean hasNext() {
        return this.f44419d;
    }

    public final int nextInt() {
        int i = this.f44420e;
        if (i != this.f44418c) {
            this.f44420e = this.f44417b + i;
        } else if (this.f44419d) {
            this.f44419d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
