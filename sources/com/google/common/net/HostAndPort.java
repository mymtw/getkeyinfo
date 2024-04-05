package com.google.common.net;

import com.google.common.base.C15791j;
import com.google.common.base.C15794l;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    public HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort fromString = fromString(str);
        C15794l.m25612f(str, "Host has a port: %s", !fromString.hasPort());
        return fromString;
    }

    public static HostAndPort fromParts(String str, int i) {
        C15794l.m25609c(i, "Port out of range: %s", i >= 0 && i <= 65535);
        HostAndPort fromString = fromString(str);
        C15794l.m25612f(str, "Host has a port: %s", true ^ fromString.hasPort());
        return new HostAndPort(fromString.host, i, fromString.hasBracketlessColons);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r9) {
        /*
            r9.getClass()
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            r1 = 0
            r2 = 1
            r3 = -1
            r4 = 58
            if (r0 == 0) goto L_0x0081
            char r0 = r9.charAt(r1)
            r5 = 91
            if (r0 != r5) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            java.lang.String r5 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.C15794l.m25612f(r9, r5, r0)
            int r0 = r9.indexOf(r4)
            r5 = 93
            int r5 = r9.lastIndexOf(r5)
            if (r0 <= r3) goto L_0x0030
            if (r5 <= r0) goto L_0x0030
            r0 = r2
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.String r6 = "Invalid bracketed host/port: %s"
            com.google.common.base.C15794l.m25612f(r9, r6, r0)
            java.lang.String r0 = r9.substring(r2, r5)
            int r6 = r5 + 1
            int r7 = r9.length()
            r8 = 2
            if (r6 != r7) goto L_0x004c
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r1] = r0
            java.lang.String r0 = ""
            r4[r2] = r0
            goto L_0x007c
        L_0x004c:
            char r6 = r9.charAt(r6)
            if (r6 != r4) goto L_0x0054
            r4 = r2
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            java.lang.String r6 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.C15794l.m25612f(r9, r6, r4)
            int r5 = r5 + r8
            r4 = r5
        L_0x005c:
            int r6 = r9.length()
            if (r4 >= r6) goto L_0x0072
            char r6 = r9.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r6)
            java.lang.String r7 = "Port must be numeric: %s"
            com.google.common.base.C15794l.m25612f(r9, r7, r6)
            int r4 = r4 + 1
            goto L_0x005c
        L_0x0072:
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r1] = r0
            java.lang.String r0 = r9.substring(r5)
            r4[r2] = r0
        L_0x007c:
            r0 = r4[r1]
            r4 = r4[r2]
            goto L_0x0097
        L_0x0081:
            int r0 = r9.indexOf(r4)
            if (r0 < 0) goto L_0x009a
            int r5 = r0 + 1
            int r4 = r9.indexOf(r4, r5)
            if (r4 != r3) goto L_0x009a
            java.lang.String r0 = r9.substring(r1, r0)
            java.lang.String r4 = r9.substring(r5)
        L_0x0097:
            r5 = r4
            r4 = r1
            goto L_0x00a3
        L_0x009a:
            if (r0 < 0) goto L_0x009e
            r0 = r2
            goto L_0x009f
        L_0x009e:
            r0 = r1
        L_0x009f:
            r4 = 0
            r5 = r4
            r4 = r0
            r0 = r9
        L_0x00a3:
            com.google.common.base.k$a r6 = com.google.common.base.C15792k.f35574a
            if (r5 == 0) goto L_0x00b0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r6 = r1
            goto L_0x00b1
        L_0x00b0:
            r6 = r2
        L_0x00b1:
            if (r6 != 0) goto L_0x00dd
            java.lang.String r3 = "+"
            boolean r3 = r5.startsWith(r3)
            r3 = r3 ^ r2
            java.lang.String r6 = "Unparseable port number: %s"
            com.google.common.base.C15794l.m25612f(r9, r6, r3)
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x00d1 }
            if (r3 < 0) goto L_0x00cb
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r5) goto L_0x00cb
            r1 = r2
        L_0x00cb:
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.C15794l.m25612f(r9, r2, r1)
            goto L_0x00dd
        L_0x00d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unparseable port number: "
            java.lang.String r9 = androidx.appcompat.widget.C0326j.m864i(r1, r9)
            r0.<init>(r9)
            throw r0
        L_0x00dd:
            com.google.common.net.HostAndPort r9 = new com.google.common.net.HostAndPort
            r9.<init>(r0, r3, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return C15791j.m25606a(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        C15794l.m25623q(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i) {
        return hasPort() ? this.port : i;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.host, Integer.valueOf(this.port)});
    }

    public HostAndPort requireBracketsForIPv6() {
        C15794l.m25612f(this.host, "Possible bracketless IPv6 literal: %s", !this.hasBracketlessColons);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }

    public HostAndPort withDefaultPort(int i) {
        C15794l.m25613g(i >= 0 && i <= 65535);
        return hasPort() ? this : new HostAndPort(this.host, i, this.hasBracketlessColons);
    }
}
