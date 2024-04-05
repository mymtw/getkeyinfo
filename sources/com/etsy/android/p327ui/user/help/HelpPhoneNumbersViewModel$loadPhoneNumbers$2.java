package com.etsy.android.p327ui.user.help;

import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.help.HelpPhoneNumbersViewModel$loadPhoneNumbers$2 */
final class HelpPhoneNumbersViewModel$loadPhoneNumbers$2 extends Lambda implements C19857l<List<? extends PhoneRegion>, C19394m> {
    public final /* synthetic */ C11530c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HelpPhoneNumbersViewModel$loadPhoneNumbers$2(C11530c cVar) {
        super(1);
        this.this$0 = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PhoneRegion>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<PhoneRegion> list) {
        this.this$0.f25436e.postValue(list);
    }
}
