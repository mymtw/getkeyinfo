package p463v9;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.C8694h;
import p145io.reactivex.functions.Consumer;

/* renamed from: v9.a */
public final /* synthetic */ class C13536a implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f29602b;

    public /* synthetic */ C13536a(int i) {
        this.f29602b = i;
    }

    public final void accept(Object obj) {
        switch (this.f29602b) {
            case 0:
                Throwable th = (Throwable) obj;
                C8694h.f19097a.mo21306a("Error processing the queue");
                return;
            default:
                Throwable th2 = (Throwable) obj;
                RuntimeException runtimeException = new RuntimeException("Error inserting InfoLog into Db");
                if (C0326j.m869n(BuildTarget.Companion)) {
                    throw runtimeException;
                }
                return;
        }
    }
}
