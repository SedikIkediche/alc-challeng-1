package com.seddik.android.ikediche.alc4phase1

import android.annotation.SuppressLint
import android.net.http.SslError
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutAlcActivity : AppCompatActivity() {

    private val webViewClient = object : WebViewClient(){
        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler!!.proceed()
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)


        web_view.webViewClient = webViewClient
        web_view.settings.apply {
            javaScriptEnabled = true
            setSupportZoom(true)
        }

        web_view.loadUrl("https://andela.com/alc/")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        if(keyCode == KeyEvent.KEYCODE_BACK && web_view.canGoBack()){
            web_view.goBack()
        }
        return super.onKeyDown(keyCode, event)
    }


}
