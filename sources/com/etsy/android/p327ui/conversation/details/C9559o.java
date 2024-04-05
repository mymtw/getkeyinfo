package com.etsy.android.p327ui.conversation.details;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.details.o */
public abstract class C9559o {

    /* renamed from: com.etsy.android.ui.conversation.details.o$a */
    public static final class C9560a extends C9559o {

        /* renamed from: a */
        public final Bitmap f21217a;

        /* renamed from: b */
        public final File f21218b;

        public C9560a(Bitmap bitmap, File file) {
            C19383o.m32797g(bitmap, "bitmap");
            this.f21217a = bitmap;
            this.f21218b = file;
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.o$b */
    public static final class C9561b extends C9559o {

        /* renamed from: a */
        public static final C9561b f21219a = new C9561b();
    }

    /* renamed from: com.etsy.android.ui.conversation.details.o$c */
    public static final class C9562c extends C9559o {

        /* renamed from: a */
        public static final C9562c f21220a = new C9562c();
    }
}
