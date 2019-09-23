package co.uk.pickmefirst.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.uk.pickmefirst.domain.Comment;
import co.uk.pickmefirst.repositories.CommentRepository;

@Controller
@RequestMapping("/products/{productId}/features/{featureId}/comments")
public class CommentController {
  @Autowired
  public CommentRepository commentRepo;
  
  @GetMapping("")
  @ResponseBody
  public List<Comment> getComments (@PathVariable Long featureId) {
    
    List<Comment> findByFeatureId = commentRepo.findByFeatureId(featureId);
    System.out.println(findByFeatureId);
    return findByFeatureId;
  }
}