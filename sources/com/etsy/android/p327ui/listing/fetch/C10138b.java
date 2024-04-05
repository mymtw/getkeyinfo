package com.etsy.android.p327ui.listing.fetch;

import android.util.SparseArray;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9259d;
import com.etsy.android.p327ui.cart.saved.C9342c;
import com.google.android.gms.tasks.RuntimeExecutionException;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19196b;
import p145io.reactivex.internal.operators.single.C19200d;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p321cc.C8569c;
import p402n9.C13090j;
import p466vc.C13558a;
import p470w9.C13793a;
import p513bj.C14055g;
import p513bj.C14060k;
import p602kh.C18086u0;
import p602kh.C18089v0;
import p605kk.C18119c;
import p605kk.C18123g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.fetch.b */
public final /* synthetic */ class C10138b implements C18119c, C14060k.C14062b {

    /* renamed from: b */
    public final /* synthetic */ Object f22297b;

    /* renamed from: c */
    public final /* synthetic */ Object f22298c;

    public /* synthetic */ C10138b(Object obj, Object obj2) {
        this.f22297b = obj;
        this.f22298c = obj2;
    }

    /* renamed from: b */
    public final void mo36b(Object obj, C14055g gVar) {
        C18089v0 v0Var = (C18089v0) obj;
        SparseArray<C18089v0.C18090a> sparseArray = ((C18086u0) this.f22297b).f39482e;
        SparseArray sparseArray2 = new SparseArray(gVar.mo46875b());
        for (int i = 0; i < gVar.mo46875b(); i++) {
            int a = gVar.mo46874a(i);
            C18089v0.C18090a aVar = sparseArray.get(a);
            aVar.getClass();
            sparseArray2.append(a, aVar);
        }
        v0Var.getClass();
    }

    public final void onComplete(C18123g gVar) {
        boolean z;
        C10139c cVar = (C10139c) this.f22297b;
        C13558a.C13561c cVar2 = (C13558a.C13561c) this.f22298c;
        C19383o.m32797g(cVar, "this$0");
        C19383o.m32797g(cVar2, "$event");
        C19383o.m32797g(gVar, "task");
        try {
            if (gVar.mo69668o()) {
                Object k = gVar.mo69664k();
                C19383o.m32796f(k, "task.result");
                if (((Boolean) k).booleanValue() && cVar.f22302d.f22335a.mo21132b(C8592b.f18805k1)) {
                    z = true;
                    C8569c cVar3 = cVar.f22303e;
                    long j = cVar2.f29646a;
                    C8071s<C20145v<ListingFetch>> b = cVar3.f18658a.mo32303b(j, j, false, z, false, true, Boolean.FALSE, true, true);
                    C13793a aVar = new C13793a(1);
                    b.getClass();
                    ConsumerSingleObserver e = SubscribersKt.m32500e(new C19196b(new C19200d(C0472h.m1243e(cVar.f22304f, new C19211l(new C19208j(b, aVar), new C9342c(1))), new C13090j(cVar, 4)), new C9259d(cVar, 1)), new ListingFetchHandler$fetchListing$3(cVar, cVar2), new ListingFetchHandler$fetchListing$4(cVar, cVar2));
                    C7091a aVar2 = cVar.f22300b.f22277a;
                    C19383o.m32798h(aVar2, "compositeDisposable");
                    aVar2.mo19403b(e);
                }
            }
        } catch (RuntimeExecutionException unused) {
        }
        z = false;
        C8569c cVar32 = cVar.f22303e;
        long j2 = cVar2.f29646a;
        C8071s<C20145v<ListingFetch>> b2 = cVar32.f18658a.mo32303b(j2, j2, false, z, false, true, Boolean.FALSE, true, true);
        C13793a aVar3 = new C13793a(1);
        b2.getClass();
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(new C19196b(new C19200d(C0472h.m1243e(cVar.f22304f, new C19211l(new C19208j(b2, aVar3), new C9342c(1))), new C13090j(cVar, 4)), new C9259d(cVar, 1)), new ListingFetchHandler$fetchListing$3(cVar, cVar2), new ListingFetchHandler$fetchListing$4(cVar, cVar2));
        C7091a aVar22 = cVar.f22300b.f22277a;
        C19383o.m32798h(aVar22, "compositeDisposable");
        aVar22.mo19403b(e2);
    }
}
