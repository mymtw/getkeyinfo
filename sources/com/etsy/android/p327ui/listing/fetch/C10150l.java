package com.etsy.android.p327ui.listing.fetch;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.etsy.android.search.C8971c;
import com.etsy.android.util.AppLifecycleObserver;
import com.etsy.android.util.C12062s;
import dagger.internal.C17555d;
import p340ea.C12673n;
import p346fa.C12703a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.fetch.l */
public final class C10150l implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22326a;

    /* renamed from: b */
    public final C19011a f22327b;

    /* renamed from: c */
    public final C19011a f22328c;

    /* renamed from: d */
    public final C19011a f22329d;

    /* renamed from: e */
    public final C19011a f22330e;

    /* renamed from: f */
    public final C19011a f22331f;

    public /* synthetic */ C10150l(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, int i) {
        this.f22326a = i;
        this.f22327b = aVar;
        this.f22328c = aVar2;
        this.f22329d = aVar3;
        this.f22330e = aVar4;
        this.f22331f = aVar5;
    }

    public final Object get() {
        switch (this.f22326a) {
            case 0:
                return new C10149k((C12673n) this.f22327b.get(), (C8694h) this.f22328c.get(), (Connectivity) this.f22329d.get(), (C12703a) this.f22330e.get(), (C8618c) this.f22331f.get());
            default:
                return new AppLifecycleObserver((C8694h) this.f22327b.get(), (NotificationSettings) this.f22328c.get(), (Connectivity) this.f22329d.get(), (C8971c) this.f22330e.get(), (C12062s) this.f22331f.get());
        }
    }
}
