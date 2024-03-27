package database

import androidx.room.Query
import com.example.criminalintent.Crime
import java.util.UUID

interface CrimeDao{

    @Query("SELECT * FROM crime")
    suspend fun getCrimes() : List<Crime>

    @Query("SELECT * FROM crime where id = (:id)")
    suspend fun getCrime(id : UUID) : Crime

}