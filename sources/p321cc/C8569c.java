package p321cc;

import com.etsy.android.lib.models.ReceiptReviewV3;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.p327ui.core.C9621i;
import com.squareup.moshi.C17414y;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import retrofit2.C20145v;

/* renamed from: cc.c */
public final class C8569c {

    /* renamed from: a */
    public final C9621i f18658a;

    /* renamed from: b */
    public final C17414y f18659b;

    /* renamed from: cc.c$a */
    public static abstract class C8570a {

        /* renamed from: cc.c$a$a */
        public static final class C8571a extends C8570a {

            /* renamed from: a */
            public final C20145v<ListingFetch> f18660a;

            /* renamed from: b */
            public final Throwable f18661b;

            public C8571a(C20145v<ListingFetch> vVar, Throwable th) {
                this.f18660a = vVar;
                this.f18661b = th;
            }
        }

        /* renamed from: cc.c$a$b */
        public static final class C8572b extends C8570a {

            /* renamed from: a */
            public final ListingFetch f18662a;

            public C8572b(ListingFetch listingFetch) {
                this.f18662a = listingFetch;
            }
        }
    }

    /* renamed from: cc.c$b */
    public static abstract class C8573b {

        /* renamed from: cc.c$b$a */
        public static final class C8574a extends C8573b {
            public C8574a() {
            }

            public C8574a(int i) {
            }
        }

        /* renamed from: cc.c$b$b */
        public static final class C8575b extends C8573b {

            /* renamed from: a */
            public final ReceiptReviewV3 f18663a;

            public C8575b(ReceiptReviewV3 receiptReviewV3) {
                this.f18663a = receiptReviewV3;
            }
        }
    }

    /* renamed from: cc.c$c */
    public static abstract class C8576c {

        /* renamed from: cc.c$c$a */
        public static final class C8577a extends C8576c {

            /* renamed from: a */
            public final Throwable f18664a;

            public C8577a(Throwable th) {
                this.f18664a = th;
            }
        }

        /* renamed from: cc.c$c$b */
        public static final class C8578b extends C8576c {

            /* renamed from: a */
            public final AppsInventoryAddToCartContext f18665a;

            public C8578b(AppsInventoryAddToCartContext appsInventoryAddToCartContext) {
                this.f18665a = appsInventoryAddToCartContext;
            }
        }
    }

    public C8569c(C9621i iVar, C17414y yVar) {
        C19383o.m32797g(iVar, "listingEndpoint");
        C19383o.m32797g(yVar, "moshi");
        this.f18658a = iVar;
        this.f18659b = yVar;
    }

    /* renamed from: a */
    public final C19211l mo21085a(long j, List list, int i) {
        C19383o.m32797g(list, "listingVariationIds");
        C8071s<C20145v<AppsInventoryAddToCartContext>> c = this.f18658a.mo32304c(j, list, i, false);
        C8567a aVar = new C8567a(0);
        c.getClass();
        return new C19211l(new C19208j(c, aVar), new C8568b(0));
    }
}
