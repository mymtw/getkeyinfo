package p253u3;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.api.WorkerThread;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C19944e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u3.f */
public final class C8139f {

    /* renamed from: A */
    public int f17811A;

    /* renamed from: B */
    public String f17812B;

    /* renamed from: C */
    public String f17813C;

    /* renamed from: D */
    public AtomicBoolean f17814D;

    /* renamed from: E */
    public AtomicBoolean f17815E;

    /* renamed from: F */
    public String f17816F;

    /* renamed from: G */
    public WorkerThread f17817G;

    /* renamed from: H */
    public WorkerThread f17818H;

    /* renamed from: a */
    public Context f17819a;

    /* renamed from: b */
    public C19944e.C19945a f17820b;

    /* renamed from: c */
    public C8150o f17821c;

    /* renamed from: d */
    public String f17822d;

    /* renamed from: e */
    public String f17823e;

    /* renamed from: f */
    public String f17824f;

    /* renamed from: g */
    public String f17825g;

    /* renamed from: h */
    public boolean f17826h;

    /* renamed from: i */
    public boolean f17827i;

    /* renamed from: j */
    public C8155s f17828j;

    /* renamed from: k */
    public JSONObject f17829k;

    /* renamed from: l */
    public boolean f17830l;

    /* renamed from: m */
    public String f17831m;

    /* renamed from: n */
    public long f17832n;

    /* renamed from: o */
    public long f17833o;

    /* renamed from: p */
    public long f17834p;

    /* renamed from: q */
    public long f17835q;

    /* renamed from: r */
    public long f17836r;

    /* renamed from: s */
    public long f17837s;

    /* renamed from: t */
    public C8152q f17838t;

    /* renamed from: u */
    public int f17839u;

    /* renamed from: v */
    public int f17840v;

    /* renamed from: w */
    public int f17841w;

    /* renamed from: x */
    public long f17842x;

    /* renamed from: y */
    public long f17843y;

    /* renamed from: z */
    public boolean f17844z;

    /* renamed from: u3.f$a */
    public class C8140a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f17845b;

        /* renamed from: c */
        public final /* synthetic */ long f17846c;

        /* renamed from: d */
        public final /* synthetic */ long f17847d;

        public C8140a(String str, long j, long j2) {
            this.f17845b = str;
            this.f17846c = j;
            this.f17847d = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a9, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b0, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
            r1 = false;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00cb A[Catch:{ IllegalArgumentException -> 0x01ce }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ed A[SYNTHETIC, Splitter:B:24:0x00ed] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01c7  */
        /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r19 = this;
                r1 = r19
                u3.f r8 = p253u3.C8139f.this
                okhttp3.e$a r2 = r8.f17820b
                java.lang.String r3 = r1.f17845b
                long r4 = r1.f17846c
                long r6 = r1.f17847d
                java.lang.String r9 = "Exception:"
                java.lang.String r10 = "u3.f"
                java.lang.String r11 = "2"
                java.lang.String r12 = ""
                java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r12)
                long r13 = java.lang.System.currentTimeMillis()
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r0.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                java.lang.String r14 = r8.f17822d     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r0.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r0.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r0.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x007e }
                v3.a r14 = new v3.a     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r14.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007e }
                java.lang.String r15 = "UTF-8"
                byte[] r0 = r0.getBytes(r15)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                byte[] r0 = r14.digest(r0)     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r14 = 16
                char[] r14 = new char[r14]     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r14 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array     // Catch:{ UnsupportedEncodingException -> 0x007e }
                int r15 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x007e }
                int r15 = r15 * 2
                char[] r15 = new char[r15]     // Catch:{ UnsupportedEncodingException -> 0x007e }
                r16 = 0
                r1 = r16
                r16 = r12
            L_0x005b:
                int r12 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x007c }
                if (r1 >= r12) goto L_0x0075
                byte r12 = r0[r1]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r12 = r12 & 255(0xff, float:3.57E-43)
                int r17 = r1 * 2
                int r18 = r12 >>> 4
                char r18 = r14[r18]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r15[r17] = r18     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r17 = r17 + 1
                r12 = r12 & 15
                char r12 = r14[r12]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r15[r17] = r12     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r1 = r1 + 1
                goto L_0x005b
            L_0x0075:
                java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.<init>(r15)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r12 = r0
                goto L_0x008c
            L_0x007c:
                r0 = move-exception
                goto L_0x0081
            L_0x007e:
                r0 = move-exception
                r16 = r12
            L_0x0081:
                u3.n r1 = p253u3.C8149n.f17874c
                java.lang.String r0 = r0.toString()
                r1.mo20765a(r10, r0)
                r12 = r16
            L_0x008c:
                okhttp3.n$a r0 = new okhttp3.n$a
                r0.<init>()
                java.lang.String r1 = "v"
                r0.mo72947a(r1, r11)
                java.lang.String r1 = r8.f17822d
                java.lang.String r11 = "client"
                r0.mo72947a(r11, r1)
                java.lang.String r1 = "e"
                r0.mo72947a(r1, r3)
                java.lang.String r1 = "upload_time"
                r0.mo72947a(r1, r13)
                java.lang.String r1 = "checksum"
                r0.mo72947a(r1, r12)
                okhttp3.n r1 = new okhttp3.n
                java.util.ArrayList r3 = r0.f44231a
                java.util.ArrayList r0 = r0.f44232b
                r1.<init>(r3, r0)
                okhttp3.u$a r0 = new okhttp3.u$a     // Catch:{ IllegalArgumentException -> 0x01ce }
                r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01ce }
                java.lang.String r3 = r8.f17816F     // Catch:{ IllegalArgumentException -> 0x01ce }
                r0.mo73003f(r3)     // Catch:{ IllegalArgumentException -> 0x01ce }
                java.lang.String r3 = "POST"
                r0.mo73001d(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01ce }
                r1 = 0
                boolean r1 = p253u3.C8156t.m16412c(r1)     // Catch:{ IllegalArgumentException -> 0x01ce }
                if (r1 != 0) goto L_0x00d2
                java.lang.String r1 = "Authorization"
                java.lang.String r3 = "Bearer null"
                r0.mo72998a(r1, r3)     // Catch:{ IllegalArgumentException -> 0x01ce }
            L_0x00d2:
                okhttp3.u r0 = r0.mo72999b()     // Catch:{ IllegalArgumentException -> 0x01ce }
                r1 = 1
                okhttp3.e r0 = r2.mo20743a(r0)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                okhttp3.z r0 = r0.mo72859e()     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                okhttp3.a0 r2 = r0.f44368i     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r2 = r2.mo72844g()     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r3 = "success"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r3 == 0) goto L_0x0104
                com.amplitude.api.WorkerThread r0 = r8.f17817G     // Catch:{ ConnectException | UnknownHostException -> 0x01c5, IOException -> 0x0101, AssertionError -> 0x00fe, Exception -> 0x00fb }
                u3.g r11 = new u3.g     // Catch:{ ConnectException | UnknownHostException -> 0x01c5, IOException -> 0x0101, AssertionError -> 0x00fe, Exception -> 0x00fb }
                r2 = r11
                r3 = r8
                r2.<init>(r3, r4, r6)     // Catch:{ ConnectException | UnknownHostException -> 0x01c5, IOException -> 0x0101, AssertionError -> 0x00fe, Exception -> 0x00fb }
                r0.post(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x01c5, IOException -> 0x0101, AssertionError -> 0x00fe, Exception -> 0x00fb }
                goto L_0x01c5
            L_0x00fb:
                r0 = move-exception
                goto L_0x01aa
            L_0x00fe:
                r0 = move-exception
                goto L_0x01b2
            L_0x0101:
                r0 = move-exception
                goto L_0x01ba
            L_0x0104:
                java.lang.String r3 = "invalid_api_key"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r3 == 0) goto L_0x0115
                u3.n r0 = p253u3.C8149n.f17874c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r1 = "Invalid API key, make sure your API key is correct in initialize()"
                r0.mo20765a(r10, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                goto L_0x01c4
            L_0x0115:
                java.lang.String r3 = "bad_checksum"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r3 == 0) goto L_0x0126
                u3.n r0 = p253u3.C8149n.f17874c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r1 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
                r0.mo20767c(r10, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                goto L_0x01c4
            L_0x0126:
                java.lang.String r3 = "request_db_write_failed"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r3 == 0) goto L_0x0137
                u3.n r0 = p253u3.C8149n.f17874c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r1 = "Couldn't write to request database on server, will attempt to reupload later"
                r0.mo20767c(r10, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                goto L_0x01c4
            L_0x0137:
                int r0 = r0.f44365f     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r3 = 413(0x19d, float:5.79E-43)
                if (r0 != r3) goto L_0x018c
                boolean r0 = r8.f17844z     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r0 == 0) goto L_0x0159
                int r0 = r8.f17811A     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                if (r0 != r1) goto L_0x0159
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0150
                u3.o r0 = r8.f17821c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r0.mo20769G(r4)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
            L_0x0150:
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0159
                u3.o r0 = r8.f17821c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r0.mo20772R(r6)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
            L_0x0159:
                r8.f17844z = r1     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                u3.o r1 = r8.f17821c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                monitor-enter(r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r0 = "events"
                long r2 = r1.mo20776h(r0)     // Catch:{ all -> 0x0189 }
                monitor-exit(r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                int r0 = (int) r2     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                int r1 = r8.f17811A     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                int r0 = java.lang.Math.min(r0, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                double r0 = (double) r0     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 / r2
                double r0 = java.lang.Math.ceil(r0)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                int r0 = (int) r0     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r8.f17811A = r0     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                u3.n r0 = p253u3.C8149n.f17874c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r1 = "Request too large, will decrease size and attempt to reupload"
                r0.mo20767c(r10, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                com.amplitude.api.WorkerThread r0 = r8.f17817G     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                u3.h r1 = new u3.h     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r1.<init>(r8)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r0.post(r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                goto L_0x01c4
            L_0x0189:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                throw r0     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
            L_0x018c:
                u3.n r0 = p253u3.C8149n.f17874c     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r1.<init>()     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r3 = "Upload failed, "
                r1.append(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r1.append(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r2 = ", will attempt to reupload later"
                r1.append(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                java.lang.String r1 = r1.toString()     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                r0.mo20767c(r10, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01c4, IOException -> 0x01b8, AssertionError -> 0x01b0, Exception -> 0x01a8 }
                goto L_0x01c4
            L_0x01a8:
                r0 = move-exception
                r1 = 0
            L_0x01aa:
                u3.n r2 = p253u3.C8149n.f17874c
                r2.mo20766b(r10, r9, r0)
                goto L_0x01c5
            L_0x01b0:
                r0 = move-exception
                r1 = 0
            L_0x01b2:
                u3.n r2 = p253u3.C8149n.f17874c
                r2.mo20766b(r10, r9, r0)
                goto L_0x01c5
            L_0x01b8:
                r0 = move-exception
                r1 = 0
            L_0x01ba:
                u3.n r2 = p253u3.C8149n.f17874c
                java.lang.String r0 = r0.toString()
                r2.mo20765a(r10, r0)
                goto L_0x01c5
            L_0x01c4:
                r1 = 0
            L_0x01c5:
                if (r1 != 0) goto L_0x01de
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f17815E
                r1 = 0
                r0.set(r1)
                goto L_0x01de
            L_0x01ce:
                r0 = move-exception
                u3.n r1 = p253u3.C8149n.f17874c
                java.lang.String r0 = r0.toString()
                r1.mo20765a(r10, r0)
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f17815E
                r1 = 0
                r0.set(r1)
            L_0x01de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p253u3.C8139f.C8140a.run():void");
        }
    }

    public C8139f() {
        this((String) null);
    }

    /* renamed from: b */
    public static HashSet m16366b() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    /* renamed from: h */
    public static Pair m16367h(long j, LinkedList linkedList, LinkedList linkedList2) throws JSONException {
        long j2;
        long j3;
        JSONArray jSONArray = new JSONArray();
        long j4 = -1;
        long j5 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j) {
                break;
            }
            boolean isEmpty = linkedList.isEmpty();
            boolean isEmpty2 = linkedList2.isEmpty();
            if (isEmpty && isEmpty2) {
                C8149n.f17874c.mo20767c("u3.f", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j - ((long) jSONArray.length()))}));
                break;
            }
            if (isEmpty2) {
                JSONObject jSONObject = (JSONObject) linkedList.remove(0);
                j2 = jSONObject.getLong("event_id");
                jSONArray.put(jSONObject);
            } else {
                if (isEmpty) {
                    JSONObject jSONObject2 = (JSONObject) linkedList2.remove(0);
                    j3 = jSONObject2.getLong("event_id");
                    jSONArray.put(jSONObject2);
                } else if (!((JSONObject) linkedList.get(0)).has("sequence_number") || ((JSONObject) linkedList.get(0)).getLong("sequence_number") < ((JSONObject) linkedList2.get(0)).getLong("sequence_number")) {
                    JSONObject jSONObject3 = (JSONObject) linkedList.remove(0);
                    j2 = jSONObject3.getLong("event_id");
                    jSONArray.put(jSONObject3);
                } else {
                    JSONObject jSONObject4 = (JSONObject) linkedList2.remove(0);
                    j3 = jSONObject4.getLong("event_id");
                    jSONArray.put(jSONObject4);
                }
                j5 = j3;
            }
            j4 = j2;
        }
        return new Pair(new Pair(Long.valueOf(j4), Long.valueOf(j5)), jSONArray);
    }

    /* renamed from: l */
    public static JSONArray m16368l(JSONArray jSONArray) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                String str = (String) obj;
                if (str.length() > 1024) {
                    str = str.substring(0, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
                }
                jSONArray.put(i, str);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i, m16369m((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i, m16368l((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    /* renamed from: m */
    public static JSONObject m16369m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            C8149n.f17874c.mo20767c("u3.f", "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (!next.equals("$receipt")) {
                    if (!next.equals("$receiptSig")) {
                        if (obj.getClass().equals(String.class)) {
                            String str = (String) obj;
                            if (str.length() > 1024) {
                                str = str.substring(0, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
                            }
                            jSONObject.put(next, str);
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            jSONObject.put(next, m16369m((JSONObject) obj));
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            JSONArray jSONArray = (JSONArray) obj;
                            m16368l(jSONArray);
                            jSONObject.put(next, jSONArray);
                        }
                    }
                }
                jSONObject.put(next, obj);
            } catch (JSONException e) {
                C8149n.f17874c.mo20765a("u3.f", e.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final synchronized boolean mo20746a(String str) {
        if (this.f17819a == null) {
            C8149n nVar = C8149n.f17874c;
            nVar.mo20765a("u3.f", "context cannot be null, set context with initialize() before calling " + str);
            return false;
        } else if (!C8156t.m16412c(this.f17822d)) {
            return true;
        } else {
            C8149n nVar2 = C8149n.f17874c;
            nVar2.mo20765a("u3.f", "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
            return false;
        }
    }

    /* renamed from: c */
    public final long mo20747c(long j, String str) {
        Long l;
        C8150o oVar = this.f17821c;
        synchronized (oVar) {
            l = (Long) oVar.mo20779k("long_store", str);
        }
        return l == null ? j : l.longValue();
    }

    /* renamed from: d */
    public final String mo20748d() {
        String str;
        HashSet b = m16366b();
        C8150o oVar = this.f17821c;
        synchronized (oVar) {
            str = (String) oVar.mo20779k("store", EventsNameKt.DEVICE_ID);
        }
        if (!C8156t.m16412c(str) && !b.contains(str) && !str.endsWith("S")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = C8152q.f17883d;
        sb.append(UUID.randomUUID().toString());
        sb.append("R");
        String sb2 = sb.toString();
        this.f17821c.mo20785u(EventsNameKt.DEVICE_ID, sb2);
        return sb2;
    }

    /* renamed from: e */
    public final synchronized void mo20749e(Context context, String str) {
        if (context == null) {
            C8149n.f17874c.mo20765a("u3.f", "Argument context cannot be null in initialize()");
        } else if (C8156t.m16412c(str)) {
            C8149n.f17874c.mo20765a("u3.f", "Argument apiKey cannot be null or blank in initialize()");
        } else {
            Context applicationContext = context.getApplicationContext();
            this.f17819a = applicationContext;
            this.f17822d = str;
            this.f17821c = C8150o.m16385f(applicationContext, this.f17823e);
            String str2 = null;
            if (C8156t.m16412c((String) null)) {
                str2 = "Android";
            }
            this.f17831m = str2;
            mo20753j(new C8135b(this, this));
        }
    }

    /* renamed from: f */
    public final void mo20750f(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        Location c;
        String str6 = str;
        long j2 = j;
        String str7 = "platform";
        if (!this.f17827i) {
            String str8 = "language";
            String str9 = "country";
            if (!z) {
                if (this.f17832n >= 0) {
                    str5 = "carrier";
                    str4 = "device_model";
                    str3 = "device_manufacturer";
                    str2 = "device_brand";
                    if (j2 - this.f17836r < this.f17843y) {
                        mo20752i(j2);
                    } else {
                        this.f17832n = j2;
                        this.f17837s = j2;
                        this.f17821c.mo20784t("previous_session_id", Long.valueOf(j));
                        mo20752i(j2);
                    }
                } else {
                    str5 = "carrier";
                    str4 = "device_model";
                    str3 = "device_manufacturer";
                    str2 = "device_brand";
                    if (j2 - this.f17836r < this.f17843y) {
                        long j3 = this.f17837s;
                        if (j3 == -1) {
                            this.f17832n = j2;
                            this.f17837s = j2;
                            this.f17821c.mo20784t("previous_session_id", Long.valueOf(j));
                            mo20752i(j2);
                        } else {
                            this.f17832n = j3;
                            this.f17837s = j3;
                            this.f17821c.mo20784t("previous_session_id", Long.valueOf(j3));
                            mo20752i(j2);
                        }
                    } else {
                        this.f17832n = j2;
                        this.f17837s = j2;
                        this.f17821c.mo20784t("previous_session_id", Long.valueOf(j));
                        mo20752i(j2);
                    }
                }
            } else {
                str5 = "carrier";
                str4 = "device_model";
                str3 = "device_manufacturer";
                str2 = "device_brand";
            }
            JSONObject jSONObject6 = new JSONObject();
            if (str6 == null) {
                try {
                    obj = JSONObject.NULL;
                } catch (JSONException e) {
                    C8149n.f17874c.mo20765a("u3.f", String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str6, e.toString()}));
                    return;
                }
            } else {
                obj = str6;
            }
            jSONObject6.put("event_type", obj);
            jSONObject6.put(ResponseConstants.TIMESTAMP, j2);
            Object obj2 = this.f17824f;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject6.put("user_id", obj2);
            Object obj3 = this.f17825g;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject6.put(EventsNameKt.DEVICE_ID, obj3);
            jSONObject6.put("session_id", z ? -1 : this.f17832n);
            jSONObject6.put("uuid", UUID.randomUUID().toString());
            long j4 = this.f17833o + 1;
            this.f17833o = j4;
            this.f17821c.mo20784t("sequence_number", Long.valueOf(j4));
            jSONObject6.put("sequence_number", this.f17833o);
            if (this.f17828j.mo20792b("version_name")) {
                Object obj4 = this.f17838t.mo20787a().f17889c;
                if (obj4 == null) {
                    obj4 = JSONObject.NULL;
                }
                jSONObject6.put("version_name", obj4);
            }
            if (this.f17828j.mo20792b("os_name")) {
                Object obj5 = this.f17838t.mo20787a().f17890d;
                if (obj5 == null) {
                    obj5 = JSONObject.NULL;
                }
                jSONObject6.put("os_name", obj5);
            }
            if (this.f17828j.mo20792b("os_version")) {
                Object obj6 = this.f17838t.mo20787a().f17891e;
                if (obj6 == null) {
                    obj6 = JSONObject.NULL;
                }
                jSONObject6.put("os_version", obj6);
            }
            if (this.f17828j.mo20792b("api_level")) {
                Object valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                if (valueOf == null) {
                    valueOf = JSONObject.NULL;
                }
                jSONObject6.put("api_level", valueOf);
            }
            String str10 = str2;
            if (this.f17828j.mo20792b(str10)) {
                Object obj7 = this.f17838t.mo20787a().f17892f;
                if (obj7 == null) {
                    obj7 = JSONObject.NULL;
                }
                jSONObject6.put(str10, obj7);
            }
            String str11 = str3;
            if (this.f17828j.mo20792b(str11)) {
                Object obj8 = this.f17838t.mo20787a().f17893g;
                if (obj8 == null) {
                    obj8 = JSONObject.NULL;
                }
                jSONObject6.put(str11, obj8);
            }
            String str12 = str4;
            if (this.f17828j.mo20792b(str12)) {
                Object obj9 = this.f17838t.mo20787a().f17894h;
                if (obj9 == null) {
                    obj9 = JSONObject.NULL;
                }
                jSONObject6.put(str12, obj9);
            }
            if (this.f17828j.mo20792b(str5)) {
                Object obj10 = this.f17838t.mo20787a().f17895i;
                if (obj10 == null) {
                    obj10 = JSONObject.NULL;
                }
                jSONObject6.put(str5, obj10);
            }
            String str13 = str9;
            if (this.f17828j.mo20792b(str13)) {
                Object obj11 = this.f17838t.mo20787a().f17888b;
                if (obj11 == null) {
                    obj11 = JSONObject.NULL;
                }
                jSONObject6.put(str13, obj11);
            }
            if (this.f17828j.mo20792b(str8)) {
                Object obj12 = this.f17838t.mo20787a().f17896j;
                if (obj12 == null) {
                    obj12 = JSONObject.NULL;
                }
                jSONObject6.put(str8, obj12);
            }
            String str14 = str7;
            if (this.f17828j.mo20792b(str14)) {
                jSONObject6.put(str14, this.f17831m);
            }
            JSONObject jSONObject7 = new JSONObject();
            String str15 = this.f17812B;
            if (str15 == null) {
                str15 = "unknown-library";
            }
            jSONObject7.put("name", str15);
            String str16 = this.f17813C;
            if (str16 == null) {
                str16 = "unknown-version";
            }
            jSONObject7.put(ResponseConstants.VERSION, str16);
            jSONObject6.put("library", jSONObject7);
            JSONObject jSONObject8 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            JSONObject jSONObject9 = this.f17829k;
            if (jSONObject9 != null && jSONObject9.length() > 0) {
                jSONObject8.put("tracking_options", this.f17829k);
            }
            if (this.f17828j.mo20792b("lat_lng") && (c = this.f17838t.mo20789c()) != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(ResponseConstants.LAT, c.getLatitude());
                jSONObject10.put("lng", c.getLongitude());
                jSONObject8.put("location", jSONObject10);
            }
            if (this.f17828j.mo20792b("adid") && this.f17838t.mo20787a().f17887a != null) {
                jSONObject8.put("androidADID", this.f17838t.mo20787a().f17887a);
            }
            if (this.f17828j.mo20792b("app_set_id") && this.f17838t.mo20787a().f17899m != null) {
                jSONObject8.put("android_app_set_id", this.f17838t.mo20787a().f17899m);
            }
            jSONObject8.put("limit_ad_tracking", this.f17838t.mo20787a().f17897k);
            jSONObject8.put("gps_enabled", this.f17838t.mo20787a().f17898l);
            jSONObject6.put("api_properties", jSONObject8);
            jSONObject6.put("event_properties", jSONObject == null ? new JSONObject() : m16369m(jSONObject));
            jSONObject6.put("user_properties", jSONObject3 == null ? new JSONObject() : m16369m(jSONObject3));
            jSONObject6.put("groups", jSONObject4 == null ? new JSONObject() : m16369m(jSONObject4));
            jSONObject6.put("group_properties", jSONObject5 == null ? new JSONObject() : m16369m(jSONObject5));
            mo20754k(str6, jSONObject6);
        }
    }

    /* renamed from: g */
    public final void mo20751g(String str, JSONObject jSONObject, JSONObject jSONObject2, long j) {
        if (jSONObject != null) {
            jSONObject = C8156t.m16411b(jSONObject);
        }
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject2 != null) {
            jSONObject2 = C8156t.m16411b(jSONObject2);
        }
        mo20753j(new C8145j(this, str, jSONObject3, (JSONObject) null, jSONObject2, (JSONObject) null, (JSONObject) null, j));
    }

    /* renamed from: i */
    public final void mo20752i(long j) {
        if (this.f17832n >= 0) {
            this.f17836r = j;
            this.f17821c.mo20784t("last_event_time", Long.valueOf(j));
        }
    }

    /* renamed from: j */
    public final void mo20753j(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        WorkerThread workerThread = this.f17817G;
        if (currentThread != workerThread) {
            workerThread.post(runnable);
        } else {
            runnable.run();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: k */
    public final long mo20754k(java.lang.String r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r13 = r13.toString()
            boolean r0 = p253u3.C8156t.m16412c(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0020
            u3.n r13 = p253u3.C8149n.f17874c
            java.lang.String r0 = "u3.f"
            java.lang.String r3 = "Detected empty event string for event type %s, skipping"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r12
            java.lang.String r12 = java.lang.String.format(r3, r2)
            r13.mo20765a(r0, r12)
            r12 = -1
            return r12
        L_0x0020:
            java.lang.String r0 = "$identify"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "$groupidentify"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x004c
        L_0x0031:
            u3.o r0 = r11.f17821c
            monitor-enter(r0)
            java.lang.String r3 = "events"
            long r3 = r0.mo20773a(r3, r13)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)
            r11.f17834p = r3
            u3.o r13 = r11.f17821c
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "last_event_id"
            r13.mo20784t(r3, r0)
            goto L_0x0063
        L_0x0049:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x004c:
            u3.o r0 = r11.f17821c
            monitor-enter(r0)
            java.lang.String r3 = "identifys"
            long r3 = r0.mo20773a(r3, r13)     // Catch:{ all -> 0x0128 }
            monitor-exit(r0)
            r11.f17835q = r3
            u3.o r13 = r11.f17821c
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "last_identify_id"
            r13.mo20784t(r3, r0)
        L_0x0063:
            int r13 = r11.f17841w
            int r13 = r13 / 10
            int r13 = java.lang.Math.max(r2, r13)
            r0 = 20
            int r13 = java.lang.Math.min(r13, r0)
            u3.o r0 = r11.f17821c
            monitor-enter(r0)
            java.lang.String r3 = "events"
            long r3 = r0.mo20776h(r3)     // Catch:{ all -> 0x0125 }
            monitor-exit(r0)
            int r0 = r11.f17841w
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            u3.o r0 = r11.f17821c
            long r3 = (long) r13
            monitor-enter(r0)
            java.lang.String r5 = "events"
            long r3 = r0.mo20778j(r3, r5)     // Catch:{ all -> 0x0098 }
            monitor-exit(r0)
            monitor-enter(r0)
            java.lang.String r5 = "events"
            r0.mo20771Q(r3, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r0)
            goto L_0x009b
        L_0x0095:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x0098:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x009b:
            u3.o r0 = r11.f17821c
            monitor-enter(r0)
            java.lang.String r3 = "identifys"
            long r3 = r0.mo20776h(r3)     // Catch:{ all -> 0x0122 }
            monitor-exit(r0)
            int r0 = r11.f17841w
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c5
            u3.o r0 = r11.f17821c
            long r3 = (long) r13
            monitor-enter(r0)
            java.lang.String r13 = "identifys"
            long r3 = r0.mo20778j(r3, r13)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r0)
            monitor-enter(r0)
            java.lang.String r13 = "identifys"
            r0.mo20771Q(r3, r13)     // Catch:{ all -> 0x00bf }
            monitor-exit(r0)
            goto L_0x00c5
        L_0x00bf:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x00c2:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x00c5:
            u3.o r13 = r11.f17821c
            monitor-enter(r13)
            monitor-enter(r13)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "events"
            long r3 = r13.mo20776h(r0)     // Catch:{ all -> 0x011c }
            monitor-exit(r13)     // Catch:{ all -> 0x011f }
            monitor-enter(r13)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "identifys"
            long r5 = r13.mo20776h(r0)     // Catch:{ all -> 0x0119 }
            monitor-exit(r13)     // Catch:{ all -> 0x011f }
            long r3 = r3 + r5
            monitor-exit(r13)
            int r13 = r11.f17839u
            long r5 = (long) r13
            long r7 = r3 % r5
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x00ed
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x00ed
            r11.mo20755n(r1)
            goto L_0x0102
        L_0x00ed:
            long r0 = r11.f17842x
            java.util.concurrent.atomic.AtomicBoolean r13 = r11.f17814D
            boolean r13 = r13.getAndSet(r2)
            if (r13 == 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            com.amplitude.api.WorkerThread r13 = r11.f17817G
            u3.e r2 = new u3.e
            r2.<init>(r11)
            r13.postDelayed(r2, r0)
        L_0x0102:
            java.lang.String r13 = "$identify"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x0116
            java.lang.String r13 = "$groupidentify"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            long r12 = r11.f17834p
            goto L_0x0118
        L_0x0116:
            long r12 = r11.f17835q
        L_0x0118:
            return r12
        L_0x0119:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x011f }
            throw r12     // Catch:{ all -> 0x011f }
        L_0x011c:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x011f }
            throw r12     // Catch:{ all -> 0x011f }
        L_0x011f:
            r12 = move-exception
            monitor-exit(r13)
            throw r12
        L_0x0122:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x0125:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x0128:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8139f.mo20754k(java.lang.String, org.json.JSONObject):long");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: n */
    public final void mo20755n(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.f17827i
            if (r0 != 0) goto L_0x00d5
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f17815E
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x00d5
            u3.o r0 = r12.f17821c
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "events"
            long r2 = r0.mo20776h(r2)     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            monitor-enter(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r4 = "identifys"
            long r4 = r0.mo20776h(r4)     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            long r2 = r2 + r4
            monitor-exit(r0)
            if (r13 == 0) goto L_0x0027
            int r13 = r12.f17811A
            goto L_0x0029
        L_0x0027:
            int r13 = r12.f17840v
        L_0x0029:
            long r4 = (long) r13
            long r2 = java.lang.Math.min(r4, r2)
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r13 > 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f17815E
            r13.set(r0)
            return
        L_0x003b:
            u3.o r13 = r12.f17821c     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            long r7 = r12.f17834p     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.String r11 = "events"
            r6 = r13
            r9 = r2
            java.util.LinkedList r4 = r6.mo20777i(r7, r9, r11)     // Catch:{ all -> 0x009b }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            u3.o r13 = r12.f17821c     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            long r7 = r12.f17835q     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.String r11 = "identifys"
            r6 = r13
            r9 = r2
            java.util.LinkedList r5 = r6.mo20777i(r7, r9, r11)     // Catch:{ all -> 0x0098 }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            android.util.Pair r13 = m16367h(r2, r4, r5)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Object r2 = r13.second     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            if (r2 != 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.f17815E     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            r13.set(r0)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            return
        L_0x006b:
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Object r2 = r2.first     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            long r6 = r2.longValue()     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Object r2 = r2.second     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            long r8 = r2.longValue()     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.Object r13 = r13.second     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            java.lang.String r5 = r13.toString()     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            com.amplitude.api.WorkerThread r13 = r12.f17818H     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            u3.f$a r2 = new u3.f$a     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            r3 = r2
            r4 = r12
            r3.<init>(r5, r6, r8)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            r13.post(r2)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            goto L_0x00d5
        L_0x0098:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            throw r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
        L_0x009b:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
            throw r2     // Catch:{ JSONException -> 0x00ba, CursorWindowAllocationException -> 0x009e }
        L_0x009e:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.f17815E
            r2.set(r0)
            u3.n r2 = p253u3.C8149n.f17874c
            java.lang.String r3 = "u3.f"
            java.lang.String r4 = "Caught Cursor window exception during event upload, deferring upload: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r13 = r13.getMessage()
            r1[r0] = r13
            java.lang.String r13 = java.lang.String.format(r4, r1)
            r2.mo20765a(r3, r13)
            goto L_0x00d5
        L_0x00ba:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f17815E
            r1.set(r0)
            u3.n r0 = p253u3.C8149n.f17874c
            java.lang.String r1 = "u3.f"
            java.lang.String r13 = r13.toString()
            r0.mo20765a(r1, r13)
            goto L_0x00d5
        L_0x00cc:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r13     // Catch:{ all -> 0x00d2 }
        L_0x00cf:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r13     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8139f.mo20755n(boolean):void");
    }

    public C8139f(String str) {
        this.f17826h = false;
        this.f17827i = false;
        C8155s sVar = new C8155s();
        C8155s sVar2 = new C8155s();
        Iterator it = sVar.f17905a.iterator();
        while (it.hasNext()) {
            sVar2.f17905a.add((String) it.next());
        }
        this.f17828j = sVar2;
        this.f17829k = sVar2.mo20791a();
        this.f17830l = true;
        this.f17832n = -1;
        this.f17833o = 0;
        this.f17834p = -1;
        this.f17835q = -1;
        this.f17836r = -1;
        this.f17837s = -1;
        this.f17839u = 30;
        this.f17840v = 50;
        this.f17841w = 1000;
        this.f17842x = 30000;
        this.f17843y = 1800000;
        this.f17844z = false;
        this.f17811A = 50;
        this.f17812B = "amplitude-android";
        this.f17813C = "2.32.2";
        this.f17814D = new AtomicBoolean(false);
        this.f17815E = new AtomicBoolean(false);
        this.f17816F = "https://api2.amplitude.com/";
        this.f17817G = new WorkerThread("logThread");
        this.f17818H = new WorkerThread("httpThread");
        this.f17823e = C8156t.m16413d(str);
        this.f17817G.start();
        this.f17818H.start();
    }
}
