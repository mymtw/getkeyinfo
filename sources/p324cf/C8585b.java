package p324cf;

import android.content.Context;
import android.support.p013v4.media.C0069a;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.review.C11701a0;
import java.io.File;
import kotlin.jvm.internal.C19383o;
import p561eo.C17729b;

/* renamed from: cf.b */
public final class C8585b {

    /* renamed from: a */
    public final Context f18681a;

    /* renamed from: b */
    public final C11701a0 f18682b;

    /* renamed from: c */
    public final C17729b f18683c;

    /* renamed from: d */
    public final String f18684d = C0069a.m174e("randomUUID().toString()");

    /* renamed from: e */
    public File f18685e;

    public C8585b(Context context, C11701a0 a0Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.f18681a = context;
        this.f18682b = a0Var;
        this.f18683c = new C17729b(context);
    }
}
