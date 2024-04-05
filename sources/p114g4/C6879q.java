package p114g4;

import android.app.Activity;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.braze.models.inappmessage.C5483a;
import com.braze.p044ui.inappmessage.factories.C5647a;
import com.braze.p044ui.inappmessage.factories.C5649c;
import com.braze.p044ui.inappmessage.factories.C5650d;
import com.braze.p044ui.inappmessage.factories.C5652f;
import com.braze.p044ui.inappmessage.listeners.C5671a;
import com.braze.support.BrazeLogger;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.rx2.C19789b;
import p568fn.C17782b;

/* renamed from: g4.q */
public class C6879q {

    /* renamed from: m */
    public static final String f15218m = BrazeLogger.m11287i(C6879q.class);

    /* renamed from: a */
    public boolean f15219a = true;

    /* renamed from: b */
    public Activity f15220b;

    /* renamed from: c */
    public Context f15221c;

    /* renamed from: d */
    public final C17782b f15222d;

    /* renamed from: e */
    public final C5652f f15223e;

    /* renamed from: f */
    public final C0114h f15224f;

    /* renamed from: g */
    public final C19421p f15225g;

    /* renamed from: h */
    public final C5649c f15226h;

    /* renamed from: i */
    public final C5650d f15227i;

    /* renamed from: j */
    public final C5647a f15228j;

    /* renamed from: k */
    public final C15588c1 f15229k;

    /* renamed from: l */
    public final C19789b f15230l;

    /* renamed from: g4.q$a */
    public static /* synthetic */ class C6880a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.braze.enums.inappmessage.MessageType[] r0 = com.braze.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15231a = r0
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15231a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15231a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15231a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15231a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.braze.enums.inappmessage.MessageType r1 = com.braze.enums.inappmessage.MessageType.HTML     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p114g4.C6879q.C6880a.<clinit>():void");
        }
    }

    public C6879q() {
        C5671a aVar = new C5671a();
        this.f15222d = new C17782b();
        this.f15223e = new C5652f();
        this.f15224f = new C0114h();
        this.f15225g = new C19421p();
        this.f15226h = new C5649c(aVar);
        this.f15227i = new C5650d(aVar);
        this.f15228j = new C5647a();
        this.f15229k = new C15588c1();
        this.f15230l = new C19789b();
    }

    /* renamed from: a */
    public final C6876n mo19008a(C5483a aVar) {
        int i = C6880a.f15231a[aVar.mo16002R().ordinal()];
        if (i == 1) {
            return this.f15223e;
        }
        if (i == 2) {
            return this.f15224f;
        }
        if (i == 3) {
            return this.f15225g;
        }
        if (i == 4) {
            return this.f15226h;
        }
        if (i == 5) {
            return this.f15227i;
        }
        String str = f15218m;
        StringBuilder h = C0072d.m201h("Failed to find view factory for in-app message with type: ");
        h.append(aVar.mo16002R());
        BrazeLogger.m11292n(str, h.toString());
        return null;
    }
}
