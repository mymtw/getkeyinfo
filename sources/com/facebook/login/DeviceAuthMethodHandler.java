package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C12287a();

    /* renamed from: b */
    public static ScheduledThreadPoolExecutor f27408b;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    public static class C12287a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getNameForLogging() {
        return "device_auth";
    }

    public final int tryAuthorize(LoginClient.Request request) {
        FragmentActivity activity = getLoginClient().getActivity();
        if (activity == null || activity.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(activity.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.startLogin(request);
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
