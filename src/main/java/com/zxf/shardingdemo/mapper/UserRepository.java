package com.zxf.shardingdemo.mapper;

import com.zxf.shardingdemo.entities.Course;
import com.zxf.shardingdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
