package com.etsy.android.lib.models.apiv3.inappnotifications;

import android.annotation.SuppressLint;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.core.HttpMethod;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class DismissAction {
    public static final int $stable = 8;
    @SuppressLint({"DefaultLocale"})
    private transient HttpMethod apiMethod;
    private final String apiMethodField;
    private final String apiPathField;
    private final boolean isDismissable;

    public DismissAction() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DismissAction(@com.squareup.moshi.C17402n(name = "is_dismissible") boolean r2, @com.squareup.moshi.C17402n(name = "api_path") java.lang.String r3, @com.squareup.moshi.C17402n(name = "api_method") java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "apiPathField"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "apiMethodField"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            r1.<init>()
            r1.isDismissable = r2
            r1.apiPathField = r3
            r1.apiMethodField = r4
            java.lang.String r2 = r4.toLowerCase()
            java.lang.String r3 = "this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            int r3 = r2.hashCode()
            switch(r3) {
                case -1335458389: goto L_0x0048;
                case 102230: goto L_0x003c;
                case 111375: goto L_0x0030;
                case 3446944: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0054
        L_0x0024:
            java.lang.String r3 = "post"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002d
            goto L_0x0054
        L_0x002d:
            com.etsy.android.lib.core.HttpMethod r2 = com.etsy.android.lib.core.HttpMethod.POST
            goto L_0x0056
        L_0x0030:
            java.lang.String r3 = "put"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0039
            goto L_0x0054
        L_0x0039:
            com.etsy.android.lib.core.HttpMethod r2 = com.etsy.android.lib.core.HttpMethod.PUT
            goto L_0x0056
        L_0x003c:
            java.lang.String r3 = "get"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0045
            goto L_0x0054
        L_0x0045:
            com.etsy.android.lib.core.HttpMethod r2 = com.etsy.android.lib.core.HttpMethod.GET
            goto L_0x0056
        L_0x0048:
            java.lang.String r3 = "delete"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            com.etsy.android.lib.core.HttpMethod r2 = com.etsy.android.lib.core.HttpMethod.DELETE
            goto L_0x0056
        L_0x0054:
            com.etsy.android.lib.core.HttpMethod r2 = com.etsy.android.lib.core.HttpMethod.GET
        L_0x0056:
            r1.apiMethod = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction.<init>(boolean, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ DismissAction copy$default(DismissAction dismissAction, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dismissAction.isDismissable;
        }
        if ((i & 2) != 0) {
            str = dismissAction.apiPathField;
        }
        if ((i & 4) != 0) {
            str2 = dismissAction.apiMethodField;
        }
        return dismissAction.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.isDismissable;
    }

    public final String component2() {
        return this.apiPathField;
    }

    public final String component3() {
        return this.apiMethodField;
    }

    public final DismissAction copy(@C17402n(name = "is_dismissible") boolean z, @C17402n(name = "api_path") String str, @C17402n(name = "api_method") String str2) {
        C19383o.m32797g(str, "apiPathField");
        C19383o.m32797g(str2, "apiMethodField");
        return new DismissAction(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DismissAction)) {
            return false;
        }
        DismissAction dismissAction = (DismissAction) obj;
        return this.isDismissable == dismissAction.isDismissable && C19383o.m32792b(this.apiPathField, dismissAction.apiPathField) && C19383o.m32792b(this.apiMethodField, dismissAction.apiMethodField);
    }

    public final HttpMethod getApiMethod() {
        return this.apiMethod;
    }

    public final String getApiMethodField() {
        return this.apiMethodField;
    }

    public final String getApiPathField() {
        return this.apiPathField;
    }

    public int hashCode() {
        boolean z = this.isDismissable;
        if (z) {
            z = true;
        }
        return this.apiMethodField.hashCode() + C0023f.m105e(this.apiPathField, (z ? 1 : 0) * true, 31);
    }

    public final boolean isDismissable() {
        return this.isDismissable;
    }

    public final void setApiMethod(HttpMethod httpMethod) {
        C19383o.m32797g(httpMethod, "<set-?>");
        this.apiMethod = httpMethod;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("DismissAction(isDismissable=");
        h.append(this.isDismissable);
        h.append(", apiPathField=");
        h.append(this.apiPathField);
        h.append(", apiMethodField=");
        return C0391c.m1057c(h, this.apiMethodField, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DismissAction(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
