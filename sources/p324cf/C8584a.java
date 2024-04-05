package p324cf;

import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.user.review.C11745t;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p561eo.C17732e;
import p569fo.C17783a;

/* renamed from: cf.a */
public final class C8584a implements C17732e {

    /* renamed from: a */
    public final C2895z<C11745t> f18680a;

    public C8584a(C2895z<C11745t> zVar) {
        C19383o.m32797g(zVar, "mediaTransformationState");
        this.f18680a = zVar;
    }

    /* renamed from: a */
    public final void mo21090a(String str, Throwable th, List<C17783a> list) {
        C19383o.m32797g(str, "id");
        this.f18680a.postValue(new C11745t.C11748c(str, th, list));
    }

    /* renamed from: b */
    public final void mo21091b(String str, float f) {
        C19383o.m32797g(str, "id");
        this.f18680a.postValue(new C11745t.C11749d(str, f));
    }

    /* renamed from: c */
    public final void mo21092c(String str, List<C17783a> list) {
        C19383o.m32797g(str, "id");
        this.f18680a.postValue(new C11745t.C11747b(str, list));
    }

    /* renamed from: d */
    public final void mo21093d(String str, List<C17783a> list) {
        C19383o.m32797g(str, "id");
        this.f18680a.postValue(new C11745t.C11746a(str, list));
    }

    /* renamed from: e */
    public final void mo21094e(String str) {
        C19383o.m32797g(str, "id");
    }
}
