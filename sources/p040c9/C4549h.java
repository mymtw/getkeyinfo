package p040c9;

import android.content.Context;
import android.net.ConnectivityManager;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.qualtrics.C8950b;
import dagger.internal.C17555d;
import java.util.ArrayList;
import java.util.Arrays;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.h */
public final class C4549h implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10019a;

    /* renamed from: b */
    public final C4479c f10020b;

    /* renamed from: c */
    public final C19011a f10021c;

    public /* synthetic */ C4549h(C4479c cVar, C19011a aVar, int i) {
        this.f10019a = i;
        this.f10020b = cVar;
        this.f10021c = aVar;
    }

    public final Object get() {
        switch (this.f10019a) {
            case 0:
                this.f10020b.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f10021c.get()).getSystemService("connectivity");
                C17782b.m29841G(connectivityManager);
                return connectivityManager;
            default:
                this.f10020b.getClass();
                return new C8950b((C8618c) this.f10021c.get(), new ArrayList(Arrays.asList(new EtsyConfigKey[]{C8592b.C8606n.f18912d, C8592b.C8606n.f18913e})));
        }
    }
}
