package p424pg;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.compose.animation.C0388a;
import com.etsy.android.lib.conversation.MessageDraft;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

@SuppressLint({"NewApi", "StringFormatUse", "DefaultLocale", "BadMethodUse-java.lang.String.length"})
/* renamed from: pg.c */
public final class C13245c {

    /* renamed from: a */
    public final LinkedHashSet f29094a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashMap f29095b = new LinkedHashMap();

    /* renamed from: pg.c$a */
    public static final class C13246a {
        /* renamed from: a */
        public static final String m20907a(C13247b bVar, String str) {
            String a1 = C19457k.m33023a1(C19457k.m33023a1(C19457k.m33023a1(str, "\\u003C", "<", false), "\\n", "", false), "\\\"", "\"", false);
            String substring = a1.substring(1, a1.length() - 1);
            C19383o.m32796f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return C0388a.m1049e(new Object[]{bVar.f29097a, Integer.valueOf(bVar.f29098b), Integer.valueOf(bVar.f29099c), Integer.valueOf(bVar.f29100d), Integer.valueOf(bVar.f29101e), substring}, 6, "<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", "java.lang.String.format(format, *args)");
        }
    }

    /* renamed from: pg.c$b */
    public static final class C13247b {

        /* renamed from: f */
        public static final int[] f29096f = new int[2];

        /* renamed from: a */
        public final String f29097a;

        /* renamed from: b */
        public final int f29098b;

        /* renamed from: c */
        public final int f29099c;

        /* renamed from: d */
        public final int f29100d;

        /* renamed from: e */
        public final int f29101e;

        public C13247b(WebView webView) {
            C19383o.m32797g(webView, "webView");
            this.f29097a = C0388a.m1049e(new Object[]{webView.getClass().getName(), Integer.toHexString(webView.hashCode())}, 2, "%s{%s}", "java.lang.String.format(format, *args)");
            int[] iArr = f29096f;
            webView.getLocationOnScreen(iArr);
            this.f29098b = iArr[0];
            this.f29099c = iArr[1];
            this.f29100d = webView.getWidth();
            this.f29101e = webView.getHeight();
        }
    }

    static {
        new C13246a();
    }

    /* renamed from: a */
    public final void mo45942a(PrintWriter printWriter) {
        C19383o.m32797g(printWriter, "writer");
        try {
            for (C13247b bVar : this.f29094a) {
                String str = (String) this.f29095b.get(bVar.f29097a);
                if (str != null) {
                    printWriter.print("WebView HTML for ");
                    printWriter.print(bVar);
                    printWriter.println(MessageDraft.IMAGE_DELIMITER);
                    printWriter.println(C13246a.m20907a(bVar, str));
                }
            }
        } catch (Exception unused) {
        }
        this.f29094a.clear();
        this.f29095b.clear();
    }
}
