package p546cp;

import android.view.MotionEvent;
import android.view.View;
import com.paypal.pyplcheckout.billingagreements.view.fragment.PYPLBillingAgreementsTermsFragment$addBottomSheetCallbacks$1;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment$homeBottomSheetCallback$1;

/* renamed from: cp.a */
public final /* synthetic */ class C17549a implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ int f38383b;

    public /* synthetic */ C17549a(int i) {
        this.f38383b = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f38383b) {
            case 0:
                return PYPLBillingAgreementsTermsFragment$addBottomSheetCallbacks$1.m35235onSlide$lambda0(view, motionEvent);
            default:
                return HomeFragment$homeBottomSheetCallback$1.m35416onSlide$lambda0(view, motionEvent);
        }
    }
}
