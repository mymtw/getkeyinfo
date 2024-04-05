package p350fe;

import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.deeplinks.BranchParams;
import com.etsy.android.lib.logger.C8672b;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: fe.f */
public final class C12730f {

    /* renamed from: a */
    public final C8672b f28048a;

    /* renamed from: b */
    public final Uri f28049b;

    /* renamed from: c */
    public final String f28050c;

    /* renamed from: d */
    public final Bundle f28051d;

    /* renamed from: e */
    public final BranchParams f28052e;

    public C12730f(C8672b bVar, Uri uri, String str, Bundle bundle, BranchParams branchParams) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f28048a = bVar;
        this.f28049b = uri;
        this.f28050c = str;
        this.f28051d = bundle;
        this.f28052e = branchParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12730f)) {
            return false;
        }
        C12730f fVar = (C12730f) obj;
        return C19383o.m32792b(this.f28048a, fVar.f28048a) && C19383o.m32792b(this.f28049b, fVar.f28049b) && C19383o.m32792b(this.f28050c, fVar.f28050c) && C19383o.m32792b(this.f28051d, fVar.f28051d) && C19383o.m32792b(this.f28052e, fVar.f28052e);
    }

    public final int hashCode() {
        int hashCode = (this.f28051d.hashCode() + C0023f.m105e(this.f28050c, (this.f28049b.hashCode() + (this.f28048a.hashCode() * 31)) * 31, 31)) * 31;
        BranchParams branchParams = this.f28052e;
        return hashCode + (branchParams == null ? 0 : branchParams.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeepLinkHandlerDependencies(analyticsTracker=");
        h.append(this.f28048a);
        h.append(", uri=");
        h.append(this.f28049b);
        h.append(", referrerString=");
        h.append(this.f28050c);
        h.append(", referrerBundle=");
        h.append(this.f28051d);
        h.append(", branchParams=");
        h.append(this.f28052e);
        h.append(')');
        return h.toString();
    }
}
