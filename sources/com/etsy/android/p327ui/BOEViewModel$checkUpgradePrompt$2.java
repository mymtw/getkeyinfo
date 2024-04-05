package com.etsy.android.p327ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.C9905g0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p346fa.C12703a;
import p475we.C13827c;
import p475we.C13832h;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.BOEViewModel$checkUpgradePrompt$2 */
final class BOEViewModel$checkUpgradePrompt$2 extends Lambda implements C19857l<C13832h, C19394m> {
    public final /* synthetic */ C10677n this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BOEViewModel$checkUpgradePrompt$2(C10677n nVar) {
        super(1);
        this.this$0 = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13832h) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13832h hVar) {
        this.this$0.f23532v = hVar;
        if (!C19383o.m32792b(hVar, C13832h.C13834b.f30451a)) {
            C13827c cVar = this.this$0.f23516f;
            C19383o.m32796f(hVar, "upgradePromptType");
            cVar.getClass();
            C12703a aVar = cVar.f30439a;
            StringBuilder h = C0072d.m201h("UpgradePrompt.shown.");
            h.append(hVar.getClass().getSimpleName());
            aVar.mo45474a(h.toString());
            this.this$0.f23531u.onNext(new C9905g0.C9907b(hVar));
        }
    }
}
