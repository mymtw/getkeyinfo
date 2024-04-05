package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
public final class C5976h extends C5966b<AssetFileDescriptor> {
    public C5976h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class<AssetFileDescriptor> mo16848a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo16852c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo16856f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
