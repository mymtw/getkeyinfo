package p320cb;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7077r;
import p145io.branch.referral.Defines$IntentKeys;
import p350fe.C12736j;

/* renamed from: cb.b */
public final class C8565b implements C8566c {

    /* renamed from: e */
    public static boolean f18649e = false;

    /* renamed from: f */
    public static String f18650f = "";

    /* renamed from: g */
    public static final String f18651g;

    /* renamed from: a */
    public final C12736j f18652a;

    /* renamed from: b */
    public final C8694h f18653b;

    /* renamed from: c */
    public final C8672b f18654c;

    /* renamed from: d */
    public Branch.C7016e f18655d;

    static {
        String key = Defines$IntentKeys.ForceNewBranchSession.getKey();
        C19383o.m32796f(key, "ForceNewBranchSession.key");
        f18651g = key;
    }

    public C8565b(C12736j jVar, C8694h hVar, C8672b bVar) {
        C19383o.m32797g(jVar, "deepLinkRouter");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f18652a = jVar;
        this.f18653b = hVar;
        this.f18654c = bVar;
    }

    /* renamed from: a */
    public final void mo21084a(FragmentActivity fragmentActivity, Intent intent) {
        C19383o.m32797g(fragmentActivity, "activity");
        Branch j = Branch.m13575j();
        C7077r rVar = j.f15576b;
        if (rVar != null) {
            rVar.f15758b.putInt("bnc_timeout", 3000).apply();
        }
        C7077r rVar2 = j.f15576b;
        if (rVar2 != null) {
            rVar2.f15758b.putInt("bnc_retry_count", 1).apply();
        }
        String str = null;
        Uri data = intent != null ? intent.getData() : null;
        if (!f18649e) {
            Branch.C7020i iVar = new Branch.C7020i(fragmentActivity);
            Branch.C7016e eVar = this.f18655d;
            if (eVar == null) {
                eVar = new C8564a(this, new WeakReference(fragmentActivity), fragmentActivity);
            }
            iVar.f15603a = eVar;
            iVar.f15605c = intent != null ? intent.getData() : null;
            iVar.mo19217a();
            f18649e = true;
            if (data != null) {
                str = data.toString();
            }
            f18650f = str;
        } else if (data != null) {
            String str2 = f18651g;
            if (!intent.hasExtra(str2)) {
                intent.putExtra(str2, true);
            }
            boolean booleanExtra = intent.getBooleanExtra(str2, true);
            String uri = data.toString();
            C19383o.m32796f(uri, "uri.toString()");
            boolean z = !C19383o.m32792b(uri, f18650f);
            if ((!C19457k.m33020X0(uri)) && z) {
                f18650f = uri;
                if (booleanExtra) {
                    Branch.C7020i iVar2 = new Branch.C7020i(fragmentActivity);
                    Branch.C7016e eVar2 = this.f18655d;
                    if (eVar2 == null) {
                        eVar2 = new C8564a(this, new WeakReference(fragmentActivity), fragmentActivity);
                    }
                    iVar2.f15603a = eVar2;
                    iVar2.f15606d = true;
                    iVar2.mo19217a();
                }
            }
        }
    }
}
