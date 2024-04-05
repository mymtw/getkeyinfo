package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
public final class C5983m extends C5966b<InputStream> {
    public C5983m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class<InputStream> mo16848a() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo16852c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* renamed from: f */
    public final Object mo16856f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
