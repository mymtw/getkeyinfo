package p254u4;

import android.util.Log;
import com.bumptech.glide.load.C5963a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: u4.g */
public final class C8165g implements C7115f<InputStream, GifDrawable> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f17920a;

    /* renamed from: b */
    public final C7115f<ByteBuffer, GifDrawable> f17921b;

    /* renamed from: c */
    public final C5996b f17922c;

    public C8165g(List list, C8157a aVar, C5996b bVar) {
        this.f17920a = list;
        this.f17921b = aVar;
        this.f17922c = bVar;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) eVar.mo19443c(C8164f.f17919b)).booleanValue()) {
            if (C5963a.m11789b(this.f17922c, inputStream, this.f17920a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
        try {
            byte[] bArr2 = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f17921b.mo17024b(ByteBuffer.wrap(bArr), i, i2, eVar);
    }
}
