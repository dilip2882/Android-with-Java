package com.dilip.lockscreenappdemo;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyAdmin extends DeviceAdminReceiver {

    @Override
    public void onEnabled(@NonNull Context context, @NonNull Intent intent) {
        // Display a toast message when the device admin is enabled
        Toast.makeText(context, "Device Admin: enabled", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDisabled(@NonNull Context context, @NonNull Intent intent) {
        // Display a toast message when the device admin is disabled
        Toast.makeText(context, "Device Admin: disabled", Toast.LENGTH_SHORT).show();
    }
}
