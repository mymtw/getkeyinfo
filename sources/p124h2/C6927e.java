package p124h2;

import android.database.sqlite.SQLiteStatement;
import p112g2.C6838e;

/* renamed from: h2.e */
public final class C6927e extends C6926d implements C6838e {

    /* renamed from: c */
    public final SQLiteStatement f15348c;

    public C6927e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f15348c = sQLiteStatement;
    }

    /* renamed from: W */
    public final long mo18971W() {
        return this.f15348c.executeInsert();
    }

    /* renamed from: s */
    public final int mo18972s() {
        return this.f15348c.executeUpdateDelete();
    }
}
