package com.squareup.picasso;

import android.util.LruCache;
import com.squareup.picasso.C17452n;

/* renamed from: com.squareup.picasso.m */
public final class C17451m extends LruCache<String, C17452n.C17453a> {
    public C17451m(int i) {
        super(i);
    }

    public final int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((C17452n.C17453a) obj2).f38128b;
    }
}
