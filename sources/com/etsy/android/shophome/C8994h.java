package com.etsy.android.shophome;

import com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.shophome.h */
public final class C8994h {

    /* renamed from: a */
    public final C8992f f19851a;

    /* renamed from: com.etsy.android.shophome.h$a */
    public static abstract class C8995a {

        /* renamed from: com.etsy.android.shophome.h$a$a */
        public static final class C8996a extends C8995a {

            /* renamed from: a */
            public final Throwable f19852a;

            public C8996a(Throwable th) {
                C19383o.m32797g(th, "error");
                this.f19852a = th;
            }
        }

        /* renamed from: com.etsy.android.shophome.h$a$b */
        public static final class C8997b extends C8995a {

            /* renamed from: a */
            public final ShopListingsSearchResult f19853a;

            public C8997b(ShopListingsSearchResult shopListingsSearchResult) {
                this.f19853a = shopListingsSearchResult;
            }
        }
    }

    public C8994h(C8992f fVar) {
        this.f19851a = fVar;
    }
}
