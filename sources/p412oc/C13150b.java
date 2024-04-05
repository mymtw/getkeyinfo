package p412oc;

import com.etsy.android.lib.network.oauth2.C8765o;
import com.etsy.android.lib.push.registration.C8839l;
import com.squareup.moshi.C17414y;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8071s;
import p397mc.C13047a;
import p412oc.C13151c;
import p425q9.C13265p;
import retrofit2.C20145v;

/* renamed from: oc.b */
public final class C13150b {

    /* renamed from: a */
    public final C13149a f28921a;

    /* renamed from: b */
    public final C13047a f28922b;

    /* renamed from: c */
    public final C17414y f28923c;

    /* renamed from: d */
    public C13265p f28924d;

    /* renamed from: e */
    public final ArrayList f28925e = new ArrayList();

    public C13150b(C13149a aVar, C13047a aVar2, C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.f28921a = aVar;
        this.f28922b = aVar2;
        this.f28923c = yVar;
    }

    /* renamed from: a */
    public final C8071s<C13151c> mo45858a() {
        if (!this.f28921a.mo45857a()) {
            return C8071s.m16251e(new C13151c.C13153b(EmptyList.INSTANCE));
        }
        if (!this.f28925e.isEmpty()) {
            return C8071s.m16251e(new C13151c.C13153b(this.f28925e));
        }
        C13047a aVar = this.f28922b;
        C13265p pVar = this.f28924d;
        if (pVar != null) {
            C8071s<C20145v<C19928a0>> a = aVar.mo45818a(pVar.mo45958c().getId());
            C8839l lVar = new C8839l(this, 1);
            a.getClass();
            return new C19211l(new C19208j(a, lVar), new C8765o(this, 2));
        }
        C19383o.m32805o("session");
        throw null;
    }
}
