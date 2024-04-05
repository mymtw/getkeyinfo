package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.CollectionV3;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.add.q */
public abstract class C9779q {

    /* renamed from: com.etsy.android.ui.favorites.add.q$a */
    public static final class C9780a extends C9779q {

        /* renamed from: a */
        public final String f21622a;

        public C9780a(String str) {
            this.f21622a = str;
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.add.q$b */
    public static final class C9781b extends C9779q {

        /* renamed from: a */
        public final CollectionV3 f21623a;

        public C9781b(CollectionV3 collectionV3) {
            C19383o.m32797g(collectionV3, Collection.TYPE_COLLECTION);
            this.f21623a = collectionV3;
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.add.q$c */
    public static final class C9782c extends C9779q {

        /* renamed from: a */
        public static final C9782c f21624a = new C9782c();
    }
}
