package com.etsy.android.p327ui.user.circles;

import com.etsy.android.lib.models.apiv3.circles.CircledUserFavoriteListing;
import com.etsy.android.lib.models.apiv3.circles.CircledUserModel;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;

/* renamed from: com.etsy.android.ui.user.circles.CirclesRepository */
public final class CirclesRepository {

    /* renamed from: a */
    public final C11507b f25372a;

    /* renamed from: b */
    public final C13265p f25373b;

    /* renamed from: com.etsy.android.ui.user.circles.CirclesRepository$a */
    public static final class C11498a {
        /* renamed from: a */
        public static final C11506a m19289a(CircledUserModel circledUserModel) {
            String valueOf = String.valueOf(circledUserModel.getUserId());
            String loginName = circledUserModel.getLoginName();
            String formattedFullName = circledUserModel.formattedFullName();
            int followerCount = circledUserModel.getFollowerCount();
            String imageUrl = circledUserModel.getProfile().getImageUrl();
            List<CircledUserFavoriteListing> favoriteListings = circledUserModel.getFavoriteListings();
            ArrayList arrayList = new ArrayList();
            for (CircledUserFavoriteListing listing : favoriteListings) {
                ListingImage listingImage = (ListingImage) C19327t.m32640V0(listing.getListing().getImages());
                String url170x135 = listingImage != null ? listingImage.getUrl170x135() : null;
                if (url170x135 != null) {
                    arrayList.add(url170x135);
                }
            }
            return new C11506a(valueOf, loginName, formattedFullName, followerCount, imageUrl, arrayList);
        }
    }

    static {
        new C11498a();
    }

    public CirclesRepository(C11507b bVar, C13265p pVar) {
        C19383o.m32797g(bVar, "endpoint");
        C19383o.m32797g(pVar, "session");
        this.f25372a = bVar;
        this.f25373b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e6 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo37366a(com.etsy.android.p327ui.user.circles.C11512e r8, kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.user.circles.C11509d> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.etsy.android.p327ui.user.circles.CirclesRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.etsy.android.ui.user.circles.CirclesRepository$get$1 r0 = (com.etsy.android.p327ui.user.circles.CirclesRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.user.circles.CirclesRepository$get$1 r0 = new com.etsy.android.ui.user.circles.CirclesRepository$get$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r6) goto L_0x004e
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r8 = r0.L$0
            com.etsy.android.ui.user.circles.e r8 = (com.etsy.android.p327ui.user.circles.C11512e) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00da
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            java.lang.Object r8 = r0.L$0
            com.etsy.android.ui.user.circles.e r8 = (com.etsy.android.p327ui.user.circles.C11512e) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00bc
        L_0x0046:
            java.lang.Object r8 = r0.L$0
            com.etsy.android.ui.user.circles.e r8 = (com.etsy.android.p327ui.user.circles.C11512e) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x0128 }
            goto L_0x0099
        L_0x004e:
            java.lang.Object r8 = r0.L$0
            com.etsy.android.ui.user.circles.e r8 = (com.etsy.android.p327ui.user.circles.C11512e) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ Exception -> 0x0128 }
            goto L_0x007b
        L_0x0056:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            boolean r9 = r8 instanceof com.etsy.android.p327ui.user.circles.C11512e.C11515c     // Catch:{ Exception -> 0x0128 }
            r2 = 30
            if (r9 == 0) goto L_0x007e
            com.etsy.android.ui.user.circles.b r9 = r7.f25372a     // Catch:{ Exception -> 0x0128 }
            q9.p r3 = r7.f25373b     // Catch:{ Exception -> 0x0128 }
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r3.mo45958c()     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = r3.getId()     // Catch:{ Exception -> 0x0128 }
            r4 = r8
            com.etsy.android.ui.user.circles.e$c r4 = (com.etsy.android.p327ui.user.circles.C11512e.C11515c) r4     // Catch:{ Exception -> 0x0128 }
            int r4 = r4.f25401a     // Catch:{ Exception -> 0x0128 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0128 }
            r0.label = r6     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r9 = r9.mo37385a(r3, r2, r4, r0)     // Catch:{ Exception -> 0x0128 }
            if (r9 != r1) goto L_0x007b
            return r1
        L_0x007b:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x0128 }
            goto L_0x00dc
        L_0x007e:
            boolean r9 = r8 instanceof com.etsy.android.p327ui.user.circles.C11512e.C11516d     // Catch:{ Exception -> 0x0128 }
            if (r9 == 0) goto L_0x009c
            com.etsy.android.ui.user.circles.b r9 = r7.f25372a     // Catch:{ Exception -> 0x0128 }
            r3 = r8
            com.etsy.android.ui.user.circles.e$d r3 = (com.etsy.android.p327ui.user.circles.C11512e.C11516d) r3     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = r3.f25402a     // Catch:{ Exception -> 0x0128 }
            r4 = r8
            com.etsy.android.ui.user.circles.e$d r4 = (com.etsy.android.p327ui.user.circles.C11512e.C11516d) r4     // Catch:{ Exception -> 0x0128 }
            int r4 = r4.f25403b     // Catch:{ Exception -> 0x0128 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0128 }
            r0.label = r5     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r9 = r9.mo37385a(r3, r2, r4, r0)     // Catch:{ Exception -> 0x0128 }
            if (r9 != r1) goto L_0x0099
            return r1
        L_0x0099:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x0128 }
            goto L_0x00dc
        L_0x009c:
            boolean r9 = r8 instanceof com.etsy.android.p327ui.user.circles.C11512e.C11513a     // Catch:{ Exception -> 0x0128 }
            if (r9 == 0) goto L_0x00bf
            com.etsy.android.ui.user.circles.b r9 = r7.f25372a     // Catch:{ Exception -> 0x0128 }
            q9.p r3 = r7.f25373b     // Catch:{ Exception -> 0x0128 }
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r3.mo45958c()     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = r3.getId()     // Catch:{ Exception -> 0x0128 }
            r5 = r8
            com.etsy.android.ui.user.circles.e$a r5 = (com.etsy.android.p327ui.user.circles.C11512e.C11513a) r5     // Catch:{ Exception -> 0x0128 }
            int r5 = r5.f25398a     // Catch:{ Exception -> 0x0128 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0128 }
            r0.label = r4     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r9 = r9.mo37386b(r3, r2, r5, r0)     // Catch:{ Exception -> 0x0128 }
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x0128 }
            goto L_0x00dc
        L_0x00bf:
            boolean r9 = r8 instanceof com.etsy.android.p327ui.user.circles.C11512e.C11514b     // Catch:{ Exception -> 0x0128 }
            if (r9 == 0) goto L_0x0122
            com.etsy.android.ui.user.circles.b r9 = r7.f25372a     // Catch:{ Exception -> 0x0128 }
            r4 = r8
            com.etsy.android.ui.user.circles.e$b r4 = (com.etsy.android.p327ui.user.circles.C11512e.C11514b) r4     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = r4.f25399a     // Catch:{ Exception -> 0x0128 }
            r5 = r8
            com.etsy.android.ui.user.circles.e$b r5 = (com.etsy.android.p327ui.user.circles.C11512e.C11514b) r5     // Catch:{ Exception -> 0x0128 }
            int r5 = r5.f25400b     // Catch:{ Exception -> 0x0128 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0128 }
            r0.label = r3     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r9 = r9.mo37386b(r4, r2, r5, r0)     // Catch:{ Exception -> 0x0128 }
            if (r9 != r1) goto L_0x00da
            return r1
        L_0x00da:
            retrofit2.v r9 = (retrofit2.C20145v) r9     // Catch:{ Exception -> 0x0128 }
        L_0x00dc:
            T r0 = r9.f44615b     // Catch:{ Exception -> 0x0128 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0128 }
            boolean r1 = r9.mo74384a()     // Catch:{ Exception -> 0x0128 }
            if (r1 == 0) goto L_0x011b
            if (r0 == 0) goto L_0x011b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0128 }
            int r2 = kotlin.collections.C19322o.m32624F0(r0)     // Catch:{ Exception -> 0x0128 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0128 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0128 }
        L_0x00f5:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r2 == 0) goto L_0x0109
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0128 }
            com.etsy.android.lib.models.apiv3.circles.CircledUserModel r2 = (com.etsy.android.lib.models.apiv3.circles.CircledUserModel) r2     // Catch:{ Exception -> 0x0128 }
            com.etsy.android.ui.user.circles.a r2 = com.etsy.android.p327ui.user.circles.CirclesRepository.C11498a.m19289a(r2)     // Catch:{ Exception -> 0x0128 }
            r1.add(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00f5
        L_0x0109:
            java.lang.Integer r9 = p001a0.C0005b.m46k0(r9)     // Catch:{ Exception -> 0x0128 }
            if (r9 == 0) goto L_0x0114
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0128 }
            goto L_0x0115
        L_0x0114:
            r9 = 0
        L_0x0115:
            com.etsy.android.ui.user.circles.d$b r0 = new com.etsy.android.ui.user.circles.d$b     // Catch:{ Exception -> 0x0128 }
            r0.<init>(r1, r9, r8)     // Catch:{ Exception -> 0x0128 }
            goto L_0x012e
        L_0x011b:
            com.etsy.android.ui.user.circles.d$a r0 = new com.etsy.android.ui.user.circles.d$a     // Catch:{ Exception -> 0x0128 }
            r9 = 0
            r0.<init>(r9, r8)     // Catch:{ Exception -> 0x0128 }
            goto L_0x012e
        L_0x0122:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch:{ Exception -> 0x0128 }
            r9.<init>()     // Catch:{ Exception -> 0x0128 }
            throw r9     // Catch:{ Exception -> 0x0128 }
        L_0x0128:
            r9 = move-exception
            com.etsy.android.ui.user.circles.d$a r0 = new com.etsy.android.ui.user.circles.d$a
            r0.<init>(r9, r8)
        L_0x012e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.circles.CirclesRepository.mo37366a(com.etsy.android.ui.user.circles.e, kotlin.coroutines.c):java.lang.Object");
    }
}
