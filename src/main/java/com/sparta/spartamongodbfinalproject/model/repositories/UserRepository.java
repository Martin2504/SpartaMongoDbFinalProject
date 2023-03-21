package com.sparta.spartamongodbfinalproject.model.repositories;
import com.sparta.spartamongodbfinalproject.model.entities.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Sort;
public interface UserRepository extends MongoRepository<User, ObjectId> {

    List<User> findUsersByName(String name);

    Optional<User> findById(ObjectId id);

    Optional<User> deleteUsersByName(String name);



}
