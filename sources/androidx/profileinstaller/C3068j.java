package androidx.profileinstaller;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6575k;
import com.google.android.exoplayer2.source.hls.C14325m;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p306z8.C8477d;

/* renamed from: androidx.profileinstaller.j */
public final /* synthetic */ class C3068j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6985b;

    /* renamed from: c */
    public final /* synthetic */ Object f6986c;

    public /* synthetic */ C3068j(Object obj, int i) {
        this.f6985b = i;
        this.f6986c = obj;
    }

    public final void run() {
        switch (this.f6985b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C3069k((Context) this.f6986c, 0));
                return;
            case 1:
                C6575k kVar = (C6575k) this.f6986c;
                kVar.f14540d.mo18790e(new C8477d(kVar));
                return;
            default:
                C14325m mVar = (C14325m) this.f6986c;
                mVar.f31953C = true;
                mVar.mo47739D();
                return;
        }
    }
}
