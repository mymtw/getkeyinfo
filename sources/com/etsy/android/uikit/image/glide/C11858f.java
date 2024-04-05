package com.etsy.android.uikit.image.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.etsy.android.lib.logger.LogCatKt;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.jvm.internal.C19383o;
import p036c5.C4414c;
import p150j4.C7114e;

/* renamed from: com.etsy.android.uikit.image.glide.f */
public final class C11858f {

    /* renamed from: a */
    public int f26374a = 0;

    /* renamed from: b */
    public int f26375b = 0;

    /* renamed from: c */
    public int f26376c = 0;

    /* renamed from: d */
    public int f26377d = 0;

    /* renamed from: e */
    public int f26378e = 0;

    /* renamed from: f */
    public boolean f26379f;

    /* renamed from: g */
    public final RecyclableBufferedInputStream f26380g;

    /* renamed from: h */
    public final ByteBuffer f26381h;

    /* renamed from: i */
    public C11859a f26382i;

    /* renamed from: com.etsy.android.uikit.image.glide.f$a */
    public interface C11859a {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(0, "Marker escape byte");
        hashMap.put(216, "SOI");
        hashMap.put(1, "TEM");
        hashMap.put(217, "EOI");
        hashMap.put(218, "SOS");
        hashMap.put(225, "APP1");
        hashMap.put(192, "SOFn");
        hashMap.put(208, "RST0");
        hashMap.put(215, "RST7");
        hashMap.put(219, "QUANT TABLE");
        hashMap.put(224, "APP0");
        hashMap.put(196, "HUFF TABLE");
        hashMap.put(1165519206, "APP1_EXIF_MAGIC");
    }

    public C11858f(int i, C5996b bVar, C4414c cVar) {
        this.f26380g = new RecyclableBufferedInputStream(cVar, bVar);
        this.f26381h = ByteBuffer.allocate(i);
    }

    /* renamed from: a */
    public final void mo38336a(int i) {
        Bitmap bitmap;
        int i2 = this.f26377d;
        if (i2 > 0) {
            this.f26378e = i;
        }
        this.f26377d = i2 + 1;
        C11859a aVar = this.f26382i;
        if (aVar != null && i2 <= 5) {
            ByteBuffer byteBuffer = this.f26381h;
            int i3 = this.f26378e;
            C11861h hVar = (C11861h) aVar;
            WeakReference weakReference = hVar.f26385a;
            C11858f fVar = hVar.f26386b;
            C11863j jVar = hVar.f26387c;
            int i4 = hVar.f26388d;
            int i5 = hVar.f26389e;
            C7114e eVar = hVar.f26390f;
            C19383o.m32797g(weakReference, "$imageViewRef");
            C19383o.m32797g(fVar, "$parser");
            C19383o.m32797g(jVar, "this$0");
            C19383o.m32797g(eVar, "$options");
            if (i2 >= 1) {
                try {
                    ImageView imageView = (ImageView) weakReference.get();
                    Bitmap bitmap2 = null;
                    if (imageView == null) {
                        fVar.f26382i = null;
                        return;
                    }
                    int position = byteBuffer.position();
                    byteBuffer.rewind();
                    int i6 = i3 + 2;
                    byte[] bArr = new byte[i6];
                    byteBuffer.get(bArr);
                    byteBuffer.position(position);
                    bArr[i6 - 2] = -1;
                    bArr[i6 - 1] = -39;
                    C6051s<Bitmap> b = jVar.f26395b.mo17024b(new ByteArrayInputStream(bArr), i4, i5, eVar);
                    if (b != null && (bitmap = b.get()) != null) {
                        Drawable drawable = imageView.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        }
                        imageView.post(new C11862i(imageView, bitmap, bitmap2));
                    }
                } catch (Exception e) {
                    LogCatKt.m17045a().mo21309d("Error parsing bitmap", e);
                    jVar.f26394a.mo45475b("progressive_jpeg.frame_decode_failure", 0.001d);
                }
            }
        }
    }
}
