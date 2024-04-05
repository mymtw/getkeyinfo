package p320cb;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p145io.branch.referral.Branch;
import p145io.branch.referral.C7032d;

/* renamed from: cb.a */
public final /* synthetic */ class C8564a implements Branch.C7016e {

    /* renamed from: b */
    public final /* synthetic */ C8565b f18646b;

    /* renamed from: c */
    public final /* synthetic */ WeakReference f18647c;

    /* renamed from: d */
    public final /* synthetic */ FragmentActivity f18648d;

    public /* synthetic */ C8564a(C8565b bVar, WeakReference weakReference, FragmentActivity fragmentActivity) {
        this.f18646b = bVar;
        this.f18647c = weakReference;
        this.f18648d = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo19214a(JSONObject jSONObject, C7032d dVar) {
        FragmentActivity fragmentActivity;
        C8565b bVar = this.f18646b;
        WeakReference weakReference = this.f18647c;
        FragmentActivity fragmentActivity2 = this.f18648d;
        C19383o.m32797g(bVar, "this$0");
        C19383o.m32797g(weakReference, "$activityRef");
        C19383o.m32797g(fragmentActivity2, "$activity");
        if (dVar != null) {
            bVar.f18653b.mo21306a(dVar.f15642a);
            return;
        }
        boolean z = true;
        if (jSONObject == null || !jSONObject.optBoolean("+clicked_branch_link")) {
            z = false;
        }
        if (z && jSONObject.optString("~referring_link") != null && (fragmentActivity = (FragmentActivity) weakReference.get()) != null) {
            bVar.f18652a.mo45504b(jSONObject, fragmentActivity, fragmentActivity2.getIntent(), bVar.f18654c);
        }
    }
}
