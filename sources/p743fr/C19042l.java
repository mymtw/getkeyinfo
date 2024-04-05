package p743fr;

import androidx.compose.p015ui.text.input.C1993m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.internal.http2.ErrorCode;
import p737cr.C18982a;

/* renamed from: fr.l */
public final class C19042l extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19027d f42491e;

    /* renamed from: f */
    public final /* synthetic */ int f42492f;

    /* renamed from: g */
    public final /* synthetic */ ErrorCode f42493g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19042l(String str, C19027d dVar, int i, ErrorCode errorCode) {
        super(str, true);
        this.f42491e = dVar;
        this.f42492f = i;
        this.f42493g = errorCode;
    }

    /* renamed from: a */
    public final long mo70418a() {
        C1993m mVar = this.f42491e.f42436m;
        ErrorCode errorCode = this.f42493g;
        mVar.getClass();
        C19383o.m32797g(errorCode, "errorCode");
        synchronized (this.f42491e) {
            this.f42491e.f42424B.remove(Integer.valueOf(this.f42492f));
            C19394m mVar2 = C19394m.f43287a;
        }
        return -1;
    }
}
