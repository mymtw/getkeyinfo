package p403na;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.firebase.perf.metrics.Trace;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C19383o;
import p552dn.C17697b;
import p568fn.C17781a;

/* renamed from: na.a */
public final class C13099a extends FragmentManager.C2723k {

    /* renamed from: a */
    public final LinkedHashMap f28805a = new LinkedHashMap();

    /* renamed from: g */
    public final void mo10420g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        mo45826o(fragment.getClass().getSimpleName(), "onFragmentPreAttached");
    }

    /* renamed from: i */
    public final void mo10422i(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        Trace trace = (Trace) this.f28805a.remove(fragment.getClass().getSimpleName());
        if (trace != null) {
            trace.stop();
        }
    }

    /* renamed from: k */
    public final void mo10424k(FragmentManager fragmentManager, Fragment fragment) {
        C19383o.m32797g(fragmentManager, "fm");
        C19383o.m32797g(fragment, "f");
        mo45826o(fragment.getClass().getSimpleName(), "onFragmentStarted");
    }

    /* renamed from: o */
    public final void mo45826o(String str, String str2) {
        if (!this.f28805a.containsKey(str)) {
            LinkedHashMap linkedHashMap = this.f28805a;
            C17781a aVar = C17697b.f38492g;
            Trace create = Trace.create(str + '_' + str2);
            create.start();
            linkedHashMap.put(str, create);
        }
    }
}
