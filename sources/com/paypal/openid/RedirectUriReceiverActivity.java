package com.paypal.openid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RedirectUriReceiverActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.createResponseHandlingIntent(this, getIntent().getData()));
        finish();
        Intent intent = getIntent();
        intent.getAction();
        intent.getData();
    }
}
