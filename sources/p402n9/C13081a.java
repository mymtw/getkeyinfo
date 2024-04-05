package p402n9;

import com.braze.C5416d;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3767h7;
import p145io.reactivex.internal.operators.completable.CompletableCreate;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p287xp.C8339g;
import p306z8.C8483j;
import p456ua.C13461f;

/* renamed from: n9.a */
public final /* synthetic */ class C13081a implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28757b;

    /* renamed from: c */
    public final /* synthetic */ String f28758c;

    /* renamed from: d */
    public final /* synthetic */ Object f28759d;

    public /* synthetic */ C13081a(String str, int i, Object obj) {
        this.f28757b = i;
        this.f28759d = obj;
        this.f28758c = str;
    }

    public final Object apply(Object obj) {
        switch (this.f28757b) {
            case 0:
                C13084d dVar = (C13084d) this.f28759d;
                String str = this.f28758c;
                C5416d dVar2 = (C5416d) obj;
                C19383o.m32797g(dVar, "this$0");
                C19383o.m32797g(str, "$token");
                C19383o.m32797g(dVar2, "braze");
                CompletableCreate completableCreate = new CompletableCreate(new C8483j(str, dVar2));
                dVar.f28767e.getClass();
                return new CompletableSubscribeOn(completableCreate, C13461f.m21234a());
            default:
                C13097q qVar = (C13097q) this.f28759d;
                String str2 = this.f28758c;
                C5416d dVar3 = (C5416d) obj;
                C19383o.m32797g(qVar, "this$0");
                C19383o.m32797g(str2, "$userId");
                C19383o.m32797g(dVar3, "ab");
                CompletableCreate completableCreate2 = new CompletableCreate(new C3767h7(dVar3, str2));
                qVar.f28798e.getClass();
                return new CompletableSubscribeOn(completableCreate2, C13461f.m21234a());
        }
    }
}
