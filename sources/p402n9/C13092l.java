package p402n9;

import android.app.Application;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.C5416d;
import com.etsy.android.lib.config.C8618c;
import p145io.reactivex.subjects.C19254a;
import p248tp.C8061n;
import p425q9.C13265p;
import p456ua.C13461f;

/* renamed from: n9.l */
public final class C13092l {

    /* renamed from: a */
    public final Application f28780a;

    /* renamed from: b */
    public final BrazeActivityLifecycleCallbackListener f28781b;

    /* renamed from: c */
    public final C13265p f28782c;

    /* renamed from: d */
    public final C8618c f28783d;

    /* renamed from: e */
    public final C8061n<Boolean> f28784e;

    /* renamed from: f */
    public final C13461f f28785f;

    /* renamed from: g */
    public final String f28786g;

    /* renamed from: h */
    public final C19254a<C5416d> f28787h;

    public C13092l(Application application, BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, C13265p pVar, C8618c cVar, C8061n<Boolean> nVar, C13461f fVar, String str) {
        this.f28780a = application;
        this.f28781b = brazeActivityLifecycleCallbackListener;
        this.f28782c = pVar;
        this.f28783d = cVar;
        this.f28784e = nVar;
        this.f28785f = fVar;
        this.f28786g = str;
        C19254a<C5416d> aVar = new C19254a<>();
        this.f28787h = aVar;
        aVar.mo20637g(new C13085e(this, 0));
    }
}
