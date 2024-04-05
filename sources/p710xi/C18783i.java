package p710xi;

import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import p513bj.C14049b0;
import p513bj.C14077r;

/* renamed from: xi.i */
public final class C18783i {

    /* renamed from: a */
    public static final Pattern f41650a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m31691a(C14077r rVar) {
        String d = rVar.mo46913d();
        return d != null && d.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m31692b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m31693c(String str) throws NumberFormatException {
        int i = C14049b0.f30913a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(MessageDraft.IMAGE_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static void m31694d(C14077r rVar) throws ParserException {
        int i = rVar.f30987b;
        if (!m31691a(rVar)) {
            rVar.mo46935z(i);
            String valueOf = String.valueOf(rVar.mo46913d());
            throw new ParserException(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }
}
