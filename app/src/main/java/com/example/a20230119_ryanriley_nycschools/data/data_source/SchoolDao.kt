package com.example.a20230119_ryanriley_nycschools.data.data_source

import androidx.room.Dao
import androidx.room.Query
import com.example.a20230119_ryanriley_nycschools.domain.model.School
import kotlinx.coroutines.flow.Flow

@Dao
interface SchoolDao {

    @Query("SELECT * FROM school")
    fun getNotes(): Flow<List<School>>

    @Query("SELECT * FROM school WHERE dbn = :dbn")
    fun getSchool(dbn: String): School?
}