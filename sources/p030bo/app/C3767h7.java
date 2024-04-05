package p030bo.app;

import android.content.Context;
import com.braze.C5416d;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p248tp.C8049b;
import p248tp.C8051d;
import p605kk.C18121e;

/* renamed from: bo.app.h7 */
public final /* synthetic */ class C3767h7 implements C18121e, C8051d {

    /* renamed from: b */
    public final /* synthetic */ Object f8581b;

    /* renamed from: c */
    public final /* synthetic */ Object f8582c;

    public /* synthetic */ C3767h7(Object obj, Object obj2) {
        this.f8581b = obj;
        this.f8582c = obj2;
    }

    /* renamed from: d */
    public final void mo10586d(C8049b bVar) {
        C5416d dVar = (C5416d) this.f8581b;
        String str = (String) this.f8582c;
        C19383o.m32797g(dVar, "$braze");
        C19383o.m32797g(str, "$userId");
        dVar.mo15492e(str);
        bVar.onComplete();
    }

    public final void onSuccess(Object obj) {
        C3977n1.m9199a((Context) this.f8581b, (List) this.f8582c, (Void) obj);
    }
}
