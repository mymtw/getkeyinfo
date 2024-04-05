package com.braze.p044ui.inappmessage.jsinterface;

import com.appboy.enums.Month;
import com.braze.BrazeUser;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$2 */
public final class InAppMessageUserJavascriptInterface$setDateOfBirth$2 extends Lambda implements C19857l<BrazeUser, C19394m> {
    public final /* synthetic */ int $day;
    public final /* synthetic */ Month $month;
    public final /* synthetic */ int $year;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface$setDateOfBirth$2(int i, Month month, int i2) {
        super(1);
        this.$year = i;
        this.$month = month;
        this.$day = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BrazeUser) obj);
        return C19394m.f43287a;
    }

    public final void invoke(BrazeUser brazeUser) {
        C19383o.m32797g(brazeUser, "it");
        brazeUser.mo15738n(this.$year, this.$month, this.$day);
    }
}
