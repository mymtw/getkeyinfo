package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.support.p013v4.media.C0073e;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
public final class C5965a extends C5982l<AssetFileDescriptor> {
    public C5965a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public final Class<AssetFileDescriptor> mo16848a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo16849c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo16850f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(C0073e.m206f("FileDescriptor is null for: ", uri));
    }
}
