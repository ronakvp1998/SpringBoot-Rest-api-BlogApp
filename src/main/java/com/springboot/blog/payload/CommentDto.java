package com.springboot.blog.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedEntityGraph;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    private long id;
    //name shoudl not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    //Email should not br null or empty
    //email field validation
    @NotEmpty(message = "email should not be null or empty")
    @Email
    private String email;

    //Comment body should not be null or empty
    //comment body must be min 10 char
    @NotEmpty
    @Size(min = 10, message = "Comment body should be min 10 characters")
    private String body;
}
