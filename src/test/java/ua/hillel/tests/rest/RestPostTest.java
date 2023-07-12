package ua.hillel.tests.rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.PostController;
import ua.hillel.rest.entities.Comment;
import ua.hillel.rest.entities.Post;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RestPostTest {
  @Test
  public void getAllPostsTest() throws IOException {
    PostController postController = new PostController();
//    postController.getAllPosts();

//    postController.getPostById(1);
//    postController.getPostById(10);

//    postController.createNewPostWithJson("Post title from test",
//                                         "Post body from test");


    Post post = new Post();
    post.setUserId(1);
    post.setTitle("GSON title");
    post.setBody("GSON body");

    Post newPost = postController.createNewPostWithGson(post);
    Assert.assertEquals(post, newPost, "Post is not created successfully");
    Assert.assertNotEquals(newPost.getId(), 0, "New ID is empty");

    Comment comment = new Comment();


















  }
}
