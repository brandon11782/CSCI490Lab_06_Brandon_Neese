package asyncs;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import data.PersonDao;
import entities.Person;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();
}