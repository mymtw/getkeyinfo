package p621mj;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: mj.b */
public interface C18235b {
    @KeepForSdk
    /* renamed from: a */
    void mo51361a(Activity activity, Bundle bundle, Bundle bundle2);

    @KeepForSdk
    /* renamed from: b */
    View mo51362b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @KeepForSdk
    void onCreate(Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onDestroyView();

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(Bundle bundle);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}
