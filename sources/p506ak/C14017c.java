package p506ak;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.location.LocationServices;

/* renamed from: ak.c */
public final class C14017c extends GoogleApi<Api.ApiOptions.NoOptions> {
    public C14017c(Context context) {
        super(context, LocationServices.f33200a, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }
}
