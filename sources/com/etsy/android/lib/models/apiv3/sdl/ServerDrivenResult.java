package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ServerDrivenResult {
    public static final int $stable = 8;
    private final Page content;
    private final ListSection listSection;
    private final String message;
    private final List<String> messages;
    private final String type;

    public ServerDrivenResult() {
        this((String) null, (String) null, (List) null, (ListSection) null, (Page) null, 31, (DefaultConstructorMarker) null);
    }

    public ServerDrivenResult(@C17402n(name = "type") String str, @C17402n(name = "message") String str2, @C17402n(name = "messages") List<String> list, @C17402n(name = "list_section") ListSection listSection2, @C17402n(name = "content") Page page) {
        this.type = str;
        this.message = str2;
        this.messages = list;
        this.listSection = listSection2;
        this.content = page;
    }

    public static /* synthetic */ ServerDrivenResult copy$default(ServerDrivenResult serverDrivenResult, String str, String str2, List<String> list, ListSection listSection2, Page page, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverDrivenResult.type;
        }
        if ((i & 2) != 0) {
            str2 = serverDrivenResult.message;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = serverDrivenResult.messages;
        }
        List<String> list2 = list;
        if ((i & 8) != 0) {
            listSection2 = serverDrivenResult.listSection;
        }
        ListSection listSection3 = listSection2;
        if ((i & 16) != 0) {
            page = serverDrivenResult.content;
        }
        return serverDrivenResult.copy(str, str3, list2, listSection3, page);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final List<String> component3() {
        return this.messages;
    }

    public final ListSection component4() {
        return this.listSection;
    }

    public final Page component5() {
        return this.content;
    }

    public final ServerDrivenResult copy(@C17402n(name = "type") String str, @C17402n(name = "message") String str2, @C17402n(name = "messages") List<String> list, @C17402n(name = "list_section") ListSection listSection2, @C17402n(name = "content") Page page) {
        return new ServerDrivenResult(str, str2, list, listSection2, page);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerDrivenResult)) {
            return false;
        }
        ServerDrivenResult serverDrivenResult = (ServerDrivenResult) obj;
        return C19383o.m32792b(this.type, serverDrivenResult.type) && C19383o.m32792b(this.message, serverDrivenResult.message) && C19383o.m32792b(this.messages, serverDrivenResult.messages) && C19383o.m32792b(this.listSection, serverDrivenResult.listSection) && C19383o.m32792b(this.content, serverDrivenResult.content);
    }

    public final Page getContent() {
        return this.content;
    }

    public final ListSection getListSection() {
        return this.listSection;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getMessages() {
        return this.messages;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.messages;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ListSection listSection2 = this.listSection;
        int hashCode4 = (hashCode3 + (listSection2 == null ? 0 : listSection2.hashCode())) * 31;
        Page page = this.content;
        if (page != null) {
            i = page.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ServerDrivenResult(type=");
        h.append(this.type);
        h.append(", message=");
        h.append(this.message);
        h.append(", messages=");
        h.append(this.messages);
        h.append(", listSection=");
        h.append(this.listSection);
        h.append(", content=");
        h.append(this.content);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ServerDrivenResult(java.lang.String r4, java.lang.String r5, java.util.List r6, com.etsy.android.lib.models.apiv3.sdl.ListSection r7, com.etsy.android.lib.models.apiv3.sdl.Page r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0015:
            r1 = r6
            r4 = r9 & 8
            r5 = 0
            if (r4 == 0) goto L_0x001d
            r2 = r5
            goto L_0x001e
        L_0x001d:
            r2 = r7
        L_0x001e:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0024
            r9 = r5
            goto L_0x0025
        L_0x0024:
            r9 = r8
        L_0x0025:
            r4 = r3
            r5 = r10
            r6 = r0
            r7 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.sdl.ServerDrivenResult.<init>(java.lang.String, java.lang.String, java.util.List, com.etsy.android.lib.models.apiv3.sdl.ListSection, com.etsy.android.lib.models.apiv3.sdl.Page, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
