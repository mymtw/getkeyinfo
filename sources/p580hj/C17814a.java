package p580hj;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import p564fj.C17737a;

/* renamed from: hj.a */
public final class C17814a extends GoogleApi<GoogleSignInOptions> {
    @VisibleForTesting

    /* renamed from: a */
    public static int f38722a = 1;

    /* 'enum' modifier removed */
    @VisibleForTesting
    /* renamed from: hj.a$a */
    public static final class C17815a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38723a = {1, 2, 3, 4};
    }

    public C17814a(FragmentActivity fragmentActivity, GoogleSignInOptions googleSignInOptions) {
        super((Activity) fragmentActivity, C17737a.f38568a, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* renamed from: a */
    public final synchronized int mo69050a() {
        if (f38722a == 1) {
            Context applicationContext = getApplicationContext();
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0) {
                f38722a = 4;
            } else if (instance.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, (String) null) != null || DynamiteModule.m22900a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f38722a = 2;
            } else {
                f38722a = 3;
            }
        }
        return f38722a;
    }
}
