package p402n9;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.jvm.internal.C19383o;
import p287xp.C8333a;

/* renamed from: n9.b */
public final /* synthetic */ class C13082b implements C8333a {

    /* renamed from: a */
    public final /* synthetic */ String f28760a;

    public /* synthetic */ C13082b(String str) {
        this.f28760a = str;
    }

    public final void run() {
        String str = this.f28760a;
        C19383o.m32797g(str, "$token");
        C8694h a = LogCatKt.m17045a();
        a.mo21310e("Braze: Notifying new token: " + str);
    }
}
