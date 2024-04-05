package com.etsy.android.p327ui.cart;

import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.ReceiptReviewV3;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.UserCounters;
import com.etsy.android.p327ui.cart.C9265c;
import com.etsy.android.p327ui.cart.saved.C9343d;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.shop.C11135c1;
import com.etsy.android.uikit.util.C11908l;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p287xp.C8339g;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.b */
public final /* synthetic */ class C9243b implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f20416b;

    public /* synthetic */ C9243b(int i) {
        this.f20416b = i;
    }

    public final Object apply(Object obj) {
        Object obj2 = null;
        switch (this.f20416b) {
            case 0:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, "it");
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var != null) {
                    obj2 = MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), UserCounters.class);
                }
                return new C9265c.C9267b((UserCounters) obj2);
            case 1:
                C19383o.m32797g((Throwable) obj, "throwable");
                return new C9343d.C9345b.C9346a();
            case 2:
                ConversationResponse conversationResponse = (ConversationResponse) obj;
                C19383o.m32797g(conversationResponse, "it");
                return conversationResponse.f21173b;
            case 3:
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                if (!vVar2.mo74384a()) {
                    return C11135c1.C11136a.f24628a;
                }
                C19928a0 a0Var2 = (C19928a0) vVar2.f44615b;
                if (a0Var2 != null) {
                    obj2 = MoshiModelFactory.createFromByteArray(a0Var2.mo72841a(), ReceiptReviewV3.class);
                }
                C19383o.m32794d(obj2);
                ReceiptReviewV3 receiptReviewV3 = (ReceiptReviewV3) obj2;
                List<ReceiptReview> reviews = receiptReviewV3.getReviews();
                C19383o.m32796f(reviews, "result.reviews");
                return new C11135c1.C11137b(receiptReviewV3.getCount(), reviews);
            default:
                C20145v vVar3 = (C20145v) obj;
                C19383o.m32797g(vVar3, ResponseConstants.RESPONSE);
                return vVar3.mo74384a() ? C11908l.C11910b.f26470b : C11908l.C11909a.f26469b;
        }
    }
}
