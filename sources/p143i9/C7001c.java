package p143i9;

import android.app.Activity;
import android.content.SharedPreferences;
import com.google.android.play.core.review.ReviewInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import p143i9.C7003e;
import p248tp.C8072t;
import p689ul.C18606d;

/* renamed from: i9.c */
public final /* synthetic */ class C7001c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WeakReference f15548b;

    /* renamed from: c */
    public final /* synthetic */ C7003e f15549c;

    /* renamed from: d */
    public final /* synthetic */ C18606d f15550d;

    /* renamed from: e */
    public final /* synthetic */ C8072t f15551e;

    public /* synthetic */ C7001c(C7003e eVar, C18606d dVar, C8072t tVar, WeakReference weakReference) {
        this.f15548b = weakReference;
        this.f15549c = eVar;
        this.f15550d = dVar;
        this.f15551e = tVar;
    }

    public final void run() {
        WeakReference weakReference = this.f15548b;
        C7003e eVar = this.f15549c;
        C18606d dVar = this.f15550d;
        C8072t tVar = this.f15551e;
        C19383o.m32797g(weakReference, "$activityWrapper");
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(dVar, "$task");
        C19383o.m32797g(tVar, "$emitter");
        Activity activity = (Activity) weakReference.get();
        if (activity == null || activity.isFinishing()) {
            C7003e.C7004a.C7005a aVar = C7003e.C7004a.C7005a.f15559a;
            if (!tVar.isDisposed()) {
                tVar.onSuccess(aVar);
                return;
            }
            return;
        }
        C7007f fVar = eVar.f15555a;
        SharedPreferences.Editor edit = fVar.f15563c.mo46761a().edit();
        fVar.f15561a.getClass();
        edit.putLong("lastShownTimestampForInAppReviewPrompt", System.currentTimeMillis()).apply();
        eVar.f15557c.mo55627b(activity, (ReviewInfo) dVar.mo70119f()).mo70129i(new C7002d(eVar, activity, tVar));
    }
}
