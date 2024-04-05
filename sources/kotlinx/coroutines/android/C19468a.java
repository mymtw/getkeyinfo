package kotlinx.coroutines.android;

import kotlinx.coroutines.C19766p0;

/* renamed from: kotlinx.coroutines.android.a */
public final /* synthetic */ class C19468a implements C19766p0 {

    /* renamed from: b */
    public final /* synthetic */ C19470c f43400b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f43401c;

    public /* synthetic */ C19468a(C19470c cVar, Runnable runnable) {
        this.f43400b = cVar;
        this.f43401c = runnable;
    }

    public final void dispose() {
        C19470c cVar = this.f43400b;
        cVar.f43404c.removeCallbacks(this.f43401c);
    }
}
