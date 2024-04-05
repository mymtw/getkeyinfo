package p621mj;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: mj.g */
public final class C18240g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Context f39986b;

    /* renamed from: c */
    public final /* synthetic */ Intent f39987c;

    public C18240g(Context context, Intent intent) {
        this.f39986b = context;
        this.f39987c = intent;
    }

    public final void onClick(View view) {
        try {
            this.f39986b.startActivity(this.f39987c);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
