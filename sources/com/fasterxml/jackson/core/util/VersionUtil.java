package com.fasterxml.jackson.core.util;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.Version;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class VersionUtil {
    private static final Pattern V_SEP = Pattern.compile("[-_./;:]");

    private static final void _close(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static Version mavenVersionFor(ClassLoader classLoader, String str, String str2) {
        StringBuilder h = C0072d.m201h("META-INF/maven/");
        h.append(str.replaceAll("\\.", "/"));
        h.append("/");
        h.append(str2);
        h.append("/pom.properties");
        InputStream resourceAsStream = classLoader.getResourceAsStream(h.toString());
        if (resourceAsStream != null) {
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                return parseVersion(properties.getProperty(ResponseConstants.VERSION), properties.getProperty("groupId"), properties.getProperty("artifactId"));
            } catch (IOException unused) {
            } finally {
                _close(resourceAsStream);
            }
        }
        return Version.unknownVersion();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        throw new java.lang.IllegalArgumentException("Failed to get Versioned out of " + r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.core.Version packageVersionFor(java.lang.Class<?> r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r0.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.Package r1 = r3.getPackage()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = r1.getName()     // Catch:{ Exception -> 0x004d }
            r0.append(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = ".PackageVersion"
            r0.append(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x004d }
            r1 = 1
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.Class r3 = java.lang.Class.forName(r0, r1, r3)     // Catch:{ Exception -> 0x004d }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0036 }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0036 }
            com.fasterxml.jackson.core.Versioned r0 = (com.fasterxml.jackson.core.Versioned) r0     // Catch:{ Exception -> 0x0036 }
            com.fasterxml.jackson.core.Version r3 = r0.version()     // Catch:{ Exception -> 0x0036 }
            goto L_0x004e
        L_0x0036:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = "Failed to get Versioned out of "
            r1.append(r2)     // Catch:{ Exception -> 0x004d }
            r1.append(r3)     // Catch:{ Exception -> 0x004d }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x004d }
            r0.<init>(r3)     // Catch:{ Exception -> 0x004d }
            throw r0     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0054
            com.fasterxml.jackson.core.Version r3 = com.fasterxml.jackson.core.Version.unknownVersion()
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.VersionUtil.packageVersionFor(java.lang.Class):com.fasterxml.jackson.core.Version");
    }

    public static Version parseVersion(String str, String str2, String str3) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = V_SEP.split(trim);
                int i = 0;
                int parseVersionPart = parseVersionPart(split[0]);
                int parseVersionPart2 = split.length > 1 ? parseVersionPart(split[1]) : 0;
                if (split.length > 2) {
                    i = parseVersionPart(split[2]);
                }
                return new Version(parseVersionPart, parseVersionPart2, i, split.length > 3 ? split[3] : null, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    public static int parseVersionPart(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static Version versionFor(Class<?> cls) {
        Version packageVersionFor = packageVersionFor(cls);
        return packageVersionFor == null ? Version.unknownVersion() : packageVersionFor;
    }

    @Deprecated
    public Version version() {
        return Version.unknownVersion();
    }
}
