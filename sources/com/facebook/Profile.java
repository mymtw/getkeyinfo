package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12879l0;
import p365hg.C12910u;
import p453tf.C13432s;

public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Profile$Companion$CREATOR$1();
    public static final C12204a Companion = new C12204a();
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LINK_URI_KEY = "link_uri";
    private static final String MIDDLE_NAME_KEY = "middle_name";
    private static final String NAME_KEY = "name";
    private static final String PICTURE_URI_KEY = "picture_uri";
    /* access modifiers changed from: private */
    public static final String TAG = ResponseConstants.Includes.PROFILE;
    private final String firstName;

    /* renamed from: id */
    private final String f27248id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;
    private final Uri pictureUri;

    /* renamed from: com.facebook.Profile$a */
    public static final class C12204a {

        /* renamed from: com.facebook.Profile$a$a */
        public static final class C12205a implements C12869i0.C12870a {
            /* renamed from: a */
            public final void mo39272a(JSONObject jSONObject) {
                Uri uri = null;
                String optString = jSONObject != null ? jSONObject.optString("id") : null;
                if (optString == null) {
                    Log.w(Profile.TAG, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString(ResponseConstants.LINK);
                String optString3 = jSONObject.optString("profile_picture", (String) null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString("name");
                Uri parse = optString2 != null ? Uri.parse(optString2) : null;
                if (optString3 != null) {
                    uri = Uri.parse(optString3);
                }
                Profile profile = new Profile(optString, optString4, optString5, optString6, optString7, parse, uri);
                Profile.Companion.getClass();
                C13432s.f29418e.mo46107a().mo46106a(profile, true);
            }

            /* renamed from: b */
            public final void mo39273b(FacebookException facebookException) {
                String access$getTAG$cp = Profile.TAG;
                Log.e(access$getTAG$cp, "Got unexpected exception: " + facebookException);
            }
        }

        /* renamed from: a */
        public static void m20030a() {
            AccessToken.Companion.getClass();
            AccessToken d = AccessToken.C12174c.m19981d();
            if (d == null) {
                return;
            }
            if (!AccessToken.C12174c.m19983f()) {
                C13432s.f29418e.mo46107a().mo46106a((Profile) null, true);
                return;
            }
            C12869i0.m20578q(new C12205a(), d.getToken());
        }
    }

    static {
        Class<Profile> cls = Profile.class;
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        this(str, str2, str3, str4, str5, uri, (Uri) null, 64, (DefaultConstructorMarker) null);
    }

    public static final void fetchProfileForCurrentAccessToken() {
        Companion.getClass();
        C12204a.m20030a();
    }

    public static final Profile getCurrentProfile() {
        Companion.getClass();
        return C13432s.f29418e.mo46107a().f29419a;
    }

    public static final void setCurrentProfile(Profile profile) {
        Companion.getClass();
        C13432s.f29418e.mo46107a().mo46106a(profile, true);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = r4.firstName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r1 = r4.middleName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        r1 = r4.lastName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r1 = r4.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r1 = r4.linkUri;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008e, code lost:
        r1 = r4.pictureUri;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.facebook.Profile
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r4.f27248id
            if (r1 != 0) goto L_0x0015
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.f27248id
            if (r3 == 0) goto L_0x0020
        L_0x0015:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.f27248id
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0020:
            java.lang.String r1 = r4.firstName
            if (r1 != 0) goto L_0x002b
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.firstName
            if (r3 == 0) goto L_0x0036
        L_0x002b:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.firstName
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0036:
            java.lang.String r1 = r4.middleName
            if (r1 != 0) goto L_0x0041
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.middleName
            if (r3 == 0) goto L_0x004c
        L_0x0041:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.middleName
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x004c:
            java.lang.String r1 = r4.lastName
            if (r1 != 0) goto L_0x0057
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.lastName
            if (r3 == 0) goto L_0x0062
        L_0x0057:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.lastName
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0062:
            java.lang.String r1 = r4.name
            if (r1 != 0) goto L_0x006d
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.name
            if (r3 == 0) goto L_0x0078
        L_0x006d:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            java.lang.String r3 = r3.name
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x0078:
            android.net.Uri r1 = r4.linkUri
            if (r1 != 0) goto L_0x0083
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            android.net.Uri r3 = r3.linkUri
            if (r3 == 0) goto L_0x008e
        L_0x0083:
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            android.net.Uri r3 = r3.linkUri
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r1 == 0) goto L_0x00a4
        L_0x008e:
            android.net.Uri r1 = r4.pictureUri
            if (r1 != 0) goto L_0x0099
            r3 = r5
            com.facebook.Profile r3 = (com.facebook.Profile) r3
            android.net.Uri r3 = r3.pictureUri
            if (r3 == 0) goto L_0x00a5
        L_0x0099:
            com.facebook.Profile r5 = (com.facebook.Profile) r5
            android.net.Uri r5 = r5.pictureUri
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r1, r5)
            if (r5 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = r2
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.Profile.equals(java.lang.Object):boolean");
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.f27248id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getPictureUri() {
        return this.pictureUri;
    }

    public final Uri getProfilePictureUri(int i, int i2) {
        String str;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion.getClass();
        if (AccessToken.C12174c.m19983f()) {
            AccessToken d = AccessToken.C12174c.m19981d();
            str = d != null ? d.getToken() : null;
        } else {
            str = "";
        }
        return C12910u.C12912b.m20623a(this.f27248id, i, i2, str);
    }

    public int hashCode() {
        String str = this.f27248id;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f27248id);
            jSONObject.put("first_name", this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put("last_name", this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "dest");
        parcel.writeString(this.f27248id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        Uri uri = this.linkUri;
        String str = null;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        if (uri2 != null) {
            str = uri2.toString();
        }
        parcel.writeString(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, uri, (i & 64) != 0 ? null : uri2);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C12879l0.m20602f(str, "id");
        this.f27248id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public Profile(JSONObject jSONObject) {
        Uri uri;
        C19383o.m32797g(jSONObject, "jsonObject");
        Uri uri2 = null;
        this.f27248id = jSONObject.optString("id", (String) null);
        this.firstName = jSONObject.optString("first_name", (String) null);
        this.middleName = jSONObject.optString("middle_name", (String) null);
        this.lastName = jSONObject.optString("last_name", (String) null);
        this.name = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString(LINK_URI_KEY, (String) null);
        if (optString == null) {
            uri = null;
        } else {
            uri = Uri.parse(optString);
        }
        this.linkUri = uri;
        String optString2 = jSONObject.optString(PICTURE_URI_KEY, (String) null);
        this.pictureUri = optString2 != null ? Uri.parse(optString2) : uri2;
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f27248id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String readString = parcel.readString();
        Uri uri2 = null;
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.linkUri = uri;
        String readString2 = parcel.readString();
        this.pictureUri = readString2 != null ? Uri.parse(readString2) : uri2;
    }
}
