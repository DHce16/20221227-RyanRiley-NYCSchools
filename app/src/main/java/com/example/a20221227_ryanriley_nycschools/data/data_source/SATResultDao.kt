package com.example.a20221227_ryanriley_nycschools.data.data_source

import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import com.example.a20221227_ryanriley_nycschools.domain.model.SATResult

interface SatResultDao {
    @Query("SELECT * FROM sat_result")
    fun getSatResults(): Flow<List<SATResult>>

    @Query("SELECT * FROM sat_result WHERE dbn = :dbn")
    fun getSatResult(dbn: String): SATResult?
}