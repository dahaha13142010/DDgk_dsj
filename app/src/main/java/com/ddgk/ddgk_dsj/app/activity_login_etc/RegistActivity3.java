package com.ddgk.ddgk_dsj.app.activity_login_etc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.admin.mine.BaseActivity;
import com.ddgk.ddgk_dsj.R;
//import com.ddgk.ddgk_dsj.app.main.bank.BindBankActivity;

import butterknife.OnClick;

public class RegistActivity3 extends BaseActivity {

//    private String strPhone;
//    private AppUserEntity appUserEntity;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_register_3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        appUserEntity = MSPUtils.getInstance(RegistActivity3.this).getAppUserSp();
//        strPhone = getIntent().getStringExtra(H.TAG_INTENT_PHONE);
//        ABLogUtil.i("strPhone(Intent):" + strPhone);
//        strPhone = appUserEntity.getUserName();
//        ABLogUtil.i("strPhone(appUserEntity):" + strPhone);
    }

    @OnClick({R.id.btn_cancel, R.id.btn_continue})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_cancel:
                startActivity(new Intent(RegistActivity3.this, LoginActivity.class));
                break;
            case R.id.btn_continue:
//                startActivity(new Intent(RegistActivity3.this, BindBankActivity.class)/*.putExtra(H.TAG_INTENT_PHONE, strPhone)*/);
                break;
        }
    }
}
