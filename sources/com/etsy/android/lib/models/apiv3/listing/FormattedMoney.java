package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class FormattedMoney implements Serializable {
    public static final int $stable = 8;
    private final List<Money> arguments;
    private final String format;

    public FormattedMoney() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public FormattedMoney(@C17402n(name = "format") String str, @C17402n(name = "arguments") List<Money> list) {
        this.format = str;
        this.arguments = list;
    }

    public static /* synthetic */ FormattedMoney copy$default(FormattedMoney formattedMoney, String str, List<Money> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedMoney.format;
        }
        if ((i & 2) != 0) {
            list = formattedMoney.arguments;
        }
        return formattedMoney.copy(str, list);
    }

    public final String component1() {
        return this.format;
    }

    public final List<Money> component2() {
        return this.arguments;
    }

    public final FormattedMoney copy(@C17402n(name = "format") String str, @C17402n(name = "arguments") List<Money> list) {
        return new FormattedMoney(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedMoney)) {
            return false;
        }
        FormattedMoney formattedMoney = (FormattedMoney) obj;
        return C19383o.m32792b(this.format, formattedMoney.format) && C19383o.m32792b(this.arguments, formattedMoney.arguments);
    }

    public final List<Money> getArguments() {
        return this.arguments;
    }

    public final String getFormat() {
        return this.format;
    }

    public int hashCode() {
        String str = this.format;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Money> list = this.arguments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.etsy.android.lib.models.apiv3.listing.Money[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.etsy.android.lib.models.apiv3.listing.Money[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.String r0 = r5.format     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.String r2 = "%m"
            java.lang.String r3 = "%s"
            r4 = 0
            java.lang.String r0 = kotlin.text.C19457k.m33023a1(r0, r2, r3, r4)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.util.List<com.etsy.android.lib.models.apiv3.listing.Money> r2 = r5.arguments     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            if (r2 == 0) goto L_0x001f
            com.etsy.android.lib.models.apiv3.listing.Money[] r1 = new com.etsy.android.lib.models.apiv3.listing.Money[r4]     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            com.etsy.android.lib.models.apiv3.listing.Money[] r1 = (com.etsy.android.lib.models.apiv3.listing.Money[]) r1     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
        L_0x001f:
            if (r1 != 0) goto L_0x0023
            com.etsy.android.lib.models.apiv3.listing.Money[] r1 = new com.etsy.android.lib.models.apiv3.listing.Money[r4]     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
        L_0x0023:
            com.etsy.android.lib.models.apiv3.listing.Money[] r1 = (com.etsy.android.lib.models.apiv3.listing.Money[]) r1     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            int r2 = r1.length     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            int r2 = r1.length     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            java.lang.String r0 = "format(this, *args)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r0)     // Catch:{ IllegalFormatConversionException -> 0x003f, UnknownFormatConversionException -> 0x003c, MissingFormatArgumentException -> 0x0039 }
            goto L_0x0041
        L_0x0039:
            java.lang.String r1 = r5.format
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = r5.format
            goto L_0x0041
        L_0x003f:
            java.lang.String r1 = r5.format
        L_0x0041:
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = ""
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.FormattedMoney.toString():java.lang.String");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormattedMoney(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
