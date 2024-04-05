package p423pf;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: pf.j */
public final class C13240j extends C13171a<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13240j(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
        C19383o.m32797g(pVar, "viewTracker");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r4 = r4.getActivity();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31328c(java.lang.String r4) {
        /*
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            androidx.fragment.app.Fragment r4 = r3.mo45889a()
            r1 = 0
            if (r4 == 0) goto L_0x0023
            androidx.fragment.app.FragmentActivity r4 = r4.getActivity()
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r4.getPackageName()
            goto L_0x0024
        L_0x0023:
            r4 = r1
        L_0x0024:
            java.lang.String r2 = "com.android.browser.application_id"
            r0.putExtra(r2, r4)
            androidx.fragment.app.Fragment r4 = r3.mo45889a()     // Catch:{ ActivityNotFoundException -> 0x0039 }
            if (r4 == 0) goto L_0x004a
            androidx.fragment.app.FragmentActivity r4 = r4.requireActivity()     // Catch:{ ActivityNotFoundException -> 0x0039 }
            if (r4 == 0) goto L_0x004a
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0039 }
            goto L_0x004a
        L_0x0039:
            r4 = move-exception
            ea.n r0 = p628nj.C18263b.f40052P
            if (r0 == 0) goto L_0x004b
            java.lang.String r4 = r4.getMessage()
            kotlin.jvm.internal.C19383o.m32794d(r4)
            java.lang.String r1 = "WebUrlClickHandler"
            r0.mo45450b(r1, r4)
        L_0x004a:
            return
        L_0x004b:
            java.lang.String r4 = "elkLogger"
            kotlin.jvm.internal.C19383o.m32805o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p423pf.C13240j.mo31328c(java.lang.String):void");
    }
}
