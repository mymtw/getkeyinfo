package p402n9;

import com.braze.C5416d;
import com.etsy.android.lib.logger.LogCatKt;
import kotlin.C19394m;
import p145io.reactivex.functions.Consumer;

/* renamed from: n9.h */
public final /* synthetic */ class C13088h implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28773b;

    public /* synthetic */ C13088h(int i) {
        this.f28773b = i;
    }

    public final void accept(Object obj) {
        switch (this.f28773b) {
            case 0:
                C5416d dVar = (C5416d) obj;
                LogCatKt.m17045a().mo21310e("Braze: Initializing and Enabling");
                return;
            case 1:
                C19394m mVar = (C19394m) obj;
                return;
            default:
                LogCatKt.m17045a().mo21314h((Throwable) obj);
                return;
        }
    }
}
