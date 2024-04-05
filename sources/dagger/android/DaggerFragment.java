package dagger.android;

import android.app.Fragment;
import android.content.Context;
import androidx.compose.foundation.layout.C0761x;
import p643op.C18335a;

@Deprecated
public abstract class DaggerFragment extends Fragment implements C18335a {
    public DispatchingAndroidInjector<Object> androidInjector;

    public C17550a<Object> androidInjector() {
        return this.androidInjector;
    }

    public void onAttach(Context context) {
        C0761x.m1731k0(this);
        super.onAttach(context);
    }
}
