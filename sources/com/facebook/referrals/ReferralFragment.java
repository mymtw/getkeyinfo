package com.facebook.referrals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.CustomTabMainActivity;
import p365hg.C12850e;
import p365hg.C12869i0;
import p446sg.C13383a;
import p453tf.C13418j;

@Deprecated
public class ReferralFragment extends Fragment {
    public static final String TAG = "ReferralFragment";
    private C13383a referralClient;

    public void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        C13383a aVar = this.referralClient;
        aVar.getClass();
        boolean z = true;
        if (i == 1) {
            if (!(intent == null || (stringExtra = intent.getStringExtra(CustomTabMainActivity.EXTRA_URL)) == null)) {
                StringBuilder h = C0072d.m201h("fb");
                h.append(C13418j.m21107c());
                h.append("://authorize");
                if (stringExtra.startsWith(C12850e.m20503c(h.toString()))) {
                    Bundle J = C12869i0.m20554J(Uri.parse(stringExtra).getQuery());
                    if (aVar.f29312c != null) {
                        z = aVar.f29312c.equals(J.getString("state"));
                        aVar.f29312c = null;
                    }
                    if (z) {
                        intent.putExtras(J);
                    } else {
                        i2 = 0;
                        intent.putExtra(ResponseConstants.ERROR_MESSAGE, "The referral response was missing a valid challenge string.");
                    }
                }
            }
            if (aVar.f29310a.isAdded() && (activity = aVar.f29310a.getActivity()) != null) {
                activity.setResult(i2, intent);
                activity.finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.referralClient = new C13383a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r8 = this;
            super.onResume()
            sg.a r0 = r8.referralClient
            androidx.fragment.app.Fragment r1 = r0.f29310a
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            r2 = 0
            if (r1 == 0) goto L_0x00bc
            androidx.fragment.app.Fragment r1 = r0.f29310a
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            java.lang.String r3 = "android.permission.INTERNET"
            int r1 = r1.checkCallingOrSelfPermission(r3)
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = r0.f29311b
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = p365hg.C12850e.m20501a()
            r0.f29311b = r1
        L_0x0026:
            java.lang.String r1 = r0.f29311b
            r3 = 1
            if (r1 == 0) goto L_0x002d
            r1 = r3
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r1 != 0) goto L_0x0032
            goto L_0x00bc
        L_0x0032:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            int r4 = p365hg.C12869i0.f28368a
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            java.math.BigInteger r5 = new java.math.BigInteger
            r6 = 100
            r5.<init>(r6, r4)
            r4 = 32
            java.lang.String r4 = r5.toString(r4)
            java.lang.String r5 = "BigInteger(length * 5, r).toString(32)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r0.f29312c = r4
            java.lang.String r4 = "fb"
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            java.lang.String r5 = p453tf.C13418j.m21107c()
            r4.append(r5)
            java.lang.String r5 = "://authorize"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = p365hg.C12850e.m20503c(r4)
            java.lang.String r5 = "redirect_uri"
            r1.putString(r5, r4)
            java.lang.String r4 = p453tf.C13418j.m21107c()
            java.lang.String r5 = "app_id"
            r1.putString(r5, r4)
            java.lang.String r4 = r0.f29312c
            java.lang.String r5 = "state"
            r1.putString(r5, r4)
            boolean r4 = p453tf.C13418j.f29395o
            java.lang.String r5 = "share_referral"
            if (r4 == 0) goto L_0x008e
            android.net.Uri r4 = p365hg.C12847d.m20499a(r1, r5)
            com.facebook.login.CustomTabPrefetchHelper.mayLaunchUrl(r4)
        L_0x008e:
            android.content.Intent r4 = new android.content.Intent
            androidx.fragment.app.Fragment r6 = r0.f29310a
            androidx.fragment.app.FragmentActivity r6 = r6.getActivity()
            java.lang.Class<com.facebook.CustomTabMainActivity> r7 = com.facebook.CustomTabMainActivity.class
            r4.<init>(r6, r7)
            java.lang.String r6 = com.facebook.CustomTabMainActivity.EXTRA_ACTION
            r4.putExtra(r6, r5)
            java.lang.String r5 = com.facebook.CustomTabMainActivity.EXTRA_PARAMS
            r4.putExtra(r5, r1)
            java.lang.String r1 = com.facebook.CustomTabMainActivity.EXTRA_CHROME_PACKAGE
            java.lang.String r5 = r0.f29311b
            if (r5 != 0) goto L_0x00b1
            java.lang.String r5 = p365hg.C12850e.m20501a()
            r0.f29311b = r5
        L_0x00b1:
            java.lang.String r5 = r0.f29311b
            r4.putExtra(r1, r5)
            androidx.fragment.app.Fragment r1 = r0.f29310a
            r1.startActivityForResult(r4, r3)
            goto L_0x00bd
        L_0x00bc:
            r3 = r2
        L_0x00bd:
            if (r3 != 0) goto L_0x00e1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "error_message"
            java.lang.String r4 = "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed"
            r1.putExtra(r3, r4)
            androidx.fragment.app.Fragment r3 = r0.f29310a
            boolean r3 = r3.isAdded()
            if (r3 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r0 = r0.f29310a
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x00e1
            r0.setResult(r2, r1)
            r0.finish()
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.referrals.ReferralFragment.onResume():void");
    }
}
