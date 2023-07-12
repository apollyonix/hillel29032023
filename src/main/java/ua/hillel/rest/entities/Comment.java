package ua.hillel.rest.entities;

import lombok.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */
@Data
public class Comment {
  private Integer id;
  private Integer postId;
  private String name;
  private String email;
  private String body;
}
