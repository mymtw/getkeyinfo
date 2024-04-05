package p410oa;

import android.content.Context;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.C19383o;

/* renamed from: oa.e */
public final class C13145e {

    /* renamed from: a */
    public final Context f28908a;

    /* renamed from: b */
    public final C8694h f28909b;

    /* renamed from: c */
    public final GoogleApiAvailability f28910c;

    public C13145e(Context context, C8694h hVar, GoogleApiAvailability googleApiAvailability) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(googleApiAvailability, "googleApiAvailability");
        this.f28908a = context;
        this.f28909b = hVar;
        this.f28910c = googleApiAvailability;
    }

    /* renamed from: a */
    public final boolean mo45856a() {
        int isGooglePlayServicesAvailable = this.f28910c.isGooglePlayServicesAvailable(this.f28908a);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (this.f28910c.isUserResolvableError(isGooglePlayServicesAvailable)) {
            C8694h hVar = this.f28909b;
            hVar.mo21312f("GCM messaging may become available from recoverable error: " + isGooglePlayServicesAvailable);
            return false;
        }
        this.f28909b.mo21312f("GCM messaging not available.");
        return false;
    }
}
