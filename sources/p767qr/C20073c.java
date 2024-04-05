package p767qr;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.C19928a0;
import retrofit2.C20099f;

/* renamed from: qr.c */
public final class C20073c<T> implements C20099f<C19928a0, T> {

    /* renamed from: a */
    public final C16708i f44456a;

    /* renamed from: b */
    public final C16807t<T> f44457b;

    public C20073c(C16708i iVar, C16807t<T> tVar) {
        this.f44456a = iVar;
        this.f44457b = tVar;
    }

    public final Object convert(Object obj) throws IOException {
        C19928a0 a0Var = (C19928a0) obj;
        C16708i iVar = this.f44456a;
        Reader b = a0Var.mo72842b();
        iVar.getClass();
        JsonReader jsonReader = new JsonReader(b);
        jsonReader.setLenient(iVar.f36935k);
        try {
            T a = this.f44457b.mo59449a(jsonReader);
            if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                return a;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            a0Var.close();
        }
    }
}
