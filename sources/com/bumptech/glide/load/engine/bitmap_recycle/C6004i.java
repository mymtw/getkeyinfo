package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.activity.C0114h;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i */
public final class C6004i implements C5996b {

    /* renamed from: a */
    public final C6001g<C6005a, Object> f12854a = new C6001g<>();

    /* renamed from: b */
    public final C6006b f12855b = new C6006b();

    /* renamed from: c */
    public final HashMap f12856c = new HashMap();

    /* renamed from: d */
    public final HashMap f12857d = new HashMap();

    /* renamed from: e */
    public final int f12858e;

    /* renamed from: f */
    public int f12859f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$a */
    public static final class C6005a implements C6010l {

        /* renamed from: a */
        public final C6006b f12860a;

        /* renamed from: b */
        public int f12861b;

        /* renamed from: c */
        public Class<?> f12862c;

        public C6005a(C6006b bVar) {
            this.f12860a = bVar;
        }

        /* renamed from: a */
        public final void mo16936a() {
            this.f12860a.mo16919c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6005a)) {
                return false;
            }
            C6005a aVar = (C6005a) obj;
            return this.f12861b == aVar.f12861b && this.f12862c == aVar.f12862c;
        }

        public final int hashCode() {
            int i = this.f12861b * 31;
            Class<?> cls = this.f12862c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Key{size=");
            h.append(this.f12861b);
            h.append("array=");
            h.append(this.f12862c);
            h.append('}');
            return h.toString();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.i$b */
    public static final class C6006b extends C5997c<C6005a> {
        /* renamed from: a */
        public final C6010l mo16917a() {
            return new C6005a(this);
        }
    }

    public C6004i(int i) {
        this.f12858e = i;
    }

    /* renamed from: a */
    public final synchronized void mo16912a(int i) {
        if (i >= 40) {
            try {
                mo16913b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo16932f(this.f12858e / 2);
        }
    }

    /* renamed from: b */
    public final synchronized void mo16913b() {
        mo16932f(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T mo16914c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.mo16935i(r7)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f12859f     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f12858e     // Catch:{ all -> 0x0053 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x0053 }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.bitmap_recycle.i$b r6 = r5.f12855b     // Catch:{ all -> 0x0053 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0053 }
            com.bumptech.glide.load.engine.bitmap_recycle.l r6 = r6.mo16918b()     // Catch:{ all -> 0x0053 }
            com.bumptech.glide.load.engine.bitmap_recycle.i$a r6 = (com.bumptech.glide.load.engine.bitmap_recycle.C6004i.C6005a) r6     // Catch:{ all -> 0x0053 }
            r6.f12861b = r0     // Catch:{ all -> 0x0053 }
            r6.f12862c = r7     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x0040:
            com.bumptech.glide.load.engine.bitmap_recycle.i$b r0 = r5.f12855b     // Catch:{ all -> 0x0053 }
            com.bumptech.glide.load.engine.bitmap_recycle.l r0 = r0.mo16918b()     // Catch:{ all -> 0x0053 }
            com.bumptech.glide.load.engine.bitmap_recycle.i$a r0 = (com.bumptech.glide.load.engine.bitmap_recycle.C6004i.C6005a) r0     // Catch:{ all -> 0x0053 }
            r0.f12861b = r6     // Catch:{ all -> 0x0053 }
            r0.f12862c = r7     // Catch:{ all -> 0x0053 }
            r6 = r0
        L_0x004d:
            java.lang.Object r6 = r5.mo16934h(r6, r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return r6
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.C6004i.mo16914c(int, java.lang.Class):java.lang.Object");
    }

    /* renamed from: d */
    public final synchronized Object mo16915d() {
        Object h;
        Class cls = byte[].class;
        synchronized (this) {
            C6005a aVar = (C6005a) this.f12855b.mo16918b();
            aVar.f12861b = 8;
            aVar.f12862c = cls;
            h = mo16934h(aVar, cls);
        }
        return h;
    }

    /* renamed from: e */
    public final void mo16931e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> i2 = mo16935i(cls);
        Integer num = i2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            i2.remove(Integer.valueOf(i));
        } else {
            i2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    public final void mo16932f(int i) {
        while (this.f12859f > i) {
            Object c = this.f12854a.mo16929c();
            C0114h.m281L(c);
            C5995a<?> g = mo16933g(c.getClass());
            this.f12859f -= g.mo16908a() * g.mo16909b(c);
            mo16931e(g.mo16909b(c), c.getClass());
            if (Log.isLoggable(g.getTag(), 2)) {
                g.getTag();
                g.mo16909b(c);
            }
        }
    }

    /* renamed from: g */
    public final <T> C5995a<T> mo16933g(Class<T> cls) {
        C5995a<T> aVar = (C5995a) this.f12857d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C6003h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C6000f();
            } else {
                StringBuilder h = C0072d.m201h("No array pool found for: ");
                h.append(cls.getSimpleName());
                throw new IllegalArgumentException(h.toString());
            }
            this.f12857d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: h */
    public final <T> T mo16934h(C6005a aVar, Class<T> cls) {
        C5995a<T> g = mo16933g(cls);
        T a = this.f12854a.mo16927a(aVar);
        if (a != null) {
            this.f12859f -= g.mo16908a() * g.mo16909b(a);
            mo16931e(g.mo16909b(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(g.getTag(), 2)) {
            g.getTag();
        }
        return g.newArray(aVar.f12861b);
    }

    /* renamed from: i */
    public final NavigableMap<Integer, Integer> mo16935i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f12856c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f12856c.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C5995a<?> g = mo16933g(cls);
        int b = g.mo16909b(t);
        int a = g.mo16908a() * b;
        int i = 1;
        if (a <= this.f12858e / 2) {
            C6005a aVar = (C6005a) this.f12855b.mo16918b();
            aVar.f12861b = b;
            aVar.f12862c = cls;
            this.f12854a.mo16928b(aVar, t);
            NavigableMap<Integer, Integer> i2 = mo16935i(cls);
            Integer num = i2.get(Integer.valueOf(aVar.f12861b));
            Integer valueOf = Integer.valueOf(aVar.f12861b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            i2.put(valueOf, Integer.valueOf(i));
            this.f12859f += a;
            mo16932f(this.f12858e);
        }
    }
}
