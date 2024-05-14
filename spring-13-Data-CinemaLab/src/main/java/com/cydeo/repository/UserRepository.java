package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a user with an email?
    List<User> findByEmail(String email);

    //Write a derived query to read a user with a username?
    List<User> findByUsername(String username);

    //Write a derived query to list all users that contain a specific name?
    List<User> findByAccount_Name(String name);

    //Write a derived query to list all users that contain a specific name in the ignore case mode?
    List<User> findByUsernameContainsIgnoreCase(String pattern);

    //Write a derived query to list all users with an age greater than a specified age?

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns a user read by email?
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    List<User> retrieveUserByEmail(String email);

    //Write a JPQL query that returns a user read by username?
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    List<User> retrieveUserByUsername(String username);

    //Write a JPQL query that returns all users?
    @Query("SELECT u FROM User u")
    List<User> retrieveAll();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns all users that contain a specific name?
    @Query(value = "select * from user_account u " +
            "join public.account_details ad on u.account_details_id = ad.id " +
            "where name like concat('%',?1,'%')",nativeQuery = true)
    List<User> retrieveUserByNameContains(String pattern);


    //Write a native query that returns all users?
    @Query(value = "SELECT * FROM user_account",nativeQuery = true)
    List<User> retrieveAllUser();

    //Write a native query that returns all users in the range of ages?


    //Write a native query to read a user by email?


}
