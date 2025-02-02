package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.helper.ObjectIdMapper;
import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import com.facebook.stetho.json.annotation.JsonValue;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class Runtime implements ChromeDevtoolsDomain {
    /* access modifiers changed from: private */
    public static final Map<JsonRpcPeer, Session> sSessions = Collections.synchronizedMap(new HashMap());
    private final ObjectMapper mObjectMapper;
    private final RuntimeReplFactory mReplFactory;

    public static class CallArgument {
        @JsonProperty(required = false)
        public String objectId;
        @JsonProperty(required = false)
        public ObjectType type;
        @JsonProperty(required = false)
        public Object value;

        private CallArgument() {
        }
    }

    public static class CallFunctionOnRequest {
        @JsonProperty
        public List<CallArgument> arguments;
        @JsonProperty(required = false)
        public Boolean doNotPauseOnExceptionsAndMuteConsole;
        @JsonProperty
        public String functionDeclaration;
        @JsonProperty(required = false)
        public Boolean generatePreview;
        @JsonProperty
        public String objectId;
        @JsonProperty(required = false)
        public Boolean returnByValue;

        private CallFunctionOnRequest() {
        }
    }

    public static class CallFunctionOnResponse implements JsonRpcResult {
        @JsonProperty
        public RemoteObject result;
        @JsonProperty(required = false)
        public Boolean wasThrown;

        private CallFunctionOnResponse() {
        }
    }

    public static class EvaluateRequest implements JsonRpcResult {
        @JsonProperty(required = true)
        public String expression;
        @JsonProperty(required = true)
        public String objectGroup;

        private EvaluateRequest() {
        }
    }

    public static class EvaluateResponse implements JsonRpcResult {
        @JsonProperty
        public ExceptionDetails exceptionDetails;
        @JsonProperty(required = true)
        public RemoteObject result;
        @JsonProperty(required = true)
        public boolean wasThrown;

        private EvaluateResponse() {
        }
    }

    public static class ExceptionDetails {
        @JsonProperty(required = true)
        public String text;

        private ExceptionDetails() {
        }
    }

    public static class GetPropertiesRequest implements JsonRpcResult {
        @JsonProperty(required = true)
        public String objectId;
        @JsonProperty(required = true)
        public boolean ownProperties;

        private GetPropertiesRequest() {
        }
    }

    public static class GetPropertiesResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<PropertyDescriptor> result;

        private GetPropertiesResponse() {
        }
    }

    public static class ObjectProtoContainer {
        public final Object object;

        public ObjectProtoContainer(Object obj) {
            this.object = obj;
        }
    }

    public enum ObjectSubType {
        ARRAY("array"),
        NULL("null"),
        NODE("node"),
        REGEXP("regexp"),
        DATE("date"),
        MAP("map"),
        SET("set"),
        ITERATOR("iterator"),
        GENERATOR("generator"),
        ERROR("error");
        
        private final String mProtocolValue;

        private ObjectSubType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public enum ObjectType {
        OBJECT(ResponseConstants.OBJECT),
        FUNCTION("function"),
        UNDEFINED("undefined"),
        STRING("string"),
        NUMBER("number"),
        BOOLEAN("boolean"),
        SYMBOL("symbol");
        
        private final String mProtocolValue;

        private ObjectType(String str) {
            this.mProtocolValue = str;
        }

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public static class PropertyDescriptor {
        @JsonProperty(required = true)
        public final boolean configurable;
        @JsonProperty(required = true)
        public final boolean enumerable;
        @JsonProperty(required = true)
        public final boolean isOwn;
        @JsonProperty(required = true)
        public String name;
        @JsonProperty(required = true)
        public RemoteObject value;
        @JsonProperty(required = true)
        public final boolean writable;

        private PropertyDescriptor() {
            this.isOwn = true;
            this.configurable = false;
            this.enumerable = true;
            this.writable = false;
        }
    }

    public static class RemoteObject {
        @JsonProperty
        public String className;
        @JsonProperty
        public String description;
        @JsonProperty
        public String objectId;
        @JsonProperty
        public ObjectSubType subtype;
        @JsonProperty(required = true)
        public ObjectType type;
        @JsonProperty
        public Object value;
    }

    public static class Session {
        private final ObjectMapper mObjectMapper;
        private final ObjectIdMapper mObjects;
        private RuntimeRepl mRepl;

        private Session() {
            this.mObjects = new ObjectIdMapper();
            this.mObjectMapper = new ObjectMapper();
        }

        private List<?> arrayToList(Object obj) {
            Class<?> cls = obj.getClass();
            if (!cls.isArray()) {
                throw new IllegalArgumentException("Argument must be an array.  Was " + cls);
            } else if (!cls.getComponentType().isPrimitive()) {
                return Arrays.asList((Object[]) obj);
            } else {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(Array.get(obj, i));
                }
                return arrayList;
            }
        }

        private EvaluateResponse buildExceptionResponse(Object obj) {
            EvaluateResponse evaluateResponse = new EvaluateResponse();
            evaluateResponse.wasThrown = true;
            evaluateResponse.result = objectForRemote(obj);
            ExceptionDetails exceptionDetails = new ExceptionDetails();
            evaluateResponse.exceptionDetails = exceptionDetails;
            exceptionDetails.text = obj.toString();
            return evaluateResponse;
        }

        private EvaluateResponse buildNormalResponse(Object obj) {
            EvaluateResponse evaluateResponse = new EvaluateResponse();
            evaluateResponse.wasThrown = false;
            evaluateResponse.result = objectForRemote(obj);
            return evaluateResponse;
        }

        private GetPropertiesResponse getPropertiesForIterable(Iterable<?> iterable, boolean z) {
            int i;
            String str;
            GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : iterable) {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
                if (z) {
                    i = i2 + 1;
                    str = String.valueOf(i2);
                } else {
                    i = i2;
                    str = null;
                }
                propertyDescriptor.name = str;
                propertyDescriptor.value = objectForRemote(next);
                arrayList.add(propertyDescriptor);
                i2 = i;
            }
            getPropertiesResponse.result = arrayList;
            return getPropertiesResponse;
        }

        private GetPropertiesResponse getPropertiesForMap(Object obj) {
            GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
                propertyDescriptor.name = String.valueOf(entry.getKey());
                propertyDescriptor.value = objectForRemote(entry.getValue());
                arrayList.add(propertyDescriptor);
            }
            getPropertiesResponse.result = arrayList;
            return getPropertiesResponse;
        }

        private GetPropertiesResponse getPropertiesForObject(Object obj) {
            String str;
            GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(cls.getDeclaredFields()));
                Collections.reverse(arrayList2);
                if (cls == obj.getClass()) {
                    str = "";
                } else {
                    str = cls.getSimpleName() + ".";
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        try {
                            Object obj2 = field.get(obj);
                            PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
                            propertyDescriptor.name = str + field.getName();
                            propertyDescriptor.value = objectForRemote(obj2);
                            arrayList.add(propertyDescriptor);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            Collections.reverse(arrayList);
            getPropertiesResponse.result = arrayList;
            return getPropertiesResponse;
        }

        private GetPropertiesResponse getPropertiesForProtoContainer(ObjectProtoContainer objectProtoContainer) {
            Object obj = objectProtoContainer.object;
            RemoteObject remoteObject = new RemoteObject();
            remoteObject.type = ObjectType.OBJECT;
            remoteObject.subtype = ObjectSubType.NODE;
            remoteObject.className = obj.getClass().getName();
            remoteObject.description = Runtime.getPropertyClassName(obj);
            remoteObject.objectId = String.valueOf(this.mObjects.putObject(obj));
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor();
            propertyDescriptor.name = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            propertyDescriptor.value = remoteObject;
            GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
            ArrayList arrayList = new ArrayList(1);
            getPropertiesResponse.result = arrayList;
            arrayList.add(propertyDescriptor);
            return getPropertiesResponse;
        }

        private synchronized RuntimeRepl getRepl(RuntimeReplFactory runtimeReplFactory) {
            if (this.mRepl == null) {
                this.mRepl = runtimeReplFactory.newInstance();
            }
            return this.mRepl;
        }

        public EvaluateResponse evaluate(RuntimeReplFactory runtimeReplFactory, JSONObject jSONObject) {
            EvaluateRequest evaluateRequest = (EvaluateRequest) this.mObjectMapper.convertValue(jSONObject, EvaluateRequest.class);
            try {
                return !evaluateRequest.objectGroup.equals("console") ? buildExceptionResponse("Not supported by FAB") : buildNormalResponse(getRepl(runtimeReplFactory).evaluate(evaluateRequest.expression));
            } catch (Throwable th) {
                return buildExceptionResponse(th);
            }
        }

        public Object getObjectOrThrow(String str) throws JsonRpcException {
            Object objectForId = getObjects().getObjectForId(Integer.parseInt(str));
            if (objectForId != null) {
                return objectForId;
            }
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INVALID_REQUEST, C0326j.m864i("No object found for ", str), (JSONObject) null));
        }

        public ObjectIdMapper getObjects() {
            return this.mObjects;
        }

        public GetPropertiesResponse getProperties(JSONObject jSONObject) throws JsonRpcException {
            GetPropertiesRequest getPropertiesRequest = (GetPropertiesRequest) this.mObjectMapper.convertValue(jSONObject, GetPropertiesRequest.class);
            if (!getPropertiesRequest.ownProperties) {
                GetPropertiesResponse getPropertiesResponse = new GetPropertiesResponse();
                getPropertiesResponse.result = new ArrayList();
                return getPropertiesResponse;
            }
            Object objectOrThrow = getObjectOrThrow(getPropertiesRequest.objectId);
            if (objectOrThrow.getClass().isArray()) {
                objectOrThrow = arrayToList(objectOrThrow);
            }
            return objectOrThrow instanceof ObjectProtoContainer ? getPropertiesForProtoContainer((ObjectProtoContainer) objectOrThrow) : objectOrThrow instanceof List ? getPropertiesForIterable((List) objectOrThrow, true) : objectOrThrow instanceof Set ? getPropertiesForIterable((Set) objectOrThrow, false) : objectOrThrow instanceof Map ? getPropertiesForMap(objectOrThrow) : getPropertiesForObject(objectOrThrow);
        }

        public RemoteObject objectForRemote(Object obj) {
            RemoteObject remoteObject = new RemoteObject();
            if (obj == null) {
                remoteObject.type = ObjectType.OBJECT;
                remoteObject.subtype = ObjectSubType.NULL;
                remoteObject.value = JSONObject.NULL;
            } else if (obj instanceof Boolean) {
                remoteObject.type = ObjectType.BOOLEAN;
                remoteObject.value = obj;
            } else if (obj instanceof Number) {
                remoteObject.type = ObjectType.NUMBER;
                remoteObject.value = obj;
            } else if (obj instanceof Character) {
                remoteObject.type = ObjectType.NUMBER;
                remoteObject.value = Integer.valueOf(((Character) obj).charValue());
            } else if (obj instanceof String) {
                remoteObject.type = ObjectType.STRING;
                remoteObject.value = String.valueOf(obj);
            } else {
                remoteObject.type = ObjectType.OBJECT;
                remoteObject.className = "What??";
                remoteObject.objectId = String.valueOf(this.mObjects.putObject(obj));
                if (obj.getClass().isArray()) {
                    remoteObject.description = "array";
                } else if (obj instanceof List) {
                    remoteObject.description = "List";
                } else if (obj instanceof Set) {
                    remoteObject.description = "Set";
                } else if (obj instanceof Map) {
                    remoteObject.description = "Map";
                } else {
                    remoteObject.description = Runtime.getPropertyClassName(obj);
                }
            }
            return remoteObject;
        }
    }

    @Deprecated
    public Runtime() {
        this((RuntimeReplFactory) new RuntimeReplFactory() {
            public RuntimeRepl newInstance() {
                return new RuntimeRepl() {
                    public Object evaluate(String str) throws Throwable {
                        return "Not supported with legacy Runtime module";
                    }
                };
            }
        });
    }

    /* access modifiers changed from: private */
    public static String getPropertyClassName(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        return simpleName.length() == 0 ? obj.getClass().getName() : simpleName;
    }

    private static synchronized Session getSession(final JsonRpcPeer jsonRpcPeer) {
        Session session;
        synchronized (Runtime.class) {
            Map<JsonRpcPeer, Session> map = sSessions;
            session = map.get(jsonRpcPeer);
            if (session == null) {
                session = new Session();
                map.put(jsonRpcPeer, session);
                jsonRpcPeer.registerDisconnectReceiver(new DisconnectReceiver() {
                    public void onDisconnect() {
                        Runtime.sSessions.remove(jsonRpcPeer);
                    }
                });
            }
        }
        return session;
    }

    public static int mapObject(JsonRpcPeer jsonRpcPeer, Object obj) {
        return getSession(jsonRpcPeer).getObjects().putObject(obj);
    }

    public static void releaseObject(JsonRpcPeer jsonRpcPeer, Integer num) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById(num.intValue());
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult callFunctionOn(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
        CallFunctionOnRequest callFunctionOnRequest = (CallFunctionOnRequest) this.mObjectMapper.convertValue(jSONObject, CallFunctionOnRequest.class);
        Session session = getSession(jsonRpcPeer);
        Object objectOrThrow = session.getObjectOrThrow(callFunctionOnRequest.objectId);
        if (callFunctionOnRequest.functionDeclaration.startsWith("function protoList(")) {
            ObjectProtoContainer objectProtoContainer = new ObjectProtoContainer(objectOrThrow);
            RemoteObject remoteObject = new RemoteObject();
            remoteObject.type = ObjectType.OBJECT;
            remoteObject.subtype = ObjectSubType.NODE;
            remoteObject.className = objectOrThrow.getClass().getName();
            remoteObject.description = getPropertyClassName(objectOrThrow);
            remoteObject.objectId = String.valueOf(session.getObjects().putObject(objectProtoContainer));
            CallFunctionOnResponse callFunctionOnResponse = new CallFunctionOnResponse();
            callFunctionOnResponse.result = remoteObject;
            callFunctionOnResponse.wasThrown = Boolean.FALSE;
            return callFunctionOnResponse;
        }
        JsonRpcError.ErrorCode errorCode = JsonRpcError.ErrorCode.INTERNAL_ERROR;
        StringBuilder h = C0072d.m201h("Expected protoList, got: ");
        h.append(callFunctionOnRequest.functionDeclaration);
        throw new JsonRpcException(new JsonRpcError(errorCode, h.toString(), (JSONObject) null));
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult evaluate(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        return getSession(jsonRpcPeer).evaluate(this.mReplFactory, jSONObject);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getProperties(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
        return getSession(jsonRpcPeer).getProperties(jSONObject);
    }

    @ChromeDevtoolsMethod
    public void releaseObjectGroup(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        LogUtil.m20249w("Ignoring request to releaseObjectGroup: " + jSONObject);
    }

    public Runtime(Context context) {
        this((RuntimeReplFactory) new RhinoDetectingRuntimeReplFactory(context));
    }

    @ChromeDevtoolsMethod
    public void releaseObject(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JSONException {
        getSession(jsonRpcPeer).getObjects().removeObjectById(Integer.parseInt(jSONObject.getString("objectId")));
    }

    public Runtime(RuntimeReplFactory runtimeReplFactory) {
        this.mObjectMapper = new ObjectMapper();
        this.mReplFactory = runtimeReplFactory;
    }
}
