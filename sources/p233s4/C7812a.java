package p233s4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5963a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p036c5.C4410a;
import p036c5.C4426l;
import p150j4.C7114e;
import p150j4.C7115f;

/* renamed from: s4.a */
public final class C7812a {

    /* renamed from: a */
    public final List<ImageHeaderParser> f17273a;

    /* renamed from: b */
    public final C5996b f17274b;

    /* renamed from: s4.a$a */
    public static final class C7813a implements C6051s<Drawable> {

        /* renamed from: b */
        public final AnimatedImageDrawable f17275b;

        public C7813a(AnimatedImageDrawable animatedImageDrawable) {
            this.f17275b = animatedImageDrawable;
        }

        /* renamed from: a */
        public final int mo16989a() {
            return C4426l.m10130d(Bitmap.Config.ARGB_8888) * this.f17275b.getIntrinsicHeight() * this.f17275b.getIntrinsicWidth() * 2;
        }

        /* renamed from: b */
        public final void mo16990b() {
            this.f17275b.stop();
            this.f17275b.clearAnimationCallbacks();
        }

        /* renamed from: d */
        public final Class<Drawable> mo16992d() {
            return Drawable.class;
        }

        public final Object get() {
            return this.f17275b;
        }
    }

    /* renamed from: s4.a$b */
    public static final class C7814b implements C7115f<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final C7812a f17276a;

        public C7814b(C7812a aVar) {
            this.f17276a = aVar;
        }

        /* renamed from: a */
        public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
            return C5963a.m11790c(this.f17276a.f17273a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }

        /* renamed from: b */
        public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
            ImageDecoder.Source createSource = ImageDecoder.createSource((ByteBuffer) obj);
            this.f17276a.getClass();
            return C7812a.m15062a(createSource, i, i2, eVar);
        }
    }

    /* renamed from: s4.a$c */
    public static final class C7815c implements C7115f<InputStream, Drawable> {

        /* renamed from: a */
        public final C7812a f17277a;

        public C7815c(C7812a aVar) {
            this.f17277a = aVar;
        }

        /* renamed from: a */
        public final boolean mo17023a(Object obj, C7114e eVar) throws IOException {
            C7812a aVar = this.f17277a;
            return C5963a.m11789b(aVar.f17274b, (InputStream) obj, aVar.f17273a) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }

        /* renamed from: b */
        public final C6051s mo17024b(Object obj, int i, int i2, C7114e eVar) throws IOException {
            ImageDecoder.Source createSource = ImageDecoder.createSource(C4410a.m10112b((InputStream) obj));
            this.f17277a.getClass();
            return C7812a.m15062a(createSource, i, i2, eVar);
        }
    }

    public C7812a(List<ImageHeaderParser> list, C5996b bVar) {
        this.f17273a = list;
        this.f17274b = bVar;
    }

    /* renamed from: a */
    public static C7813a m15062a(ImageDecoder.Source source, int i, int i2, C7114e eVar) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, eVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C7813a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
