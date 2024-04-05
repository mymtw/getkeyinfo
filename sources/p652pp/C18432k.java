package p652pp;

import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.nio.channels.SocketChannel;
import p337de.tavendo.autobahn.WebSocketWriter;

/* renamed from: pp.k */
public final class C18432k {

    /* renamed from: o */
    public static final /* synthetic */ int f40526o = 0;

    /* renamed from: a */
    public C18431j f40527a;

    /* renamed from: b */
    public C18447y f40528b;

    /* renamed from: c */
    public WebSocketWriter f40529c;

    /* renamed from: d */
    public HandlerThread f40530d;

    /* renamed from: e */
    public SocketChannel f40531e;

    /* renamed from: f */
    public URI f40532f;

    /* renamed from: g */
    public String f40533g;

    /* renamed from: h */
    public String f40534h;

    /* renamed from: i */
    public int f40535i;

    /* renamed from: j */
    public String f40536j;

    /* renamed from: k */
    public String f40537k;

    /* renamed from: l */
    public String[] f40538l;

    /* renamed from: m */
    public C15588c1 f40539m;

    /* renamed from: n */
    public C18446x f40540n;

    /* renamed from: pp.k$a */
    public class C18433a extends AsyncTask<Void, Void, String> {
        public C18433a() {
        }

        public final Object doInBackground(Object... objArr) {
            Void[] voidArr = (Void[]) objArr;
            Thread.currentThread().setName("WebSocketConnector");
            try {
                C18432k.this.f40531e = SocketChannel.open();
                Socket socket = C18432k.this.f40531e.socket();
                C18432k kVar = C18432k.this;
                socket.connect(new InetSocketAddress(kVar.f40534h, kVar.f40535i), C18432k.this.f40540n.f40559f);
                C18432k.this.f40531e.socket().setSoTimeout(C18432k.this.f40540n.f40558e);
                C18432k.this.f40531e.socket().setTcpNoDelay(C18432k.this.f40540n.f40557d);
                return null;
            } catch (IOException e) {
                return e.getMessage();
            }
        }

        public final void onPostExecute(Object obj) {
            if (((String) obj) != null) {
                C18432k.this.f40539m.getClass();
            } else if (C18432k.this.f40531e.isConnected()) {
                try {
                    C18432k kVar = C18432k.this;
                    kVar.getClass();
                    kVar.f40527a = new C18431j(kVar);
                    C18432k kVar2 = C18432k.this;
                    kVar2.getClass();
                    C18447y yVar = new C18447y(kVar2.f40527a, kVar2.f40531e, kVar2.f40540n);
                    kVar2.f40528b = yVar;
                    yVar.start();
                    Log.d("pp.k", "WS reader created and started");
                    C18432k.this.mo69965c();
                    C18435m mVar = new C18435m(String.valueOf(C18432k.this.f40534h) + MessageDraft.IMAGE_DELIMITER + C18432k.this.f40535i);
                    C18432k kVar3 = C18432k.this;
                    mVar.f40544n = kVar3.f40536j;
                    mVar.f40545o = kVar3.f40537k;
                    mVar.f40546p = kVar3.f40538l;
                    kVar3.f40529c.forward(mVar);
                } catch (Exception e) {
                    C15588c1 c1Var = C18432k.this.f40539m;
                    e.getMessage();
                    c1Var.getClass();
                }
            } else {
                C18432k.this.f40539m.getClass();
            }
        }
    }

    public C18432k() {
        Log.d("pp.k", "created");
    }

    /* renamed from: a */
    public static void m31130a(C18432k kVar, int i, String str) {
        kVar.getClass();
        Log.d("pp.k", "fail connection [code = " + i + ", reason = " + str);
        C18447y yVar = kVar.f40528b;
        if (yVar != null) {
            yVar.f40568g = true;
            Log.d(C18447y.f40562m, "quit");
            try {
                kVar.f40528b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            Log.d("pp.k", "mReader already NULL");
        }
        WebSocketWriter webSocketWriter = kVar.f40529c;
        if (webSocketWriter != null) {
            webSocketWriter.forward(new C18442t());
            try {
                kVar.f40530d.join();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        } else {
            Log.d("pp.k", "mWriter already NULL");
        }
        SocketChannel socketChannel = kVar.f40531e;
        if (socketChannel != null) {
            try {
                socketChannel.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } else {
            Log.d("pp.k", "mTransportChannel already NULL");
        }
        if (kVar.f40539m == null) {
            Log.d("pp.k", "mWsHandler already NULL");
        }
        Log.d("pp.k", "worker threads stopped");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6 A[Catch:{ URISyntaxException -> 0x00f5 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69964b(java.lang.String r4, com.etsy.android.lib.eventhorizon.EventHorizonService.C8661a r5) throws p337de.tavendo.autobahn.WebSocketException {
        /*
            r3 = this;
            pp.x r0 = new pp.x
            r0.<init>()
            java.lang.String r1 = "ws"
            java.nio.channels.SocketChannel r2 = r3.f40531e
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            de.tavendo.autobahn.WebSocketException r4 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r5 = "already connected"
            r4.<init>(r5)
            throw r4
        L_0x001a:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00f5 }
            r2.<init>(r4)     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40532f = r2     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r1)     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r2 = "wss"
            if (r4 != 0) goto L_0x0042
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r2)     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 == 0) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            de.tavendo.autobahn.WebSocketException r4 = new de.tavendo.autobahn.WebSocketException     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r5 = "unsupported scheme for WebSockets URI"
            r4.<init>(r5)     // Catch:{ URISyntaxException -> 0x00f5 }
            throw r4     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x0042:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r2)     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 != 0) goto L_0x00ed
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getScheme()     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40533g = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            int r4 = r4.getPort()     // Catch:{ URISyntaxException -> 0x00f5 }
            r2 = -1
            if (r4 != r2) goto L_0x0071
            java.lang.String r4 = r3.f40533g     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r1)     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            r4 = 80
            r3.f40535i = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            goto L_0x0079
        L_0x006c:
            r4 = 443(0x1bb, float:6.21E-43)
            r3.f40535i = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            goto L_0x0079
        L_0x0071:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            int r4 = r4.getPort()     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40535i = r4     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x0079:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getHost()     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 == 0) goto L_0x00e5
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getHost()     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40534h = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getPath()     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r1 = ""
            if (r4 == 0) goto L_0x00a9
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getPath()     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r1)     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 == 0) goto L_0x00a0
            goto L_0x00a9
        L_0x00a0:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getPath()     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40536j = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r4 = "/"
            r3.f40536j = r4     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x00ad:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getQuery()     // Catch:{ URISyntaxException -> 0x00f5 }
            r2 = 0
            if (r4 == 0) goto L_0x00cc
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getQuery()     // Catch:{ URISyntaxException -> 0x00f5 }
            boolean r4 = r4.equals(r1)     // Catch:{ URISyntaxException -> 0x00f5 }
            if (r4 == 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            java.net.URI r4 = r3.f40532f     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r4 = r4.getQuery()     // Catch:{ URISyntaxException -> 0x00f5 }
            r3.f40537k = r4     // Catch:{ URISyntaxException -> 0x00f5 }
            goto L_0x00ce
        L_0x00cc:
            r3.f40537k = r2     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x00ce:
            r3.f40538l = r2
            r3.f40539m = r5
            pp.x r4 = new pp.x
            r4.<init>(r0)
            r3.f40540n = r4
            pp.k$a r4 = new pp.k$a
            r4.<init>()
            r5 = 0
            java.lang.Void[] r5 = new java.lang.Void[r5]
            r4.execute(r5)
            return
        L_0x00e5:
            de.tavendo.autobahn.WebSocketException r4 = new de.tavendo.autobahn.WebSocketException     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r5 = "no host specified in WebSockets URI"
            r4.<init>(r5)     // Catch:{ URISyntaxException -> 0x00f5 }
            throw r4     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x00ed:
            de.tavendo.autobahn.WebSocketException r4 = new de.tavendo.autobahn.WebSocketException     // Catch:{ URISyntaxException -> 0x00f5 }
            java.lang.String r5 = "secure WebSockets not implemented"
            r4.<init>(r5)     // Catch:{ URISyntaxException -> 0x00f5 }
            throw r4     // Catch:{ URISyntaxException -> 0x00f5 }
        L_0x00f5:
            de.tavendo.autobahn.WebSocketException r4 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r5 = "invalid WebSockets URI"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p652pp.C18432k.mo69964b(java.lang.String, com.etsy.android.lib.eventhorizon.EventHorizonService$a):void");
    }

    /* renamed from: c */
    public final void mo69965c() {
        HandlerThread handlerThread = new HandlerThread("WebSocketWriter");
        this.f40530d = handlerThread;
        handlerThread.start();
        this.f40529c = new WebSocketWriter(this.f40530d.getLooper(), this.f40527a, this.f40531e, this.f40540n);
        Log.d("pp.k", "WS writer created and started");
    }
}
