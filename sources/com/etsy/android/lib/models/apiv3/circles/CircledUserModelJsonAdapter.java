package com.etsy.android.lib.models.apiv3.circles;

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

public final class CircledUserModelJsonAdapter extends JsonAdapter<CircledUserModel> {
    public static final int $stable = 8;
    private final JsonAdapter<CircledUserProfile> circledUserProfileAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<CircledUserFavoriteListing>> listOfCircledUserFavoriteListingAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("user_id", "login_name", ResponseConstants.FIRST_NAME, "last_name", ResponseConstants.FOLLOWER_COUNT, Scopes.PROFILE, "favorite_listings");
    private final JsonAdapter<String> stringAdapter;

    public CircledUserModelJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "userId");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.circledUserProfileAdapter = yVar.mo68558c(CircledUserProfile.class, emptySet, Scopes.PROFILE);
        this.listOfCircledUserFavoriteListingAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, CircledUserFavoriteListing.class), emptySet, "favoriteListings");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CircledUserModel)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f9, code lost:
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ff, code lost:
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0101, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0103, code lost:
        r2 = r22;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.circles.CircledUserModel fromJson(com.squareup.moshi.JsonReader r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r25.mo68410b()
            r2 = 0
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
        L_0x0013:
            boolean r4 = r25.mo68414f()
            java.lang.String r8 = "favorite_listings"
            java.lang.String r11 = "favoriteListings"
            java.lang.String r12 = "follower_count"
            java.lang.String r13 = "followerCount"
            java.lang.String r14 = "last_name"
            java.lang.String r15 = "lastName"
            r16 = r10
            java.lang.String r10 = "first_name"
            r17 = r9
            java.lang.String r9 = "firstName"
            r18 = r3
            java.lang.String r3 = "login_name"
            r19 = r7
            java.lang.String r7 = "loginName"
            r20 = r6
            java.lang.String r6 = "user_id"
            r21 = r5
            java.lang.String r5 = "userId"
            r22 = r2
            java.lang.String r2 = "profile"
            if (r4 == 0) goto L_0x0107
            com.squareup.moshi.JsonReader$b r4 = r0.options
            int r4 = r1.mo68406Q(r4)
            switch(r4) {
                case -1: goto L_0x00f1;
                case 0: goto L_0x00d4;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0088;
                case 4: goto L_0x0072;
                case 5: goto L_0x005e;
                case 6: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00f7
        L_0x004c:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.apiv3.circles.CircledUserFavoriteListing>> r2 = r0.listOfCircledUserFavoriteListingAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0059
            goto L_0x00f9
        L_0x0059:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r8, r1)
            throw r1
        L_0x005e:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.circles.CircledUserProfile> r3 = r0.circledUserProfileAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r3
            com.etsy.android.lib.models.apiv3.circles.CircledUserProfile r9 = (com.etsy.android.lib.models.apiv3.circles.CircledUserProfile) r9
            if (r9 == 0) goto L_0x006d
            r10 = r16
            goto L_0x00fb
        L_0x006d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r2, r1)
            throw r1
        L_0x0072:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0083
            r10 = r16
            r9 = r17
            goto L_0x00fd
        L_0x0083:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r13, r12, r1)
            throw r1
        L_0x0088:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x009b
            r10 = r16
            r9 = r17
            r3 = r18
            goto L_0x00ff
        L_0x009b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r14, r1)
            throw r1
        L_0x00a0:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00b4
            r10 = r16
            r9 = r17
            r3 = r18
            r7 = r19
            goto L_0x0101
        L_0x00b4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r10, r1)
            throw r1
        L_0x00b9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00cf
            r10 = r16
            r9 = r17
            r3 = r18
            r7 = r19
            r6 = r20
            goto L_0x0103
        L_0x00cf:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r3, r1)
            throw r1
        L_0x00d4:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x00ec
            r10 = r16
            r9 = r17
            r3 = r18
            r7 = r19
            r6 = r20
            r5 = r21
            goto L_0x0013
        L_0x00ec:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r6, r1)
            throw r1
        L_0x00f1:
            r25.mo68408S()
            r25.mo68411c0()
        L_0x00f7:
            r10 = r16
        L_0x00f9:
            r9 = r17
        L_0x00fb:
            r3 = r18
        L_0x00fd:
            r7 = r19
        L_0x00ff:
            r6 = r20
        L_0x0101:
            r5 = r21
        L_0x0103:
            r2 = r22
            goto L_0x0013
        L_0x0107:
            r25.mo68413e()
            com.etsy.android.lib.models.apiv3.circles.CircledUserModel r23 = new com.etsy.android.lib.models.apiv3.circles.CircledUserModel
            if (r22 == 0) goto L_0x0151
            int r4 = r22.intValue()
            if (r21 == 0) goto L_0x014c
            if (r20 == 0) goto L_0x0147
            if (r19 == 0) goto L_0x0142
            if (r18 == 0) goto L_0x013d
            int r9 = r18.intValue()
            if (r17 == 0) goto L_0x0138
            if (r16 == 0) goto L_0x0133
            r3 = r23
            r5 = r21
            r6 = r20
            r7 = r19
            r8 = r9
            r9 = r17
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r23
        L_0x0133:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r8, r1)
            throw r1
        L_0x0138:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r1
        L_0x013d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r12, r1)
            throw r1
        L_0x0142:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r15, r14, r1)
            throw r1
        L_0x0147:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r10, r1)
            throw r1
        L_0x014c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r7, r3, r1)
            throw r1
        L_0x0151:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r5, r6, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.circles.CircledUserModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.circles.CircledUserModel");
    }

    public void toJson(C17412w wVar, CircledUserModel circledUserModel) {
        C19383o.m32797g(wVar, "writer");
        if (circledUserModel != null) {
            wVar.mo68522b();
            wVar.mo68529h("user_id");
            this.intAdapter.toJson(wVar, Integer.valueOf(circledUserModel.getUserId()));
            wVar.mo68529h("login_name");
            this.stringAdapter.toJson(wVar, circledUserModel.getLoginName());
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.stringAdapter.toJson(wVar, circledUserModel.getFirstName());
            wVar.mo68529h("last_name");
            this.stringAdapter.toJson(wVar, circledUserModel.getLastName());
            wVar.mo68529h(ResponseConstants.FOLLOWER_COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(circledUserModel.getFollowerCount()));
            wVar.mo68529h(Scopes.PROFILE);
            this.circledUserProfileAdapter.toJson(wVar, circledUserModel.getProfile());
            wVar.mo68529h("favorite_listings");
            this.listOfCircledUserFavoriteListingAdapter.toJson(wVar, circledUserModel.getFavoriteListings());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
