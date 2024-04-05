package com.etsy.android.qualtrics;

import android.content.Context;
import android.content.SharedPreferences;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.qualtrics.digital.C17304k;
import com.qualtrics.digital.C17314t;
import com.qualtrics.digital.C17315u;
import com.qualtrics.digital.C17318x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.observers.EmptyCompletableObserver;
import p145io.reactivex.internal.operators.completable.C19089c;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p456ua.C13461f;
import p753kq.C19857l;

public final class QualtricsWrapper implements C8951c {

    /* renamed from: a */
    public final C13461f f19743a;

    /* renamed from: b */
    public final C19285c f19744b;

    /* renamed from: c */
    public final AtomicBoolean f19745c = new AtomicBoolean(false);

    /* renamed from: d */
    public final C8962e f19746d = new C8962e(this);

    public QualtricsWrapper(C8950b bVar, C13461f fVar) {
        this.f19743a = fVar;
        this.f19744b = C19350d.m32677b(new QualtricsWrapper$willInitialize$2(bVar));
    }

    /* renamed from: a */
    public final void mo30561a(List<? extends C8952d> list) {
        C19383o.m32797g(list, "properties");
        if (((Boolean) this.f19744b.getValue()).booleanValue() && this.f19745c.get()) {
            for (C8952d dVar : list) {
                C17315u a = C17315u.m29063a();
                C19383o.m32796f(a, "instance()");
                C17314t tVar = a.f37842a;
                String str = dVar.f19750b;
                String str2 = dVar.f19749a;
                SharedPreferences a2 = tVar.mo68223a();
                if (a2 != null) {
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putString(str, str2);
                    edit.apply();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo30562b(C19857l<? super String, C19394m> lVar) {
        if (((Boolean) this.f19744b.getValue()).booleanValue() && this.f19745c.get()) {
            C17315u a = C17315u.m29063a();
            C19383o.m32796f(a, "instance()");
            C8778g gVar = new C8778g(lVar);
            try {
                C17304k kVar = a.f37843b;
                if (kVar != null) {
                    kVar.mo68218a(gVar);
                }
            } catch (Throwable th) {
                C17318x.m29067a().mo68224c(th);
            }
        }
    }

    /* renamed from: c */
    public final void mo30563c(Context context, String str, String str2, String str3) {
        C19383o.m32797g(str, "brandId");
        C19383o.m32797g(str2, "projectId");
        C19383o.m32797g(str3, "interceptId");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (((Boolean) this.f19744b.getValue()).booleanValue() && !this.f19745c.get()) {
            C19089c cVar = new C19089c(new C8963f(this, str, str2, str3, context));
            this.f19743a.getClass();
            new CompletableSubscribeOn(cVar, C13461f.m21235b()).mo20607a(new EmptyCompletableObserver());
        }
    }
}
