package p715xn;

import kotlinx.coroutines.C19543e0;

/* renamed from: xn.g */
public final class C18826g extends C19543e0 {
    /* renamed from: L */
    public final int mo70277L(StringBuilder sb, char c) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append(2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c < '{' || c > 127) {
            sb.append("\u0001\u001e");
            return mo70277L(sb, (char) (c - 128)) + 2;
        } else {
            sb.append(2);
            sb.append((char) ((c - '{') + 27));
            return 2;
        }
    }

    /* renamed from: Q */
    public final int mo70278Q() {
        return 2;
    }
}
