package com.etsy.android.p327ui.user.circles;

import com.etsy.android.lib.models.apiv3.circles.CircledUserModel;
import java.util.List;
import kotlin.coroutines.C19340c;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.circles.b */
public interface C11507b {
    @C20183f("/etsyapps/v3/bespoke/public/users/{userId}/circles/connected-users")
    /* renamed from: a */
    Object mo37385a(@C20196s("userId") String str, @C20197t("limit") int i, @C20197t("offset") int i2, C19340c<? super C20145v<List<CircledUserModel>>> cVar);

    @C20183f("/etsyapps/v3/bespoke/public/users/{userId}/circles")
    /* renamed from: b */
    Object mo37386b(@C20196s("userId") String str, @C20197t("limit") int i, @C20197t("offset") int i2, C19340c<? super C20145v<List<CircledUserModel>>> cVar);
}
