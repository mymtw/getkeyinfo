package com.etsy.android.p327ui.cart.saved;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.cart.C9243b;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.util.C12059p;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p448ta.C13387c;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.saved.a */
public final class C9336a extends C2866i0 {

    /* renamed from: b */
    public final C13461f f20613b;

    /* renamed from: c */
    public final C9343d f20614c;

    /* renamed from: d */
    public final C9323l f20615d;

    /* renamed from: e */
    public ConsumerSingleObserver f20616e;

    /* renamed from: f */
    public final C7091a f20617f;

    /* renamed from: g */
    public final C2895z<C12059p<C9337a>> f20618g;

    /* renamed from: h */
    public final C2895z f20619h;

    /* renamed from: com.etsy.android.ui.cart.saved.a$a */
    public static abstract class C9337a {

        /* renamed from: com.etsy.android.ui.cart.saved.a$a$a */
        public static final class C9338a extends C9337a {

            /* renamed from: a */
            public static final C9338a f20620a = new C9338a();
        }

        /* renamed from: com.etsy.android.ui.cart.saved.a$a$b */
        public static final class C9339b extends C9337a {

            /* renamed from: a */
            public final CartPage f20621a;

            public C9339b(CartPage cartPage) {
                C19383o.m32797g(cartPage, "cartPage");
                this.f20621a = cartPage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9339b) && C19383o.m32792b(this.f20621a, ((C9339b) obj).f20621a);
            }

            public final int hashCode() {
                return this.f20621a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("LoadSuccess(cartPage=");
                h.append(this.f20621a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: com.etsy.android.ui.cart.saved.a$a$c */
        public static final class C9340c extends C9337a {

            /* renamed from: a */
            public static final C9340c f20622a = new C9340c();
        }
    }

    public C9336a(C13461f fVar, C9343d dVar, C9323l lVar) {
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(dVar, "savedForLaterRepository");
        C19383o.m32797g(lVar, "cartRefreshEventManager");
        this.f20613b = fVar;
        this.f20614c = dVar;
        this.f20615d = lVar;
        C7091a aVar = new C7091a();
        this.f20617f = aVar;
        C2895z<C12059p<C9337a>> zVar = new C2895z<>();
        this.f20618g = zVar;
        this.f20619h = zVar;
        aVar.mo19403b(lVar.f20595a.mo20639i(C13461f.m21235b()).mo20635e(C13461f.m21236c()).mo20637g(new C10673m(this, 2)));
    }

    /* renamed from: b */
    public final void mo31756b(String str) {
        ConsumerSingleObserver consumerSingleObserver = this.f20616e;
        if (consumerSingleObserver != null) {
            consumerSingleObserver.dispose();
        }
        C9343d dVar = this.f20614c;
        dVar.getClass();
        C8071s<C20145v<C19928a0>> a = dVar.f20628a.mo31760a(str);
        C9342c cVar = new C9342c(0);
        a.getClass();
        this.f20616e = C0391c.m1056b(this.f20613b, C0472h.m1243e(this.f20613b, new C19211l(new C19208j(a, cVar), new C9243b(1)))).mo20658g(new C13387c(this, 2), Functions.f28541e);
    }

    public final void onCleared() {
        this.f20617f.mo19405d();
        ConsumerSingleObserver consumerSingleObserver = this.f20616e;
        if (consumerSingleObserver != null) {
            consumerSingleObserver.dispose();
        }
    }
}
