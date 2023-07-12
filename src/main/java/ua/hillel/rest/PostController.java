package ua.hillel.rest;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.hillel.rest.entities.Post;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PostController {
  public void getAllPosts() throws IOException {
    Request request = new Request.Builder()
        .url("https://jsonplaceholder.typicode.com/posts/")
        .get()
        .build();

    OkHttpClient client = new OkHttpClient();

    Response response = client.newCall(request).execute();

    System.out.println(response.code());

    System.out.println(response.body().string());
  }

  public void getPostById(int id) throws IOException {
    Request request = new Request.Builder()
        .url("https://jsonplaceholder.typicode.com/posts/" + id)
        .get()
        .build();

    OkHttpClient client = new OkHttpClient();

    Response response = client.newCall(request).execute();

    System.out.println(response.code());

    System.out.println(response.body().string());
  }

  public void createNewPost() throws IOException {
    String bodyString = "{\n" + "  \"userId\": 1,\n" + "  \"id\": 1,\n"
        + "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n"
        + "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n"
        + "}";

    RequestBody body = RequestBody.create(bodyString.getBytes());

//    RequestBody.create(bodyString, MediaType.parse("application/json"));

    Request request = new Request.Builder()
        .url("https://jsonplaceholder.typicode.com/posts/")
        .post(body)
        .header("Content-Type", "application/json")
        .build();

    OkHttpClient client = new OkHttpClient();
    Response response = client.newCall(request).execute();

    //System.out.println(response.code());

    if (response.code() == 200) {
      throw new RuntimeException("Status code is : " + response.code());
    }

    //return response.body
    //System.out.println(response.body().string());
  }

  public void createNewPostWithJson(String title, Object body) throws IOException {
    JSONObject json = new JSONObject();
    json.put("userId", 1);
    json.put("title", title);
    json.put("body", body);

    RequestBody requestBody = RequestBody.create(json.toString().getBytes());

    Request request = new Request.Builder()
        .url("https://jsonplaceholder.typicode.com/posts/")
        .post(requestBody)
        .header("Content-Type", "application/json")
        .build();

    OkHttpClient client = new OkHttpClient();
    Response response = client.newCall(request).execute();

    System.out.println(response.code());

//    System.out.println(response.body().string());

    JSONObject responseJson = new JSONObject(response.body().string());
    System.out.printf("Response title: %s, response body %s%n",
                      responseJson.get("title"), responseJson.get("body"));

  }

  public Post createNewPostWithGson(Post post) throws IOException {
    Gson gson = new Gson();

    RequestBody requestBody = RequestBody.create(gson.toJson(post).getBytes());

    Request request = new Request.Builder()
        .url("https://jsonplaceholder.typicode.com/posts/")
        .post(requestBody)
        .header("Content-Type", "application/json")
        .build();

    OkHttpClient client = new OkHttpClient();
    Response response = client.newCall(request).execute();

    Post newPost = gson.fromJson(response.body().string(), Post.class);
    return newPost;
  }
















}
