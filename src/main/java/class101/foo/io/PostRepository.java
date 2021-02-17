package class101.foo.io;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
=======
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByContentContains(String content);
>>>>>>> 31b92e0c34670ca33d212792ae5f4f1421d931e8
}
