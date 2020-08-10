package transactionInserterForAccountLedger.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import transactionInserterForAccountLedger.api.Api
import transactionInserterForAccountLedger.api.ApiConstants

object ProjectRetrofitClient {

    val retrofitClient: Api by lazy {

        Retrofit.Builder()
                .baseUrl(ApiConstants.serverApiAddress)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build().create(Api::class.java)
    }
}
