package p547di;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: di.b */
public final class C17559b {

    /* renamed from: a */
    public final ByteArrayOutputStream f38391a;

    /* renamed from: b */
    public final DataOutputStream f38392b;

    public C17559b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
        this.f38391a = byteArrayOutputStream;
        this.f38392b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public static void m29432a(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
