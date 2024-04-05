package p410oa;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: oa.c */
public final class C13143c {
    /* renamed from: a */
    public static boolean m20810a(Context context) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        return (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 9 || !instance.isUserResolvableError(isGooglePlayServicesAvailable)) ? false : true;
    }

    /* renamed from: b */
    public static void m20811b(Activity activity) {
        DialogInterface.OnClickListener onClickListener;
        int i;
        if (m20810a(activity)) {
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(activity);
            AlertDialog.C0133a aVar = new AlertDialog.C0133a(activity);
            int i2 = R.string.get_google_play_services;
            int i3 = R.string.enable_google_play_services;
            if (isGooglePlayServicesAvailable == 2) {
                i2 = R.string.update_google_play_services;
                i = R.string.service_update_message;
                C13141a aVar2 = new C13141a(activity);
                i3 = R.string.update;
                onClickListener = aVar2;
            } else if (isGooglePlayServicesAvailable != 3) {
                i = R.string.service_missing_message;
                onClickListener = new C13141a(activity);
                i3 = R.string.get_google_play_services;
            } else {
                i = R.string.service_enable_message;
                onClickListener = new C13142b(activity);
                i2 = R.string.enable_google_play_services;
            }
            aVar.mo1238i(i2);
            aVar.mo1229b(i);
            aVar.setPositiveButton(i3, onClickListener);
            aVar.create().show();
        }
    }
}
