package com.kf.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.kf.mvvm.vm.TestViewModel

/**
 * TODO Description 文件描述信息
 * @package com.kf.mvvm
 * @author zhangqing
 * @date 2021/7/22-3:09 下午
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewModelProviders.of(this).get(TestViewModel::class.java)

        ViewModelProvider.AndroidViewModelFactory(application).create(TestViewModel::class.java)
    }
}