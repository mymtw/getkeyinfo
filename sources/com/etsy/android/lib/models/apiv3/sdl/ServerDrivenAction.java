package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class ServerDrivenAction implements IServerDrivenAction {
    public static final int $stable = 8;
    private final boolean authNeeded;
    private final List<String> bodyParams;
    private final String deepLink;
    private final String displayName;
    private final String icon;
    private final String path;
    private final boolean refreshNeeded;
    private final String requestMethod;
    private final String type;

    public ServerDrivenAction() {
        this((String) null, (String) null, false, false, (String) null, (List) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    public ServerDrivenAction(@C17402n(name = "method") String str, @C17402n(name = "path") String str2, @C17402n(name = "auth_needed") boolean z, @C17402n(name = "refresh_needed") boolean z2, @C17402n(name = "display_name") String str3, @C17402n(name = "body_params") List<String> list, @C17402n(name = "icon") String str4, @C17402n(name = "type") String str5, @C17402n(name = "deep_link_url") String str6) {
        C19383o.m32797g(str, "requestMethod");
        C19383o.m32797g(str2, ResponseConstants.PATH);
        C19383o.m32797g(str3, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        C19383o.m32797g(list, "bodyParams");
        C19383o.m32797g(str4, ResponseConstants.ICON);
        C19383o.m32797g(str5, "type");
        C19383o.m32797g(str6, "deepLink");
        this.requestMethod = str;
        this.path = str2;
        this.authNeeded = z;
        this.refreshNeeded = z2;
        this.displayName = str3;
        this.bodyParams = list;
        this.icon = str4;
        this.type = str5;
        this.deepLink = str6;
    }

    public static /* synthetic */ ServerDrivenAction copy$default(ServerDrivenAction serverDrivenAction, String str, String str2, boolean z, boolean z2, String str3, List list, String str4, String str5, String str6, int i, Object obj) {
        List list2;
        int i2 = i;
        String requestMethod2 = (i2 & 1) != 0 ? serverDrivenAction.getRequestMethod() : str;
        String path2 = (i2 & 2) != 0 ? serverDrivenAction.getPath() : str2;
        boolean authNeeded2 = (i2 & 4) != 0 ? serverDrivenAction.getAuthNeeded() : z;
        boolean refreshNeeded2 = (i2 & 8) != 0 ? serverDrivenAction.getRefreshNeeded() : z2;
        String displayName2 = (i2 & 16) != 0 ? serverDrivenAction.getDisplayName() : str3;
        if ((i2 & 32) != 0) {
            list2 = serverDrivenAction.bodyParams;
        } else {
            ServerDrivenAction serverDrivenAction2 = serverDrivenAction;
            list2 = list;
        }
        return serverDrivenAction.copy(requestMethod2, path2, authNeeded2, refreshNeeded2, displayName2, list2, (i2 & 64) != 0 ? serverDrivenAction.getIcon() : str4, (i2 & 128) != 0 ? serverDrivenAction.getType() : str5, (i2 & 256) != 0 ? serverDrivenAction.getDeepLink() : str6);
    }

    public final String component1() {
        return getRequestMethod();
    }

    public final String component2() {
        return getPath();
    }

    public final boolean component3() {
        return getAuthNeeded();
    }

    public final boolean component4() {
        return getRefreshNeeded();
    }

    public final String component5() {
        return getDisplayName();
    }

    public final List<String> component6() {
        return this.bodyParams;
    }

    public final String component7() {
        return getIcon();
    }

    public final String component8() {
        return getType();
    }

    public final String component9() {
        return getDeepLink();
    }

    public final ServerDrivenAction copy(@C17402n(name = "method") String str, @C17402n(name = "path") String str2, @C17402n(name = "auth_needed") boolean z, @C17402n(name = "refresh_needed") boolean z2, @C17402n(name = "display_name") String str3, @C17402n(name = "body_params") List<String> list, @C17402n(name = "icon") String str4, @C17402n(name = "type") String str5, @C17402n(name = "deep_link_url") String str6) {
        C19383o.m32797g(str, "requestMethod");
        C19383o.m32797g(str2, ResponseConstants.PATH);
        String str7 = str3;
        C19383o.m32797g(str7, ResponseConstants.DISPLAY_NAME_CAMELCASE);
        List<String> list2 = list;
        C19383o.m32797g(list2, "bodyParams");
        String str8 = str4;
        C19383o.m32797g(str8, ResponseConstants.ICON);
        String str9 = str5;
        C19383o.m32797g(str9, "type");
        String str10 = str6;
        C19383o.m32797g(str10, "deepLink");
        return new ServerDrivenAction(str, str2, z, z2, str7, list2, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerDrivenAction)) {
            return false;
        }
        ServerDrivenAction serverDrivenAction = (ServerDrivenAction) obj;
        return C19383o.m32792b(getRequestMethod(), serverDrivenAction.getRequestMethod()) && C19383o.m32792b(getPath(), serverDrivenAction.getPath()) && getAuthNeeded() == serverDrivenAction.getAuthNeeded() && getRefreshNeeded() == serverDrivenAction.getRefreshNeeded() && C19383o.m32792b(getDisplayName(), serverDrivenAction.getDisplayName()) && C19383o.m32792b(this.bodyParams, serverDrivenAction.bodyParams) && C19383o.m32792b(getIcon(), serverDrivenAction.getIcon()) && C19383o.m32792b(getType(), serverDrivenAction.getType()) && C19383o.m32792b(getDeepLink(), serverDrivenAction.getDeepLink());
    }

    public boolean getAuthNeeded() {
        return this.authNeeded;
    }

    public final List<String> getBodyParams() {
        return this.bodyParams;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIcon() {
        return this.icon;
    }

    public EtsyAssociativeArray getParams() {
        return IServerDrivenAction.DefaultImpls.getParams(this);
    }

    public String getPath() {
        return this.path;
    }

    public boolean getRefreshNeeded() {
        return this.refreshNeeded;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (getPath().hashCode() + (getRequestMethod().hashCode() * 31)) * 31;
        boolean authNeeded2 = getAuthNeeded();
        boolean z = true;
        if (authNeeded2) {
            authNeeded2 = true;
        }
        int i = (hashCode + (authNeeded2 ? 1 : 0)) * 31;
        boolean refreshNeeded2 = getRefreshNeeded();
        if (!refreshNeeded2) {
            z = refreshNeeded2;
        }
        int g = C13983i.m21488g(this.bodyParams, (getDisplayName().hashCode() + ((i + (z ? 1 : 0)) * 31)) * 31, 31);
        return getDeepLink().hashCode() + ((getType().hashCode() + ((getIcon().hashCode() + g) * 31)) * 31);
    }

    public boolean isFromSignIn() {
        return IServerDrivenAction.DefaultImpls.isFromSignIn(this);
    }

    public boolean isImmediatelyRemovable() {
        return IServerDrivenAction.DefaultImpls.isImmediatelyRemovable(this);
    }

    public void setFromSignIn(boolean z) {
        IServerDrivenAction.DefaultImpls.setFromSignIn(this, z);
    }

    public void setParams(EtsyAssociativeArray etsyAssociativeArray) {
        IServerDrivenAction.DefaultImpls.setParams(this, etsyAssociativeArray);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ServerDrivenAction(requestMethod=");
        h.append(getRequestMethod());
        h.append(", path=");
        h.append(getPath());
        h.append(", authNeeded=");
        h.append(getAuthNeeded());
        h.append(", refreshNeeded=");
        h.append(getRefreshNeeded());
        h.append(", displayName=");
        h.append(getDisplayName());
        h.append(", bodyParams=");
        h.append(this.bodyParams);
        h.append(", icon=");
        h.append(getIcon());
        h.append(", type=");
        h.append(getType());
        h.append(", deepLink=");
        h.append(getDeepLink());
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ServerDrivenAction(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14, java.lang.String r15, java.util.List r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r11
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0019
            r4 = r5
            goto L_0x001a
        L_0x0019:
            r4 = r13
        L_0x001a:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x0030
        L_0x002e:
            r7 = r16
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r17
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r18
        L_0x0040:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = r19
        L_0x0047:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.ServerDrivenAction.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
