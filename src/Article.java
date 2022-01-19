import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@Builder
@Getter
@ToString
public class Article {
  private Long id;
  private String title;
  private List<String> tags;

  public static void main(String[] args) {
    Article a = Article.builder()
            .id(1L)
            .title("Test Article")
            .tags(Collections.singletonList("Demo"))
            .build();

    System.out.println(a);
  }
}
