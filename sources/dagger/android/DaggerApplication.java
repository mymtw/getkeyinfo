package dagger.android;

import android.app.Application;
import com.google.errorprone.annotations.ForOverride;
import p643op.C18335a;

public abstract class DaggerApplication extends Application implements C18335a {
    public volatile DispatchingAndroidInjector<Object> androidInjector;

    private void injectIfNecessary() {
        if (this.androidInjector == null) {
            synchronized (this) {
                if (this.androidInjector == null) {
                    applicationInjector().mo1133h(this);
                    if (this.androidInjector == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    public C17550a<Object> androidInjector() {
        injectIfNecessary();
        return this.androidInjector;
    }

    @ForOverride
    public abstract C17550a<? extends DaggerApplication> applicationInjector();

    public void onCreate() {
        super.onCreate();
        injectIfNecessary();
    }
}
