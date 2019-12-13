package com.usama.mychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.usama.mychat.Models.User;
import com.usama.mychat.Services.DataContext;
import com.usama.mychat.Services.LocalUserService;
import com.usama.mychat.Services.Tools;

public class ActivityProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        User user = LocalUserService.getLocalUserFromPreferences(this);
        TextView tv_UserFullName =  findViewById(R.id.tv_UserFullName);
        tv_UserFullName.setText(Tools.toProperName(user.FirstName) + " " + Tools.toProperName(user.LastName));
    }
}
