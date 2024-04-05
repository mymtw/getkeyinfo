package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.f */
public final class C1316f<T> extends C1311a<T> {

    /* renamed from: d */
    public final PersistentVectorBuilder<T> f2875d;

    /* renamed from: e */
    public int f2876e;

    /* renamed from: f */
    public C1319i<? extends T> f2877f;

    /* renamed from: g */
    public int f2878g = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1316f(PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        C19383o.m32797g(persistentVectorBuilder, "builder");
        this.f2875d = persistentVectorBuilder;
        this.f2876e = persistentVectorBuilder.mo5730l();
        mo5783b();
    }

    /* renamed from: a */
    public final void mo5782a() {
        if (this.f2876e != this.f2875d.mo5730l()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(T t) {
        mo5782a();
        this.f2875d.add(this.f2865b, t);
        this.f2865b++;
        this.f2866c = this.f2875d.size();
        this.f2876e = this.f2875d.mo5730l();
        this.f2878g = -1;
        mo5783b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5783b() {
        /*
            r7 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<T> r0 = r7.f2875d
            java.lang.Object[] r1 = r0.f2862g
            if (r1 != 0) goto L_0x000a
            r0 = 0
            r7.f2877f = r0
            return
        L_0x000a:
            int r0 = r0.size()
            int r0 = r0 + -1
            r0 = r0 & -32
            int r2 = r7.f2865b
            if (r2 <= r0) goto L_0x0017
            r2 = r0
        L_0x0017:
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<T> r3 = r7.f2875d
            int r3 = r3.f2860e
            int r3 = r3 / 5
            r4 = 1
            int r3 = r3 + r4
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.i<? extends T> r5 = r7.f2877f
            if (r5 != 0) goto L_0x002b
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.i r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.i
            r4.<init>(r1, r2, r0, r3)
            r7.f2877f = r4
            goto L_0x004b
        L_0x002b:
            kotlin.jvm.internal.C19383o.m32794d(r5)
            r5.f2865b = r2
            r5.f2866c = r0
            r5.f2882d = r3
            java.lang.Object[] r6 = r5.f2883e
            int r6 = r6.length
            if (r6 >= r3) goto L_0x003d
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5.f2883e = r3
        L_0x003d:
            java.lang.Object[] r3 = r5.f2883e
            r6 = 0
            r3[r6] = r1
            if (r2 != r0) goto L_0x0045
            r6 = r4
        L_0x0045:
            r5.f2884f = r6
            int r2 = r2 - r6
            r5.mo5791b(r2, r4)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1316f.mo5783b():void");
    }

    public final T next() {
        mo5782a();
        if (hasNext()) {
            int i = this.f2865b;
            this.f2878g = i;
            C1319i<? extends T> iVar = this.f2877f;
            if (iVar == null) {
                T[] tArr = this.f2875d.f2863h;
                this.f2865b = i + 1;
                return tArr[i];
            } else if (iVar.hasNext()) {
                this.f2865b++;
                return iVar.next();
            } else {
                T[] tArr2 = this.f2875d.f2863h;
                int i2 = this.f2865b;
                this.f2865b = i2 + 1;
                return tArr2[i2 - iVar.f2866c];
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final T previous() {
        mo5782a();
        if (hasPrevious()) {
            int i = this.f2865b;
            int i2 = i - 1;
            this.f2878g = i2;
            C1319i<? extends T> iVar = this.f2877f;
            if (iVar == null) {
                T[] tArr = this.f2875d.f2863h;
                this.f2865b = i2;
                return tArr[i2];
            }
            int i3 = iVar.f2866c;
            if (i > i3) {
                T[] tArr2 = this.f2875d.f2863h;
                this.f2865b = i2;
                return tArr2[i2 - i3];
            }
            this.f2865b = i2;
            return iVar.previous();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        mo5782a();
        int i = this.f2878g;
        if (i != -1) {
            this.f2875d.remove(i);
            int i2 = this.f2878g;
            if (i2 < this.f2865b) {
                this.f2865b = i2;
            }
            this.f2866c = this.f2875d.size();
            this.f2876e = this.f2875d.mo5730l();
            this.f2878g = -1;
            mo5783b();
            return;
        }
        throw new IllegalStateException();
    }

    public final void set(T t) {
        mo5782a();
        int i = this.f2878g;
        if (i != -1) {
            this.f2875d.set(i, t);
            this.f2876e = this.f2875d.mo5730l();
            mo5783b();
            return;
        }
        throw new IllegalStateException();
    }
}
