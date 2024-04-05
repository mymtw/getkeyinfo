package p402n9;

import com.etsy.android.lib.logger.C8694h;
import p145io.reactivex.functions.Consumer;

/* renamed from: n9.k */
public final /* synthetic */ class C13091k implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28778b;

    /* renamed from: c */
    public final /* synthetic */ C8694h f28779c;

    public /* synthetic */ C13091k(C8694h hVar, int i) {
        this.f28778b = i;
        this.f28779c = hVar;
    }

    public final void accept(Object obj) {
        switch (this.f28778b) {
        }
        this.f28779c.error((Throwable) obj);
    }
}
