package dagger.android.support;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.C0761x;
import dagger.android.C17550a;
import dagger.android.DispatchingAndroidInjector;
import p643op.C18335a;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements C18335a {
    public DispatchingAndroidInjector<Object> androidInjector;

    public DaggerAppCompatActivity() {
    }

    public C17550a<Object> androidInjector() {
        return this.androidInjector;
    }

    public void onCreate(Bundle bundle) {
        C0761x.m1730j0(this);
        super.onCreate(bundle);
    }

    public DaggerAppCompatActivity(int i) {
        super(i);
    }
}
