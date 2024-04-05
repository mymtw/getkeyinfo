package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.f */
public final class C6000f implements C5995a<byte[]> {
    /* renamed from: a */
    public final int mo16908a() {
        return 1;
    }

    /* renamed from: b */
    public final int mo16909b(Object obj) {
        return ((byte[]) obj).length;
    }

    public final String getTag() {
        return "ByteArrayPool";
    }

    public final Object newArray(int i) {
        return new byte[i];
    }
}
