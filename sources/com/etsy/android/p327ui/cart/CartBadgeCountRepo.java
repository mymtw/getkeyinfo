package com.etsy.android.p327ui.cart;

import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import com.etsy.android.search.savedsearch.C8981e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p248tp.C8071s;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.CartBadgeCountRepo */
public final class CartBadgeCountRepo {

    /* renamed from: a */
    public final C9241a f20395a;

    /* renamed from: b */
    public final C13461f f20396b;

    /* renamed from: c */
    public final AtomicInteger f20397c = new AtomicInteger();

    /* renamed from: d */
    public boolean f20398d;

    /* renamed from: e */
    public final C19254a<Integer> f20399e = C19254a.m32516l(0);

    public CartBadgeCountRepo(C9241a aVar, C13461f fVar) {
        C19383o.m32797g(aVar, "cartBadgeCountEndpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f20395a = aVar;
        this.f20396b = fVar;
    }

    /* renamed from: a */
    public final void mo31436a() {
        C8071s<C20145v<C19928a0>> a = this.f20395a.mo31551a();
        C9243b bVar = new C9243b(0);
        a.getClass();
        SubscribersKt.m32500e(C0391c.m1056b(this.f20396b, C0472h.m1243e(this.f20396b, new C19211l(new C19208j(a, bVar), new C8981e(1)))), CartBadgeCountRepo$fetchCartCount$1.INSTANCE, new CartBadgeCountRepo$fetchCartCount$2(this));
    }

    /* renamed from: b */
    public final void mo31437b() {
        this.f20397c.incrementAndGet();
        this.f20399e.onNext(Integer.valueOf(this.f20397c.get()));
    }

    /* renamed from: c */
    public final void mo31438c(int i) {
        this.f20397c.set(i);
        this.f20399e.onNext(Integer.valueOf(this.f20397c.get()));
    }
}
