package p337de.tavendo.autobahn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.Random;
import p652pp.C18428g;
import p652pp.C18434l;
import p652pp.C18435m;
import p652pp.C18436n;
import p652pp.C18438p;
import p652pp.C18439q;
import p652pp.C18440r;
import p652pp.C18442t;
import p652pp.C18443u;
import p652pp.C18445w;
import p652pp.C18446x;

/* renamed from: de.tavendo.autobahn.WebSocketWriter */
public class WebSocketWriter extends Handler {
    private static final boolean DEBUG = true;
    private static final String TAG = WebSocketWriter.class.getName();
    private final C18428g mBuffer;
    private final Looper mLooper;
    private final Handler mMaster;
    private final C18446x mOptions;
    private final Random mRng = new Random();
    private final SocketChannel mSocket;

    public WebSocketWriter(Looper looper, Handler handler, SocketChannel socketChannel, C18446x xVar) {
        super(looper);
        this.mLooper = looper;
        this.mMaster = handler;
        this.mSocket = socketChannel;
        this.mOptions = xVar;
        this.mBuffer = new C18428g(xVar.f40554a + 14);
        Log.d(TAG, "created");
    }

    private byte[] newFrameMask() {
        byte[] bArr = new byte[4];
        this.mRng.nextBytes(bArr);
        return bArr;
    }

    private String newHandshakeKey() {
        byte[] bArr = new byte[16];
        this.mRng.nextBytes(bArr);
        return Base64.encodeToString(bArr, 2);
    }

    private void notify(Object obj) {
        Message obtainMessage = this.mMaster.obtainMessage();
        obtainMessage.obj = obj;
        this.mMaster.sendMessage(obtainMessage);
    }

    private void sendBinaryMessage(C18434l lVar) throws IOException, WebSocketException {
        byte[] bArr = lVar.f40542m;
        if (bArr.length <= this.mOptions.f40555b) {
            sendFrame(2, true, bArr);
            return;
        }
        throw new WebSocketException("message payload exceeds payload limit");
    }

    private void sendClientHandshake(C18435m mVar) throws IOException {
        String str;
        if (mVar.f40545o != null) {
            str = String.valueOf(mVar.f40544n) + "?" + mVar.f40545o;
        } else {
            str = mVar.f40544n;
        }
        this.mBuffer.mo69957d("GET " + str + " HTTP/1.1");
        this.mBuffer.mo69955a();
        this.mBuffer.mo69957d("Host: " + mVar.f40543m);
        this.mBuffer.mo69955a();
        this.mBuffer.mo69957d("Upgrade: WebSocket");
        this.mBuffer.mo69955a();
        this.mBuffer.mo69957d("Connection: Upgrade");
        this.mBuffer.mo69955a();
        this.mBuffer.mo69957d("Sec-WebSocket-Key: " + newHandshakeKey());
        this.mBuffer.mo69955a();
        String[] strArr = mVar.f40546p;
        if (strArr != null && strArr.length > 0) {
            this.mBuffer.mo69957d("Sec-WebSocket-Protocol: ");
            int i = 0;
            while (true) {
                String[] strArr2 = mVar.f40546p;
                if (i >= strArr2.length) {
                    break;
                }
                this.mBuffer.mo69957d(strArr2[i]);
                this.mBuffer.mo69957d(", ");
                i++;
            }
            this.mBuffer.mo69955a();
        }
        this.mBuffer.mo69957d("Sec-WebSocket-Version: 13");
        this.mBuffer.mo69955a();
        this.mBuffer.mo69955a();
    }

    private void sendClose(C18436n nVar) throws IOException, WebSocketException {
        byte[] bArr;
        if (nVar.f40547m > 0) {
            String str = nVar.f40548n;
            if (str == null || str.equals("")) {
                bArr = new byte[2];
            } else {
                byte[] bytes = nVar.f40548n.getBytes("UTF-8");
                bArr = new byte[(bytes.length + 2)];
                for (int i = 0; i < bytes.length; i++) {
                    bArr[i + 2] = bytes[i];
                }
            }
            if (bArr.length <= 125) {
                int i2 = nVar.f40547m;
                bArr[0] = (byte) ((i2 >> 8) & 255);
                bArr[1] = (byte) (i2 & 255);
                sendFrame(8, true, bArr);
                return;
            }
            throw new WebSocketException("close payload exceeds 125 octets");
        }
        sendFrame(8, true, (byte[]) null);
    }

    private void sendPing(C18439q qVar) throws IOException, WebSocketException {
        byte[] bArr = qVar.f40550m;
        if (bArr == null || bArr.length <= 125) {
            sendFrame(9, true, bArr);
            return;
        }
        throw new WebSocketException("ping payload exceeds 125 octets");
    }

    private void sendPong(C18440r rVar) throws IOException, WebSocketException {
        byte[] bArr = rVar.f40551m;
        if (bArr == null || bArr.length <= 125) {
            sendFrame(10, true, bArr);
            return;
        }
        throw new WebSocketException("pong payload exceeds 125 octets");
    }

    private void sendRawTextMessage(C18443u uVar) throws IOException, WebSocketException {
        byte[] bArr = uVar.f40552m;
        if (bArr.length <= this.mOptions.f40555b) {
            sendFrame(1, true, bArr);
            return;
        }
        throw new WebSocketException("message payload exceeds payload limit");
    }

    private void sendTextMessage(C18445w wVar) throws IOException, WebSocketException {
        byte[] bytes = wVar.f40553m.getBytes("UTF-8");
        if (bytes.length <= this.mOptions.f40555b) {
            sendFrame(1, true, bytes);
            return;
        }
        throw new WebSocketException("message payload exceeds payload limit");
    }

    public void forward(Object obj) {
        Message obtainMessage = obtainMessage();
        obtainMessage.obj = obj;
        sendMessage(obtainMessage);
    }

    public void handleMessage(Message message) {
        try {
            this.mBuffer.f40522c.clear();
            processMessage(message.obj);
            this.mBuffer.f40522c.flip();
            while (this.mBuffer.f40522c.remaining() > 0) {
                this.mSocket.write(this.mBuffer.f40522c);
            }
        } catch (Exception e) {
            e.printStackTrace();
            notify(new C18438p(e));
        }
    }

    public void processAppMessage(Object obj) throws WebSocketException, IOException {
        throw new WebSocketException("unknown message received by WebSocketWriter");
    }

    public void processMessage(Object obj) throws IOException, WebSocketException {
        if (obj instanceof C18445w) {
            sendTextMessage((C18445w) obj);
        } else if (obj instanceof C18443u) {
            sendRawTextMessage((C18443u) obj);
        } else if (obj instanceof C18434l) {
            sendBinaryMessage((C18434l) obj);
        } else if (obj instanceof C18439q) {
            sendPing((C18439q) obj);
        } else if (obj instanceof C18440r) {
            sendPong((C18440r) obj);
        } else if (obj instanceof C18436n) {
            sendClose((C18436n) obj);
        } else if (obj instanceof C18435m) {
            sendClientHandshake((C18435m) obj);
        } else if (obj instanceof C18442t) {
            this.mLooper.quit();
            Log.d(TAG, "ended");
        } else {
            processAppMessage(obj);
        }
    }

    public void sendFrame(int i, boolean z, byte[] bArr) throws IOException {
        if (bArr != null) {
            sendFrame(i, z, bArr, 0, bArr.length);
            return;
        }
        sendFrame(i, z, (byte[]) null, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendFrame(int r20, boolean r21, byte[] r22, int r23, int r24) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = -128(0xffffffffffffff80, float:NaN)
            r5 = 0
            if (r21 == 0) goto L_0x0011
            byte r6 = (byte) r4
            r7 = r20
            goto L_0x0014
        L_0x0011:
            r7 = r20
            r6 = r5
        L_0x0014:
            byte r7 = (byte) r7
            r6 = r6 | r7
            byte r6 = (byte) r6
            pp.g r7 = r0.mBuffer
            r7.write((int) r6)
            pp.x r6 = r0.mOptions
            boolean r6 = r6.f40561h
            if (r6 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            long r6 = (long) r3
            r8 = 125(0x7d, double:6.2E-322)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r10 = 2
            r11 = 1
            if (r8 > 0) goto L_0x003a
            int r8 = (int) r6
            byte r8 = (byte) r8
            r4 = r4 | r8
            byte r4 = (byte) r4
            pp.g r8 = r0.mBuffer
            r8.write((int) r4)
        L_0x0036:
            r17 = r6
            goto L_0x00be
        L_0x003a:
            r12 = 65535(0xffff, double:3.23786E-319)
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r12 = 8
            r13 = 255(0xff, double:1.26E-321)
            if (r8 > 0) goto L_0x0063
            r4 = r4 | 126(0x7e, float:1.77E-43)
            byte r4 = (byte) r4
            pp.g r8 = r0.mBuffer
            r8.write((int) r4)
            pp.g r4 = r0.mBuffer
            byte[] r8 = new byte[r10]
            long r15 = r6 >> r12
            long r9 = r15 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r8[r5] = r9
            long r9 = r6 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r8[r11] = r9
            r4.write((byte[]) r8)
            goto L_0x0036
        L_0x0063:
            r4 = r4 | 127(0x7f, float:1.78E-43)
            byte r4 = (byte) r4
            pp.g r8 = r0.mBuffer
            r8.write((int) r4)
            pp.g r4 = r0.mBuffer
            byte[] r8 = new byte[r12]
            r9 = 56
            long r9 = r6 >> r9
            long r9 = r9 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r8[r5] = r9
            r9 = 48
            long r9 = r6 >> r9
            long r9 = r9 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r8[r11] = r9
            r9 = 40
            long r9 = r6 >> r9
            long r9 = r9 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 2
            r8[r10] = r9
            r9 = 32
            long r9 = r6 >> r9
            long r9 = r9 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 3
            r8[r10] = r9
            r9 = 24
            long r9 = r6 >> r9
            long r9 = r9 & r13
            int r9 = (int) r9
            byte r9 = (byte) r9
            r10 = 4
            r8[r10] = r9
            r9 = 5
            r10 = 16
            long r15 = r6 >> r10
            r17 = r6
            long r5 = r15 & r13
            int r5 = (int) r5
            byte r5 = (byte) r5
            r8[r9] = r5
            r5 = 6
            long r6 = r17 >> r12
            long r6 = r6 & r13
            int r6 = (int) r6
            byte r6 = (byte) r6
            r8[r5] = r6
            r5 = 7
            long r6 = r17 & r13
            int r6 = (int) r6
            byte r6 = (byte) r6
            r8[r5] = r6
            r4.write((byte[]) r8)
        L_0x00be:
            r4 = 0
            pp.x r5 = r0.mOptions
            boolean r5 = r5.f40561h
            if (r5 == 0) goto L_0x00e9
            byte[] r4 = r19.newFrameMask()
            pp.g r5 = r0.mBuffer
            r6 = 0
            byte r7 = r4[r6]
            r5.write((int) r7)
            pp.g r5 = r0.mBuffer
            byte r7 = r4[r11]
            r5.write((int) r7)
            pp.g r5 = r0.mBuffer
            r7 = 2
            byte r7 = r4[r7]
            r5.write((int) r7)
            pp.g r5 = r0.mBuffer
            r7 = 3
            byte r7 = r4[r7]
            r5.write((int) r7)
            goto L_0x00ea
        L_0x00e9:
            r6 = 0
        L_0x00ea:
            r7 = 0
            int r5 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0111
            pp.x r5 = r0.mOptions
            boolean r5 = r5.f40561h
            if (r5 == 0) goto L_0x010c
            r5 = r6
        L_0x00f7:
            long r6 = (long) r5
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 < 0) goto L_0x00fd
            goto L_0x010c
        L_0x00fd:
            int r6 = r5 + r2
            byte r7 = r1[r6]
            int r8 = r5 % 4
            byte r8 = r4[r8]
            r7 = r7 ^ r8
            byte r7 = (byte) r7
            r1[r6] = r7
            int r5 = r5 + 1
            goto L_0x00f7
        L_0x010c:
            pp.g r4 = r0.mBuffer
            r4.write(r1, r2, r3)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p337de.tavendo.autobahn.WebSocketWriter.sendFrame(int, boolean, byte[], int, int):void");
    }
}
