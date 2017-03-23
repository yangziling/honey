package com.a520.stone.honey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * <b>Create Date:</b> 2017/3/23<br>
 * <b>Author:</b> Stone <br>
 * <b>Description:</b> <br>
 */
public class ForgetPwsActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    public static void start(Context context) {
        Intent starter = new Intent(context, ForgetPwsActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpsw);

        //toolbar 的显示
        mToolbar = (Toolbar) findViewById(R.id.forget_toolbar);
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);


    }
}
