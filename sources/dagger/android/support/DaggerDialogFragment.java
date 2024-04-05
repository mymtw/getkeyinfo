package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import kotlin.jvm.internal.C19382n;
import p643op.C18335a;

public abstract class DaggerDialogFragment extends DialogFragment implements C18335a {
    public DispatchingAndroidInjector<Object> androidInjector;

    public C17550a<Object> androidInjector() {
        return this.androidInjector;
    }

    public void onAttach(Context context) {
        C19382n.m32755k0(this);
        super.onAttach(context);
    }
}
