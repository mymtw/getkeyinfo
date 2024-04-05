package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.p013v4.media.C0073e;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.i */
public final class C5977i extends C5982l<ParcelFileDescriptor> {
    public C5977i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public final Class<ParcelFileDescriptor> mo16848a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo16849c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo16850f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(C0073e.m206f("FileDescriptor is null for: ", uri));
    }
}
