package dagger.android.support;

import android.content.Context;
import androidx.appcompat.app.AppCompatDialogFragment;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import kotlin.jvm.internal.C19382n;
import p643op.C18335a;

public abstract class DaggerAppCompatDialogFragment extends AppCompatDialogFragment implements C18335a {
    public DispatchingAndroidInjector<Object> androidInjector;

    public C17550a<Object> androidInjector() {
        return this.androidInjector;
    }

    public void onAttach(Context context) {
        C19382n.m32755k0(this);
        super.onAttach(context);
    }
}
