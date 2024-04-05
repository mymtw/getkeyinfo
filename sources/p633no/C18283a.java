package p633no;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.C19383o;

/* renamed from: no.a */
public final class C18283a {

    /* renamed from: a */
    public final LinkedBlockingQueue<ByteBuffer> f40133a = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public final ByteBuffer mo69834a(int i) {
        ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
        C19383o.m32796f(order, "ByteBuffer.allocateDirec…(ByteOrder.LITTLE_ENDIAN)");
        return order;
    }
}
