package p112g2;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: g2.a */
public interface C6831a extends Closeable {
    /* renamed from: D */
    void mo18957D();

    /* renamed from: E */
    void mo18958E(String str, Object[] objArr) throws SQLException;

    /* renamed from: F */
    void mo18959F();

    /* renamed from: K */
    void mo18960K();

    /* renamed from: Z */
    C6838e mo18961Z(String str);

    String getPath();

    boolean isOpen();

    /* renamed from: o */
    void mo18964o();

    /* renamed from: p */
    List<Pair<String, String>> mo18965p();

    /* renamed from: q */
    void mo18966q(String str) throws SQLException;

    /* renamed from: q0 */
    boolean mo18967q0();

    /* renamed from: t0 */
    Cursor mo18968t0(C6837d dVar);

    /* renamed from: u0 */
    boolean mo18969u0();
}
