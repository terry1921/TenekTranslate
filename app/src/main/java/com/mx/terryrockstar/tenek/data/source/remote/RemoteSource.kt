<<<<<<< HEAD:app/src/main/java/com/mx/terryrockstar/tenektranslate/data/source/remote/RemoteSource.kt
package com.mx.terryrockstar.tenektranslate.data.source.remote

import com.mx.terryrockstar.tenektranslate.data.Result
import com.mx.terryrockstar.tenektranslate.data.source.DataSource
=======
package com.mx.terryrockstar.tenek.data.source.remote

import com.mx.terryrockstar.tenek.data.Result
import com.mx.terryrockstar.tenek.data.source.DataSource
>>>>>>> development:app/src/main/java/com/mx/terryrockstar/tenek/data/source/remote/RemoteSource.kt

class RemoteSource : DataSource {

    /**
     * Used to force [getInstance] to create a new instance the next time it's called
     */
    override fun destroyInstance() {
        INSTANCE = null
    }

    override fun getResponse(): Result<String> {
        TODO("Not yet implemented")
    }

    companion object {

        private var INSTANCE: DataSource? = null

        /**
         * Return a single instance of this class, create if it necessary
         * @return instance of [RemoteSource]
         */
        @JvmStatic
        fun getInstance(): DataSource {
            if (INSTANCE == null) {
                INSTANCE = RemoteSource()
            }
            return INSTANCE as DataSource
        }
    }
}