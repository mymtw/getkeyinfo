package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import p643op.C18335a;

public abstract class DaggerActivity extends Activity implements C18335a {
    public DispatchingAndroidInjector<Object> androidInjector;

    public C17550a<Object> androidInjector() {
        return this.androidInjector;
    }

    public void onCreate(Bundle bundle) {
        C0761x.m1730j0(this);
        super.onCreate(bundle);
    }
}
