package p410oa;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: oa.a */
public final class C13141a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Activity f28905b;

    public C13141a(Activity activity) {
        this.f28905b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.f28905b;
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms")));
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gms")));
        }
    }
}
