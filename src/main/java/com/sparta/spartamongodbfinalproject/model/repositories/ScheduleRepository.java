package com.sparta.spartamongodbfinalproject.model.repositories;

import com.sparta.spartamongodbfinalproject.model.entities.Schedule;
import com.sparta.spartamongodbfinalproject.model.entities.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {


        @Query("{ '_id' : ?0 }")
        Schedule findScheduleById(String id);



}
