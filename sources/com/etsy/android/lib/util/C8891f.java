package com.etsy.android.lib.util;

import android.graphics.Bitmap;
import android.net.Uri;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.util.f */
public abstract class C8891f {

    /* renamed from: com.etsy.android.lib.util.f$a */
    public static final class C8892a extends C8891f {

        /* renamed from: a */
        public final Object f19649a;

        /* renamed from: b */
        public final File f19650b;

        public C8892a(Object obj, File file) {
            this.f19649a = obj;
            this.f19650b = file;
        }
    }

    /* renamed from: com.etsy.android.lib.util.f$b */
    public static final class C8893b extends C8891f {

        /* renamed from: a */
        public final Object f19651a;

        /* renamed from: b */
        public final Bitmap f19652b;

        /* renamed from: c */
        public final File f19653c;

        public C8893b(Object obj, Bitmap bitmap, File file) {
            C19383o.m32797g(bitmap, "bitmap");
            C19383o.m32797g(file, ResponseConstants.FILE);
            this.f19651a = obj;
            this.f19652b = bitmap;
            this.f19653c = file;
        }
    }

    /* renamed from: com.etsy.android.lib.util.f$c */
    public static final class C8894c extends C8891f {

        /* renamed from: a */
        public static final C8894c f19654a = new C8894c();
    }

    /* renamed from: com.etsy.android.lib.util.f$d */
    public static final class C8895d extends C8891f {

        /* renamed from: a */
        public static final C8895d f19655a = new C8895d();
    }

    /* renamed from: com.etsy.android.lib.util.f$e */
    public static final class C8896e extends C8891f {

        /* renamed from: a */
        public static final C8896e f19656a = new C8896e();
    }

    /* renamed from: com.etsy.android.lib.util.f$f */
    public static final class C8897f extends C8891f {
        public C8897f(Uri uri, Uri uri2) {
            C19383o.m32797g(uri, "originalFile");
            C19383o.m32797g(uri2, "croppedFile");
        }
    }
}
