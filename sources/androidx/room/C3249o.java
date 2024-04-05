package androidx.room;

import com.etsy.android.vespa.VespaBaseFragment;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalAddressBookInfoView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView;
import java.util.Collections;

/* renamed from: androidx.room.o */
public final /* synthetic */ class C3249o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7563b;

    /* renamed from: c */
    public final /* synthetic */ Object f7564c;

    public /* synthetic */ C3249o(Object obj, int i) {
        this.f7563b = i;
        this.f7564c = obj;
    }

    public final void run() {
        switch (this.f7563b) {
            case 0:
                ((C3255u) this.f7564c).getClass();
                Collections.emptyList();
                throw null;
            case 1:
                ((VespaBaseFragment) this.f7564c).lambda$startEndless$0();
                return;
            case 2:
                PayPalAddressBookInfoView.m35159finishingAnimation$lambda7((PayPalAddressBookInfoView) this.f7564c);
                return;
            default:
                PayPalSnappingRecyclerView.m35368setUpCarousel$lambda29$lambda28$lambda27((PayPalSnappingRecyclerView) this.f7564c);
                return;
        }
    }
}
