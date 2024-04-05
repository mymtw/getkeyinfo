package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.support.p013v4.media.C0072d;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.p327ui.cart.C9326n;
import com.etsy.android.p327ui.cart.bottomsheets.applycoupon.C9260e;
import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p340ea.C12673n;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.ApplyCouponBottomSheetViewModel$applyCoupon$3 */
final class ApplyCouponBottomSheetViewModel$applyCoupon$3 extends Lambda implements C19857l<C9326n, C19394m> {
    public final /* synthetic */ C9260e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApplyCouponBottomSheetViewModel$applyCoupon$3(C9260e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9326n) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9326n nVar) {
        Object obj;
        if (nVar instanceof C9326n.C9328b) {
            C9260e eVar = this.this$0;
            C19383o.m32796f(nVar, "result");
            C9326n.C9328b bVar = (C9326n.C9328b) nVar;
            eVar.getClass();
            if (bVar.f20599a.getInputError() == null) {
                C12060q.m19871b(eVar.f20458k, bVar.f20599a);
                return;
            }
            int inputErrorCode = bVar.f20599a.getInputErrorCode();
            String inputError = bVar.f20599a.getInputError();
            C2895z<C9260e.C9261a> zVar = eVar.f20454g;
            if (inputErrorCode == 515) {
                obj = new C9260e.C9261a.C9263b(eVar.f20460m);
            } else {
                if (inputError == null) {
                    inputError = "";
                }
                obj = new C9260e.C9261a.C9262a(inputError);
            }
            zVar.setValue(obj);
        } else if (nVar instanceof C9326n.C9327a) {
            C12673n nVar2 = this.this$0.f20451d;
            StringBuilder h = C0072d.m201h("Apply coupon failed with error: ");
            C9326n.C9327a aVar = (C9326n.C9327a) nVar;
            Throwable th = aVar.f20597a;
            h.append(th != null ? th.getMessage() : null);
            h.append(" and message: ");
            h.append(aVar.f20598b);
            nVar2.mo45449a(h.toString());
            C12060q.m19871b(this.this$0.f20456i, Integer.valueOf(R.string.whoops_somethings_wrong));
        }
    }
}
