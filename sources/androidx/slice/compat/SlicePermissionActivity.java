package androidx.slice.compat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import p032c1.C4353a;

public class SlicePermissionActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private static final float MAX_LABEL_SIZE_PX = 500.0f;
    private static final String TAG = "SlicePermissionActivity";
    private String mCallingPkg;
    private AlertDialog mDialog;
    private String mProviderPkg;
    private Uri mUri;

    private CharSequence loadSafeLabel(PackageManager packageManager, ApplicationInfo applicationInfo) {
        String obj = Html.fromHtml(applicationInfo.loadLabel(packageManager).toString()).toString();
        int length = obj.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int codePointAt = obj.codePointAt(i);
            int type = Character.getType(codePointAt);
            if (type == 13 || type == 15 || type == 14) {
                obj = obj.substring(0, i);
            } else {
                if (type == 12) {
                    obj = obj.substring(0, i) + " " + obj.substring(Character.charCount(codePointAt) + i);
                }
                i += Character.charCount(codePointAt);
            }
        }
        String trim = obj.trim();
        if (trim.isEmpty()) {
            return applicationInfo.packageName;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(42.0f);
        return TextUtils.ellipsize(trim, textPaint, MAX_LABEL_SIZE_PX, TextUtils.TruncateAt.END);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            r5 = -1
            if (r6 != r5) goto L_0x0056
            java.lang.String r5 = r4.getPackageName()
            java.lang.String r6 = r4.mCallingPkg
            android.net.Uri r0 = r4.mUri
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = ""
            android.net.Uri$Builder r0 = r0.path(r1)
            android.net.Uri r0 = r0.build()
            android.content.ContentResolver r1 = r4.getContentResolver()
            e2.c$b r1 = p089e2.C6709c.m13100a(r1, r0)     // Catch:{ RemoteException -> 0x004e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "slice_uri"
            r2.putParcelable(r3, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "provider_pkg"
            r2.putString(r0, r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "pkg"
            r2.putString(r5, r6)     // Catch:{ all -> 0x0042 }
            android.content.ContentProviderClient r5 = r1.f14802b     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "grant_perms"
            java.lang.String r0 = "supports_versioned_parcelable"
            r5.call(r6, r0, r2)     // Catch:{ all -> 0x0042 }
            r1.close()     // Catch:{ RemoteException -> 0x004e }
            goto L_0x0056
        L_0x0042:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ RemoteException -> 0x004e }
        L_0x004d:
            throw r6     // Catch:{ RemoteException -> 0x004e }
        L_0x004e:
            r5 = move-exception
            java.lang.String r6 = "SliceProviderCompat"
            java.lang.String r0 = "Unable to get slice descendants"
            android.util.Log.e(r6, r0, r5)
        L_0x0056:
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.compat.SlicePermissionActivity.onClick(android.content.DialogInterface, int):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mUri = (Uri) getIntent().getParcelableExtra("slice_uri");
        this.mCallingPkg = getIntent().getStringExtra("pkg");
        this.mProviderPkg = getIntent().getStringExtra("provider_pkg");
        try {
            PackageManager packageManager = getPackageManager();
            String e = C4353a.m10043c().mo14297e(loadSafeLabel(packageManager, packageManager.getApplicationInfo(this.mCallingPkg, 0)).toString());
            String e2 = C4353a.m10043c().mo14297e(loadSafeLabel(packageManager, packageManager.getApplicationInfo(this.mProviderPkg, 0)).toString());
            AlertDialog k = new AlertDialog.C0133a(this).setTitle(getString(R.string.abc_slice_permission_title, new Object[]{e, e2})).mo1239j().setNegativeButton(R.string.abc_slice_permission_deny, this).setPositiveButton(R.string.abc_slice_permission_allow, this).mo1234f(this).mo1240k();
            this.mDialog = k;
            ((TextView) k.getWindow().getDecorView().findViewById(R.id.text1)).setText(getString(R.string.abc_slice_permission_text_1, new Object[]{e2}));
            ((TextView) this.mDialog.getWindow().getDecorView().findViewById(R.id.text2)).setText(getString(R.string.abc_slice_permission_text_2, new Object[]{e2}));
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e(TAG, "Couldn't find package", e3);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.mDialog;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.mDialog.cancel();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
