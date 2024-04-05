package com.etsy.android.p327ui.cart.saved;

import com.etsy.android.lib.models.apiv3.cart.CartPage;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20202y;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.saved.d */
public final class C9343d {

    /* renamed from: a */
    public final C9344a f20628a;

    /* renamed from: com.etsy.android.ui.cart.saved.d$a */
    public interface C9344a {
        @C20183f
        /* renamed from: a */
        C8071s<C20145v<C19928a0>> mo31760a(@C20202y String str);
    }

    /* renamed from: com.etsy.android.ui.cart.saved.d$b */
    public static abstract class C9345b {

        /* renamed from: com.etsy.android.ui.cart.saved.d$b$a */
        public static final class C9346a extends C9345b {
        }

        /* renamed from: com.etsy.android.ui.cart.saved.d$b$b */
        public static final class C9347b extends C9345b {

            /* renamed from: a */
            public final CartPage f20629a;

            public C9347b(CartPage cartPage) {
                this.f20629a = cartPage;
            }
        }
    }

    public C9343d(C9344a aVar) {
        C19383o.m32797g(aVar, "endpoint");
        this.f20628a = aVar;
    }
}
