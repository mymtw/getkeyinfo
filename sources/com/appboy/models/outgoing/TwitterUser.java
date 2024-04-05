package com.appboy.models.outgoing;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p005a4.C0035b;
import p753kq.C19846a;

public final class TwitterUser implements C0035b<JSONObject> {
    public static final C4924a Companion = new C4924a((DefaultConstructorMarker) null);
    private static final String DESCRIPTION_KEY = "description";
    private static final String FOLLOWERS_COUNT_KEY = "followers_count";
    private static final String FOLLOWING_COUNT_KEY = "friends_count";
    private static final String HANDLE_KEY = "screen_name";
    private static final String ID_KEY = "id";
    private static final String NAME_KEY = "name";
    private static final String PROFILE_IMAGE_URL_KEY = "profile_image_url";
    private static final String STATUS_UPDATES_COUNT_KEY = "statuses_count";
    private final String description;
    private final Integer followers;
    private final Integer following;
    private final String name;
    private final String profileImageUrl;
    private final Integer tweets;
    private final String twitterHandle;
    private final int twitterUserId;

    /* renamed from: com.appboy.models.outgoing.TwitterUser$a */
    public static final class C4924a {
        private C4924a() {
        }

        public /* synthetic */ C4924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.appboy.models.outgoing.TwitterUser$b */
    public static final class C4925b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4925b f11114b = new C4925b();

        public C4925b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating twitter user Json.";
        }
    }

    public TwitterUser(int i, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4) {
        this.twitterUserId = i;
        this.twitterHandle = str;
        this.name = str2;
        this.description = str3;
        this.followers = num;
        this.following = num2;
        this.tweets = num3;
        this.profileImageUrl = str4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045 A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0059 A[Catch:{ JSONException -> 0x007d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r8.twitterHandle     // Catch:{ JSONException -> 0x007d }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0014
            boolean r1 = kotlin.text.C19457k.m33020X0(r1)     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r1 = r2
            goto L_0x0015
        L_0x0014:
            r1 = r3
        L_0x0015:
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "screen_name"
            java.lang.String r4 = r8.twitterHandle     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x007d }
        L_0x001e:
            java.lang.String r1 = r8.name     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x002b
            boolean r1 = kotlin.text.C19457k.m33020X0(r1)     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r1 = r3
        L_0x002c:
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "name"
            java.lang.String r4 = r8.name     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x007d }
        L_0x0035:
            java.lang.String r1 = r8.description     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0042
            boolean r1 = kotlin.text.C19457k.m33020X0(r1)     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r3
        L_0x0043:
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "description"
            java.lang.String r4 = r8.description     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x007d }
        L_0x004c:
            java.lang.String r1 = r8.profileImageUrl     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0056
            boolean r1 = kotlin.text.C19457k.m33020X0(r1)     // Catch:{ JSONException -> 0x007d }
            if (r1 == 0) goto L_0x0057
        L_0x0056:
            r2 = r3
        L_0x0057:
            if (r2 != 0) goto L_0x0060
            java.lang.String r1 = "profile_image_url"
            java.lang.String r2 = r8.profileImageUrl     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x007d }
        L_0x0060:
            java.lang.String r1 = "id"
            int r2 = r8.twitterUserId     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r1 = "followers_count"
            java.lang.Integer r2 = r8.followers     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r1 = "friends_count"
            java.lang.Integer r2 = r8.following     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r1 = "statuses_count"
            java.lang.Integer r2 = r8.tweets     // Catch:{ JSONException -> 0x007d }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x007d }
            goto L_0x008a
        L_0x007d:
            r1 = move-exception
            r5 = r1
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            com.appboy.models.outgoing.TwitterUser$b r6 = com.appboy.models.outgoing.TwitterUser.C4925b.f11114b
            r7 = 4
            r3 = r8
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.models.outgoing.TwitterUser.forJsonPut():org.json.JSONObject");
    }
}
