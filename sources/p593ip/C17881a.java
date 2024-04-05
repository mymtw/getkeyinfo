package p593ip;

import android.content.DialogInterface;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;

/* renamed from: ip.a */
public final /* synthetic */ class C17881a implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ Feature[] f38836a;

    public /* synthetic */ C17881a(Feature[] featureArr) {
        this.f38836a = featureArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        PayPalProfileHeaderView.m35455setupFeatureFlagDebugClickListener$lambda5$lambda4$lambda3(this.f38836a, dialogInterface, i, z);
    }
}
