package com.bumptech.glide.load.engine.bitmap_recycle;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
public final class C6003h implements C5995a<int[]> {
    /* renamed from: a */
    public final int mo16908a() {
        return 4;
    }

    /* renamed from: b */
    public final int mo16909b(Object obj) {
        return ((int[]) obj).length;
    }

    public final String getTag() {
        return "IntegerArrayPool";
    }

    public final Object newArray(int i) {
        return new int[i];
    }
}
