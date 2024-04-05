package p340ea;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.CrashUtil;
import kotlin.C19394m;
import p145io.reactivex.functions.Consumer;

/* renamed from: ea.i */
public final /* synthetic */ class C12668i implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f27936b;

    public /* synthetic */ C12668i(int i) {
        this.f27936b = i;
    }

    public final void accept(Object obj) {
        switch (this.f27936b) {
            case 0:
                C19394m mVar = (C19394m) obj;
                return;
            default:
                Throwable th = (Throwable) obj;
                C8694h.f19097a.error(th);
                CrashUtil.m17307a().mo30457b(th);
                return;
        }
    }
}
