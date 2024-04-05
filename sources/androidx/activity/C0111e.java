package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* renamed from: androidx.activity.e */
public final class C0111e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f160b;

    /* renamed from: c */
    public final /* synthetic */ IntentSender.SendIntentException f161c;

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity.C0094b f162d;

    public C0111e(ComponentActivity.C0094b bVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.f162d = bVar;
        this.f160b = i;
        this.f161c = sendIntentException;
    }

    public final void run() {
        this.f162d.mo1159a(this.f160b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f161c));
    }
}
