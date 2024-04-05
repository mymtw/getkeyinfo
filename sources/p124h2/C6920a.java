package p124h2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import androidx.compose.p015ui.input.pointer.C1634f;
import java.io.IOException;
import java.util.List;
import p112g2.C6831a;
import p112g2.C6837d;
import p112g2.C6838e;

/* renamed from: h2.a */
public final class C6920a implements C6831a {

    /* renamed from: c */
    public static final String[] f15332c = new String[0];

    /* renamed from: b */
    public final SQLiteDatabase f15333b;

    /* renamed from: h2.a$a */
    public class C6921a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ C6837d f15334a;

        public C6921a(C6837d dVar) {
            this.f15334a = dVar;
        }

        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f15334a.mo6593b(new C6926d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C6920a(SQLiteDatabase sQLiteDatabase) {
        this.f15333b = sQLiteDatabase;
    }

    /* renamed from: D */
    public final void mo18957D() {
        this.f15333b.setTransactionSuccessful();
    }

    /* renamed from: E */
    public final void mo18958E(String str, Object[] objArr) throws SQLException {
        this.f15333b.execSQL(str, objArr);
    }

    /* renamed from: F */
    public final void mo18959F() {
        this.f15333b.beginTransactionNonExclusive();
    }

    /* renamed from: K */
    public final void mo18960K() {
        this.f15333b.endTransaction();
    }

    /* renamed from: Z */
    public final C6838e mo18961Z(String str) {
        return new C6927e(this.f15333b.compileStatement(str));
    }

    /* renamed from: a */
    public final Cursor mo19063a(String str) {
        return mo18968t0(new C1634f(str));
    }

    public final void close() throws IOException {
        this.f15333b.close();
    }

    public final String getPath() {
        return this.f15333b.getPath();
    }

    public final boolean isOpen() {
        return this.f15333b.isOpen();
    }

    /* renamed from: o */
    public final void mo18964o() {
        this.f15333b.beginTransaction();
    }

    /* renamed from: p */
    public final List<Pair<String, String>> mo18965p() {
        return this.f15333b.getAttachedDbs();
    }

    /* renamed from: q */
    public final void mo18966q(String str) throws SQLException {
        this.f15333b.execSQL(str);
    }

    /* renamed from: q0 */
    public final boolean mo18967q0() {
        return this.f15333b.inTransaction();
    }

    /* renamed from: t0 */
    public final Cursor mo18968t0(C6837d dVar) {
        return this.f15333b.rawQueryWithFactory(new C6921a(dVar), dVar.mo6592a(), f15332c, (String) null);
    }

    /* renamed from: u0 */
    public final boolean mo18969u0() {
        return this.f15333b.isWriteAheadLoggingEnabled();
    }
}
