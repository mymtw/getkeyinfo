package p040c9;

import com.etsy.android.BOEApplication;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.search.p330v2.C10973d;
import dagger.internal.C17555d;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.j */
public final class C4577j implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10070a;

    /* renamed from: b */
    public final C4479c f10071b;

    /* renamed from: c */
    public final C19011a f10072c;

    public /* synthetic */ C4577j(C4479c cVar, C19011a aVar, int i) {
        this.f10070a = i;
        this.f10071b = cVar;
        this.f10072c = aVar;
    }

    public final Object get() {
        switch (this.f10070a) {
            case 0:
                C4479c cVar = this.f10071b;
                BOEApplication bOEApplication = (BOEApplication) this.f10072c.get();
                cVar.getClass();
                C17782b.m29841G(bOEApplication);
                return bOEApplication;
            default:
                this.f10071b.getClass();
                return new C10973d((C8618c) this.f10072c.get());
        }
    }
}
