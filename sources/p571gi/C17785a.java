package p571gi;

import androidx.preference.C3039b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import p512bi.C14044c;
import p513bj.C14076q;
import p513bj.C14077r;
import p513bj.C14086y;

/* renamed from: gi.a */
public final class C17785a extends C3039b {

    /* renamed from: c */
    public final C14077r f38658c = new C14077r();

    /* renamed from: d */
    public final C14076q f38659d = new C14076q();

    /* renamed from: e */
    public C14086y f38660e;

    /* renamed from: n0 */
    public final Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer) {
        C14086y yVar = this.f38660e;
        if (yVar == null || cVar.f30906j != yVar.mo46959c()) {
            long j = cVar.f31495f;
            C14086y yVar2 = new C14086y(j);
            this.f38660e = yVar2;
            yVar2.mo46957a(j - cVar.f30906j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f38658c.mo46933x(limit, array);
        this.f38659d.mo46904k(limit, array);
        this.f38659d.mo46907n(39);
        long h = (((long) this.f38659d.mo46901h(1)) << 32) | ((long) this.f38659d.mo46901h(32));
        this.f38659d.mo46907n(20);
        int h2 = this.f38659d.mo46901h(12);
        int h3 = this.f38659d.mo46901h(8);
        Metadata.Entry entry = null;
        this.f38658c.mo46909A(14);
        if (h3 == 0) {
            entry = new SpliceNullCommand();
        } else if (h3 == 255) {
            entry = PrivateCommand.parseFromSection(this.f38658c, h2, h);
        } else if (h3 == 4) {
            entry = SpliceScheduleCommand.parseFromSection(this.f38658c);
        } else if (h3 == 5) {
            entry = SpliceInsertCommand.parseFromSection(this.f38658c, h, this.f38660e);
        } else if (h3 == 6) {
            entry = TimeSignalCommand.parseFromSection(this.f38658c, h, this.f38660e);
        }
        if (entry == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(entry);
    }
}
