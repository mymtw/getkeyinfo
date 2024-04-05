package p040c9;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.dagger.C8649h;
import com.google.android.play.core.assetpacks.C15588c1;
import dagger.internal.C17555d;
import okhttp3.logging.HttpLoggingInterceptor;
import p568fn.C17782b;

/* renamed from: c9.lc */
public final class C4618lc implements C17555d<HttpLoggingInterceptor.Level> {

    /* renamed from: a */
    public final C15588c1 f10411a;

    public C4618lc(C15588c1 c1Var) {
        this.f10411a = c1Var;
    }

    public final Object get() {
        this.f10411a.getClass();
        HttpLoggingInterceptor.Level level = C0326j.m869n(BuildTarget.Companion) ? C8649h.f19011a : HttpLoggingInterceptor.Level.NONE;
        C17782b.m29841G(level);
        return level;
    }
}
