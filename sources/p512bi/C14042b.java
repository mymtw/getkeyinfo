package p512bi;

import androidx.preference.C3039b;
import com.google.android.exoplayer2.Format;
import p519ci.C14143a;
import p547di.C17558a;
import p555ei.C17703a;
import p563fi.C17734a;
import p571gi.C17785a;

/* renamed from: bi.b */
public interface C14042b {

    /* renamed from: a */
    public static final C14043a f30905a = new C14043a();

    /* renamed from: bi.b$a */
    public class C14043a implements C14042b {
        /* renamed from: a */
        public final C3039b mo46863a(Format format) {
            String str = format.sampleMimeType;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new C14143a();
                    case 1:
                        return new C17703a();
                    case 2:
                        return new C17734a((C17734a.C17735a) null);
                    case 3:
                        return new C17558a();
                    case 4:
                        return new C17785a();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }

        public final boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    /* renamed from: a */
    C3039b mo46863a(Format format);

    boolean supportsFormat(Format format);
}
