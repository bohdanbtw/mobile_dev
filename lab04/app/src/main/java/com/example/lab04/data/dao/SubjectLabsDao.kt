package com.example.lab04.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.lab04.data.entity.SubjectLabEntity

@Dao
interface SubjectLabsDao{
    @Query("SELECT * FROM subjectsLabs")
    suspend fun getAllSubjectLabs(): List<SubjectLabEntity>

    @Query("SELECT * FROM subjectsLabs WHERE subject_id = :subjectId")
    suspend fun getSubjectLabsBySubjectId(subjectId: Int): List<SubjectLabEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addSubjectLab(subjectLabEntity: SubjectLabEntity)

    @Update
    suspend fun updateSubjectLab(subjectLabEntity: SubjectLabEntity)

    @Delete
    suspend fun deleteSubjectLab(subjectLabEntity: SubjectLabEntity)

    @Query("SELECT MAX(id) FROM subjectsLabs")
    suspend fun getMaxLabId(): Int?

}