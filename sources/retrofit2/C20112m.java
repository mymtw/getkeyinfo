package retrofit2;

import androidx.compose.foundation.layout.C0761x;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;

/* renamed from: retrofit2.m */
public final class C20112m implements C20092d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19747k f44499b;

    public C20112m(C19753l lVar) {
        this.f44499b = lVar;
    }

    /* renamed from: j */
    public final void mo1135j(C20089b<Object> bVar, Throwable th) {
        C19383o.m32798h(bVar, "call");
        C19383o.m32798h(th, Constants.APPBOY_PUSH_TITLE_KEY);
        this.f44499b.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
    }

    /* renamed from: m */
    public final void mo1137m(C20089b<Object> bVar, C20145v<Object> vVar) {
        C19383o.m32798h(bVar, "call");
        C19383o.m32798h(vVar, ResponseConstants.RESPONSE);
        this.f44499b.resumeWith(Result.m35480constructorimpl(vVar));
    }
}
