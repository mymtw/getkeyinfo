package p724yo;

import com.paypal.android.platform.authsdk.BuildConfig;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.StringUtilsKt;
import kotlin.jvm.internal.C19383o;
import p716xo.C18835g;

/* renamed from: yo.a */
public final class C18897a implements ITracker {

    /* renamed from: a */
    public final C18835g f42075a;

    /* renamed from: b */
    public final ClientConfig f42076b;

    public C18897a(C18835g gVar, ClientConfig clientConfig) {
        C19383o.m32797g(gVar, "tracker");
        C19383o.m32797g(clientConfig, "config");
        this.f42075a = gVar;
        this.f42076b = clientConfig;
    }

    public final void onTrackEvent(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        if (trackingEvent instanceof TrackingEvent.Click) {
            TrackingEvent.Click click = (TrackingEvent.Click) trackingEvent;
            click.setTenant(this.f42076b.getTenant().name());
            click.setAuthSdkVersion(BuildConfig.VERSION_NAME);
            click.setAppName(ConstantsKt.THIRD_PARTY_APP_NAME);
            click.setDeviceId(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.DEVICE_ID));
            click.setAppGuid(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.APP_GUID));
        } else if (trackingEvent instanceof TrackingEvent.Error) {
            TrackingEvent.Error error = (TrackingEvent.Error) trackingEvent;
            error.setTenant(this.f42076b.getTenant().name());
            error.setAuthSdkVersion(BuildConfig.VERSION_NAME);
            error.setAppName(ConstantsKt.THIRD_PARTY_APP_NAME);
            error.setDeviceId(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.DEVICE_ID));
            error.setAppGuid(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.APP_GUID));
        } else if (trackingEvent instanceof TrackingEvent.Impression) {
            TrackingEvent.Impression impression = (TrackingEvent.Impression) trackingEvent;
            impression.setTenant(this.f42076b.getTenant().name());
            impression.setAuthSdkVersion(BuildConfig.VERSION_NAME);
            impression.setAppName(ConstantsKt.THIRD_PARTY_APP_NAME);
            impression.setDeviceId(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.DEVICE_ID));
            impression.setAppGuid(StringUtilsKt.toJsonDataId(this.f42076b.getRiskData(), EventsNameKt.APP_GUID));
        }
        this.f42075a.trackEvent(trackingEvent);
    }
}
