package p307aa;

import android.content.Context;
import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.C5777k;
import com.bugsnag.android.C5915t2;
import com.bugsnag.android.C5917u;
import com.bugsnag.android.C5925w;
import com.bugsnag.android.C5932x;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.util.CrashUtil;
import com.google.android.exoplayer2.source.C14347j;
import kotlin.jvm.internal.C19383o;
import p409o9.C13138q;
import p595ji.C17993e;

/* renamed from: aa.a */
public final /* synthetic */ class C8494a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f18517b;

    /* renamed from: c */
    public final /* synthetic */ Object f18518c;

    /* renamed from: d */
    public final /* synthetic */ Object f18519d;

    /* renamed from: e */
    public final /* synthetic */ Object f18520e;

    public /* synthetic */ C8494a(Object obj, int i, Object obj2, Object obj3) {
        this.f18517b = i;
        this.f18518c = obj;
        this.f18519d = obj2;
        this.f18520e = obj3;
    }

    public final void run() {
        switch (this.f18517b) {
            case 0:
                CrashUtil.CrashProvider crashProvider = (CrashUtil.CrashProvider) this.f18518c;
                Context context = (Context) this.f18520e;
                C19383o.m32797g(crashProvider, "$provider");
                C19383o.m32797g((C8495b) this.f18519d, "this$0");
                C19383o.m32797g(context, "$context");
                C5932x xVar = new C5932x(crashProvider.getApiKey());
                String str = C0326j.m869n(BuildTarget.Companion) ? "development" : "production";
                C5925w wVar = xVar.f12711a;
                wVar.f12676f = str;
                wVar.f12684n.mo16605e("Invalid configuration value detected. Option maxBreadcrumbs should be an integer between 0-100. Supplied value is 10000");
                String str2 = C13138q.m20808a().f28895a;
                C5925w wVar2 = xVar.f12711a;
                wVar2.getClass();
                wVar2.f12671a = new C5915t2(str2, (String) null, (String) null);
                synchronized (C5777k.f12371a) {
                    if (C5777k.f12372b == null) {
                        C5777k.f12372b = new C5917u(xVar, context);
                    } else {
                        C5777k.m11576b().f12636o.mo16608h("Multiple Bugsnag.start calls detected. Ignoring.");
                    }
                }
                return;
            default:
                C14347j.C14348a aVar = (C14347j.C14348a) this.f18518c;
                ((C14347j) this.f18519d).mo47687j(aVar.f32161a, aVar.f32162b, (C17993e) this.f18520e);
                return;
        }
    }
}
