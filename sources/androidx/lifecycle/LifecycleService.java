package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

public class LifecycleService extends Service implements C2887s {
    private final C2863h0 mDispatcher = new C2863h0(this);

    public Lifecycle getLifecycle() {
        return this.mDispatcher.f6500a;
    }

    public IBinder onBind(Intent intent) {
        C2863h0 h0Var = this.mDispatcher;
        h0Var.getClass();
        h0Var.mo10819a(Lifecycle.Event.ON_START);
        return null;
    }

    public void onCreate() {
        C2863h0 h0Var = this.mDispatcher;
        h0Var.getClass();
        h0Var.mo10819a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C2863h0 h0Var = this.mDispatcher;
        h0Var.getClass();
        h0Var.mo10819a(Lifecycle.Event.ON_STOP);
        h0Var.mo10819a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        C2863h0 h0Var = this.mDispatcher;
        h0Var.getClass();
        h0Var.mo10819a(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
