package com.paypal.pyplcheckout.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.NoWhenBranchMatchedException;

public final class ConnectivityUtils {
    public static final ConnectivityUtils INSTANCE = new ConnectivityUtils();

    public enum Connection {
        CELLULAR,
        ETHERNET,
        WIFI
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Connection.values().length];
            iArr[Connection.CELLULAR.ordinal()] = 1;
            iArr[Connection.ETHERNET.ordinal()] = 2;
            iArr[Connection.WIFI.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ConnectivityUtils() {
    }

    private final boolean isNetworkAvailable(Context context, Connection connection) {
        NetworkCapabilities networkCapabilities;
        Network network = null;
        Object systemService = context == null ? null : context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
            return false;
        }
        return connection != null ? networkCapabilities.hasTransport(toTransportId(connection)) : networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public static /* synthetic */ boolean isNetworkAvailable$default(ConnectivityUtils connectivityUtils, Context context, Connection connection, int i, Object obj) {
        if ((i & 2) != 0) {
            connection = null;
        }
        return connectivityUtils.isNetworkAvailable(context, connection);
    }

    private final Integer toConnectivityManager(Connection connection) {
        int i = connection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[connection.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? null : 1;
        }
        return 9;
    }

    private final int toTransportId(Connection connection) {
        int i = WhenMappings.$EnumSwitchMapping$0[connection.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getConnectionName(Context context) {
        Connection connection = Connection.CELLULAR;
        if (isNetworkAvailable(context, connection)) {
            return connection.name();
        }
        Connection connection2 = Connection.ETHERNET;
        if (isNetworkAvailable(context, connection2)) {
            return connection2.name();
        }
        Connection connection3 = Connection.WIFI;
        return isNetworkAvailable(context, connection3) ? connection3.name() : "No network";
    }
}
