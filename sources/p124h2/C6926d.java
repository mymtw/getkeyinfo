package p124h2;

import android.database.sqlite.SQLiteProgram;
import p112g2.C6836c;

/* renamed from: h2.d */
public class C6926d implements C6836c {

    /* renamed from: b */
    public final SQLiteProgram f15347b;

    public C6926d(SQLiteProgram sQLiteProgram) {
        this.f15347b = sQLiteProgram;
    }

    /* renamed from: Y */
    public final void mo12011Y(int i, String str) {
        this.f15347b.bindString(i, str);
    }

    public final void close() {
        this.f15347b.close();
    }

    /* renamed from: h0 */
    public final void mo12013h0(int i, long j) {
        this.f15347b.bindLong(i, j);
    }

    /* renamed from: i0 */
    public final void mo12014i0(int i, byte[] bArr) {
        this.f15347b.bindBlob(i, bArr);
    }

    /* renamed from: p0 */
    public final void mo12015p0(int i) {
        this.f15347b.bindNull(i);
    }

    /* renamed from: v */
    public final void mo12017v(int i, double d) {
        this.f15347b.bindDouble(i, d);
    }
}
