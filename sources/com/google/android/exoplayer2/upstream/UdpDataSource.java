package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import p505aj.C13996d;
import p505aj.C14002i;

public final class UdpDataSource extends C13996d {

    /* renamed from: e */
    public final int f32514e = 8000;

    /* renamed from: f */
    public final byte[] f32515f;

    /* renamed from: g */
    public final DatagramPacket f32516g;

    /* renamed from: h */
    public Uri f32517h;

    /* renamed from: i */
    public DatagramSocket f32518i;

    /* renamed from: j */
    public MulticastSocket f32519j;

    /* renamed from: k */
    public InetAddress f32520k;

    /* renamed from: l */
    public InetSocketAddress f32521l;

    /* renamed from: m */
    public boolean f32522m;

    /* renamed from: n */
    public int f32523n;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        super(true);
        byte[] bArr = new byte[RecyclerView.MAX_SCROLL_DURATION];
        this.f32515f = bArr;
        this.f32516g = new DatagramPacket(bArr, 0, RecyclerView.MAX_SCROLL_DURATION);
    }

    /* renamed from: b */
    public final long mo46812b(C14002i iVar) throws UdpDataSourceException {
        Uri uri = iVar.f30774a;
        this.f32517h = uri;
        String host = uri.getHost();
        int port = this.f32517h.getPort();
        mo46809m(iVar);
        try {
            this.f32520k = InetAddress.getByName(host);
            this.f32521l = new InetSocketAddress(this.f32520k, port);
            if (this.f32520k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f32521l);
                this.f32519j = multicastSocket;
                multicastSocket.joinGroup(this.f32520k);
                this.f32518i = this.f32519j;
            } else {
                this.f32518i = new DatagramSocket(this.f32521l);
            }
            try {
                this.f32518i.setSoTimeout(this.f32514e);
                this.f32522m = true;
                mo46810n(iVar);
                return -1;
            } catch (SocketException e) {
                throw new UdpDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2);
        }
    }

    public final void close() {
        this.f32517h = null;
        MulticastSocket multicastSocket = this.f32519j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f32520k);
            } catch (IOException unused) {
            }
            this.f32519j = null;
        }
        DatagramSocket datagramSocket = this.f32518i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f32518i = null;
        }
        this.f32520k = null;
        this.f32521l = null;
        this.f32523n = 0;
        if (this.f32522m) {
            this.f32522m = false;
            mo46808l();
        }
    }

    public final Uri getUri() {
        return this.f32517h;
    }

    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f32523n == 0) {
            try {
                this.f32518i.receive(this.f32516g);
                int length = this.f32516g.getLength();
                this.f32523n = length;
                mo46807k(length);
            } catch (IOException e) {
                throw new UdpDataSourceException(e);
            }
        }
        int length2 = this.f32516g.getLength();
        int i3 = this.f32523n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f32515f, length2 - i3, bArr, i, min);
        this.f32523n -= min;
        return min;
    }
}
