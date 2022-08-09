package com.technews.repository;

import com.technews.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllPostByUserId(Integer id) throws Exception;
}
