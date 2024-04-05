package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a */
public final class C5963a {
    /* renamed from: a */
    public static int m11788a(C5996b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                int d = ((ImageHeaderParser) list.get(i)).mo16839d(inputStream, bVar);
                if (d != -1) {
                    return d;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m11789b(C5996b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser.ImageType c = ((ImageHeaderParser) list.get(i)).mo16838c(inputStream);
                inputStream.reset();
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m11790c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = list.get(i).mo16836a(byteBuffer);
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
