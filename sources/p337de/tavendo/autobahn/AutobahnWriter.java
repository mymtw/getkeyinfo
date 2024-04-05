package p337de.tavendo.autobahn;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.MappingJsonFactory;
import p003a2.C0023f;
import p652pp.C18422a;
import p652pp.C18424c;
import p652pp.C18425d;
import p652pp.C18426e;
import p652pp.C18427f;
import p652pp.C18429h;
import p652pp.C18446x;

/* renamed from: de.tavendo.autobahn.AutobahnWriter */
public class AutobahnWriter extends WebSocketWriter {
    private static final boolean DEBUG = true;
    private static final String TAG = AutobahnWriter.class.getName();
    private final JsonFactory mJsonFactory = new MappingJsonFactory();
    private final C18429h mPayload = new C18429h();

    public AutobahnWriter(Looper looper, Handler handler, SocketChannel socketChannel, C18446x xVar) {
        super(looper, handler, socketChannel, xVar);
        Log.d(TAG, "created");
    }

    public void processAppMessage(Object obj) throws WebSocketException, IOException {
        this.mPayload.reset();
        JsonGenerator createJsonGenerator = this.mJsonFactory.createJsonGenerator(this.mPayload);
        try {
            if (!(obj instanceof C18422a)) {
                if (obj instanceof C18424c) {
                    createJsonGenerator.writeStartArray();
                    createJsonGenerator.writeNumber(1);
                    ((C18424c) obj).getClass();
                    createJsonGenerator.writeString((String) null);
                    createJsonGenerator.writeString((String) null);
                    createJsonGenerator.writeEndArray();
                } else if (obj instanceof C18426e) {
                    createJsonGenerator.writeStartArray();
                    createJsonGenerator.writeNumber(5);
                    ((C18426e) obj).getClass();
                    createJsonGenerator.writeString((String) null);
                    createJsonGenerator.writeEndArray();
                } else if (obj instanceof C18427f) {
                    createJsonGenerator.writeStartArray();
                    createJsonGenerator.writeNumber(6);
                    ((C18427f) obj).getClass();
                    createJsonGenerator.writeString((String) null);
                    createJsonGenerator.writeEndArray();
                } else if (obj instanceof C18425d) {
                    createJsonGenerator.writeStartArray();
                    createJsonGenerator.writeNumber(7);
                    ((C18425d) obj).getClass();
                    createJsonGenerator.writeString((String) null);
                    createJsonGenerator.writeObject((Object) null);
                    createJsonGenerator.writeEndArray();
                } else {
                    throw new WebSocketException("invalid message received by AutobahnWriter");
                }
                createJsonGenerator.flush();
                sendFrame(1, true, this.mPayload.mo69961a(), 0, this.mPayload.size());
                createJsonGenerator.close();
                return;
            }
            createJsonGenerator.writeStartArray();
            createJsonGenerator.writeNumber(2);
            ((C18422a) obj).getClass();
            createJsonGenerator.writeString((String) null);
            createJsonGenerator.writeString((String) null);
            throw null;
        } catch (JsonGenerationException e) {
            throw new WebSocketException(C0023f.m110k(new StringBuilder("JSON serialization error ("), e.toString(), ")"));
        } catch (JsonMappingException e2) {
            throw new WebSocketException(C0023f.m110k(new StringBuilder("JSON serialization error ("), e2.toString(), ")"));
        }
    }
}
