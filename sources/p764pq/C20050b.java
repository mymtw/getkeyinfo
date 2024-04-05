package p764pq;

import java.util.NoSuchElementException;
import kotlin.collections.C19321n;
import kotlin.jvm.internal.C19383o;

/* renamed from: pq.b */
public final class C20050b extends C19321n {

    /* renamed from: b */
    public final int f44408b;

    /* renamed from: c */
    public final int f44409c;

    /* renamed from: d */
    public boolean f44410d;

    /* renamed from: e */
    public int f44411e;

    public C20050b(char c, char c2, int i) {
        this.f44408b = i;
        this.f44409c = c2;
        boolean z = true;
        if (i <= 0 ? C19383o.m32799i(c, c2) < 0 : C19383o.m32799i(c, c2) > 0) {
            z = false;
        }
        this.f44410d = z;
        this.f44411e = !z ? c2 : c;
    }

    /* renamed from: a */
    public final char mo71769a() {
        int i = this.f44411e;
        if (i != this.f44409c) {
            this.f44411e = this.f44408b + i;
        } else if (this.f44410d) {
            this.f44410d = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    public final boolean hasNext() {
        return this.f44410d;
    }
}
