package p040c9;

import android.content.Context;
import android.content.res.Resources;
import com.etsy.android.BOEApplication;
import dagger.internal.C17555d;
import dagger.internal.C17556e;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.i */
public final class C4563i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10044a;

    /* renamed from: b */
    public final C4479c f10045b;

    /* renamed from: c */
    public final C19011a f10046c;

    public /* synthetic */ C4563i(C4479c cVar, C17556e eVar, int i) {
        this.f10044a = i;
        this.f10045b = cVar;
        this.f10046c = eVar;
    }

    public final Object get() {
        switch (this.f10044a) {
            case 0:
                this.f10045b.getClass();
                Context applicationContext = ((BOEApplication) this.f10046c.get()).getApplicationContext();
                C17782b.m29841G(applicationContext);
                return applicationContext;
            default:
                this.f10045b.getClass();
                Resources resources = ((BOEApplication) this.f10046c.get()).getResources();
                C17782b.m29841G(resources);
                return resources;
        }
    }
}
