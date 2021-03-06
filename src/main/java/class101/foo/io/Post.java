package class101.foo.io;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
//import javax.persistence.*;

@Data
//@Entity(name = "post")
@Document(indexName = "post_8_1")
public class Post {
/*    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_seq")
    @SequenceGenerator(name="post_id_seq", sequenceName = "post_id_seq", allocationSize = 1)
    private Long id;*/

    @Id
    private String id;

    private String content;
}
