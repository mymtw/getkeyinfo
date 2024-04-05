package p145io.branch.referral;

import android.content.ComponentName;
import android.net.Uri;
import java.lang.reflect.Method;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7050l;

/* renamed from: io.branch.referral.k */
public final class C7048k extends C7050l.C7052b {

    /* renamed from: c */
    public final /* synthetic */ Method f15672c;

    /* renamed from: d */
    public final /* synthetic */ Method f15673d;

    /* renamed from: e */
    public final /* synthetic */ Uri f15674e;

    /* renamed from: f */
    public final /* synthetic */ Method f15675f;

    /* renamed from: g */
    public final /* synthetic */ C7077r f15676g;

    /* renamed from: h */
    public final /* synthetic */ C7050l.C7053c f15677h;

    /* renamed from: i */
    public final /* synthetic */ C7050l f15678i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7048k(C7050l lVar, Method method, Method method2, Uri uri, Method method3, C7077r rVar, Branch.C7011a aVar) {
        super();
        this.f15678i = lVar;
        this.f15672c = method;
        this.f15673d = method2;
        this.f15674e = uri;
        this.f15675f = method3;
        this.f15676g = rVar;
        this.f15677h = aVar;
    }

    /* renamed from: a */
    public final void mo19285a(Object obj) {
        C7050l lVar = this.f15678i;
        lVar.f15682a = lVar.f15686e.cast(obj);
        Object obj2 = this.f15678i.f15682a;
        if (obj2 != null) {
            try {
                this.f15672c.invoke(obj2, new Object[]{0});
                Object invoke = this.f15673d.invoke(this.f15678i.f15682a, new Object[]{null});
                if (invoke != null) {
                    C7077r.m13675a("Strong match request " + this.f15674e);
                    this.f15675f.invoke(invoke, new Object[]{this.f15674e, null, null});
                    this.f15676g.mo19332v(System.currentTimeMillis(), "bnc_branch_strong_match_time");
                    this.f15678i.f15685d = true;
                }
            } catch (Exception unused) {
                C7050l lVar2 = this.f15678i;
                lVar2.f15682a = null;
                C7050l.m13643b(this.f15677h, lVar2.f15685d);
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C7050l lVar = this.f15678i;
        lVar.f15682a = null;
        C7050l.m13643b(this.f15677h, lVar.f15685d);
    }
}
