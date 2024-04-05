package p575gm;

import android.content.Context;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: gm.e */
public final class C17799e {

    /* renamed from: a */
    public final String f38684a;

    /* renamed from: b */
    public final String f38685b;

    /* renamed from: c */
    public final String f38686c;

    /* renamed from: d */
    public final String f38687d;

    /* renamed from: e */
    public final String f38688e;

    /* renamed from: f */
    public final String f38689f;

    /* renamed from: g */
    public final String f38690g;

    public C17799e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f38685b = str;
        this.f38684a = str2;
        this.f38686c = str3;
        this.f38687d = str4;
        this.f38688e = str5;
        this.f38689f = str6;
        this.f38690g = str7;
    }

    /* renamed from: a */
    public static C17799e m29926a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C17799e(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString(ResponseConstants.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17799e)) {
            return false;
        }
        C17799e eVar = (C17799e) obj;
        return Objects.equal(this.f38685b, eVar.f38685b) && Objects.equal(this.f38684a, eVar.f38684a) && Objects.equal(this.f38686c, eVar.f38686c) && Objects.equal(this.f38687d, eVar.f38687d) && Objects.equal(this.f38688e, eVar.f38688e) && Objects.equal(this.f38689f, eVar.f38689f) && Objects.equal(this.f38690g, eVar.f38690g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38685b, this.f38684a, this.f38686c, this.f38687d, this.f38688e, this.f38689f, this.f38690g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f38685b).add("apiKey", this.f38684a).add("databaseUrl", this.f38686c).add("gcmSenderId", this.f38688e).add("storageBucket", this.f38689f).add("projectId", this.f38690g).toString();
    }
}
