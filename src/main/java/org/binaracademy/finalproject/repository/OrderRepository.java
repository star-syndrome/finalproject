package org.binaracademy.finalproject.repository;

import org.binaracademy.finalproject.model.Course;
import org.binaracademy.finalproject.model.Order;
import org.binaracademy.finalproject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Modifying
    void deleteByUsers(Users users);

    @Modifying
    void deleteByCourse(Course course);

    @Query(nativeQuery = true, value = "select count(*) > 0 from orders o where o.user_id = :userId and o.course_id = :courseId")
    Boolean orderValidation(@Param("userId") Long id, @Param("courseId") String courseId);
}