package ua.hillel.rest.entities;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Post {
  private int id;
  private int userId;

  private String title;
  private String body;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Post{" + "id=" + id + ", userId=" + userId + ", title='" + title + '\'' + ", body='"
        + body + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Post post = (Post) o;
    return userId == post.userId && Objects.equals(title, post.title) && Objects.equals(body,
                                                                                        post.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, title, body);
  }
}
