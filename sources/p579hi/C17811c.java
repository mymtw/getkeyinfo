package p579hi;

import com.google.android.exoplayer2.offline.DownloadService;
import com.paypal.checkout.paymentbutton.PaymentButton;
import p726zi.C18917l;

/* renamed from: hi.c */
public final /* synthetic */ class C17811c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f38718b;

    /* renamed from: c */
    public final /* synthetic */ Object f38719c;

    public /* synthetic */ C17811c(Object obj, int i) {
        this.f38718b = i;
        this.f38719c = obj;
    }

    public final void run() {
        switch (this.f38718b) {
            case 0:
                ((DownloadService.C14283b) this.f38719c).mo47595a();
                return;
            case 1:
                ((C18917l) this.f38719c).f42152m.start();
                return;
            default:
                PaymentButton.m35148initClickListener$lambda7$lambda6((PaymentButton) this.f38719c);
                return;
        }
    }
}
