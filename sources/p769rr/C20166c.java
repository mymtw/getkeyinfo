package p769rr;

import com.squareup.moshi.C17405q;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import okhttp3.C19928a0;
import okio.ByteString;
import p756lr.C19897i;
import retrofit2.C20099f;

/* renamed from: rr.c */
public final class C20166c<T> implements C20099f<C19928a0, T> {

    /* renamed from: b */
    public static final ByteString f44661b = ByteString.decodeHex("EFBBBF");

    /* renamed from: a */
    public final JsonAdapter<T> f44662a;

    public C20166c(JsonAdapter<T> jsonAdapter) {
        this.f44662a = jsonAdapter;
    }

    public final Object convert(Object obj) throws IOException {
        C19928a0 a0Var = (C19928a0) obj;
        C19897i f = a0Var.mo70458f();
        try {
            ByteString byteString = f44661b;
            if (f.mo72718I(0, byteString)) {
                f.skip((long) byteString.size());
            }
            C17405q qVar = new C17405q(f);
            T fromJson = this.f44662a.fromJson((JsonReader) qVar);
            if (qVar.mo68426u() == JsonReader.Token.END_DOCUMENT) {
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            a0Var.close();
        }
    }
}
