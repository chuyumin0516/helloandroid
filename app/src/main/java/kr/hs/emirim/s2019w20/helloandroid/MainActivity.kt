package kr.hs.emirim.s2019w20.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//가장 처음 실행돔
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//R = resource activity_main의 경로명
    }//activity명은 숫자, 소문자, _로만 적어줄 것
}