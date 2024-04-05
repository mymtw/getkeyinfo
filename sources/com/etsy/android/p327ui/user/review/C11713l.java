package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.apiv3.AppreciationVideoResponse;
import java.util.List;
import okhttp3.C19928a0;
import okhttp3.C20004s;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20189l;
import p771sr.C20192o;
import p771sr.C20194q;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.review.l */
public interface C11713l {
    @C20189l
    @C20192o("/etsyapps/v3/member/reviews")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo37975a(@C20194q C20004s.C20007c cVar, @C20194q C20004s.C20007c cVar2, @C20194q List<C20004s.C20007c> list, @C20194q C20004s.C20007c cVar3, @C20194q C20004s.C20007c cVar4, @C20194q C20004s.C20007c cVar5, @C20194q C20004s.C20007c cVar6, @C20194q C20004s.C20007c cVar7);

    @C20189l
    @C20192o("/etsyapps/v3/member/videos/appreciation-video")
    /* renamed from: b */
    C8071s<C20145v<AppreciationVideoResponse>> mo37976b(@C20194q C20004s.C20007c cVar, @C20194q C20004s.C20007c cVar2);

    @C20183f("/etsyapps/v3/bespoke/member/purchases/review-flow")
    /* renamed from: c */
    C8071s<ReviewFlow> mo37977c(@C20197t("transaction_id") String str);
}
