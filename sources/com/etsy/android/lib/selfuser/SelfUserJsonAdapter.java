package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SelfUserJsonAdapter extends JsonAdapter<SelfUser> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<SelfUserAddress>> nullableListOfSelfUserAddressAdapter;
    private final JsonAdapter<List<SelfUserListing>> nullableListOfSelfUserListingAdapter;
    private final JsonAdapter<List<SelfUserShop>> nullableListOfSelfUserShopAdapter;
    private final JsonAdapter<SelfUserProfile> nullableSelfUserProfileAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("user_id", "login_name", ResponseConstants.FOLLOWER_COUNT, ResponseConstants.FOLLOWING_COUNT, ResponseConstants.PRIMARY_EMAIL, ResponseConstants.AWAITING_FEEDBACK_COUNT, Scopes.PROFILE, "shops", "addresses", "favorite_listings");
    private final JsonAdapter<String> stringAdapter;

    public SelfUserJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "userId");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "followerCount");
        this.nullableSelfUserProfileAdapter = yVar.mo68558c(SelfUserProfile.class, emptySet, Scopes.PROFILE);
        this.nullableListOfSelfUserShopAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SelfUserShop.class), emptySet, "shops");
        this.nullableListOfSelfUserAddressAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SelfUserAddress.class), emptySet, "addresses");
        this.nullableListOfSelfUserListingAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, SelfUserListing.class), emptySet, "favoriteListings");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bf, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c3, code lost:
        r12 = r18;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r21.mo68410b()
            r2 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0016:
            boolean r3 = r21.mo68414f()
            java.lang.String r4 = "primary_email"
            java.lang.String r5 = "primaryEmail"
            java.lang.String r15 = "login_name"
            r16 = r14
            java.lang.String r14 = "loginName"
            r17 = r13
            java.lang.String r13 = "user_id"
            r18 = r12
            java.lang.String r12 = "userId"
            if (r3 == 0) goto L_0x00c7
            com.squareup.moshi.JsonReader$b r3 = r0.options
            int r3 = r1.mo68406Q(r3)
            switch(r3) {
                case -1: goto L_0x00b9;
                case 0: goto L_0x00a9;
                case 1: goto L_0x0098;
                case 2: goto L_0x008e;
                case 3: goto L_0x0084;
                case 4: goto L_0x0073;
                case 5: goto L_0x0069;
                case 6: goto L_0x005f;
                case 7: goto L_0x0051;
                case 8: goto L_0x0044;
                case 9: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x00bf
        L_0x0039:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.selfuser.SelfUserListing>> r3 = r0.nullableListOfSelfUserListingAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r3
            java.util.List r14 = (java.util.List) r14
            goto L_0x00c1
        L_0x0044:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.selfuser.SelfUserAddress>> r3 = r0.nullableListOfSelfUserAddressAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            java.util.List r3 = (java.util.List) r3
            r13 = r3
            r14 = r16
            goto L_0x00c3
        L_0x0051:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.selfuser.SelfUserShop>> r3 = r0.nullableListOfSelfUserShopAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r3
            java.util.List r12 = (java.util.List) r12
            r14 = r16
            r13 = r17
            goto L_0x0016
        L_0x005f:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.selfuser.SelfUserProfile> r3 = r0.nullableSelfUserProfileAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r3
            com.etsy.android.lib.selfuser.SelfUserProfile r11 = (com.etsy.android.lib.selfuser.SelfUserProfile) r11
            goto L_0x00bf
        L_0x0069:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r3
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L_0x00bf
        L_0x0073:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x007f
            goto L_0x00bf
        L_0x007f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r4, r1)
            throw r1
        L_0x0084:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r3
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x00bf
        L_0x008e:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r3
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L_0x00bf
        L_0x0098:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r15, r1)
            throw r1
        L_0x00a9:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x00b4
            goto L_0x00bf
        L_0x00b4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r13, r1)
            throw r1
        L_0x00b9:
            r21.mo68408S()
            r21.mo68411c0()
        L_0x00bf:
            r14 = r16
        L_0x00c1:
            r13 = r17
        L_0x00c3:
            r12 = r18
            goto L_0x0016
        L_0x00c7:
            r21.mo68413e()
            com.etsy.android.lib.selfuser.SelfUser r19 = new com.etsy.android.lib.selfuser.SelfUser
            if (r2 == 0) goto L_0x00ed
            long r12 = r2.longValue()
            if (r6 == 0) goto L_0x00e8
            if (r9 == 0) goto L_0x00e3
            r3 = r19
            r4 = r12
            r12 = r18
            r13 = r17
            r14 = r16
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r19
        L_0x00e3:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r5, r4, r1)
            throw r1
        L_0x00e8:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r15, r1)
            throw r1
        L_0x00ed:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r13, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.selfuser.SelfUserJsonAdapter.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUser selfUser = (SelfUser) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUser != null) {
            wVar.mo68522b();
            wVar.mo68529h("user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(selfUser.f19477a));
            wVar.mo68529h("login_name");
            this.stringAdapter.toJson(wVar, selfUser.f19478b);
            wVar.mo68529h(ResponseConstants.FOLLOWER_COUNT);
            this.nullableIntAdapter.toJson(wVar, selfUser.f19479c);
            wVar.mo68529h(ResponseConstants.FOLLOWING_COUNT);
            this.nullableIntAdapter.toJson(wVar, selfUser.f19480d);
            wVar.mo68529h(ResponseConstants.PRIMARY_EMAIL);
            this.stringAdapter.toJson(wVar, selfUser.f19481e);
            wVar.mo68529h(ResponseConstants.AWAITING_FEEDBACK_COUNT);
            this.nullableIntAdapter.toJson(wVar, selfUser.f19482f);
            wVar.mo68529h(Scopes.PROFILE);
            this.nullableSelfUserProfileAdapter.toJson(wVar, selfUser.f19483g);
            wVar.mo68529h("shops");
            this.nullableListOfSelfUserShopAdapter.toJson(wVar, selfUser.f19484h);
            wVar.mo68529h("addresses");
            this.nullableListOfSelfUserAddressAdapter.toJson(wVar, selfUser.f19485i);
            wVar.mo68529h("favorite_listings");
            this.nullableListOfSelfUserListingAdapter.toJson(wVar, selfUser.f19486j);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUser)";
    }
}
