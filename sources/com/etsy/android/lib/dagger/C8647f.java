package com.etsy.android.lib.dagger;

import android.os.Handler;
import android.os.Looper;
import dagger.internal.C17555d;
import kotlinx.coroutines.C19760n0;
import p145io.reactivex.disposables.C7091a;
import p514bk.C14088a;
import p560en.C17726a;
import p568fn.C17782b;
import p632nn.C18281g;
import p722ym.C18895a;
import p768rq.C20153b;

/* renamed from: com.etsy.android.lib.dagger.f */
public final class C8647f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19007a;

    /* renamed from: b */
    public final Object f19008b;

    public /* synthetic */ C8647f(Object obj, int i) {
        this.f19007a = i;
        this.f19008b = obj;
    }

    public final Object get() {
        switch (this.f19007a) {
            case 0:
                ((C14088a) this.f19008b).getClass();
                C20153b bVar = C19760n0.f43719a;
                C17782b.m29841G(bVar);
                return bVar;
            case 1:
                ((C14088a) this.f19008b).getClass();
                return new C7091a();
            case 2:
                ((C14088a) this.f19008b).getClass();
                return new Handler(Looper.getMainLooper());
            default:
                C18895a<C18281g> aVar = ((C17726a) this.f19008b).f38529c;
                C17782b.m29838E(aVar);
                return aVar;
        }
    }
}
