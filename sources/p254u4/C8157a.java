package p254u4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.C5963a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import p036c5.C4421h;
import p036c5.C4426l;
import p138i4.C6990c;
import p138i4.C6991d;
import p138i4.C6992e;
import p150j4.C7114e;
import p150j4.C7115f;
import p215q4.C7723a;

/* renamed from: u4.a */
public final class C8157a implements C7115f<ByteBuffer, GifDrawable> {

    /* renamed from: f */
    public static final C8158a f17906f = new C8158a();

    /* renamed from: g */
    public static final C8159b f17907g = new C8159b();

    /* renamed from: a */
    public final Context f17908a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f17909b;

    /* renamed from: c */
    public final C8159b f17910c;

    /* renamed from: d */
    public final C8158a f17911d;

    /* renamed from: e */
    public final C8160b f17912e;

    /* renamed from: u4.a$a */
    public static class C8158a {
    }

    /* renamed from: u4.a$b */
    public static class C8159b {

        /* renamed from: a */
        public final ArrayDeque f17913a = new ArrayDeque(0);

        public C8159b() {
            char[] cArr = C4426l.f9710a;
        }
    }

    public C8157a(Context context, List<ImageHeaderParser> list, C5998d dVar, C5996b bVar) {
        C8159b bVar2 = f17907g;
        C8158a aVar = f17906f;
        this.f17908a = context.getApplicationContext();
        this.f17909b = list;
        this.f17911d = aVar;
        this.f17912e = new C8160b(dVar, bVar);
        this.f17910c = bVar2;
    }

    /* renamed from: a */
    public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
        return !((Boolean) eVar.mo19443c(C8164f.f17919b)).booleanValue() && C5963a.m11790c(this.f17909b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    /* renamed from: b */
    public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
        C6991d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C8159b bVar = this.f17910c;
        synchronized (bVar) {
            C6991d dVar2 = (C6991d) bVar.f17913a.poll();
            if (dVar2 == null) {
                dVar2 = new C6991d();
            }
            dVar = dVar2;
            dVar.f15508b = null;
            Arrays.fill(dVar.f15507a, (byte) 0);
            dVar.f15509c = new C6990c();
            dVar.f15510d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f15508b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f15508b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            C8161c c = mo20794c(byteBuffer, i, i2, dVar, eVar);
            C8159b bVar2 = this.f17910c;
            synchronized (bVar2) {
                dVar.f15508b = null;
                dVar.f15509c = null;
                bVar2.f17913a.offer(dVar);
            }
            return c;
        } catch (Throwable th) {
            C8159b bVar3 = this.f17910c;
            synchronized (bVar3) {
                dVar.f15508b = null;
                dVar.f15509c = null;
                bVar3.f17913a.offer(dVar);
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final C8161c mo20794c(ByteBuffer byteBuffer, int i, int i2, C6991d dVar, C7114e eVar) {
        int i3 = C4421h.f9699b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C6990c b = dVar.mo19166b();
            if (b.f15497c > 0) {
                if (b.f15496b == 0) {
                    Bitmap.Config config = eVar.mo19443c(C8164f.f17918a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int min = Math.min(b.f15501g / i2, b.f15500f / i);
                    int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                    Log.isLoggable("BufferGifDecoder", 2);
                    C8158a aVar = this.f17911d;
                    C8160b bVar = this.f17912e;
                    aVar.getClass();
                    C6992e eVar2 = new C6992e(bVar, b, byteBuffer, max);
                    eVar2.mo19173j(config);
                    eVar2.mo19155b();
                    Bitmap c = eVar2.mo19156c();
                    if (c == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            C4421h.m10119a(elapsedRealtimeNanos);
                        }
                        return null;
                    }
                    C8161c cVar = new C8161c(new GifDrawable(this.f17908a, eVar2, C7723a.f17133b, i, i2, c));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        C4421h.m10119a(elapsedRealtimeNanos);
                    }
                    return cVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                C4421h.m10119a(elapsedRealtimeNanos);
            }
        }
    }
}
