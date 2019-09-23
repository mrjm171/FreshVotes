package co.uk.pickmefirst.repositories;



import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;



import co.uk.pickmefirst.domain.Comment;



public interface CommentRepository extends JpaRepository<Comment, Long> {



  List<Comment> findByFeatureId(Long featureId);



}