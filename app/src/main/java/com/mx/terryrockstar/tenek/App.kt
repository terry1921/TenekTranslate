<<<<<<< HEAD:app/src/main/java/com/mx/terryrockstar/tenektranslate/App.kt
package com.mx.terryrockstar.tenektranslate
=======
package com.mx.terryrockstar.tenek
>>>>>>> development:app/src/main/java/com/mx/terryrockstar/tenek/App.kt

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.multidex.MultiDex

class App : Application() {

    @SuppressLint("StaticFieldLeak")
    var mContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        preferences = getSharedPreferences(CONFIG_FILE_NAME, MODE_PRIVATE)
        setContext(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    private fun setContext(context: Context) {
        mContext = context
    }

    companion object {
        var preferences: SharedPreferences? = null
        const val CONFIG_FILE_NAME: String = BuildConfig.CONF
    }

}
