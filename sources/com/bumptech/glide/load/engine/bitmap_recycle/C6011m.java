package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.support.p013v4.media.C0072d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p036c5.C4426l;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m */
public final class C6011m implements C6009k {

    /* renamed from: d */
    public static final Bitmap.Config[] f12870d;

    /* renamed from: e */
    public static final Bitmap.Config[] f12871e;

    /* renamed from: f */
    public static final Bitmap.Config[] f12872f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    public static final Bitmap.Config[] f12873g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    public static final Bitmap.Config[] f12874h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    public final C6014c f12875a = new C6014c();

    /* renamed from: b */
    public final C6001g<C6013b, Bitmap> f12876b = new C6001g<>();

    /* renamed from: c */
    public final HashMap f12877c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$a */
    public static /* synthetic */ class C6012a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12878a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12878a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12878a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12878a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12878a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.C6011m.C6012a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$b */
    public static final class C6013b implements C6010l {

        /* renamed from: a */
        public final C6014c f12879a;

        /* renamed from: b */
        public int f12880b;

        /* renamed from: c */
        public Bitmap.Config f12881c;

        public C6013b(C6014c cVar) {
            this.f12879a = cVar;
        }

        /* renamed from: a */
        public final void mo16936a() {
            this.f12879a.mo16919c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6013b)) {
                return false;
            }
            C6013b bVar = (C6013b) obj;
            return this.f12880b == bVar.f12880b && C4426l.m10128b(this.f12881c, bVar.f12881c);
        }

        public final int hashCode() {
            int i = this.f12880b * 31;
            Bitmap.Config config = this.f12881c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return C6011m.m11916c(this.f12880b, this.f12881c);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.m$c */
    public static class C6014c extends C5997c<C6013b> {
        /* renamed from: a */
        public final C6010l mo16917a() {
            return new C6013b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f12870d = configArr;
        f12871e = configArr;
    }

    /* renamed from: c */
    public static String m11916c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: a */
    public final void mo16942a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d = mo16944d(bitmap.getConfig());
        Integer num2 = d.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo16945e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d.remove(num);
        } else {
            d.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: b */
    public final Bitmap mo16943b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d = C4426l.m10130d(config) * i * i2;
        C6013b bVar = (C6013b) this.f12875a.mo16918b();
        bVar.f12880b = d;
        bVar.f12881c = config;
        int i3 = 0;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f12871e;
        } else {
            int i4 = C6012a.f12878a[config.ordinal()];
            configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : f12874h : f12873g : f12872f : f12870d;
        }
        int length = configArr.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i3];
            Integer ceilingKey = mo16944d(config2).ceilingKey(Integer.valueOf(d));
            if (ceilingKey == null || ceilingKey.intValue() > d * 8) {
                i3++;
            } else if (ceilingKey.intValue() != d || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f12875a.mo16919c(bVar);
                C6014c cVar = this.f12875a;
                int intValue = ceilingKey.intValue();
                bVar = (C6013b) cVar.mo16918b();
                bVar.f12880b = intValue;
                bVar.f12881c = config2;
            }
        }
        Bitmap a = this.f12876b.mo16927a(bVar);
        if (a != null) {
            mo16942a(Integer.valueOf(bVar.f12880b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: d */
    public final NavigableMap<Integer, Integer> mo16944d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f12877c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f12877c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: e */
    public final String mo16945e(Bitmap bitmap) {
        return m11916c(C4426l.m10129c(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public final void mo16946f(Bitmap bitmap) {
        int c = C4426l.m10129c(bitmap);
        C6014c cVar = this.f12875a;
        Bitmap.Config config = bitmap.getConfig();
        C6013b bVar = (C6013b) cVar.mo16918b();
        bVar.f12880b = c;
        bVar.f12881c = config;
        this.f12876b.mo16928b(bVar, bitmap);
        NavigableMap<Integer, Integer> d = mo16944d(bitmap.getConfig());
        Integer num = d.get(Integer.valueOf(bVar.f12880b));
        Integer valueOf = Integer.valueOf(bVar.f12880b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SizeConfigStrategy{groupedMap=");
        h.append(this.f12876b);
        h.append(", sortedSizes=(");
        for (Map.Entry entry : this.f12877c.entrySet()) {
            h.append(entry.getKey());
            h.append('[');
            h.append(entry.getValue());
            h.append("], ");
        }
        if (!this.f12877c.isEmpty()) {
            h.replace(h.length() - 2, h.length(), "");
        }
        h.append(")}");
        return h.toString();
    }
}
