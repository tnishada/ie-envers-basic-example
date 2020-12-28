package com.infoevening.enversexample.test;

import com.infoevening.enversexample.model.Post;
import com.infoevening.enversexample.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {

    @Autowired
    private PostRepository postRepository;

    @org.junit.jupiter.api.Test
    public void test(){
        Post post = new Post("title v2", "message");
//        post.setId(75L);
        postRepository.deleteAll();
        System.out.println("");

    }
}
