package p306z8;

import androidx.preference.Preference;
import com.braze.C5416d;
import com.etsy.android.config.PrefsFragment;
import kotlin.jvm.internal.C19383o;
import p248tp.C8049b;
import p248tp.C8051d;

/* renamed from: z8.j */
public final /* synthetic */ class C8483j implements Preference.C3010d, C8051d {

    /* renamed from: b */
    public final /* synthetic */ Object f18510b;

    /* renamed from: c */
    public final /* synthetic */ Comparable f18511c;

    public /* synthetic */ C8483j(Comparable comparable, Object obj) {
        this.f18510b = obj;
        this.f18511c = comparable;
    }

    /* renamed from: d */
    public final void mo10586d(C8049b bVar) {
        C5416d dVar = (C5416d) this.f18510b;
        String str = (String) this.f18511c;
        C19383o.m32797g(dVar, "$braze");
        C19383o.m32797g(str, "$token");
        dVar.mo15490c(str);
        bVar.onComplete();
    }

    /* renamed from: g */
    public final boolean mo412g(Preference preference) {
        return PrefsFragment.m34858getUpdatesClearDataPref$lambda18$lambda17((PrefsFragment) this.f18510b, (Preference) this.f18511c, preference);
    }
}
