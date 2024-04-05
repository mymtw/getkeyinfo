package p143i9;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p143i9.C7003e;
import p248tp.C8072t;
import p248tp.C8074v;

/* renamed from: i9.a */
public final /* synthetic */ class C6999a implements C8074v {

    /* renamed from: b */
    public final /* synthetic */ C7003e f15543b;

    /* renamed from: c */
    public final /* synthetic */ WeakReference f15544c;

    public /* synthetic */ C6999a(C7003e eVar, WeakReference weakReference) {
        this.f15543b = eVar;
        this.f15544c = weakReference;
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        C7003e eVar = this.f15543b;
        WeakReference weakReference = this.f15544c;
        C19383o.m32797g(eVar, "this$0");
        C19383o.m32797g(weakReference, "$activityWrapper");
        C7007f fVar = eVar.f15555a;
        long j = 0;
        long j2 = fVar.f15563c.mo46761a().getLong("lastShownTimestampForInAppReviewPrompt", 0);
        fVar.f15561a.getClass();
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (currentTimeMillis >= 0) {
            j = currentTimeMillis;
        }
        if (!(TimeUnit.DAYS.convert(j, TimeUnit.MILLISECONDS) >= 30)) {
            C7003e.C7004a.C7005a aVar = C7003e.C7004a.C7005a.f15559a;
            if (!tVar.isDisposed()) {
                tVar.onSuccess(aVar);
                return;
            }
            return;
        }
        eVar.f15557c.mo55626a().mo70129i(new C7000b(eVar, weakReference, tVar));
    }
}
