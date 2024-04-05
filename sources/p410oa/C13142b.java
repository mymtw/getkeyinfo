package p410oa;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: oa.b */
public final class C13142b implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Context f28906b;

    public C13142b(Context context) {
        this.f28906b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", "com.google.android.gms", (String) null));
        this.f28906b.startActivity(intent);
    }
}
