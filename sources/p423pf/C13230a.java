package p423pf;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.C8703p;
import kotlin.jvm.internal.C19383o;
import p415of.C13180i;
import p415of.C13182k;

/* renamed from: pf.a */
public final class C13230a extends C13236g {

    /* renamed from: e */
    public final C13180i f29079e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13230a(Fragment fragment, C8703p pVar, C13180i iVar, C13182k kVar) {
        super(fragment, pVar, kVar);
        C19383o.m32797g(pVar, "viewTracker");
        C19383o.m32797g(kVar, "actionDelegate");
        this.f29079e = iVar;
    }

    /* renamed from: f */
    public final void mo45934f(Integer num, String str, boolean z) {
        FragmentActivity requireActivity;
        C19383o.m32797g(str, "deepLinkUrl");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        Fragment a = mo45889a();
        if (!(a == null || (requireActivity = a.requireActivity()) == null)) {
            requireActivity.startActivity(intent);
        }
        if (z && num != null && num.intValue() != -1) {
            int intValue = num.intValue();
            C13180i iVar = this.f29079e;
            Integer valueOf = iVar != null ? Integer.valueOf(iVar.getItemCount()) : null;
            C19383o.m32794d(valueOf);
            if (intValue < valueOf.intValue()) {
                this.f29079e.mo31298b(num.intValue());
            }
        }
    }
}
