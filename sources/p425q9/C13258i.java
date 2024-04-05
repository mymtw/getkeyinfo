package p425q9;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.io.IOException;

/* renamed from: q9.i */
public final class C13258i {

    /* renamed from: d */
    public static final C13258i f29122d = new C13258i();

    /* renamed from: a */
    public final ObjectMapper f29123a;

    /* renamed from: b */
    public final JsonFactory f29124b;

    /* renamed from: c */
    public final ObjectMapper f29125c;

    public C13258i() {
        ObjectMapper objectMapper = new ObjectMapper(JsonFactory.builder().configure(JsonReadFeature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true).build());
        this.f29123a = objectMapper;
        this.f29124b = objectMapper.getFactory();
        ObjectMapper objectMapper2 = new ObjectMapper();
        this.f29125c = objectMapper2;
        objectMapper2.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE);
        objectMapper2.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    /* renamed from: a */
    public final JsonParser mo45955a(byte[] bArr) throws IOException {
        return this.f29124b.createParser(bArr);
    }
}
