package com.etsy.android.p327ui.cart.viewholders;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.MessageToSeller;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.google.android.gms.common.api.Api;
import com.jakewharton.rxbinding2.widget.C17030q;
import com.jakewharton.rxbinding2.widget.C17033s;
import java.util.concurrent.TimeUnit;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19146a0;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p269vp.C8221a;
import p340ea.C12665f;
import p340ea.C12666g;
import p553do.C17700a;

/* renamed from: com.etsy.android.ui.cart.viewholders.w */
public final class C9409w extends C9370c {

    /* renamed from: g */
    public static final /* synthetic */ int f20866g = 0;

    /* renamed from: c */
    public final EditText f20867c;

    /* renamed from: d */
    public final C9282g f20868d;

    /* renamed from: e */
    public final ObservableObserveOn f20869e;

    /* renamed from: f */
    public LambdaObserver f20870f;

    public C9409w(ViewGroup viewGroup, C9282g gVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_msco_msg_to_seller, viewGroup, false));
        this.f20868d = gVar;
        EditText editText = (EditText) mo38986f(R.id.txt_message);
        this.f20867c = editText;
        editText.setHorizontallyScrolling(false);
        editText.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f20869e = new C19146a0(new C17033s(editText)).mo20633c(TimeUnit.MILLISECONDS).mo20635e(C8221a.m16513a());
        C17700a.C17701a aVar = C17700a.f38506a;
        new C17030q(editText).mo20635e(C8221a.m16513a()).mo20636f(new C12666g(1), new C9404r(), Functions.f28539c, Functions.f28540d);
    }

    /* renamed from: g */
    public final void mo31413g(CartGroupItem cartGroupItem) {
        LambdaObserver lambdaObserver = this.f20870f;
        if (lambdaObserver != null) {
            lambdaObserver.dispose();
        }
        MessageToSeller messageToSeller = (MessageToSeller) cartGroupItem.getData();
        String message = messageToSeller.getMessage();
        this.f20867c.setHint(messageToSeller.getHint());
        this.f20867c.setText(message);
        this.f20870f = (LambdaObserver) this.f20869e.mo20636f(new C9408v(this, cartGroupItem, 0), new C12665f(1), Functions.f28539c, Functions.f28540d);
    }
}
