package me.wonjun.springbootdeveloper.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.wonjun.springbootdeveloper.domain.Article;
import me.wonjun.springbootdeveloper.dto.AddArticleRequest;
import me.wonjun.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //final or @NonNull 대상 DI 지원
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
