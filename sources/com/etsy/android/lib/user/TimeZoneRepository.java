package com.etsy.android.lib.user;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.requests.apiv3.timezone.TimeZoneEndpoint;
import com.etsy.android.lib.requests.apiv3.timezone.TimeZoneUpdateRequest;
import java.util.TimeZone;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;

public final class TimeZoneRepository {

    /* renamed from: a */
    public final TimeZoneEndpoint f19572a;

    /* renamed from: b */
    public final C13461f f19573b;

    /* renamed from: c */
    public final C8694h f19574c;

    /* renamed from: d */
    public final C8618c f19575d;

    public TimeZoneRepository(TimeZoneEndpoint timeZoneEndpoint, C13461f fVar, C8694h hVar, C8618c cVar) {
        C19383o.m32797g(timeZoneEndpoint, "timeZoneEndpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(cVar, "configMap");
        this.f19572a = timeZoneEndpoint;
        this.f19573b = fVar;
        this.f19574c = hVar;
        this.f19575d = cVar;
    }

    /* renamed from: a */
    public final void mo30428a() {
        if (this.f19575d.mo21132b(C8592b.f18732F0)) {
            TimeZoneEndpoint timeZoneEndpoint = this.f19572a;
            String id = TimeZone.getDefault().getID();
            C19383o.m32796f(id, "getDefault().id");
            SingleSubscribeOn f = C0072d.m199f(this.f19573b, timeZoneEndpoint.updateTimeZone(new TimeZoneUpdateRequest(id)));
            this.f19573b.getClass();
            SubscribersKt.m32500e(f.mo20657f(C13461f.m21235b()), new TimeZoneRepository$update$1(this.f19574c), new TimeZoneRepository$update$2(this));
        }
    }
}
