package com.etsy.android.lib.models.apiv3.square;

import com.etsy.android.lib.models.BaseModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ConnectionState extends BaseModel {
    public static final int $stable = 8;
    private static final String CLIENT_ID = "client_id";
    private static final String CONNECTION = "connection";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public String clientId;
    /* access modifiers changed from: private */
    public Connection connection;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConnectionState create(String str, Connection connection) {
            ConnectionState connectionState = new ConnectionState();
            connectionState.clientId = str;
            connectionState.connection = connection;
            return connectionState;
        }
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Connection getConnection() {
        return this.connection;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        C19383o.m32797g(jsonParser, "jp");
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (C19383o.m32792b(currentName, CONNECTION)) {
                    this.connection = (Connection) BaseModel.Companion.parseObject(jsonParser, Connection.class);
                } else if (C19383o.m32792b(currentName, CLIENT_ID)) {
                    this.clientId = BaseModel.Companion.parseString(jsonParser);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }
}
