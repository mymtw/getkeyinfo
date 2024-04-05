package p143i9;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0122e;
import com.etsy.android.lib.network.oauth2.signin.C8783k;
import com.etsy.android.lib.network.oauth2.signin.C8784l;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p019b.C3448e;
import p030bo.app.C3653e7;
import p143i9.C7003e;
import p248tp.C8072t;
import p580hj.C17814a;
import p580hj.C17820f;
import p588ij.C17846e;
import p605kk.C18119c;
import p605kk.C18123g;
import p689ul.C18603a;
import p689ul.C18606d;

/* renamed from: i9.b */
public final /* synthetic */ class C7000b implements C18603a, C18119c {

    /* renamed from: b */
    public final /* synthetic */ C8072t f15545b;

    /* renamed from: c */
    public final /* synthetic */ Object f15546c;

    /* renamed from: d */
    public final /* synthetic */ Object f15547d;

    public /* synthetic */ C7000b(Object obj, Object obj2, C8072t tVar) {
        this.f15546c = obj;
        this.f15547d = obj2;
        this.f15545b = tVar;
    }

    /* renamed from: b */
    public final void mo5885b(C18606d dVar) {
        C7003e eVar = (C7003e) this.f15546c;
        WeakReference weakReference = (WeakReference) this.f15547d;
        C8072t tVar = this.f15545b;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(weakReference, "$activityWrapper");
        C19383o.m32797g(tVar, "$emitter");
        C19383o.m32797g(dVar, "it");
        if (!dVar.mo70121h()) {
            C7003e.C7004a.C7006b bVar = C7003e.C7004a.C7006b.f15560a;
            if (!tVar.isDisposed()) {
                tVar.onSuccess(bVar);
            }
        } else if (!tVar.isDisposed()) {
            eVar.f15558d.postDelayed(new C7001c(eVar, dVar, tVar, weakReference), 500);
        }
    }

    public final void onComplete(C18123g gVar) {
        Intent intent;
        C8784l lVar = (C8784l) this.f15546c;
        C17814a aVar = (C17814a) this.f15547d;
        C8072t tVar = this.f15545b;
        C19383o.m32797g(lVar, "this$0");
        C19383o.m32797g(tVar, "$emitter");
        C19383o.m32797g(gVar, "it");
        C0122e d = lVar.f19332b.mo1161d("GoogleSignInHelper#signIn", new C3448e(), new C3653e7(tVar, 0));
        Context applicationContext = aVar.getApplicationContext();
        int i = C17820f.f38727a[aVar.mo69050a() - 1];
        if (i == 1) {
            C17846e.f38760a.mo49326d("getFallbackSignInIntent()", new Object[0]);
            intent = C17846e.m29973a(applicationContext, (GoogleSignInOptions) aVar.getApiOptions());
            intent.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        } else if (i != 2) {
            C17846e.f38760a.mo49326d("getNoImplementationSignInIntent()", new Object[0]);
            intent = C17846e.m29973a(applicationContext, (GoogleSignInOptions) aVar.getApiOptions());
            intent.setAction("com.google.android.gms.auth.NO_IMPL");
        } else {
            intent = C17846e.m29973a(applicationContext, (GoogleSignInOptions) aVar.getApiOptions());
        }
        d.mo1157b(intent);
        tVar.setCancellable(new C8783k(d));
    }
}
