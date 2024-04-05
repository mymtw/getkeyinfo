package p334da;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11393c0;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p456ua.C13461f;
import p740eq.C19011a;

/* renamed from: da.b */
public final class C12631b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f27856a;

    /* renamed from: b */
    public final C19011a f27857b;

    /* renamed from: c */
    public final C19011a f27858c;

    /* renamed from: d */
    public final C19011a f27859d;

    public /* synthetic */ C12631b(C19011a aVar, C19011a aVar2, C17555d dVar, int i) {
        this.f27856a = i;
        this.f27857b = aVar;
        this.f27858c = aVar2;
        this.f27859d = dVar;
    }

    public final Object get() {
        switch (this.f27856a) {
            case 0:
                return new C12630a((AnalyticsLogDatabaseHelper) this.f27857b.get(), (CrashUtil) this.f27858c.get(), (C8618c) this.f27859d.get());
            default:
                return new AddressDetailViewModel((C13461f) this.f27857b.get(), (C11393c0) this.f27858c.get(), (C12703a) this.f27859d.get());
        }
    }
}
