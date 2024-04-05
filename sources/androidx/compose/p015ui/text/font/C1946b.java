package androidx.compose.p015ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;

/* renamed from: androidx.compose.ui.text.font.b */
public final class C1946b implements C1963q {

    /* renamed from: a */
    public final Context f4394a;

    public C1946b(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f4394a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final Typeface mo7527a(C1950f fVar) {
        Object obj;
        Typeface typeface = null;
        if (fVar instanceof C1945a) {
            C1945a aVar = (C1945a) fVar;
            C19383o.m32796f(this.f4394a, ResponseConstants.CONTEXT);
            throw null;
        } else if (!(fVar instanceof C1968t)) {
            return null;
        } else {
            int c = fVar.mo7526c();
            boolean z = false;
            if (c == 0) {
                Context context = this.f4394a;
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                return C1969u.f4427a.mo7587a(context, (C1968t) fVar);
            }
            if (c == 1) {
                try {
                    Context context2 = this.f4394a;
                    C19383o.m32796f(context2, ResponseConstants.CONTEXT);
                    obj = Result.m35480constructorimpl(C1969u.f4427a.mo7587a(context2, (C1968t) fVar));
                } catch (Throwable th) {
                    obj = Result.m35480constructorimpl(C0761x.m1673J(th));
                }
                if (!Result.m35485isFailureimpl(obj)) {
                    typeface = obj;
                }
                return typeface;
            }
            if (c == 2) {
                z = true;
            }
            if (z) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            StringBuilder h = C0072d.m201h("Unknown loading type ");
            h.append(C19382n.m32716J0(fVar.mo7526c()));
            throw new IllegalArgumentException(h.toString());
        }
    }

    /* renamed from: b */
    public final void mo7528b() {
    }

    /* renamed from: c */
    public final Object mo7529c(C1950f fVar, C19340c<? super Typeface> cVar) {
        if (fVar instanceof C1945a) {
            ((C1945a) fVar).getClass();
            C19383o.m32796f(this.f4394a, ResponseConstants.CONTEXT);
            throw null;
        } else if (fVar instanceof C1968t) {
            Context context = this.f4394a;
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            Object i = C19697g.m33471i(cVar, C19760n0.f43720b, new AndroidFontLoader_androidKt$loadAsync$2((C1968t) fVar, context, (C19340c<? super AndroidFontLoader_androidKt$loadAsync$2>) null));
            return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : (Typeface) i;
        } else {
            throw new IllegalArgumentException("Unknown font type: " + fVar);
        }
    }
}
