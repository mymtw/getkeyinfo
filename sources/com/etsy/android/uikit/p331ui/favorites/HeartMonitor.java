package com.etsy.android.uikit.p331ui.favorites;

import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.subjects.PublishSubject;
import p340ea.C12668i;
import p400mf.C13074b;
import p400mf.C13078c;
import p400mf.C13079d;
import p402n9.C13095o;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.ui.favorites.HeartMonitor */
public final class HeartMonitor implements C2857f {

    /* renamed from: b */
    public final C13078c f26448b;

    /* renamed from: c */
    public final C7091a f26449c = new C7091a();

    public HeartMonitor(Lifecycle lifecycle, C13078c cVar) {
        C19383o.m32797g(lifecycle, "lifecycle");
        this.f26448b = cVar;
        lifecycle.mo10733a(this);
    }

    public final void onCreate(C2887s sVar) {
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        C19172m c = C0472h.m1242c(publishSubject, publishSubject);
        if (C18263b.f40055S != null) {
            ObservableSubscribeOn i = c.mo20639i(C13461f.m21235b());
            if (C18263b.f40055S != null) {
                Disposable f = i.mo20635e(C13461f.m21236c()).mo20636f(new C13095o(this, 5), new C12668i(1), Functions.f28539c, Functions.f28540d);
                C7091a aVar = this.f26449c;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(f);
                return;
            }
            C19383o.m32805o("rxSchedulers");
            throw null;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final void onDestroy(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        this.f26449c.mo19405d();
    }
}
