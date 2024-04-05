package com.etsy.android.uikit.image.glide;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.load.resource.bitmap.C6088l;
import com.bumptech.glide.load.resource.bitmap.C6101s;
import com.bumptech.glide.load.resource.bitmap.C6106x;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C19383o;
import p036c5.C4414c;
import p150j4.C7114e;
import p150j4.C7115f;
import p346fa.C12703a;

/* renamed from: com.etsy.android.uikit.image.glide.j */
public final class C11863j implements C11852b {

    /* renamed from: a */
    public final C12703a f26394a;

    /* renamed from: b */
    public final C7115f<InputStream, Bitmap> f26395b;

    /* renamed from: c */
    public final C5996b f26396c;

    /* renamed from: d */
    public ByteBuffer f26397d;

    /* renamed from: com.etsy.android.uikit.image.glide.j$a */
    public interface C11864a {
    }

    /* renamed from: com.etsy.android.uikit.image.glide.j$b */
    public static final class C11865b implements C11864a {

        /* renamed from: a */
        public final Glide f26398a;

        /* renamed from: b */
        public final DisplayMetrics f26399b;

        /* renamed from: c */
        public final C12703a f26400c;

        public C11865b(Glide glide, DisplayMetrics displayMetrics, C12703a aVar) {
            C19383o.m32797g(glide, "glide");
            C19383o.m32797g(displayMetrics, "displayMetrics");
            C19383o.m32797g(aVar, "grafanaMetrics");
            this.f26398a = glide;
            this.f26399b = displayMetrics;
            this.f26400c = aVar;
        }
    }

    public C11863j(Glide glide, DisplayMetrics displayMetrics, C12703a aVar) {
        C19383o.m32797g(glide, "glide");
        C19383o.m32797g(displayMetrics, "displayMetrics");
        C19383o.m32797g(aVar, "grafana");
        this.f26394a = aVar;
        C5996b arrayPool = glide.getArrayPool();
        C19383o.m32796f(arrayPool, "glide.arrayPool");
        this.f26396c = arrayPool;
        Registry registry = glide.getRegistry();
        C19383o.m32796f(registry, "glide.registry");
        C5998d bitmapPool = glide.getBitmapPool();
        C19383o.m32796f(bitmapPool, "glide.bitmapPool");
        this.f26395b = Build.VERSION.SDK_INT >= 28 ? new C6101s() : new C6106x(new C6088l(registry.mo16764d(), displayMetrics, bitmapPool, arrayPool), arrayPool);
    }

    /* renamed from: a */
    public final ByteBuffer mo38332a() {
        ByteBuffer byteBuffer = this.f26397d;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        C19383o.m32805o("byteBuffer");
        throw null;
    }

    /* renamed from: b */
    public final C6051s mo38333b(C4414c cVar, int i, int i2, C7114e eVar, WeakReference weakReference) {
        int read;
        C19383o.m32797g(eVar, ResponseConstants.OPTIONS);
        C19383o.m32797g(weakReference, "imageViewRef");
        C11858f fVar = new C11858f(cVar.available(), this.f26396c, cVar);
        fVar.f26382i = new C11861h(weakReference, fVar, this, i, i2, eVar);
        while (true) {
            try {
                if (fVar.f26374a == 6 || (read = fVar.f26380g.read()) == -1) {
                    break;
                }
                fVar.f26381h.put((byte) read);
                int i3 = 1;
                int i4 = fVar.f26376c + 1;
                fVar.f26376c = i4;
                int i5 = 0;
                if (fVar.f26379f) {
                    fVar.f26374a = 6;
                    fVar.f26379f = false;
                    break;
                }
                int i6 = fVar.f26374a;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 4) {
                                    fVar.f26374a = 5;
                                } else if (i6 == 5) {
                                    int i7 = ((fVar.f26375b << 8) + read) - 2;
                                    while (i5 < i7) {
                                        fVar.f26381h.put((byte) fVar.f26380g.read());
                                        i5++;
                                    }
                                    fVar.f26376c += i7;
                                    fVar.f26374a = 2;
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (read == 255) {
                                fVar.f26374a = 3;
                            } else if (read == 0) {
                                fVar.f26374a = 2;
                            } else if (read == 217) {
                                fVar.f26379f = true;
                                fVar.mo38336a(i4 - 2);
                                fVar.f26374a = 2;
                            } else {
                                if (read == 218) {
                                    fVar.mo38336a(i4 - 2);
                                }
                                if (read != 1) {
                                    if (read < 208 || read > 215) {
                                        if (read == 217 || read == 216) {
                                            i3 = 0;
                                        }
                                        i5 = i3;
                                    }
                                }
                                if (i5 != 0) {
                                    fVar.f26374a = 4;
                                } else {
                                    fVar.f26374a = 2;
                                }
                            }
                        } else if (read == 255) {
                            fVar.f26374a = 3;
                        }
                    } else if (read == 216) {
                        fVar.f26374a = 2;
                    } else {
                        fVar.f26374a = 6;
                    }
                } else if (read == 255) {
                    fVar.f26374a = 1;
                } else {
                    fVar.f26374a = 6;
                }
                fVar.f26375b = read;
            } catch (IOException e) {
                throw e;
            }
        }
        ByteBuffer byteBuffer = fVar.f26381h;
        C19383o.m32796f(byteBuffer, "parser.byteBuffer");
        this.f26397d = byteBuffer;
        C7115f<InputStream, Bitmap> fVar2 = this.f26395b;
        ByteBuffer byteBuffer2 = this.f26397d;
        if (byteBuffer2 != null) {
            return fVar2.mo17024b(new ByteArrayInputStream(byteBuffer2.array()), i, i2, eVar);
        }
        C19383o.m32805o("byteBuffer");
        throw null;
    }
}
