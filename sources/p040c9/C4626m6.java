package p040c9;

import com.etsy.android.lib.logger.elk.uploading.C8682c;
import com.etsy.android.lib.logger.elk.uploading.ElkLogUploadWorker;
import dagger.android.C17550a;
import p340ea.C12677p;
import p456ua.C13461f;

/* renamed from: c9.m6 */
public final class C4626m6 implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10422b;

    public C4626m6(C4579j1 j1Var) {
        this.f10422b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        ElkLogUploadWorker elkLogUploadWorker = (ElkLogUploadWorker) obj;
        elkLogUploadWorker.f19067h = new C12677p(this.f10422b.f10131L0.get());
        elkLogUploadWorker.f19068i = new C8682c(this.f10422b.f10212b0.get(), this.f10422b.mo14404m(), this.f10422b.mo14403l(), this.f10422b.f10086C0.get(), this.f10422b.f10258i4.get(), new C13461f());
    }
}
