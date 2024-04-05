package p028b9;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.C8694h;
import p145io.reactivex.functions.Consumer;

/* renamed from: b9.b */
public final /* synthetic */ class C3506b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f8120b;

    public /* synthetic */ C3506b(int i) {
        this.f8120b = i;
    }

    public final void accept(Object obj) {
        switch (this.f8120b) {
            case 0:
                Throwable th = (Throwable) obj;
                C8694h.f19097a.mo21306a("Error clearing user data");
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                RuntimeException runtimeException = new RuntimeException("Error inserting ErrorLog into Db");
                if (C0326j.m869n(BuildTarget.Companion)) {
                    throw runtimeException;
                }
                return;
            default:
                Throwable th3 = (Throwable) obj;
                if (C0326j.m869n(BuildTarget.Companion)) {
                    if (th3 == null) {
                        th3 = new RuntimeException("throwable was null");
                    }
                    throw th3;
                }
                return;
        }
    }
}
