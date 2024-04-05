package p340ea;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.p327ui.cart.viewholders.C9409w;
import com.google.android.play.core.assetpacks.C15588c1;
import com.jakewharton.rxbinding2.widget.C17029p;
import p145io.reactivex.functions.Consumer;

/* renamed from: ea.g */
public final /* synthetic */ class C12666g implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f27932b;

    public /* synthetic */ C12666g(int i) {
        this.f27932b = i;
    }

    public final void accept(Object obj) {
        switch (this.f27932b) {
            case 0:
                Throwable th = (Throwable) obj;
                RuntimeException runtimeException = new RuntimeException("Error inserting InfoLog into Db");
                if (C0326j.m869n(BuildTarget.Companion)) {
                    throw runtimeException;
                }
                return;
            default:
                C17029p pVar = (C17029p) obj;
                int i = C9409w.f20866g;
                if (pVar.actionId() != 0) {
                    pVar.view().clearFocus();
                    C15588c1.m25340p0(pVar.view());
                    return;
                }
                return;
        }
    }
}
