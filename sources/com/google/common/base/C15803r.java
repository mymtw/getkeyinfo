package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.base.r */
public final class C15803r {
    /* renamed from: a */
    public static String m25628a(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String str2;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                str2 = String.valueOf(obj);
            } catch (Exception e) {
                String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e);
                str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
            }
            objArr[i2] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb.append(valueOf, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append(valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
