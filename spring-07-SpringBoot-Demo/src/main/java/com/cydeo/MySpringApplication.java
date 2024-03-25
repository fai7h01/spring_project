package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {

		Comment comment = new Comment();
		comment.setAuthor("Luka");
		comment.setText("Spring Framework");

		ApplicationContext container = SpringApplication.run(MySpringApplication.class, args);

		CommentService commentService = container.getBean(CommentService.class);
		commentService.publishComment(comment);


	}


}
