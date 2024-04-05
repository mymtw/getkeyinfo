package com.bumptech.glide.load.resource.bitmap;

import p150j4.C7111d;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final C6066e f13049a = new C6066e();

    /* renamed from: b */
    public static final C6064c f13050b = new C6064c();

    /* renamed from: c */
    public static final C6065d f13051c;

    /* renamed from: d */
    public static final C6067f f13052d = new C6067f();

    /* renamed from: e */
    public static final C6065d f13053e;

    /* renamed from: f */
    public static final C7111d<DownsampleStrategy> f13054f;

    /* renamed from: g */
    public static final boolean f13055g = true;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C6062a extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C6063b extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C6064c extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return mo17012b(i, i2, i3, i4) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.f13049a.mo17011a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f13049a.mo17012b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C6065d extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    public static class C6066e extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return DownsampleStrategy.f13055g ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            if (DownsampleStrategy.f13055g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    public static class C6067f extends DownsampleStrategy {
        /* renamed from: a */
        public final SampleSizeRounding mo17011a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public final float mo17012b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        new C6062a();
        new C6063b();
        C6065d dVar = new C6065d();
        f13051c = dVar;
        f13053e = dVar;
        f13054f = C7111d.m13779a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo17011a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo17012b(int i, int i2, int i3, int i4);
}
