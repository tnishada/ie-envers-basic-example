package com.infoevening.enversexample;

import com.infoevening.enversexample.model.Post;
import com.infoevening.enversexample.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CmdLineRunner implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        Post post1 = new Post("title", "message");

        this.postRepository.save(post1);

        post1.setTitle("title v2");
        this.postRepository.save(post1);

        Post post2 = new Post("title", "message");
        this.postRepository.save(post2);
        Post post3 = new Post("title", "message");
        this.postRepository.save(post3);

        this.postRepository.deleteAll();
    }
}
